package squadMay21.stats;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mode {
	
	
	
	public static int[] getMode(int[] arr) {
		
		HashMap<Integer, Integer> values = new HashMap<Integer, Integer>();
		
		
		for(int i=0; i<arr.length; i++) {
			if(values.containsKey(arr[i])) {
				int val = values.get((Integer)arr[i]);
				values.put( (Integer)arr[i], (Integer)(val + 1));
			} else {
				values.put( (Integer)arr[i], (Integer)1);
			}
		}
		
		List<Integer> maxVals = new ArrayList<>();
		
		int max = Collections.max(values.values());
		
		for (Map.Entry<Integer, Integer> mapElement : values.entrySet()) {
			Integer v = (Integer) mapElement.getValue();
			
			if(v == max) {
				Integer vv = (Integer) mapElement.getKey();
				maxVals.add(vv);
			} 
   
        } 
		
		int[] modeVals = new int[maxVals.size()];
		for(int i=0; i<maxVals.size(); i++) {
			modeVals[i] = maxVals.get(i);
		}
		
		// for(int i : modeVals) { System.out.println(i); }
		
		return modeVals;
	}
	
	public static void printMode(int[] arr) {
		int[] m = getMode(arr);
		for(int i=0; i<m.length; i++) {
			System.out.print(m[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
	
	
	
}
