import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private int dx = 2;
    private int dy = 2;
    private int count = 0;
    private int speed = 2;
    private boolean ballRelease;
    
    public Ball()
    {
        this.getImage().scale(30,40);
        setRotation(Greenfoot.getRandomNumber(360));
        ballRelease = false;
    }
    
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        turn(2);
        if(Greenfoot.isKeyDown("space"))
        {
            ballRelease = true;
        }
    }
    
    public void move()
    {
        if(ballRelease == true)
        {
            if (getX() < 10)
            {
                dx = speed;
                Greenfoot.playSound("hitWall.wav");
            }
            
            if (getX() + getImage().getWidth() > 770)
            {
                dx = -speed;
                Greenfoot.playSound("hitWall.wav");
            }
            
            if (getY() < 10)
            {
                dy = speed;
                Greenfoot.playSound("hitWall.wav");
            }
            
            if (getY() + getImage().getWidth() > 450)
            {
                Greenfoot.playSound("endgame.wav");
                getWorld().showText("Game Over!", 375, 220);
                Greenfoot.stop(); 
            }
            
            if (isTouching(Slider.class))
            {
                dy = -speed;
                Greenfoot.playSound("slider.wav");
                count++;
            }
            
            if (isTouching(AutoSlider.class))
            {
                dy = speed;
                Greenfoot.playSound("bat.wav");
            }
            setLocation(getX() + dx, getY() + dy);
        }
    }

    
    public void increaseSpeed()
    {
        if (count >= 10)
        {
            speed = speed + 1;
            count = 0;
        }
    }
    
    public int getCount()
    {
        return count;
    }
}
