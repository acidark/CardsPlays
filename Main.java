import java.util.Collections;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // test your code here

        Card first = new Card(2, Suit.DIAMOND);
        Card second = new Card(14, Suit.SPADE);
        Card third = new Card(12, Suit.HEART);
        Card four = new Card(2, Suit.SPADE);
        


        /*System.out.println(first);
        System.out.println(second);
        System.out.println(third);*/
        /*Hand hand = new Hand();

        hand.add(first);
        hand.add(second);
        hand.add(third);
        hand.add(four);
        hand.sort();
        hand.print(); */
        /*Hand hand2= new Hand(); 
        hand2.add(new Card(12,Suit.HEART));
        hand2.add(new Card(4, Suit.SPADE));
        hand2.add(new Card(2, Suit.DIAMOND));
        hand2.add(new Card(14, Suit.SPADE));
        hand2.add(new Card(7, Suit.HEART));
        hand2.add(new Card(2,Suit.SPADE));
        //int comparison =  hand.compareTo(hand2);
        ArrayList<Card> manos = new ArrayList<>();
        manos.add(first);
        manos.add(second);
        manos.add(third);
        manos.add(four);*/
        BySuitInValueOrder comparator = new BySuitInValueOrder();
        Card uno = new Card(3, Suit.CLUB);
        Card dos = new Card(2, Suit.SPADE);
        System.out.println(comparator.compare(uno, dos));
        
        //Collections.sort(manos,new BySuitInValueOrder());
        //manos.stream().forEach(s->System.out.println(s));
        //hand2.sortBySuit();
        //hand2.print();
        //System.out.println(com);
        /*if(comparison<0){
            System.out.println("Better hand is");
            hand2.print();
        } else if(comparison>0){
            System.out.println("Better hand is");
            hand.print();
        }else{
            System.out.println("hand are equal");
        }*/
    }
}
