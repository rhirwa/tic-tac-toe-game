
public class TicTacToeNextMove {

	public static void main(String[] args) {
		char [][] gameBoard  = {
				{'-', '|', '-', '|', '-'},
				{'_', '|', '_',	'|', '_'},
				{'-', '|', '-', '|', '-'},
				{'_', '|', '_', '|', '_'},
				{'-', '|', '-', '|', '-'}
		};
		
		String playMark = args[0];
		String xInput = args[1];
		String oInput = args[2];
		
		int intXInput = Integer.parseInt(xInput);
		int intOInput = Integer.parseInt(oInput);
		
		char position = gameBoard[intXInput][intOInput]; 
	}
//	public static int getStatus() {
//		
//		
//		return 0;
//	}
//	
//	
//	
//	
//	
//	
//	public static void boardPlay(char [][] gameField, int String, String playMark) {
//		
//		char input = ' ';
//		if(playMark.equals("x")) {
//			input = 'x';
//		} else if(playMark.equals("o")) {
//			input = 'o';
//		}
		
//		switch () {
//		case 1: 
//			gameField[0][0] = 'input';
//			break;
//		case 2: 
//			gameField[0][1] = 'input';
//				break;
//		case 3: 
//			gameField[0][2] = 'input';
//			break;
//		case 4: 
//			gameField[1][0] = 'input';
//			break;
//		case 5: 
//			gameField[1][1] = 'input';
//			break;
//		case 6: 
//			gameField[1][2] = 'input';
//			break;
//		case 7: 
//			gameField[2][0] = 'input';
//			break;
//		case 8: 
//			gameField[2][1] = 'input';
//			break;
//		case 9: 
//			gameField[2][2] = 'input';
//			break;
//		default:
//			break;
//		}
//	}
//
  }
