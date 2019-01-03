package com.Innerinterface.demo;

class VechileTypes {
	
	interface vechile {
		
		public int getNumberOfWheels();
	}
	
	class Bus implements vechile {
		@Override
		public int getNumberOfWheels() {
			
		return 6;
		}
	}
	
	class Auto implements vechile {
		@Override
		public int getNumberOfWheels() {
			
		return 6;
		}
	}
	
	public static void main(String[] args) {
    
		VechileTypes vTypes = new VechileTypes();
		VechileTypes.Bus bus = vTypes.new Bus();
		System.out.println(bus.getNumberOfWheels());
	}
}