package com.curso.java.colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DiferenciaTiempoColecciones {

	public static void main(String[] args) {
		int [] numElementsArray = {100_000,1_000_000,10_000_000};
        for (int numElements : numElementsArray) {
        	System.out.println("============= Probando con " + numElements);
	        // ArrayList
	        List<Integer> arrayList = new ArrayList<>();
	        long startTime = System.nanoTime();
	        for (int i = 0; i < numElements; i++) {
	            arrayList.add(i);
	        }
	        long endTime = System.nanoTime();
	        System.out.println("Time taken to insert in ArrayList: " + (endTime - startTime) / 1e6 + " ms");
	        arrayList.clear();
	        arrayList= null;
	        // LinkedList
	        List<Integer> linkedList = new LinkedList<>();
	        startTime = System.nanoTime();
	        for (int i = 0; i < numElements; i++) {
	            linkedList.add(i);
	        }
	        endTime = System.nanoTime();
	        System.out.println("Time taken to insert in LinkedList: " + (endTime - startTime) / 1e6 + " ms");
	        linkedList.clear();
	        linkedList= null;
	        // HashSet
	        Set<Integer> hashSet = new HashSet<>();
	        startTime = System.nanoTime();
	        for (int i = 0; i < numElements; i++) {
	            hashSet.add(i);
	        }
	        endTime = System.nanoTime();
	        System.out.println("Time taken to insert in HashSet: " + (endTime - startTime) / 1e6 + " ms");
	        hashSet.clear();
	        hashSet=null;
	        // TreeSet
	        Set<Integer> treeSet = new TreeSet<>();
	        startTime = System.nanoTime();
	        for (int i = 0; i < numElements; i++) {
	            treeSet.add(i);
	        }
	        endTime = System.nanoTime();
	        System.out.println("Time taken to insert in TreeSet: " + (endTime - startTime) / 1e6 + " ms");
	        treeSet.clear();
	        treeSet=null;
        }
	}

}
