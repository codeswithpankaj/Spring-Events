package in.p4n;

public class Info {
	   String name;
	   int age;
	   int height;
	   
	   public Info(String name, int age, int height) {
		this.name = name;
		this.age = age;
		this.height = height;
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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	} 
}
