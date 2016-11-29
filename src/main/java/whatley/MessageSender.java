import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.ByteArrayOutputStream;

public class MessageSender
{
	private final String REQUEST_URL = "https://api.groupme.com/v3/bots/post";
    private final String botID = "edef45775a98fe55eb5e09ffd4";

	public void sendTextMessage(String message)
	{
		String urlParameters = "bot_id=" + botID + "&text=" + message + "&param3=c";
		try
		{
			URL url = new URL(REQUEST_URL);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setInstanceFollowRedirects(false);
			connection.setRequestMethod("POST");
			connection.setUseCaches(false);

			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();
			connection.disconnect();

			int responseCode = connection.getResponseCode();
			if (responseCode != 202)
				System.out.println(responseCode + " error has occured while sending the message: " + message);
		} catch (MalformedURLException e)
		{
			System.out.println("Error occured while establishing a connection");
			e.printStackTrace();
		} catch (IOException e)
		{
			System.out.println("Error occured while sending data");
			e.printStackTrace();
		}
	}

	public void sendImage(String text, String imageURL)
	{
		try
		{
			String urlParameters = "{\"bot_id\":\"" + botID + "\",\"text\":\"" + text
					+ "\",\"attachments\":[{\"type\":\"image\",\"url\":\"" + imageURL + "\"}]}";
			String request = "https://api.groupme.com/v3/bots/post";
			URL url = new URL(request);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setInstanceFollowRedirects(false);
			connection.setRequestMethod("POST");
			connection.setUseCaches(false);

			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();
			connection.disconnect();

			int responseCode = connection.getResponseCode();
			if (responseCode != 202)
				System.out.println(responseCode + " error has occured while sending the image: " + imageURL);
		} catch (MalformedURLException e)
		{
			System.out.println("Error occured while establishing a connection");
			e.printStackTrace();
		} catch (IOException e)
		{
			System.out.println("Error occured while sending data");
			e.printStackTrace();
		}
	}

	// public void sendImage(String text, BufferedImage image){

	// 	byte[] imageInByte;
	// 	try{
	// 		ByteArrayOutputStream baos = new ByteArrayOutputStream();
	// 		ImageIO.write(image, "jpg", baos);
	// 		baos.flush();
	// 		imageInByte = baos.toByteArray();
	// 		baos.close();
		
	// 		//String urlParameters = "{\"bot_id\":\"" + botID + "\",\"text\":\"" + text
	// 		//		+ "\",\"attachments\":[{\"type\":\"image\",\"url\":\"" + imageURL + "\"}]}";
	// 		String request = "https://image.groupme.com/pictures";
	// 		URL url = new URL(request);
	// 		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	// 		connection.setDoOutput(true);
	// 		connection.setDoInput(true);
	// 		connection.setInstanceFollowRedirects(false);
	// 		connection.setRequestMethod("POST");
	// 		connection.setUseCaches(false);

	// 		DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
	// 		wr.write(imageInByte, 0, imageInByte.length);
	// 		// System.out.println(imageInByte.length);
	// 		// System.out.println(imageInByte);
	// 		// for(byte img: imageInByte){
	// 		// 	System.out.print(img);
	// 		// }
	// 		wr.flush();
	// 		wr.close();
	// 		connection.disconnect();

	// 		int responseCode = connection.getResponseCode();
	// 		if (responseCode != 202){
	// 			//System.out.println(responseCode + " error has occured while sending the image: " + imageURL);
	// 		}
	// 		System.out.println(responseCode + " " + connection.getResponseMessage());
	// 	} catch (MalformedURLException e){
	// 		System.out.println("Error occured while establishing a connection");
	// 		e.printStackTrace();
	// 	} catch (IOException e){
	// 		System.out.println("Error occured while sending data");
	// 		e.printStackTrace();
	// 	}


	// }

	public void sendLocation(String text, String locationName, double longitude, double latitude)
	{
		try
		{
			String urlParameters = "{\"bot_id\":\"" + botID + "\",\"text\":\"" + text +"\",\"attachments\":[{\"type\":\"location\",\"lng\":\"" 
					+ longitude +"\",\"lat\":\"" + latitude + "\",\"name\":\"" + locationName +"\"}]}";
			String request = "https://api.groupme.com/v3/bots/post";
			URL url = new URL(request);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setInstanceFollowRedirects(false);
			connection.setRequestMethod("POST");
			connection.setUseCaches(false);

			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			wr.writeBytes(urlParameters);
			wr.flush();
			wr.close();
			connection.disconnect();

			int responseCode = connection.getResponseCode();
			if (responseCode != 202)
				System.out.println(responseCode + " error has occured while sending the location: " + latitude + " " + longitude);
		} catch (MalformedURLException e)
		{
			System.out.println("Error occured while establishing a connection");
			e.printStackTrace();
		} catch (IOException e)
		{
			System.out.println("Error occured while sending data");
			e.printStackTrace();
		}
	}
}
