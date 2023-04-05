package algo_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

// HashMap information
public class Info {
	HashMap<String,String> map1 = new HashMap<String,String>();//HashMap생성
	HashMap<String,String> map2 = new HashMap<>();//new에서 타입 파라미터 생략가능
	HashMap<String,String> map3 = new HashMap<>(map1);//map1의 모든 값을 가진 HashMap생성
	HashMap<String,String> map4 = new HashMap<>(10);//초기 용량(capacity)지정
	HashMap<String,String> map5 = new HashMap<>(10, 0.7f);//초기 capacity,load factor지정
	HashMap<String,String> map6 = new HashMap<String,String>(){{//초기값 지정
	    put("a","b");
	}};
	
	HashMap<Integer,String> map = new HashMap<>();//new에서 타입 파라미터 생략가능
	/*
	 * map.put(1,"사과"); //값 추가 
	 * map.remove(1); //key값 1 제거 
	 * map.clear(); //모든 값 제거
	 */
	
	//entrySet().iterator()
	//Iterator<Entry<Integer, String>> entries = map.entrySet().iterator();
	//while(entries.hasNext()){
	//    Map.Entry<Integer, String> entry = entries.next();
	//    System.out.println("[Key]:" + entry.getKey() + " [Value]:" +  entry.getValue());
	//}
	//[Key]:1 [Value]:사과
	//[Key]:2 [Value]:바나나
	//[Key]:3 [Value]:포도
			
	//keySet().iterator()
	//Iterator<Integer> keys = map.keySet().iterator();
	//while(keys.hasNext()){
	//    int key = keys.next();
	//    System.out.println("[Key]:" + key + " [Value]:" +  map.get(key));
	//}
	//[Key]:1 [Value]:사과
	//[Key]:2 [Value]:바나나
	//[Key]:3 [Value]:포도
	
}
