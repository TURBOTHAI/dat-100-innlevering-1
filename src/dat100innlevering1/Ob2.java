package dat100innlevering1;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Ob2 {

	public class OppgaveB6 {
	    public static void main(String[] args) {
	        for (int i=1; i<=10; i++) {
	            int Bruttoinntekt;

	            while (true) {
	            	Bruttoinntekt = parseInt(showInputDialog("skriv inn Bruttoinntekten: "));
	            	
	            	if (Bruttoinntekt>=0 && Bruttoinntekt<=1000000000) {
	            	break;    		
	            	} else {
	            		 System.out.println("Error, skriv inn på nytt");
	            	 }
	            }
	            if (Bruttoinntekt <= 208050) {
	                System.out.println(Bruttoinntekt + " KR - Ingen trinnskatt");
	            } else if (Bruttoinntekt <= 292850) {
	                System.out.println((Bruttoinntekt * 0.017) + " KR - Trinn 1 skatt");
	            } else if (Bruttoinntekt <= 670000) {
	                System.out.println((Bruttoinntekt * 0.04) + " KR - Trinn 2 skatt");
	            } else if (Bruttoinntekt <= 937900) {
	                System.out.println((Bruttoinntekt * 0.136) + " KR - Trinn 3 skatt");
	            } else if (Bruttoinntekt <= 1999999) {  // Justert øvre grense
	                System.out.println((Bruttoinntekt * 0.176) + " KR - Trinn 4 skatt");
	            } else {
	                System.out.println((Bruttoinntekt * 0.178) + " KR - Trinn 5 skatt");
	            }
	        }
	    }
	}


}
