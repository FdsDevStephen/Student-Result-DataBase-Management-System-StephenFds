package student.rms;

import javax.swing.*;

public class showResult {
    JFrame f = new JFrame("ALL STUDENT RESULT");
    showResult()
    {
        f.setLayout(null);
        f.setBounds(0,0,800,600);


        f.setVisible(true);
    }

    public static void main(String[] args) {
        new showResult();
    }
}
