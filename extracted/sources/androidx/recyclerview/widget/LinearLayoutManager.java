package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b07;
import defpackage.b67;
import defpackage.k74;
import defpackage.o3;
import defpackage.rm7;
import defpackage.rz6;
import defpackage.sr0;
import defpackage.t3;
import defpackage.vz1;
import defpackage.zz6;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends k implements zz6 {
    public final a A;
    public final k74 B;
    public final int C;
    public final int[] D;
    public int p;
    public b q;
    public vz1 r;
    public boolean s;
    public final boolean t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public int x;
    public int y;
    public SavedState z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new c();
        public int a;
        public int b;
        public boolean c;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new a();
        this.B = new k74();
        this.C = 2;
        this.D = new int[2];
        j1(i);
        d(null);
        if (this.t) {
            this.t = false;
            r0();
        }
    }

    @Override // androidx.recyclerview.widget.k
    public final boolean B0() {
        if (this.m != 1073741824 && this.l != 1073741824) {
            int iW = w();
            for (int i = 0; i < iW; i++) {
                ViewGroup.LayoutParams layoutParams = v(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.k
    public void D0(RecyclerView recyclerView, int i) {
        d dVar = new d(recyclerView.getContext());
        dVar.a = i;
        E0(dVar);
    }

    @Override // androidx.recyclerview.widget.k
    public boolean F0() {
        return this.z == null && this.s == this.v;
    }

    public void G0(b07 b07Var, int[] iArr) {
        int i;
        int iN = b07Var.a != -1 ? this.r.n() : 0;
        if (this.q.f == -1) {
            i = 0;
        } else {
            i = iN;
            iN = 0;
        }
        iArr[0] = iN;
        iArr[1] = i;
    }

    public void H0(b07 b07Var, b bVar, sr0 sr0Var) {
        int i = bVar.d;
        if (i < 0 || i >= b07Var.b()) {
            return;
        }
        sr0Var.b(i, Math.max(0, bVar.g));
    }

    public final int I0(b07 b07Var) {
        if (w() == 0) {
            return 0;
        }
        M0();
        vz1 vz1Var = this.r;
        boolean z = !this.w;
        return b67.b(b07Var, vz1Var, Q0(z), P0(z), this, this.w);
    }

    public final int J0(b07 b07Var) {
        if (w() == 0) {
            return 0;
        }
        M0();
        vz1 vz1Var = this.r;
        boolean z = !this.w;
        return b67.c(b07Var, vz1Var, Q0(z), P0(z), this, this.w, this.u);
    }

    public final int K0(b07 b07Var) {
        if (w() == 0) {
            return 0;
        }
        M0();
        vz1 vz1Var = this.r;
        boolean z = !this.w;
        return b67.d(b07Var, vz1Var, Q0(z), P0(z), this, this.w);
    }

    @Override // androidx.recyclerview.widget.k
    public boolean L() {
        return true;
    }

    public final int L0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.p == 1) ? 1 : Integer.MIN_VALUE : this.p == 0 ? 1 : Integer.MIN_VALUE : this.p == 1 ? -1 : Integer.MIN_VALUE : this.p == 0 ? -1 : Integer.MIN_VALUE : (this.p != 1 && b1()) ? -1 : 1 : (this.p != 1 && b1()) ? 1 : -1;
    }

    @Override // androidx.recyclerview.widget.k
    public final boolean M() {
        return this.t;
    }

    public final void M0() {
        if (this.q == null) {
            b bVar = new b();
            bVar.a = true;
            bVar.h = 0;
            bVar.i = 0;
            bVar.k = null;
            this.q = bVar;
        }
    }

    public final int N0(l lVar, b bVar, b07 b07Var, boolean z) {
        int i;
        int i2 = bVar.c;
        int i3 = bVar.g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                bVar.g = i3 + i2;
            }
            e1(lVar, bVar);
        }
        int i4 = bVar.c + bVar.h;
        while (true) {
            if ((!bVar.l && i4 <= 0) || (i = bVar.d) < 0 || i >= b07Var.b()) {
                break;
            }
            k74 k74Var = this.B;
            k74Var.a = 0;
            k74Var.b = false;
            k74Var.c = false;
            k74Var.d = false;
            c1(lVar, b07Var, bVar, k74Var);
            if (!k74Var.b) {
                int i5 = bVar.b;
                int i6 = k74Var.a;
                bVar.b = (bVar.f * i6) + i5;
                if (!k74Var.c || bVar.k != null || !b07Var.g) {
                    bVar.c -= i6;
                    i4 -= i6;
                }
                int i7 = bVar.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    bVar.g = i8;
                    int i9 = bVar.c;
                    if (i9 < 0) {
                        bVar.g = i8 + i9;
                    }
                    e1(lVar, bVar);
                }
                if (z && k74Var.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - bVar.c;
    }

    public final int O0() {
        View viewV0 = V0(0, w(), true, false);
        if (viewV0 == null) {
            return -1;
        }
        return k.H(viewV0);
    }

    public final View P0(boolean z) {
        return this.u ? V0(0, w(), z, true) : V0(w() - 1, -1, z, true);
    }

    public final View Q0(boolean z) {
        return this.u ? V0(w() - 1, -1, z, true) : V0(0, w(), z, true);
    }

    public final int R0() {
        View viewV0 = V0(0, w(), false, true);
        if (viewV0 == null) {
            return -1;
        }
        return k.H(viewV0);
    }

    public final int S0() {
        View viewV0 = V0(w() - 1, -1, true, false);
        if (viewV0 == null) {
            return -1;
        }
        return k.H(viewV0);
    }

    public final int T0() {
        View viewV0 = V0(w() - 1, -1, false, true);
        if (viewV0 == null) {
            return -1;
        }
        return k.H(viewV0);
    }

    @Override // androidx.recyclerview.widget.k
    public View U(View view, int i, l lVar, b07 b07Var) {
        int iL0;
        g1();
        if (w() != 0 && (iL0 = L0(i)) != Integer.MIN_VALUE) {
            M0();
            l1(iL0, (int) (this.r.n() * 0.33333334f), false, b07Var);
            b bVar = this.q;
            bVar.g = Integer.MIN_VALUE;
            bVar.a = false;
            N0(lVar, bVar, b07Var, true);
            View viewU0 = iL0 == -1 ? this.u ? U0(w() - 1, -1) : U0(0, w()) : this.u ? U0(0, w()) : U0(w() - 1, -1);
            View viewA1 = iL0 == -1 ? a1() : Z0();
            if (!viewA1.hasFocusable()) {
                return viewU0;
            }
            if (viewU0 != null) {
                return viewA1;
            }
        }
        return null;
    }

    public final View U0(int i, int i2) {
        int i3;
        int i4;
        M0();
        if (i2 <= i && i2 >= i) {
            return v(i);
        }
        if (this.r.g(v(i)) < this.r.m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.p == 0 ? this.c.p(i, i2, i3, i4) : this.d.p(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.k
    public final void V(AccessibilityEvent accessibilityEvent) {
        super.V(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(R0());
            accessibilityEvent.setToIndex(T0());
        }
    }

    public final View V0(int i, int i2, boolean z, boolean z2) {
        M0();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.p == 0 ? this.c.p(i, i2, i3, i4) : this.d.p(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.k
    public void W(l lVar, b07 b07Var, t3 t3Var) {
        super.W(lVar, b07Var, t3Var);
        g gVar = this.b.m;
        if (gVar == null || gVar.c() <= 0) {
            return;
        }
        t3Var.b(o3.o);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View W0(androidx.recyclerview.widget.l r17, defpackage.b07 r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.M0()
            int r1 = r0.w()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.w()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.b()
            vz1 r7 = r0.r
            int r7 = r7.m()
            vz1 r8 = r0.r
            int r8 = r8.i()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.v(r1)
            int r13 = androidx.recyclerview.widget.k.H(r12)
            vz1 r14 = r0.r
            int r14 = r14.g(r12)
            vz1 r15 = r0.r
            int r15 = r15.d(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r13 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r13
            androidx.recyclerview.widget.o r13 = r13.a
            boolean r13 = r13.i()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            return r9
        L7f:
            if (r10 == 0) goto L82
            return r10
        L82:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.W0(androidx.recyclerview.widget.l, b07, boolean, boolean):android.view.View");
    }

    public final int X0(int i, l lVar, b07 b07Var, boolean z) {
        int i2;
        int i3 = this.r.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -h1(-i3, b07Var, lVar);
        int i5 = i + i4;
        if (!z || (i2 = this.r.i() - i5) <= 0) {
            return i4;
        }
        this.r.q(i2);
        return i2 + i4;
    }

    public final int Y0(int i, l lVar, b07 b07Var, boolean z) {
        int iM;
        int iM2 = i - this.r.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i2 = -h1(iM2, b07Var, lVar);
        int i3 = i + i2;
        if (!z || (iM = i3 - this.r.m()) <= 0) {
            return i2;
        }
        this.r.q(-iM);
        return i2 - iM;
    }

    public final View Z0() {
        return v(this.u ? 0 : w() - 1);
    }

    public final View a1() {
        return v(this.u ? w() - 1 : 0);
    }

    @Override // defpackage.zz6
    public final PointF b(int i) {
        if (w() == 0) {
            return null;
        }
        int i2 = (i < k.H(v(0))) != this.u ? -1 : 1;
        return this.p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final boolean b1() {
        return this.b.getLayoutDirection() == 1;
    }

    public void c1(l lVar, b07 b07Var, b bVar, k74 k74Var) {
        int iE;
        int i;
        int i2;
        int iF;
        View viewB = bVar.b(lVar);
        if (viewB == null) {
            k74Var.b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewB.getLayoutParams();
        if (bVar.k == null) {
            if (this.u == (bVar.f == -1)) {
                c(viewB, -1, false);
            } else {
                c(viewB, 0, false);
            }
        } else {
            if (this.u == (bVar.f == -1)) {
                c(viewB, -1, true);
            } else {
                c(viewB, 0, true);
            }
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) viewB.getLayoutParams();
        Rect rectP = this.b.P(viewB);
        int i3 = rectP.left + rectP.right;
        int i4 = rectP.top + rectP.bottom;
        int iX = k.x(e(), this.n, this.l, F() + E() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + i3, ((ViewGroup.MarginLayoutParams) layoutParams2).width);
        int iX2 = k.x(f(), this.o, this.m, D() + G() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) layoutParams2).height);
        if (A0(viewB, iX, iX2, layoutParams2)) {
            viewB.measure(iX, iX2);
        }
        k74Var.a = this.r.e(viewB);
        if (this.p == 1) {
            if (b1()) {
                iF = this.n - F();
                iE = iF - this.r.f(viewB);
            } else {
                iE = E();
                iF = this.r.f(viewB) + iE;
            }
            if (bVar.f == -1) {
                i = bVar.b;
                i2 = i - k74Var.a;
            } else {
                i2 = bVar.b;
                i = k74Var.a + i2;
            }
        } else {
            int iG = G();
            int iF2 = this.r.f(viewB) + iG;
            if (bVar.f == -1) {
                int i5 = bVar.b;
                int i6 = i5 - k74Var.a;
                iF = i5;
                i = iF2;
                iE = i6;
                i2 = iG;
            } else {
                int i7 = bVar.b;
                int i8 = k74Var.a + i7;
                iE = i7;
                i = iF2;
                i2 = iG;
                iF = i8;
            }
        }
        k.O(viewB, iE, i2, iF, i);
        if (layoutParams.a.i() || layoutParams.a.l()) {
            k74Var.c = true;
        }
        k74Var.d = viewB.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.k
    public final void d(String str) {
        if (this.z == null) {
            super.d(str);
        }
    }

    @Override // androidx.recyclerview.widget.k
    public final boolean e() {
        return this.p == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0194  */
    @Override // androidx.recyclerview.widget.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e0(androidx.recyclerview.widget.l r18, defpackage.b07 r19) {
        /*
            Method dump skipped, instruction units count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.e0(androidx.recyclerview.widget.l, b07):void");
    }

    public final void e1(l lVar, b bVar) {
        if (!bVar.a || bVar.l) {
            return;
        }
        int i = bVar.g;
        int i2 = bVar.i;
        if (bVar.f == -1) {
            int iW = w();
            if (i < 0) {
                return;
            }
            int iH = (this.r.h() - i) + i2;
            if (this.u) {
                for (int i3 = 0; i3 < iW; i3++) {
                    View viewV = v(i3);
                    if (this.r.g(viewV) < iH || this.r.p(viewV) < iH) {
                        f1(lVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iW - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewV2 = v(i5);
                if (this.r.g(viewV2) < iH || this.r.p(viewV2) < iH) {
                    f1(lVar, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iW2 = w();
        if (!this.u) {
            for (int i7 = 0; i7 < iW2; i7++) {
                View viewV3 = v(i7);
                if (this.r.d(viewV3) > i6 || this.r.o(viewV3) > i6) {
                    f1(lVar, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iW2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewV4 = v(i9);
            if (this.r.d(viewV4) > i6 || this.r.o(viewV4) > i6) {
                f1(lVar, i8, i9);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.k
    public final boolean f() {
        return this.p == 1;
    }

    @Override // androidx.recyclerview.widget.k
    public void f0(b07 b07Var) {
        this.z = null;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.A.d();
    }

    public final void f1(l lVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewV = v(i);
                o0(i);
                lVar.i(viewV);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewV2 = v(i3);
            o0(i3);
            lVar.i(viewV2);
        }
    }

    @Override // androidx.recyclerview.widget.k
    public final void g0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.z = savedState;
            if (this.x != -1) {
                savedState.a = -1;
            }
            r0();
        }
    }

    public final void g1() {
        if (this.p == 1 || !b1()) {
            this.u = this.t;
        } else {
            this.u = !this.t;
        }
    }

    @Override // androidx.recyclerview.widget.k
    public final Parcelable h0() {
        SavedState savedState = this.z;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.a = savedState.a;
            savedState2.b = savedState.b;
            savedState2.c = savedState.c;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (w() <= 0) {
            savedState3.a = -1;
            return savedState3;
        }
        M0();
        boolean z = this.s ^ this.u;
        savedState3.c = z;
        if (z) {
            View viewZ0 = Z0();
            savedState3.b = this.r.i() - this.r.d(viewZ0);
            savedState3.a = k.H(viewZ0);
            return savedState3;
        }
        View viewA1 = a1();
        savedState3.a = k.H(viewA1);
        savedState3.b = this.r.g(viewA1) - this.r.m();
        return savedState3;
    }

    public final int h1(int i, b07 b07Var, l lVar) {
        if (w() != 0 && i != 0) {
            M0();
            this.q.a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            l1(i2, iAbs, true, b07Var);
            b bVar = this.q;
            int iN0 = N0(lVar, bVar, b07Var, false) + bVar.g;
            if (iN0 >= 0) {
                if (iAbs > iN0) {
                    i = i2 * iN0;
                }
                this.r.q(-i);
                this.q.j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.k
    public final void i(int i, int i2, b07 b07Var, sr0 sr0Var) {
        if (this.p != 0) {
            i = i2;
        }
        if (w() == 0 || i == 0) {
            return;
        }
        M0();
        l1(i > 0 ? 1 : -1, Math.abs(i), true, b07Var);
        H0(b07Var, this.q, sr0Var);
    }

    public final void i1(int i, int i2) {
        this.x = i;
        this.y = i2;
        SavedState savedState = this.z;
        if (savedState != null) {
            savedState.a = -1;
        }
        r0();
    }

    @Override // androidx.recyclerview.widget.k
    public final void j(int i, sr0 sr0Var) {
        boolean z;
        int i2;
        SavedState savedState = this.z;
        if (savedState == null || (i2 = savedState.a) < 0) {
            g1();
            z = this.u;
            i2 = this.x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = savedState.c;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.C && i2 >= 0 && i2 < i; i4++) {
            sr0Var.b(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.k
    public boolean j0(int i, Bundle bundle) {
        int iMin;
        if (super.j0(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.p == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.b;
                iMin = Math.min(i2, J(recyclerView.c, recyclerView.E0) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.b;
                iMin = Math.min(i3, y(recyclerView2.c, recyclerView2.E0) - 1);
            }
            if (iMin >= 0) {
                i1(iMin, 0);
                return true;
            }
        }
        return false;
    }

    public final void j1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(rm7.n(i, "invalid orientation:"));
        }
        d(null);
        if (i != this.p || this.r == null) {
            vz1 vz1VarB = vz1.b(this, i);
            this.r = vz1VarB;
            this.A.a = vz1VarB;
            this.p = i;
            r0();
        }
    }

    @Override // androidx.recyclerview.widget.k
    public final int k(b07 b07Var) {
        return I0(b07Var);
    }

    public void k1(boolean z) {
        d(null);
        if (this.v == z) {
            return;
        }
        this.v = z;
        r0();
    }

    @Override // androidx.recyclerview.widget.k
    public int l(b07 b07Var) {
        return J0(b07Var);
    }

    public final void l1(int i, int i2, boolean z, b07 b07Var) {
        int iM;
        this.q.l = this.r.k() == 0 && this.r.h() == 0;
        this.q.f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        G0(b07Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        b bVar = this.q;
        int i3 = z2 ? iMax2 : iMax;
        bVar.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        bVar.i = iMax;
        if (z2) {
            bVar.h = this.r.j() + i3;
            View viewZ0 = Z0();
            b bVar2 = this.q;
            bVar2.e = this.u ? -1 : 1;
            int iH = k.H(viewZ0);
            b bVar3 = this.q;
            bVar2.d = iH + bVar3.e;
            bVar3.b = this.r.d(viewZ0);
            iM = this.r.d(viewZ0) - this.r.i();
        } else {
            View viewA1 = a1();
            b bVar4 = this.q;
            bVar4.h = this.r.m() + bVar4.h;
            b bVar5 = this.q;
            bVar5.e = this.u ? 1 : -1;
            int iH2 = k.H(viewA1);
            b bVar6 = this.q;
            bVar5.d = iH2 + bVar6.e;
            bVar6.b = this.r.g(viewA1);
            iM = (-this.r.g(viewA1)) + this.r.m();
        }
        b bVar7 = this.q;
        bVar7.c = i2;
        if (z) {
            bVar7.c = i2 - iM;
        }
        bVar7.g = iM;
    }

    @Override // androidx.recyclerview.widget.k
    public int m(b07 b07Var) {
        return K0(b07Var);
    }

    public final void m1(int i, int i2) {
        this.q.c = this.r.i() - i2;
        b bVar = this.q;
        bVar.e = this.u ? -1 : 1;
        bVar.d = i;
        bVar.f = 1;
        bVar.b = i2;
        bVar.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.k
    public final int n(b07 b07Var) {
        return I0(b07Var);
    }

    public final void n1(int i, int i2) {
        this.q.c = i2 - this.r.m();
        b bVar = this.q;
        bVar.d = i;
        bVar.e = this.u ? 1 : -1;
        bVar.f = -1;
        bVar.b = i2;
        bVar.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.k
    public int o(b07 b07Var) {
        return J0(b07Var);
    }

    @Override // androidx.recyclerview.widget.k
    public int p(b07 b07Var) {
        return K0(b07Var);
    }

    @Override // androidx.recyclerview.widget.k
    public final View r(int i) {
        int iW = w();
        if (iW == 0) {
            return null;
        }
        int iH = i - k.H(v(0));
        if (iH >= 0 && iH < iW) {
            View viewV = v(iH);
            if (k.H(viewV) == i) {
                return viewV;
            }
        }
        return super.r(i);
    }

    @Override // androidx.recyclerview.widget.k
    public RecyclerView.LayoutParams s() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.k
    public int s0(int i, b07 b07Var, l lVar) {
        if (this.p == 1) {
            return 0;
        }
        return h1(i, b07Var, lVar);
    }

    @Override // androidx.recyclerview.widget.k
    public final void t0(int i) {
        this.x = i;
        this.y = Integer.MIN_VALUE;
        SavedState savedState = this.z;
        if (savedState != null) {
            savedState.a = -1;
        }
        r0();
    }

    @Override // androidx.recyclerview.widget.k
    public int u0(int i, b07 b07Var, l lVar) {
        if (this.p == 0) {
            return 0;
        }
        return h1(i, b07Var, lVar);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.p = 1;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = -1;
        this.y = Integer.MIN_VALUE;
        this.z = null;
        this.A = new a();
        this.B = new k74();
        this.C = 2;
        this.D = new int[2];
        rz6 rz6VarI = k.I(context, attributeSet, i, i2);
        j1(rz6VarI.a);
        boolean z = rz6VarI.c;
        d(null);
        if (z != this.t) {
            this.t = z;
            r0();
        }
        k1(rz6VarI.d);
    }

    @Override // androidx.recyclerview.widget.k
    public final void T(RecyclerView recyclerView) {
    }

    public void d1(l lVar, b07 b07Var, a aVar, int i) {
    }
}
