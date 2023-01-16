import javax.swing.*;
import java.awt.*;

public class Main {

    private static Handler handler;
    private static PlayerPad playerPad;

    public static void main(String[] args) {

        game();
    }

    private static void game(){
        handler = new Handler();
        playerPad = new PlayerPad(Color.GREEN);
        handler.add(playerPad);
        Ball ball = new Ball();
        handler.add(ball);

        //Init display
        Display display = new Display(handler);
        JFrame frame = new JFrame();
        frame.addKeyListener(new KeyboardInput(playerPad));
        frame.setSize(Display.WIDTH, Display.HEIGHT);
        frame.add(display);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
