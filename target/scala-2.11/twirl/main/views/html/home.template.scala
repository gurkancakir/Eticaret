
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

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,List[Category],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages:String)(categories:List[Category])(content:Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.60*/("""

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
                <div class="col-sm-3">
                    <div class="left-sidebar">
                        <h2>Category</h2>
                        <div class="panel-group category-products" id="accordian"><!--category-productsr-->
                            """),_display_(/*77.30*/for(category <- categories) yield /*77.57*/ {_display_(Seq[Any](format.raw/*77.59*/("""
                                """),_display_(/*78.34*/if(category.getParentId() == null)/*78.68*/{_display_(Seq[Any](format.raw/*78.69*/("""
                                    """),format.raw/*79.37*/("""<div class="panel panel-default">
                                        <div class="panel-heading">
                                            <h4 class="panel-title">
                                                <a data-toggle="collapse" data-parent="#accordian" href="#"""),_display_(/*82.108*/category/*82.116*/.getName()),format.raw/*82.126*/("""">
                                                    <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                                    """),_display_(/*84.54*/category/*84.62*/.getName()),format.raw/*84.72*/("""
                                                """),format.raw/*85.49*/("""</a>
                                            </h4>
                                        </div>
                                        <div id=""""),_display_(/*88.51*/category/*88.59*/.getName()),format.raw/*88.69*/("""" class="panel-collapse collapse">
                                            <div class="panel-body">
                                                <ul>
                                                    """),_display_(/*91.54*/for(categoryalt <- categories) yield /*91.84*/ {_display_(Seq[Any](format.raw/*91.86*/("""
                                                        """),_display_(/*92.58*/if(category.getId() == categoryalt.getParentId())/*92.107*/{_display_(Seq[Any](format.raw/*92.108*/("""
                                                            """),format.raw/*93.61*/("""<li><a href="#">"""),_display_(/*93.78*/categoryalt/*93.89*/.getName()),format.raw/*93.99*/("""</a></li>
                                                        """)))}),format.raw/*94.58*/("""
                                                    """)))}),format.raw/*95.54*/("""
                                                """),format.raw/*96.49*/("""</ul>
                                            </div>
                                        </div>
                                    </div>
                                """)))}),format.raw/*100.34*/("""

                              """),format.raw/*178.41*/("""
                            """)))}),format.raw/*179.30*/("""
                        """),format.raw/*180.25*/("""</div><!--/category-products-->

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
                </div>
                """),_display_(/*211.18*/content),format.raw/*211.25*/("""
            """),format.raw/*212.13*/("""</div>
        </div>
    </section>

""")))}))
      }
    }
  }

  def render(messages:String,categories:List[Category],content:Html): play.twirl.api.HtmlFormat.Appendable = apply(messages)(categories)(content)

  def f:((String) => (List[Category]) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (messages) => (categories) => (content) => apply(messages)(categories)(content)

  def ref: this.type = this

}


}

/**/
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Wed Aug 24 00:16:57 EEST 2016
                  SOURCE: /home/gurkan/workspace/Eticaret/app/views/home.scala.html
                  HASH: 830587c0b3090fa0ef7816244eb3bd541c4ac4f8
                  MATRIX: 763->1|916->59|944->62|966->76|1004->77|1036->83|5305->4325|5348->4352|5388->4354|5449->4388|5492->4422|5531->4423|5596->4460|5902->4738|5920->4746|5952->4756|6152->4929|6169->4937|6200->4947|6277->4996|6456->5148|6473->5156|6504->5166|6741->5376|6787->5406|6827->5408|6912->5466|6971->5515|7011->5516|7100->5577|7144->5594|7164->5605|7195->5615|7293->5682|7378->5736|7455->5785|7667->5965|7728->10986|7790->11016|7844->11041|10301->13470|10330->13477|10372->13490
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|108->77|108->77|108->77|109->78|109->78|109->78|110->79|113->82|113->82|113->82|115->84|115->84|115->84|116->85|119->88|119->88|119->88|122->91|122->91|122->91|123->92|123->92|123->92|124->93|124->93|124->93|124->93|125->94|126->95|127->96|131->100|133->178|134->179|135->180|166->211|166->211|167->212
                  -- GENERATED --
              */
          