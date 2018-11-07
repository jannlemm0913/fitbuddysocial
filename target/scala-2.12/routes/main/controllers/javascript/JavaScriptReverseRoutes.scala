// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Jann/Documents/IuK_III_W/fitbuddysocial/conf/routes
// @DATE:Mon Oct 15 14:39:02 CEST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def userAware: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.userAware",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userAware"})
        }
      """
    )
  
    // @LINE:8
    def onlyTwitter: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.onlyTwitter",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "only-twitter"})
        }
      """
    )
  
    // @LINE:10
    def currentUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.currentUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "current-user"})
        }
      """
    )
  
    // @LINE:9
    def linkResult: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.linkResult",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "link-result"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}
