name := "helloDatabase"

version := "0.1"

scalaVersion := "2.12.3"

resolvers +=
  "AWS Redshift JDBC Driver" at "http://redshift-maven-repository.s3-website-us-east-1.amazonaws.com/release"

// Redshift jdbc driver
libraryDependencies += "com.amazon.redshift"      % "redshift-jdbc42"   % "1.2.1.1001"
