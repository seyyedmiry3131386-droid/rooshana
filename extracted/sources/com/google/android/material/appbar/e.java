package com.google.android.material.appbar;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {
    public final CoordinatorLayout a;
    public final View b;
    public final /* synthetic */ HeaderBehavior c;

    public e(HeaderBehavior headerBehavior, CoordinatorLayout coordinatorLayout, View view) {
        this.c = headerBehavior;
        this.a = coordinatorLayout;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HeaderBehavior headerBehavior;
        OverScroller overScroller;
        View view = this.b;
        if (view == null || (overScroller = (headerBehavior = this.c).d) == null) {
            return;
        }
        boolean zComputeScrollOffset = overScroller.computeScrollOffset();
        CoordinatorLayout coordinatorLayout = this.a;
        if (!zComputeScrollOffset) {
            headerBehavior.F(coordinatorLayout, view);
        } else {
            headerBehavior.H(coordinatorLayout, view, headerBehavior.d.getCurrY());
            view.postOnAnimation(this);
        }
    }
}
