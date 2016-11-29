package whatley;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Queue;
import java.util.LinkedList;

@SpringBootApplication
public class Application{

		public static Queue<String> queue = new LinkedList<String>();
		
		public static void main(String[] args){
			SpringApplication.run(Application.class, args);
		}

		public static void printThis(String string){
			System.out.println("The String is " + string);
		}

		public static void pushUnparsed(String text){
			queue.add(text);
		}

		public static void printQueue(){

			if(queue.size() > 5){
				while(!queue.isEmpty()){
					System.out.println(queue.remove);
				}	
			}


		}

		
}
