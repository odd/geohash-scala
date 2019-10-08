organization := "com.github.davidallsopp"

name := "geohash-scala"

version := "0.7.1"

scalaVersion := "2.13.1"

resolvers ++= Seq(
  "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.14.2" % "test"
)

//org.scalastyle.sbt.ScalastylePlugin.Settings
