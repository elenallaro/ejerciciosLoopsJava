import java.util.Scanner;
public class loop1 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        int num;
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
                
        System.out.println("Multiplication Table of " + num);
        int mult= 0;
        while (mult <= 10) {
        	System.out.println(num + "x" + mult + "=" + (num*mult));
        	mult ++;
        }//while
        console.close();
	}//main
}//class
