import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;

public class Board {

    private char[][] board = new char[3][3];
    private int moves = 0;
    private char winner = ' ';

    public Board(){
        for(int row = 0; row < board.length; row++){
            for(int column = 0; column < board[row].length; column++){
                board[row][column] = 'B';
            }
        }
    }

    public void setTile(int row, int column, char character){
        board[row][column] = character;
        moves++;
    }

    public boolean checkGameOver(char character){
        if(checkWin(character) || moves == 9 ){
            return true;
        }else{

            return false;
        }
    }

    public boolean checkWin(char character){
        boolean win = true;
        winner = character;
        if(board[0][0] == character && board[1][0] == character && board[2][0] == character){//left vertical
        }else if(board[0][1] == character && board[1][1] == character && board[2][1] == character){//mid vertical
        }else if(board[0][2] == character && board[1][2] == character && board[2][2] == character){//right vertical
        }else if(board[0][0] == character && board[0][1] == character && board[0][2] == character){//top horizontal
        }else if(board[1][0] == character && board[1][1] == character && board[1][2] == character){//mid horizontal
        }else if(board[2][0] == character && board[2][1] == character && board[2][2] == character){//bottom horizontal
        }else if(board[0][0] == character && board[1][1] == character && board[2][2] == character){//diagonal \
        }else if(board[2][0] == character && board[1][1] == character && board[0][2] == character){//diagonal /
        }else{
            win = false;
            winner = ' ';
        }
        return win;
    }

    public boolean validateInput(int row, int column){
        if(row <= 2 && row >= 0 && column <= 2 && column >= 0 && board[row][column] == 'B'){
            return true;
        }
        else{
            System.out.println("Invalid input. Format 'row# column#'");
            return false;
        }
    }

    public char getWinner(){
        return winner;
    }

//	public void generateImage() {
//		BufferedImage boardPic = null;
//		BufferedImage xPic = null;
//		BufferedImage oPic = null;
//		BufferedImage blank = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
//		//BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_RGB);
//		try {
//			boardPic = ImageIO.read(new File("src/board.png"));
//			xPic = ImageIO.read(new File("src/X.png"));
//			oPic = ImageIO.read(new File("src/O.png"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		BufferedImage currentCharacter = null;
//		for(int xPixel = 100; xPixel < 400; xPixel += 100) {
//			for(int yPixel = 100; yPixel < 400; yPixel += 100) {
//				if (board[yPixel / 125][xPixel / 125] == 'X') {
//					currentCharacter = xPic;
//				} else if (board[yPixel / 125][xPixel / 125] == 'O') {
//					currentCharacter = oPic;
//					//System.out.println("worked 4 real");
//				} else {
//					continue;
//				}
//				for (int x = xPixel + 10; x < xPixel + 90; x++) {
//					for (int y = yPixel + 10; y < yPixel + 90; y++) {
//						boardPic.setRGB(x, y, currentCharacter.getRGB(x - xPixel, y - yPixel));
//						//System.out.println("See how far this goes" + y + " " + x);
//					}
//				}
//			}
//		}
//		try {
//			ImageIO.write(boardPic, "png", new File("src/image.png"));
//			//System.out.println("Worked");
//		}catch(IOException e){
//			//System.out.println("Didn't work");
//			e.printStackTrace();
//		}
//	}

    public String printBoard(){
        String boardString = "";
        System.out.print("  1  2  3\n");
        boardString += "  1  2  3\n";
        for(int row = 0; row < board.length; row++){
            System.out.print(row + 1);
            boardString += row + 1;
            for(int column = 0; column < board[row].length; column++){
                System.out.printf("[%s]", board[row][column]);
                boardString += "[" + board[row][column] + "]";
            }
            System.out.println();
            boardString += "\n";
        }
        return boardString;
    }

    public String getFileName(){
        String fileName = "";
        for(int row = 0; row < board.length; row++){
            for(int column = 0; column < board[row].length; column++){
                fileName += board[row][column];
            }
        }
        return fileName;
    }
}
