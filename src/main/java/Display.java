import javax.swing.*;
import java.awt.*;

public class Display extends JPanel {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 600;
    public static final int FRAMERATE = 60;
    private final Handler handler;

    public Display(Handler handler){
        this.handler = handler;
    }

    public void paint(Graphics g){
        super.paintComponent(g);
        setBackground(Color.black);
        handler.render(g);
        handler.update();
        repaint();
        try {
            Thread.sleep(1000/FRAMERATE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
