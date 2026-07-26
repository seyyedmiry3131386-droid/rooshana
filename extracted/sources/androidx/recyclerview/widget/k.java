package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a07;
import defpackage.b07;
import defpackage.bn6;
import defpackage.e07;
import defpackage.f79;
import defpackage.fw7;
import defpackage.hl5;
import defpackage.jp8;
import defpackage.nq0;
import defpackage.o40;
import defpackage.pt2;
import defpackage.q69;
import defpackage.qz6;
import defpackage.rz6;
import defpackage.s3;
import defpackage.sr0;
import defpackage.st6;
import defpackage.t3;
import io.sentry.android.core.t0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public jp8 a;
    public RecyclerView b;
    public final bn6 c;
    public final bn6 d;
    public a07 e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public k() {
        i iVar = new i(this);
        j jVar = new j(this);
        this.c = new bn6(iVar);
        this.d = new bn6(jVar);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((RecyclerView.LayoutParams) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int B(View view) {
        Rect rect = ((RecyclerView.LayoutParams) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int H(View view) {
        return ((RecyclerView.LayoutParams) view.getLayoutParams()).a.c();
    }

    public static rz6 I(Context context, AttributeSet attributeSet, int i, int i2) {
        rz6 rz6Var = new rz6();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, st6.RecyclerView, i, i2);
        rz6Var.a = typedArrayObtainStyledAttributes.getInt(st6.RecyclerView_android_orientation, 1);
        rz6Var.b = typedArrayObtainStyledAttributes.getInt(st6.RecyclerView_spanCount, 1);
        rz6Var.c = typedArrayObtainStyledAttributes.getBoolean(st6.RecyclerView_reverseLayout, false);
        rz6Var.d = typedArrayObtainStyledAttributes.getBoolean(st6.RecyclerView_stackFromEnd, false);
        typedArrayObtainStyledAttributes.recycle();
        return rz6Var;
    }

    public static boolean N(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void O(View view, int i, int i2, int i3, int i4) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    public static int h(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int x(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.k.x(boolean, int, int, int, int):int");
    }

    public final boolean A0(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && this.h && N(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && N(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    public boolean B0() {
        return false;
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.c();
        }
        return 0;
    }

    public final boolean C0(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        return (this.h && N(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && N(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) ? false : true;
    }

    public int D() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public abstract void D0(RecyclerView recyclerView, int i);

    public int E() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final void E0(a07 a07Var) {
        a07 a07Var2 = this.e;
        if (a07Var2 != null && a07Var != a07Var2 && a07Var2.e) {
            a07Var2.d();
        }
        this.e = a07Var;
        RecyclerView recyclerView = this.b;
        e07 e07Var = recyclerView.B0;
        e07Var.g.removeCallbacks(e07Var);
        e07Var.c.abortAnimation();
        if (a07Var.h) {
            t0.m("RecyclerView", "An instance of " + a07Var.getClass().getSimpleName() + " was started more than once. Each instance of" + a07Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        a07Var.b = recyclerView;
        a07Var.c = this;
        int i = a07Var.a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.E0.a = i;
        a07Var.e = true;
        a07Var.d = true;
        a07Var.f = recyclerView.n.r(i);
        a07Var.b.B0.b();
        a07Var.h = true;
    }

    public int F() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public boolean F0() {
        return false;
    }

    public int G() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int J(l lVar, b07 b07Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.m == null || !f()) {
            return 1;
        }
        return this.b.m.c();
    }

    public final void K(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((RecyclerView.LayoutParams) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean L();

    public boolean M() {
        return false;
    }

    public void P(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iJ = recyclerView.f.j();
            for (int i2 = 0; i2 < iJ; i2++) {
                recyclerView.f.i(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void Q(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iJ = recyclerView.f.j();
            for (int i2 = 0; i2 < iJ; i2++) {
                recyclerView.f.i(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void S(RecyclerView recyclerView) {
    }

    public abstract void T(RecyclerView recyclerView);

    public abstract View U(View view, int i, l lVar, b07 b07Var);

    public void V(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        l lVar = recyclerView.c;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        g gVar = this.b.m;
        if (gVar != null) {
            accessibilityEvent.setItemCount(gVar.c());
        }
    }

    public void W(l lVar, b07 b07Var, t3 t3Var) {
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            t3Var.a(8192);
            t3Var.w(true);
            t3Var.k(67108864, true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            t3Var.a(4096);
            t3Var.w(true);
            t3Var.k(67108864, true);
        }
        t3Var.n(pt2.v(J(lVar, b07Var), y(lVar, b07Var), 0));
    }

    public final void X(View view, t3 t3Var) {
        o oVarO = RecyclerView.O(view);
        if (oVarO == null || oVarO.i()) {
            return;
        }
        jp8 jp8Var = this.a;
        if (((ArrayList) jp8Var.e).contains(oVarO.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        Y(recyclerView.c, recyclerView.E0, view, t3Var);
    }

    public void Y(l lVar, b07 b07Var, View view, t3 t3Var) {
        t3Var.o(s3.a(f() ? H(view) : 0, 1, e() ? H(view) : 0, 1, false, false));
    }

    public final void c(View view, int i, boolean z) {
        o oVarO = RecyclerView.O(view);
        if (z || oVarO.i()) {
            fw7 fw7Var = (fw7) this.b.g.b;
            f79 f79VarA = (f79) fw7Var.get(oVarO);
            if (f79VarA == null) {
                f79VarA = f79.a();
                fw7Var.put(oVarO, f79VarA);
            }
            f79VarA.a |= 1;
        } else {
            this.b.g.y(oVarO);
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (oVarO.q() || oVarO.j()) {
            if (oVarO.j()) {
                oVarO.n.m(oVarO);
            } else {
                oVarO.j &= -33;
            }
            this.a.f(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.b) {
                jp8 jp8Var = this.a;
                nq0 nq0Var = (nq0) jp8Var.d;
                int iIndexOfChild = ((RecyclerView) ((hl5) jp8Var.c).b).indexOfChild(view);
                int iU = (iIndexOfChild == -1 || nq0Var.w(iIndexOfChild)) ? -1 : iIndexOfChild - nq0Var.u(iIndexOfChild);
                if (i == -1) {
                    i = this.a.j();
                }
                if (iU == -1) {
                    StringBuilder sb = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.b.indexOfChild(view));
                    throw new IllegalStateException(o40.w(this.b, sb));
                }
                if (iU != i) {
                    k kVar = this.b.n;
                    View viewV = kVar.v(iU);
                    if (viewV == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iU + kVar.b.toString());
                    }
                    kVar.v(iU);
                    kVar.a.g(iU);
                    RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) viewV.getLayoutParams();
                    o oVarO2 = RecyclerView.O(viewV);
                    if (oVarO2.i()) {
                        fw7 fw7Var2 = (fw7) kVar.b.g.b;
                        f79 f79VarA2 = (f79) fw7Var2.get(oVarO2);
                        if (f79VarA2 == null) {
                            f79VarA2 = f79.a();
                            fw7Var2.put(oVarO2, f79VarA2);
                        }
                        f79VarA2.a = 1 | f79VarA2.a;
                    } else {
                        kVar.b.g.y(oVarO2);
                    }
                    kVar.a.f(viewV, i, layoutParams2, oVarO2.i());
                }
            } else {
                this.a.e(view, i, false);
                layoutParams.c = true;
                a07 a07Var = this.e;
                if (a07Var != null && a07Var.e) {
                    a07Var.b.getClass();
                    o oVarO3 = RecyclerView.O(view);
                    if ((oVarO3 != null ? oVarO3.c() : -1) == a07Var.a) {
                        a07Var.f = view;
                    }
                }
            }
        }
        if (layoutParams.d) {
            if (RecyclerView.a1) {
                Objects.toString(layoutParams.a);
            }
            oVarO.a.invalidate();
            layoutParams.d = false;
        }
    }

    public void d(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public abstract boolean e();

    public abstract void e0(l lVar, b07 b07Var);

    public abstract boolean f();

    public abstract void f0(b07 b07Var);

    public boolean g(RecyclerView.LayoutParams layoutParams) {
        return layoutParams != null;
    }

    public void g0(Parcelable parcelable) {
    }

    public Parcelable h0() {
        return null;
    }

    public void i0(int i) {
    }

    public boolean j0(int i, Bundle bundle) {
        RecyclerView recyclerView = this.b;
        return k0(recyclerView.c, recyclerView.E0, i, bundle);
    }

    public abstract int k(b07 b07Var);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[PHI: r8
      0x0062: PHI (r8v8 int) = (r8v5 int), (r8v18 int) binds: [B:27:0x007e, B:19:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean k0(androidx.recyclerview.widget.l r8, defpackage.b07 r9, int r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.k.k0(androidx.recyclerview.widget.l, b07, int, android.os.Bundle):boolean");
    }

    public abstract int l(b07 b07Var);

    public final void l0(l lVar) {
        for (int iW = w() - 1; iW >= 0; iW--) {
            if (!RecyclerView.O(v(iW)).p()) {
                View viewV = v(iW);
                o0(iW);
                lVar.i(viewV);
            }
        }
    }

    public abstract int m(b07 b07Var);

    public final void m0(l lVar) {
        ArrayList arrayList = lVar.a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((o) arrayList.get(i)).a;
            o oVarO = RecyclerView.O(view);
            if (!oVarO.p()) {
                oVarO.o(false);
                if (oVarO.k()) {
                    this.b.removeDetachedView(view, false);
                }
                qz6 qz6Var = this.b.M;
                if (qz6Var != null) {
                    qz6Var.e(oVarO);
                }
                oVarO.o(true);
                o oVarO2 = RecyclerView.O(view);
                oVarO2.n = null;
                oVarO2.o = false;
                oVarO2.j &= -33;
                lVar.j(oVarO2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = lVar.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int n(b07 b07Var);

    public final void n0(View view, l lVar) {
        jp8 jp8Var = this.a;
        hl5 hl5Var = (hl5) jp8Var.c;
        int i = jp8Var.b;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            jp8Var.b = 1;
            jp8Var.f = view;
            int iIndexOfChild = ((RecyclerView) hl5Var.b).indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (((nq0) jp8Var.d).z(iIndexOfChild)) {
                    jp8Var.t(view);
                }
                hl5Var.p(iIndexOfChild);
            }
            jp8Var.b = 0;
            jp8Var.f = null;
            lVar.i(view);
        } catch (Throwable th) {
            jp8Var.b = 0;
            jp8Var.f = null;
            throw th;
        }
    }

    public abstract int o(b07 b07Var);

    public final void o0(int i) {
        if (v(i) != null) {
            jp8 jp8Var = this.a;
            hl5 hl5Var = (hl5) jp8Var.c;
            int i2 = jp8Var.b;
            if (i2 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i2 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int iL = jp8Var.l(i);
                View childAt = ((RecyclerView) hl5Var.b).getChildAt(iL);
                if (childAt != null) {
                    jp8Var.b = 1;
                    jp8Var.f = childAt;
                    if (((nq0) jp8Var.d).z(iL)) {
                        jp8Var.t(childAt);
                    }
                    hl5Var.p(iL);
                }
                jp8Var.b = 0;
                jp8Var.f = null;
            } catch (Throwable th) {
                jp8Var.b = 0;
                jp8Var.f = null;
                throw th;
            }
        }
    }

    public abstract int p(b07 b07Var);

    public boolean p0(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        return q0(recyclerView, view, rect, z, false);
    }

    public final void q(l lVar) {
        for (int iW = w() - 1; iW >= 0; iW--) {
            View viewV = v(iW);
            o oVarO = RecyclerView.O(viewV);
            if (oVarO.p()) {
                if (RecyclerView.a1) {
                    oVarO.toString();
                }
            } else if (!oVarO.g() || oVarO.i() || this.b.m.b) {
                v(iW);
                this.a.g(iW);
                lVar.k(viewV);
                this.b.g.y(oVarO);
            } else {
                o0(iW);
                lVar.j(oVarO);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean q0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.E()
            int r1 = r8.G()
            int r2 = r8.n
            int r3 = r8.F()
            int r2 = r2 - r3
            int r3 = r8.o
            int r4 = r8.D()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            androidx.recyclerview.widget.RecyclerView r3 = r8.b
            int r3 = r3.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L5e
            if (r2 == 0) goto L59
            goto L66
        L59:
            int r2 = java.lang.Math.max(r6, r10)
            goto L66
        L5e:
            if (r6 == 0) goto L61
            goto L65
        L61:
            int r6 = java.lang.Math.min(r4, r2)
        L65:
            r2 = r6
        L66:
            if (r1 == 0) goto L69
            goto L6d
        L69:
            int r1 = java.lang.Math.min(r5, r11)
        L6d:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb0
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7e
            goto Lb5
        L7e:
            int r1 = r8.E()
            int r2 = r8.G()
            int r3 = r8.n
            int r4 = r8.F()
            int r3 = r3 - r4
            int r4 = r8.o
            int r5 = r8.D()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.b
            android.graphics.Rect r5 = r5.j
            r8.z(r5, r13)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb5
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb5
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb5
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lb0
            goto Lb5
        Lb0:
            if (r11 != 0) goto Lb6
            if (r10 == 0) goto Lb5
            goto Lb6
        Lb5:
            return r0
        Lb6:
            if (r12 == 0) goto Lbc
            r9.scrollBy(r11, r10)
            return r7
        Lbc:
            r9.m0(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.k.q0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public View r(int i) {
        int iW = w();
        for (int i2 = 0; i2 < iW; i2++) {
            View viewV = v(i2);
            o oVarO = RecyclerView.O(viewV);
            if (oVarO != null && oVarO.c() == i && !oVarO.p() && (this.b.E0.g || !oVarO.i())) {
                return viewV;
            }
        }
        return null;
    }

    public final void r0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract RecyclerView.LayoutParams s();

    public abstract int s0(int i, b07 b07Var, l lVar);

    public RecyclerView.LayoutParams t(Context context, AttributeSet attributeSet) {
        return new RecyclerView.LayoutParams(context, attributeSet);
    }

    public abstract void t0(int i);

    public RecyclerView.LayoutParams u(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof RecyclerView.LayoutParams ? new RecyclerView.LayoutParams((RecyclerView.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new RecyclerView.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new RecyclerView.LayoutParams(layoutParams);
    }

    public abstract int u0(int i, b07 b07Var, l lVar);

    public final View v(int i) {
        jp8 jp8Var = this.a;
        if (jp8Var != null) {
            return jp8Var.i(i);
        }
        return null;
    }

    public final void v0(RecyclerView recyclerView) {
        w0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final int w() {
        jp8 jp8Var = this.a;
        if (jp8Var != null) {
            return jp8Var.j();
        }
        return 0;
    }

    public final void w0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0 && !RecyclerView.d1) {
            this.n = 0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 != 0 || RecyclerView.d1) {
            return;
        }
        this.o = 0;
    }

    public void x0(Rect rect, int i, int i2) {
        int iF = F() + E() + rect.width();
        int iD = D() + G() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = q69.a;
        this.b.setMeasuredDimension(h(i, iF, recyclerView.getMinimumWidth()), h(i2, iD, this.b.getMinimumHeight()));
    }

    public int y(l lVar, b07 b07Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.m == null || !e()) {
            return 1;
        }
        return this.b.m.c();
    }

    public final void y0(int i, int i2) {
        int iW = w();
        if (iW == 0) {
            this.b.q(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iW; i7++) {
            View viewV = v(i7);
            Rect rect = this.b.j;
            z(rect, viewV);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.j.set(i6, i4, i3, i5);
        x0(this.b.j, i, i2);
    }

    public void z(Rect rect, View view) {
        boolean z = RecyclerView.Z0;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    public final void z0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.f;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public void R() {
    }

    public void a0() {
    }

    public void Z(int i, int i2) {
    }

    public void b0(int i, int i2) {
    }

    public void c0(int i, int i2) {
    }

    public void d0(int i, int i2) {
    }

    public void j(int i, sr0 sr0Var) {
    }

    public void i(int i, int i2, b07 b07Var, sr0 sr0Var) {
    }
}
