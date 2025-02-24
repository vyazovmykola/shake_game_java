package src;

public class Snake  extends GameObject {

	public Snake(char symbol, int xStartingLocation, int yStartingLocation) {
		setSymbol(symbol);
		setX(xStartingLocation);
		setY(yStartingLocation);
	}
	
	public void moveLeft(GameScreen screen, Snake snake) {
		if (getX()>0) {
			snake.setX(getX() - 1);
			screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
			screen.ClearScreen(snake.getX() + 1, snake.getY());
		}
	}
	
	public void moveRight(GameScreen screen, Snake snake) {
		if (getX()<screen.getWidth()-1) {
			snake.setX(getX() + 1);
			screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
			screen.ClearScreen(snake.getX() - 1, snake.getY());
		}
	}
	
	public void moveUp(GameScreen screen, Snake snake) {
		if (getY()>0) {
			snake.setY(getY() - 1);
			screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
			screen.ClearScreen(snake.getX(), snake.getY() + 1);
		}

	}
	
	public void moveDown(GameScreen screen, Snake snake) {
		if (getY()<screen.getHeight()-1) {
			snake.setY(getY() + 1);
			screen.setObjectOnLocation(snake, snake.getX(), snake.getY());
			screen.ClearScreen(snake.getX(), snake.getY() - 1);
		}
	}

}

