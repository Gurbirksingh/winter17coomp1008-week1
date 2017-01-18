/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sem2week1;

import java.util.ArrayList;

/**
 *
 * @author apple
 */
public class Sem2week1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         boolean a = snowDepth(5);
         System.out.print("output "+ a);
         boolean b = snowDepth(35);
         System.out.print("\n output "+ b);
         ///
         
         System.out.println();
         star(5);
         
         
         Card myFirstCard = new Card("ace","spade",14);
         System.out.printf("my card is : %s%n",myFirstCard);
         
         Card mySecondCard = new Card("ace","heart",14);
         System.out.printf("my card is : %s%n",mySecondCard);
         
         DeckofCard theDeck = new DeckofCard();
         System.out.printf("our deck of card includeas : %n%s", theDeck.toString());
         
                 theDeck.shuffle();
                 System.out.printf("%n%n after  shuffling the deck ,it looks like : %n%s",theDeck.toString());
                 
                 ArrayList<Card> zacsHand = new ArrayList<>();
                 for (int i=1; i<=5; i++)
                 {
                     zacsHand.add(theDeck.dealTopCard());
                 }
                 System.out.printf("%nZac's hand is : % s",zacsHand.toString());
         
    }

    private static boolean snowDepth(int a) {
        // return a>30;
        //        t>f;
        if (a>30){
        return true;
        }
        else
        {
        return false;
        }
        
    }
    
public static void star(int i){
    for( ; i>0; i--){
        
    for (int j=1;j<=i;j++){
    System.out.print("*");
    }
    System.out.println();
}
}  
}
