name := "algos"

version := "1.0"

organization := "org.bk.algos"

scalaVersion := "2.11.4"

libraryDependencies += "com.novocode" % "junit-interface" % "0.10-M2" % "test"

libraryDependencies += "log4j" % "log4j" % "1.2.16" % "test->default"

libraryDependencies += "junit" % "junit" % "4.11" % "test->default"

libraryDependencies += "org.slf4j" % "slf4j-api" % "1.6.1" % "test->default"

libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.6.1" % "test->default"

libraryDependencies += "org.hamcrest" % "hamcrest-core" % "1.2.1" % "test->default"

libraryDependencies += "org.hamcrest" % "hamcrest-library" % "1.2.1" % "test->default"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.0" % "test"

javaOptions += "-Xmx1G"
