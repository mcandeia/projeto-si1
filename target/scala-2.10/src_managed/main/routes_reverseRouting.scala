// @SOURCE:C:/Users/HOME/projeto-si1/conf/routes
// @HASH:f0efd0defa9e2a483d858b4e0ab8492aa82e26e1
// @DATE:Sat Mar 22 04:38:10 BRT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def cadastroPage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "cadastro")
}
                                                

// @LINE:12
def addCadeira(cadeira:String, periodo:Int): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "addCadeira/" + implicitly[PathBindable[String]].unbind("cadeira", dynamicString(cadeira)) + "/" + implicitly[PathBindable[Int]].unbind("periodo", periodo))
}
                                                

// @LINE:19
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:17
def cadastro(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "cadastro")
}
                                                

// @LINE:11
// @LINE:10
def remCadeira(cadeira:String): Call = {
   (cadeira: @unchecked) match {
// @LINE:10
case (cadeira) if true => Call("GET", _prefix + { _defaultPrefix } + "remCadeira/" + implicitly[PathBindable[String]].unbind("cadeira", dynamicString(cadeira)))
                                                        
// @LINE:11
case (cadeira) if true => Call("POST", _prefix + { _defaultPrefix } + "remCadeira/" + implicitly[PathBindable[String]].unbind("cadeira", dynamicString(cadeira)))
                                                        
   }
}
                                                

// @LINE:18
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:15
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def cadastroPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.cadastroPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastro"})
      }
   """
)
                        

// @LINE:12
def addCadeira : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addCadeira",
   """
      function(cadeira,periodo) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addCadeira/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("cadeira", encodeURIComponent(cadeira)) + "/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("periodo", periodo)})
      }
   """
)
                        

// @LINE:19
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:17
def cadastro : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.cadastro",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastro"})
      }
   """
)
                        

// @LINE:11
// @LINE:10
def remCadeira : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.remCadeira",
   """
      function(cadeira) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "remCadeira/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("cadeira", encodeURIComponent(cadeira))})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "remCadeira/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("cadeira", encodeURIComponent(cadeira))})
      }
      }
   """
)
                        

// @LINE:18
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:15
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def cadastroPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.cadastroPage(), HandlerDef(this, "controllers.Application", "cadastroPage", Seq(), "GET", """""", _prefix + """cadastro""")
)
                      

// @LINE:12
def addCadeira(cadeira:String, periodo:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addCadeira(cadeira, periodo), HandlerDef(this, "controllers.Application", "addCadeira", Seq(classOf[String], classOf[Int]), "POST", """""", _prefix + """addCadeira/$cadeira<[^/]+>/$periodo<[^/]+>""")
)
                      

// @LINE:19
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:17
def cadastro(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.cadastro(), HandlerDef(this, "controllers.Application", "cadastro", Seq(), "POST", """""", _prefix + """cadastro""")
)
                      

// @LINE:10
def remCadeira(cadeira:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.remCadeira(cadeira), HandlerDef(this, "controllers.Application", "remCadeira", Seq(classOf[String]), "GET", """""", _prefix + """remCadeira/$cadeira<[^/]+>""")
)
                      

// @LINE:18
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:15
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """Login""", _prefix + """login""")
)
                      
    
}
                          
}
        
    