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
	

	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setWeight(Double weight)
	{
		this.weight = weight;
	}
	
	public Double getWeight()
	{
		return weight;
	}
	
	public void setHeight(Double height)
	{
		this.height = height;
	}
	
	public Double getHeight()
	{
		return height;
	}
	
	public void setAge(Integer age)
	{
		this.age = age;
	}
	
	public Integer getAge()
	{
		return age;
	}
	
	public String print() 
	{
		String printableString = "This is a human: ";
		printableString = printableString + age.toString();
		printableString += ", ";
		printableString += name;
		printableString += ", ";
		printableString += weight.toString();
		printableString += ", ";
		printableString += height.toString();
		printableString += ", ";
		printableString += sex;
		return printableString;
	}
}