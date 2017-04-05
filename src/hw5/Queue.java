/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;

/**
 *
 * @author Eddie
 */
public class Queue {
    private qNode head;
    private qNode tail;

    public void Queue(){
        head = null;
        tail = null;
    }
    public void enqueue(qNode n){
        if(head == null){
            head = n;
            tail = n;
            return;
        }
        tail.setNext(n);
        tail = n;
    }
    
    public qNode dequeue(){
        if(head == null){
            return null;
        }
        qNode tmp = head;
        head = head.getNext();
        return tmp;
    }
    
    public qNode getHead() {
        return head;
    }

    public void setHead(qNode head) {
        this.head = head;
    }

    public qNode getTail() {
        return tail;
    }

    public void setTail(qNode tail) {
        this.tail = tail;
    }
    
    
}
