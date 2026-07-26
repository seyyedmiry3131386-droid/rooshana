package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.sk6;
import defpackage.yt6;

/* JADX INFO: loaded from: classes.dex */
public class TabItem extends View {
    public final CharSequence a;
    public final Drawable b;
    public final int c;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        sk6 sk6VarC = sk6.C(context, attributeSet, yt6.TabItem);
        int i = yt6.TabItem_android_text;
        TypedArray typedArray = (TypedArray) sk6VarC.c;
        this.a = typedArray.getText(i);
        this.b = sk6VarC.v(yt6.TabItem_android_icon);
        this.c = typedArray.getResourceId(yt6.TabItem_android_layout, 0);
        sk6VarC.G();
    }
}
