In order to build the splitted project, you need to configure a JDK 1.5
bootstrap classpath `rt.jar` file to use. The build file uses the variable
`jdk5rtjar` which you need to define for the project, for example in you
user-specific gradle configuration in `~/.gradle` like so:

    jdk5rtjar=path/to/jdk1.5.0_22/jre/lib/rt.jar
