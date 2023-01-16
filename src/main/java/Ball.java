import java.awt.*;
import java.util.Random;

public class Ball extends GameObject {

    private int x, y, w, h;
    private int xV = 0, yV = 0;
    private int r,g,b;
    private final static int speed = 10;
    private Random random;

    public Ball(){
        x = Display.WIDTH/2;
        y = Display.HEIGHT/2;
        w = 10;
        h = 10;
        random = new Random();
        r = random.nextInt(0,255);
        g = random.nextInt(0,255);
        b = random.nextInt(0,255);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(new Color(r,this.g,b));
        g.fillRoundRect(x,y,h,w,h,w);
    }

    @Override
    public void update() {

    }
}
