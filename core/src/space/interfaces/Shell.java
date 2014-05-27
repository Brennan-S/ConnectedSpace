package space.interfaces;


public abstract class Shell {
    protected int health;
    
    public Shell(int h) {
        health = h;
    }
    
    public abstract void resolveHit(Projectile p);
}