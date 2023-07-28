import java.util.Scanner;
public class loop3 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        
        String name = console.next();
        int letras = name.length();
        
        	for (int letra = 0; letra < letras; letra ++) {
        		System.out.println(name.charAt(letra));
        	}//for
	
	
		console.close();
	}//main
}//class
