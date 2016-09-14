
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Login")/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-sm-4 col-sm-offset-1">
            <div class="login-form"><!--login form-->
                <h2>Login to your account</h2>
                <form action=""""),_display_(/*8.32*/routes/*8.38*/.HomeController.checkLogin()),format.raw/*8.66*/("""" method="post">
                    <input placeholder="Email Address" type="email" name="email">
                    <input placeholder="Password" type="password" name="password">
                    <span>
                        <input class="checkbox" type="checkbox">
                        Keep me signed in
                    </span>
                    <button type="submit" class="btn btn-default">Login</button>
                </form>
            </div><!--/login form-->
        </div>
        <div class="col-sm-1">
            <h2 class="or">OR</h2>
        </div>
        <div class="col-sm-4">
            <div class="signup-form"><!--sign up form-->
                <h2>New User Signup!</h2>
                <form action=""""),_display_(/*25.32*/routes/*25.38*/.HomeController.addPerson()),format.raw/*25.65*/("""" method="post">
                    <input placeholder="Name" type="text" name="name">
                    <input placeholder="Email Address" type="email" name="email">
                    <input placeholder="Password" type="password" name="password">
                    <button type="submit" class="btn btn-default">Signup</button>
                </form>
            </div><!--/sign up form-->
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Wed Sep 14 18:32:32 EEST 2016
                  SOURCE: /home/gurkan/workspace/Eticaret/app/views/login.scala.html
                  HASH: 4bedaddda9d77c4c5c4ee02eb466a65e8ecdabd3
                  MATRIX: 827->3|848->16|886->17|917->22|1140->219|1154->225|1202->253|1972->996|1987->1002|2035->1029
                  LINES: 32->3|32->3|32->3|33->4|37->8|37->8|37->8|54->25|54->25|54->25
                  -- GENERATED --
              */
          