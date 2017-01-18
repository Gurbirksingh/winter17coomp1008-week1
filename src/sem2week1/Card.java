package sem2week1;

public class Card {
    private String faceName, suit;
    private int faceValue;

    Card(String ace, String heart, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Card(String suit, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Card(String suit, String string, String suit0, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
  
  
//        this method will validate if the suit is valid (i.e heart ,diamond,spades or club)
        
    private void setSuit (String suit)
    {
        if(suit.equalsIgnoreCase("heart")|| suit.equalsIgnoreCase("diamonds")
                || suit.equalsIgnoreCase("spade")|| suit.equalsIgnoreCase("club"))
        {
            this.suit= suit;
        }
        else 
        {
            throw new IllegalArgumentException("Suit value invalid");
        }
    }
    
//    this method will validate the value th face value is  between 2 to 14
    
   private void setValue(int value) 
   {
       if (value <2|| value>14){
           throw new IllegalArgumentException("Face value must be 2-14 inclusive");
       }
       else
       {
           faceValue =value;
       }
   }

    public String getFaceName() {
        return faceName;
    }

    public String getSuit() {
        return suit;
    }

    public int getFaceValue() {
        return faceValue;
    }
   
   
//   this method will return a String  to represent a card
   
   public String toString()
   {
       return faceName +" of " +suit;
   }
    
}
