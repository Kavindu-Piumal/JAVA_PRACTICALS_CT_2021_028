package Q_12;

import javax.swing.*;

public class Window_position {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("My First Frame");
        frame.setSize(300, 200);
        frame.setLocation(100, 50);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

