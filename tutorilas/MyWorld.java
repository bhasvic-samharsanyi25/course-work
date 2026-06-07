import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{


    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 900, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        person person = new person();
        addObject(person,600,0);
        enemy ship = new enemy();
        addObject(ship, 1222, 800);

        enemy enemy2 = new enemy();
        addObject(enemy2,994,555);
        enemy enemy3 = new enemy();
        addObject(enemy3,1274,106);
        enemy enemy4 = new enemy();
        addObject(enemy4,753,306);
        enemy enemy5 = new enemy();
        addObject(enemy5,387,569);
        enemy enemy6 = new enemy();
        addObject(enemy6,412,169);
        enemy enemy7 = new enemy();
        addObject(enemy7,1068,333);
        enemy enemy8 = new enemy();
        addObject(enemy8,1331,526);
        enemy enemy9 = new enemy();
        addObject(enemy9,631,588);
        enemy enemy10 = new enemy();
        addObject(enemy10,532,328);
        enemy enemy11 = new enemy();
        addObject(enemy11,996,168);
        enemy enemy12 = new enemy();
        addObject(enemy12,1339,264);
        enemy enemy13 = new enemy();
        addObject(enemy13,843,794);
        enemy enemy14 = new enemy();
        addObject(enemy14,186,828);
        enemy enemy15 = new enemy();
        addObject(enemy15,167,345);
        enemy enemy16 = new enemy();
        addObject(enemy16,786,462);
        removeObject(enemy16);
        removeObject(enemy4);
        removeObject(enemy10);
        removeObject(enemy5);
    }
}
