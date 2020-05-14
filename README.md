# PhnoneListApi
This is MAVEN Springbot project based on Java 1.8

Install and Run the project

1. Download the project from Github
2. Import the project as maven project in your favourite tool
3. Run as Java Application to start the aapplication from client tool

or

4. Build the project as maven build(goal: clean install)  which will generate "phone-application-0.0.1-SNAPSHOT.jar"
5. Run the Springbot as Jar file :
java -jar phone-application-0.0.1-SNAPSHOT.jar
 
6. Run Junit test by executing the project as Junit test from favourite tool(Junit test class : PhoneApplicationTests.Java)
7. Rest service endpoint:
http://localhost:8080/phone/getPhoneList/2039999988

Output(sample json):
{
  "phoneNumber":"2039999988",
  "listComb":["a0dwwwwwtt","a0dwwwwwtu","a0dwwwwwtv"]
}
