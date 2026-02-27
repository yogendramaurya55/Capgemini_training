package com;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeHashMap {
	
	public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        HashMap<String , Integer> map1 = new HashMap<>();
        
        
        //when two or more thread try to access the map each one can take control(lock) only one segment of concruenthashmap where as in normal hashmap one thread locks the whole map

	}

}
