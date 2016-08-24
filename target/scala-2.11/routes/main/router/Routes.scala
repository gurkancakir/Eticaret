
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/gurkan/workspace/Eticaret/conf/routes
// @DATE:Wed Aug 24 22:28:25 EEST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product-detail""", """controllers.HomeController.productDetail()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person""", """controllers.HomeController.addPerson()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categories""", """controllers.HomeController.getCategories()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.HomeController.contact()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categories/""" + "$" + """id<.+>""", """controllers.HomeController.getCategoriesByParentId(id:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_login2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login2_invoker = createInvoker(
    HomeController_0.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_productDetail3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product-detail")))
  )
  private[this] lazy val controllers_HomeController_productDetail3_invoker = createInvoker(
    HomeController_0.productDetail(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "productDetail",
      Nil,
      "GET",
      """""",
      this.prefix + """product-detail"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_addPerson4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person")))
  )
  private[this] lazy val controllers_HomeController_addPerson4_invoker = createInvoker(
    HomeController_0.addPerson(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addPerson",
      Nil,
      "POST",
      """""",
      this.prefix + """person"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_getCategories5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categories")))
  )
  private[this] lazy val controllers_HomeController_getCategories5_invoker = createInvoker(
    HomeController_0.getCategories(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getCategories",
      Nil,
      "GET",
      """""",
      this.prefix + """categories"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_contact6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_HomeController_contact6_invoker = createInvoker(
    HomeController_0.contact(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "contact",
      Nil,
      "GET",
      """""",
      this.prefix + """contact"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_getCategoriesByParentId7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categories/"), DynamicPart("id", """.+""",false)))
  )
  private[this] lazy val controllers_HomeController_getCategoriesByParentId7_invoker = createInvoker(
    HomeController_0.getCategoriesByParentId(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getCategoriesByParentId",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """categories/""" + "$" + """id<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_HomeController_login2_route(params) =>
      call { 
        controllers_HomeController_login2_invoker.call(HomeController_0.login())
      }
  
    // @LINE:12
    case controllers_HomeController_productDetail3_route(params) =>
      call { 
        controllers_HomeController_productDetail3_invoker.call(HomeController_0.productDetail())
      }
  
    // @LINE:13
    case controllers_HomeController_addPerson4_route(params) =>
      call { 
        controllers_HomeController_addPerson4_invoker.call(HomeController_0.addPerson())
      }
  
    // @LINE:14
    case controllers_HomeController_getCategories5_route(params) =>
      call { 
        controllers_HomeController_getCategories5_invoker.call(HomeController_0.getCategories())
      }
  
    // @LINE:15
    case controllers_HomeController_contact6_route(params) =>
      call { 
        controllers_HomeController_contact6_invoker.call(HomeController_0.contact())
      }
  
    // @LINE:16
    case controllers_HomeController_getCategoriesByParentId7_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_getCategoriesByParentId7_invoker.call(HomeController_0.getCategoriesByParentId(id))
      }
  }
}
