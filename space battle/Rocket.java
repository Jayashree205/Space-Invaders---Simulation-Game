import greenfoot.*;  

public class Rocket extends Actor
{
    private int targetx=0,targety=0;
    private int jeda=0;
    private boolean toRemove=false;
    
    public void addedToWorld(World latar)
    {
        targetx=getX();targety=getY();
    }
    
    public void Hancur()
    {
        for(int i=0;i<10;i++){
            int px=-20+Greenfoot.getRandomNumber(40);
            int py=-20+Greenfoot.getRandomNumber(40);
            getWorld().addObject(new pecahan(getImage()),getX()+px,getY()+py);
        }
        getWorld().addObject(new bundaran(),getX(),getY());
        toRemove=true;
    }
    
    public void move()
    {
        double rx=targetx-getX();
        double ry=targety-getY();
        double r=Math.sqrt(rx*rx+ry*ry);
        int bts=5;
        int posx=0,posy=0;
        if(r>bts){
            posx=(int)(getX()+bts*rx/r);
            posy=(int)(getY()+bts*ry/r);
        }else{
            posx=targetx;
            posy=targety;
        }
        setLocation(posx,posy);
    }
    
    public void act()
    {
        if(Greenfoot.mouseMoved(null)){
            MouseInfo mouse=Greenfoot.getMouseInfo();
            targetx=mouse.getX();
            targety=mouse.getY();
        }
        move();
        if(jeda>0)jeda--;
        if(jeda==1)getWorld().addObject(new laser(),getX()+100,getY());
        if(jeda==0)jeda=40;
        if(toRemove)getWorld().removeObject(this);
        }

}
