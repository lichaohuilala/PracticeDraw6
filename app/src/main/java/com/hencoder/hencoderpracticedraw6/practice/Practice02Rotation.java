package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice02Rotation extends RelativeLayout {
    Button animateBt;
    ImageView imageView;
    int currentState;

    public Practice02Rotation(Context context) {
        super(context);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new OnClickListener() {
            // // TODO 在这里处理点击事件，通过 View.animate().rotation/X/Y() 来让 View 旋转
            @Override
            public void onClick(final View v) {
                if (currentState == 0) {
                    imageView.animate().rotation(180);
                } else if (currentState == 1) {
                    imageView.animate().rotation(0);
                } else if (currentState == 2) {
                    imageView.animate().rotationX(180);
                } else if (currentState == 3) {
                    imageView.animate().rotationX(0);
                } else if (currentState == 4) {
                    imageView.animate().rotationY(180);
                } else if (currentState == 5) {
                    imageView.animate().rotationY(0);
                }
                if (currentState == 5) {
                    currentState = 0;
                    return;
                }
                currentState++;
            }
        });
    }
}