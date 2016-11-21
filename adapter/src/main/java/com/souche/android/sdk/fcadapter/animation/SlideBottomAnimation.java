package com.souche.android.sdk.fcadapter.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

public class SlideBottomAnimation implements BaseAnimation {

    @Override
    public Animator[] getAnimators(View view) {
        return new Animator[]{
                ObjectAnimator.ofFloat(view, "translationY", view.getMeasuredHeight(), 0)
        };
    }
}