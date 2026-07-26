package com.google.android.material.button;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import defpackage.ft6;
import defpackage.kk4;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.vp6;

/* JADX INFO: loaded from: classes.dex */
public class MaterialSplitButton extends MaterialButtonGroup {
    public static final int l = mt6.Widget_Material3_MaterialSplitButton;

    public MaterialSplitButton(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.button.MaterialButtonGroup, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            throw new IllegalArgumentException("MaterialSplitButton can only hold MaterialButtons.");
        }
        if (getChildCount() > 2) {
            throw new IllegalArgumentException("MaterialSplitButton can only hold two MaterialButtons.");
        }
        MaterialButton materialButton = (MaterialButton) view;
        super.addView(view, i, layoutParams);
        if (indexOfChild(view) == 1) {
            materialButton.setCheckable(true);
            materialButton.setA11yClassName(Button.class.getName());
            if (Build.VERSION.SDK_INT >= 30) {
                materialButton.setStateDescription(getResources().getString(materialButton.o ? ft6.mtrl_button_expanded_content_description : ft6.mtrl_button_collapsed_content_description));
                materialButton.e.add(new kk4(this));
            }
        }
    }

    public MaterialSplitButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.materialSplitButtonStyle);
    }

    public MaterialSplitButton(Context context, AttributeSet attributeSet, int i) {
        super(mk4.a(context, attributeSet, i, l), attributeSet, i);
    }
}
