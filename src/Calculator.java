import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JButton a0Btn;
    private JPanel controllers;
    private JButton aCommaBtn;
    private JButton CBtn;
    private String text;

    public Calculator() {
        setContentPane(panelApp);
        setTitle("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(600, 400, 250,270);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

        // Button Events
        handleBtnEvents();

        // Cleaner button
        CEBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text = "0";
                screen.setText(text);
            }
        });
    }

    public static void main(String[] args) {
        new Calculator();
    }

    public void handleBtnEvents() {
        // Number buttons
        a1Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleScreenText(a1Btn.getText());
            }
        });
        a2Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleScreenText(a2Btn.getText());
            }
        });
        a3Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleScreenText(a3Btn.getText());
            }
        });
        a4Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleScreenText(a4Btn.getText());
            }
        });
        a5Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleScreenText(a5Btn.getText());
            }
        });
        a6Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleScreenText(a6Btn.getText());
            }
        });
        a7Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleScreenText(a7Btn.getText());
            }
        });
        a8Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleScreenText(a8Btn.getText());
            }
        });
        a9Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleScreenText(a9Btn.getText());
            }
        });
        a0Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleScreenText(a0Btn.getText());
            }
        });

        // Symbol buttons

        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleScreenText(btnPlus.getText());
            }
        });
        btnSubs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleScreenText(btnSubs.getText());
            }
        });
        btnMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleScreenText(btnMulti.getText());
            }
        });
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleScreenText(btnDiv.getText());
            }
        });
    }

    public void handleScreenText(String txt) {
        if (screen.getText().equals("0")) {
            text = txt;
        } else {
            text += txt;
        }

        screen.setText(text);
    }
}
