import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LandBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LandBtn extends Actor
{
    /**
     * Act - do whatever the LandBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            DroneControl.land();
        }
    }    
}
