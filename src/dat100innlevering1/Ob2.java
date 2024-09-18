package dat100innlevering1;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Ob2 {

    public class OppgaveB6 {
    	public static void main(String[] args) {
    		sammenRegning();
    		
    		
    	
    		
    		
    	}
        public static void sammenRegning() {
        	
        	
            for (int i = 1; i <= 10; i++) {
            	int kunde=0;
            	int kundeT=i+kunde;
                int Bruttoinntekt;
                double t1 = 0.0;
                double t2 = 0.0;
                double t3 = 0.0;
                double t4 = 0.0;
                double t5 = 0.0;

                while (true) {
                	System.out.println("kundenummer"+""+kundeT);
                    Bruttoinntekt = parseInt(showInputDialog("Skriv inn Bruttoinntekten:"));

                    if (Bruttoinntekt >= 0 && Bruttoinntekt <= 1000000000) {
                        break;
                    } else { 
                        System.out.println("Error, skriv inn på nytt");
                    }
                }

                // Beregn trinnskatt for hvert trinn
                if (Bruttoinntekt > 1350000) {
                    t5 = (Bruttoinntekt - 1350000) * 0.176;
                    Bruttoinntekt = 1350000;
                }
                if (Bruttoinntekt > 937900) {
                    t4 = (Bruttoinntekt - 937900) * 0.166;
                    Bruttoinntekt = 937900;
                }
                if (Bruttoinntekt > 670000) {
                    t3 = (Bruttoinntekt - 670000) * 0.136;
                    Bruttoinntekt = 670000;
                }
                if (Bruttoinntekt > 292850) {
                    t2 = (Bruttoinntekt - 292850) * 0.04;
                    Bruttoinntekt = 292850;
                }
                if (Bruttoinntekt > 208050) {
                    t1 = (Bruttoinntekt - 208050) * 0.017;
                }

                // Totalt trinnskatt
                double totalSkatt = t1 + t2 + t3 + t4 + t5;
                
                System.out.println(String.format("%.2f KR - Totalt trinnskatt", totalSkatt));
            }
        }
    }
}
