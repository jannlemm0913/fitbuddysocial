// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Jann/Documents/IuK_III_W/fitbuddysocial/conf/routes
// @DATE:Mon Oct 15 14:39:02 CEST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def userAware(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userAware")
    }
  
    // @LINE:8
    def onlyTwitter(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "only-twitter")
    }
  
    // @LINE:10
    def currentUser(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "current-user")
    }
  
    // @LINE:9
    def linkResult(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "link-result")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
