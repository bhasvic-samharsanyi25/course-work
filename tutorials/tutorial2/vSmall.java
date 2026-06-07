import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vSmall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vSmall extends walls
{
    /**
     * Act - do whatever the vSmall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public vSmall(){
        getImage().scale(getImage().getWidth() * 4, getImage().getHeight() * 2);
        setRotation(90);
    }
    public void act()
    {
        // Add your action code here.
    }
}
