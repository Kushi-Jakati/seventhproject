package edu.guilford;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class MainDocList {
    public static void main(String[] args) {
        // Instantiate an arraylist
        ArrayList<Doctor> adoctors = new ArrayList<Doctor>();
        // Instantiate an LinkedLIst
        LinkedList<Doctor> ldoctors = new LinkedList<Doctor>();
        long startTime;
        long endTime;
        long duration;

        // declaring a constant for the number of elements in a list
        final int MAX = 10;

        // Loops that adds a MAX random doctors to the arraylist and time sit
        for (int i = 0; i < MAX; i++) {
            adoctors.add(new Doctor());
        }
        // Loops that adds a MAX random doctors to the linkedlist and time sit
        for (int i = 0; i < MAX; i++) {
            ldoctors.add(new Doctor());
        }

        // Sort list through Collections.sort. Sort is a static method of the Collections and it
        // takes a list as an argument and sorts it in ascending order using the compareTo method
        // of the Doctor class
        // time it
        startTime = System.nanoTime();
        Collections.sort(adoctors);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Time to sort the ArrayList: " + String.format("%.2f", duration / 1.e6) + " milliseconds");
        
        //time it
        startTime = System.nanoTime();
        Collections.sort(ldoctors);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Time to sort the LinkedList: " + String.format("%.2f", duration / 1.e6) + " milliseconds");
        // shuffle the list through Collections.shuffle
        //time it
        startTime = System.nanoTime();
        Collections.shuffle(adoctors);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Time to shuffle the ArrayList: " + String.format("%.2f", duration / 1.e6) + " milliseconds");

        //time it
        startTime = System.nanoTime();
        Collections.shuffle(ldoctors);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Time to shuffle the LinkedList: " + String.format("%.2f", duration / 1.e6) + " milliseconds");

        // loop that gets random element from the list a million times and times it
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            adoctors.get((int) (Math.random() * adoctors.size()));
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Time to get a random element from the ArrayList a million times: "
                + String.format("%.2f", duration / 1.e6) + " milliseconds");

        // loop that gets random element from the list a million times and times it
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            ldoctors.get((int) (Math.random() * ldoctors.size()));
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("Time to get a random element from the LinkedList a million times: "
                + String.format("%.2f", duration / 1.e6) + " milliseconds");
        

        // // loop that appends an element to the list a million times and times it
        // startTime = System.nanoTime();
        // for (int i = 0; i < 1000000; i++) {
        //     adoctors.add(new Doctor());
        // }
        // endTime = System.nanoTime();
        // duration = (endTime - startTime);
        // System.out.println("Time to append an element to the ArrayList a million times: "
        //         + String.format("%.2f", duration / 1.e6) + " milliseconds");

        // // loop that appends an random element to the list a million times  and times it in milliseconds
        // startTime = System.nanoTime();
        // for (int i = 0; i < 1000000; i++) {
        //     ldoctors.add(new Doctor());
        // }
        // endTime = System.nanoTime();
        // duration = (endTime - startTime);
        // System.out.println("Time to append a random element to the ArrayList a million times: "
        //         + String.format("%.2f", duration / 1.e6) + " milliseconds");

        // // loop that adds an random element to the list a million times and times it
        // startTime = System.nanoTime();
        // adoctors.add((int) (Math.random() * adoctors.size()), new Doctor());
        // endTime = System.nanoTime();
        // duration = (endTime - startTime);
        // System.out.println("Time to add a random element to the ArrayList a million times: "
        //         + String.format("%.2f", duration / 1.e6) + " milliseconds");

        // // loop that adds an element to the list a million times and times it
        // startTime = System.nanoTime();
        // ldoctors.add((int) (Math.random() * adoctors.size()), new Doctor());
        // endTime = System.nanoTime();
        // duration = (endTime - startTime);
        // System.out.println("Time to add an element to the LinkedList a million times: "
        //         + String.format("%.2f", duration / 1.e6) + " milliseconds");

        // // loop that sorts the list  and times it
        // startTime = System.nanoTime();
        // Collections.sort(adoctors);
        // endTime = System.nanoTime();
        // duration = (endTime - startTime);
        // System.out.println("Time to sort the Arraylist a million times: " + String.format("%.2f", duration / 1.e6)
        //         + " milliseconds");

        // //print out the list
        // for (Doctor doctor : adoctors) {
        //     System.out.println(doctor);
        // }

        // // loop that sorts the list  and times it
        // startTime = System.nanoTime();
        // Collections.sort(ldoctors);
        // endTime = System.nanoTime();
        // duration = (endTime - startTime);
        // System.out.println("Time to sort the Linkedlist a million times: " + String.format("%.2f", duration / 1.e6)
        //         + " milliseconds");


        // // loop that shuffles the list and times it
        // startTime = System.nanoTime();
        // Collections.shuffle(adoctors);
        // endTime = System.nanoTime();
        // duration = (endTime - startTime);
        // System.out.println("Time to shuffle the Arraylist a million times: " + String.format("%.2f", duration / 1.e6)
        //         + " milliseconds");
        
        // // loop that shuffles the list and times it
        // startTime = System.nanoTime();
        // Collections.shuffle(ldoctors);
        // endTime = System.nanoTime();
        // duration = (endTime - startTime);
        // System.out.println("Time to shuffle the Linkedlist a million times: " + String.format("%.2f", duration / 1.e6)
        //         + " milliseconds");

        //loop that sequentially gets an element from the list a million times and
        //times it
        // startTime = System.nanoTime();
        // for (int i = 0; i < 1000000; i++) {
        //     adoctors.get(i % adoctors.size());
        // }
        // endTime = System.nanoTime();
        // duration = (endTime - startTime);
        // System.out.println("Time to sequentially get an element from the Arraylist a million times: "
        //         + String.format("%.2f", duration / 1.e6) + " milliseconds");
        

        // // loop that sequentially gets an element from the list a million times and
        // // times it
        // //% is the modulo operator and it returns the remainder of the division of the first operand by the second and in  this case
        // //it returns the remainder of i divided by the size of the list
        // startTime = System.nanoTime();
        // for (int i = 0; i < 1000000; i++) {
        //     ldoctors.get(i % ldoctors.size());
        // }
        // endTime = System.nanoTime();
        // duration = (endTime - startTime);
        // System.out.println("Time to sequentially get an element from the Linkedlist a million times: "
        //         + String.format("%.2f", duration / 1.e6) + " milliseconds");


        // Once the program is working to your satisfaction, run it again for 5000 and
        // 10000 elements (and more if you want to collect more data).
        // In a separate document, build well-formatted tables of your results. It
        // should show the timing results for both lists and the five different
        // operations (add, sort, shuffle, random get, sequential get) for multiple runs
        // of the program using different numbers of list elements.
        // In that same document write a paragraph or two that a) summarize which
        // implementation appears to be better for each kind of operation; b) discusses
        // how those results are consistent with how the list is implemented.

    }
}
