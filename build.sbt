organization := "com.github.davidallsopp"

name := "geohash-scala"

version := "0.7"

scalaVersion := "2.12.3"

resolvers ++= Seq(
  "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"
)

//org.scalastyle.sbt.ScalastylePlugin.Settings
