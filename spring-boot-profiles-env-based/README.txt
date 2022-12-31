-- we can use @ConfigurationProperties to enable the configuration based mapping and yml file for maintating the env wise configuration

$ mvn package
$ java -jar -Dspring.profiles.active=dev target/spring-boot-profile-1.0.jar

$ java -jar -Dspring.profiles.active=test target/spring-boot-profile-1.0.jar

$ java -jar -Dspring.profiles.active=prod target/spring-boot-profile-1.0.jar
	

--we can refer below link for more details/examples
link : https://www.baeldung.com/spring-enable-config-properties