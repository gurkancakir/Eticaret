name := "Eticaret"

version := "1.0-SNAPSHOT"


scalaVersion := "2.11.7"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean).settings {
  libraryDependencies ++= Seq(
    jdbc,
    // https://adrianhurt.github.io/play-bootstrap/
    "com.adrianhurt" %% "play-bootstrap" % "1.0-P25-B3",
    "mysql" % "mysql-connector-java" % "5.1.36"
  )
}

libraryDependencies += javaJdbc