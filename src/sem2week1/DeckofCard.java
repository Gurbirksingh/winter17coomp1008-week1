/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sem2week1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author apple
 */
public class DeckofCard {
     private ArrayList<Card> deck;
    
    public DeckofCard()
    {
        String[] suits = {"heart", "diamonds", "spades","clubs"};
        String [] faceName = {"two","three","four","five","six","seven","eight","nine","ten","eleven","tewleve","thirteen"
                                 ,"fourteen"};
        
        
        for (String suit:suits)
            
        {
            for(int i=0;i<faceName.length;i++)
            {
                
            Card newCard = new Card(suit,faceName[i],suit,i+2);
            deck.add(newCard);
        }
           
     
        }
    }
        
        public String toString()
        {
            String deckString ="";
            for (Card card : deck)
            {
                deckString += card.toString() + "%n";
            }
       return deckString;
        }
   


//        this method will shuffel deck of card
        
     public void shuffle() {
            Collections.shuffle(deck);
        }

//this method will deal the top of card
     
     public Card dealTopCard()
     {
         if (deck.isEmpty())
             return null;
         else
             return deck.remove(0);
     }
     
     
     
}
    

