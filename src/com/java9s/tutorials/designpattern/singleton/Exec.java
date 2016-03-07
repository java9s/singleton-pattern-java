package com.java9s.tutorials.designpattern.singleton;

public class Exec {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(Satellite.getSatellite().hashCode());
		}
	}
}
