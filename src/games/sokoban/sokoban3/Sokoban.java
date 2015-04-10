package games.sokoban.sokoban3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Sokoban implements ISokoban{

	@Override
	public boolean canUndo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean canRedo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void load(InputStream inputStream) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(OutputStream outputStream) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getStaticCellValue(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDynamicCellValue(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countCells(Integer cellStatic, Integer cellDynamic) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getMoves() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(int[][] lines, String moves) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean movePlayer(int dx, int dy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String movePlayerTo(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String moveBox(int x, int y, int dx, int dy) {
		// TODO Auto-generated method stub
		return null;
	}

}
