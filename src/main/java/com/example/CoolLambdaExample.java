package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoolLambdaExample extends JFrame {
    private final JButton button = new JButton("Start");

    public CoolLambdaExample() {

        super("Java 8 Lambda Example");
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(button);

        button.addActionListener(new ActionListener() {

            @Override public void actionPerformed(ActionEvent evt) {
                System.out.println("Classic way of handling event using Anonymous class");
            }

        });

        button.addActionListener(e -> System.out.println("Java 8 way" + " to handle event using Lambda expression"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new CoolLambdaExample().setVisible(true);
        });

    }
}

