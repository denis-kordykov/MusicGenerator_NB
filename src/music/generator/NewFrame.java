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
 * @author �����
 */
 class NewFrame implements ActionListener {
     
    
    NewFrame(String text,int x,int y){
          String[] items = {
    "��(�)",
    "��#(�#)",
    "��(D)",
    "��#(D#)",
    "��(E)",
    "��(F)",
    "��#(F#)",
    "����(G)",
    "����#(G#)",
    "��(A)",
    "��#(A#)",
    "C�(H,B)",
    "�� �����(�m)",
    "�� �����#(�m#)",
    "�� �����(Dm)",
    "�� �����#(Dm#)",
    "�� �����(Em)",
    "�� �����(Fm)",
    "�� �����# (Fm#)",
    "���� �����(Gm)",
    "���� �����# (Gm#)",
    "�� �����(Am)",
    "�� �����# (Am#)",
    "C� �����(H,B)",
};
        JComboBox comboBox = new JComboBox(items);
        
        JFrame MyFrame = new JFrame("��������� ������ 2019, ������ 1.0 beta by Kordyukov Denis(Ukraine, Kherson)");
        MyFrame.setBounds(x, y, 500, 350);
        MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icn = new ImageIcon("C:/Git repos/Music-Generator/dist/note.jpg");
        JLabel lbl = new JLabel(text,icn,JLabel.CENTER);
        lbl.setBounds(10, 10, 225, 214);
        JButton btn = new JButton("�������");
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
  
    
