import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CommandBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CommandBtn extends Actor
{
    /**
     * Act - do whatever the CommandBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            DroneControl.connect();
        }
    }
}
