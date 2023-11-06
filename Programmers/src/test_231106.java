import java.util.Scanner;

public class test_231106 {

	public static void main(String[] args) {

		/*정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.*/
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		double answer;
		System.out.print("num1 = " + num1 + ", ");
		System.out.println("num2 = " + num2);
		answer = num1+num2;
		System.out.println("num1 + num2 = " + answer);
		
		answer = (double)num1%num2;
		System.out.println("num1 + num2 = " + answer);
	}

}
