import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info){

  val doxiaCore = "org.apache.maven.doxia" %  "doxia-core" % "1.1.2"
  val doxiaApi =  "org.apache.maven.doxia" %  "doxia-sink-api" % "1.1.2"
  val commonsLang = "commons-lang" % "commons-lang" % "2.5"

  

}