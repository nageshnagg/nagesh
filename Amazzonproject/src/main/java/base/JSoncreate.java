package base;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSoncreate {
	
	
	
	
	
	public static void jsoncreate() throws IOException
	{
		JSONObject obj=new JSONObject();
		obj.put("nagesh","hacker");
		obj.put("nagesh nag","pirate");
		obj.put("nageshnag","the rider");
		System.out.println(obj);
		
		JSONObject obj1=new JSONObject();
		obj1.put("persons with professions", obj);
		System.out.println(obj1);
	
		JSONArray array =new JSONArray();
		array.add(obj);
		System.out.println(array);
	
		FileWriter write=new FileWriter("D://reportss//file.json");
		write.write(obj1.toJSONString());
	
		JSONObject obj2=new JSONObject();
		obj1.put("persons with professions",array);
		System.out.println(obj2);
	
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		jsoncreate();
	}

}
