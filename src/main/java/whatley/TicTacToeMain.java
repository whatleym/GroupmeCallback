import java.util.Scanner;

public class TicTacToeMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Board board = new Board();
//        Player playerX = new Player("Adam", 'X');
//        Player playerO = new Player("Jon", 'O');
        String messageString = "";
        MessageSender messageSender = new MessageSender();

        int multiple = 1;
        char letter = 'O';
        System.out.println("New Game!\nEnter the column then the row separated by a space: ");
        messageString += ("New Game!\nEnter the column then the row separated by a space: \n");
        while(!board.checkGameOver(letter)){//79 and 88
            int row, column;
            letter += 9 * multiple;
            multiple *= -1;
            do {
                //messageString += board.printBoard();
                board.printBoard();
                System.out.printf("It's player %s's turn. ", letter);
                messageSender.sendImage("", "http://97.89.22.14/tttImages/" + board.getFileName() + ".png");
                messageString += "It's player " + letter + "'s turn. ";
                messageSender.sendTextMessage(messageString);

                messageString = "";
                column = scanner.nextInt() - 1;
                row = scanner.nextInt() - 1;
            }while(!board.validateInput(row, column));
            board.setTile(row, column, letter);
			//board.generateImage();
        }

        board.printBoard();

        switch(board.getWinner()){
            case 'X':
                System.out.println("X won the game!");
                break;
            case 'O':
                System.out.printf("O won the game!");
                break;
            default:
                System.out.println("Cat! Nobody won.");
        }


    }

}
