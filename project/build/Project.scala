import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info){

  val doxiaCore = "org.apache.maven.doxia" %  "doxia-core" % "1.1.2"
  val doxiaApi =  "org.apache.maven.doxia" %  "doxia-sink-api" % "1.1.2"
  val commonsLang = "commons-lang" % "commons-lang" % "2.5"

  val mockito = "org.mockito" % "mockito-all" % "1.8.4" % "test"
  val junit = "junit" % "junit" % "4.8.2" % "test"

  val bryanjswift = "Bryan J Swift Repository" at "http://repos.bryanjswift.com/maven2/"
  val junitInterface = "com.novocode" % "junit-interface" % "0.4.0" % "test"

  override def testFrameworks = super.testFrameworks ++ List(new TestFramework("com.novocode.junit.JUnitFrameworkNoMarker"))

}