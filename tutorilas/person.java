import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class person extends Actor
{
    int speed = 2;
    /**
     * Act - do whatever the person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        moveAround();
        hitenemy();
        youWin();
    }
    public void moveAround(){
        move(speed);
        if (Greenfoot.isKeyDown("d")){
        turn(10);
        }
        if (Greenfoot.isKeyDown("a")){
        turn(-10);
        }
        if (Greenfoot.isKeyDown("w")){
        speed = speed+1;
        }
        else {
        speed = speed/2;
        }
    }
    public void hitenemy() {
        if (isTouching(enemy.class)){
            getWorld().addObject(new youLose(),750, 450);
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
    public void youWin(){
        if (getY() >= 899){
        getWorld().addObject(new youwin(),750, 450);
        Greenfoot.stop();
        }
        
    }
}
        // Add your action code here.

    

