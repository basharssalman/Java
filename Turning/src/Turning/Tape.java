package Turning;

/**
 * Class Tape, implement the Turing machine algorithm using doubly-linked list
 * the class has a class variable called currentCell of type Cell the
 * constructor of this class will create a new cell, which the left and right
 * cell of this cell are null; the content of this cell is a blank space '' of
 * type char
 * 
 * @author Student
 *
 */
class Tape {

	Cell currentCell = new Cell();

	/**
	 * getter method of type Cell
	 * 
	 * @return current cell
	 */
	public Cell getCurrentCell() {
		return currentCell;
	}

	/**
	 * getter method of type char
	 * 
	 * @return the content of the current cell
	 */
	public char getContent() {
		return currentCell.content;
	}

	/**
	 * setter method of type char
	 * 
	 * @param ch, parameter of type char, the content of the current cell
	 */
	public void setContent(char ch) {
		currentCell.content = ch;
	}

	/**
	 * moves the current cell to the left, if the current cell is the leftmost cell
	 * creates a new cell with blank content, makes it to the left of the current
	 * cell, and make the current cell to its right, and then change the pointer of
	 * the current cell to point to the new cell
	 */
	public void moveLeft() {
		if (currentCell.prev == null) {
			Cell newCell = new Cell();
			newCell.content = ' ';
			currentCell.prev = newCell;
			newCell.next = currentCell;
			newCell = currentCell;
		}
		currentCell = currentCell.prev;
	}

	/**
	 * moves the current cell to the right, if the current cell is the rightmost
	 * cell creates a new cell with blank content, makes it to the right of the
	 * current cell, and make the current cell to its left, and then change the
	 * pointer of the current cell to point to the new cell
	 */
	public void moveRight() {
		if (currentCell.next == null) {
			Cell newCell = new Cell();
			newCell.content = ' ';
			currentCell.next = newCell;
			newCell.prev = currentCell;
			newCell = currentCell;
		}
		currentCell = currentCell.next;
	}

	/**
	 * getter method, if the current cell is not on the leftmost, move it until it's
	 * the leftmost cell. a blank string to store the content of the tape starting
	 * from left to right until it reaches the rightmost cell, null cells are not
	 * recognized
	 * 
	 * @return tapeContent, string contains the contents of the tape
	 */
	public String getTapeContents() {

		Cell getCell = new Cell();
		String tapeContent = "";
		getCell = currentCell;
		while (getCell.prev != null)
			getCell = getCell.prev;
		while (getCell.next != null) {
			tapeContent += getCell.content;
			getCell = getCell.next;
		}
		return tapeContent;

	}

	/**
	 * constructor creates a new cell with blank content the new cell point to null
	 * cells on its right and left side the new cell points to the current cell
	 */
	Tape() {
		Cell newCell = new Cell();
		newCell.content = ' ';
		newCell.prev = null;
		newCell.next = null;
		currentCell = newCell;
	}
}