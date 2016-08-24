
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="E ticaret">
        <meta name="author" content="gurkan cakir">

        <link rel="stylesheet" media="screen" href="/assets/stylesheets/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href="/assets/stylesheets/font-awesome.min.css">
        <link rel="stylesheet" media="screen" href="/assets/stylesheets/prettyPhoto.css">
        <link rel="stylesheet" media="screen" href="/assets/stylesheets/price-range.css">
        <link rel="stylesheet" media="screen" href="/assets/stylesheets/animate.css">
        <link rel="stylesheet" media="screen" href="/assets/stylesheets/main.css">
        <link rel="stylesheet" media="screen" href="/assets/stylesheets/responsive.css">


            <!--[if lt IE 9]>
                <script src=""""),_display_(/*29.31*/routes/*29.37*/.Assets.versioned("javascripts/html5shiv.js")),format.raw/*29.82*/("""" type="text/javascript" ></script>
                <script src=""""),_display_(/*30.31*/routes/*30.37*/.Assets.versioned("javascripts/respond.min.js")),format.raw/*30.84*/("""" type="text/javascript" ></script>
            <![endif]-->

        <link rel="shortcut icon" type="image/png" href="/assets/images/favicon.png">
    </head>
    <body>
       """),_display_(/*36.9*/header()),format.raw/*36.17*/("""


        """),format.raw/*40.32*/("""
        """),_display_(/*41.10*/content),format.raw/*41.17*/("""

        """),format.raw/*43.9*/("""<br />

        """),_display_(/*45.10*/footer()),format.raw/*45.18*/("""

        """),format.raw/*47.9*/("""<script src=""""),_display_(/*47.23*/routes/*47.29*/.Assets.versioned("javascripts/jquery.js")),format.raw/*47.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*48.23*/routes/*48.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*48.78*/("""" type="text/javascript" ></script>
        <script src=""""),_display_(/*49.23*/routes/*49.29*/.Assets.versioned("javascripts/jquery.scrollUp.min.js")),format.raw/*49.84*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*50.23*/routes/*50.29*/.Assets.versioned("javascripts/price-range.js")),format.raw/*50.76*/("""" type="text/javascript" ></script>
        <script src=""""),_display_(/*51.23*/routes/*51.29*/.Assets.versioned("javascripts/jquery.prettyPhoto.js")),format.raw/*51.83*/("""" type="text/javascript" ></script>
        <script src=""""),_display_(/*52.23*/routes/*52.29*/.Assets.versioned("javascripts/gmaps.js")),format.raw/*52.70*/("""" type="text/javascript" ></script>
        <script src=""""),_display_(/*53.23*/routes/*53.29*/.Assets.versioned("javascripts/main.js")),format.raw/*53.69*/("""" type="text/javascript" ></script>
        <script src=""""),_display_(/*54.23*/routes/*54.29*/.Assets.versioned("javascripts/index.js")),format.raw/*54.70*/("""" type="text/javascript" ></script>

    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Aug 24 21:25:46 EEST 2016
                  SOURCE: /home/gurkan/workspace/Eticaret/app/views/main.scala.html
                  HASH: f3647dab23308734ac18f0be8de7dd4852eae661
                  MATRIX: 1002->260|1127->290|1155->292|1235->397|1271->406|1306->414|1332->419|2272->1332|2287->1338|2353->1383|2446->1449|2461->1455|2529->1502|2734->1681|2763->1689|2802->1790|2839->1800|2867->1807|2904->1817|2948->1834|2977->1842|3014->1852|3055->1866|3070->1872|3133->1914|3217->1971|3232->1977|3302->2026|3387->2084|3402->2090|3478->2145|3562->2202|3577->2208|3645->2255|3730->2313|3745->2319|3820->2373|3905->2431|3920->2437|3982->2478|4067->2536|4082->2542|4143->2582|4228->2640|4243->2646|4305->2687
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|59->29|59->29|59->29|60->30|60->30|60->30|66->36|66->36|69->40|70->41|70->41|72->43|74->45|74->45|76->47|76->47|76->47|76->47|77->48|77->48|77->48|78->49|78->49|78->49|79->50|79->50|79->50|80->51|80->51|80->51|81->52|81->52|81->52|82->53|82->53|82->53|83->54|83->54|83->54
                  -- GENERATED --
              */
          