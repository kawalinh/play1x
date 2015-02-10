package controllers;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import models.Person;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
	
	public static Result index() {
	    return ok(index.render("Your new application is ready."));
	  }
	  
	  public static Result tasks() {
		  return newTask();
	  }
	  
	  public static Result newTask() {
	    return notFound("<h1>Page not found</h1>").as("text/html");
	  }
	  
	  public static Result deleteTask(Long id) {
		  return ok("ID:= "+id);
	  }
	  
	  public static Result addPerson() {
		  
		  	DynamicForm requestData = Form.form().bindFromRequest();
		    String firstname = requestData.get("firstname");
		    String lastname = requestData.get("lastname");
		    
		    if(firstname==null) lastname ="Dtag";
		    if(lastname==null) lastname = "VietNam";
		    
		  	Person person = new Person();
		  	List<Person> persons = new ArrayList<Person>();
		  	for(int x =0; x <5; x ++){
		  		person = new Person(firstname +x, lastname+x);
		  		persons.add(person);
		  	}
		  	Gson converter = new Gson();
		  	String jsonObject = converter.toJson(persons);
		  	System.out.println(jsonObject);
		  	
		    return ok(jsonObject);
	  }
	  public static Result gotoAddPerson() {
		  return ok(personForm.render("Your new application is ready."));
	  }
}
