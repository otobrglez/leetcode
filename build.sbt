val scala3Version = "3.6.4"

ThisBuild / scalaVersion := scala3Version

lazy val root = project
  .in(file("."))
  .settings(
    name         := "LeetcodeAdventure",
    version      := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit"              % "1.1.0"  % Test,
      "org.scalameta" %% "munit-scalacheck"   % "1.1.0"  % Test,
      "org.scalactic" %% "scalactic"          % "3.2.19",
      "org.scalatest" %% "scalatest"          % "3.2.19" % Test,
      "org.scalatest" %% "scalatest-flatspec" % "3.2.19" % Test
    )
  )

addCommandAlias("fmt", ";scalafmtAll;scalafmtSbt")
