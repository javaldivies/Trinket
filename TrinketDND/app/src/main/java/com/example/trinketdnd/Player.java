package com.example.trinketdnd;

import java.sql.Driver;

public class Player {
    public int strength;
    public int dexterity;
    public int constitution;
    public int intelligence;
    public int wisdom;
    public int charisma;
    public String raceName;
    public Player() {
        // Generate Strength Value
        int[] strNumbers = new int[4];
        generateRandom randInt = new generateRandom();
        strNumbers[0] = randInt.random(2, 6);
        randInt = new generateRandom();
        strNumbers[1] = randInt.random(2, 6);
        randInt = new generateRandom();
        strNumbers[2] = randInt.random(2, 6);
        randInt = new generateRandom();
        strNumbers[3] = randInt.random(2, 6);
        int smallest = strNumbers[0];
        for (int i = 1; i < 4; i++) {
            if (strNumbers[i] < smallest) {
                smallest = strNumbers[i];
            }
        }
        strength = strNumbers[0] + strNumbers[1] + strNumbers[2] + strNumbers[3] - smallest;
        // Generate Dexterity Value
        int[] dexNumbers = new int[4];
        randInt = new generateRandom();
        dexNumbers[0] = randInt.random(2, 6);
        randInt = new generateRandom();
        dexNumbers[1] = randInt.random(2, 6);
        randInt = new generateRandom();
        dexNumbers[2] = randInt.random(2, 6);
        randInt = new generateRandom();
        dexNumbers[3] = randInt.random(2, 6);
        smallest = dexNumbers[0];
        for (int i = 1; i < 4; i++) {
            if (dexNumbers[i] < smallest) {
                smallest = dexNumbers[i];
            }
        }
        dexterity = dexNumbers[0] + dexNumbers[1] + dexNumbers[2] + dexNumbers[3] - smallest;
        // Generate Constitution Value
        int[] conNumbers = new int[4];
        randInt = new generateRandom();
        conNumbers[0] = randInt.random(2, 6);
        randInt = new generateRandom();
        conNumbers[1] = randInt.random(2, 6);
        randInt = new generateRandom();
        conNumbers[2] = randInt.random(2, 6);
        randInt = new generateRandom();
        conNumbers[3] = randInt.random(2, 6);
        smallest = conNumbers[0];
        for (int i = 1; i < 4; i++) {
            if (conNumbers[i] < smallest) {
                smallest = conNumbers[i];
            }
        }
        constitution = conNumbers[0] + conNumbers[1] + conNumbers[2] + conNumbers[3] - smallest;
        // Generate Intelligence Value
        int[] intNumbers = new int[4];
        randInt = new generateRandom();
        intNumbers[0] = randInt.random(2, 6);
        randInt = new generateRandom();
        intNumbers[1] = randInt.random(2, 6);
        randInt = new generateRandom();
        intNumbers[2] = randInt.random(2, 6);
        randInt = new generateRandom();
        intNumbers[3] = randInt.random(2, 6);
        smallest = intNumbers[0];
        for (int i = 1; i < 4; i++) {
            if (intNumbers[i] < smallest) {
                smallest = intNumbers[i];
            }
        }
        intelligence = intNumbers[0] + intNumbers[1] + intNumbers[2] + intNumbers[3] - smallest;
        // Generate Wisdom Value
        int[] wisNumbers = new int[4];
        randInt = new generateRandom();
        wisNumbers[0] = randInt.random(2, 6);
        randInt = new generateRandom();
        wisNumbers[1] = randInt.random(2, 6);
        randInt = new generateRandom();
        wisNumbers[2] = randInt.random(2, 6);
        randInt = new generateRandom();
        wisNumbers[3] = randInt.random(2, 6);
        smallest = wisNumbers[0];
        for (int i = 1; i < 4; i++) {
            if (wisNumbers[i] < smallest) {
                smallest = wisNumbers[i];
            }
        }
        wisdom = wisNumbers[0] + wisNumbers[1] + wisNumbers[2] + wisNumbers[3] - smallest;
        // Generate Charisma Value
        int[] chaNumbers = new int[4];
        randInt = new generateRandom();
        chaNumbers[0] = randInt.random(2, 6);
        randInt = new generateRandom();
        chaNumbers[1] = randInt.random(2, 6);
        randInt = new generateRandom();
        chaNumbers[2] = randInt.random(2, 6);
        randInt = new generateRandom();
        chaNumbers[3] = randInt.random(2, 6);
        smallest = chaNumbers[0];
        for (int i = 1; i < 4; i++) {
            if (chaNumbers[i] < smallest) {
                smallest = chaNumbers[i];
            }
        }
        charisma = chaNumbers[0] + chaNumbers[1] + chaNumbers[2] + chaNumbers[3] - smallest;
        randInt = new generateRandom();
        int raceChoice = randInt.random(1, 9);
        if (raceChoice == 1) {
            strength += 2;
            charisma += 1;
            randInt = new generateRandom();
            int dragonbornChoice = randInt.random(1, 10);
            String dragonbornColor = "";
            if (dragonbornChoice == 1) {
                dragonbornColor = "Black";
            } else if (dragonbornChoice == 2) {
                dragonbornColor = "Blue";
            } else if (dragonbornChoice == 3) {
                dragonbornColor = "Brass";
            } else if (dragonbornChoice == 4) {
                dragonbornColor = "Bronze";
            } else if (dragonbornChoice == 5) {
                dragonbornColor = "Copper";
            } else if (dragonbornChoice == 6) {
                dragonbornColor = "Gold";
            } else if (dragonbornChoice == 7) {
                dragonbornColor = "Green";
            } else if (dragonbornChoice == 8) {
                dragonbornColor = "Red";
            } else if (dragonbornChoice == 9) {
                dragonbornColor = "Silver";
            } else if (dragonbornChoice == 10) {
                dragonbornColor = "White";
            }
            raceName = dragonbornColor + " Dragonborn";
        } else if (raceChoice == 2) {
            constitution += 2;
            randInt = new generateRandom();
            int dwarfChoice = randInt.random(1, 2);
            if (dwarfChoice == 1) {
                wisdom += 1;
                raceName = "Hill Dwarf";
            } else if (dwarfChoice == 2) {
                strength += 2;
                raceName = "Mountain Dwarf";
            }
        } else if (raceChoice == 3) {
            dexterity += 2;
            randInt = new generateRandom();
            int elfChoice = randInt.random(1, 2);
            if (elfChoice == 1) {
                intelligence += 1;
                raceName = "High Elf";
            } else if (elfChoice == 2) {
                wisdom += 1;
                raceName = "Wood Elf";
            }
        } else if (raceChoice == 4) {
            intelligence += 2;
            randInt = new generateRandom();
            int gnomeChoice = randInt.random(1, 2);
            if (gnomeChoice == 1) {
                dexterity += 1;
                raceName = "Deep Gnome";
            } else if (gnomeChoice == 2) {
                constitution += 1;
                raceName = "Rock Gnome";
            }
        } else if (raceChoice == 5) {
            charisma += 2;
            int[] bonusStats = new int[2];
            randInt = new generateRandom();
            bonusStats[0] = randInt.random(1,5);
            randInt = new generateRandom();
            bonusStats[1] = randInt.random(1,5);
            while (bonusStats[0] == bonusStats[1]) {
                randInt = new generateRandom();
                bonusStats[1] = randInt.random(1,5);
            }
            if (bonusStats[0] == 1 || bonusStats[1] == 1) {
                strength += 1;
            } else if (bonusStats[0] == 2 || bonusStats[1] == 2) {
                dexterity += 1;
            } else if (bonusStats[0] == 3 || bonusStats[1] == 3) {
                constitution += 1;
            } else if (bonusStats[0] == 4 || bonusStats[1] == 4) {
                intelligence += 1;
            } else if (bonusStats[0] == 5 || bonusStats[1] == 5) {
                wisdom += 1;
            }
            raceName = "Half-Elf";
        } else if (raceChoice == 6) {
            dexterity += 2;
            randInt = new generateRandom();
            int halflingChoice = randInt.random(1, 2);
            if (halflingChoice == 1) {
                charisma += 1;
                raceName = "Lightfoot Halfling";
            } else if (halflingChoice == 2) {
                constitution += 1;
                raceName = "Stout Halfling";
            }

        } else if (raceChoice == 7) {
            strength += 2;
            constitution += 1;
            raceName = "Half-Orc";
        } else if (raceChoice == 8) {
            strength += 1;
            dexterity += 1;
            constitution += 1;
            intelligence += 1;
            wisdom += 1;
            charisma += 1;
            raceName = "Human";
        } else if (raceChoice == 9) {
            charisma += 2;
            intelligence += 1;
            raceName = "Tiefling";

        }
    }

}