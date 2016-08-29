package whatley;

public class Attachment{

	private final String type;
	private final String url;

	public Attachment(String type, String url){
		this.type = type;
		this.url = url;
	}

	public String getType(){
		return type;
	}

	public String getUrl(){
		return url;
	}

}