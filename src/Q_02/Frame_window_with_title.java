package Q_02;

import javax.swing.*;

public class Frame_window_with_title {
    public static void main(String[] args) {

        String Firstname=JOptionPane.showInputDialog("Enter your First Name");
        String Lastname=JOptionPane.showInputDialog("Enter your Last Name");
        String fullname=Firstname+" "+Lastname;
        JFrame frame=new JFrame();
        frame.setTitle(fullname);
        frame.setSize(400,300);
        frame.setVisible(true);
    }
}
