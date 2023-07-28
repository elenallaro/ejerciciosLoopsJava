
public class loop2 {

	public static void main(String[] args) {
		System.out.println(0);
		System.out.println(1);
        int num1= 0;
		int num2= 1;
			do {
				int tot = (num1 + num2); 
				System.out.println(tot);
				num1 = num2;
				num2 = tot;
			} while (num1 <=100); 

	}//main
}//class
