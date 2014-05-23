#OOGASalad
===============

See API_doc_updated.pdf for an in-depth walkthrough of the design of the project.


### Overview
This project was completed by a 11 person team (including myself). I, along with Lee Weisberger, developed the engine used to play the games created in the authoring enviroment.

**Team Members: ** Parker Hegstrom, Lee Weisberger, Sanmay Jain, Davis Treybig, Jacob Lettie, Richard Cao, Peter Yom, Brandon Chao, Benson Tran, Pritam Mathivanan

This repository is a 2D RPG game authoring environment and engine that allows users with no coding experience to create their own 2D RPG engines. The project features a graphical user interface with click and drag functionality that provides the user with a mechanism to create the layout of the game. Once the game has been created in the authoring environment, the game is saved using JSON, and created using the game engine.

## How to Create Your Game
1. Open ``src/authoring/Main.java``
2. Add a player, add objects, NPCs, create conversations, create new worlds, etc.
3. Click Save game, and give it a name. This will create a JSON file located in ``src/SavedGames/nameoffile``
4. Open and run ``src/GameView/Main.java``. A screen will appear where you can choose which game to enter, pick one. The actual game selection happens next.
5. Enter the name of the game you created in the authoring environment and press enter. 
6. Your game should now run. If you would like to exit, press SPACEBAR - exit. This will get you back to the loading screen where you can load another game.


## Included Games
I went ahead and included two games that were created by my team to demonstrate in our final presentation. Those games are called: <br><br>
**ChoiceGame: ** A that lets you pick and choice your quest. Heavily controlled by dialogue and how the user responds. <br><br>
**Pokemon: ** This game was meant to simulate pokemon. You can battle people and purchase items.

Enjoy



