import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        int numBtn = 3;
        DroneControl.init();
        addObject(new CommandBtn(),getWidth()*(1)/(numBtn+1),getHeight()/2);
        addObject(new LandBtn(),getWidth()*(2)/(numBtn+1),getHeight()/2);
        addObject(new TakeoffBtn(),getWidth()*(3)/(numBtn+1),getHeight()/2);
    }
}
