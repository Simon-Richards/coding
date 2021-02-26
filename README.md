## Requirements
* [Java SDK 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

## Usage
Run tests: ```./gradlew test```

Run app: ```./gradlew run```

Create project in IntelliJ: ```./gradlew idea```

##Testing Framework
Both JUnit and TestNG are available. For TestNG, if the following error appears:  

```No tests found for given includes: [XXXTest.XXX](filter.includeTestsMatching)``` 

Just navigate to ```Build, Execution, Deployment -> Build Tools -> Gradle```
 
 Open the dropdown in ```Build and run using``` and ```Run tests using``` and 
 select ```IntelliJ IDEA``` for both.