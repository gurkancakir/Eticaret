package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Category extends Model {

    @Id
    public int id;
    public String name;
    public String parentId;

}
