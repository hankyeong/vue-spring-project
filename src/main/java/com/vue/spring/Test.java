package com.vue.spring;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {

		HashMap<String, Map<String, String>> map2 = new HashMap<String, Map<String, String>>();

		int count = 97;
//		int count = 0;
		
		for(int i=0; i<10; i++) {
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("evNo", "E202202151000"+i);
			map.put("cpnNo", "CP202202151000"+i);
			map2.put(String.valueOf((char)count++), map);
//			map2.put(String.valueOf(count++), map);
//			map.clear();
//			map.remove("evNo");
//			map.remove("cpnNo");
		}
		
		for (Entry<String, Map<String, String>> test : map2.entrySet()) {
			System.out.println("테스트 : " + test.getKey() + " / " + test.getValue());
		}
		// 2 ~ N
		System.out.println("\n\n\n테스트 : " + map2.get("0"));
		
	}

}
