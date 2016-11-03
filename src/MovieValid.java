import java.util.Scanner;

public class MovieValid {
	
	//validates input
	public String Validate(){
		
		Scanner sc = new Scanner(System.in);
        int i = 0;
        boolean isValid = false;
        
        String[] category = {"drama", "animated", "horror", "scifi", "comedy", "musical"};
        
        while (isValid == false)
        {
        	System.out.println("1. Drama\n2. Animated\n3. Horror\n4."
    						+ " Scifi\n5. Comedy\n6. Musical\n"+
    						"Enter the number of the category you want to choose:");
        	
            if (sc.hasNextInt()){
            	i = sc.nextInt();
            	if(i > 0 && i < 7){
            		isValid = true;}
            	else continue;
            }else{
                System.out.println("Error! Invalid integer value. Try again.");}
            sc.nextLine();  // discard any other data entered on the line
        }
		return category[(i-1)];
	}
	
	//validates char
	public char YesOrNo(){
		Scanner sc = new Scanner(System.in);
		
		String response = "";
		boolean cont = true;
		while(cont){
			System.out.print("\nContinue to calculate? (y/n): ");
			response = sc.nextLine();
			if(response.length() != 1){
				continue;
			}
			else if (response.toLowerCase().charAt(0) != 'y' && response.toLowerCase().charAt(0) != 'n'){
				continue;
				}
			else{
				break;
			}
		}
		return response.toLowerCase().charAt(0);
	}
	
	//Breaking while loop if false 
	public boolean loopingAgain(char response){
		if (response == 'y'){
			return true;
		} else{
			return false;
		}
	}
	
	//Closing message
	public void exitting(boolean cont){
		if (cont == false){
			System.out.println(	"\nGoodbye.");
		}
	}
}
