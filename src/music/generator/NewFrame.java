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
        MyFrame.setBounds(x, y, 700, 320);
        MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyFrame.setResizable(false);
        ImageIcon icn = new ImageIcon("note.jpg");
        JLabel lbl = new JLabel(text,icn,JLabel.CENTER);
        lbl.setBounds(10, 10, 225, 216);
        JButton btn = new JButton("�������");
        
        JSlider  scrb1 = new JSlider(JSlider.VERTICAL,0,100,70);
        scrb1.setMajorTickSpacing(20);
        scrb1.setMinorTickSpacing(5);
        scrb1.setPaintTicks(true);
        scrb1.setSnapToTicks(true);
        scrb1.setPaintLabels(true);
        
        JSlider  scrb2 = new JSlider(JSlider.VERTICAL,0,100,70);
        scrb2.setMajorTickSpacing(20);
        scrb2.setMinorTickSpacing(5);
        scrb2.setPaintTicks(true);
        scrb2.setSnapToTicks(true);
        scrb2.setPaintLabels(true);
        
        JSlider  scrb3 = new JSlider(JSlider.VERTICAL,0,100,70);
        scrb3.setMajorTickSpacing(20);
        scrb3.setMinorTickSpacing(5);
        scrb3.setPaintTicks(true);
        scrb3.setSnapToTicks(true);
        scrb3.setPaintLabels(true);
        
          JSlider  scrb4 = new JSlider(JSlider.VERTICAL,0,100,70);
        scrb4.setMajorTickSpacing(20);
        scrb4.setMinorTickSpacing(5);
        scrb4.setPaintTicks(true);
        scrb4.setSnapToTicks(true);
        scrb4.setPaintLabels(true);
                      
        btn.setBounds(10, 240, 180, 30);
        comboBox.setBounds(370, 10, 170, 30);
        scrb1.setBounds(200, 50, 170, 150);
        scrb2.setBounds(300, 50, 170, 150);
        scrb3.setBounds(400, 50, 170, 150);
        scrb4.setBounds(500, 50, 170, 150);
     
        btn.addActionListener(this);
        
        MyFrame.setLayout(null);
        MyFrame.setVisible(true);
        MyFrame.add(lbl);
        MyFrame.add(btn);
        MyFrame.add(comboBox);
        MyFrame.add(scrb1);
        MyFrame.add(scrb2);
        MyFrame.add(scrb3);
        MyFrame.add(scrb4);
              
        MyFrame.setVisible(true);
        
        //scrb1.addAdjustmentListener(new AdjustmentListener(){ 
          // public void adjustmentValueChanged(AdjustmentEvent e) {
            // here the control if vertical scroll bar has reached the maximum value
           // if(!e.getValueIsAdjusting()){
             //   JScrollBar source = (JScrollBar) e.getAdjustable();
              //  Piano.volume += source.getModel().getExtent();
                
               //  System.out.println(Piano.volume);
              //   }}
       // });
        
        
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
 

