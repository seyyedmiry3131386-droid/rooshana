package androidx.slidingpanelayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import defpackage.a1;
import defpackage.js3;
import defpackage.sb7;
import defpackage.xy7;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a extends sb7 {
    public final /* synthetic */ SlidingPaneLayout a;

    public a(SlidingPaneLayout slidingPaneLayout) {
        this.a = slidingPaneLayout;
    }

    @Override // defpackage.sb7
    public final int c(int i, View view) {
        SlidingPaneLayout slidingPaneLayout = this.a;
        SlidingPaneLayout.LayoutParams layoutParams = (SlidingPaneLayout.LayoutParams) slidingPaneLayout.f.getLayoutParams();
        if (!slidingPaneLayout.c()) {
            int paddingLeft = slidingPaneLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            return Math.min(Math.max(i, paddingLeft), slidingPaneLayout.i + paddingLeft);
        }
        int width = slidingPaneLayout.getWidth() - (slidingPaneLayout.f.getWidth() + (slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
        return Math.max(Math.min(i, width), width - slidingPaneLayout.i);
    }

    @Override // defpackage.sb7
    public final int d(int i, View view) {
        return view.getTop();
    }

    @Override // defpackage.sb7
    public final int k(View view) {
        return this.a.i;
    }

    @Override // defpackage.sb7
    public final void q(int i, int i2) {
        if (x()) {
            SlidingPaneLayout slidingPaneLayout = this.a;
            slidingPaneLayout.p.c(i2, slidingPaneLayout.f);
        }
    }

    @Override // defpackage.sb7
    public final void r(int i) {
        if (x()) {
            SlidingPaneLayout slidingPaneLayout = this.a;
            slidingPaneLayout.p.c(i, slidingPaneLayout.f);
        }
    }

    @Override // defpackage.sb7
    public final void s(int i, View view) {
        SlidingPaneLayout slidingPaneLayout = this.a;
        int childCount = slidingPaneLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = slidingPaneLayout.getChildAt(i2);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Override // defpackage.sb7
    public final void t(int i) {
        SlidingPaneLayout slidingPaneLayout = this.a;
        CopyOnWriteArrayList copyOnWriteArrayList = slidingPaneLayout.n;
        if (slidingPaneLayout.p.a == 0) {
            if (slidingPaneLayout.g != 1.0f) {
                View view = slidingPaneLayout.f;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    a1 a1Var = (a1) ((xy7) it.next());
                    a1Var.getClass();
                    js3.p(view, "panel");
                    a1Var.f(true);
                }
                slidingPaneLayout.sendAccessibilityEvent(32);
                slidingPaneLayout.q = true;
                return;
            }
            slidingPaneLayout.g(slidingPaneLayout.f);
            View view2 = slidingPaneLayout.f;
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                a1 a1Var2 = (a1) ((xy7) it2.next());
                a1Var2.getClass();
                js3.p(view2, "panel");
                a1Var2.f(false);
            }
            slidingPaneLayout.sendAccessibilityEvent(32);
            slidingPaneLayout.q = false;
        }
    }

    @Override // defpackage.sb7
    public final void u(View view, int i, int i2) {
        SlidingPaneLayout slidingPaneLayout = this.a;
        if (slidingPaneLayout.f == null) {
            slidingPaneLayout.g = 0.0f;
        } else {
            boolean zC = slidingPaneLayout.c();
            SlidingPaneLayout.LayoutParams layoutParams = (SlidingPaneLayout.LayoutParams) slidingPaneLayout.f.getLayoutParams();
            int width = slidingPaneLayout.f.getWidth();
            if (zC) {
                i = (slidingPaneLayout.getWidth() - i) - width;
            }
            float paddingRight = (i - ((zC ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft()) + (zC ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / slidingPaneLayout.i;
            slidingPaneLayout.g = paddingRight;
            if (slidingPaneLayout.k != 0) {
                slidingPaneLayout.e(paddingRight);
            }
            View view2 = slidingPaneLayout.f;
            Iterator it = slidingPaneLayout.n.iterator();
            while (it.hasNext()) {
                ((a1) ((xy7) it.next())).getClass();
                js3.p(view2, "panel");
            }
        }
        slidingPaneLayout.invalidate();
    }

    @Override // defpackage.sb7
    public final void v(View view, float f, float f2) {
        int paddingLeft;
        SlidingPaneLayout.LayoutParams layoutParams = (SlidingPaneLayout.LayoutParams) view.getLayoutParams();
        SlidingPaneLayout slidingPaneLayout = this.a;
        if (slidingPaneLayout.c()) {
            int paddingRight = slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            if (f < 0.0f || (f == 0.0f && slidingPaneLayout.g > 0.5f)) {
                paddingRight += slidingPaneLayout.i;
            }
            paddingLeft = (slidingPaneLayout.getWidth() - paddingRight) - slidingPaneLayout.f.getWidth();
        } else {
            paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + slidingPaneLayout.getPaddingLeft();
            if (f > 0.0f || (f == 0.0f && slidingPaneLayout.g > 0.5f)) {
                paddingLeft += slidingPaneLayout.i;
            }
        }
        slidingPaneLayout.p.s(paddingLeft, view.getTop());
        slidingPaneLayout.invalidate();
    }

    @Override // defpackage.sb7
    public final boolean w(int i, View view) {
        if (x()) {
            return ((SlidingPaneLayout.LayoutParams) view.getLayoutParams()).b;
        }
        return false;
    }

    public final boolean x() {
        SlidingPaneLayout slidingPaneLayout = this.a;
        if (slidingPaneLayout.j || slidingPaneLayout.getLockMode() == 3) {
            return false;
        }
        if (slidingPaneLayout.d() && slidingPaneLayout.getLockMode() == 1) {
            return false;
        }
        return slidingPaneLayout.d() || slidingPaneLayout.getLockMode() != 2;
    }
}
