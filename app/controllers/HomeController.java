package controllers;

import com.avaje.ebean.Model;
import models.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;

import java.util.List;

import static play.libs.Json.toJson;

public class HomeController extends Controller {


    public Result index() {
        List<Product> products = new Model.Finder(String.class,Product.class).all();
        List<Category> categories = new Model.Finder(String.class,Category.class).all();
        return ok(index.render(products,categories));
    }

    public Result login(){
        return ok(login.render());
    }

    public Result productDetail(){
        List<Category> categories = new Model.Finder(String.class,Category.class).all();
        return ok(productdetail.render(categories));
    }

    public Result addPerson(){
        Person person = Form.form(Person.class).bindFromRequest().get();
        person.save();
        return redirect(routes.HomeController.login());
    }

}
