/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.towson.cosc237;

/**
 *
 * @author skaza
 */
public interface LinkedListGeneric<T> {
    /**
     * determine whether the list is empty. 
     * 5 points.
     * @return true if empty, false if not
     */
    public boolean isEmptyList();       
    
    /**
     * initialize the list to an empty state. the first pointer should point to null
     * 2 points.
     */
    public void initializeList(); 
    
    /**
     * print the data contained in each node of the list
     * 10 points.
     */
    public void print();                 
    
    /**
    * 
    * 10 points
    * @return the number of nodes
    * 
    */
    public int length();                 
    
    /**
     * return the first node, just return don't delete it
     * 5 points
     * @return LinkedListNode
     */
    public T front();                    
    
    /**
     * Return if the item is in the list. 
     * 10 points
     * @param searchItem
     * @return 
     */
    public boolean search(T searchItem); 
    
    /**
     * insert newItem as the first item in the list. 
     * 5 points
     * @param newItem 
     */
    public void insertFirst(T newItem);  
    
    /**
     * delete deleteItem from the list. 
     * 10 points.
     * @param deleteItem 
     */
    public void deleteNode(T deleteItem);
}
