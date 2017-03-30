package com.custom;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by iagomendesfucolo on 29/03/17.
 */

public class CustomTextView extends android.support.v7.widget.AppCompatTextView{
    public CustomTextView(Context context) {
        super(context);

    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Util.setCustomFont(this,context,attrs,
                R.styleable.CustomTextView,
                R.styleable.CustomTextView_font);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Util.setCustomFont(this,context,attrs,
                R.styleable.CustomTextView,
                R.styleable.CustomTextView_font);
    }

    public void setFont(String font) {
        Util.setCustomFont(this, getContext(), font);
    }
}
