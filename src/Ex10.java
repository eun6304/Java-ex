import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num + "��(��) ¦���Դϴ�.");
		} else {
			System.out.println(num + "��(��) Ȧ���Դϴ�.");
		}
	}

}