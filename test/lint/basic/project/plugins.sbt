addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.23")
libraryDependencies += "io.github.scalapb-json" %% System.getProperty("protoc-lint-artifact-id") % System.getProperty("protoc-lint-version")
resolvers += Resolver.mavenLocal
