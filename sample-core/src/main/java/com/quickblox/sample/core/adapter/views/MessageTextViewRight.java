package com.quickblox.sample.core.adapter.views;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.quickblox.sample.core.R;

public class MessageTextViewRight extends MessageTextView {

    public MessageTextViewRight(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

 @Override
    protected void setLinearSide() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLinear.getLayoutParams();
        layoutParams.gravity = Gravity.RIGHT;
        frameLinear.setLayoutParams(layoutParams);

    }

    @Override
    protected void setTextLayout(@LayoutRes int customTextId) {
        int textViewId = R.layout.list_item_text_right;

        if (customTextId != 0) {
            textViewId = customTextId;
        }
        viewTextStub.setLayoutResource(textViewId);
        layoutStub = (LinearLayout) viewTextStub.inflate();
    }
}
