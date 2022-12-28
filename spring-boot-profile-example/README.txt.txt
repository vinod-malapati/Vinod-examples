#default profile, sunny day!
$ java -jar target/spring-boot-profile-example-1.0.jar
Today is sunny day!

-- Adding profile through vm arguments eg : -Dspring.profiles.active=raining
# set a profile
$ java -jar -Dspring.profiles.active=raining target/spring-boot-profile-example-1.0.jar
Today is raining day! 	
	
	

-- we can enable spring profiles in different ways, we can refer below link for more details
link : https://www.baeldung.com/spring-profiles