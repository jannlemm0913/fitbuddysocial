// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Jann/Documents/IuK_III_W/fitbuddysocial/conf/routes
// @DATE:Mon Oct 15 14:39:02 CEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: javax.inject.Provider[controllers.Application],
  // @LINE:13
  Assets_0: controllers.Assets,
  // @LINE:14
  securesocial_Routes_0: securesocial.Routes,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: javax.inject.Provider[controllers.Application],
    // @LINE:13
    Assets_0: controllers.Assets,
    // @LINE:14
    securesocial_Routes_0: securesocial.Routes
  ) = this(errorHandler, Application_1, Assets_0, securesocial_Routes_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, securesocial_Routes_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """@controllers.Application@.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userAware""", """@controllers.Application@.userAware"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """only-twitter""", """@controllers.Application@.onlyTwitter"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """link-result""", """@controllers.Application@.linkResult"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """current-user""", """@controllers.Application@.currentUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    prefixed_securesocial_Routes_0_6.router.documentation,
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.get.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_userAware1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userAware")))
  )
  private[this] lazy val controllers_Application_userAware1_invoker = createInvoker(
    Application_1.get.userAware,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "userAware",
      Nil,
      "GET",
      this.prefix + """userAware""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_onlyTwitter2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("only-twitter")))
  )
  private[this] lazy val controllers_Application_onlyTwitter2_invoker = createInvoker(
    Application_1.get.onlyTwitter,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "onlyTwitter",
      Nil,
      "GET",
      this.prefix + """only-twitter""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_linkResult3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("link-result")))
  )
  private[this] lazy val controllers_Application_linkResult3_invoker = createInvoker(
    Application_1.get.linkResult,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "linkResult",
      Nil,
      "GET",
      this.prefix + """link-result""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_currentUser4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("current-user")))
  )
  private[this] lazy val controllers_Application_currentUser4_invoker = createInvoker(
    Application_1.get.currentUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "currentUser",
      Nil,
      "GET",
      this.prefix + """current-user""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_at5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at5_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:14
  private[this] val prefixed_securesocial_Routes_0_6 = Include(securesocial_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "auth"))


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params@_) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.get.index)
      }
  
    // @LINE:7
    case controllers_Application_userAware1_route(params@_) =>
      call { 
        controllers_Application_userAware1_invoker.call(Application_1.get.userAware)
      }
  
    // @LINE:8
    case controllers_Application_onlyTwitter2_route(params@_) =>
      call { 
        controllers_Application_onlyTwitter2_invoker.call(Application_1.get.onlyTwitter)
      }
  
    // @LINE:9
    case controllers_Application_linkResult3_route(params@_) =>
      call { 
        controllers_Application_linkResult3_invoker.call(Application_1.get.linkResult)
      }
  
    // @LINE:10
    case controllers_Application_currentUser4_route(params@_) =>
      call { 
        controllers_Application_currentUser4_invoker.call(Application_1.get.currentUser)
      }
  
    // @LINE:13
    case controllers_Assets_at5_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at5_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:14
    case prefixed_securesocial_Routes_0_6(handler) => handler
  }
}
