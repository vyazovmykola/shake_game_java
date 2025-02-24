package src;

import java.util.ArrayList;

public class GameScreen {
    private int height, width;
    private char[][] screenBack;
    private ArrayList<wall> walls;

    public GameScreen(int height, int width) {
        public boolean touch_wall(int x,int y){
            for(wall wall:walls){
                if (wall.getX() == x && wall.getY()==y) {
                    return true;
                }
            }
            return false;
        }
        this.height = height;
        this.width = width;
        this.walls = new ArrayList<>();
        this.screenBack = new char[this.height][this.width]; 
    }

    public void InitScreen() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                screenBack[i][j] = '.'; 
            }
        }
        PrintScreen(); 
    }

    public void PrintScreen() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(screenBack[i][j]);
            }
            System.out.println();
        }
    }
    public void ClearScreen(int x,int y){
        this.screenBack[y][x] ='.';
    }
    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
    public char getObjectOnLocation(int x, int y){
        return this.screenBack[y][x];
    }

    public void setObjectOnLocation(GameObject object, int x,int y){
        this.screenBack[y][x]= object.getSymbol();
    }     
}
