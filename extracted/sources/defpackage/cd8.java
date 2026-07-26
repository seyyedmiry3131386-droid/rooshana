package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class cd8 extends sb7 {
    public int a;
    public int b = -1;
    public final /* synthetic */ SwipeDismissBehavior c;

    public cd8(SwipeDismissBehavior swipeDismissBehavior) {
        this.c = swipeDismissBehavior;
    }

    @Override // defpackage.sb7
    public final int c(int i, View view) {
        int width;
        int width2;
        int width3;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.c.e;
        if (i2 == 0) {
            if (z) {
                width = this.a - view.getWidth();
                width2 = this.a;
            } else {
                width = this.a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.a - view.getWidth();
            width2 = view.getWidth() + this.a;
        } else if (z) {
            width = this.a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.a - view.getWidth();
            width2 = this.a;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.sb7
    public final int d(int i, View view) {
        return view.getTop();
    }

    @Override // defpackage.sb7
    public final int k(View view) {
        return view.getWidth();
    }

    @Override // defpackage.sb7
    public final void s(int i, View view) {
        this.b = i;
        this.a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.c;
            swipeDismissBehavior.d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.d = false;
        }
    }

    @Override // defpackage.sb7
    public final void t(int i) {
        nm5 nm5Var = this.c.b;
        if (nm5Var != null) {
            o90 o90Var = ((r90) nm5Var.b).x;
            if (i == 0) {
                o77.t().C(o90Var);
            } else if (i == 1 || i == 2) {
                o77.t().B(o90Var);
            }
        }
    }

    @Override // defpackage.sb7
    public final void u(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.c;
        float f = width * swipeDismissBehavior.f;
        float width2 = view.getWidth() * swipeDismissBehavior.g;
        float fAbs = Math.abs(i - this.a);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    @Override // defpackage.sb7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.b = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.c
            r4 = 1
            if (r1 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L18
            r5 = r4
            goto L19
        L18:
            r5 = r2
        L19:
            int r6 = r3.e
            r7 = 2
            if (r6 != r7) goto L1f
            goto L50
        L1f:
            if (r6 != 0) goto L2b
            if (r5 == 0) goto L28
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L28:
            if (r1 <= 0) goto L65
            goto L50
        L2b:
            if (r6 != r4) goto L65
            if (r5 == 0) goto L32
            if (r1 <= 0) goto L65
            goto L50
        L32:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L37:
            int r1 = r9.getLeft()
            int r5 = r8.a
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L65
        L50:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5f
            int r10 = r9.getLeft()
            int r0 = r8.a
            if (r10 >= r0) goto L5d
            goto L5f
        L5d:
            int r0 = r0 + r11
            goto L63
        L5f:
            int r10 = r8.a
            int r0 = r10 - r11
        L63:
            r2 = r4
            goto L67
        L65:
            int r0 = r8.a
        L67:
            b79 r10 = r3.a
            int r11 = r9.getTop()
            boolean r10 = r10.s(r0, r11)
            if (r10 == 0) goto L7c
            np7 r10 = new np7
            r10.<init>(r3, r9, r2)
            r9.postOnAnimation(r10)
            return
        L7c:
            if (r2 == 0) goto L85
            nm5 r10 = r3.b
            if (r10 == 0) goto L85
            r10.u(r9)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd8.v(android.view.View, float, float):void");
    }

    @Override // defpackage.sb7
    public final boolean w(int i, View view) {
        int i2 = this.b;
        return (i2 == -1 || i2 == i) && this.c.y(view);
    }
}
