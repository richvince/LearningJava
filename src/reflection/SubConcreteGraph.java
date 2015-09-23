/*
Copyright 2010 kiddy
*/
package reflection;

public class SubConcreteGraph extends ConcreteGraph {
	
	@Override
	public void draw() {
//		super.draw();
		System.out.println("Calling SubContreteGraph.draw()");
	}
	
	public static void main(String[] args) {
		Class clazz;
		try {
			clazz = Class.forName("reflection.SubConcreteGraph");
			IGraph g = (IGraph)clazz.newInstance();
			g.draw();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	} 
}
