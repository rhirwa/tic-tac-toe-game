import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToeNextMove {

	public static ArrayList<String> getBoard(String inputFile) {
		ArrayList<String> gameBoard = new ArrayList<>();
		try (Scanner s = new Scanner(new File(inputFile))){
			while(s.hasNext()) {
				String line = s.nextLine();
				String tokens[] = line.split(" ");
				gameBoard.add(tokens[0]);
				gameBoard.add(tokens[1]);
				gameBoard.add(tokens[2]);
				gameBoard.add(tokens[3]);
				gameBoard.add(tokens[4]);
				gameBoard.add(tokens[5]);
				gameBoard.add(tokens[6]);
				gameBoard.add(tokens[7]);
				gameBoard.add(tokens[8]);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return gameBoard;
	}
	
	public static ArrayList<Integer> getStatus(ArrayList<String> board) {
		ArrayList<Integer> emptyIndices = new ArrayList<>();
		for(int i=0; i<board.size(); i++) {
			if(board.get(i).isBlank()) {
				 emptyIndices.add(i);
			}
		}
		return emptyIndices;
	}
	
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
	
	public static void executePlay(ArrayList<String> gameBoard, ArrayList<Integer> emptyIndices, String playMark, int pos, int row, int col) {
		for(int e: emptyIndices) {
			if(pos != e) {
				System.out.printf("Position %d, %d is already taken!", row, col);
			} else if( pos == e) {
				gameBoard.set(e, playMark);
				System.out.printf("Mark %s was placed on row %d, col %d!", playMark, row, col);	
				
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
		            }
		            else if (line.equals("OOO")) {
		                System.out.println("Player 2 is the WINNER!");
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
