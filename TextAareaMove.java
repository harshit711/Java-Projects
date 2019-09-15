package textaareamove;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
public class TextAareaMove implements KeyListener{
       JFrame f;
       JTextField tf;
       static int i,j;
       public void init()
       {
           f=new JFrame("Text Area Move");
           tf=new JTextField();
           
           f.setLayout(null);
           f.setSize(600,600);
           tf.setSize(25,25);
           
           f.add(tf);
           f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           f.setVisible(true);
           
           tf.addKeyListener(this);
       }
    public static void main(String[] args) {
        TextAareaMove tam=new TextAareaMove();
        tam.init();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
       switch(e.getKeyCode()){
           case 39:
               i++;
               break;
           case 37:
               i--;
               break;
            case 40:
               j++;
               break;
            case 38:
               j--;
               break;
       }
       tf.setBounds(i,j, i, j);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
