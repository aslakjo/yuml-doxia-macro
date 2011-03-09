
import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info){

  val junitPlugin = "no.aslakjo" % "junitsbt-plugin" % "1.0" from "http://cloud.github.com/downloads/aslakjo/junitsbt-plugin/junitsbt-plugin-1.0.jar"

}
