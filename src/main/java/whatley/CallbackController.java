package whatley;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallbackController{

	@RequestMapping(value = "/callback")
	public void callback(@RequestParam(value="text") String text){

		//Callback newCallback = new Callback(response, meta);

		//System.out.println("\n\nThis is the text: " + newCallback.toString() + "\n\n");

		System.out.println(text);

		//return newCallback;
	}

}