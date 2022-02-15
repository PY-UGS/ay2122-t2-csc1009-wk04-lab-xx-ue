
package com.company;

import java.io.*;
import java.lang.*;
import java.util.*;
public class StackOfIntegers {

    private static int size=0;
    int capacity=16;
    private int[] elements= new int[capacity];

    public boolean empty(){
        if (size!=0)
            return false;
        else
            return true;
    }
    public int peek(){
        int top=elements[size];
        return top;
    }
    public void push(int value){
        elements[size]=value;
        size=size+1;
    }
    public int pop(){
        int top=elements[size-1];
        int[] temp= new int[capacity];
        for (int i=0;i<size;i++){
            temp[i]=elements[i];
        }
        elements=temp;
        size=size-1;
        return top;
    }
    public int getSize(){

        return size;
}}
