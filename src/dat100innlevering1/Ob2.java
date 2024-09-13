package dat100innlevering1;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Ob2 {

	public class OppgaveB6 {
	    public static void main(String[] args) {
	        for (int i=1; i<=10; i++) {
	            int Bruttoinntekt;
	            double t1=0.0;
	            double t2=0.0;
	            double t3=0.0;
	            double t4=0.0;
	            double t5=0.0;
	           
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
	            	t1=(292850-208051)*0.017; 
	                System.out.println((t1) + " KR - Trinn 1 skatt");
	            } else if (Bruttoinntekt <= 670000) {
	            	t2=(670000-292851)*0.04; 
	                System.out.println((t2+t1) + " KR - Trinn 2 skatt");
	            } else if (Bruttoinntekt <= 937900) {
	            	t3=(937900-670001)*0.136;
	                System.out.println((t3+t2+t1) + " KR - Trinn 3 skatt");
	            } else if (Bruttoinntekt <= 937901) {
	            	t4=(1350000-937901)*0.166;// Justert øvre grense
	                System.out.println((t4+t3+t2+t1) + " KR - Trinn 4 skatt");
	            } else {
	            	t5=(1350001-Bruttoinntekt)*0.176;
	                System.out.println((t5+t4+t3+t2+t1) + " KR - Trinn 5 skatt");
	            }
	        }
	    }
	}


}
