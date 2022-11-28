import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToeNextMove {
	/**
	 * this method takes in the input file and returns its version of an array list
	 * @param inputFile
	 * @return
	 */
	public static ArrayList<String> getBoard(String inputFile) {
		ArrayList<String> gameBoard = new ArrayList<>();
		try (Scanner s = new Scanner(new File(inputFile))){
			s.nextLine();
			while(s.hasNext()) {
				String line = s.nextLine();
				String tokens[] = line.split(" ");
				gameBoard.add(tokens[0]);
				gameBoard.add(tokens[1]);
				gameBoard.add(tokens[2]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return gameBoard;
	}
	
	/**
	 * This method takes in an array list and returns indices without any player mark
	 * @param board
	 * @return
	 */
	public static ArrayList<Integer> getStatus(ArrayList<String> board) {
		ArrayList<Integer> emptyIndices = new ArrayList<>();
		for(int i=0; i<board.size(); i++) {
			if(board.get(i).equals("-")) {
				 emptyIndices.add(i);
			}
		}
		return emptyIndices;
	}
	
	/**
	 * this method returns the player intended position in a single digit 1d
	 * @param row
	 * @param col
	 * @return
	 */
	public static int getPosition(int row, int col) {
		int pos = 0;
		if(row == 1 && col == 1) {
			pos = 0;
		} 
		else if(row == 1 && col == 2){
			pos = 1;
		}
		else if(row == 1 && col == 3){
			pos = 2;
		}
		else if(row == 2 && col == 1){
			pos = 3;
		}
		else if(row == 2 && col == 2){
			pos = 4;
		}
		else if(row == 2 && col == 3){
			pos = 5;
		}
		else if(row == 3 && col == 1){
			pos = 6;
		}
		else if(row == 3 && col == 2){
			pos = 7;
		}
		else {
			pos = 8;
		}
		return pos;
	}
	
	/**
	 * this method executes a player's intended move by taking in the game board and considering its positions to determine
	 * if the move is correct and if the move is a winner and outputs an appropriate message. 
	 * @param gameBoard
	 * @param emptyIndices
	 * @param playMark
	 * @param pos
	 * @param row
	 * @param col
	 */
	public static void executePlay(ArrayList<String> gameBoard, ArrayList<Integer> emptyIndices, String playMark, int pos, int row, int col) {
		outer: for(int e: emptyIndices) {
			if(pos != e) {
				System.out.printf("Position %d, %d is already taken! \n", row, col);
				break outer;
			} else if(pos == e) {
				gameBoard.set(e, playMark);
				System.out.printf("Mark %s was placed on row %d, col %d! \n", playMark, row, col);	
				
		        for (int i = 0; i < gameBoard.size(); i++) {
		            String line = null;
		            
		            switch (i) {
		            case 0:
		                line = gameBoard.get(0) + gameBoard.get(1) + gameBoard.get(2);
		                break;
		            case 1:
		                line = gameBoard.get(3) + gameBoard.get(4) + gameBoard.get(5);
		                break;
		            case 2:
		                line = gameBoard.get(6) + gameBoard.get(7) + gameBoard.get(8);
		                break;
		            case 3:
		                line = gameBoard.get(0) + gameBoard.get(3) + gameBoard.get(6);
		                break;
		            case 4:
		                line = gameBoard.get(1) + gameBoard.get(4) + gameBoard.get(7);
		                break;
		            case 5:
		                line = gameBoard.get(2) + gameBoard.get(5) + gameBoard.get(8);
		                break;
		            case 6:
		                line = gameBoard.get(0) + gameBoard.get(4) + gameBoard.get(8);
		                break;
		            case 7:
		                line = gameBoard.get(2) + gameBoard.get(4) + gameBoard.get(6);
		                break;
		            }
		            if (line.equals("XXX")) {
		                System.out.printf("Player 1 is the WINNER!");
		                break outer;
		            }
		            else if (line.equals("OOO")) {
		                System.out.println("Player 2 is the WINNER!");
		                break outer;
		    		}
		        }
            }
        }
	}
	
	public static void main(String[] args) {
		
		String inputFile = args[0];
		String playMark = args[1];
		int pos1 = Integer.parseInt(args[2]);
		int pos2 = Integer.parseInt(args[3]);
		int row = 0;
		int col = 0;
		if((pos1 < 1 || pos1 > 9) && (pos2 < 1 || pos2 > 9)) {
			System.out.printf("Position %d, %d is invalid!", pos1, pos2);
		} else {
			row = pos1;
			col = pos2;
		}
		
		int position = getPosition(row, col);
		ArrayList<String> gameBoard = getBoard(inputFile);
		ArrayList<Integer> emptyIndices = getStatus(gameBoard);
		executePlay(gameBoard, emptyIndices, playMark, position, row, col);
	}
  }
