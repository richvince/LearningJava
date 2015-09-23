import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ConsoleDemo {
	
	public static void main(String[] args) {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input);
		
		while(true) {
			try {
				String s = reader.readLine();
				System.out.println("Repeat again: " + s);
			} catch(Exception e) {
				System.out.println(e.toString());
			}
			
		}
	}
}
