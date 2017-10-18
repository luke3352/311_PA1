import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Luke Sternhagen on 10/17/2017.
 */
public class BinaryST_Tests {
    @Test
    public void addTest(){
        BinaryST bst = new BinaryST();
        bst.add("HELLO");
        assertTrue(bst.size() == 1);
    }

    @Test
    public void addTest2(){
        BinaryST bst = new BinaryST();
        bst.add("HELLO");
        bst.add("GOODBYE");
        bst.add("NOPE");
        bst.add("THINGS");
        bst.add("STUFF");
        assertTrue(bst.size() == 5);
    }

    @Test
    public void searchTestPositive1(){
        BinaryST bst = new BinaryST();
        bst.add("HELLO");
        assertTrue(bst.search("HELLO"));
    }
    @Test
    public void searchTestPositive2(){
        BinaryST bst = new BinaryST();
        bst.add("HELLO");
        bst.add("GOODBYE");
        bst.add("NOPE");
        bst.add("THINGS");
        bst.add("STUFF");
        assertTrue(bst.search("HELLO"));
        assertTrue(bst.search("GOODBYE"));
        assertTrue(bst.search("NOPE"));
        assertTrue(bst.search("THINGS"));
        assertTrue(bst.search("STUFF"));
    }
    @Test
    public void searchTestNegative1(){
        BinaryST bst = new BinaryST();
        bst.add("HELLO");
        bst.add("GOODBYE");
        bst.add("NOPE");
        bst.add("THINGS");
        bst.add("STUFF");
        assertFalse(bst.search("HELL"));
        assertFalse(bst.search("GOODBY"));
        assertFalse(bst.search("NOP"));
        assertFalse(bst.search("THING"));
        assertFalse(bst.search("STUF"));
    }
    @Test
    public void frequencyTestPostive1(){
        BinaryST bst = new BinaryST();
        bst.add("HELLO");
        bst.add("GOODBYE");
        bst.add("HELLO");
        bst.add("GOODBYE");
        bst.add("HELLO");
        bst.add("GOODBYE");
        bst.add("GOODBYE");
        bst.add("GOODBYE");
        bst.add("GOODBYE");
        assertTrue(bst.frequency("HELLO")==3);
        assertTrue(bst.frequency("GOODBYE")==6);
    }
    @Test
    public void frequencyTestNegative1(){
        BinaryST bst = new BinaryST();
        bst.add("HELLO");
        bst.add("GOODBYE");
        bst.add("HELLO");
        bst.add("GOODBYE");
        bst.add("HELLO");
        bst.add("GOODBYE");
        bst.add("GOODBYE");
        bst.add("GOODBYE");
        bst.add("GOODBYE");
        assertTrue(bst.frequency("Nope")==0);

    }
    @Test
    public void distinctSizesPositive(){
        BinaryST bst = new BinaryST();
        bst.add("HELLO");
        bst.add("GOODBYE");
        bst.add("NOPE");
        bst.add("THINGS");
        bst.add("STUFF");
        bst.add("HELLO");
        bst.add("GOODBYE");
        bst.add("NOPE");
        bst.add("THINGS");
        bst.add("STUFF");
        bst.add("HELLO");
        bst.add("GOODBYE");
        bst.add("NOPE");
        bst.add("THINGS");
        bst.add("STUFF");
        assertTrue(bst.distinctSize()==5);
    }
    @Test
    public void distinctSizesPositive2(){
        BinaryST bst = new BinaryST();
        bst.add("HELLO");
        bst.add("HELLO");
        bst.add("HELLO");
        bst.add("HELLO");
        bst.add("HELLO");
        bst.add("HELLO");
        assertTrue(bst.distinctSize()==1);
    }
    @Test
    public void constructorMethod(){
        String[] s = new String[5];
        s[0] = "HELLO";
        s[1] = "GOODBYE";
        s[2] = "NOPE";
        s[3] = "THINGS";
        s[4] = "STUFF";
        BinaryST bst = new BinaryST(s);

        assertTrue(bst.search("HELLO"));
        assertTrue(bst.search("GOODBYE"));
        assertTrue(bst.search("NOPE"));
        assertTrue(bst.search("THINGS"));
        assertTrue(bst.search("STUFF"));
    }
    @Test
    public void removePositive(){
        BinaryST bst = new BinaryST();

        bst.add("HELLO");
        bst.add("GOODBYE");
        bst.add("NOPE");
        bst.add("THINGS");
        bst.add("STUFF");
        bst.remove("HELLO");
        assertFalse(bst.search("HELLO"));
    }
    /*
    @Test
    public void compareToDemo(){
        BinaryST bst = new BinaryST();
        System.out.println("hello and nope: "+bst.compareTo("HELLO", "NOPE"));
        System.out.println("nope and hello: "+bst.compareTo("NOPE", "HELLO"));
        System.out.println("hi and hi: "+bst.compareTo("HI", "HI"));
        System.out.println("alpha and zeta: "+bst.compareTo("ALPHA", "ZETA"));
        assertTrue(bst.size() == 5);
    }*/
}
