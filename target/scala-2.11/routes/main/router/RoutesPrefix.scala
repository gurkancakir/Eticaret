
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/gurkan/workspace/Eticaret/conf/routes
// @DATE:Wed Aug 24 00:05:21 EEST 2016


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
