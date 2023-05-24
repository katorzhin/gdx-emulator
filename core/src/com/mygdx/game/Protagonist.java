package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;

public class Protagonist {

    private final Vector2 position = new Vector2();

    private final Texture texture;

    public Protagonist(float x, float y) {
        texture = new Texture("protagonist.png");
        position.set(x, y);
    }

    public void render(Batch batch) {
        batch.draw(texture, position.x, position.y);
    }
    public void dispose(){
        texture.dispose();
    }

    public void moveTo(Vector2 direction) {
        position.add(direction);
    }
}
