package stopwatchdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class StopwatchDemo extends Thread implements ActionListener{
          JFrame f;
          JButton b1,b2;   
          JTextField fd;
          static StopwatchDemo sd = new StopwatchDemo();
          public void init()
          {
              f=new JFrame("STOP-WATCH");
              b1=new JButton("START");
              b2=new JButton("RESET");
              fd=new JTextField();
              f.setLayout(null);
              
              b1.addActionListener(this);
              b2.addActionListener(this);
              fd.setBounds(10, 130, 100, 20);
              b1.setBounds(10, 10, 100, 20);
              b2.setBounds(10, 70, 100, 20);
              
              f.setSize(400,250);
              
              f.add(b1);
              f.add(b2);
              f.add(fd);
              f.setVisible(true);
              
              f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          }
     @Override
     public void run()
     {
         
         try{
             for(int i=0;;i++)
             {
                 fd.setText(""+i);
                 Thread.sleep(1000);
             }
         }catch(InterruptedException ie){
             System.out.println(ie);
         }
     }
     public void reset()
     {
         b1.setText("START");
         fd.setText("0");
         sd.stop();
     }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        switch(ae.getActionCommand())
        {
            
            case "START":
                sd.start();
                b1.setText("STOP");
                break;
            case "STOP":
                sd.stop();
                b1.setText("START");
                break;
            case "RESET":
            sd.reset();
            break;
        }
    }
        public static void main(String[] args) {
       StopwatchDemo sd= StopwatchDemo.sd;
       sd.init();
       
    }
}
