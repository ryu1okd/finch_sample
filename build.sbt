name := "finch_sample"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.github.finagle" %% "finch-core" % "0.11.0-M4",
  "org.scalatra.scalate" %% "scalate-core" % "1.7.0"
)