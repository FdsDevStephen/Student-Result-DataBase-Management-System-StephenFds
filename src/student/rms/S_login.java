package student.rms;

import javax.swing.*;

public class S_login {
    JFrame f=new JFrame();
    S_login()
    {
        f.setLayout(null);
        f.setBounds(0,0,800,600);
        f.setTitle("STUDENT RESULT");

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);

    }
    public static void main(String[] args)
    {
        new S_login();
    }
}
