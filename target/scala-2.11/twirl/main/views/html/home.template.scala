
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
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

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages:String)(content:Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

"""),_display_(/*3.2*/main(messages)/*3.16*/{_display_(Seq[Any](format.raw/*3.17*/("""

    """),format.raw/*5.5*/("""<section id="slider"><!--slider-->
        <div class="container">
            <div class="row">
                <div class="col-sm-12">
                    <div id="slider-carousel" class="carousel slide" data-ride="carousel">
                        <ol class="carousel-indicators">
                            <li data-target="#slider-carousel" data-slide-to="0" class="active"></li>
                            <li class="" data-target="#slider-carousel" data-slide-to="1"></li>
                            <li class="" data-target="#slider-carousel" data-slide-to="2"></li>
                        </ol>

                        <div class="carousel-inner">
                            <div class="item active">
                                <div class="col-sm-6">
                                    <h1><span>E</span>-SHOPPER</h1>
                                    <h2>Free E-Commerce Template</h2>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                                    <button type="button" class="btn btn-default get">Get it now</button>
                                </div>
                                <div class="col-sm-6">
                                    <img src="/assets/images/home/girl1.jpg" class="girl img-responsive" alt="">
                                    <img src="/assets/images/home/pricing.png" class="pricing" alt="">
                                </div>
                            </div>
                            <div class="item">
                                <div class="col-sm-6">
                                    <h1><span>E</span>-SHOPPER</h1>
                                    <h2>100% Responsive Design</h2>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                                    <button type="button" class="btn btn-default get">Get it now</button>
                                </div>
                                <div class="col-sm-6">
                                    <img src="/assets/images/home/girl2.jpg" class="girl img-responsive" alt="">
                                    <img src="/assets/images/home/pricing.png" class="pricing" alt="">
                                </div>
                            </div>

                            <div class="item">
                                <div class="col-sm-6">
                                    <h1><span>E</span>-SHOPPER</h1>
                                    <h2>Free Ecommerce Template</h2>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                                    <button type="button" class="btn btn-default get">Get it now</button>
                                </div>
                                <div class="col-sm-6">
                                    <img src="/assets/images/home/girl3.jpg" class="girl img-responsive" alt="">
                                    <img src="/assets/images/home/pricing.png" class="pricing" alt="">
                                </div>
                            </div>

                        </div>

                        <a href="#slider-carousel" class="left control-carousel hidden-xs" data-slide="prev">
                            <i class="fa fa-angle-left"></i>
                        </a>
                        <a href="#slider-carousel" class="right control-carousel hidden-xs" data-slide="next">
                            <i class="fa fa-angle-right"></i>
                        </a>
                    </div>

                </div>
            </div>
        </div>
    </section>

    <section>
        <div class="container">
            <div class="row">
                """),_display_(/*73.18*/leftMenu()),format.raw/*73.28*/("""
                """),_display_(/*74.18*/content),format.raw/*74.25*/("""
            """),format.raw/*75.13*/("""</div>
        </div>
    </section>

""")))}))
      }
    }
  }

  def render(messages:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(messages)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (messages) => (content) => apply(messages)(content)

  def ref: this.type = this

}


}

/**/
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Wed Aug 24 21:29:07 EEST 2016
                  SOURCE: /home/gurkan/workspace/Eticaret/app/views/home.scala.html
                  HASH: 58657e5f6ae85f796d347e344ac9f4a8ad71460f
                  MATRIX: 748->1|874->32|902->35|924->49|962->50|994->56|5015->4050|5046->4060|5091->4078|5119->4085|5160->4098
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|104->73|104->73|105->74|105->74|106->75
                  -- GENERATED --
              */
          