import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    public Start()
    {
        this.getImage().scale(750, 440);
        Greenfoot.playSound("backgroundfix.wav");
    }
    
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        removeBg();
    }
    
    public void removeBg()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            getWorld().removeObject(this);
        }
    }
}
