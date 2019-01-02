/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music.generator;
import javax.swing.*;

/**
 *
 * @author Денис
 */
public class NewFrame {
    NewFrame(){
        JFrame MyFrame = new JFrame("Генератор музыки 2019, версия 1.0 beta by Kordyukov Denis(Ukraine, Kherson)");
        MyFrame.setSize(640, 480);
        MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyFrame.setVisible(true);
    }
}
