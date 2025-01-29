package src;

public class wall extends GameObject {
    public wall (){
        setSymbol("#");
    }
    public wall(char symbol){
        setSymbol(symbol);
    }
    public void addWallsRow(GameScreen screen, Wall wall, int rowNumber) {
		for (int i = 0; i < screen.getScreenWidth(); i++) {
			screen.setObjectOnLocation(wall, i, rowNumber);
		}
	}

	public void addWallsColumn(GameScreen screen, Wall wall, int columnNumber) {
		for (int i = 0; i < screen.getScreenHeight(); i++) {
			screen.setObjectOnLocation(wall, columnNumber, i);
		}
	}
}
