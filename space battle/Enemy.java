import greenfoot.*;  

public class Enemy extends Actor
{
    private int vx=0;
    private boolean toRemove=false;
    
    public Enemy()
    {
        
    }
    
    public Enemy(int v)
    {
        vx=v;
    }
    
    public void addedToWorld(World latar)
    {
        setRotation(180);
    }
    
    public void move()
    {
        setLocation(getX()+vx,getY());
        Actor actor=getOneIntersectingObject(Rocket.class);
        if(actor!=null){
            ((Rocket)actor).Hancur();
            Hancur();
        }
        if(getX()<-200)toRemove=true;
    }
    
    public void Hancur()
    {
        for(int i=0;i<10;i++){
            int px=-20+Greenfoot.getRandomNumber(2);
            int py=-20+Greenfoot.getRandomNumber(2);
            getWorld().addObject(new pecahan(getImage()),getX()+px,getY()+py);
        }
        getWorld().addObject(new bundaran(),getX(),getY());
        toRemove=true;
    }
    
    public void act()
    {
        if(!toRemove)move();
        else getWorld().removeObject(this);
        
    }
}
