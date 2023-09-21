import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PongWorld extends World
{
    private GameLvl gameLvl;
    private Ball ball;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PongWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 440, 1); 
        setPaintOrder(Start.class,Ball.class,AutoSlider.class,GameLvl.class);
        
        addObject(new Slider(), 375, 400);
        addObject(new AutoSlider(), 2, 100);
        addObject(new AutoSlider(), 700, 50);
        addObject(new AutoSlider(), 350, 160);
        addObject(new Start(), 375, 220);
        
        ball = new Ball();
        addObject(ball, 300, 200);
        gameLvl = new GameLvl(ball);
        addObject(gameLvl, 680, 10);
    }
}
