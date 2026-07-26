package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class qq2 implements View.OnLayoutChangeListener {
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        view.getLayoutParams().height = view.getMeasuredWidth();
        view.requestLayout();
    }
}
