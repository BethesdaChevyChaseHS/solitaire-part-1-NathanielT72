package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class App {
    public static void main(String[] args) { 
      JFrame mainFrame = new JFrame();
      mainFrame.setLayout(new BorderLayout());
      mainFrame.setSize(600,400);
      mainFrame.setVisible(true);

      JPanel northPanel = new JPanel();
      mainFrame.add(northPanel,BorderLayout.NORTH);
      JLabel nathanielSolitare = new JLabel("Nathaniel's Solitare");
      northPanel.add(nathanielSolitare);

      JPanel westPanel = new JPanel();
      mainFrame.add(westPanel,BorderLayout.WEST);
      JLabel Pile = new JLabel("Pile");
      westPanel.add(Pile);

      JPanel playArea = new JPanel();
      playArea.setLayout(new GridLayout(1,7));
      for(int i = 0; i < 8; i++) {
        JPanel Stack = new JPanel();
        Stack.add(new JLabel("Stack " + Integer.toString(i+1)));
        playArea.add(Stack);
        
      
      }
      mainFrame.add(playArea,BorderLayout.CENTER);

      JPanel southPanel = new JPanel();
      mainFrame.add(southPanel,BorderLayout.SOUTH);
      JLabel southLabel = new JLabel("Thanks For Playing!");
      southPanel.add(southLabel);




      

      
    }
}