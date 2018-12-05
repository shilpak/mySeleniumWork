package Academy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsontest {

	public static void main(String[] args) {
		HttpURLConnection connection = null;
		String inputLine;
		StringBuffer response = new StringBuffer();

		try {
			String targetURL = "https://ergast.com/api/f1/2017/circuits.json?fbclid=IwAR3qkINBfrElscGRkdXARgzpnhkFuW8pez0xUTxRrDkGk0goBkUNEkivEpo";
			URL url = new URL(targetURL );
			// Make connection
			connection = (HttpURLConnection) url.openConnection();
			// Set request type as HTTP GET
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type","application/json");
			connection.setUseCaches(false);
			connection.setDoOutput(true);
			if (connection.getResponseCode()==200) {
				// get response stream
				BufferedReader in = new BufferedReader(
						new InputStreamReader(connection.getInputStream()));
				// feed response into the StringBuilder
				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();
				//Convert json string to object
				JSONObject obj = new JSONObject(response.toString());
				
				//System.out.println(obj);
				//System.out.println(obj.length());
				JSONObject obj1 = obj.getJSONObject("MRData");
				//System.out.println(obj.getJSONObject("MRData").length());
				JSONObject obj3 = obj1.getJSONObject("CircuitTable");
				//System.out.println(obj3);
				JSONArray circuitArray = obj3.getJSONArray("Circuits");
				//System.out.println(circuitArray);
				JSONObject obj4 = circuitArray.getJSONObject(0);
				JSONObject obj5=obj4.getJSONObject("Location"); 
				System.out.println(obj5.getString("lat"));
				System.out.println(obj5.getString("long"));

			}
			else {
				System.out.println("Can't get data");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


}



