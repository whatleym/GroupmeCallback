package whatley;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallbackController{

	@RequestMapping(value = "/callback", method = RequestMethod.POST)
	public void callback(@RequestBody String text){
		//System.out.println(text);
		//Maybe parse the JSON here
		//check to see if correct person is playing
		//call method in tic tac toe

		Application.printThis(text);
	}

}
