package com.callor.controller;

public class Score_04 {
	
	public static void main(String[] args) {
	
	int intKor = 80;
	int intEng = 65;
	int intMath = 65;
	int intSum = intKor + intEng + intMath;
	float floatAvg = (float)intSum / 3;
	
	System.out.println("===================");
	System.out.println("국어 : " + intKor);
	System.out.println("영어 : " + intEng);
	System.out.println("수학 : " + intMath);
	System.out.println("-------------------");
	System.out.printf("총점 : %d, 평균 %d %3.2f", intSum, floatAvg);
	

}
}