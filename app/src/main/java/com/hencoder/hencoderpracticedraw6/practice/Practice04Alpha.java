package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice04Alpha extends RelativeLayout {
    Button animateBt;
    ImageView imageView;

    int currentState = 0;

    public Practice04Alpha(Context context) {
        super(context);
    }

    public Practice04Alpha(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice04Alpha(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new OnClickListener() {
            // TODO 在这里处理点击事件，通过 View.animate().alpha() 来改变 View 的透明度
            @Override
            public void onClick(final View v) {
                if (currentState == 0) {
                    imageView.animate().alpha(0.8f);
                } else if (currentState == 1) {
                    imageView.animate().alpha(0.6f);

                } else if (currentState == 2) {
                    imageView.animate().alpha(0.4f);
                } else if (currentState == 3) {
                    imageView.animate().alpha(0.2f);
                } else if (currentState == 4) {
                    imageView.animate().alpha(0f);
                } else if (currentState == 5) {
                    imageView.animate().alpha(1f);
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