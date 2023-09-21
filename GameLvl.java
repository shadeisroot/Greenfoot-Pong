import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameLvl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameLvl extends Actor
{
    private Ball ball;
    private int level;
    private boolean checkTrue;
    public GameLvl(Ball b)
    {
        ball = b;
        level = 1;
    }
    
    /**
     * Act - do whatever the GameLvl wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        displayLvl();
        updateLvl();
    }
    
    public void updateLvl()
    {
        if (ball.getCount() >= 10)
        {
            level = level + 1;
            ball.increaseSpeed();
        }
    }
    
    public void displayLvl()
    {
        getWorld().showText("Game level: " + level, 680, 10);
    }
}
