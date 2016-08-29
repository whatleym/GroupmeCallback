package whatley;

public class Response{
	
	private final Attachment[] attachments;
	private final String avatarUrl;
	private final int createdAt;
	private final String groupId;
	private final String id;
	private final String name;
	private final String senderId;
	private final String senderType;
	private final String sourceGuid;
	private final boolean system;
	private final String text;
	private final String userId;

	public Response(Attachment[] attachments, String avatarUrl, int createdAt, String groupId, String id, String name, String senderId, String senderType, String sourceGuid, boolean system, String text, String userId){
		this.attachments = attachments;
		this.avatarUrl = avatarUrl;
		this.createdAt = createdAt;
		this.groupId = groupId;
		this.id = id;
		this.name = name;
		this.senderId = senderId;
		this.senderType = senderType;
		this.sourceGuid = sourceGuid;
		this.system = system;
		this.text = text;
		this.userId = userId;
	}

	public Attachment[] getAttachments(){
		return attachments;
	}

	public String getAvatarUrl(){
		return avatarUrl;
	}

	public int getCreatedAt(){
		return createdAt;
	}

	public String getGroupId(){
		return groupId;
	}

	public String getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public String getSenderId(){
		return senderId;
	}

	public String getSenderType(){
		return senderType;
	}

	public String getSourceGuid(){
		return sourceGuid;
	}

	public boolean getSystem(){
		return system;
	}

	public String getText(){
		return text;
	}
	
	public String getUserId(){
		return userId;
	}

}	
