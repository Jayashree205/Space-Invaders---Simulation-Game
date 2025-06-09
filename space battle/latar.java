import greenfoot.*;  

public class latar extends World
{
    private int jeda=0;
    public latar()
    {    
        super(600, 400, 1,false);

        addObject(new Rocket(),100,200);
    }

    public void act()
    {
        if(jeda>0)jeda--;
        else jeda=20;
        if(jeda==1){
            int py=Greenfoot.getRandomNumber(getHeight());
            addObject(new Enemy(-(2+Greenfoot.getRandomNumber(3))),getWidth()+200,py);
        }
    }
    
}
