import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vTall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vTall extends walls
{
    /**
     * Act - do whatever the vTall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public vTall(){
        getImage().scale(getImage().getWidth() * 20, getImage().getHeight() * 2);
        setRotation(90);
    }
    public void act()
    {
        // Add your action code here.
    }
}
