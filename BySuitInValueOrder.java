import java.util.Comparator;
public class BySuitInValueOrder implements Comparator<Card>{
    public int compare(Card c1,Card c2){
        
        int suit= c1.getSuit().ordinal()-c2.getSuit().ordinal();
        //if(suit<0){
        //    return c1.getValue()-c2.getValue();
        //} else if(suit == 0){
        //    return c1.getValue()-c2.getValue();
        //} return 1;
        if(suit==0){
            return c1.getValue()-c2.getValue();
        }
        return suit;
    }
    
}
