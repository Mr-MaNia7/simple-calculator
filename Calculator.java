import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame {
    double answer;
    
    private JLabel label;
    private JPanel panel;
    private JPanel pButtons;

    private JButton buttonZero;
    private JButton buttonOne;
    private JButton buttonTwo;
    private JButton buttonThree;
    private JButton buttonFour;
    private JButton buttonFive;
    private JButton buttonSix;
    private JButton buttonSeven;
    private JButton buttonEight;
    private JButton buttonNine;
    private JButton buttonDot;
    private JButton buttonEqual;
    private JButton buttonMul;
    private JButton buttonDiv;
    private JButton buttonPlus;
    private JButton buttonMinus;

    public Calculator() {
        prepareGUI();
        addComponents();
    }

    public void prepareGUI() {
        setTitle("Simple Calculator");
        setLocation(300, 300);
        setSize(300, 450);
        Container container = getContentPane();
        container.setLayout(new GridLayout(2, 0));
        container.setBackground(Color.BLACK);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void addComponents() {
        Container container = getContentPane();
        label = new JLabel("");
        label.setForeground(Color.WHITE);
        container.add(label);

        panel = new JPanel();
        panel.setLayout(new GridLayout(1, 0));
        container.add(panel);

        pButtons = new JPanel();
        pButtons.setLayout(new GridLayout(4, 4));
        
        buttonZero = new JButton("0");
        buttonOne = new JButton("1");
        buttonTwo = new JButton("2");
        buttonThree = new JButton("3");
        buttonFour = new JButton("4");
        buttonFive = new JButton("5");
        buttonSix = new JButton("6");
        buttonSeven = new JButton("7");
        buttonEight = new JButton("8");
        buttonNine = new JButton("9");
        buttonDot = new JButton(".");
        buttonEqual = new JButton("=");
        buttonMul = new JButton("x");
        buttonDiv = new JButton("/");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        
        pButtons.add(buttonNine);
        pButtons.add(buttonEight);
        pButtons.add(buttonSeven);
        pButtons.add(buttonPlus);
        pButtons.add(buttonSix);
        pButtons.add(buttonFive);
        pButtons.add(buttonFour);
        pButtons.add(buttonMinus);
        pButtons.add(buttonThree);
        pButtons.add(buttonTwo);
        pButtons.add(buttonOne);
        pButtons.add(buttonMul);
        pButtons.add(buttonDot);
        pButtons.add(buttonZero);
        pButtons.add(buttonEqual);
        pButtons.add(buttonDiv);
        
        panel.add(pButtons);
        setVisible(true);

        buttonZero.addActionListener(new IL());
        buttonOne.addActionListener(new IL());
        buttonTwo.addActionListener(new IL());
        buttonThree.addActionListener(new IL());
        buttonFour.addActionListener(new IL());
        buttonFive.addActionListener(new IL());
        buttonSix.addActionListener(new IL());
        buttonSeven.addActionListener(new IL());
        buttonEight.addActionListener(new IL());
        buttonNine.addActionListener(new IL());
        buttonDot.addActionListener(new IL());
        buttonEqual.addActionListener(new IL());
        buttonMul.addActionListener(new IL());
        buttonDiv.addActionListener(new IL());
        buttonPlus.addActionListener(new IL());
        buttonMinus.addActionListener(new IL());
    }
    private class IL implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == buttonZero) {
                String text = label.getText();
                text += "0";
                label.setText(text);
            }
            else if (event.getSource() == buttonOne) {
                String text = label.getText();
                text += "1";
                label.setText(text);
            }
            else if (event.getSource() == buttonTwo) {
                String text = label.getText();
                text += "2";
                label.setText(text);
            }
            else if (event.getSource() == buttonThree) {
                String text = label.getText();
                text += "3";
                label.setText(text);
            }
            else if (event.getSource() == buttonFour){
                String text = label.getText();
                text += "4";
                label.setText(text);
            }
            else if (event.getSource() == buttonFive) {
                String text = label.getText();
                text += "5";
                label.setText(text);
            }
            else if (event.getSource() == buttonSix) {
                String text = label.getText();
                text += "6";
                label.setText(text);
            }
            else if (event.getSource() == buttonSeven) {
                String text = label.getText();
                text += "7";
                label.setText(text);
            }
            else if (event.getSource() == buttonEight) {
                String text = label.getText();
                text += "8";
                label.setText(text);
            }
            else if (event.getSource() == buttonNine) {
                String text = label.getText();
                text += "9";
                label.setText(text);
            }


            else if (event.getSource() == buttonPlus) {
                String text = label.getText();
                text += " + ";
                label.setText(text);
           }
            else if (event.getSource() == buttonMinus) {
                String text = label.getText();
                text += " - ";
                label.setText(text);
            }
            else if (event.getSource() == buttonDiv) {
                String text = label.getText();
                text += " / ";
                label.setText(text);
            }
            else if (event.getSource() == buttonMul) {
                String text = label.getText();
                text += " x ";
                label.setText(text);
            }
            else if (event.getSource() == buttonDot) {
                String text = label.getText();
                text += ".";
                label.setText(text);
            }
            // Logic
            else if (event.getSource() == buttonEqual) {
                String[] array = label.getText().split(" ");
                int i = 0;
                answer = 0;
                while(i < array.length){
                    if (array[i].equals("+")) {
                        answer = Double.parseDouble(array[i-1]) + Double.parseDouble(array[i+1]);
                        i += 2;
                    }
                    else if (array[i].equals("-")) {
                        answer = Double.parseDouble(array[i-1]) - Double.parseDouble(array[i+1]);
                        i += 2;
                    }
                    else if (array[i].equals("x")) {
                        answer = Double.parseDouble(array[i-1]) * Double.parseDouble(array[i+1]);
                        i += 2;
                    }
                    else if (array[i].equals("/")) {
                        answer = Double.parseDouble(array[i-1]) / Double.parseDouble(array[i+1]);
                        i += 2;
                    }
                    else {
                        i ++;
                    }
                }
                System.out.println(answer);
                String result = String.valueOf(answer);
                label.setText(result);
            }
        }
    }
}
