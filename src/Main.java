package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int screen_width = 30;
        final int screen_height = 30;
        final int snake_position_x = screen_width / 2;

        GameScreen screen = new GameScreen(screen_height, screen_width); 
        screen.InitScreen();

        

        Scanner movement = new Scanner(System.in);
        boolean isRunning = true;

<<<<<<< Updated upstream
=======
        wall wall = new wall();
        wall.addWallsRow(screen, 0);
        wall.addWallsColumn(screen, 0);
        wall.addWallsRow(screen, screen_height-1);
        wall.addWallsColumn(screen,screen_width-1);
        

>>>>>>> Stashed changes
        while (isRunning) {
            System.out.println("Enter a direction (W/A/S/D to move, Q to quit): ");
            char input = movement.next().charAt(0);

            switch (input) {
                case 'w':
                case 'a':
                case 's':
                case 'd':
                    System.out.println("Move " + input);
                    break;
                case 'Q':
                    isRunning = false;
                    System.out.println("Game Over!");
                    break;
                default:
                    System.out.println("Invalid input nothing happend");
            }
            int newX = snake.getX(); 
            int newY = snake.getY();
        
            
            if (newX == 0 || newX == screen_width - 1 || newY == 0 || newY == screen_height - 1) {
                System.out.println("Game Over! You hit a wall.");
                isRunning = false;
            }
        }

        movement.close();
    }
}

