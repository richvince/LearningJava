package strings;

public class IntegerMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-1234".matches("-?\\d+"));
		System.out.println("5678".matches("-?\\d+"));
		System.out.println("+911".matches("-?\\d+"));
		System.out.println("+911".matches("(-|\\+)?\\d+"));
	}

}
