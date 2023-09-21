import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AutoSlider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AutoSlider extends Actor
{
    private int randomNumber; 
    private int counter = 0;
    private int batCounter = 0;
    
    private GreenfootImage pic1, pic2, pic3, pic4;
    public AutoSlider()
    {
        counter = 0;
        pic1 = new GreenfootImage("bat1s.png");
        pic2 = new GreenfootImage("bat2s.png");
        pic3 = new GreenfootImage("bat3s.png");
        pic4 = new GreenfootImage("bat4s.png");
        setImage(pic1);
    }
    
    /**
     * Act - do whatever the AutoSlider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        changeBat();
        randomNumberGenerator();
        swimRight();
        swimLeft();
        disappear();
        
        counter++;
        batCounter++;
    }
    
    public void randomNumberGenerator()
    {
        if (counter == 50)
        {
           randomNumber = Greenfoot.getRandomNumber(3); 
           counter = 0;
        }
        
        if(randomNumber == 0)
        {
            randomNumber = Greenfoot.getRandomNumber(3);
        }
    }
    
    public void swimLeft()
    {
        if (randomNumber == 1)
        {
            setLocation(getX()-4, getY());
        }
    }
    
    public void swimRight()
    {
        if (randomNumber == 2)
        {
            setLocation(getX()+4, getY());
        }
    }
    
    public boolean disappear()
    {
        if (isAtEdge() && getX()<10)
        {
            getWorld().addObject(new AutoSlider(), 710, Greenfoot.getRandomNumber(200));
            getWorld().removeObject(this);
        }
        else if (isAtEdge() && getX()>10)
        {
            getWorld().addObject(new AutoSlider(), 10, Greenfoot.getRandomNumber(200));
            
            getWorld().removeObject(this);
        }
        return false;
    }
    
    public void changeBat()
    {
        this.getImage().scale(100,100);
        if(getImage() == pic1 && batCounter >= 14)
        {
            setImage(pic2);
            batCounter = 0;
        }
        else
        if(getImage() == pic2 && batCounter >= 14)
        {
            setImage(pic3);
            batCounter = 0;
        }
        else
        if(getImage() == pic3 && batCounter >= 14)
        {
            setImage(pic4);
            batCounter = 0;
        }
        else
        if(getImage() == pic4 && batCounter >= 14)
        {
            setImage(pic1);
            batCounter = 0;
        }
    }
}
