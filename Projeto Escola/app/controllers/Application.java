package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller {
  
//    public static Result index() {
//        return ok(index.render("Your new application is ready."));
//    }
	
//	  public static Result blank() {
//		  return ok (views.html.blank.render());
//	  }
//	  public static Result buttons() {
//		  return ok (views.html.buttons.render());
//	  }
	  public static Result flot() {
		  return ok (views.html.flot.render());
	  }
	  public static Result forms() {
		  return ok (views.html.forms.render());
	  }
//	  public static Result grid() {
//		  return ok (views.html.grid.render());
//	  }
//	  public static Result icons() {
//		  return ok (views.html.icons.render());
//	  }
	  public static Result index() {
		  return ok (views.html.index.render());
	  }
//	  public static Result login() {
//		  return ok (views.html.login.render());
//	  }
	  public static Result morris() {
		  return ok (views.html.morris.render());
	  }
//	  public static Result notifications() {
//		  return ok (views.html.notifications.render());
//	  }
	  public static Result panels() {
		  return ok (views.html.panels.render());
	  }
	  public static Result tables() {
		  return ok (views.html.tables.render());
	  }
	  public static Result text() {
		  return ok (views.html.text.render());
	  }
	  public static Result text2() {
		  return ok (views.html.text2.render());
	  }
	  public static Result text3() {
		  return ok (views.html.text3.render());
	  }
}
