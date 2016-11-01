package whatley;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application{
		public static void main(String[] args){
			SpringApplication.run(Application.class, args);
		}

		public static void printThis(String string){
			System.out.println("The String is " + string);
		}
}
