package com.mygdx.game;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.math.Vector2;

public class KeyboardAdapter extends InputAdapter {
    private boolean upPressed;
    private boolean downPressed;
    private boolean leftPressed;
    private boolean rightPressed;

    private final Vector2 direction = new Vector2();

    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Input.Keys.W) {
            upPressed = true;
        }
        if (keycode == Input.Keys.S) {
            downPressed = true;
        }
        if (keycode == Input.Keys.A) {
            leftPressed = true;
        }
        if (keycode == Input.Keys.D) {
            rightPressed = true;
        }
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        if (keycode == Input.Keys.W) {
            upPressed = false;
        }
        if (keycode == Input.Keys.S) {
            downPressed = false;
        }
        if (keycode == Input.Keys.A) {
            leftPressed = false;
        }
        if (keycode == Input.Keys.D) {
            rightPressed = false;
        }
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    public Vector2 getDirection() {
        direction.set(0, 0);

        if (upPressed) {
            direction.add(0, 5);
        }
        if (downPressed) {
            direction.add(0, -5);
        }
        if (leftPressed) {
            direction.add(-5, 0);
        }
        if (rightPressed) {
            direction.add(5, 0);
        }

        return direction;
    }
}
