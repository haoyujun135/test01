package com.mp.bean;

public class SeracheName {
	public static void main(String[] args) {
		String name[][]={{"张三",null,"王五"},{"五一","白七","黑吧"},{"找流"}};
		for (int i = 0; i < name.length; i++) {
			for (int j = 0; j < name[i].length; j++) {
				if("白七".equals(name[i][j])) {
					System.out.println(name[i][j]);
					return;
				}
			}
		}
		System.out.println("查无此人");
	}
}
