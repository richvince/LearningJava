package kid.gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GsonDemo {

	
	public static void main(String[] args) throws IOException {
		demo4();
	}
	
	public static void demo1() throws IOException {
		try(Reader reader = new InputStreamReader(GsonDemo.class.getResourceAsStream("Server1.json"), "UTF-8")) {
			Gson gson = new GsonBuilder().create();
			Person p = gson.fromJson(reader, Person.class);
			System.out.println(p);
		}
	}
	
	//Nested JSON object
	public static void demo2() throws IOException {
		try(Reader reader = new InputStreamReader(GsonDemo.class.getResourceAsStream("Server2.json"), "UTF-8")) {
			Gson gson = new GsonBuilder().create();
			Person p = gson.fromJson(reader, Person.class);
			System.out.println(p);
		}
	}
	
	public static void demo3() {
		Gson gson = new GsonBuilder().create();
		
		int[] ints = {1,2,3,4,5};
		System.out.println(gson.toJson(ints));
		
	}
	
	public static void demo4() {
		String json = "{\"data\": {\"translations\": [{\"translatedText\": \"Hello world\"}]}}";
		
		JsonElement jElement = new JsonParser().parse(json);
		JsonObject jObject = jElement.getAsJsonObject();
		jObject.addProperty("test", "test");
		jObject = jObject.getAsJsonObject("data");
		JsonArray jArray = jObject.getAsJsonArray("translations");
		
		jObject = jArray.get(0).getAsJsonObject();
		String result = jObject.get("translatedText").getAsString();
		System.out.println(result);
		
	}
}

/* for demo1
class Person {
	private String NAME;
	private String LOCATION;
	
	@Override
	public String toString() {
		return NAME + "-" + LOCATION;
	}
} */

// for demo2
class Person {
	private String NAME;
	private String LOCATION;
	private Exam EXAM;
	
	@Override
	public String toString() {
		return NAME + "-" + LOCATION + "(" + EXAM + ")";
	}
}

class Exam {
	private String SUBJECT;
	private String GRADE;
	
	@Override
	public String toString() {
		return SUBJECT + "-" + GRADE;
	}
}


