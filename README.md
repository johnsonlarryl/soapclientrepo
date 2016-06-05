# SOAP Client Project 

1. Add the "src/test/jaxp.properties" to your local JDK $JAVA_HOME/jre/lib/ directory to enable WSDl generate for secure parts of XSD's in WSDL
2. Run "mvn jaxws:wsimport" in the home directory of the "wsimport" maven project in order to generate stub SOAP Web Service Client code
3. Run "mvn clean install" in the home directory of the "wsimport" maven project to build project and generate jar file
4. cd to "target" directory in the home directory of the "wsimport" maven project 
5. Run "java -jar wsimport-example-1.0-SNAPSHOT.jar" in the "target" subdirectory of the "wsimport" maven project in order to run the application
