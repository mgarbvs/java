package adventure;
import java.util.Scanner;
import java.util.Random;
public class adventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the cave!\nAdventures Await!");
		int playerLevel = 3;
		String playerName = "Greg";
		double playerHealth = 10.0;
		System.out.println(playerName);

		 System.out.println( "You are " + playerName + " the level " + playerLevel + " adventurer.");
		 System.out.println("Welcome to the cave");
		 playerLevel = playerLevel + 1;
		 System.out.println("You are now level " + playerLevel );
		 
		 double rockDamage = 1.0;
		 System.out.println("You get hit by a rock");
		 playerHealth -= rockDamage;
		 System.out.println("You took " + 
				 rockDamage+ " Damage. You have " 
				 + playerHealth + " Health remaining.");
		   
	        if( playerHealth <=0 ){
	        	System.out.println("What a sad day,"
	        			+ playerName + " is dead! They were level "
	        			+ playerLevel);
	        	System.exit(0);
	        }
		 System.out.println("You have recovered!");
		 playerLevel++;
		 System.out.println("You tripped");
		 playerLevel--;
		 Scanner playerInput = new Scanner(System.in);
		 System.out.println("You lose your memory! What is your name?");
		  System.out.println( "What is your name?");
	        playerName = playerInput.nextLine();
	         
	        System.out.println( "You are " + playerName + " the level " + playerLevel + " adventurer.");
	
	        String playerAnswer;
	        System.out.println("You are in a cave."
	                + "\nThere is a dark path to the left."
	                + "\nThere is a pile of rubble to the right."
	                + "\nWould you like to go 'left' or 'right'?");
	        // get player's answer
	        playerAnswer = playerInput.nextLine();
	         
	        if(playerAnswer.equalsIgnoreCase("right")){
	            System.out.println("You climb up the pile of rubble. It leads to a small cavern."
	                    + "\nThere is a treasure chest here. It is full of treasure.");
	            playerLevel++;
	            System.out.println("You leveled up. You are now level " + playerLevel);
	        }
	        else if(playerAnswer.equalsIgnoreCase("left")){
	            System.out.println("The path gets very dark. Another rock ambushes you.");
	            rockDamage = 2.0;
	            playerHealth -= rockDamage;
	            System.out.println("You took " + rockDamage + " Damage. You have " + playerHealth + " health remaining");
	            
	            if( playerHealth <= 0 ){ 
	            	 
	                System.out.println("Oh no, "
	                     + playerName +" died! They were level "
	                        + playerLevel);
	                System.exit(0);
	 
	            }
	            Random randomGenerator = new Random();
	          
	         
// Rock falling and causing damage
        double rockDamag = randomGenerator.nextInt(5);
        System.out.println("A treacherous rock ambushes you.");
        playerHealth -= rockDamag;
        System.out.println("You took " + rockDamag
                + " damage. You have " + playerHealth
                + " health remaining.");
 	         // System.out.println(playerName + "fell and got out of the cave. You have to pay a toll of " + "units");  
	        }
	        Random randomLife = new Random();
	        String playerAns;
	        String playerAn;
	        String playerAnsw;
	        System.out.println("Ishmael has arrived. He offers to play Russian Roulette. If you win, he will give you a magic elixir. If you die"
	        		+ ", your kidneys will be harvested. Play or Fight?");
	        // get player's answer
	        playerAns= playerInput.nextLine();
	         
	        if(playerAns.equalsIgnoreCase("Play")){
	        	System.out.println("You choose to play Russian Roulette");
	        	 int life = randomLife.nextInt(7) + 1;
		        if (life == 5) {
		        	System.out.println("You die");
		        }
		        else {
		        	System.out.println("You live. You have gained (1) Mountain Dew");
		        }
		        
	        }
	        else if(playerAns.equalsIgnoreCase("Fight")){
	            System.out.println("You pull out a small rusty spork.");
	            int fight = randomLife.nextInt(2);
	            if (fight == 1){
	            	System.out.println("Ishmael fled at the sight of your spork");
	            	 playerLevel++;
	            	 System.out.println("You have leveled up!  You are now a" + playerLevel + "player!");
	            	 
	            }
	            
	            else{
	            	System.out.println("Ishmael beat you up and stole your kidneys. Continue living?(Y/N)");
	            	 playerAnsw = playerInput.nextLine();
	            	 if(playerAnsw.equalsIgnoreCase("Y")){
	            		 double playerHp = 0.1;
	            		 System.out.println("You have health of " + playerHp);
	     	 
	     	            }
	            	 else {
	            		    System.exit(0);
	            	 }
	            	 
	            	 System.out.println("After fighting Ishmael, you see some leftover Gatorade Thrist Quencher™. Do you drink it? ");
	            	 playerAn = playerInput.nextLine();
	            	 if(playerAnsw.equalsIgnoreCase("Y")){
	            		 double playerHp = 0.1;
	            		 System.out.println("You have health of " + playerHp);
	     	 
	     	            }
	            	 else {
	            		 System.out.println("You are dead");
	            	 }
	            		    System.exit(0);
	            	 
	            	 }
	           
	            	 
	            }
	    
	
	     
	        
	        playerInput.close();
	     
	        
	  
	         
		 
	}
	

}
