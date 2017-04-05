/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breadthfirst;

/**
 *
 * @author Eddie
 */
public class BreadthFirst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinaryTree tree = new BinaryTree();
        tree.insert(new Node(5));
        tree.insert(new Node(15));
        tree.insert(new Node(7));
        tree.insert(new Node(657));
        tree.insert(new Node(1));
        tree.insert(new Node(3));
        tree.insert(new Node(342));
        tree.insert(new Node(2));
        tree.insert(new Node(33));
        
        tree.breadth();
    }
    
}
