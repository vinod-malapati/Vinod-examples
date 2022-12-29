-- below code can be added in yml file to enable the default profile
spring:
    profiles:
        active:
            - dev

$ mvn package

# The 'dev' profile is configured in application.properties

# Profile : dev , picks application-dev.properties or YAML
$ java -jar target/spring-boot-profile-1.0.jar

ServerProperties{email='dev@mkyong.com', cluster=[
	Cluster{ip='127.0.0.1', path='/dev1'},
	Cluster{ip='127.0.0.2', path='/dev2'},
	Cluster{ip='127.0.0.3', path='/dev3'}
]}

# Profile : prod, picks application-prod.properties or YAML
$ java -jar -Dspring.profiles.active=prod target/spring-boot-profile-1.0.jar

ServerProperties{email='prod@mkyong.com', cluster=[
	Cluster{ip='192.168.0.1', path='/app1'},
	Cluster{ip='192.168.0.2', path='/app2'},
	Cluster{ip='192.168.0.3', path='/app3'}
]}

# Profile : abc, a non-exists profile
$ java -jar -Dspring.profiles.active=abc target/spring-boot-profile-1.0.jar
ServerProperties{email='null', cluster=[]}
	
	

-- we can enable spring profiles in different ways, we can refer below link for more details/examples
link : https://www.baeldung.com/spring-profiles
link : https://mkyong.com/spring-boot/spring-boot-profile-based-properties-and-yaml-example/