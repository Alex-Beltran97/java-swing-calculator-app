import javax.swing.*;

public class Calculator extends JFrame {
    private JPanel panelApp;
    private JPanel AppContainer;
    private JTextField screen;
    private JButton btnPlus;
    private JButton btnSubs;
    private JButton btnMulti;
    private JButton btnDiv;
    private JButton a1Btn;
    private JButton a2Btn;
    private JButton a3Btn;
    private JButton a4Btn;
    private JButton a5Btn;
    private JButton a6Btn;
    private JButton a7Btn;
    private JButton a8Btn;
    private JButton a9Btn;
    private JButton btnEquals;
    private JButton CEBtn;
    private JButton a0Button;
    private JPanel controllers;

    public Calculator() {
        setContentPane(panelApp);
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(600, 400, 250,270);
        setLocationRelativeTo(null);
        setVisible(true);
         setResizable(false);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
