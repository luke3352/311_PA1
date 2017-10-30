import org.junit.Assert;
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
        Assert.assertTrue(bst.size() == 1);
    }

    @Test
    public void addTest2(){
        BinaryST bst = new BinaryST();
        bst.add("HELLO");
        bst.add("GOODBYE");
        bst.add("NOPE");
        bst.add("THINGS");
        bst.add("STUFF");
        Assert.assertTrue(bst.size() == 5);
    }

    @Test
    public void searchTestPositive1(){
        BinaryST bst = new BinaryST();
        bst.add("HELLO");
        Assert.assertTrue(bst.search("HELLO"));
    }
    @Test
    public void searchTestPositive2(){
        BinaryST bst = new BinaryST();
        bst.add("HELLO");
        bst.add("GOODBYE");
        bst.add("NOPE");
        bst.add("THINGS");
        bst.add("STUFF");
        Assert.assertTrue(bst.search("HELLO"));
        Assert.assertTrue(bst.search("GOODBYE"));
        Assert.assertTrue(bst.search("NOPE"));
        Assert.assertTrue(bst.search("THINGS"));
        Assert.assertTrue(bst.search("STUFF"));
    }
    @Test
    public void searchTestNegative1(){
        BinaryST bst = new BinaryST();
        bst.add("HELLO");
        bst.add("GOODBYE");
        bst.add("NOPE");
        bst.add("THINGS");
        bst.add("STUFF");
        Assert.assertFalse(bst.search("HELL"));
        Assert.assertFalse(bst.search("GOODBY"));
        Assert.assertFalse(bst.search("NOP"));
        Assert.assertFalse(bst.search("THING"));
        Assert.assertFalse(bst.search("STUF"));
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
        Assert.assertTrue(bst.frequency("HELLO")==3);
        Assert.assertTrue(bst.frequency("GOODBYE")==6);
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
        Assert.assertTrue(bst.frequency("Nope")==0);

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
        Assert.assertTrue(bst.distinctSize()==5);
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
        Assert.assertTrue(bst.distinctSize()==1);
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

        Assert.assertTrue(bst.search("HELLO"));
        Assert.assertTrue(bst.search("GOODBYE"));
        Assert.assertTrue(bst.search("NOPE"));
        Assert.assertTrue(bst.search("THINGS"));
        Assert.assertTrue(bst.search("STUFF"));
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
        Assert.assertFalse(bst.search("HELLO"));
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

        Assert.assertFalse(bst.search("HELLO"));
        Assert.assertFalse(bst.search("GOODBYE"));
        Assert.assertFalse(bst.search("NOPE"));
        Assert.assertFalse(bst.search("THINGS"));
        Assert.assertFalse(bst.search("STUFF"));
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
        Assert.assertTrue(bst.search("NOPE"));
        bst.remove("NOPE");
        bst.remove("NOPE");
        bst.remove("NOPE");
        Assert.assertFalse(bst.search("NOPE"));
    }

    @Test
    public void removeNegative(){
        BinaryST bst = new BinaryST();

        bst.remove("HELLO");
        bst.remove("GOODBYE");
        bst.remove("NOPE");
        bst.remove("THINGS");
        bst.remove("STUFF");

        Assert.assertFalse(bst.search("HELLO"));
        Assert.assertFalse(bst.search("GOODBYE"));
        Assert.assertFalse(bst.search("NOPE"));
        Assert.assertFalse(bst.search("THINGS"));
        Assert.assertFalse(bst.search("STUFF"));
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
            Assert.assertTrue(s[i].equals(array[i]));
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
            Assert.assertTrue(s[i].equals(array[i]));
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
            Assert.assertTrue(s[i].equals(array[i]));
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
            Assert.assertTrue(s[i].equals(array[i]));
        }
    }
    @Test
    public void height(){
        BinaryST bst = new BinaryST();
        bst.add("a");
        Assert.assertTrue(bst.height() == 1);
    }
    @Test
    public void height2(){
        BinaryST bst = new BinaryST();
        bst.add("a");
        bst.add("b");
        bst.add("c");
        bst.add("d");
        bst.add("e");
        bst.add("f");
        Assert.assertTrue(bst.height() == 6);
    }
    @Test
    public void height3(){
        BinaryST bst = new BinaryST();
        bst.add("a");
        bst.add("b");
        bst.add("c");
        bst.add("d");
        bst.add("e");
        bst.add("f");
        bst.remove("f");
        assertTrue(bst.height() == 5);
    }
    @Test
    public void height4(){
        BinaryST bst = new BinaryST();
        bst.add("a");
        bst.add("b");
        bst.add("c");
        bst.add("d");
        bst.add("e");
        bst.add("f");
        assertTrue(bst.height() == 6);
        bst.remove("f");
        assertTrue(bst.height() == 5);
        bst.remove("e");
        assertTrue(bst.height() == 4);
        bst.remove("d");
        assertTrue(bst.height() == 3);
        bst.remove("c");
        assertTrue(bst.height() == 2);
        bst.remove("b");
        assertTrue(bst.height() == 1);
        bst.remove("a");
        assertTrue(bst.height() == 0);
    }

    @Test
    public void height5(){
        BinaryST bst = new BinaryST();
        bst.add("c");
        bst.add("a");
        bst.add("b");
        bst.add("d");
        bst.add("e");
        bst.add("f");
        assertTrue(bst.height() == 4);
    }

    @Test
    public void height6(){
        BinaryST bst = new BinaryST();
        bst.add("c");
        bst.add("a");
        bst.add("b");
        bst.add("d");
        bst.add("e");
        bst.add("f");
        bst.remove("f");
        assertTrue(bst.height() == 3);
    }

    @Test
    public void height7(){
        BinaryST bst = new BinaryST();
        bst.add("c");
        bst.add("a");
        bst.add("b");
        bst.add("d");
        bst.add("e");
        bst.add("f");
        bst.remove("f");
        bst.remove("e");
        assertTrue(bst.height() == 3);
    }

    @Test
    public void height8(){
        BinaryST bst = new BinaryST();
        bst.add("c");
        bst.add("c");
        bst.add("c");
        bst.add("c");
        bst.add("c");
        bst.add("c");
        bst.add("a");
        assertTrue(bst.height() == 2);
    }

    @Test
    public void rankOf(){
        BinaryST bst = new BinaryST();
        bst.add("c");
        bst.add("a");
        bst.add("b");
        bst.add("d");
        bst.add("e");
        bst.add("f");
        assertTrue(bst.rankOf("a") == 0);
    }
    @Test
    public void rankOf2(){
        BinaryST bst = new BinaryST();
        bst.add("c");
        bst.add("a");
        bst.add("b");
        bst.add("d");
        bst.add("e");
        bst.add("f");
        assertTrue(bst.rankOf("c") == 2);
    }
    @Test
    public void rankOf3(){
        BinaryST bst = new BinaryST();
        bst.add("c");
        bst.add("a");
        bst.add("b");
        bst.add("d");
        bst.add("e");
        bst.add("f");
        assertTrue(bst.rankOf("f") == 5);
    }
    @Test
    public void rankOf4(){
        BinaryST bst = new BinaryST();
        bst.add("c");
        bst.add("a");
        bst.add("b");
        bst.add("d");
        bst.add("e");
        bst.add("f");
        bst.remove("e");
        bst.remove("d");

        assertTrue(bst.rankOf("f") == 3);
    }
    public void compareToDemo(){
        BinaryST bst = new BinaryST();
        System.out.println("hello and nope: "+bst.compareTo("HELLO", "NOPE"));
        System.out.println("nope and hello: "+bst.compareTo("NOPE", "HELLO"));
        System.out.println("hi and hi: "+bst.compareTo("HI", "HI"));
        System.out.println("alpha and zeta: "+bst.compareTo("ALPHA", "ZETA"));
        Assert.assertTrue(bst.size() == 5);
    }

}
