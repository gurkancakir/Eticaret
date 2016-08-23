package controllers;

import com.avaje.ebean.Model;
import models.Person;
import models.Product;
import play.data.Form;
import play.mvc.*;

import views.html.*;

import java.util.List;

import static play.libs.Json.toJson;

public class HomeController extends Controller {


    public Result index() {
        return ok(index.render());
    }

    public Result login(){
        return ok(login.render());
    }

    public Result productDetail(){
        return ok(productdetail.render());
    }

    public Result addPerson(){
        Person person = Form.form(Person.class).bindFromRequest().get();
        person.save();
        return redirect(routes.HomeController.login());
    }

    public Result getProducts(){
        List<Product> products = new Model.Finder(String.class,Product.class).all();
        return ok(toJson(products));
    }
}
