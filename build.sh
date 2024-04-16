#!/bin/sh
set -e
mvn clean install
./plugins/idea/gradlew -b plugins/idea/build.gradle clean buildPlugin
# robovmx -- not focusing on eclipse plugin
# mvn -f plugins/eclipse/pom.xml clean install
./plugins/gradle/gradlew -b plugins/gradle/build.gradle clean assemble validatePlugins publishToMavenLocal
