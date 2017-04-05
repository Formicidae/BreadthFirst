/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;
import breadthfirst.Node;

/**
 *
 * @author Eddie
 */
public class qNode {
    private Node n;
    private qNode next;

    public qNode(Node n){
        this.n = n;
    }
    
    public Node getNode() {
        return n;
    }

    public void setNode(Node n) {
        this.n = n;
    }

    public qNode getNext() {
        return next;
    }

    public void setNext(qNode next) {
        this.next = next;
    }
    
}
