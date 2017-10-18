// LEAVE THIS FILE IN THE DEFAULT PACKAGE
//  (i.e., DO NOT add 'package cs311.pa1;' or similar)

// DO NOT MODIFY THE EXISTING METHOD SIGNATURES
//  (you may, however, add additional methods and fields)

// DO NOT INCLUDE LIBRARIES OUTSIDE OF THE JAVA STANDARD LIBRARY
//  (i.e., you may include java.util.ArrayList etc. here, but not junit, apache commons, google guava, etc.)

//Runtime of all you methods must me O(h) (except inOrder and preOrder), where h is the
//height of the tree.

import java.util.ArrayList;
import java.util.HashMap;

public class BinaryST
{
    class Node {
        String key;
        Node left, right;
        int frequency;
        public Node(String item) {
            key = item;
            left = right = null;
        }
    }

    Node root;
    int size;
    int distinctStrings;
    int maxHeight;
    //BinaryST() Creates an empty Binary Search Tree.

    public BinaryST()
    {
        root = null;
    }

    /**
     * Creates a Binary Search Tree obtained by adding the elements in the
     order they appear in the array s. You must not balance the tree. If a string appears ` times in
     the array, your BST must store this information.
     */
    public BinaryST(String[] s)
    {
        root = null;
        for(String str : s){
            add(str);
        }
    }

    /**
     *Returns the number of distinct strings stored in the Tree. If you have added
     *“AB”, “CD”, “AB”, then this method returns 2.
     */
    public int distinctSize()
    {
        return distinctStrings;
    }
    /**
     *size() Returns the total number of elements stored in tree. If you have added “AB”, “CD”, “AB”,
     *then this method returns 3.
     */
    public int size()
    {
        return distinctStrings;
    }
    /**
     *height() returns the current height of the tree. Height of a tree with a single node is one. Height
     *of an empty tree is zero
     */
    public int height()
    {
        return maxHeight;
    }
    /**
     *add(String s). Adds the string s to the BST. Even if s already appears in the tree, it must
     *add s.
     */
    public void add(String s)
    {
        addRec(root, s);
        size++;
    }

    public Node addRec(Node node, String key) {

        /* If the tree is empty, return a new node */
        if (node == null) {
            if(size == 0){
                root = new Node(key);
                root.frequency++;
            }
            else{
                node = new Node(key);
                node.frequency++;
            }
            distinctStrings++;
            return node;
        }

        /* Otherwise, recur down the tree */
        if (key.compareTo(node.key) < 0)
            node.left = addRec(node.left, key);
        else if(key.compareTo(node.key) > 0){
            node.right = addRec(node.right, key);
        }
        else{
            node.frequency++;
        }

        /* return the (unchanged) node pointer */
        return node;
    }
    public int compareTo(String s, String s2){
        return s.compareTo(s2);
    }

    /**
     *search(String s) Returns true is s appears in the tree; otherwise returns false.
     */
    public boolean search(String s)
    {
        Node node = root;

        while(node.key != s){

            if(node != null) {

                //go to left tree
                if(node.key.compareTo(s) > 0){
                    node = node.left;
                }//else go to right tree
                else {
                    node = node.right;
                }

                //not found
                if(node == null){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     *frequency(String s) Returns the number of times s appears in the tree.
     */
    public int frequency(String s)
    {
        Node node = root;

        while(!node.key.equals(s)){

            if(node != null) {

                //go to left tree
                if(node.key.compareTo(s) > 0){
                    node = node.left;
                }//else go to right tree
                else {
                    node = node.right;
                }

                //not found
                if(node == null){
                    return 0;
                }
            }
        }
        return node.frequency;
    }

    /**
     *remove(String s) If s appears in the tree, then removes the string s from the tree and returns
     *true. If s does not appear in the tree, then returns false. If s appears, more than once then
     *remove only one occurrence.
     */
    public boolean remove(String s)
    {
        boolean isRemoved = false;

        return isRemoved;
    }
    /**
     *inOrder() Returns an array of Strings obtained by doing an in-order traversal of the tree.
     */
    public String[] inOrder()
    {   ArrayList<String> list = new ArrayList<>();
        list = inOrderTraversal(root,list);

        String[] s = new String[height()];
        for(int i =0; i<list.size(); i++){
            s[i] = list.get(i);
        }
        return s;
    }
    /**
     *Created by Luke
     * Returns an arraylist<String> inOrder Traversal
     */
    public ArrayList<String> inOrderTraversal(Node node, ArrayList<String> list)
    {
        if(node.left != null){
            inOrderTraversal(node.left, list);
        }
        list.add(node.key);
        if(node.right != null){
            inOrderTraversal(node.right, list);
        }
        return list;
    }
    /**
     *preOrder() Returns an array of Strings obtained by doing an pre-order traversal of the tree.
     */
    public String[] preOrder()
    {
        ArrayList<String> list = new ArrayList<>();
        list = preOrderTraversal(root,list);

        String[] s = new String[height()];
        for(int i =0; i<list.size(); i++){
            s[i] = list.get(i);
        }
        return s;
    }
    /**
     * Created by Luke
     * Returns an arraylist<String> preOrder Traversal
     */
    public ArrayList<String> preOrderTraversal(Node node, ArrayList<String> list)
    {
        list.add(node.key);
        if(node.left != null){
            preOrderTraversal(node.left, list);
        }
        if(node.right != null){
            preOrderTraversal(node.right, list);
        }
        return list;
    }
    /**
     *rankOf(String s) Returns number of strings that are smaller than s.
     */
    public int rankOf(String s)
    {
        int rankOf = 0;

        return rankOf;
    }
}