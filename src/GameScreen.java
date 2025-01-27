package src;

public class GameScreen {
    private int height, width;
    private char[][] screenBack;

    public GameScreen(int height, int width) {
        this.height = height;
        this.width = width;
        this.screenBack = new char[this.height][this.width]; // Correct initialization
    }

    public void InitScreen() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                screenBack[i][j] = '.'; // Initialize the screen with dots
            }
        }
        PrintScreen(); // Optionally print the screen to verify initialization
    }

    public void PrintScreen() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(screenBack[i][j]);
            }
            System.out.println();
        }
    }
}
