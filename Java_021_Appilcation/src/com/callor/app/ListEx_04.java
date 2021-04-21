package com.callor.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_04 {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();

		for (int i = 0; i < 10; i++) {
			intList.add(rnd.nextInt(100) + 1);
		}

		System.out.println(intList.toString());
		List<Integer> varList = new ArrayList<Integer>();
		varList.add(30);
		varList.add(40);
		varList.add(50);
		varList.add(60);
		varList.add(70);
		intList.removeAll(intList);

		System.out.println(intList.toString());

		intList.add(999); // 맨끝에 추가하기
		intList.add(3, 9999);// 3번 위치에 값 추가하기
		System.out.println(intList.toString());
		
		intList.set(6, 777777); // 6번 위치의 값을 변경
		System.out.println(intList.toString());
		
		
		while (true) {

			if (intList.size() < 1)
				break;
			int index = rnd.nextInt(intList.size());
			System.out.println(intList.get(index) + "\t");

			intList.remove(index);

		}
		
		

	}

}
