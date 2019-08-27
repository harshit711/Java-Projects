package hotel.booking;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.*;

public class HotelBooking 
{
    JFrame f;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JPanel p,p1;
    JTabbedPane tp;
    JCheckBox cb;
    JComboBox cb1,cb2,cb3;
    JRadioButton b1,b2;
    JButton bb1,bb2;
    String[] s=new String[]{"New Delhi","Mumbai","Bangalore","Gujrat","Uttar Pradesh"};
    String[] s1=new String[]{"Select Room Type","Single","Double","Triple","Quad","Queen","King"};
     String[] s3=new String[]{"Select Prefix","Mr.","Mrs.","Ms.","Dr."};
    public void init()
    {
        f=new JFrame("Hotel Booking");
        
        l1=new JLabel("Choose your Destination:");
        l2=new JLabel("Enter number of persons:");
        l3=new JLabel("Adults:");
        l4=new JLabel("Child:");
        l5=new JLabel("Number of rooms needed:");
        l6=new JLabel("Extra bed needed:");
        l7=new JLabel("First Name   :");
        l8=new JLabel("Middle Name  :");
        l9=new JLabel("Last Name    :");
        l10=new JLabel("Email       :");
        l11=new JLabel("Phone Number:");
        
        t1=new JTextField("Check in time");
        t2=new JTextField("Check-out time");
        t3=new JTextField();
        t4=new JTextField();
        t5=new JTextField();
        t6=new JTextField();
        t7=new JTextField("Enter your first name");
        t8=new JTextField("Enter your middle name");
        t9=new JTextField("Enter your last name");
        t10=new JTextField();
        t11=new JTextField();
        
        p=new JPanel();
        p1=new JPanel();

        tp=new JTabbedPane(1);
        
        cb=new JCheckBox("Accept terms and conditions");
        
        cb1=new JComboBox(s);
        cb2=new JComboBox(s1);
        cb3=new JComboBox(s3);
        
        b1=new JRadioButton("Yes");
        b2=new JRadioButton("No");
        
        bb1=new JButton("Submit");
        bb2=new JButton("Cancel");
        
        f.setVisible(true);
        p.setVisible(true);
        p.setLayout(null);
        
        p1.setVisible(true);
        p1.setLayout(null);

    }   
        public void booking()
        {
            init();
            
            f.setSize(480,430);
            f.add(p);
            
            p.setBackground(Color.yellow);
            p1.setBackground(Color.green);
            
            l1.setBounds( 5,5, 200, 20);
            cb1.setBounds( 150, 5, 100, 20);
            t1.setBounds( 5, 40, 80, 30);
            t2.setBounds( 105, 40,90 , 30);
            l2.setBounds( 5, 40, 300, 100);
            t3.setBounds( 160, 80, 40, 20);
            l3.setBounds( 5, 70, 100, 100);
            t4.setBounds( 50, 110, 50, 20);
            l4.setBounds( 105, 70, 100, 100);
            t5.setBounds( 140, 110, 50, 20);
            cb2.setBounds( 5, 140, 150, 20);
            l5.setBounds( 5, 125, 150, 100);
            t6.setBounds( 160, 165, 50, 20);
            l6.setBounds( 5, 145, 140, 120);
            b1.setBounds( 110, 200, 50, 10);
            b2.setBounds( 160, 200, 50, 10);
            cb.setBounds(5, 220, 190, 20);
            bb1.setBounds(200, 290, 100, 20);
            bb2.setBounds(330, 290, 100, 20);
            
            bb1.addActionListener(new ButtonClick());
                    
            l7.setBounds(5,35,100,20);
            l8.setBounds(5,70,100,20);
            l9.setBounds(5,100,100,20);
            l10.setBounds(5,130,100,20);
            l11.setBounds(5,160,100,20);
            t7.setBounds(105,35,145,20);
            t8.setBounds(105,70,145,20);
            t9.setBounds(105,100,145,20);
            t10.setBounds(105,130,250,20);
            t11.setBounds(105,160,100,20);
            cb3.setBounds(5, 5, 100, 20);
                    
            tp.addTab("Registeration",p);
            tp.addTab("Contact Details",p1);
            
            p.add(l1);
            p.add(l2);
            p.add(l3);
            p.add(l4);
            p.add(l5);
            p.add(l6);
           
            p.add(t1);
            p.add(t2);
            p.add(t3);
            p.add(t4);
            p.add(t5);
            p.add(t6);
            
            f.add(tp);
            
            p.add(cb);
            
            p.add(cb1);
            p.add(cb2);
           
           p.add(b1);
           p.add(b2);
           
           p.add(bb1);
           p.add(bb2);
           
           p1.add(l7);
           p1.add(l8);
           p1.add(l9);
           p1.add(l10);
           p1.add(l11);
           p1.add(t7);
           p1.add(t8);
           p1.add(t9);
           p1.add(t10);
           p1.add(t11);
           p1.add(cb3);
        }  
           class ButtonClick implements ActionListener
           {
               public void actionPerformed(ActionEvent ae)
               {
                   try
                   {
                           FileReader r = new FileReader("C:\\Users\\user\\Desktop\\JAVA\\hotel booking\\src\\hotel\\booking\\HotelBooking.java");
                           BufferedReader br = new BufferedReader(r);
                           FileWriter w=new FileWriter("C:\\Users\\user\\Desktop\\JAVA\\abc.txt");
                           BufferedWriter bw=new BufferedWriter(w);
                           String line;            
                           while ((line = br.readLine()) != null) 
                    {
                            bw.write(line);
                    }
                  }
                   catch(IOException e)
                           {
                               System.out.println(e);
                           }
              }
    }
    public static void main(String[] args) 
    {
           HotelBooking hb=new HotelBooking();
           hb.booking();
    }
    
}
