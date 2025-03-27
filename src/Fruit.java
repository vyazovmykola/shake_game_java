package src;
import java.util.Random;

public class Fruit extends GameObject {
    public Fruit() {
        setSymbol('F');
    }
    
    public int[] getRandomEmptyPos(GameScreen screen){
        Random rand = new Random();
        int x,y;
        do{
            x = rand.nextInt(screen.getWidth());
            y = rand.nextInt(screen.getHeight());
        }while (screen.getObjectOnLocation(x, y) != '.');
        return new int[]{x,y};
    }

    public void spawnFruit(GameScreen screen) {
        int[] pos = getRandomEmptyPos(screen); 
        setX(pos[0]);
        setY(pos[1]);
        screen.setObjectOnLocation(this, pos[0], pos[1]);
    }
    
}
