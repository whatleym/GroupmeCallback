package whatley;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Queue;
import java.util.LinkedList;

@SpringBootApplication
public class Application{

		public static Queue<String> queue = new LinkedList<String>();
		public static MessageSender messageSender = new MessageSender();
		
		public static void main(String[] args){
			SpringApplication.run(Application.class, args);
			Board board = new Board();
			String messageString = "";

//			int multiple = 1;
//			char letter = 'O';
//			System.out.println("New Game!\nEnter the column then the row separated by a space: ");
//			messageString += ("New Game!\nEnter the column then the row separated by a space: \n");

//			while(!board.checkGameOver(letter)){//79 and 88
//				int row, column;
//				letter += 9 * multiple;
//				multiple *= -1;
//				do {
					//messageString += board.printBoard();
//					board.printBoard();
//					System.out.printf("It's player %s's turn. ", letter);
//					messageSender.sendImage("", "http://97.89.22.14/tttImages/" + board.getFileName() + ".png");
//					messageString += "It's player " + letter + "'s turn. ";
//					messageSender.sendTextMessage(messageString);

//					messageString = "";
					

//				}



		}

		public static void printThis(String string){
			System.out.println("The String is " + string);
		}

		public static void pushUnparsed(String text){
			text = text.toLowerCase();
			if(text.contains("sender_type\":\"bot")){
				return;
			}
			if(text.contains("text\":\"tttbot")){
				text = text.substring(text.indexOf("tttbot") + 9);
				text = text.substring(0, text.indexOf("\""));
				System.out.println("THIS IS THE RESULTING TEXT: " + text);	

			}else{

			}
			
		}

		public static String fetchMove(){
			while(queue.isEmpty()){
				//loop and block until get something
			}
			

		}

		public static void printQueue(){

			while(!queue.isEmpty()){
				System.out.println(queue.remove());
			}

		}

		
}
