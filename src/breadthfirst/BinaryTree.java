/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breadthfirst;
import hw5.*;
//import java.util.*;

public class BinaryTree
{
    Node root = null;
    //Queue queue = new LinkedList();
    Queue queue = new hw5.Queue();
    
    public Node getRoot()
    {   return root;    }
    
    public void setRoot(Node n)
    {   root = n;   }
    
    public boolean search(Node n)
    {
        Node cur = root;
        while (cur != null)
        {
            if(n.compareTo(cur) == 0)
                return true;
            else if(n.compareTo(cur) < 0)
		cur = cur.left;
            else
		cur = cur.right;
	}
	return false;	            
    }
    
    public void insert(Node n)
    {
        if (root == null)
        {
            root = n;
            return;
        }
        else
	{
        	Node cur = root;
               
       		while (true)
        	{
	            if(n.compareTo(cur) < 0)
		    {
			if (cur.left == null)
			{
				cur.left = n;
				return;
			}
        	        cur = cur.left;
		    }
	            else
		    {
	        	if (cur.right == null)
			{
				cur.right = n;
				return;
			}
        	        cur = cur.right;
		    }
		}
        }
   
    }
    
    public Node delete(Node n)
    {
        Node cur = root, parent = root;

        while (cur != null)
        {	
		//check if node is to the left
                if (n.compareTo(cur) < 0)
                {
                        parent = cur;
                        cur = cur.left;
                }
		//check if node is to the right
                else if (n.compareTo(cur) > 0)
                {
                        parent = cur;
                        cur = cur.right;
                }
		//break loop when node found
                else
                        break;
        }

	//check if node found - loop could end when cur == null
        if (cur != null)
        {
                //check if cur has 0 children
		if (cur.left == null && cur.right == null)
                    //make link from parent = null
		    if (parent.left == cur)
                            parent.left = null;
                    else
                            parent.right = null;
		//check if cur has 1 child on right
                else if(cur.left == null)
                {
		    //link proper parent link to child of cur
                    if (parent.left == cur)
                        parent.left = cur.right;
                    else
                        parent.right = cur.right;
		    //disconnect cur from tree
                    cur.right = null;
                }
		//check if cur has 1 child on left
                else if (cur.right == null)
                {
		    //link proper parent link to child of cur
                    if (parent.right == cur)
                        parent.right = cur.left;
                    else
                        parent.left = cur.left;
		    //disconnect cur from tree
                    cur.left = null;
                }
		//cur has 2 children
                else
                {
		    //parent will hold position where node will be copied
                    parent = cur;
		    //move cur to left child
                    cur = cur.left;
                    
		    //move cur down right branch of left subtree
                    while (cur.right != null)
                        cur = cur.right;
                    
		    //copy content from node to node
                    parent.num = cur.num;
		    //call delete again to delete the node that was copied
                    delete (cur);
                }
                        

        }
        return cur;
    }
    
    public BinaryTree clone(Node root,BinaryTree clone){
        if(root != null){
        clone.insert(new Node(root.getNum()));
        clone(root.getLeft(),clone);
        clone(root.getRight(),clone);
        }
        return clone;  
    }
    
    public boolean equals(Node root1,Node root2){
        if(root1 != null && root2 != null ){
            if(root1.getNum() == root2.getNum()){
                if(!equals(root1.getLeft(),root2.getLeft())){
                    return false;
                }
                if(!equals(root1.getRight(),root2.getRight())){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        else if(root1 == null ^ root2 == null ){
            return false;
        }
        return true;
    }
    
    public void breadth(){
        queue.enqueue(new qNode(this.getRoot()));
        while(queue.getHead() != null){
            Node cur = queue.dequeue().getNode();
            System.out.println(cur.getNum());
            if(cur.getLeft() != null){
                queue.enqueue(new qNode(cur.getLeft()));
            }
            if(cur.getRight() != null){
                queue.enqueue(new qNode(cur.getRight()));
            }
                
        }
    }

}