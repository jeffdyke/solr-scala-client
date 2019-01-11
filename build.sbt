lazy val commonSettings = Seq(
  name := "solr-scala-client",
  organization := "jeffdyke",
  version := "0.0.20",
  scalaVersion := "2.12.7",
  scalacOptions += "-feature",
  crossScalaVersions := Seq("2.11.12", "2.12.7", "2.13.0-M5"),
  libraryDependencies ++= Seq(
    "org.apache.solr"         % "solr-solrj"               % "7.1.0",
    "com.squareup.okhttp3"    % "okhttp"                   % "3.9.1",
    "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.1",
    "org.scalatest"          %% "scalatest"                % "3.0.6-SNAP4" % "test",
    "org.mockito"             % "mockito-core"             % "2.2.22"      % "test",
    "commons-logging"         % "commons-logging"          % "1.2"         % "runtime"
  ),
  skip in publish := true
)

lazy val publishSettings = Seq(
  skip in publish := false,
  bintrayOrganization := Some("jeffdyke"),
  bintrayRepository := "solr-scala-client",
  bintrayReleaseOnPublish in ThisBuild := false,
  licenses ++= Seq(("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0")))
)

lazy val root = project.in(file(".")).settings(commonSettings ++ publishSettings)
    //publishTo := Some(
//  "bintray" at
//    "https://dl.bintray.com/jeffdyke/solr-scala-client/;publish=1")
// credentials += Credentials(Path.userHome / ".sbt" / ".credentials")
//publishMavenStyle := false
//
//
//scalacOptions := Seq("-deprecation", "-feature")
//
//publishArtifact in Test := false
//
//pomIncludeRepository := { _ => false }
//
//pomExtra := (
//  <url>https://github.com/jeffdyke/solr-scala-client</url>
//  <licenses>
//    <license>
//      <name>The Apache Software License, Version 2.0</name>
//      <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
//    </license>
//  </licenses>
//  <scm>
//    <url>https://github.com/jeffdyke/solr-scala-client</url>
//    <connection>scm:git:https://github.com/jeffdyke/solr-scala-client.git</connection>
//  </scm>
//  <developers>
//    <developer>
//      <id>jeffdyke</id>
//      <name>Jeff Dyke</name>
//    </developer>
//  </developers>
//)
