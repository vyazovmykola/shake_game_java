package src;

public class wall extends GameObject {

	public wall() {
		setSymbol('#');
	}

	public wall(char symbol) {
		setSymbol(symbol);
	}

	public void addWallsRow(GameScreen screen, int rowNumber) {
		for (int i = 0; i < screen.getWidth(); i++) {
			screen.setObjectOnLocation(new wall(), i, rowNumber);
		}
	}

	public void addWallsColumn(GameScreen screen, int columnNumber) {
		for (int i = 0; i < screen.getHeight(); i++) {
			screen.setObjectOnLocation(new wall(), columnNumber, i);
		}
	}
}