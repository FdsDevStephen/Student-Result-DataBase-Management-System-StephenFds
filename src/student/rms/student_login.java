package student.rms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class student_login implements ActionListener{
    JFrame f=new JFrame();
    JLabel j2,j1;
    JTextField t1,t2;
    JButton sub;
    student_login()
    {
        f.setLayout(null);
        f.setBounds(0,0,800,600);
        f.setTitle("STUDENT DASHBOARD");

        j1=new JLabel("Student I'D : ");
        j1.setBounds(250,150,100,25);

        j2=new JLabel(" Password   : ");
        j2.setBounds(250,200,100,25);

        f.add(j1);
        f.add(j2);

        t1=new JTextField();
        t1.setBounds(330,150,100,25);

        t2= new JTextField();
        t2.setBounds(330,200,100,25);

        f.add(t1);
        f.add(t2);

        sub=new JButton("Submit");
        sub.setBounds(300,300,100,25);
        sub.addActionListener(this);
        f.add(sub);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sub) {
            new S_login();
        }
    }
    public static void main(String[] args)
    {
        new student_login();
    }
}