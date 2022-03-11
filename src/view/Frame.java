package view;
import controller.SGController;
import javax.swing.JFrame;
public class Frame extends JFrame {
    
    
    public Frame() {
        setTitle("Snake");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }
}

// Have snake elements in a stack or linked list, pop off last
