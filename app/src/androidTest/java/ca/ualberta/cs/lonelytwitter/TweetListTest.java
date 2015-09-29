package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.TestCase;

/**
 * Created by ali on 15-09-28.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet1() {
        TweetList tweetList = new TweetList();
        tweetList.add(new NormalTweet("test"));
    }

    public void testAddTweet2() throws IllegalArgumentException {
        TweetList tweetList = new TweetList();
        tweetList.add(new NormalTweet("test"));
        tweetList.add(new NormalTweet("test"));
        //ILLEGALARGUMENTEXCEPTION
    }

    public void testGetTweets() {
        TweetList tweetList = new TweetList();
        Tweet tweet1 = new NormalTweet("tweet1");
        Tweet tweet2 = new NormalTweet("tweet2");
        tweetList.add(tweet1);
        tweetList.add(tweet2);
        TweetList sortedTweetList = tweetList.sort();
        assertEquals(sortedTweetList, tweetList);

    }

    public void testHasTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweetList.add(tweet);
        assertTrue(tweetList.contains(tweet));
    }

    public void testRemoveTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweetList.add(tweet);
        tweetList.delete(tweet);
        assertFalse(tweetList.contains(tweet));
    }

    public void testGetCount() {
        TweetList tweetList = new TweetList();
        Tweet tweet1 = new NormalTweet("tweet1");
        Tweet tweet2 = new NormalTweet("tweet2");
        tweetList.add(tweet1);
        tweetList.add(tweet2);
        assertEquals(2, tweetList.count());
    }


}