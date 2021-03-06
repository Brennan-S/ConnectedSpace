package space.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Laser extends Projectile {
    
    public Laser(double x, double y) {
        super(new Texture("laser.png"),x,y,5,5);
        sprite.setSize(sprite.getWidth()*4/1080f*Gdx.graphics.getWidth(),
                sprite.getHeight()*12/1920f*Gdx.graphics.getHeight());
        sprite.setOrigin(sprite.getWidth()/2-1, sprite.getHeight()/2);
    }

    @Override
    public void update() {
        int delta = (int)(Gdx.graphics.getDeltaTime() * 1000);
        y += delta*speed/8000.0;
    }

    @Override
    public void render(SpriteBatch batch) {
        sprite.setY((float)getScreenY());
        sprite.draw(batch);
    }
}
