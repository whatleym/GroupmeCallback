package whatley;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application{
		public static void main(String[] args){
			System.out.println("Running NOW");
			SpringApplication.run(Application.class, args);
			System.out.println("Reached end of main... idk what happens now.");
		}

		public static void printThis(String string){
			System.out.println("The String is " + string);
		}
}
