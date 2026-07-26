package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a07;

/* JADX INFO: loaded from: classes.dex */
public class d extends a07 {
    public PointF k;
    public final DisplayMetrics l;
    public float n;
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator();
    public boolean m = false;
    public int o = 0;
    public int p = 0;

    public d(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int e(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    @Override // defpackage.a07
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(android.view.View r6, defpackage.b07 r7, defpackage.yz6 r8) {
        /*
            r5 = this;
            android.graphics.PointF r7 = r5.k
            r0 = 1
            if (r7 == 0) goto L13
            float r7 = r7.x
            r1 = 0
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 != 0) goto Ld
            goto L13
        Ld:
            if (r7 <= 0) goto L11
            r7 = r0
            goto L14
        L11:
            r7 = -1
            goto L14
        L13:
            r7 = 0
        L14:
            int r7 = r5.f(r6, r7)
            int r1 = r5.j()
            int r6 = r5.g(r6, r1)
            int r1 = r7 * r7
            int r2 = r6 * r6
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r5.i(r1)
            double r1 = (double) r1
            r3 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r1 = r1 / r3
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            if (r1 <= 0) goto L4b
            int r7 = -r7
            int r6 = -r6
            r8.a = r7
            r8.b = r6
            r8.c = r1
            android.view.animation.DecelerateInterpolator r6 = r5.j
            r8.e = r6
            r8.f = r0
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.d.c(android.view.View, b07, yz6):void");
    }

    public int f(View view, int i) {
        k kVar = this.c;
        if (kVar == null || !kVar.e()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return e((view.getLeft() - ((RecyclerView.LayoutParams) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, view.getRight() + ((RecyclerView.LayoutParams) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, kVar.E(), kVar.n - kVar.F(), i);
    }

    public int g(View view, int i) {
        k kVar = this.c;
        if (kVar == null || !kVar.f()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return e((view.getTop() - ((RecyclerView.LayoutParams) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getBottom() + ((RecyclerView.LayoutParams) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, kVar.G(), kVar.o - kVar.D(), i);
    }

    public float h(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int i(int i) {
        float fAbs = Math.abs(i);
        if (!this.m) {
            this.n = h(this.l);
            this.m = true;
        }
        return (int) Math.ceil(fAbs * this.n);
    }

    public int j() {
        PointF pointF = this.k;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.y;
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }
}
