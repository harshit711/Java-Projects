package moving.object.using.thread;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MovingObjectUsingThread extends Thread {

    String threadname;
    JLabel l1, l2, l3, l4;
    JFrame fr;

    public MovingObjectUsingThread() {
        buildGUI();
    }

    public MovingObjectUsingThread(String s) {
        super(s);
    }

    public void run() {
        while (true) {
            if (Thread.currentThread().getName().equals("RunnerA")) {
              runRunnerA();
              runRunnerB();
              runRunnerC();
              runRunnerD();
              runRunnerDrev();
              runRunnerCrev();
              runRunnerBrev();
              runRunnerArev();
    }
 }
    }
    public void runRunnerA() {
        for (int i = 0; i < 101; i++) {
            l1.setBounds(i, 20, 120, 30);
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public void runRunnerArev() {
        for (int i = 100; i >=0; i--) {
            l1.setBounds(i, 20, 120, 30);
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void runRunnerB() {
        for (int i = 0; i < 101; i++) {
            l2.setBounds(i, 90, 120, 30);
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
        public void runRunnerBrev() {
        for (int i = 100; i>=0; i--) {
            l2.setBounds(i, 90, 120, 30);
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }


    public void runRunnerC() {
        for (int i = 150; i <= 300; i++) {
            l3.setBounds(i, 20, 120, 30);
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
        public void runRunnerCrev() {
        for (int i = 300; i>=150; i--) {
            l3.setBounds(i, 20, 120, 30);
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void runRunnerD() {
        for (int i = 170; i <= 300; i++) {
            l4.setBounds(i, 90, 120, 30);
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
        public void runRunnerDrev() {
        for (int i = 300; i>=170; i--) {
            l4.setBounds(i, 90, 120, 30);
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void buildGUI() {
        fr = new JFrame("Moving Objects");
        fr.setVisible(true);
        fr.setSize(400, 200);
        fr.setLayout(null);
        l1 = new JLabel("HELLO");
        l2 = new JLabel("WELCOME");
        l3 = new JLabel("WORLD");
        l4 = new JLabel("STUDENTS");
        l1.setSize(20, 20);
        l2.setSize(20, 20);
        l3.setSize(20, 20);
        l4.setSize(20, 20);
        l1.setBackground(Color.red);
        l1.setBounds(10, 10, 100, 100);//HELLO
        l2.setBounds(10, 60, 100, 100);//WELCOME
        l3.setBounds(170, 19, 120, 30);//WORLD
        l4.setBounds(185, 90, 120, 30);//STUDENTS
        fr.add(l1);
        fr.add(l2);
        fr.add(l3);
        fr.add(l4);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MovingObjectUsingThread obj = new MovingObjectUsingThread();
        Thread Runner1 = new Thread(obj);
        Thread Runner2 = new Thread(obj);
        Thread Runner3 = new Thread(obj);
        Thread Runner4 = new Thread(obj);
        Thread Runner5 = new Thread(obj);
        Thread Runner6 = new Thread(obj);
        Thread Runner7 = new Thread(obj);
        Thread Runner8 = new Thread(obj);
        Runner1.setName("RunnerA");
        Runner2.setName("RunnerB");
        Runner3.setName("RunnerC");
        Runner4.setName("RunnerD");
        Runner5.setName("Runnerarev");
        Runner6.setName("RunnerBrev");
        Runner7.setName("RunnerBrev");
        Runner8.setName("RunnerBrev");

        Runner1.start();
        try {
            Runner1.join();
        } catch (Exception e) {
        }
        Runner5.start();
        try {
            Runner1.join();
        } catch (Exception e) {
        }     
        Runner2.start();
        try {
            Runner2.join();
        } catch (Exception e) {
        }
        Runner3.start();
        try {
            Runner3.join();
        } catch (Exception e) {
        }
        Runner4.start();
        try {
            Runner4.join();
        } catch (Exception e) {
        }
        Runner5.start();
        try {
            Runner5.join();
        } catch (Exception e) {
        }
        Runner6.start();
        try {
            Runner6.join();
        } catch (Exception e) {
        }
        Runner7.start();
        try {
            Runner7.join();
        } catch (Exception e) {
        }
        Runner8.start();
        try {
            Runner8.join();
        } catch (Exception e) {
        }
    }

}
