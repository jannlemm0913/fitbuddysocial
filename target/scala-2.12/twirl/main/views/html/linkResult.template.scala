
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

object linkResult extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[service.DemoUser,java.util.List[securesocial.core.BasicProfile],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(current: service.DemoUser, linkedIdentities: java.util.List[securesocial.core.BasicProfile]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.95*/("""

    """),_display_(/*3.6*/main("SecureSocial - Account Link Result")/*3.48*/ {_display_(Seq[Any](format.raw/*3.50*/("""
"""),format.raw/*4.1*/("""<div class="page-header">
    <h2><img src=""""),_display_(/*5.20*/current/*5.27*/.main.avatarUrl.getOrElse("")),format.raw/*5.56*/("""" alt=""""),_display_(/*5.64*/current/*5.71*/.main.firstName.getOrElse("")),format.raw/*5.100*/("""" width="40px" height="40px"/> Hey """),_display_(/*5.136*/current/*5.143*/.main.firstName.getOrElse("")),format.raw/*5.172*/("""</h2>
</div>

<div class="clearfix">
    <h2>You are linked to the following accounts:</h2>

    """),_display_(/*11.6*/linkedIdentities/*11.22*/.map/*11.26*/ { linked =>_display_(Seq[Any](format.raw/*11.38*/("""
        """),format.raw/*12.9*/("""<h2>"""),_display_(/*12.14*/linked/*12.20*/.providerId),format.raw/*12.31*/("""
        """),format.raw/*13.9*/("""</h2>
        <ul>
            <li>User Id: """),_display_(/*15.27*/linked/*15.33*/.userId),format.raw/*15.40*/("""</li>
            <li>Fist name: """),_display_(/*16.29*/linked/*16.35*/.firstName),format.raw/*16.45*/("""</li>
            <li>Last name: """),_display_(/*17.29*/linked/*17.35*/.lastName),format.raw/*17.44*/("""</li>
            <li>Full name: """),_display_(/*18.29*/linked/*18.35*/.fullName),format.raw/*18.44*/("""</li>
            <li>Logged in from: """),_display_(/*19.34*/linked/*19.40*/.providerId),format.raw/*19.51*/("""</li>
            <li>Email: """),_display_(/*20.25*/linked/*20.31*/.email.map/*20.41*/ { email =>_display_(Seq[Any](format.raw/*20.52*/(""" """),_display_(/*20.54*/email),format.raw/*20.59*/(""" """)))}/*20.61*/.getOrElse("Not Available")),format.raw/*20.88*/("""</li>
            <li>Authentication method: """),_display_(/*21.41*/linked/*21.47*/.authMethod),format.raw/*21.58*/("""</li>
        </ul>

        """),_display_(/*24.10*/linked/*24.16*/.oAuth1Info.map/*24.31*/ { info =>_display_(Seq[Any](format.raw/*24.41*/("""
        """),format.raw/*25.9*/("""<h4>OAuth1 Info</h4>

        <ul>
            <li>Token: """),_display_(/*28.25*/info/*28.29*/.token),format.raw/*28.35*/("""</li>
            <li>Secret: """),_display_(/*29.26*/info/*29.30*/.secret),format.raw/*29.37*/("""</li>
        </ul>
        """)))}),format.raw/*31.10*/("""

        """),_display_(/*33.10*/linked/*33.16*/.oAuth2Info.map/*33.31*/ { info =>_display_(Seq[Any](format.raw/*33.41*/("""
        """),format.raw/*34.9*/("""<h4>OAuth2 Info</h4>

        <ul>
            <li>Access Token: """),_display_(/*37.32*/info/*37.36*/.accessToken),format.raw/*37.48*/("""</li>
            """),_display_(/*38.14*/info/*38.18*/.tokenType.map/*38.32*/ { t =>_display_(Seq[Any](format.raw/*38.39*/(""" """),format.raw/*38.40*/("""<li>Token Type: """),_display_(/*38.57*/t),format.raw/*38.58*/("""</li> """)))}),format.raw/*38.65*/("""
            """),_display_(/*39.14*/info/*39.18*/.expiresIn.map/*39.32*/ { exp =>_display_(Seq[Any](format.raw/*39.41*/(""" """),format.raw/*39.42*/("""<li>Expires in: """),_display_(/*39.59*/exp),format.raw/*39.62*/(""" """),format.raw/*39.63*/("""seconds</li>""")))}),format.raw/*39.76*/("""
            """),_display_(/*40.14*/info/*40.18*/.refreshToken.map/*40.35*/ { rt =>_display_(Seq[Any](format.raw/*40.43*/(""" """),format.raw/*40.44*/("""<li>Refresh Token: """),_display_(/*40.64*/rt),format.raw/*40.66*/("""</li>""")))}),format.raw/*40.72*/("""
        """),format.raw/*41.9*/("""</ul>
        """)))}),format.raw/*42.10*/("""

        """),format.raw/*44.9*/("""<hr>
    """)))}),format.raw/*45.6*/("""
"""),format.raw/*46.1*/("""</div>

<a class="btn" href="/">Ok</a>
""")))}))
      }
    }
  }

  def render(current:service.DemoUser,linkedIdentities:java.util.List[securesocial.core.BasicProfile]): play.twirl.api.HtmlFormat.Appendable = apply(current,linkedIdentities)

  def f:((service.DemoUser,java.util.List[securesocial.core.BasicProfile]) => play.twirl.api.HtmlFormat.Appendable) = (current,linkedIdentities) => apply(current,linkedIdentities)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Oct 15 12:34:05 CEST 2018
                  SOURCE: C:/Users/Jann/Documents/IuK_III_W/fitbuddysocial/app/views/linkResult.scala.html
                  HASH: 950e65d444f42a4173fa01898ea721ef1fbfec7e
                  MATRIX: 1010->1|1198->94|1232->103|1282->145|1321->147|1349->149|1421->195|1436->202|1485->231|1519->239|1534->246|1584->275|1647->311|1663->318|1713->347|1843->451|1868->467|1881->471|1931->483|1968->493|2000->498|2015->504|2047->515|2084->525|2158->572|2173->578|2201->585|2263->620|2278->626|2309->636|2371->671|2386->677|2416->686|2478->721|2493->727|2523->736|2590->776|2605->782|2637->793|2695->824|2710->830|2729->840|2778->851|2807->853|2833->858|2854->860|2902->887|2976->934|2991->940|3023->951|3083->984|3098->990|3122->1005|3170->1015|3207->1025|3296->1087|3309->1091|3336->1097|3395->1129|3408->1133|3436->1140|3498->1171|3538->1184|3553->1190|3577->1205|3625->1215|3662->1225|3758->1294|3771->1298|3804->1310|3851->1330|3864->1334|3887->1348|3932->1355|3961->1356|4005->1373|4027->1374|4065->1381|4107->1396|4120->1400|4143->1414|4190->1423|4219->1424|4263->1441|4287->1444|4316->1445|4360->1458|4402->1473|4415->1477|4441->1494|4487->1502|4516->1503|4563->1523|4586->1525|4623->1531|4660->1541|4707->1557|4746->1569|4787->1580|4816->1582
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|37->5|37->5|37->5|37->5|37->5|37->5|43->11|43->11|43->11|43->11|44->12|44->12|44->12|44->12|45->13|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|52->20|52->20|52->20|52->20|52->20|52->20|52->20|52->20|53->21|53->21|53->21|56->24|56->24|56->24|56->24|57->25|60->28|60->28|60->28|61->29|61->29|61->29|63->31|65->33|65->33|65->33|65->33|66->34|69->37|69->37|69->37|70->38|70->38|70->38|70->38|70->38|70->38|70->38|70->38|71->39|71->39|71->39|71->39|71->39|71->39|71->39|71->39|71->39|72->40|72->40|72->40|72->40|72->40|72->40|72->40|72->40|73->41|74->42|76->44|77->45|78->46
                  -- GENERATED --
              */
          