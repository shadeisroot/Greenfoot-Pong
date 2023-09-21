import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Slider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slider extends Actor
{
    private final int EAST = 0;
    private final int WEST = 1;
    private int count;
    private int speed = 3;
    
    public Slider()
    {
        
    }
    
    /**
     * Act - do whatever the Slider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKey();
        increaseSpeed();
    }
    
    public void checkKey()
    {
        if (Greenfoot.isKeyDown("left"))
        {
           setLocation(getX()-speed, getY());
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+speed, getY());
        }
    }
    
    public void increaseSpeed()
    {
        if (isTouching(Ball.class))
        {
            count += 1;
        }
        
        if (count >= 10)
        {
            speed = speed + 1;
            count = 0;
        }
    }
}
