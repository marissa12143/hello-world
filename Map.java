package edu.umsl.maps;
import java.util.HashMap;
public class Map {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>(); //hashmap w/ an integer key and string value
		map.put(60606, "Chicago");
		map.put(63121, "Saint louis");
		map.put(10001, "NYC");
		
		//pulls values out of the map:
		for(java.util.Map.Entry<Integer, String> map1 : map.entrySet()) {
			System.out.println(map1.getKey() + " " + map1.getValue());
		}
	}
}