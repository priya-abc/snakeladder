package sanke;

import java.util.*;
import java.util.Random;
public class snake {
    static int startgame=0;
    static int endgame=0;
    static int player1=0;
    static int player2=0;
    static int count1,count2,endgame1,endgame2;
    static int position=0;
    
    public static void snakeLadder() {
    System.out.println("Welcome to snake ladder game");
    
    position=startgame;
	endgame1=startgame;
	endgame2=startgame;
	count1=startgame;
	count2=startgame;}
    public void dice() {
    	Random random = new Random();
    	int diceRoll1 = random.nextInt(6+1);
    	System.out.println("num is:" + diceRoll1);
    	int diceRoll2 = random.nextInt(6+1);
    	System.out.println("num is:" + diceRoll2);}
    private void a(){        
        
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
             public static void player1(Object roll)
	{
		roll=diceRoll1;
		count1++;
		endgame1=endgame2+position;
		if(endgame1>100)
		{
			endgame1=endgame1-diceRoll1;
		}
		System.out.println("Player 1 New Position: "+endgame1);
	}
public static void player2(int roll2)
	{
		roll2=diceRoll2;
		count2++;
		endgame2=endgame2+position;
		if(endgame2>100)
		{
			endgame2=endgame2-diceRoll2;
		}
		System.out.println("Player 2 New Position: "+endgame2);
	}
        public static void main(String[] args) {
	snakeLadder();
	System.out.println("Initial Position: "+startgame);
	while(endgame1 < endgame && endgame2 < endgame)
	{
	player1(roll);
	player2(diceRoll2);
	}
