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
 public class NewFrame implements ActionListener {
 
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
        MyFrame.setBounds(x, y, 500, 320);
        MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icn = new ImageIcon("note.jpg");
        JLabel lbl = new JLabel(text,icn,JLabel.CENTER);
        lbl.setBounds(10, 10, 225, 216);
        JButton btn = new JButton("�������");
        btn.setBounds(10, 240, 180, 30);
        comboBox.setBounds(300, 10, 150, 30);
        btn.addActionListener(this);
        MyFrame.setLayout(null);
        MyFrame.setVisible(true);
        MyFrame.add(lbl);
        MyFrame.add(btn);
        MyFrame.add(comboBox);
        
        comboBox.setVisible(true);
        MyFrame.setVisible(true);
        
        comboBox.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent event) { 
                     String msg = (String)comboBox.getSelectedItem();
                     switch(msg){
                     case "��#(�#)":
                         Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+1;
                        break;
                      case "��(�)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+0;                   
                        break;
                      case "��(D)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+2;                   
                        break;  
                      case "��#(D#)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+3;                   
                        break;
                       case "��(E)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+4;                   
                        break; 
                        case "��(F)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+5;                   
                        break; 
                        case "��#(F#)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+6;                   
                        break; 
                        case "����(G)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+7;                   
                        break;
                        case "����#(G#)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+8;                   
                        break;
                        case "��(A)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+9;                   
                        break;
                        case "��#(A#)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+10;                   
                        break;
                        case "C�(H,B)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+11;                   
                        break;
                        
                        
                        case "�� �����(�m)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+3;                   
                        break;
                        case "�� �����#(�m#)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+4;                   
                        break;
                        case "�� �����(Dm)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+5;                   
                        break;
                        case "�� �����#(Dm#)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+6;                   
                        break;
                        case "�� �����(Em)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+7;                   
                        break;
                        case "�� �����(Fm)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+8;                   
                        break;
                        case "�� �����# (Fm#)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+9;                   
                        break;
                        case "���� �����(Gm)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+10;                   
                        break;
                        case "���� �����# (Gm#)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+11;                   
                        break;
                        case "�� �����(Am)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+0;                   
                        break;
                        case "�� �����# (Am#)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+1;                   
                        break;
                        case "C� �����(H,B)":
                          Tonalnost.t = 0;
                        Tonalnost.t = Tonalnost.t+2;                   
                        break;
                        
                     }
    }    
        });
    }  
    
        public void actionPerformed(ActionEvent AEobj){
            
            System.exit(0);
           
        }
        

 
 }
 

