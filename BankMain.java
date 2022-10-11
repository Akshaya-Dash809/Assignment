/*Consider a scenario where Bank is a class that provides 
functionality to get the rate of interest. 
However, the rate of interest varies according to banks. 
For example, SBI, ICICI and AXIS banks could 
provide 8%, 7%, and 9% rate of interest.
*/

package Lab_11Oct;

public class BankMain {  //main method of bank
		public static void main(String args[]){
			
		SBI s=new SBI();  //object of SBI
		ICICI i=new ICICI(); //object of ICICI
		AXIS a=new AXIS();  //Object of Axis
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest() +"%");
		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest()+"%");
		System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest() +"%");
		}
		}

