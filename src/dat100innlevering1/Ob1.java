package dat100innlevering1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;


public class Ob1 {
	public static void main(String[]args) {
		for (int i=1;i<=10;i++) {
			int karakter;
			
			
		while (true) {//løkken stopper når karakter skåren er gyldig
			karakter=parseInt(showInputDialog("skriv inn en poengsum"));

			if(karakter>=0 && karakter <=100) {
				break;
			} else {
				System.out.println("Ugyldig poengsum, prøv på nytt.");
			}
		}
		if (karakter<=100 && karakter>=90) {
			
			System.out.println("A");			
		} else if(karakter<=89 && karakter>=80){
			
			System.out.println("B");
		} else if(karakter<=79 && karakter>=60) {
			
			System.out.println("C");
		} else if(karakter<=59 && karakter>=50) {
			
			System.out.println("D");
		} else if(karakter<=49 && karakter>=40) {
			
			System.out.println("E");
		} else if(karakter<=39 && karakter>=0) {
			
			System.out.println("F");			
		}else {
			
			System.out.println("Error");
		}
		//if setninger
		
		//if Karakter er mellom 100 og 90 print A
		
		//else if Karakter er mellom 89 og 80 print B
		
		//else if Karakter er mellom 79 og 60 print C
		
		//else if Karakter er mellom 59 og 50 print D
		
		//else if Karakter er mellom 49 og 40print E
		
		//else if Karakter er mellom 39 og 0 print F
		
		//else error
		}
	}
}
