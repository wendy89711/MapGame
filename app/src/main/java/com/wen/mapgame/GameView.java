package com.wen.mapgame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class GameView extends View {
    Lion lion;
    Bitmap bitmapLion;
    Bitmap bitmapLionNG;
    Paint paint = new Paint();

    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d("Game","onDraw"+getWidth()+","+getHeight());
        Paint paint0= new Paint();
        paint0.setColor(Color.rgb(204, 204, 255));
        paint0.setStrokeWidth((float)15.0);
        canvas.drawLine(400,0,0,600,paint0);
        if (lion == null) {
            lion = new Lion(this);
            bitmapLion = BitmapFactory.decodeResource(getResources(), R.drawable.lion);
            bitmapLionNG = BitmapFactory.decodeResource(getResources(), R.drawable.lion_ng);
        }
        if (lion.getDirection() == Lion.DIRECTION_NG) {
            bitmapLion = bitmapLionNG;
        }
        canvas.drawBitmap(bitmapLion,lion.getX(),lion.getY(),paint);
    }

    public void moveRight() {
        if (lion.getX() < getWidth()-200) {
            lion.setDirection(Lion.DIRECTION_RIGHT);
            invalidate();
        }
    }

    public void moveLeft() {
        if (lion.getX() > 50) {
            lion.setDirection(Lion.DIRECTION_LEFT);
            invalidate();
        }
    }

    public void moveDown() {
        if (lion.getY() < getHeight()-200) {
            lion.setDirection(Lion.DIRECTION_DOWN);
            invalidate();
        }
    }

    public void moveUp() {
        if (lion.getY() > 50) {
            lion.setDirection(Lion.DIRECTION_UP);
            invalidate();
        }
    }
}
