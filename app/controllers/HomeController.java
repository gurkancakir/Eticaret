package controllers;

import com.avaje.ebean.Model;
import models.*;
import org.omg.DynamicAny.NameValuePair;
import play.data.Form;
import play.mvc.*;

import views.html.*;

import java.util.List;

import static play.libs.Json.toJson;

public class HomeController extends Controller {


    public Result index() {
        List<Product> products = new Model.Finder(String.class,Product.class).all();
        return ok(index.render(products));
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

    public Result getCategories(){
        List<Category> categories = new Model.Finder(String.class,Category.class).all();
        return ok(toJson(categories));
    }

    public Result getCategoriesByParentId(String id){
        List<Category> categories = new Model.Finder(String.class,Category.class).where().ilike("parentId",id).findList();
        return ok(toJson(categories));
    }

    public Result contact(){
        return ok(contact.render());
    }

}
