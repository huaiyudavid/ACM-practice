import java.util.Scanner;
import java.util.StringTokenizer;

public class Lexicography_Yang {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Scanner input = new Scanner(System.in);
		String s;
		while ((s=input.nextLine()) != "# 0") {
			StringTokenizer tokens = new StringTokenizer(s);
			String word = tokens.nextToken();
			long k = Long.parseLong(tokens.nextToken());
			
		}
	}
}
