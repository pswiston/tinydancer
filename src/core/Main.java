package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		
		String helloWorld = "Hello World this is a long string that i dont want to repeat";
		Integer number = 7;
		
		Human ethan = new Human();
		ethan.setSex("male");
		ethan.setName("stupid face");
		ethan.setAge(5);
		
		Human connor = new Human("male", "Connor", 200.5, 73.5, 26);
		
		
		Double decimal = 7.8;
		
		List<Human> humans = new ArrayList<>(2);
		humans.add(ethan);
		humans.add(connor);
		
		Map<String, Human> nameToPerson = new HashMap<>();
		nameToPerson.put(ethan.getName(), ethan);
		nameToPerson.put(connor.getName(), connor);
		
		int counter = 0;
		
		if (counter < humans.size())
		{
			System.out.println("in the if");
		} else if (counter == humans.size()){
			System.out.println("in the else if");
		}
		
		while(counter < humans.size())
		{
			System.out.println(counter);
			System.out.println(humans.get(counter++).getName());
			System.out.println(ethan.getName());
			System.out.println("stupid face");
			System.out.println(counter);
		}
		
		for (int count = 0; count < humans.size(); count++)
		{
			System.out.println(humans.get(count).getAge());
		}
		
		for (Human person : humans)
		{
			System.out.println(person.getName() + "'s sex: " + person.getSex());
		}
	}

}
