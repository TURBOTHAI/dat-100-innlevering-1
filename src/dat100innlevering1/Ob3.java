package dat100innlevering1;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Ob3 {
	
	public static void main(String[]args) {
	long fakultet= parseInt(showInputDialog("skriv inn fakulteten:")) ;
	long fact =1;
	//n=1
	//if (n>0)
	
	if (fakultet<0) {
		System.out.println("kan ikkje ha negative tall:");
		} else if (fakultet==0) {
			System.out.println("Fakulteten av 0 er 1.: ");
		} else {
	for (long i=1;i<=fakultet;i++) {
		fact=i*fact;
		System.out.println("fakuelteten av "+ fakultet +" er "+fact);
	}
   }
	//for løkke
 }
	// if true (n!=1*2*3*4)
}	
	//Systemprint
