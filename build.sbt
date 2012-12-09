organization := "com.thesamet"

name := "kdtree"

version := "1.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.8" % "test"

scalacOptions ++= Seq("-unchecked", "-deprecation")

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { x => false }

pomExtra := (
  <url>https://github.com/thesamet/kdtree-scala</url>
  <licenses>
    <license>
      <name>The Apache Software License, Version 2.0</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
  <connection>scm:git:git@github.com:thesamet/kdtree-scala.git</connection>
    <url>https://github.com/thesamet/kdtree-scala</url>
    <connection>scm:git:git@github.com:janm399/specs2-spring.git</connection>
  </scm>
  <developers>
    <developer>
      <id>thesamet</id>
      <name>Nadav Samet</name>
      <url>http://www.thesamet.com</url>
    </developer>
  </developers>
)

publishTo <<= version { v: String =>
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
