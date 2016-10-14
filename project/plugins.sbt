resolvers ++= Seq(
  Classpaths.typesafeReleases,
  Classpaths.sbtPluginReleases,
  Resolver.sonatypeRepo("snapshots")
)

logLevel := Level.Info

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.3")
addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "0.4.5")
