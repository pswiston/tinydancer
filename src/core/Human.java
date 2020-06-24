package core;

public class Human {
	
	private String sex = null;
	private String name = null;
	private Double weight = null;
	private Double height = null;
	private Integer age = null;

	public Human() {
		
	}
	
	public Human(String sex, String name, Double weight, Double height, Integer age) {
		this.sex = sex;
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.age = age;
	}
	
	public void setSex(String sex)
	{
		this.sex = sex;
	}
	
	public String getSex()
	{
		return sex;
	}
	
	
	
}
