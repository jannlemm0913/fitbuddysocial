// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Jann/Documents/IuK_III_W/fitbuddysocial/conf/routes
// @DATE:Mon Oct 15 14:39:02 CEST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
