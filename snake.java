package sanke;

import java.util.*;
import java.util.Random;
public class snake {
	int startgame=0;
    int endgame=0;
    static int player1=0;
    static int player2=0;
    static int currentPlayer=-1;
    static int position=0;
    
    public static void main (String [] args)
    {
    System.out.println("Welcome to snake ladder game");
    
        Random random = new Random();
    	int diceRoll1 = random.nextInt(6+1);
    	System.out.println("num is:" + diceRoll1);
        
        
        while(position<100) {
        int a=random.nextInt(3);
    	System.out.println("case is:" +a);
    	switch(a) {
    	case 0:
    		
        	    position=position+diceRoll1;
        		System.out.println("position is:" +position);
        	    System.out.println("in case of ladder the player moves ahead by no of position");
        break;
    	
    	case 1:
    		position=position-diceRoll1;
    		System.out.println("position is:" +position);
    		System.out.println("in case of snake the player moves behind by no of position");
    	break;
    	case 2:
               if(position==100)
               System.out.println("Reached 100 Successfully");
        break;
    	default:
    		
    		System.out.println("no operation");
    		break;
    		}
    		if(currentPlayer == -1)
    		{
    			
    		 	player1 = calculatePlayerValue(player1, diceRoll1);
    			System.out.println("First Player :: " + player1);
    			System.out.println("Second Player :: " + player2);
                        }if(isWin(player1))
		         {
			System.out.println("First player wins");

          		}
    	            	}else{
		player2 = calculatePlayerValue(player2,diceRoll1);
		System.out.println("First Player :: " + player1);
		System.out.println("Second Player :: " + player2);
		System.out.println("------------------");
               if(isWin(player2))
		{
			System.out.println("Second player wins");
			return;
		}
	}
          }
      }
}
    	    	
