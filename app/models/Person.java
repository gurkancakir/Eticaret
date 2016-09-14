package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

import static play.libs.Json.toJson;

@Entity
public class Person extends Model implements Serializable{

    @Id
    public int id;
    public String name;
    public String email;
    public String password;

    @Override
    public String toString() {
        return String.valueOf(toJson(this));
    }
}
