package com.arun.main;

public interface FurnitureFactory {
	
	Table createTable();
	Chair createChair();
	
	public static FurnitureFactory getFactory(String str)
	{
		if (str.equals("Traditional"))
		{
			return new TraditionalFactory();
		}
		else {
			return new ModernFactory();
		}
	}
	
	

}
