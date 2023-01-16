import java.awt.*;
import java.awt.event.KeyListener;

public class PlayerPad extends GameObject {

    public final static int speed = 7;
    private int w, h;
    private int x, y;
    private Color color;
    private int xV = 0, yV = 0;


    public PlayerPad(Color color) {
        w = Display.WIDTH / 8;
        h = 20;
        x = Display.WIDTH / 2 - w / 2;
        y = Display.HEIGHT - h * 3;
        this.color = color;
    }

    public void update() {
//        if (x == Display.WIDTH - w || x == 0) {
//            xV = 0;
//        }
//        if (y == Display.HEIGHT - h || y == (int) (Display.HEIGHT * 0.66)) {
//            yV = 0;
//        }
        x = Utilities.clampAdd(x, xV, 0, Display.WIDTH - w);
        y = Utilities.clampAdd(y, yV, (int) (Display.HEIGHT * 0.8), Display.HEIGHT - h);
        xV = 0;
        yV = 0;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(color);
        g.fillRoundRect(x, y, w, h, 15, 15);
    }

    public void setxV(int xV) {
        this.xV = xV;
    }

    public void setyV(int yV) {
        this.yV = yV;
    }
}
