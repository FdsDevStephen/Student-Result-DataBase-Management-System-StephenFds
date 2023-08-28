package student.rms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

public class add_result {
    JFrame f;
    JLabel j1,j2,j3,j4,j5,j6,j7;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b;
    add_result()
    {
        f=new JFrame("ADD STUDENT DETAILS");
        f.setLayout(null);
        f.setBounds(0,0,800,600);

        j1=new JLabel("USN                   :");
        j1.setBounds(200,100,100,25);

        j2=new JLabel("Maths  :");
        j2.setBounds(200,150,100,25);

        j3=new JLabel("DAA              :");
        j3.setBounds(200,200,100,25);



        j4=new JLabel("DBMS          :");
        j4.setBounds(200,250,100,25);



        j5=new JLabel("OS             :");
        j5.setBounds(200,300,100,25);
        j6=new JLabel("UHV  :");
        j6.setBounds(200,350,100,25);

        j7=new JLabel("CONSTITUTION     :");
        j7.setBounds(200,400,120,25);

        t1 = new JTextField();
        t1.setBounds(330,100,150,25);

        t2=new JTextField();
        t2.setBounds(330,150,150,25);

        t3=new JTextField();
        t3.setBounds(330,200,150,25);

        t4= new JTextField();
        t4.setBounds(330,250,150,25);

        t5=new JTextField();
        t5.setBounds(330,300,150,25);

        t6= new JTextField();
        t6.setBounds(330,350,150,25);

        t7=new JTextField();
        t7.setBounds(330,400,150,25);

        b=new JButton("SUBMIT");
        b.setBounds(275,450,100,25);

        f.add(j1);
        f.add(j2);
        f.add(j3);
        f.add(j4);
        f.add(j5);
        f.add(j6);
        f.add(j7);

        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);
        f.add(t7);

        f.add(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        System.out.println("Hello");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b) {
            String USN;

            String sname;
            String Branch;
            String sem;
            String gender;

            USN = t1.getText();
            System.out.println(USN);
            sname = t2.getText();
            Branch = t3.getText();
            sem = t4.getText();
            gender = t5.getText();

            try {
                if(t1.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"please fill every field");
                }
                else {

                    try {
                        connect c = new connect();
                        String q = "INSERT INTO STUDENT(USN,SName,Branch,Semester,Gender)" + "VALUES('" + USN + "','" + sname + "','" + Branch + "','" + sem + "','" + gender + "')";
                        c.statement.executeUpdate(q);
                    }
                    catch (SQLException ex) {
                        ex.printStackTrace();
                        System.out.println("SQL State: " + ex.getSQLState());
                        System.out.println("Error Code: " + ex.getErrorCode());
                        System.out.println("Message: " + ex.getMessage());
                    }
                }
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }


    public static void main(String[] args) {
        new add_result();
    }
}
