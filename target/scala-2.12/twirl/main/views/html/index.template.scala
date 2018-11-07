
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[service.DemoUser,securesocial.core.RuntimeEnvironment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: service.DemoUser, env: securesocial.core.RuntimeEnvironment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import securesocial.core.AuthenticationMethod._
/*3.2*/import Http.Context.Implicit


Seq[Any](format.raw/*1.69*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("SecureSocial - Sample Protected Page")/*5.46*/ {_display_(Seq[Any](format.raw/*5.48*/("""
"""),format.raw/*6.1*/("""<div class="page-header">
    <h2><img src=""""),_display_(/*7.20*/user/*7.24*/.main.avatarUrl),format.raw/*7.39*/("""" alt=""""),_display_(/*7.47*/user/*7.51*/.main.fullName),format.raw/*7.65*/("""" width="40px" height="40px"/> Welcome """),_display_(/*7.105*/user/*7.109*/.main.firstName),format.raw/*7.124*/("""</h2>
</div>

<div class="clearfix">
    <h2>User Details</h2>

    <ul>
        <li>User Id: """),_display_(/*14.23*/user/*14.27*/.main.userId),format.raw/*14.39*/("""</li>
        <li>Logged in from: """),_display_(/*15.30*/user/*15.34*/.main.providerId),format.raw/*15.50*/("""</li>
        <li>First name: """),_display_(/*16.26*/user/*16.30*/.main.firstName),format.raw/*16.45*/("""</li>
        <li>Last name: """),_display_(/*17.25*/user/*17.29*/.main.lastName),format.raw/*17.43*/("""</li>
        <li>Full name: """),_display_(/*18.25*/user/*18.29*/.main.fullName),format.raw/*18.43*/("""</li>
        <li>Email: """),_display_(/*19.21*/user/*19.25*/.main.email.map/*19.40*/ { email =>_display_(Seq[Any](format.raw/*19.51*/(""" """),_display_(/*19.53*/email),format.raw/*19.58*/(""" """)))}/*19.60*/.getOrElse("Not Available")),format.raw/*19.87*/("""</li>
        <li>Authentication method: """),_display_(/*20.37*/user/*20.41*/.main.authMethod),format.raw/*20.57*/("""</li>
    </ul>

    """),_display_(/*23.6*/user/*23.10*/.main.oAuth1Info.map/*23.30*/ { info =>_display_(Seq[Any](format.raw/*23.40*/("""
    """),format.raw/*24.5*/("""<h2>OAuth1 Info</h2>

    <ul>
        <li>Token: """),_display_(/*27.21*/info/*27.25*/.token),format.raw/*27.31*/("""</li>
        <li>Secret: """),_display_(/*28.22*/info/*28.26*/.secret),format.raw/*28.33*/("""</li>
    </ul>
    """)))}),format.raw/*30.6*/("""

    """),_display_(/*32.6*/user/*32.10*/.main.oAuth2Info.map/*32.30*/ { info =>_display_(Seq[Any](format.raw/*32.40*/("""
    """),format.raw/*33.5*/("""<h2>OAuth2 Info</h2>

    <ul>
        <li>Access Token: """),_display_(/*36.28*/info/*36.32*/.accessToken),format.raw/*36.44*/("""</li>
        """),_display_(/*37.10*/info/*37.14*/.tokenType.map/*37.28*/ { t =>_display_(Seq[Any](format.raw/*37.35*/(""" """),format.raw/*37.36*/("""<li>Token Type: """),_display_(/*37.53*/t),format.raw/*37.54*/("""</li> """)))}),format.raw/*37.61*/("""
        """),_display_(/*38.10*/info/*38.14*/.expiresIn.map/*38.28*/ { exp =>_display_(Seq[Any](format.raw/*38.37*/(""" """),format.raw/*38.38*/("""<li>Expires in: """),_display_(/*38.55*/exp),format.raw/*38.58*/(""" """),format.raw/*38.59*/("""seconds</li>""")))}),format.raw/*38.72*/("""
        """),_display_(/*39.10*/info/*39.14*/.refreshToken.map/*39.31*/ { rt =>_display_(Seq[Any](format.raw/*39.39*/(""" """),format.raw/*39.40*/("""<li>Refresh Token: """),_display_(/*39.60*/rt),format.raw/*39.62*/("""</li>""")))}),format.raw/*39.68*/("""
    """),format.raw/*40.5*/("""</ul>
    """)))}),format.raw/*41.6*/("""
    """),format.raw/*42.5*/("""<hr>
    """),_display_(/*43.6*/user/*43.10*/.main.passwordInfo.map/*43.32*/ { info =>_display_(Seq[Any](format.raw/*43.42*/("""
	"""),format.raw/*44.2*/("""<a class="btn" href=""""),_display_(/*44.24*/env/*44.27*/.routes.passwordChangeUrl(Implicit.ctx()._requestHeader())),format.raw/*44.85*/("""">Change Password</a>
    """)))}),format.raw/*45.6*/("""

     """),format.raw/*47.6*/("""<span>Link this account to

    """),_display_(/*49.6*/env/*49.9*/.providers.values.map/*49.30*/ { provider =>_display_(Seq[Any](format.raw/*49.44*/("""
        """),_display_(/*50.10*/if( provider.authMethod == OAuth1 || provider.authMethod == OAuth2 )/*50.78*/ {_display_(Seq[Any](format.raw/*50.80*/("""
            """),_display_(/*51.14*/defining( "images/providers/%s.png".format(provider.id) )/*51.71*/ { imageUrl =>_display_(Seq[Any](format.raw/*51.85*/("""
            """),format.raw/*52.13*/("""<a href=""""),_display_(/*52.23*/env/*52.26*/.routes.authenticationUrl(provider.id, Some("/link-result"))),format.raw/*52.86*/(""""> <img src=""""),_display_(/*52.100*/securesocial/*52.112*/.controllers.routes.Assets.at(imageUrl)),format.raw/*52.151*/(""""/></a>
         """)))}),format.raw/*53.11*/("""
        """)))}),format.raw/*54.10*/("""
    """)))}),format.raw/*55.6*/("""
    """),format.raw/*56.5*/("""</span>

    <hr>
    <a class="btn" href=""""),_display_(/*59.27*/routes/*59.33*/.Application.linkResult()),format.raw/*59.58*/("""">Linked Accounts</a>
    <a class="btn" href=""""),_display_(/*60.27*/securesocial/*60.39*/.controllers.routes.LoginPage.logout()),format.raw/*60.77*/("""">Logout</a>
</div>
""")))}),format.raw/*62.2*/("""
"""))
      }
    }
  }

  def render(user:service.DemoUser,env:securesocial.core.RuntimeEnvironment): play.twirl.api.HtmlFormat.Appendable = apply(user,env)

  def f:((service.DemoUser,securesocial.core.RuntimeEnvironment) => play.twirl.api.HtmlFormat.Appendable) = (user,env) => apply(user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Oct 15 15:11:40 CEST 2018
                  SOURCE: C:/Users/Jann/Documents/IuK_III_W/fitbuddysocial/app/views/index.scala.html
                  HASH: 8f2556832d40d8d14df5173facc5d0988154a065
                  MATRIX: 995->1|1135->71|1190->121|1248->68|1276->151|1304->154|1356->198|1395->200|1423->202|1495->248|1507->252|1542->267|1576->275|1588->279|1622->293|1689->333|1702->337|1738->352|1867->454|1880->458|1913->470|1976->506|1989->510|2026->526|2085->558|2098->562|2134->577|2192->608|2205->612|2240->626|2298->657|2311->661|2346->675|2400->702|2413->706|2437->721|2486->732|2515->734|2541->739|2562->741|2610->768|2680->811|2693->815|2730->831|2781->856|2794->860|2823->880|2871->890|2904->896|2985->950|2998->954|3025->960|3080->988|3093->992|3121->999|3174->1022|3209->1031|3222->1035|3251->1055|3299->1065|3332->1071|3420->1132|3433->1136|3466->1148|3509->1164|3522->1168|3545->1182|3590->1189|3619->1190|3663->1207|3685->1208|3723->1215|3761->1226|3774->1230|3797->1244|3844->1253|3873->1254|3917->1271|3941->1274|3970->1275|4014->1288|4052->1299|4065->1303|4091->1320|4137->1328|4166->1329|4213->1349|4236->1351|4273->1357|4306->1363|4348->1375|4381->1381|4418->1392|4431->1396|4462->1418|4510->1428|4540->1431|4589->1453|4601->1456|4680->1514|4738->1542|4774->1551|4835->1586|4846->1589|4876->1610|4928->1624|4966->1635|5043->1703|5083->1705|5125->1720|5191->1777|5243->1791|5285->1805|5322->1815|5334->1818|5415->1878|5457->1892|5479->1904|5540->1943|5590->1962|5632->1973|5669->1980|5702->1986|5776->2033|5791->2039|5837->2064|5913->2113|5934->2125|5993->2163|6046->2186
                  LINES: 28->1|31->2|32->3|35->1|36->4|37->5|37->5|37->5|38->6|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|39->7|46->14|46->14|46->14|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|51->19|51->19|51->19|51->19|51->19|52->20|52->20|52->20|55->23|55->23|55->23|55->23|56->24|59->27|59->27|59->27|60->28|60->28|60->28|62->30|64->32|64->32|64->32|64->32|65->33|68->36|68->36|68->36|69->37|69->37|69->37|69->37|69->37|69->37|69->37|69->37|70->38|70->38|70->38|70->38|70->38|70->38|70->38|70->38|70->38|71->39|71->39|71->39|71->39|71->39|71->39|71->39|71->39|72->40|73->41|74->42|75->43|75->43|75->43|75->43|76->44|76->44|76->44|76->44|77->45|79->47|81->49|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|84->52|84->52|84->52|84->52|84->52|84->52|84->52|85->53|86->54|87->55|88->56|91->59|91->59|91->59|92->60|92->60|92->60|94->62
                  -- GENERATED --
              */
          