package org.example;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Multiset<String> multiset = HashMultiset.create();
        multiset.add("Pomme");
        multiset.add("Carotte");
        multiset.add("Patate");
        multiset.add("Pomme");
        multiset.add("Carotte", 50);
        System.out.println(multiset);
    }
}
