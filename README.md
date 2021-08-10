# PreFlopTrainer

https://user-images.githubusercontent.com/60154921/128921519-8fc972ce-18c8-41a9-9544-9158370e4efc.mov


## Description

This java application is designed to train the user on what Preflop action to take depending on their starting hand in Texas Hold'em poker. 

## Usage 

The user is able to choose whether or not the game being simulated is generally tight or loose - tight meaning opposing players are generally only playing great starting hands, and loose meaning opposing players are playing with a wider range of hands than normal. 

The loose game creates a hashmap of hands and their correct action based off this chart: 

![image](https://user-images.githubusercontent.com/60154921/128922142-4708e0cf-d694-48e9-8daf-f4c8e9147df5.png)

The tight game creates a hashmap of hands and their correct action based off of this chart: 

![image](https://user-images.githubusercontent.com/60154921/128922040-4a665e21-7314-4d52-99c3-83e4ec5fda60.png)

The user is then given a two card hand and asked whether or not they would like to fold, call, or raise. The program then checks the user's action with the correct action assigned to that hand based on the charts.java file. The program will inform the user if they are correct or incorrect, then shuffle the deck and give the user another hand, repeating the process. 

The program will give the user their successful attempts/total attempts as their score at the conclusion of the program.
