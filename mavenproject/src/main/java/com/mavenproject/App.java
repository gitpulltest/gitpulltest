package com.mavenproject;

import java.util.ArrayList;
import java.util.List;


public class App {

    int a = 1;
    static int b = 1;
    
    public static void main(final String[] args) {
        int i = 1;
        int j = 1;
        int jk = 1;
        b = b = 5;
        System.out.println( "Hello World!" );
        if ( true ){
            System.out.println();
        }
        if (false){
            return;
        }
        List l = new ArrayList();
        l.removeAll(l);
    }

    @Override
    public int hashCode(){
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals( Object obj ){
        final App other = (App)obj;
        return true;
    }

    
    
}
