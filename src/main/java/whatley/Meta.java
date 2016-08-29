package whatley;

public class Meta{
	private final int code;
	private final String[] errors;

	public Meta(int code, String[] errors){
		this.code = code;
		this.errors = errors;
	}

	public int getCode(){
		return code;
	}

	public String[] getErrors(){
		return errors;
	}
}
