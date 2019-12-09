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

    @Override
    public void act()
    {
        int x = 0,y = 0,z = 0;
        if(Greenfoot.isKeyDown("Right"))
        {
            x += 10;
            System.out.print("r");
        }
        if(Greenfoot.isKeyDown("Left"))
        {
            x -= 10;
            System.out.print("l");
        }
        if(Greenfoot.isKeyDown("Up"))
        {
            System.out.print("u");
            y += 10;
        }
        if(Greenfoot.isKeyDown("Down"))
        {
            System.out.print("d");
            y -= 10;
        }
        if(Greenfoot.isKeyDown("Space"))
        {
            System.out.print("space");
            z += 10;
        }
        if(Greenfoot.isKeyDown("Enter"))
        {
            
            System.out.println("Enter");
            DroneControl.sendStr("rc "+x+" "+y+" "+z+" 0");
        }
    }
}
