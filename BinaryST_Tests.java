import org.junit.Test;

import java.lang.reflect.Array;

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
    @Test
    public void removePositive2(){
        BinaryST bst = new BinaryST();

        bst.add("HELLO");
        bst.add("GOODBYE");
        bst.add("NOPE");
        bst.add("THINGS");
        bst.add("STUFF");
        bst.remove("HELLO");
        bst.remove("GOODBYE");
        bst.remove("NOPE");
        bst.remove("THINGS");
        bst.remove("STUFF");

        assertFalse(bst.search("HELLO"));
        assertFalse(bst.search("GOODBYE"));
        assertFalse(bst.search("NOPE"));
        assertFalse(bst.search("THINGS"));
        assertFalse(bst.search("STUFF"));
    }
    @Test
    public void removePositive3(){
        BinaryST bst = new BinaryST();

        bst.add("HELLO");
        bst.add("GOODBYE");
        bst.add("NOPE");
        bst.add("NOPE");
        bst.add("NOPE");
        bst.add("NOPE");
        bst.remove("NOPE");
        assertTrue(bst.search("NOPE"));
        bst.remove("NOPE");
        bst.remove("NOPE");
        bst.remove("NOPE");
        assertFalse(bst.search("NOPE"));

    }

    @Test
    public void removeNegative(){
        BinaryST bst = new BinaryST();

        bst.remove("HELLO");
        bst.remove("GOODBYE");
        bst.remove("NOPE");
        bst.remove("THINGS");
        bst.remove("STUFF");

        assertFalse(bst.search("HELLO"));
        assertFalse(bst.search("GOODBYE"));
        assertFalse(bst.search("NOPE"));
        assertFalse(bst.search("THINGS"));
        assertFalse(bst.search("STUFF"));
    }

    @Test
    public void inOrderTraversalPositive2(){
        String[] array = {"a","b","c","d","e"};
        BinaryST bst = new BinaryST();

        bst.add("b");
        bst.add("a");
        bst.add("c");
        bst.add("d");
        bst.add("e");

        String[] s = bst.inOrder();
        for(int i =0; i<s.length; i++){
            assertTrue(s[i].equals(array[i]));
        }
    }
    @Test
    public void inOrderTraversalPositive3(){
        String[] array = {"a","b","c","d","e","e","e"};
        BinaryST bst = new BinaryST();

        bst.add("b");
        bst.add("a");
        bst.add("c");
        bst.add("d");
        bst.add("e");
        bst.add("e");
        bst.add("e");

        String[] s = bst.inOrder();
        for(int i =0; i<s.length; i++){
            assertTrue(s[i].equals(array[i]));
        }
    }
    @Test
    public void preOrderTraversalPositive(){
        String[] array = {"b","a","c","d","e"};
        BinaryST bst = new BinaryST();

        bst.add("b");
        bst.add("a");
        bst.add("c");
        bst.add("d");
        bst.add("e");

        String[] s = bst.preOrder();
        for(int i =0; i<s.length; i++){
            assertTrue(s[i].equals(array[i]));
        }
    }
    @Test
    public void preOrderTraversalPositive2(){
        String[] array = {"b","a","c","d","e","e","e"};
        BinaryST bst = new BinaryST();

        bst.add("b");
        bst.add("a");
        bst.add("c");
        bst.add("d");
        bst.add("e");
        bst.add("e");
        bst.add("e");

        String[] s = bst.preOrder();
        for(int i =0; i<s.length; i++){
            assertTrue(s[i].equals(array[i]));
        }
    }
    @Test
    public void compareToDemo(){
        BinaryST bst = new BinaryST();
        System.out.println("hello and nope: "+bst.compareTo("HELLO", "NOPE"));
        System.out.println("nope and hello: "+bst.compareTo("NOPE", "HELLO"));
        System.out.println("hi and hi: "+bst.compareTo("HI", "HI"));
        System.out.println("alpha and zeta: "+bst.compareTo("ALPHA", "ZETA"));
        assertTrue(bst.size() == 5);
    }
}
