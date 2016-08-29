package whatley;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallbackController{

	@RequestMapping("/callback")
	public Callback callback(@RequestParam(value="response") Response response, @RequestParam(value="meta") Meta meta){
		Callback newCallback = new Callback(response, meta);

		System.out.println(newCallback.toString());

		return newCallback;
	}

}