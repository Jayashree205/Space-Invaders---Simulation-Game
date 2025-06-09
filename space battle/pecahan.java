import greenfoot.*;  

public class pecahan extends Actor
{
    public int vx=0,vy=0,rot=0;
    
    public pecahan(GreenfootImage img)
    {
        GreenfootImage image=new GreenfootImage(10,10);
        image.drawImage(img,-Greenfoot.getRandomNumber(img.getWidth()),-Greenfoot.getRandomNumber(img.getHeight()));
        setImage(image);
    }
    
    public void addedToWorld(World latar)
    {
        vx=5+Greenfoot.getRandomNumber(10);
        vx=5+Greenfoot.getRandomNumber(10);
        rot=-5+Greenfoot.getRandomNumber(10);
        if(vx==0)vx=1;
        if(vy==0)vy=1;
    }
    
    public void act()
    {
        setLocation(getX()+vx,getY()+vy);
        setRotation(getRotation()+rot);
        if(getX()<-200 || getY()<-200 || getX()>getWorld().getWidth()+200 || getY()>getWorld().getHeight()+200){
            getWorld().removeObject(this); 
        }
    }
}
