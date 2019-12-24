package com.wen.mapgame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class GameView extends View {
    private float posX,posY = 400;
    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d("Game","onDraw"+getWidth()+","+getHeight());
        Paint paint0 = new Paint();
        Paint paint = new Paint();
        paint0.setColor(0);
        canvas.drawLine(400,0,0,600,paint0);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.lion);
        canvas.drawBitmap(bitmap,posX,posY,paint);
    }

    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        if (posX > 0 && posX < getWidth()-350) {
            this.posX = posX;
        }
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        if (posY > 0 && posY < getWidth()-250) {
            this.posY = posY;
        }
    }
}
