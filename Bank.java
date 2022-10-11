/*Consider a scenario where Bank is a class that provides 
functionality to get the rate of interest. 
However, the rate of interest varies according to banks. 
For example, SBI, ICICI and AXIS banks could 
provide 8%, 7%, and 9% rate of interest.
*/

package Lab_11Oct;

public class Bank{

		int getRateOfInterest(){return 0;}  //method to print rate of interest
		}

		class SBI extends Bank{
		int getRateOfInterest(){
			return 8;}
		}

		class ICICI extends Bank{
		int getRateOfInterest(){
			return 7;}
		}
		class AXIS extends Bank{
		int getRateOfInterest(){
			return 9;}
		}

		