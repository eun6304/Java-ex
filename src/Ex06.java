import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("농구공의 개수를 입력하세요 : ");
		int num1 = sc.nextInt();
		int result = num1%5 == 0 ? num1/5 : num1/5+1;
		System.out.println("필요한 상자의 수 : " + result);
	}

}
