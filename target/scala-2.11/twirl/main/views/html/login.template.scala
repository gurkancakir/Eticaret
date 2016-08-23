
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
                <form action="#">
                    <input placeholder="Name" type="text">
                    <input placeholder="Email Address" type="email">
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
                  DATE: Tue Aug 23 20:36:22 EEST 2016
                  SOURCE: /home/gurkan/workspace/Eticaret/app/views/login.scala.html
                  HASH: c5f9b9bd225a75a4c4b0c8f9eaf3e740c6969b44
                  MATRIX: 827->3|848->16|886->17|917->22|1833->911|1848->917|1896->944
                  LINES: 32->3|32->3|32->3|33->4|54->25|54->25|54->25
                  -- GENERATED --
              */
          