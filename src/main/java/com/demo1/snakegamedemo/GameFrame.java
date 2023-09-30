package com.demo1.snakegamedemo;

import javax.swing.*;

public class GameFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    GameFrame(){
        GamePanel gamePanel = new GamePanel();
        this.add(gamePanel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
