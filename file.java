import java.util.Random;
import java.util.Scanner;
public class day {
	public static float exponential(float base, float log){
		float result = 1;
		
		for ( float i = log; i > 0; i-- )
		{

			result =  base * result;
			
		}			
		return result;
	}

public static int health(int health){
		
		//TODO: MAKE A COMPUTER INTERFACE
		//TODO: MAKE CULTS
	// MAKE VIM
		if (health < 0) System.out.println("You have died!");
		return 0;
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 Scanner userInput = new Scanner(System.in);
		 Scanner playerInput = new Scanner(System.in);
		 Scanner playerInp = new Scanner(System.in);
		 Scanner userIn = new Scanner(System.in);
		 //String playerB; 
		 boolean cave = false;
         boolean alley = false;
         boolean battle = false;
         boolean sewer = false;
         boolean prisonEscape = false;
	        System.out.println("Choose a class\n1: Normie \n2: Itchsmaele \n3: Wißord");
	         
	        // Get an integer from the user
	        int choice = userInput.nextInt();
	        
	       // int computer = userIn.nextInt();
	          String playerClass;
	          String playerA;
	          String playerB;
	          String playerAn;
	          String playerAns;
	          String playerAnse;
	          
	        // Start switch statement using choice variable
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
      		                { 0, 1, 2, 2, 1, 1 },
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
      		          System.out.println();
      		        }
      		      System.out.println("You are x."
      		      		+ "\n The . are plains, the ~ is water, the ^ are mountains.");
      		      
    	      	  }
    	      	  else if(playerAn.equalsIgnoreCase("N")){
    	      		  System.out.println("You do not look at the map.");
    	      	  }
      			  //y/n code here
      			  
    	        System.out.println("You go into the cave and see a man. Battle him? Y/N");
    	        playerB= playerInput.nextLine();
    	        if(playerB.equalsIgnoreCase("Y")){
          		  System.out.println("You choose to battle the man.");
          		battle = true;
          		//COPY THE BATTLE
          	  }
          	  else if(playerB.equalsIgnoreCase("N")){
          		  System.out.println("The man challanges you to a duel!");
          		battle = true;
          	  }
    	        Random randomLife = new Random();
    	        
    	        if (battle = true){
    	   	        	System.out.println("You shoot!" );
    	   	        	 int life = randomLife.nextInt(5) + 1;
    	   		        if (life == 5 || life == 3) {
    	   		        	System.out.println("You die");
    	   		        }
    	   		        else {
    	   		        	System.out.println("You have shot the man.");
    	        }   
    	   		     if (life != 5 || life != 3){
      	  		        System.out.println("The man has dropped a cloak. Put it on?");
      	  		        System.out.println("Y/N");
      	  		      Scanner userIn1 = new Scanner(System.in);
      		      	  playerB= userIn1.nextLine();
      		      	  
      	  		        {
      	  		          if(playerB.equalsIgnoreCase("Y")){
      		        		  System.out.println("You put on the cloak.");
      		        	  }
      		        	  else if(playerB.equalsIgnoreCase("N")){
      		        		  System.out.println("You choose to not put on the cloak.");
      		        		  System.exit(0);
      		        		  }
      	  		        }        
    	        }
    	        
      		  }
      		  else if (cave == false && alley == true ){
      			  System.out.println("You are now in an alley.");
      			  System.out.println("You see a manhole. Go down into the sewers?");
      			  //sewer code here
      			  
      			 System.out.println("Y/N");
     	        playerAnse= playerInput.nextLine();
     	        if(playerAnse.equalsIgnoreCase("Y")){
           		  System.out.println("You choose to go into the sewers.");
           		  sewer = true;
           		  System.out.println("You see a computer on the side of the sewers.\n\n");
           		  System.out.println("You gaze at the screen:");
           		  Random randomGenerator = new Random();
          		System.out.println("Welcome to Garbus Instruments-42 Calculator");
          		int keypress;
          		double keydub;
          		Scanner keyboard = new Scanner(System.in);
          		System.out.println("\n(0) Exit\n(1) Add \n(2) Subtraction "
          				+ "\n(3) Mutiplication"
          				+  "\n(4) Division \n(5) RNG"
          				+ "\n(6) Exponential");
          		System.out.println("Enter a function number:");
          		keypress = keyboard.nextInt();
          		
          		
          		if (keypress > 6){
          			System.out.println("Choose a valid number. Try rm -rf /*");
          			System.exit(0);
          		}
          		if (keypress == 1)
          		{
          			System.out.println("Adding two numbers");
          			int num1 = keyboard.nextInt();
          			int num2 = keyboard.nextInt();
          			System.out.println(num1 + num2);
          			
          		}
          		else if (keypress == 2){
          			System.out.println("Subtracting two numbers");
          			int num1 = keyboard.nextInt();
          			int num2 = keyboard.nextInt();
          			System.out.println(num1 - num2);
          		}
          		else if (keypress == 3){
          			System.out.println("Multiplying two numbers");
          			int num1 = keyboard.nextInt();
          			int num2 = keyboard.nextInt();
          			System.out.println(num1 * num2);
          		}
          		
          		else if (keypress == 4){
          			System.out.println("Dividing two numbers");
          			double num1 = keyboard.nextDouble();
          			double num2 = keyboard.nextDouble();
          			System.out.println(num1 / num2);
          		}
          		
          		else if (keypress == 5){
          			System.out.println("Random Number Generator");
          			int numb = randomGenerator.nextInt(100000);
          			System.out.println(numb);	
          		}
          		else if (keypress == 6)
          		{
          			
          			System.out.println("Enter base");
          			int base = keyboard.nextInt();
          			System.out.println("Enter log");
          			int  log = keyboard.nextInt();
          			exponential(base, log);
          			System.out.println(exponential(base, log));

          		}
          		if (keypress == 0)
          		{
          			System.out.println("Goodbye!");
          			
          		}
 
           		  System.out.println("\n\nA guard finds you. He says that you are now being sent to "
           		  		+ "\n prison for Property Destruction. You attempt to run \n but get knocked out by the"
           		  		+ " guard."
           		  		+ "\n"); 
           		  System.out.println("You wake up in a prison bus You see two doors behind you. You have three options"
           		  		+ "\n1:look outside"
           		  		+ "\n2: look to the left"
           		  		+ "\n3: look to the right"
           		  		+ "\n4: escape!");
           		int prison = playerInp.nextInt();
           		  switch(prison){
           		  case 1:
           			  System.out.println("You see the desert outside. There is a bump and the doors on the back open!");
           			prisonEscape = false;
           			  break;
           		  case 2:
           			System.out.println("You see two prisoners sitting on the seats of the bus. There is a bump and the doors on the back open!");
           			prisonEscape = false;
           			break;
           		  case 3:
           			System.out.println("You see two other prisoners sitting on the seats of the bus. There is a bump and the doors on the back open!");
           			prisonEscape = false;
           			break;
           		  case 4:
           			  System.out.println("You attempt to run away!");
           			prisonEscape = true;
           		  }
           		  if (prisonEscape = true){
           			  System.out.println("You attempt to fall through the doors on the back.");
           			  System.out.println("Success! You are now alone in the barren desert. You find a revolver full of bullets.");
           			  System.out.println("You see a man who is about to shoot you. You pull out your firearm and shoot back");
           			battle = true;
           		 Random randomLif = new Random();
     	        
     	        if (battle = true){
     	   	        	System.out.println("You shoot!" );
     	   	        	 int life = randomLif.nextInt(5) + 1;
     	   		        if (life == 5 || life == 3) {
     	   		        	System.out.println("You die");
     	   		        }
     	   		        else {
     	   		        	System.out.println("You have shot the man!");
     	        }   
     	   		    if (life != 5 || life != 3){
     	  		        System.out.println("The man has dropped a cloak. Put it on?");
     	  		        System.out.println("Y/N");
     	  		      Scanner userIn1 = new Scanner(System.in);
     		      	  playerB= userIn1.nextLine();
     		      	  
     	  		        {
     	  		          if(playerB.equalsIgnoreCase("Y")){
     		        		  System.out.println("You put on the cloak.");
     		        	  }
     		        	  else if(playerB.equalsIgnoreCase("N")){
     		        		  System.out.println("You choose to not put on the cloak.");
     		        		  System.exit(0);
     		        		  }
     	  		        }        
     	        }
           			  //You see a group of traders [dopesmoker image info here]
           			  //make duels
           		  }
           		
     	        }
     	        else{
     	        	System.out.println("You choose to stay out of the sewers.");
     	     	  //do this instead of exiting.
             		  System.out.println("\n\nA guard finds you. He says that you are now being sent to "
             		  		+ "\n prison for Property Destruction. You attempt to run \n but get knocked out by the"
             		  		+ " guard."
             		  		+ "\n"); 
             		  
     	        	//put back options from beginning.
     	        	//you can do something with booleans for this.
     	        }
      		  }
      		  
	}
      		  }    
	}
	}
