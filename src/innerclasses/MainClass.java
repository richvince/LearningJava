/*
Copyright 2010 kiddy
*/
package innerclasses;

public class MainClass {
	
	public class InnerClass {
		@SuppressWarnings("unused")
		private String name = "name";
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName(String name) {
			return name;
		}
	}
}
