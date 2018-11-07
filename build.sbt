name := """fitbuddysocial"""
organization := "bigbossnass"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.6"

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  guice,
  "ws.securesocial" %% "securesocial" % "master-SNAPSHOT",
  javaCore,
  ehcache
)