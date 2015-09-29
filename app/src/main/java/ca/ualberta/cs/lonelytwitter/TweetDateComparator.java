package ca.ualberta.cs.lonelytwitter;

import java.util.Comparator;

/**
 * Created by ali on 15-09-28.
 */
public class TweetDateComparator implements Comparator<Tweet> {


    public int compare(Tweet tweet1, Tweet tweet2){
        return tweet1.compareTo(tweet2);
    }
}
