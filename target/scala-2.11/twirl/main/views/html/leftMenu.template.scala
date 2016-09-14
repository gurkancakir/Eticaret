
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object leftMenu_Scope0 {
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

class leftMenu extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<div class="col-sm-3">
    <div class="left-sidebar">
        <h2>Category</h2>
        <div class="panel-group category-products" id="accordian"><!--category-productsr-->

            """),format.raw/*7.48*/("""
        """),format.raw/*8.9*/("""</div><!--/category-products-->

        <div class="brands_products"><!--brands_products-->
            <h2>Brands</h2>
            <div class="brands-name">
                <ul class="nav nav-pills nav-stacked">
                    <li><a href="#"> <span class="pull-right">(50)</span>Acne</a></li>
                    <li><a href="#"> <span class="pull-right">(56)</span>Grüne Erde</a></li>
                    <li><a href="#"> <span class="pull-right">(27)</span>Albiro</a></li>
                    <li><a href="#"> <span class="pull-right">(32)</span>Ronhill</a></li>
                    <li><a href="#"> <span class="pull-right">(5)</span>Oddmolly</a></li>
                    <li><a href="#"> <span class="pull-right">(9)</span>Boudestijn</a></li>
                    <li><a href="#"> <span class="pull-right">(4)</span>Rösch creative culture</a></li>
                </ul>
            </div>
        </div><!--/brands_products-->

        <div class="price-range"><!--price-range-->
            <h2>Price Range</h2>
            <div class="well text-center">
                <div style="width: 214px;" class="slider slider-horizontal"><div class="slider-track"><div style="left: 16.6667%; width: 50.8333%;" class="slider-selection"></div><div style="left: 16.6667%;" class="slider-handle round left-round"></div><div style="left: 67.5%;" class="slider-handle round"></div></div><div style="top: -30px; left: 56.5583px;" class="tooltip top"><div class="tooltip-arrow"></div><div class="tooltip-inner">105 : 405</div></div><input style="" class="span2" value="" data-slider-min="0" data-slider-max="600" data-slider-step="5" data-slider-value="[250,450]" id="sl2" type="text"></div><br>
                <b class="pull-left">$ 0</b> <b class="pull-right">$ 600</b>
            </div>
        </div><!--/price-range-->

        <div class="shipping text-center"><!--shipping-->
            <img src="/assets/images/home/shipping.jpg" alt="">
        </div><!--/shipping-->

    </div>
</div>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object leftMenu extends leftMenu_Scope0.leftMenu
              /*
                  -- GENERATED --
                  DATE: Wed Aug 24 23:20:44 EEST 2016
                  SOURCE: /home/gurkan/workspace/Eticaret/app/views/leftMenu.scala.html
                  HASH: 220d38a3efa34c7ec514c3228660618756369345
                  MATRIX: 744->1|840->3|867->4|1079->224|1114->233
                  LINES: 27->1|32->1|33->2|38->7|39->8
                  -- GENERATED --
              */
          