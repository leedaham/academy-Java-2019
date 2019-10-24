package sub4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sub1.Apple;

public class CollectionTest {
	public static void main(String[] args) {
		
		//리스트-맵 구조 생성 및 데이터 저장
		List<Map<Integer, Apple>> list = new ArrayList<>();
		
		Map<Integer, Apple> m1 = new HashMap<>();
		m1.put(101, new Apple("한국", 3000));
		m1.put(102, new Apple("중국", 2000));
		m1.put(103, new Apple("일본", 1000));
		
		Map<Integer, Apple> m2 = new HashMap<>();
		m2.put(201, new Apple("미국", 3000));
		m2.put(202, new Apple("영국", 2500));
		m2.put(203, new Apple("호주", 2000));
		
		Map<Integer, Apple> m3 = new HashMap<>();
		m3.put(301, new Apple("대만", 3000));
		m3.put(302, new Apple("태국", 2500));
		m3.put(303, new Apple("배트남", 2000));
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		//한국 사과 info 출력
		Map<Integer, Apple> mp1 = list.get(0);
		Apple apple = mp1.get(101);
		apple.info();
		
		//호주 사과 info 출력
		list.get(1).get(203).info();
		
		//태국 사과 info 출력
		list.get(2).get(302).info();
	}
}
