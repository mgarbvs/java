import java.util.Random;
import java.util.Scanner;
public class day {
public static int health(int health){
		
		
		if (health < 0) System.out.println("You have died!");
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner userInput = new Scanner(System.in);
		 Scanner playerInput = new Scanner(System.in);
	        System.out.println("Choose a class\n1: Normie \n2: Itchsmaele \n3: Wißord");
	         
	        // Get an integer from the user
	        int choice = userInput.nextInt();
	          String playerClass;
	          String playerA;
	          String playerAn;
	          String playerAns;
	          boolean cave = false;
	          boolean alley = false;
	        // Start switch statment using choice variable
	        switch(choice){
	        case 1:
	            // This will run if user types 1
	            System.out.println("You picked Normie");
	            playerClass = "Normie";
	            break;
	        case 2:
	            // This will run if user types 2
	            System.out.println("You picked Itchsmaele");
	            playerClass = "itch";
	            break;
	        case 3:
	            // This will run if user types 3
	            System.out.println("You picked Wißord");
	            playerClass = "wiz";
	            break;
	        default:
	            // This will run if user types any other number
	            System.out.println("You are now CIA.");
	            playerClass = "cia";
	            System.out.println(""
	            		+ " Dr. Pavel, I'm CIA.\n"
	            		+ "  He wasn't alone."
	            		+ "\n  You don't get to bring friends."
	            		+ "\n   They are not my friends."
	            		+ "\n Don't worry, no charge for them.");
	            System.out.println("\nY/N");
	      	  playerA= playerInput.nextLine();
	            if(playerA.equalsIgnoreCase("Y")){
	        		  System.out.println("You choose to crash the plane.");
	        	  }
	        	  else if(playerA.equalsIgnoreCase("N")){
	        		  System.out.println("You choose to file the flight plan with the agency. You die because of a papercut");
	        		  System.exit(0);
	        		  }
	            break;
	        }
	       
	        System.out.println("You see a cave. Walk into the cave? Y/N");
	        playerAn= playerInput.nextLine();
	        if(playerAn.equalsIgnoreCase("Y")){
      		  System.out.println("You choose to enter the cave.");
      		cave = true;
      	  }
      	  else if(playerAn.equalsIgnoreCase("N")){
      		  System.out.println("You choose to leave.");
      		  System.out.println("You have three options:"
      		  		+ "\n1) Go into the cave."
      		  		+ "\n2) Wander into the alley"
      		  		+ "\n3) Stay where you are.");
      		int choiceTwo = userInput.nextInt();
      		  switch(choiceTwo){
      		  case 1: 
      			  System.out.println("You choose to go into the cave.");
      			  cave = true;
      			  break;
      		  case 2:
      			  
      			  System.out.println("You choose to wander into the alley");
      			  alley = true;
      			 break;
      		  case 3:
      			  System.out.println("You choose to stand still. You end your adventure here.");
      			System.exit(0);
      			break;
      		  }
      		  
      		  }
      		  if (cave == true && alley == false ){
      			  System.out.println("You are now in the cave.");
      			  System.out.println("You have a map. Look at it? y/n");  
      			playerAns= playerInput.nextLine(); 
      			
    	        if(playerAn.equalsIgnoreCase("y")){
    	        	int[][] map =
      		            {
      		                { 0, 0, 0, 0, 1, 1 },
      		                { 0, 1, 2, 2, 2, 2 },
      		                { 1, 1, 2, 5, 2, 2 },
      		                { 1, 1, 2, 0, 1, 1 },
      		                { 0, 1, 1, 1, 1, 1 },
      		                { 0, 1, 1, 1, 1, 1 }
      		            };
      		         
      		        // TODO: Randomly generate a map
      		         
      		        // Draw the map
      		        for (int row = 0; row < map.length; row++){
      		            for(int col = 0; col < map[row].length; col++){
      		                // Check each spot on the map and print the appropriate graphic
      		                switch(map[row][col]){
      		                case 0:
      		                    // Water
      		                    System.out.print("~ ");
      		                    break;
      		                case 1:
      		                    // Plains
      		                    System.out.print(". ");
      		                    break;
      		                case 2:
      		                    // Mountain
      		                    System.out.print("^ ");
      		                    break;
      		                case 5:
      		                    // Water
      		                    System.out.print("x");
      		                    break;
      		                }
      		            }
      		         
      		        }
      		      System.out.println("You are x."
      		      		+ "\n The . are plains, the ~ is water, the ^ are mountains.");
      		      
    	      	  }
    	      	  else if(playerAn.equalsIgnoreCase("N")){
    	      		  System.out.println("You do not look at the map.");
    	      	  }
      			  //y/n code here
      			  
      			  
      			   
      		        }
      		  else if (cave == false && alley == true ){
      			  System.out.println("You are now in an alley.");
      			  System.out.println("You see a manhole. Go down into the sewers?");
      			  //sewer code here
      		  }
      		  
      		  }
	        
	}


