package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.z79;

/* JADX INFO: loaded from: classes.dex */
class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public z79 a;
    public int b;

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }

    public void A(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.v(i, view);
    }

    public boolean B(int i) {
        z79 z79Var = this.a;
        if (z79Var != null) {
            return z79Var.b(i);
        }
        this.b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        A(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new z79(view);
        }
        z79 z79Var = this.a;
        View view2 = z79Var.a;
        z79Var.b = view2.getTop();
        z79Var.c = view2.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.b(i2);
        this.b = 0;
        return true;
    }

    public int y() {
        z79 z79Var = this.a;
        if (z79Var != null) {
            return z79Var.d;
        }
        return 0;
    }

    public int z() {
        return y();
    }

    public ViewOffsetBehavior() {
        this.b = 0;
    }
}
