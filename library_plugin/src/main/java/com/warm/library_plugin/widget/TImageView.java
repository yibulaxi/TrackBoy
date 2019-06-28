package com.warm.library_plugin.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.warm.library_plugin.helper.ViewActionHelper;

public class TImageView extends ImageView {
    public TImageView(Context context) {
        super(context);
    }

    public TImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean performClick() {
        boolean click = super.performClick();
        ViewActionHelper.performClick(this);
        return click;
    }

}
