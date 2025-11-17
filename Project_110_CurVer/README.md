##########################################################################
-The program is built to run on java in vs code. To open the project use the run java arrow in the top right. (addon required)
-Open the project folder (The one containing main.java) by right clicking on the folder. If you are on windows click show more options then click open with code. once the workspace opens click on main.java and click the run arrow which should be near the top right of the file.

-You must trust the program for the arrow to show up.
-You can close the build with AI window if it pops up to provide you more space to see the code and console.

-For professor: I assume you are aware but since the code will be shifting as I learn the keyboard shortcut ctrl + f allows you to find chosen words in a document
and so looking for method names and statement types can be done with that.

##########################################################################
**PROJECT 1
*NO DATE

Lines 1 - 143 were all written in project 1.
This section mainly consists of allowing user to input custom values and names.
This also sets up the basic stories characters and locations.
##########################################################################
**PROJECT 2
*NO DATE

Multiple new if else statements on lines:
168 - 197 else if
239 - 289 else if
294 - 306 else if
311 - 315 if
318 - 332 else if

New While loops:
222 - 334
323 - 326 intentionally infinate

New For loop:
329 - 331

This addition is almost entirely one combat scenario allowing user to pick weapon and thus moveset.
##########################################################################
**PROJECT 3
*10/3/2025

Corrected spelling error on line 80

Combat:
Gutted previous combat code and added a method to call for combat as to remove bloat.
Changed the way combat code works by allowing moves to be placed in any slot and still function.
Added second win/loss check before enemy attack in order to prevent taking damage after enemy has already died.
Altered documentation related to move choice as it was the primary factor altered

*10/5/2025
234 - 267 Started working on camp code

Required

Line 224 Array used for moveset list
Lines 215 216 Array used to host multiple character stats easier
Lines 260 - 262 enhanced for loop implementation, Used to print out move list
272+ Added choice

I apologize the choice doesn't mean a lot. I'm very mentally drained and part of me doesn't want to write everything from here on within an if statement and would like to learn a better way to implement significant meaningful choices.
##########################################################################
**FINAL PROJECT
*xx/xx/2025 forgot date. my bad.

I am counting the combat method from project 3 as one of my 4 methods

Added a checkParty method that "works with an array" as required
made addParty method that looks for an empty party slot to add a new party member. uses the "two parameters" needed. Also I believe falls into "input handling method". It is also overloaded now.

The overloaded method is called when adding Syldeva or bernard. each one seperately calls a different variation of addParty
##########################################################################
SWDV 110
**Project 1
*11/8/2025

Added character class containing stats and moves as well as functions to pull those from each instance of the object.

*11/9/2025
Added allegiance to character class. 

Added imports and packages so files can "speak" with one another.

Started writing the story for path A. while incomplete it's a fine base that finally establishes the goal.
Path B is still empty.(and has no trigger).

//Comment - I underestimated the size of this assignment and underperformed. Get ahead on work next week me!

##########################################################################
**Free Time
* 11/10/2025

added combat class.

combat class currently prints all the stats of each character in the party so long as they are the next node.
and also you only have a party of 3.

Added ability to set next node for a character and the ability to return a reference to that node.

FP:
Likely tie all party members to party leader and monsters to a monster party leader.

add a way to deal damage

Create a sorting system using the speed stat.

New party sorting system DO THIS FIRST PROBABLY!!!!!

* 11/11/2025

Renamed character class to characterNode class to prevent overlap with reserved words.

Added add to end for characterNode
Added print Party for character node printing all in the linked list

Combat now prints both teams members

Nodes now know the previous node that references them in the linked list so long as addAfter() method is run
or setPrevNode is run with head node as the input (Still need to add a head node.)

FP:
Make party sorting available to the player.

Combat needs to read the speed of each of up to 8 nodes(first 4 player and first 4 monster both ignoring head nodes) and then list each node by highest speed to lowest speed. needs to know how to skip null nodes.

add a way to read hp total of each side. 

give character a full heal method.

* 11/12/2025

Rewrote code for addAfter to a state so that it works so long as it is not the party head being moved.

the * symbol is now used in README file to denote a new entry. this is so new entries can be found with ctrl+f more easily. (Major entries will now have 2 * symbols)

Added a method to character that allows other methods and classes to find what is in characterNode linked list slot X and return it.

* 11/13/2025

Combat can now gather all combatants and sort them by speed.

created partySort Class
created a temporary sorting system. needs adjustment to be more user friendly.

* 11/14/2025

Gave CharacterNode a swap method.

* 11/15/2025

Removed commented out sort Party method.

PET THE DOG PET THE DOG PET THE DOG
##########################################################################
FUTURE PLANS

Rewrite combat, add shops, add a convoy inventory, rewrite party ordering code.

Give Syldeva and Bernard Stats

Continue story now with 2 whole paths

Add variables to determine enemy damage 
Ex:
randomDamageEnemy = randGen.nextInt(4)+1; ----> randomDamageEnemy = randGen.nextInt(En1Max)+En1Min;

Allow Enemies to select from multiple moves

Allow for hosting of multiple party members and enemies each combat.

Add locked moves and ability to unlock certain moves

Add Camp to allow player to customize moves
Add Party member switch out capability at Camp
Allow Sleep/heal at Camp

Find a way to track Hp at end of combat

Find a way to return both victory Status, Hp, and Mana values post-combat

Add ability for enemies and players to miss attacks?

If possible I'd like to make this run in an IDE of some sort that allows for visuals. Displaying backgrounds and combatants Final Fantasy Style.
Or
This last one is a stretch but I'd like to try my hand at making SRPG combat and having enemies and players use A* pathfinding to travel to their desired location.