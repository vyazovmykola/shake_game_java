package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int screen_width = 10;
        final int screen_height = 10;
        final int snake_position_x = screen_width / 2;
        final int snake_position_y = screen_height / 2;
       
        GameScreen screen = new GameScreen(screen_height, screen_width); 
        screen.InitScreen();
        Snake snake = new Snake('@', snake_position_x, snake_position_y);
        screen.setObjectOnLocation(snake, snake_position_x, snake_position_y);

        Scanner movement = new Scanner(System.in);
        boolean isRunning = true;

        wall wall = new wall();
        wall.addWallsRow(screen, 0);
        wall.addWallsColumn(screen, 0);
        wall.addWallsRow(screen, screen_height-1);
        wall.addWallsColumn(screen,screen_width-1);

        while (isRunning) {
            screen.PrintScreen();
            System.out.println("Enter a direction (W/A/S/D to move, Q to quit): ");
            char input = movement.next().charAt(0);

            switch (input) {
                case 'w':
                    snake.moveUp(screen, snake);
                    break;
                case 'a':
                    snake.moveLeft(screen, snake);
                    break;
                case 's':
                    snake.moveDown(screen, snake);
                    break;
                case 'd':
                    snake.moveRight(screen,snake);
                    break;
                case 'Q':
                    isRunning = false;
                    System.out.println("Game Over!");
                    break;
                default:
                    System.out.println("Invalid input nothing happend");
            }
        }

        movement.close();
    }
}