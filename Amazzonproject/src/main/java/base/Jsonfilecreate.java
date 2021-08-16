package base;

import org.json.simple.JSONObject;

public class Jsonfilecreate {

	public static void jsoncreate()
	{
		JSONObject obj=new JSONObject();
		obj.put("nagesh","hacker");
		obj.put("nagesh nag","pirate");
		obj.put("nageshnag","the rider");
		System.out.println(obj);
		
		JSONObject obj1=new JSONObject();
		obj1.put("persons with professions", obj);
		System.out.println(obj1);
		
	}
	
	public static void main(String args[][])
	{
		jsoncreate();
		
	}
	
	
	
}
