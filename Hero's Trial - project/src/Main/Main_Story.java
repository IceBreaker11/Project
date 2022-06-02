package Main;

import java.util.Random;

import Classes.SuperClass;
import Classes.class_archer;
import Classes.class_knight;
import Classes.class_mage;
import Classes.class_normal;
import Monster.SuperMonster;
import Monster.monster_dragon;
import Monster.monster_elemental;
import Monster.monster_goblin;
import Monster.monster_goblin_horde;
import Monster.monster_lizardman;
import Monster.monster_ogre;
import Weapon.Superweapon;
import Weapon.weapon_legendarybow;
import Weapon.weapon_legendarystaff;
import Weapon.weapon_legendarysword;
import Weapon.weapon_none;
import Weapon.weapon_normalbow;
import Weapon.weapon_normalstaff;
import Weapon.weapon_normalsword;

public class Main_Story {

    Game game;
    UI ui;
    VisibilityManager vm;
    Player player = new Player();
    SuperMonster monster;
    Superweapon weapon;
    SuperClass Class;
    int sword = 1;
    int bow = 1;
    int staff = 1;

    public Main_Story(Game g, UI uInterface, VisibilityManager vManager) {

        game = g;
        ui = uInterface;
        vm = vManager;

    }

    public void selectPosition(String nextPosition) {

        switch (nextPosition) {

            case "fight":
                fight();
                break;
            case "playerAttack":
                playerAttack();
                break;
            case "retreat":
                retreat();
                break;
            case "monsterAttack":
                monsterAttack();
                break;
            case "win":
                win();
                break;
            case "lose":
                lose();
                break;
            case "closeGame":
                System.exit(0);
                break;
            case "toTitle":
                vm.showTitleScreen();
                break;
            case "ClassSelection":
                ClassSelection();
                break;
            case "Knight":
                Knight();
                break;
            case "Archer":
                Archer();
                break;
            case "Mage":
                Mage();
                break;
            case "firstTrial":
                firstTrial();
                break;
            case "Dragon_info":
                Dragon_info();
                break;

            case "Monster_info":
                Monster_info();
                break;
            case "EldenForest":
                EldenForest();
                break;
            case "Cave":
                cave();
                break;
            case "TrollBridge":
                TrollBridge();
                break;
            case "ElementalNest":
                EldenForest();
                break;
            case "Dragon":
                Dragon();
                break;
            case "Swamp":
                Swamp();
                break;
            case "fountain":
                fountain();
                break;
            case "Elemental":
                ElementalNest();
                break;
            case "lady":
                lady();
                break;
            case "legendarySword":
                legendarySword();
                break;
            case "legendaryBow":
                legendaryBow();
                break;
            case "legendaryStaff":
                legendaryStaff();
                break;

        }
    }

    // creating class selection
    public void ClassSelection() {

        // setting up default set-up
        player.coin = 0;
        ui.coinLabelNumber.setText("" + player.coin);
        weapon = new weapon_none();
        player.weapon = weapon.name;
        ui.weaponLabelName.setText("" + player.weapon);
        Class = new class_normal();
        player.currentClass = Class.name;
        player.hp = Class.health;
        player.dmg = Class.damage;
        player.spd = Class.speed;

        // displaying default stats to the screen
        ui.classLabelName.setText("" + player.currentClass);
        ui.hpLabelNumber.setText("" + player.hp);
        ui.dmgLabelNumber.setText("" + player.dmg);
        ui.spdLabelNumber.setText("" + player.spd);

        // displaying dialogue to game screen
        ui.mainTextArea.setText(
                "King: Welcome! You have been summoned to our world to be our Hero.\nBut first you need to embark on a trial to see if you are worthy of the title.\n\nTo start, choose your class:");
        // displaying choises
        ui.choice1.setText("Knight");
        ui.choice2.setText("Archer");
        ui.choice3.setText("Mage");
        ui.choice4.setText("");
        // initializing action command
        game.nextPosition1 = "Knight";
        game.nextPosition2 = "Archer";
        game.nextPosition3 = "Mage";
        game.nextPosition4 = "";

    }

