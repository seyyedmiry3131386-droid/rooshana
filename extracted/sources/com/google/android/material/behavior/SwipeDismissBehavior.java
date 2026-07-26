package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.b79;
import defpackage.cd8;
import defpackage.nm5;
import defpackage.o3;
import defpackage.q69;
import defpackage.vo4;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public b79 a;
    public nm5 b;
    public boolean c;
    public boolean d;
    public int e = 2;
    public float f = 0.0f;
    public float g = 0.5f;
    public final cd8 h = new cd8(this);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zT = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zT = coordinatorLayout.t(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = zT;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (zT) {
            if (this.a == null) {
                this.a = new b79(coordinatorLayout.getContext(), coordinatorLayout, this.h);
            }
            if (!this.d && this.a.t(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            q69.n(1048576, view);
            q69.j(0, view);
            if (y(view)) {
                q69.o(view, o3.n, null, new vo4(13, this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.m(motionEvent);
        return true;
    }

    public boolean y(View view) {
        return true;
    }
}
