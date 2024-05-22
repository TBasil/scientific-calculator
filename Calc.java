
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Calc implements ActionListener {
    JFrame f;
    Container c;
    JTextField oper;
    JTextArea t;
    JLabel label;
    JButton b1, b2, b3, div, b5, b6, b7, multiply, b9, b10, b11, minus, b13, DOT, ANS, plus, left_bracket, right_bracket, clear, DEL, SIN, COS, TAN, SQUARE;

    public Calc() {
        f = new JFrame("SCIENTIFIC CALCULATOR");
        c = f.getContentPane();
        c.setBackground(Color.BLACK);
        Font font1 = new Font("SansSerif",Font.BOLD,25);
        Font font2 = new Font("SansSerif",Font.BOLD,18);
        oper = new JTextField();
        oper.setFont(font1);
        oper.setForeground(Color.WHITE);
        oper.setBackground(Color.BLACK);
        oper.setHorizontalAlignment(JTextField.CENTER);
        t = new JTextArea();
        label = new JLabel("Calculator");
        b1 = new JButton("7");
        b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.WHITE);
        b1.setFont(font2);
        b2 = new JButton("8");
        b2.setBackground(Color.DARK_GRAY);
        b2.setForeground(Color.WHITE);
        b2.setFont(font2);
        b3 = new JButton("9");
        b3.setBackground(Color.DARK_GRAY);
        b3.setForeground(Color.WHITE);
        b3.setFont(font2);
        div = new JButton("/");
        div.setBackground(Color.ORANGE);
        div.setForeground(Color.WHITE);
        div.setFont(font2);
        b5 = new JButton("4");
        b5.setBackground(Color.DARK_GRAY);
        b5.setForeground(Color.WHITE);
        b5.setFont(font2);
        b6 = new JButton("5");
        b6.setBackground(Color.DARK_GRAY);
        b6.setForeground(Color.WHITE);
        b6.setFont(font2);
        b7 = new JButton("6");
        b7.setBackground(Color.DARK_GRAY);
        b7.setForeground(Color.WHITE);
        b7.setFont(font2);
        multiply = new JButton("*");
        multiply.setBackground(Color.ORANGE);
        multiply.setForeground(Color.WHITE);
        multiply.setFont(font2);
        b9 = new JButton("1");
        b9.setBackground(Color.DARK_GRAY);
        b9.setForeground(Color.WHITE);
        b9.setFont(font2);
        b10 = new JButton("2");
        b10.setBackground(Color.DARK_GRAY);
        b10.setForeground(Color.WHITE);
        b10.setFont(font2);
        b11 = new JButton("3");
        b11.setBackground(Color.DARK_GRAY);
        b11.setForeground(Color.WHITE);
        b11.setFont(font2);
        minus = new JButton("-");
        minus.setBackground(Color.ORANGE);
        minus.setForeground(Color.WHITE);
        minus.setFont(font2);
        b13 = new JButton("0");
        b13.setBackground(Color.DARK_GRAY);
        b13.setForeground(Color.WHITE);
        b13.setFont(font2);
        DOT = new JButton(".");
        DOT.setBackground(Color.DARK_GRAY);
        DOT.setForeground(Color.WHITE);
        DOT.setFont(font2);
        ANS = new JButton("=");
        ANS.setBackground(Color.ORANGE);
        ANS.setForeground(Color.WHITE);
        ANS.setFont(font2);
        plus = new JButton("+");
        plus.setBackground(Color.ORANGE);
        plus.setForeground(Color.WHITE);
        plus.setFont(font2);
        left_bracket = new JButton("(");
        left_bracket.setBackground(Color.LIGHT_GRAY);
        left_bracket.setForeground(Color.BLACK);
        left_bracket.setFont(font2);
        right_bracket = new JButton(")");
        right_bracket.setBackground(Color.LIGHT_GRAY);
        right_bracket.setForeground(Color.BLACK);
        right_bracket.setFont(font2);
        clear = new JButton("C");
        clear.setBackground(Color.ORANGE);
        clear.setForeground(Color.WHITE);
        clear.setFont(font2);
        DEL = new JButton("DEL");
        DEL.setBackground(Color.ORANGE);
        DEL.setForeground(Color.WHITE);
        DEL.setFont(font2);
        SIN = new JButton("sin");
        SIN.setBackground(Color.DARK_GRAY);
        SIN.setForeground(Color.WHITE);
        SIN.setFont(font2);
        COS = new JButton("cos");
        COS.setBackground(Color.DARK_GRAY);
        COS.setForeground(Color.WHITE);
        COS.setFont(font2);
        TAN = new JButton("tan");
        TAN.setBackground(Color.DARK_GRAY);
        TAN.setForeground(Color.WHITE);
        TAN.setFont(font2);
        SQUARE = new JButton("sqrt");
        SQUARE.setBackground(Color.DARK_GRAY);
        SQUARE.setForeground(Color.WHITE);
        SQUARE.setFont(font2);
        c.setLayout(new BorderLayout());
        JPanel buttonPanel = new JPanel(new GridLayout(6, 4, 1, 1));
        c.add(t, BorderLayout.NORTH);
        c.add(oper, BorderLayout.NORTH);
        c.add(label, BorderLayout.SOUTH);
        c.add(buttonPanel, BorderLayout.CENTER);
        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(div);
        buttonPanel.add(b5);
        buttonPanel.add(b6);
        buttonPanel.add(b7);
        buttonPanel.add(multiply);
        buttonPanel.add(b9);
        buttonPanel.add(b10);
        buttonPanel.add(b11);
        buttonPanel.add(minus);
        buttonPanel.add(b13);
        buttonPanel.add(DOT);
        buttonPanel.add(ANS);
        buttonPanel.add(plus);
        buttonPanel.add(left_bracket);
        buttonPanel.add(right_bracket);
        buttonPanel.add(clear);
        buttonPanel.add(DEL);
        buttonPanel.add(SIN);
        buttonPanel.add(COS);
        buttonPanel.add(TAN);
        buttonPanel.add(SQUARE);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        div.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        multiply.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        minus.addActionListener(this);
        b13.addActionListener(this);
        DOT.addActionListener(this);
        ANS.addActionListener(this);
        plus.addActionListener(this);
        left_bracket.addActionListener(this);
        right_bracket.addActionListener(this);
        clear.addActionListener(this);
        DEL.addActionListener(this);
        SIN.addActionListener(this);
        COS.addActionListener(this);
        TAN.addActionListener(this);
        SQUARE.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        String expression = oper.getText();
        switch (command)
        {
            case "=":
                String result = calculateExpression(expression);
                oper.setText(result);
                break;
            case "C":
                oper.setText("");
                break;
            case "DEL":
                if (!expression.isEmpty())
                {
                    String newExpression = expression.substring(0, expression.length() - 1);
                    oper.setText(newExpression);
                }
                break;
            case "sin":
                double sinResult = Math.sin(Double.parseDouble(expression));
                oper.setText(String.valueOf(sinResult));
                break;
            case "cos":
                double cosResult = Math.cos(Double.parseDouble(expression));
                oper.setText(String.valueOf(cosResult));
                break;
            case "tan":
                double tanResult = Math.tan(Double.parseDouble(expression));
                oper.setText(String.valueOf(tanResult));
                break;
            case "sqrt":
                double sqrtResult = Math.sqrt(Double.parseDouble(expression));
                oper.setText(String.valueOf(sqrtResult));
                break;
            default:
                oper.setText(expression + command);
                break;
        }
    }
    private String calculateExpression(String expression)
    {

        if (expression.isEmpty())
        {
            return "Error: Empty expression";
        }

        while (expression.contains("("))
        {
            int openIndex = expression.lastIndexOf('(');
            int closeIndex = expression.indexOf(')', openIndex);
            if (closeIndex == -1)
            {
                return "Error: Missing closing parenthesis";
            }
            String innerExpression = expression.substring(openIndex + 1, closeIndex);
            String innerResult = calculateExpression(innerExpression);
            expression = expression.substring(0, openIndex) + innerResult + expression.substring(closeIndex + 1);
        }

        String[] tokens = expression.split("(?<=[-+*/])|(?=[-+*/])");

        double result = 0;
        double currentNumber = 0;
        char operator = '+';

        for (String token : tokens)
        {
            try {
                double number = Double.parseDouble(token);
                switch (operator)
                {
                    case '+':
                        result += currentNumber;
                        currentNumber = number;
                        break;
                    case '-':
                        result += currentNumber;
                        currentNumber = -number;
                        break;
                    case '*':
                        currentNumber *= number;
                        break;
                    case '/':
                        if (number == 0) {
                            return "Error: Division by zero";
                        }
                        currentNumber /= number;
                        break;
                }
            } catch (NumberFormatException e)
            {
                if (token.length() == 1 && "+-*/".indexOf(token.charAt(0)) != -1)
                {
                    operator = token.charAt(0);
                }
                else
                {
                    return "Error: Invalid expression";
                }
            }
        }

        result += currentNumber;

        return String.valueOf(result);
    }


    public static void main(String[] args)
    {
        new Calc();
    }

}