# pro-Kabaddi-round-robbin

Problem
Build the domain model only that generates the round robin schedule for the PRO-Kabaddi event that
conforms to the following constraints
- Accept N number of teams
- Each team must play against every other team once home and away
- Maximum 2 matches per day are allowed
- No team should play on consecutive dayself 

====================================================================

Solution:

Its a Spring boot application with REST api. 


Run below class to start the spring boot application 
->  ProKabaddiRoundRobbinApplication

After start of the application you can call below end points :
http://localhost:8080/allTeams
- will give all the teams info.

http://localhost:8080/schedule
- will give all the match schedule info in jason format

http://localhost:8080/scheduleDetails
- will give all the match schedule info in String 

Below is the sample output from the logs and details :


    Team1   vs     Team2    --> Location  ---> Date 
 
====================================================================================

     Bengaluru Bulls vs Jaipur Pink Panthers --> Bengalore ---> 2019-04-02T18:08:37.022  
     U Mumba vs Puneri Paltan --> Mumba ---> 2019-04-16T18:08:37.022  
     Jaipur Pink Panthers vs Telugu Titans --> Jaipur ---> 2019-03-31T18:08:37.022  
     Puneri Paltan vs Jaipur Pink Panthers --> Pune ---> 2019-04-06T18:08:37.022  
     Telugu Titans vs Bengaluru Bulls --> Hydrabad ---> 2019-04-16T18:08:37.022  
     U Mumba vs Patna Pirates --> Mumba ---> 2019-04-04T18:08:37.022  
     Jaipur Pink Panthers vs U Mumba --> Jaipur ---> 2019-04-18T18:08:37.022  
     U Mumba vs Bengaluru Bulls --> Mumba ---> 2019-04-06T18:08:37.022  
     Patna Pirates vs Bengaluru Bulls --> Patna ---> 2019-03-31T18:08:37.022  
     U Mumba vs Jaipur Pink Panthers --> Mumba ---> 2019-04-14T18:08:37.022  
     Patna Pirates vs Puneri Paltan --> Patna ---> 2019-04-12T18:08:37.022  
     Patna Pirates vs U Mumba --> Patna ---> 2019-04-08T18:08:37.022  
     Bengaluru Bulls vs Telugu Titans --> Bengalore ---> 2019-04-14T18:08:37.022  
     Telugu Titans vs U Mumba --> Hydrabad ---> 2019-04-10T18:08:37.022  
     Patna Pirates vs Telugu Titans --> Patna ---> 2019-04-06T18:08:37.022  
     Bengaluru Bulls vs Puneri Paltan --> Bengalore ---> 2019-04-18T18:08:37.022  
     U Mumba vs Telugu Titans --> Mumba ---> 2019-04-02T18:08:37.022  
     Bengaluru Bulls vs Patna Pirates --> Bengalore ---> 2019-04-10T18:08:37.022  
     Jaipur Pink Panthers vs Puneri Paltan --> Jaipur ---> 2019-04-10T18:08:37.022  
     Puneri Paltan vs U Mumba --> Pune ---> 2019-03-31T18:08:37.022  
     Puneri Paltan vs Patna Pirates --> Pune ---> 2019-04-02T18:08:37.022  
     Telugu Titans vs Jaipur Pink Panthers --> Hydrabad ---> 2019-04-04T18:08:37.022  
     Patna Pirates vs Jaipur Pink Panthers --> Patna ---> 2019-04-20T18:08:37.022  
     Jaipur Pink Panthers vs Bengaluru Bulls --> Jaipur ---> 2019-04-08T18:08:37.022  
     Jaipur Pink Panthers vs Patna Pirates --> Jaipur ---> 2019-04-16T18:08:37.022  
     Telugu Titans vs Puneri Paltan --> Hydrabad ---> 2019-04-20T18:08:37.022  
     Bengaluru Bulls vs U Mumba --> Bengalore ---> 2019-04-12T18:08:37.022  
     Telugu Titans vs Patna Pirates --> Hydrabad ---> 2019-04-18T18:08:37.022  
     Puneri Paltan vs Telugu Titans --> Pune ---> 2019-04-08T18:08:37.022  
     Puneri Paltan vs Bengaluru Bulls --> Pune ---> 2019-04-04T18:08:37.022  
