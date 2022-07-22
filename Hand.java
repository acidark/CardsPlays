import java.util.ArrayList;
import java.util.Collections;
public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;
    public Hand(){
        this.hand = new ArrayList<>();
    }
    public void add(Card card){
        this.hand.add(card);
    }
    public void print(){
        this.hand.stream().forEach(s->System.out.println(s));
    }
    public void sort(){
        Collections.sort(hand);
    }
    public int compareTo(Hand object){
        //int i=0;
        //return this.hand.stream().map(s->s.getValue()).reduce(0,(a,b)->a+b).compareTo(object);
        return this.value()-object.value();
        //return this.com
    }
    public int value(){
        return this.hand.stream().map(s->s.getValue()).reduce(0, (a,b)->a+b);
    }
    public void sortBySuit(){
        //Collections.sort(this.hand,(c1,c2)->c2.getSuit().ordinal()-c1.getSuit().ordinal());
        Collections.sort(this.hand,new BySuitInValueOrder());
    }


}
