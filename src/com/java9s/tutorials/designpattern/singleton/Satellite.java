package com.java9s.tutorials.designpattern.singleton;

public class Satellite {
	//A static field to hold the instance. But we do not need it if you do not use Lazy initialization
	private static Satellite _instance;
	
	//Always close the access to constructors	
	private Satellite(){}
	
	private static class SatelliteHelper{
		private static final Satellite _innerInstance = new Satellite();
	}
	
	//All the classes should use this method to get the instances.
	public static  Satellite getSatellite(){
		return SatelliteHelper._innerInstance;
	}
	
	//Use this method for lazy initialization but recommended to use the helper class way
	public static Satellite getLazySatellite(){
		if(_instance == null){
			_instance = new Satellite();
		}
		return _instance;
	}
}
