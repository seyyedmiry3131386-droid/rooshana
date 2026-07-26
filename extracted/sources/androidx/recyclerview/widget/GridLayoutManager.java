package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b07;
import defpackage.bl4;
import defpackage.dw1;
import defpackage.k74;
import defpackage.mv2;
import defpackage.o3;
import defpackage.q69;
import defpackage.rm7;
import defpackage.s3;
import defpackage.sr0;
import defpackage.t3;
import defpackage.y;
import io.sentry.android.core.t0;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set P = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public y K;
    public final Rect L;
    public int M;
    public int N;
    public int O;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new mv2(4, false);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        z1(k.I(context, attributeSet, i, i2).b);
    }

    public final void A1() {
        int iD;
        int iG;
        if (this.p == 1) {
            iD = this.n - F();
            iG = E();
        } else {
            iD = this.o - D();
            iG = G();
        }
        o1(iD - iG);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k
    public final boolean F0() {
        return this.z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void H0(b07 b07Var, b bVar, sr0 sr0Var) {
        int i;
        int iN = this.F;
        for (int i2 = 0; i2 < this.F && (i = bVar.d) >= 0 && i < b07Var.b() && iN > 0; i2++) {
            int i3 = bVar.d;
            sr0Var.b(i3, Math.max(0, bVar.g));
            iN -= this.K.n(i3);
            bVar.d += bVar.e;
        }
    }

    @Override // androidx.recyclerview.widget.k
    public final int J(l lVar, b07 b07Var) {
        if (this.p == 0) {
            return Math.min(this.F, C());
        }
        if (b07Var.b() < 1) {
            return 0;
        }
        return v1(b07Var.b() - 1, b07Var, lVar) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0142, code lost:
    
        if (r16 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0144, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0145, code lost:
    
        return r17;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View U(android.view.View r23, int r24, androidx.recyclerview.widget.l r25, defpackage.b07 r26) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.U(android.view.View, int, androidx.recyclerview.widget.l, b07):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k
    public final void W(l lVar, b07 b07Var, t3 t3Var) {
        super.W(lVar, b07Var, t3Var);
        t3Var.m(GridView.class.getName());
        g gVar = this.b.m;
        if (gVar == null || gVar.c() <= 1) {
            return;
        }
        t3Var.b(o3.u);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View W0(l lVar, b07 b07Var, boolean z, boolean z2) {
        int i;
        int iW;
        int iW2 = w();
        int i2 = 1;
        if (z2) {
            iW = w() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iW2;
            iW = 0;
        }
        int iB = b07Var.b();
        M0();
        int iM = this.r.m();
        int i3 = this.r.i();
        View view = null;
        View view2 = null;
        while (iW != i) {
            View viewV = v(iW);
            int iH = k.H(viewV);
            if (iH >= 0 && iH < iB && w1(iH, b07Var, lVar) == 0) {
                if (((RecyclerView.LayoutParams) viewV.getLayoutParams()).a.i()) {
                    if (view2 == null) {
                        view2 = viewV;
                    }
                } else {
                    if (this.r.g(viewV) < i3 && this.r.d(viewV) >= iM) {
                        return viewV;
                    }
                    if (view == null) {
                        view = viewV;
                    }
                }
            }
            iW += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.k
    public final void Y(l lVar, b07 b07Var, View view, t3 t3Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            X(view, t3Var);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int iV1 = v1(layoutParams2.a.c(), b07Var, lVar);
        if (this.p == 0) {
            t3Var.o(s3.a(layoutParams2.e, layoutParams2.f, iV1, 1, false, false));
        } else {
            t3Var.o(s3.a(iV1, 1, layoutParams2.e, layoutParams2.f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.k
    public final void Z(int i, int i2) {
        this.K.p();
        ((SparseIntArray) this.K.b).clear();
    }

    @Override // androidx.recyclerview.widget.k
    public final void a0() {
        this.K.p();
        ((SparseIntArray) this.K.b).clear();
    }

    @Override // androidx.recyclerview.widget.k
    public final void b0(int i, int i2) {
        this.K.p();
        ((SparseIntArray) this.K.b).clear();
    }

    @Override // androidx.recyclerview.widget.k
    public final void c0(int i, int i2) {
        this.K.p();
        ((SparseIntArray) this.K.b).clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v34 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void c1(l lVar, b07 b07Var, b bVar, k74 k74Var) {
        int i;
        int i2;
        int i3;
        int iF;
        int iG;
        int iE;
        int iF2;
        int iX;
        int iX2;
        ?? r12;
        int i4;
        View viewB;
        int iL = this.r.l();
        boolean z = iL != 1073741824;
        int i5 = w() > 0 ? this.G[this.F] : 0;
        if (z) {
            A1();
        }
        boolean z2 = bVar.e == 1;
        int iW1 = this.F;
        if (!z2) {
            iW1 = w1(bVar.d, b07Var, lVar) + x1(bVar.d, b07Var, lVar);
        }
        int i6 = 0;
        while (i6 < this.F && (i4 = bVar.d) >= 0 && i4 < b07Var.b() && iW1 > 0) {
            int i7 = bVar.d;
            int iX1 = x1(i7, b07Var, lVar);
            if (iX1 > this.F) {
                throw new IllegalArgumentException(dw1.k(this.F, " spans.", bl4.B(i7, iX1, "Item at position ", " requires ", " spans but GridLayoutManager has only ")));
            }
            iW1 -= iX1;
            if (iW1 < 0 || (viewB = bVar.b(lVar)) == null) {
                break;
            }
            this.H[i6] = viewB;
            i6++;
        }
        if (i6 == 0) {
            k74Var.b = true;
            return;
        }
        if (z2) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.H[i];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int iX12 = x1(k.H(view), b07Var, lVar);
            layoutParams.f = iX12;
            layoutParams.e = i8;
            i8 += iX12;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.H[i10];
            if (bVar.k != null) {
                r12 = 0;
                r12 = 0;
                if (z2) {
                    c(view2, -1, true);
                } else {
                    c(view2, 0, true);
                }
            } else if (z2) {
                r12 = 0;
                c(view2, -1, false);
            } else {
                r12 = 0;
                c(view2, 0, false);
            }
            RecyclerView recyclerView = this.b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.P(view2));
            }
            y1(view2, iL, r12);
            int iE2 = this.r.e(view2);
            if (iE2 > i9) {
                i9 = iE2;
            }
            float f2 = (this.r.f(view2) * 1.0f) / ((LayoutParams) view2.getLayoutParams()).f;
            if (f2 > f) {
                f = f2;
            }
        }
        if (z) {
            o1(Math.max(Math.round(f * this.F), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.H[i11];
                y1(view3, 1073741824, true);
                int iE3 = this.r.e(view3);
                if (iE3 > i9) {
                    i9 = iE3;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.H[i12];
            if (this.r.e(view4) != i9) {
                LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
                Rect rect2 = layoutParams2.b;
                int i13 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                int i14 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                int iU1 = u1(layoutParams2.e, layoutParams2.f);
                if (this.p == 1) {
                    iX2 = k.x(false, iU1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) layoutParams2).width);
                    iX = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iX = k.x(false, iU1, 1073741824, i13, ((ViewGroup.MarginLayoutParams) layoutParams2).height);
                    iX2 = iMakeMeasureSpec;
                }
                if (C0(view4, iX2, iX, (RecyclerView.LayoutParams) view4.getLayoutParams())) {
                    view4.measure(iX2, iX);
                }
            }
        }
        k74Var.a = i9;
        if (this.p != 1) {
            if (bVar.f == -1) {
                int i15 = bVar.b;
                iE = i15 - i9;
                iG = 0;
                iF = i15;
            } else {
                int i16 = bVar.b;
                iF = i16 + i9;
                iG = 0;
                iE = i16;
            }
            iF2 = iG;
        } else if (bVar.f == -1) {
            iF2 = bVar.b;
            iG = iF2 - i9;
            iE = 0;
            iF = 0;
        } else {
            int i17 = bVar.b;
            iF = 0;
            iG = i17;
            iF2 = i17 + i9;
            iE = 0;
        }
        for (int i18 = 0; i18 < i6; i18++) {
            View view5 = this.H[i18];
            LayoutParams layoutParams3 = (LayoutParams) view5.getLayoutParams();
            if (this.p != 1) {
                iG = G() + this.G[layoutParams3.e];
                iF2 = this.r.f(view5) + iG;
            } else if (b1()) {
                int iE4 = E() + this.G[this.F - layoutParams3.e];
                iF = iE4;
                iE = iE4 - this.r.f(view5);
            } else {
                iE = E() + this.G[layoutParams3.e];
                iF = this.r.f(view5) + iE;
            }
            k.O(view5, iE, iG, iF, iF2);
            if (layoutParams3.a.i() || layoutParams3.a.l()) {
                k74Var.c = true;
            }
            k74Var.d = view5.hasFocusable() | k74Var.d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.k
    public final void d0(int i, int i2) {
        this.K.p();
        ((SparseIntArray) this.K.b).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d1(l lVar, b07 b07Var, a aVar, int i) {
        A1();
        if (b07Var.b() > 0 && !b07Var.g) {
            boolean z = i == 1;
            int iW1 = w1(aVar.b, b07Var, lVar);
            if (z) {
                while (iW1 > 0) {
                    int i2 = aVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    aVar.b = i3;
                    iW1 = w1(i3, b07Var, lVar);
                }
            } else {
                int iB = b07Var.b() - 1;
                int i4 = aVar.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iW12 = w1(i5, b07Var, lVar);
                    if (iW12 <= iW1) {
                        break;
                    }
                    i4 = i5;
                    iW1 = iW12;
                }
                aVar.b = i4;
            }
        }
        p1();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k
    public final void e0(l lVar, b07 b07Var) {
        boolean z = b07Var.g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z) {
            int iW = w();
            for (int i = 0; i < iW; i++) {
                LayoutParams layoutParams = (LayoutParams) v(i).getLayoutParams();
                int iC = layoutParams.a.c();
                sparseIntArray2.put(iC, layoutParams.f);
                sparseIntArray.put(iC, layoutParams.e);
            }
        }
        super.e0(lVar, b07Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k
    public final void f0(b07 b07Var) {
        View viewR;
        super.f0(b07Var);
        this.E = false;
        int i = this.M;
        if (i == -1 || (viewR = r(i)) == null) {
            return;
        }
        viewR.sendAccessibilityEvent(67108864);
        this.M = -1;
    }

    @Override // androidx.recyclerview.widget.k
    public final boolean g(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a9 A[EDGE_INSN: B:206:0x01a9->B:122:0x01a9 BREAK  A[LOOP:2: B:126:0x01b9->B:135:0x01e2, LOOP_LABEL: LOOP:2: B:126:0x01b9->B:135:0x01e2], EDGE_INSN: B:213:0x01a9->B:122:0x01a9 BREAK  A[LOOP:5: B:148:0x0221->B:159:0x0251, LOOP_LABEL: LOOP:5: B:148:0x0221->B:159:0x0251]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x027e  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j0(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instruction units count: 729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.j0(int, android.os.Bundle):boolean");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void k1(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.k1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k
    public final int l(b07 b07Var) {
        return J0(b07Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k
    public final int m(b07 b07Var) {
        return K0(b07Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k
    public final int o(b07 b07Var) {
        return J0(b07Var);
    }

    public final void o1(int i) {
        int i2;
        int[] iArr = this.G;
        int i3 = this.F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.G = iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k
    public final int p(b07 b07Var) {
        return K0(b07Var);
    }

    public final void p1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int q1(int i) {
        if (this.p == 0) {
            RecyclerView recyclerView = this.b;
            return v1(i, recyclerView.E0, recyclerView.c);
        }
        RecyclerView recyclerView2 = this.b;
        return w1(i, recyclerView2.E0, recyclerView2.c);
    }

    public final int r1(int i) {
        if (this.p == 1) {
            RecyclerView recyclerView = this.b;
            return v1(i, recyclerView.E0, recyclerView.c);
        }
        RecyclerView recyclerView2 = this.b;
        return w1(i, recyclerView2.E0, recyclerView2.c);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k
    public final RecyclerView.LayoutParams s() {
        return this.p == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k
    public final int s0(int i, b07 b07Var, l lVar) {
        A1();
        p1();
        return super.s0(i, b07Var, lVar);
    }

    public final HashSet s1(int i) {
        return t1(r1(i), i);
    }

    @Override // androidx.recyclerview.widget.k
    public final RecyclerView.LayoutParams t(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public final HashSet t1(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.b;
        int iX1 = x1(i2, recyclerView.E0, recyclerView.c);
        for (int i3 = i; i3 < i + iX1; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    @Override // androidx.recyclerview.widget.k
    public final RecyclerView.LayoutParams u(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams2 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams2.e = -1;
            layoutParams2.f = 0;
            return layoutParams2;
        }
        LayoutParams layoutParams3 = new LayoutParams(layoutParams);
        layoutParams3.e = -1;
        layoutParams3.f = 0;
        return layoutParams3;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k
    public final int u0(int i, b07 b07Var, l lVar) {
        A1();
        p1();
        return super.u0(i, b07Var, lVar);
    }

    public final int u1(int i, int i2) {
        if (this.p != 1 || !b1()) {
            int[] iArr = this.G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i3 = this.F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int v1(int i, b07 b07Var, l lVar) {
        if (!b07Var.g) {
            return this.K.l(i, this.F);
        }
        int iB = lVar.b(i);
        if (iB != -1) {
            return this.K.l(iB, this.F);
        }
        t0.m("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int w1(int i, b07 b07Var, l lVar) {
        if (!b07Var.g) {
            return this.K.m(i, this.F);
        }
        int i2 = this.J.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iB = lVar.b(i);
        if (iB != -1) {
            return this.K.m(iB, this.F);
        }
        t0.m("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.k
    public final void x0(Rect rect, int i, int i2) {
        int iH;
        int iH2;
        if (this.G == null) {
            super.x0(rect, i, i2);
        }
        int iF = F() + E();
        int iD = D() + G();
        if (this.p == 1) {
            int iHeight = rect.height() + iD;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = q69.a;
            iH2 = k.h(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.G;
            iH = k.h(i, iArr[iArr.length - 1] + iF, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = q69.a;
            iH = k.h(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.G;
            iH2 = k.h(i2, iArr2[iArr2.length - 1] + iD, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iH, iH2);
    }

    public final int x1(int i, b07 b07Var, l lVar) {
        if (!b07Var.g) {
            return this.K.n(i);
        }
        int i2 = this.I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iB = lVar.b(i);
        if (iB != -1) {
            return this.K.n(iB);
        }
        t0.m("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.k
    public final int y(l lVar, b07 b07Var) {
        if (this.p == 1) {
            return Math.min(this.F, C());
        }
        if (b07Var.b() < 1) {
            return 0;
        }
        return v1(b07Var.b() - 1, b07Var, lVar) + 1;
    }

    public final void y1(View view, int i, boolean z) {
        int iX;
        int iX2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int iU1 = u1(layoutParams.e, layoutParams.f);
        if (this.p == 1) {
            iX2 = k.x(false, iU1, i, i3, ((ViewGroup.MarginLayoutParams) layoutParams).width);
            iX = k.x(true, this.r.n(), this.m, i2, ((ViewGroup.MarginLayoutParams) layoutParams).height);
        } else {
            int iX3 = k.x(false, iU1, i, i2, ((ViewGroup.MarginLayoutParams) layoutParams).height);
            int iX4 = k.x(true, this.r.n(), this.l, i3, ((ViewGroup.MarginLayoutParams) layoutParams).width);
            iX = iX3;
            iX2 = iX4;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z ? C0(view, iX2, iX, layoutParams2) : A0(view, iX2, iX, layoutParams2)) {
            view.measure(iX2, iX);
        }
    }

    public final void z1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            throw new IllegalArgumentException(rm7.n(i, "Span count should be at least 1. Provided "));
        }
        this.F = i;
        this.K.p();
        r0();
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {
        public int e;
        public int f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = -1;
            this.f = 0;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.e = -1;
            this.f = 0;
        }
    }

    public GridLayoutManager(int i, int i2) {
        super(i2);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new mv2(4, false);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        z1(i);
    }

    public GridLayoutManager(int i) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new mv2(4, false);
        this.L = new Rect();
        this.M = -1;
        this.N = -1;
        this.O = -1;
        z1(i);
    }
}
