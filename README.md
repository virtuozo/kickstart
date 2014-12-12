kickstart
=========

Please, proceed to the following steps:

1. Change package structure in the src/main/java and src/main/resources");
2. Change Kickstart.gwt.xml accordingly
3. Change <groupid>, <artifactId>, <version> and <finalName> tags values in the pom.xml file to reflect your project settings
4. Still in pom.xml locate <properties> tag and change <main.package>, <module> and <web.target> to reflect your project settings

Steps to run this module

1. Package web content using mvn clean package -P gwt
2. Run development mode using mvn gwt:run -P gwt
3. Use the web browser to see the web page 
4. You can also use jetty plugin to run the compiled version using mvn jetty:run -P gwt