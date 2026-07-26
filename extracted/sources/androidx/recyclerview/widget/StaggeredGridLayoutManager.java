package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a07;
import defpackage.b07;
import defpackage.b67;
import defpackage.f48;
import defpackage.fp7;
import defpackage.q69;
import defpackage.rz6;
import defpackage.s3;
import defpackage.sr0;
import defpackage.t3;
import defpackage.vz1;
import defpackage.w14;
import defpackage.zz6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends k implements zz6 {
    public int A;
    public final q B;
    public final int C;
    public boolean D;
    public boolean E;
    public SavedState F;
    public int G;
    public final Rect H;
    public final f48 I;
    public boolean J;
    public final boolean K;
    public int[] L;
    public final fp7 M;
    public int p;
    public s[] q;
    public final vz1 r;
    public final vz1 s;
    public final int t;
    public int u;
    public final w14 v;
    public boolean w;
    public boolean x;
    public BitSet y;
    public int z;

    public static class LayoutParams extends RecyclerView.LayoutParams {
        public s e;
        public boolean f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new r();
        public int a;
        public int b;
        public int c;
        public int[] d;
        public int e;
        public int[] f;
        public ArrayList g;
        public boolean h;
        public boolean i;
        public boolean j;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            if (this.c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeList(this.g);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = -1;
        this.w = false;
        this.x = false;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = new q();
        this.C = 2;
        this.H = new Rect();
        this.I = new f48(this);
        this.J = false;
        this.K = true;
        this.M = new fp7(2, this);
        rz6 rz6VarI = k.I(context, attributeSet, i, i2);
        int i3 = rz6VarI.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        d(null);
        if (i3 != this.t) {
            this.t = i3;
            vz1 vz1Var = this.r;
            this.r = this.s;
            this.s = vz1Var;
            r0();
        }
        e1(rz6VarI.b);
        boolean z = rz6VarI.c;
        d(null);
        SavedState savedState = this.F;
        if (savedState != null && savedState.h != z) {
            savedState.h = z;
        }
        this.w = z;
        r0();
        this.v = new w14();
        this.r = vz1.b(this, this.t);
        this.s = vz1.b(this, 1 - this.t);
    }

    public static int i1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.k
    public final void D0(RecyclerView recyclerView, int i) {
        d dVar = new d(recyclerView.getContext());
        dVar.a = i;
        E0(dVar);
    }

    @Override // androidx.recyclerview.widget.k
    public final boolean F0() {
        return this.F == null;
    }

    public final boolean G0() {
        int iN0;
        int iO0;
        if (w() != 0 && this.C != 0 && this.g) {
            if (this.x) {
                iN0 = O0();
                iO0 = N0();
            } else {
                iN0 = N0();
                iO0 = O0();
            }
            q qVar = this.B;
            if (iN0 == 0 && S0() != null) {
                qVar.b();
                this.f = true;
                r0();
                return true;
            }
            if (this.J) {
                int i = this.x ? -1 : 1;
                int i2 = iO0 + 1;
                StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItemE = qVar.e(iN0, i2, i);
                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItemE == null) {
                    this.J = false;
                    qVar.d(i2);
                    return false;
                }
                StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItemE2 = qVar.e(iN0, staggeredGridLayoutManager$LazySpanLookup$FullSpanItemE.a, i * (-1));
                if (staggeredGridLayoutManager$LazySpanLookup$FullSpanItemE2 == null) {
                    qVar.d(staggeredGridLayoutManager$LazySpanLookup$FullSpanItemE.a);
                } else {
                    qVar.d(staggeredGridLayoutManager$LazySpanLookup$FullSpanItemE2.a + 1);
                }
                this.f = true;
                r0();
                return true;
            }
        }
        return false;
    }

    public final int H0(b07 b07Var) {
        if (w() == 0) {
            return 0;
        }
        boolean z = !this.K;
        return b67.c(b07Var, this.r, K0(z), J0(z), this, this.K, this.x);
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x032f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int I0(androidx.recyclerview.widget.l r22, defpackage.w14 r23, defpackage.b07 r24) {
        /*
            Method dump skipped, instruction units count: 915
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.I0(androidx.recyclerview.widget.l, w14, b07):int");
    }

    @Override // androidx.recyclerview.widget.k
    public final int J(l lVar, b07 b07Var) {
        if (this.t == 0) {
            return Math.min(this.p, b07Var.b());
        }
        return -1;
    }

    public final View J0(boolean z) {
        int iM = this.r.m();
        int i = this.r.i();
        View view = null;
        for (int iW = w() - 1; iW >= 0; iW--) {
            View viewV = v(iW);
            int iG = this.r.g(viewV);
            int iD = this.r.d(viewV);
            if (iD > iM && iG < i) {
                if (iD <= i || !z) {
                    return viewV;
                }
                if (view == null) {
                    view = viewV;
                }
            }
        }
        return view;
    }

    public final View K0(boolean z) {
        int iM = this.r.m();
        int i = this.r.i();
        int iW = w();
        View view = null;
        for (int i2 = 0; i2 < iW; i2++) {
            View viewV = v(i2);
            int iG = this.r.g(viewV);
            if (this.r.d(viewV) > iM && iG < i) {
                if (iG >= iM || !z) {
                    return viewV;
                }
                if (view == null) {
                    view = viewV;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.k
    public boolean L() {
        return this.C != 0;
    }

    public final void L0(l lVar, b07 b07Var, boolean z) {
        int i;
        int iP0 = P0(Integer.MIN_VALUE);
        if (iP0 != Integer.MIN_VALUE && (i = this.r.i() - iP0) > 0) {
            int i2 = i - (-c1(-i, b07Var, lVar));
            if (!z || i2 <= 0) {
                return;
            }
            this.r.q(i2);
        }
    }

    @Override // androidx.recyclerview.widget.k
    public final boolean M() {
        return this.w;
    }

    public final void M0(l lVar, b07 b07Var, boolean z) {
        int iM;
        int iQ0 = Q0(Integer.MAX_VALUE);
        if (iQ0 != Integer.MAX_VALUE && (iM = iQ0 - this.r.m()) > 0) {
            int iC1 = iM - c1(iM, b07Var, lVar);
            if (!z || iC1 <= 0) {
                return;
            }
            this.r.q(-iC1);
        }
    }

    public final int N0() {
        if (w() == 0) {
            return 0;
        }
        return k.H(v(0));
    }

    public final int O0() {
        int iW = w();
        if (iW == 0) {
            return 0;
        }
        return k.H(v(iW - 1));
    }

    @Override // androidx.recyclerview.widget.k
    public final void P(int i) {
        super.P(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            s sVar = this.q[i2];
            int i3 = sVar.b;
            if (i3 != Integer.MIN_VALUE) {
                sVar.b = i3 + i;
            }
            int i4 = sVar.c;
            if (i4 != Integer.MIN_VALUE) {
                sVar.c = i4 + i;
            }
        }
    }

    public final int P0(int i) {
        int iH = this.q[0].h(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iH2 = this.q[i2].h(i);
            if (iH2 > iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    @Override // androidx.recyclerview.widget.k
    public final void Q(int i) {
        super.Q(i);
        for (int i2 = 0; i2 < this.p; i2++) {
            s sVar = this.q[i2];
            int i3 = sVar.b;
            if (i3 != Integer.MIN_VALUE) {
                sVar.b = i3 + i;
            }
            int i4 = sVar.c;
            if (i4 != Integer.MIN_VALUE) {
                sVar.c = i4 + i;
            }
        }
    }

    public final int Q0(int i) {
        int iJ = this.q[0].j(i);
        for (int i2 = 1; i2 < this.p; i2++) {
            int iJ2 = this.q[i2].j(i);
            if (iJ2 < iJ) {
                iJ = iJ2;
            }
        }
        return iJ;
    }

    @Override // androidx.recyclerview.widget.k
    public final void R() {
        this.B.b();
        for (int i = 0; i < this.p; i++) {
            this.q[i].d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R0(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.x
            if (r0 == 0) goto L9
            int r0 = r7.O0()
            goto Ld
        L9:
            int r0 = r7.N0()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1b
            if (r8 >= r9) goto L17
            int r2 = r9 + 1
        L15:
            r3 = r8
            goto L1e
        L17:
            int r2 = r8 + 1
            r3 = r9
            goto L1e
        L1b:
            int r2 = r8 + r9
            goto L15
        L1e:
            androidx.recyclerview.widget.q r4 = r7.B
            r4.g(r3)
            r5 = 1
            if (r10 == r5) goto L37
            r6 = 2
            if (r10 == r6) goto L33
            if (r10 == r1) goto L2c
            goto L3a
        L2c:
            r4.i(r8, r5)
            r4.h(r9, r5)
            goto L3a
        L33:
            r4.i(r8, r9)
            goto L3a
        L37:
            r4.h(r8, r9)
        L3a:
            if (r2 > r0) goto L3d
            goto L4f
        L3d:
            boolean r8 = r7.x
            if (r8 == 0) goto L46
            int r8 = r7.N0()
            goto L4a
        L46:
            int r8 = r7.O0()
        L4a:
            if (r3 > r8) goto L4f
            r7.r0()
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.R0(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View S0() {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.S0():android.view.View");
    }

    @Override // androidx.recyclerview.widget.k
    public final void T(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.M);
        }
        for (int i = 0; i < this.p; i++) {
            this.q[i].d();
        }
        recyclerView.requestLayout();
    }

    public final boolean T0() {
        return this.b.getLayoutDirection() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    @Override // androidx.recyclerview.widget.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View U(android.view.View r10, int r11, androidx.recyclerview.widget.l r12, defpackage.b07 r13) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.U(android.view.View, int, androidx.recyclerview.widget.l, b07):android.view.View");
    }

    public final void U0(View view, int i, int i2) {
        RecyclerView recyclerView = this.b;
        Rect rect = this.H;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.P(view));
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iI1 = i1(i, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int iI12 = i1(i2, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect.bottom);
        if (A0(view, iI1, iI12, layoutParams)) {
            view.measure(iI1, iI12);
        }
    }

    @Override // androidx.recyclerview.widget.k
    public final void V(AccessibilityEvent accessibilityEvent) {
        super.V(accessibilityEvent);
        if (w() > 0) {
            View viewK0 = K0(false);
            View viewJ0 = J0(false);
            if (viewK0 == null || viewJ0 == null) {
                return;
            }
            int iH = k.H(viewK0);
            int iH2 = k.H(viewJ0);
            if (iH < iH2) {
                accessibilityEvent.setFromIndex(iH);
                accessibilityEvent.setToIndex(iH2);
            } else {
                accessibilityEvent.setFromIndex(iH2);
                accessibilityEvent.setToIndex(iH);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x042d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V0(androidx.recyclerview.widget.l r17, defpackage.b07 r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 1096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.V0(androidx.recyclerview.widget.l, b07, boolean):void");
    }

    @Override // androidx.recyclerview.widget.k
    public final void W(l lVar, b07 b07Var, t3 t3Var) {
        super.W(lVar, b07Var, t3Var);
        t3Var.m("androidx.recyclerview.widget.StaggeredGridLayoutManager");
    }

    public final boolean W0(int i) {
        if (this.t == 0) {
            return (i == -1) != this.x;
        }
        return ((i == -1) == this.x) == T0();
    }

    public final void X0(int i, b07 b07Var) {
        int iN0;
        int i2;
        if (i > 0) {
            iN0 = O0();
            i2 = 1;
        } else {
            iN0 = N0();
            i2 = -1;
        }
        w14 w14Var = this.v;
        w14Var.a = true;
        g1(iN0, b07Var);
        d1(i2);
        w14Var.c = iN0 + w14Var.d;
        w14Var.b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.k
    public final void Y(l lVar, b07 b07Var, View view, t3 t3Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            X(view, t3Var);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        if (this.t == 0) {
            s sVar = layoutParams2.e;
            t3Var.o(s3.a(sVar != null ? sVar.e : -1, layoutParams2.f ? this.p : 1, -1, -1, false, false));
        } else {
            s sVar2 = layoutParams2.e;
            t3Var.o(s3.a(-1, -1, sVar2 != null ? sVar2.e : -1, layoutParams2.f ? this.p : 1, false, false));
        }
    }

    public final void Y0(l lVar, w14 w14Var) {
        if (!w14Var.a || w14Var.i) {
            return;
        }
        if (w14Var.b == 0) {
            if (w14Var.e == -1) {
                Z0(lVar, w14Var.g);
                return;
            } else {
                a1(lVar, w14Var.f);
                return;
            }
        }
        int i = 1;
        if (w14Var.e == -1) {
            int i2 = w14Var.f;
            int iJ = this.q[0].j(i2);
            while (i < this.p) {
                int iJ2 = this.q[i].j(i2);
                if (iJ2 > iJ) {
                    iJ = iJ2;
                }
                i++;
            }
            int i3 = i2 - iJ;
            Z0(lVar, i3 < 0 ? w14Var.g : w14Var.g - Math.min(i3, w14Var.b));
            return;
        }
        int i4 = w14Var.g;
        int iH = this.q[0].h(i4);
        while (i < this.p) {
            int iH2 = this.q[i].h(i4);
            if (iH2 < iH) {
                iH = iH2;
            }
            i++;
        }
        int i5 = iH - w14Var.g;
        a1(lVar, i5 < 0 ? w14Var.f : Math.min(i5, w14Var.b) + w14Var.f);
    }

    @Override // androidx.recyclerview.widget.k
    public final void Z(int i, int i2) {
        R0(i, i2, 1);
    }

    public final void Z0(l lVar, int i) {
        for (int iW = w() - 1; iW >= 0; iW--) {
            View viewV = v(iW);
            if (this.r.g(viewV) < i || this.r.p(viewV) < i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) viewV.getLayoutParams();
            if (layoutParams.f) {
                for (int i2 = 0; i2 < this.p; i2++) {
                    if (this.q[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.p; i3++) {
                    this.q[i3].k();
                }
            } else if (layoutParams.e.a.size() == 1) {
                return;
            } else {
                layoutParams.e.k();
            }
            n0(viewV, lVar);
        }
    }

    @Override // androidx.recyclerview.widget.k
    public final void a0() {
        this.B.b();
        r0();
    }

    public final void a1(l lVar, int i) {
        while (w() > 0) {
            View viewV = v(0);
            if (this.r.d(viewV) > i || this.r.o(viewV) > i) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) viewV.getLayoutParams();
            if (layoutParams.f) {
                for (int i2 = 0; i2 < this.p; i2++) {
                    if (this.q[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.p; i3++) {
                    this.q[i3].l();
                }
            } else if (layoutParams.e.a.size() == 1) {
                return;
            } else {
                layoutParams.e.l();
            }
            n0(viewV, lVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // defpackage.zz6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PointF b(int r4) {
        /*
            r3 = this;
            int r0 = r3.w()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.N0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.t
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.b(int):android.graphics.PointF");
    }

    @Override // androidx.recyclerview.widget.k
    public final void b0(int i, int i2) {
        R0(i, i2, 8);
    }

    public final void b1() {
        if (this.t == 1 || !T0()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    @Override // androidx.recyclerview.widget.k
    public final void c0(int i, int i2) {
        R0(i, i2, 2);
    }

    public final int c1(int i, b07 b07Var, l lVar) {
        if (w() == 0 || i == 0) {
            return 0;
        }
        X0(i, b07Var);
        w14 w14Var = this.v;
        int iI0 = I0(lVar, w14Var, b07Var);
        if (w14Var.b >= iI0) {
            i = i < 0 ? -iI0 : iI0;
        }
        this.r.q(-i);
        this.D = this.x;
        w14Var.b = 0;
        Y0(lVar, w14Var);
        return i;
    }

    @Override // androidx.recyclerview.widget.k
    public final void d(String str) {
        if (this.F == null) {
            super.d(str);
        }
    }

    @Override // androidx.recyclerview.widget.k
    public final void d0(int i, int i2) {
        R0(i, i2, 4);
    }

    public final void d1(int i) {
        w14 w14Var = this.v;
        w14Var.e = i;
        w14Var.d = this.x != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.k
    public final boolean e() {
        return this.t == 0;
    }

    @Override // androidx.recyclerview.widget.k
    public final void e0(l lVar, b07 b07Var) {
        V0(lVar, b07Var, true);
    }

    public final void e1(int i) {
        d(null);
        if (i != this.p) {
            this.B.b();
            r0();
            this.p = i;
            this.y = new BitSet(this.p);
            this.q = new s[this.p];
            for (int i2 = 0; i2 < this.p; i2++) {
                this.q[i2] = new s(this, i2);
            }
            r0();
        }
    }

    @Override // androidx.recyclerview.widget.k
    public final boolean f() {
        return this.t == 1;
    }

    @Override // androidx.recyclerview.widget.k
    public final void f0(b07 b07Var) {
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.I.a();
    }

    public final void f1(int i, int i2) {
        for (int i3 = 0; i3 < this.p; i3++) {
            if (!this.q[i3].a.isEmpty()) {
                h1(this.q[i3], i, i2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.k
    public final boolean g(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.k
    public final void g0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.F = savedState;
            if (this.z != -1) {
                savedState.a = -1;
                savedState.b = -1;
                savedState.d = null;
                savedState.c = 0;
                savedState.e = 0;
                savedState.f = null;
                savedState.g = null;
            }
            r0();
        }
    }

    public final void g1(int i, b07 b07Var) {
        int iN;
        int iN2;
        int i2;
        w14 w14Var = this.v;
        boolean z = false;
        w14Var.b = 0;
        w14Var.c = i;
        a07 a07Var = this.e;
        if (a07Var == null || !a07Var.e || (i2 = b07Var.a) == -1) {
            iN = 0;
            iN2 = 0;
        } else {
            if (this.x == (i2 < i)) {
                iN = this.r.n();
                iN2 = 0;
            } else {
                iN2 = this.r.n();
                iN = 0;
            }
        }
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || !recyclerView.h) {
            w14Var.g = this.r.h() + iN;
            w14Var.f = -iN2;
        } else {
            w14Var.f = this.r.m() - iN2;
            w14Var.g = this.r.i() + iN;
        }
        w14Var.h = false;
        w14Var.a = true;
        if (this.r.k() == 0 && this.r.h() == 0) {
            z = true;
        }
        w14Var.i = z;
    }

    @Override // androidx.recyclerview.widget.k
    public final Parcelable h0() {
        int iJ;
        int iM;
        int[] iArr;
        SavedState savedState = this.F;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.c = savedState.c;
            savedState2.a = savedState.a;
            savedState2.b = savedState.b;
            savedState2.d = savedState.d;
            savedState2.e = savedState.e;
            savedState2.f = savedState.f;
            savedState2.h = savedState.h;
            savedState2.i = savedState.i;
            savedState2.j = savedState.j;
            savedState2.g = savedState.g;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        savedState3.h = this.w;
        savedState3.i = this.D;
        savedState3.j = this.E;
        q qVar = this.B;
        if (qVar == null || (iArr = qVar.a) == null) {
            savedState3.e = 0;
        } else {
            savedState3.f = iArr;
            savedState3.e = iArr.length;
            savedState3.g = qVar.b;
        }
        if (w() <= 0) {
            savedState3.a = -1;
            savedState3.b = -1;
            savedState3.c = 0;
            return savedState3;
        }
        savedState3.a = this.D ? O0() : N0();
        View viewJ0 = this.x ? J0(true) : K0(true);
        savedState3.b = viewJ0 != null ? k.H(viewJ0) : -1;
        int i = this.p;
        savedState3.c = i;
        savedState3.d = new int[i];
        for (int i2 = 0; i2 < this.p; i2++) {
            if (this.D) {
                iJ = this.q[i2].h(Integer.MIN_VALUE);
                if (iJ != Integer.MIN_VALUE) {
                    iM = this.r.i();
                    iJ -= iM;
                }
            } else {
                iJ = this.q[i2].j(Integer.MIN_VALUE);
                if (iJ != Integer.MIN_VALUE) {
                    iM = this.r.m();
                    iJ -= iM;
                }
            }
            savedState3.d[i2] = iJ;
        }
        return savedState3;
    }

    public final void h1(s sVar, int i, int i2) {
        int i3 = sVar.d;
        int i4 = sVar.e;
        if (i == -1) {
            int i5 = sVar.b;
            if (i5 == Integer.MIN_VALUE) {
                sVar.c();
                i5 = sVar.b;
            }
            if (i5 + i3 <= i2) {
                this.y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = sVar.c;
        if (i6 == Integer.MIN_VALUE) {
            sVar.b();
            i6 = sVar.c;
        }
        if (i6 - i3 >= i2) {
            this.y.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.k
    public final void i(int i, int i2, b07 b07Var, sr0 sr0Var) {
        w14 w14Var;
        int iH;
        int iJ;
        if (this.t != 0) {
            i = i2;
        }
        if (w() == 0 || i == 0) {
            return;
        }
        X0(i, b07Var);
        int[] iArr = this.L;
        if (iArr == null || iArr.length < this.p) {
            this.L = new int[this.p];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.p;
            w14Var = this.v;
            if (i3 >= i5) {
                break;
            }
            if (w14Var.d == -1) {
                iH = w14Var.f;
                iJ = this.q[i3].j(iH);
            } else {
                iH = this.q[i3].h(w14Var.g);
                iJ = w14Var.g;
            }
            int i6 = iH - iJ;
            if (i6 >= 0) {
                this.L[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.L, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = w14Var.c;
            if (i8 < 0 || i8 >= b07Var.b()) {
                return;
            }
            sr0Var.b(w14Var.c, this.L[i7]);
            w14Var.c += w14Var.d;
        }
    }

    @Override // androidx.recyclerview.widget.k
    public final void i0(int i) {
        if (i == 0) {
            G0();
        }
    }

    @Override // androidx.recyclerview.widget.k
    public final int k(b07 b07Var) {
        if (w() == 0) {
            return 0;
        }
        boolean z = !this.K;
        return b67.b(b07Var, this.r, K0(z), J0(z), this, this.K);
    }

    @Override // androidx.recyclerview.widget.k
    public final int l(b07 b07Var) {
        return H0(b07Var);
    }

    @Override // androidx.recyclerview.widget.k
    public final int m(b07 b07Var) {
        if (w() == 0) {
            return 0;
        }
        boolean z = !this.K;
        return b67.d(b07Var, this.r, K0(z), J0(z), this, this.K);
    }

    @Override // androidx.recyclerview.widget.k
    public final int n(b07 b07Var) {
        if (w() == 0) {
            return 0;
        }
        boolean z = !this.K;
        return b67.b(b07Var, this.r, K0(z), J0(z), this, this.K);
    }

    @Override // androidx.recyclerview.widget.k
    public final int o(b07 b07Var) {
        return H0(b07Var);
    }

    @Override // androidx.recyclerview.widget.k
    public final int p(b07 b07Var) {
        if (w() == 0) {
            return 0;
        }
        boolean z = !this.K;
        return b67.d(b07Var, this.r, K0(z), J0(z), this, this.K);
    }

    @Override // androidx.recyclerview.widget.k
    public final RecyclerView.LayoutParams s() {
        return this.t == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.k
    public final int s0(int i, b07 b07Var, l lVar) {
        return c1(i, b07Var, lVar);
    }

    @Override // androidx.recyclerview.widget.k
    public final RecyclerView.LayoutParams t(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.k
    public final void t0(int i) {
        SavedState savedState = this.F;
        if (savedState != null && savedState.a != i) {
            savedState.d = null;
            savedState.c = 0;
            savedState.a = -1;
            savedState.b = -1;
        }
        this.z = i;
        this.A = Integer.MIN_VALUE;
        r0();
    }

    @Override // androidx.recyclerview.widget.k
    public final RecyclerView.LayoutParams u(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.k
    public final int u0(int i, b07 b07Var, l lVar) {
        return c1(i, b07Var, lVar);
    }

    @Override // androidx.recyclerview.widget.k
    public final void x0(Rect rect, int i, int i2) {
        int iH;
        int iH2;
        int iF = F() + E();
        int iD = D() + G();
        if (this.t == 1) {
            int iHeight = rect.height() + iD;
            RecyclerView recyclerView = this.b;
            WeakHashMap weakHashMap = q69.a;
            iH2 = k.h(i2, iHeight, recyclerView.getMinimumHeight());
            iH = k.h(i, (this.u * this.p) + iF, this.b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iF;
            RecyclerView recyclerView2 = this.b;
            WeakHashMap weakHashMap2 = q69.a;
            iH = k.h(i, iWidth, recyclerView2.getMinimumWidth());
            iH2 = k.h(i2, (this.u * this.p) + iD, this.b.getMinimumHeight());
        }
        this.b.setMeasuredDimension(iH, iH2);
    }

    @Override // androidx.recyclerview.widget.k
    public final int y(l lVar, b07 b07Var) {
        if (this.t == 1) {
            return Math.min(this.p, b07Var.b());
        }
        return -1;
    }

    public StaggeredGridLayoutManager(int i) {
        this.p = -1;
        this.w = false;
        this.x = false;
        this.z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = new q();
        this.C = 2;
        this.H = new Rect();
        this.I = new f48(this);
        this.J = false;
        this.K = true;
        this.M = new fp7(2, this);
        this.t = 1;
        e1(i);
        this.v = new w14();
        this.r = vz1.b(this, this.t);
        this.s = vz1.b(this, 1 - this.t);
    }
}
