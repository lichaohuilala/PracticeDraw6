package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice03Scale extends RelativeLayout {
    Button animateBt;
    ImageView imageView;
    int currentState;

    public Practice03Scale(Context context) {
        super(context);
    }

    public Practice03Scale(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice03Scale(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new View.OnClickListener() {
            // TODO 在这里处理点击事件，通过 View.animate().scaleX/Y() 来让 View 放缩
            @Override
            public void onClick(final View v) {

                if (currentState == 0) {
                    imageView.animate().scaleX(1.5f);
                } else if (currentState == 1) {
                    imageView.animate().scaleX(1);
                } else if (currentState == 2) {
                    imageView.animate().scaleY(.5f);
                } else if (currentState == 3) {
                    imageView.animate().scaleY(1);
                }
                if (currentState == 3) {
                    currentState = 0;
                    return;
                }
                currentState++;
            }
        });
    }
}
