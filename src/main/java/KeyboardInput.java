import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInput implements KeyListener {
    private PlayerPad playerPad;

    public KeyboardInput(PlayerPad playerPad) {
        this.playerPad = playerPad;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        char key = e.getKeyChar();

        if (key == 'w')
            playerPad.setyV(PlayerPad.speed*-1);
        if (key == 's')
            playerPad.setyV(PlayerPad.speed);
        if (key == 'd')
            playerPad.setxV(PlayerPad.speed);
        if (key == 'a')
            playerPad.setxV(PlayerPad.speed * -1);


    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
