package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.PopupWindow;
import defpackage.lu6;
import defpackage.sk6;

/* JADX INFO: loaded from: classes.dex */
class AppCompatPopupWindow extends PopupWindow {
    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i);
    }

    public final void a(Context context, AttributeSet attributeSet, int i) {
        sk6 sk6VarD = sk6.D(context, attributeSet, lu6.PopupWindow, i);
        int i2 = lu6.PopupWindow_overlapAnchor;
        TypedArray typedArray = (TypedArray) sk6VarD.c;
        if (typedArray.hasValue(i2)) {
            setOverlapAnchor(typedArray.getBoolean(lu6.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(sk6VarD.v(lu6.PopupWindow_android_popupBackground));
        sk6VarD.G();
    }
}
