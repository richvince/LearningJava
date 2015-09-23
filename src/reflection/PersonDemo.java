/*
Copyright 2010 kiddy
*/
package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

class Person {
	private String name;
	private int age;
	
	public Person() {}
	public Person(String name) {
		this.name = name;
	}
	public Person(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "[ name: "+this.name+", age: "+this.age+" ]";
	}
}

public class PersonDemo {
	public static void main(String[] args) {
		Class<?> personDemo = null;
		try {
			personDemo = Class.forName("reflection.Person");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//获取类中的成员变量
		Field[] fields = personDemo.getDeclaredFields();
		for(int i=0; i < fields.length; i++) {
			int modifier = fields[i].getModifiers();
			Class<?> fieldClass = fields[i].getType();
			System.out.println(Modifier.toString(modifier)+" "+fieldClass.getName()+" "+fields[i].getName());
		}
		//获取到本类中的方法
		Method[] methods = personDemo.getDeclaredMethods();
		for(int i=0; i < methods.length; i++) {
			int mo = methods[i].getModifiers();
			Class<?> returnType = methods[i].getReturnType();
			Class<?>[] parameterType = methods[i].getParameterTypes();
			System.out.print(Modifier.toString(mo)+" "+returnType.getName()+" "+methods[i].getName()+"(");
			for(int j=0; j < parameterType.length; j++) {
				System.out.print(parameterType[j].getName());
				if(j != 0 && j != parameterType.length-1)
					System.out.print(",");
			}
			System.out.println(")");
		}
	}
}