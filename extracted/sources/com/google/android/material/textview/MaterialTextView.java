package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.ja1;
import defpackage.mk4;
import defpackage.vp6;
import defpackage.yh0;
import defpackage.yt6;

/* JADX INFO: loaded from: classes.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (yh0.H(context, vp6.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, yt6.MaterialTextAppearance);
            Context context2 = getContext();
            int[] iArr = {yt6.MaterialTextAppearance_android_lineHeight, yt6.MaterialTextAppearance_lineHeight};
            int iS = -1;
            for (int i2 = 0; i2 < 2 && iS < 0; i2++) {
                iS = ja1.s(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iS >= 0) {
                setLineHeight(iS);
            }
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        super(mk4.a(context, attributeSet, i, 0), attributeSet, i);
        Context context2 = getContext();
        if (yh0.H(context2, vp6.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, yt6.MaterialTextView, i, 0);
            int[] iArr = {yt6.MaterialTextView_android_lineHeight, yt6.MaterialTextView_lineHeight};
            int iS = -1;
            for (int i2 = 0; i2 < 2 && iS < 0; i2++) {
                iS = ja1.s(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iS != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, yt6.MaterialTextView, i, 0);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(yt6.MaterialTextView_android_textAppearance, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, yt6.MaterialTextAppearance);
                Context context3 = getContext();
                int[] iArr2 = {yt6.MaterialTextAppearance_android_lineHeight, yt6.MaterialTextAppearance_lineHeight};
                int iS2 = -1;
                for (int i3 = 0; i3 < 2 && iS2 < 0; i3++) {
                    iS2 = ja1.s(context3, typedArrayObtainStyledAttributes3, iArr2[i3], -1);
                }
                typedArrayObtainStyledAttributes3.recycle();
                if (iS2 >= 0) {
                    setLineHeight(iS2);
                }
            }
        }
    }
}
