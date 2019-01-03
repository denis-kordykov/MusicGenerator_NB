/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music.generator;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Денис
 */
 class NewFrame implements ActionListener {
     
    
    NewFrame(String text,int x,int y){
          String[] items = {
    "До(С)",
    "До#(С#)",
    "Ре(D)",
    "Ре#(D#)",
    "Ми(E)",
    "Фа(F)",
    "Фа#(F#)",
    "Соль(G)",
    "Соль#(G#)",
    "Ля(A)",
    "Ля#(A#)",
    "Cи(H,B)",
    "До минор(Сm)",
    "До минор#(Сm#)",
    "Ре минор(Dm)",
    "Ре минор#(Dm#)",
    "Ми минор(Em)",
    "Фа минор(Fm)",
    "Фа минор# (Fm#)",
    "Соль минор(Gm)",
    "Соль минор# (Gm#)",
    "Ля минор(Am)",
    "Ля минор# (Am#)",
    "Cи минор(H,B)",
};
        JComboBox comboBox = new JComboBox(items);
        
        JFrame MyFrame = new JFrame("Генератор музыки 2019, версия 1.0 beta by Kordyukov Denis(Ukraine, Kherson)");
        MyFrame.setBounds(x, y, 500, 350);
        MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icn = new ImageIcon("C:/Git repos/Music-Generator/dist/note.jpg");
        JLabel lbl = new JLabel(text,icn,JLabel.CENTER);
        lbl.setBounds(10, 10, 225, 214);
        JButton btn = new JButton("Закрыть");
        btn.setBounds(10, 240, 180, 30);
        btn.addActionListener(this);
        MyFrame.setLayout(null);
        MyFrame.setVisible(true);
        MyFrame.add(lbl);
        MyFrame.add(btn);
        MyFrame.add(comboBox);
        //comboBox.addActionListener(this);
        comboBox.setBounds(300, 10, 150, 30);
        comboBox.setVisible(true);
        MyFrame.setVisible(true);
        
    }
         
    
        public void actionPerformed(ActionEvent AEobj){
  
            System.exit(0);
           
        }}
  
    
