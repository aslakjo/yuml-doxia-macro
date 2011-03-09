import sbt._

import junitsbtplugin._

class Project(info: ProjectInfo) extends DefaultProject(info) with JUnit{

  val doxiaCore = "org.apache.maven.doxia" %  "doxia-core" % "1.1.2"
  val doxiaApi =  "org.apache.maven.doxia" %  "doxia-sink-api" % "1.1.2"
  val commonsLang = "commons-lang" % "commons-lang" % "2.5"

  val mockito = "org.mockito"   % "mockito-all" % "1.8.4" % "test"
  val junit = "junit" % "junit" % "4.8.2" % "test"
}