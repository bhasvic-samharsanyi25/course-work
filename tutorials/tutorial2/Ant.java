import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ant extends Actor
{
    /**
     * Act - do whatever the Ant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int collect = 0;
    public void act()
    {
        if (Greenfoot.isKeyDown("d")){
            setLocation(getX() + 5, getY());
                if (hitWall() == true){
                    setLocation(getX() - 5, getY());
                }
        }
        food();
        teleport();
        
        if (Greenfoot.isKeyDown("a")){
            setLocation(getX() - 5, getY());
                if (hitWall() == true){
                    setLocation(getX() + 5, getY());
                }
        }
        
        if (Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY() - 5);
                if (hitWall() == true){
                    setLocation(getX(), getY() + 5);
                }
        }
        
        if (Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY() + 5);
                if (hitWall() == true){
                    setLocation(getX(), getY() - 5 );
                }
        }
        youWin();
        youLose();
    }
    public boolean hitWall() {
        if( isTouching(walls.class)){
            return(true);
        }
        
        else{
        return false;
        }
    }
    public void food(){
        if (getOneIntersectingObject(bread.class)!= null){
            getWorld().removeObject(getOneIntersectingObject(bread.class));
            collect++;
        }
    
    }
    public void teleport(){
        if (getOneIntersectingObject(teleport.class)!= null){
            setLocation(10,10);
        }
    }
    public boolean hitEnemy() {
        if( isTouching(enemy.class) ||isTouching(frog.class)){
            return(true);
        }
        
        else{
        return false;
        }
    }
    public void youLose() {
    
        if (hitEnemy()){
            getWorld().addObject(new youLose(),600,400);
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
    }
    public void youWin(){
        if (isTouching(youWin.class) && collect == 6){
            getWorld().addObject(new winner(), 600, 400);
            Greenfoot.stop();
        }
    }
}
