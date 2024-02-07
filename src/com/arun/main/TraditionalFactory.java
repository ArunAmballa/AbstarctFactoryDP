package com.arun.main;

public class TraditionalFactory implements FurnitureFactory{

	@Override
	public Table createTable() {
		
		return new TraditionalTable();
	}

	@Override
	public Chair createChair() {
		
		return new TraditionalChair();
	}

}
