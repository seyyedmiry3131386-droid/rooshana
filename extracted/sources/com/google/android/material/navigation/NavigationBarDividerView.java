package com.google.android.material.navigation;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import defpackage.vt4;
import defpackage.yj5;

/* JADX INFO: loaded from: classes.dex */
public class NavigationBarDividerView extends FrameLayout implements yj5 {
    public boolean a;
    public boolean b;
    public boolean c;

    public final void a() {
        setVisibility((!this.c || (!this.a && this.b)) ? 8 : 0);
    }

    @Override // defpackage.iu4
    public final void c(vt4 vt4Var) {
        a();
    }

    @Override // defpackage.iu4
    public vt4 getItemData() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setDividersEnabled(boolean z) {
        this.c = z;
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
    }

    @Override // defpackage.yj5
    public void setExpanded(boolean z) {
        this.a = z;
        a();
    }

    public void setIcon(Drawable drawable) {
    }

    @Override // defpackage.yj5
    public void setOnlyShowWhenExpanded(boolean z) {
        this.b = z;
        a();
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
