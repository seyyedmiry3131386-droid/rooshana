package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import defpackage.rm7;

/* JADX INFO: loaded from: classes.dex */
public final class zaad extends Button {
    public zaad(Context context, AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    public static final int a(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        throw new IllegalStateException(rm7.o(i, "Unknown color scheme: ", new StringBuilder(String.valueOf(i).length() + 22)));
    }
}
