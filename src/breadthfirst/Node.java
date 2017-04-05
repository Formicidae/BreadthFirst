/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breadthfirst;

public class Node implements Comparable<Node>
{
    int num;
    Node left = null;
    Node right = null;
    
    Node(int n)
    { num = n;      }
    
    public int getNum()
    { return num;   }
    
    public void setNum(int n)
    {  num = n;  }

    public Node getLeft()
    { return left;  }
    
    public void setLeft(Node n)
    {  left = n;    }
    
    public Node getRight()
    { return right;  }
    
    public void setRight(Node n)
    {  right = n;    }
    
    @Override
    public int compareTo(Node n)
    {
        return this.num - n.num;
    }
    
    
}