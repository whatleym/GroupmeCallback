package whatley;

public class Callback{

	private final Response response;
	private final Meta meta;

	public Callback(Response response, Meta meta){
		this.response = response;
		this.meta = meta;
	}

	public Response getResponse(){
		return response;
	}

	public Meta meta(){
		return meta;
	}
}
