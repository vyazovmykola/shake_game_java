package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int screen_width = 30;
        final int screen_height = 30;
        final int snake_position_y = screen_height / 2; // Correcting x/y dimensions
        final int snake_position_x = screen_width / 2;

        GameScreen screen = new GameScreen(screen_height, screen_width); // Fixed parameter order
        screen.InitScreen();

        Scanner movement = new Scanner(System.in);
        boolean isRunning = true;

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
        }

        movement.close();
    }
}

