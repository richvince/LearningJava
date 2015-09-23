/*
Copyright 2010 kiddy
*/
package pattern;

class PackageInfo implements Cloneable {
	private int num;
	private String name;
	private String[] strArr;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getStrArr() {
		return strArr;
	}
	public void setStrArr(String[] strArr) {
		this.strArr = strArr;
	}
	
	public PackageInfo(int num, String name) {
		this.num = num;
		this.name = name;
		strArr = new String[2];
		strArr[0] = "Hello";
		strArr[1] = "World";
	}
	
	public PackageInfo clone() {
		try {
			PackageInfo tmp = (PackageInfo)super.clone();
			tmp.strArr = this.strArr.clone();
			return tmp;
		} catch(CloneNotSupportedException e) {
			System.out.println("Clone object not allow!");
			return null;
		}
	}
}

public class Prototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PackageInfo p1 = new PackageInfo(12, "Hello World!");
		PackageInfo p2 = p1.clone();
		System.out.println("p1.strArr == p2.strArr : "+p1.getStrArr().equals(p2.getStrArr()));
	}

}