    public void Knight() {
        weapon = new weapon_normalsword();
        player.weapon = weapon.name;
        ui.weaponLabelName.setText("" + player.weapon);
        Class = new class_knight();
        player.currentClass = Class.name;
        player.hp = Class.health + weapon.health;
        player.dmg = Class.damage + weapon.damage;
        player.spd = Class.speed + weapon.speed;

        // displaying default stats to the screen
        ui.classLabelName.setText("" + player.currentClass);
        ui.hpLabelNumber.setText("" + player.hp);
        ui.dmgLabelNumber.setText("" + player.dmg);
        ui.spdLabelNumber.setText("" + player.spd);

        ui.mainTextArea.setText(
                "King: Nice choice. Knights are known for their strong will and loyalty. Durability is their strength.\n\n\nYour stats have been changed to match those of Knights. Are you ready for the trial?");

        ui.choice1.setText("I am ready");
        ui.choice2.setText("I wish to change my class");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "firstTrial";
        game.nextPosition2 = "ClassSelection";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void Archer() {

        weapon = new weapon_normalbow();
        player.weapon = weapon.name;

        Class = new class_archer();
        player.currentClass = Class.name;
        player.hp = Class.health + weapon.health;
        player.dmg = Class.damage + weapon.damage;
        player.spd = Class.speed + weapon.speed;

        // displaying default stats to the screen
        ui.weaponLabelName.setText("" + player.weapon);
        ui.classLabelName.setText("" + player.currentClass);
        ui.hpLabelNumber.setText("" + player.hp);
        ui.dmgLabelNumber.setText("" + player.dmg);
        ui.spdLabelNumber.setText("" + player.spd);

        ui.mainTextArea.setText(
                "King: Interesting choice. Archers are very patient and calculated. They have very high mobility.\n\nYour stats have been changed to match those of Archers. Are you ready for the trial?");

        ui.choice1.setText("I am ready");
        ui.choice2.setText("I wish to change my class");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "firstTrial";
        game.nextPosition2 = "ClassSelection";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void Mage() {

        weapon = new weapon_normalstaff();
        player.weapon = weapon.name;
        ui.weaponLabelName.setText("" + player.weapon);
        Class = new class_mage();
        player.currentClass = Class.name;
        player.hp = Class.health + weapon.health;
        player.dmg = Class.damage + weapon.damage;
        player.spd = Class.speed + weapon.speed;

        // displaying default stats to the screen
        ui.classLabelName.setText("" + player.currentClass);
        ui.hpLabelNumber.setText("" + player.hp);
        ui.dmgLabelNumber.setText("" + player.dmg);
        ui.spdLabelNumber.setText("" + player.spd);

        ui.mainTextArea.setText(
                "King: Smart choice. Mages are scholars who studies the arcane. They are known for their long-ranged and high-damage attacks.\n\nYour stats have been changed to match those of Mages.Are you ready for the trial?");

        ui.choice1.setText("I am ready");
        ui.choice2.setText("I wish to change my class");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "firstTrial";
        game.nextPosition2 = "ClassSelection";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    // creating battle system
    public void fight() {

        ui.mainTextArea.setText(
                "Name: " + monster.name + "\n\nHealth: " + monster.health + "\n\nDamage: "
                        + monster.damage);
        ui.choice1.setText("Attack");
        ui.choice2.setText("Run away");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "playerAttack";
        game.nextPosition2 = "retreat";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void retreat() {

        int playerSpeed = new java.util.Random().nextInt(player.spd);
        int monsterSpeed = new java.util.Random().nextInt(monster.speed);
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        if (playerSpeed > monsterSpeed) {

            ui.mainTextArea.setText("You outran the " + monster.name + ". Fleeing succesful!");

            if (monster.name == "Dragon") {
                game.nextPosition1 = "Cave";
                game.nextPosition2 = "";
                game.nextPosition3 = "";
                game.nextPosition4 = "";
            }

            else {

                game.nextPosition1 = "EldenForest";
                game.nextPosition2 = "";
                game.nextPosition3 = "";
                game.nextPosition4 = "";
            }

        }

        else if (playerSpeed < monsterSpeed)

        {

            ui.mainTextArea.setText(monster.name + "'s Speed is too fast for you. You can't flee");
            game.nextPosition1 = "monsterAttack";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";

        }
    }

    public void playerAttack() {

        int playerDamage = new java.util.Random().nextInt(player.dmg);
        int playerSpeed = new java.util.Random().nextInt(player.spd);
        int monsterSpeed = new java.util.Random().nextInt(monster.speed);
        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");
        if (playerSpeed > monsterSpeed) {
            ui.mainTextArea.setText("You attacked the " + monster.name + " and dealt " + playerDamage + " damage!");
            monster.health = monster.health - playerDamage;

            while (monster.health > 0) {
                game.nextPosition1 = "monsterAttack";
                game.nextPosition2 = "";
                game.nextPosition3 = "";
                game.nextPosition4 = "";
                break;

            }
            if (monster.health < 1) {

                game.nextPosition1 = "win";
                game.nextPosition2 = "";
                game.nextPosition3 = "";
                game.nextPosition4 = "";

            }

        }

        else if (playerSpeed < monsterSpeed) {
            ui.mainTextArea.setText("The " + monster.name + " dodged your attack");
            game.nextPosition1 = "monsterAttack";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }

    }

    public void monsterAttack() {

        int monsterDamage = new Random().nextInt(monster.damage);
        int playerSpeed = new java.util.Random().nextInt(player.spd);
        int monsterSpeed = new java.util.Random().nextInt(monster.speed);

        ui.choice1.setText(">");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        if (playerSpeed < monsterSpeed) {
            ui.mainTextArea
                    .setText("The " + monster.name + " launched an attack. You received " + monsterDamage + " damage!");
            player.hp = player.hp - monsterDamage;
            ui.hpLabelNumber.setText("" + player.hp);

            while (player.hp > 0) {

                game.nextPosition1 = "fight";
                game.nextPosition2 = "";
                game.nextPosition3 = "";
                game.nextPosition4 = "";
                break;
            }

            if (player.hp < 1) {

                game.nextPosition1 = "lose";
                game.nextPosition2 = "";
                game.nextPosition3 = "";
                game.nextPosition4 = "";

            }

        }

        else if (playerSpeed > monsterSpeed) {
            ui.mainTextArea.setText("You dodged the " + monster.name + "'s attack.");

            game.nextPosition1 = "fight";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";

        }

    }

    public void win() {

        if (monster.name == "Dragon") {

            ui.mainTextArea.setText(
                    "Congratulations! You Passed the trial. Welcome to our world, our Hero.\n\n\nWould you like to play again?");
            ui.choice1.setText("Yes");
            ui.choice2.setText("No");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "toTitle";
            game.nextPosition2 = "closeGame";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }

        else {

            monster.coin = new java.util.Random().nextInt(monster.coin);
            player.coin = player.coin + monster.coin;
            ui.coinLabelNumber.setText("" + player.coin);
            ui.mainTextArea.setText(
                    "You killed the " + monster.name
                            + ". It dropped " + monster.coin
                            + " coin.\n\nThis area is filled with monsters. It's best to not go any deeper and fall back.");

            ui.choice1.setText(">");
            ui.choice2.setText("");
            ui.choice3.setText("");
            ui.choice4.setText("");

            game.nextPosition1 = "EldenForest";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";

        }

    }

    public void lose() {

        ui.mainTextArea.setText("You died from the battle. You lose.\n\n\nWould you like to play again?");
        ui.choice1.setText("Yes");
        ui.choice2.setText("No");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "toTitle";
        game.nextPosition2 = "closeGame";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    // creating the storyline

    public void firstTrial() {

        ui.mainTextArea.setText(
                "King: To see if you have what it takes to save our world, we will transport you to the Elden Forest. Ferocious monsters roam around the area. Your quest is to defeat the Dragon who settles in the cave far north in the forest.\n\n Are you ready?");

        ui.choice1.setText("I'm ready");
        ui.choice2.setText("About the Dragon...");
        ui.choice3.setText("About the Monsters...");
        ui.choice4.setText("");

        game.nextPosition1 = "EldenForest";
        game.nextPosition2 = "Dragon_info";
        game.nextPosition3 = "Monster_info";
        game.nextPosition4 = "";

    }

    public void Dragon_info() {

        ui.mainTextArea.setText(
                "King: That Dragon has been harassing nearby villages. It's scales are as hard as an iron, with burning breath that can destroy the forest.\n\nAs you are now, it's impossible for you to beat it. But fear not, the forest is equiped with everything you need. You just need to know where to look.");

        ui.choice1.setText("<");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "firstTrial";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void Monster_info() {

        ui.mainTextArea.setText(
                "King: Goblins and Ogres reside in the east side of the forest. Goblins are weak but sometimes they form groups. Ogres are strong but very slow. Elementals nests in the west side. They are powerful. Engage them wisely. Lizardmen lives in the south swamp. They're very agile creatures. ");
        ui.choice1.setText("<");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "firstTrial";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void EldenForest() {

        ui.mainTextArea.setText(
                "You are teleported in the center part of the Elden Forest. You feel the fresh yet threatening air of your surrounding. There are four paths around you.\n\n\nWhat will you do?");
        ui.choice1.setText("Go North");
        ui.choice2.setText("Go East");
        ui.choice3.setText("Go West");
        ui.choice4.setText("Go South");

        game.nextPosition1 = "Cave";
        game.nextPosition2 = "TrollBridge";
        game.nextPosition3 = "Elemental";
        game.nextPosition4 = "Swamp";

    }

    public void TrollBridge() {

        int x = new java.util.Random().nextInt(100) + 1;

        if (x <= 50) {
            monster = new monster_goblin();
        } else if (x > 50 && x <= 75) {
            monster = new monster_goblin_horde();
        } else {
            monster = new monster_ogre();
        }
        ui.mainTextArea.setText(
                "You are in a the Troll bridge area. This place is flooded with monsters.\n\nA monster approaches you. It seems you're not welcome here.\n\nWhat will you do?");
        ui.choice1.setText("Engage in battle");
        ui.choice2.setText("Go back");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "EldenForest";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void cave() {

        ui.mainTextArea.setText(
                "You are in the Northern part of the forest. You see the Dragon's cave further ahead.\nNear it's entrance you see an unknown lady.\nOn your right you see a fountain\n\n\nWhat will you do?");
        ui.choice1.setText("Enter Cave");
        ui.choice2.setText("Talk to the Lady");
        ui.choice3.setText("Drink from fountain");
        ui.choice4.setText("Go back");

        game.nextPosition1 = "Dragon";
        game.nextPosition2 = "lady";
        game.nextPosition3 = "fountain";
        game.nextPosition4 = "EldenForest";

    }

    public void Dragon() {

        monster = new monster_dragon();
        ui.mainTextArea.setText(
                "You encountered the Dragon. It roars thunderously, warning you to back off.\n\n\nWhat will you do?");
        ui.choice1.setText("Engage in battle");
        ui.choice2.setText("Go back");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "Cave";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void lady() {

        ui.mainTextArea.setText(
                "Lady: Hello there! You must be here to slay the dragon. I'm a merchant and I sell top quality weapons to assist you in your quest. Here are the prices:\n\tLegendary Sword --> 30 coins\n\tLegendary Bow --> 30 coins\n\tLegendary Staff --> 30 coins");
        ui.choice1.setText("Buy Legendary Sword");
        ui.choice2.setText("Buy Legendary Bow");
        ui.choice3.setText("Buy Legendary Staff");
        ui.choice4.setText("Go back");

        game.nextPosition1 = "legendarySword";
        game.nextPosition2 = "legendaryBow";
        game.nextPosition3 = "legendaryStaff";
        game.nextPosition4 = "Cave";

    }

    public void legendarySword() {

        weapon = new weapon_legendarysword();

        if (sword == 1 && player.currentClass == "Knight" && player.coin >= 30) {
            ui.mainTextArea.setText("Lady: Thank you for your purchase. May this weapon lead you to victory");
            // deducting sword cost to your current coin
            player.coin = player.coin - 30;
            // updating new amount of sword
            sword -= 1;
            // updating player stats
            player.weapon = weapon.name;
            player.hp = Class.health + weapon.health;
            player.dmg = Class.damage + weapon.damage;
            player.spd = Class.speed + weapon.speed;
            // displaying updated player stats to screen
            ui.weaponLabelName.setText("" + player.weapon);
            ui.classLabelName.setText("" + player.currentClass);
            ui.hpLabelNumber.setText("" + player.hp);
            ui.dmgLabelNumber.setText("" + player.dmg);
            ui.spdLabelNumber.setText("" + player.spd);
            ui.coinLabelNumber.setText("" + player.coin);

        }

        else if (sword == 0) {
            ui.mainTextArea.setText("Lady: You already purchased this weapon");

        }

        else if (sword == 1 && player.currentClass != "Knight") {

            ui.mainTextArea.setText("Lady: This weapon is not suited for your class. Try other weapons.");

        }

        else if (sword == 1 && player.coin < 30) {

            ui.mainTextArea.setText(
                    "Lady: You don't have enough coin. Try battling some monsters in the area to acquire more gold.");

        }

        ui.choice1.setText("<");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "lady";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void legendaryBow() {

        weapon = new weapon_legendarybow();

        if (bow == 1 && player.currentClass == "Archer" && player.coin >= 30) {
            ui.mainTextArea.setText("Lady: Thank you for your purchase. May this weapon lead you to victory");
            // deducting sword cost to your current coin
            player.coin = player.coin - 30;
            // updating new amount of sword
            bow -= 1;
            // updating player stats
            player.weapon = weapon.name;
            player.hp = Class.health + weapon.health;
            player.dmg = Class.damage + weapon.damage;
            player.spd = Class.speed + weapon.speed;
            // displaying updated player stats to screen
            ui.weaponLabelName.setText("" + player.weapon);
            ui.classLabelName.setText("" + player.currentClass);
            ui.hpLabelNumber.setText("" + player.hp);
            ui.dmgLabelNumber.setText("" + player.dmg);
            ui.spdLabelNumber.setText("" + player.spd);
            ui.coinLabelNumber.setText("" + player.coin);

        }

        else if (bow == 0) {
            ui.mainTextArea.setText("Lady: You already purchased this weapon");

        }

        else if (bow == 1 && player.currentClass != "Archer") {

            ui.mainTextArea.setText("Lady: This weapon is not suited for your class. Try other weapons.");

        }

        else if (bow == 1 && player.coin < 30) {

            ui.mainTextArea.setText(
                    "Lady: You don't have enough coin. Try battling some monsters in the area to acquire more gold.");

        }

        ui.choice1.setText("<");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "lady";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void legendaryStaff() {

        weapon = new weapon_legendarystaff();

        if (staff == 1 && player.currentClass == "Mage" && player.coin >= 30) {
            ui.mainTextArea.setText("Lady: Thank you for your purchase. May this weapon lead you to victory");
            // deducting sword cost to your current coin
            player.coin = player.coin - 30;
            // updating new amount of sword
            staff -= 1;
            // updating player stats
            player.weapon = weapon.name;
            player.hp = Class.health + weapon.health;
            player.dmg = Class.damage + weapon.damage;
            player.spd = Class.speed + weapon.speed;
            // displaying updated player stats to screen
            ui.weaponLabelName.setText("" + player.weapon);
            ui.classLabelName.setText("" + player.currentClass);
            ui.hpLabelNumber.setText("" + player.hp);
            ui.dmgLabelNumber.setText("" + player.dmg);
            ui.spdLabelNumber.setText("" + player.spd);
            ui.coinLabelNumber.setText("" + player.coin);

        }

        else if (staff == 0) {
            ui.mainTextArea.setText("Lady: You already purchased this weapon");

        }

        else if (staff == 1 && player.currentClass != "Mage") {

            ui.mainTextArea.setText("Lady: This weapon is not suited for your class. Try other weapons.");

        }

        else if (staff == 1 && player.coin < 30) {

            ui.mainTextArea.setText(
                    "Lady: You don't have enough coin. Try battling some monsters in the area to acquire more gold.");

        }

        ui.choice1.setText("<");
        ui.choice2.setText("");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "lady";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    public void fountain() {

        int healingWater = 20;
        ui.choice1.setText("Drink again");
        ui.choice2.setText("Go back");
        ui.choice3.setText("");
        ui.choice4.setText("");
        game.nextPosition1 = "fountain";
        game.nextPosition2 = "Cave";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

        while (healingWater > 0 && player.hp < (Class.health + weapon.health)) {

            ui.mainTextArea
                    .setText("You drank from the fountain and recovered 1 hp!");
            healingWater -= 1;

            player.hp++;
            ui.hpLabelNumber.setText("" + player.hp);
            break;

        }
        if (player.hp >= Class.health) {
            ui.mainTextArea.setText("You can't drink more or else you will get sick");
        }

        else if (healingWater < 1) {
            ui.mainTextArea.setText("The fountain is empty");
        }

    }

    public void ElementalNest() {

        monster = new monster_elemental();

        ui.mainTextArea.setText(
                "You are in the Elemental Nest. This place is full of powerful Elementals.\n\nAn Elemental shows hostility towards you. What will you do?");
        ui.choice1.setText("Engage in battle");
        ui.choice2.setText("Go back");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "EldenForest";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    public void Swamp() {

        monster = new monster_lizardman();

        ui.mainTextArea.setText(
                "You are in the swamp.This place is full of Lizardmen.\n\nA lizardman agressively approaches you. What will you do?");
        ui.choice1.setText("Engage in battle");
        ui.choice2.setText("Go back");
        ui.choice3.setText("");
        ui.choice4.setText("");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "EldenForest";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

}
