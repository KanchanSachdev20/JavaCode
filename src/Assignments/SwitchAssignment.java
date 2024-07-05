package Assignments;

public class SwitchAssignment {

	public static void main(String[] args) {
	
		String env ="Prod";
		
		 switch (env) {
		case "QA":
			System.out.println("QA Env");
			break;
			
		case "DEV":
			System.out.println("DEV Env");
			break;
			
		case "Prod":
			System.out.println("Prod Env");
			break;
			
		case "UAT":
			System.out.println("UAT Env");
			break;

		default:
			System.out.println("Please pass the correct env");
			break;
		}  
		 
		 //Car Type: Mini, Sedan, SUV, Premium
		 String car ="Mini";
		 
		 switch (car) {
			case "Mini":
				System.out.println("Mini Car");
				break;
				
			case "Sedan":
				System.out.println("Sedan Car");
				break;
				
			case "SUV":
				System.out.println("SUV Car");
				break;
				
			case "Premium":
				System.out.println("Premium Car");
				break;

			default:
				System.out.println("please select the right car type");
				break;
			}  

		 
		 //Browser: Chrome/Firefox/IE/Safari
		 
String browser ="Chrome";
		 
		 switch (browser) {
			case "Chrome":
				System.out.println("Launch Chrome");
				break;
				
			case "FireFox":
				System.out.println("Launch Firefox");
				break;
				
			case "IE":
				System.out.println("Launch IE");
				break;
				
			case "Safari":
				System.out.println("Launch Safari");
				break;

			default:
				System.out.println("please select the right browser type");
				break;
			}  
		 
		 
		 String loanType ="HousingLoan";
		 int sal =25000;
		 switch (loanType) {
			case "CarLoan":
				System.out.println("Car Loan");
				break;
				
			case "PersonalLoan":
				System.out.println("PersonalLoan");
				break;
				
			case "HousingLoan":
				if(sal < 35000)
				System.out.println("Not Applicable for Housing Loan");
				break;
				
			case "EducatioLoan":
				System.out.println("EducationLoan");
				break;

			default:
				System.out.println("please select the right loan type");
				break;
			}  
	}

}
