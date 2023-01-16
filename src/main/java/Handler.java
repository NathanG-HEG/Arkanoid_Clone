import java.awt.*;
import java.util.LinkedList;

public class Handler {

    private LinkedList<GameObject> gameObjects;

    public Handler() {
        gameObjects = new LinkedList<>();
    }

    public void add(GameObject go){
        gameObjects.addFirst(go);
    }

    public void update(){
        for(GameObject go : gameObjects){
            go.update();
        }
    }


    public void render(Graphics g){
        for(GameObject go : gameObjects){
            go.render(g);
        }
    }
}
