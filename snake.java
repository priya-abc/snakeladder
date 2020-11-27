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
        int a=random.nextInt(3);

        while(position<100) {
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
    	    	
    	
    	    		
    	default:
    		
    		System.out.println("no operation");
    		break;
