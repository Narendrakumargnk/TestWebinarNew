/*
 * (c) Copyright 2001-2015 COMIT AG
 * All Rights Reserved.
 */
package com.example.narendra.testwebinar;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FontTypes {

    public Typeface tfBold, tfRegular;
    Context context;

    //    public Typeface tfBold, tfExtraLight, tfHeavy, tfLight, tfMedium, tfRegular;
    public FontTypes(Context context) {
        this.context = context;
        // tfBold = Typeface.createFromAsset(context.getAssets(), "fonts/KozGoPro-Bold.otf");
        //        tfExtraLight = Typeface.createFromAsset(context.getAssets(), "fonts/KozGoPro-ExtraLight.otf");
        //        tfHeavy = Typeface.createFromAsset(context.getAssets(), "fonts/KozGoPro-Heavy.otf");
        //        tfLight = Typeface.createFromAsset(context.getAssets(), "fonts/KozGoPro-Light.otf");
        //        tfMedium = Typeface.createFromAsset(context.getAssets(), "fonts/KozGoPro-Medium.otf");
        tfRegular = Typeface.createFromAsset(context.getAssets(), "fonts/AvenirNextLTPro-Demi.otf");
                //context.getAssets(), " assets.fonts/AvenirNextLTPro-Regular.otf");
        tfBold = Typeface.createFromAsset(context.getAssets(), "fonts/AvenirNextLTPro-Demi.otf");
    }

    public void setTypeface(TextView view, Typeface fotntType) {
        view.setTypeface(fotntType);
    }

    public void setTypeface(View... view) {
        for (View textview : view) {
            if (textview != null)
                ((TextView) textview).setTypeface(tfRegular);
        }
    }

    public void setBoldTypeface(View... view) {
        for (View textview : view) {
            if (textview != null)
                ((TextView) textview).setTypeface(tfBold);
        }
    }

    public void setTypeface(EditText... view) {
        for (EditText editText : view) {
            editText.setTypeface(tfRegular);
        }
    }

    public void setRegularFontToButtons(TextView... view) {
        for (TextView button : view) {
            button.setTypeface(tfRegular);
        }
    }

    public void setEditTextRegularFont(EditText... view) {
        for (EditText button : view) {
            button.setTypeface(tfRegular);
        }
    }


}
