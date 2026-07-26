package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class vu5 extends ri2 {
    public static final vu5 d = new vu5(1, 0, 2);

    @Override // defpackage.ri2
    public final void a(vl1 vl1Var, ou ouVar, fz7 fz7Var, l37 l37Var, lv5 lv5Var) {
        ge geVar;
        int iC;
        int iD = vl1Var.d(0);
        if (fz7Var.n != 0) {
            sz0.a("Cannot move a group while inserting");
        }
        if (iD < 0) {
            sz0.a("Parameter offset is out of bounds");
        }
        if (iD == 0) {
            return;
        }
        int i = fz7Var.t;
        int i2 = fz7Var.v;
        int i3 = fz7Var.u;
        int i4 = i;
        while (iD > 0) {
            i4 += fz7Var.b[(fz7Var.r(i4) * 5) + 3];
            if (i4 > i3) {
                sz0.a("Parameter offset is out of bounds");
            }
            iD--;
        }
        int i5 = fz7Var.b[(fz7Var.r(i4) * 5) + 3];
        int iG = fz7Var.g(fz7Var.b, fz7Var.r(fz7Var.t));
        int iG2 = fz7Var.g(fz7Var.b, fz7Var.r(i4));
        int i6 = i4 + i5;
        int iG3 = fz7Var.g(fz7Var.b, fz7Var.r(i6));
        int i7 = iG3 - iG2;
        fz7Var.x(i7, Math.max(fz7Var.t - 1, 0));
        fz7Var.w(i5);
        int[] iArr = fz7Var.b;
        int iR = fz7Var.r(i6) * 5;
        ew.x0(fz7Var.r(i) * 5, iR, (i5 * 5) + iR, iArr, iArr);
        if (i7 > 0) {
            Object[] objArr = fz7Var.c;
            int iH = fz7Var.h(iG2 + i7);
            System.arraycopy(objArr, iH, objArr, iG, fz7Var.h(iG3 + i7) - iH);
        }
        int i8 = iG2 + i7;
        int i9 = i8 - iG;
        int i10 = fz7Var.k;
        int i11 = fz7Var.l;
        int length = fz7Var.c.length;
        int i12 = fz7Var.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iR2 = fz7Var.r(i14);
            int i15 = i9;
            int[] iArr2 = iArr;
            iArr2[(iR2 * 5) + 4] = fz7.i(fz7.i(fz7Var.g(iArr, iR2) - i15, i12 < iR2 ? 0 : i10, i11, length), fz7Var.k, fz7Var.l, fz7Var.c.length);
            i14++;
            i9 = i15;
            iArr = iArr2;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iP = fz7Var.p();
        int iB = ez7.b(fz7Var.d, i6, iP);
        ArrayList arrayList = new ArrayList();
        if (iB >= 0) {
            while (iB < fz7Var.d.size() && (iC = fz7Var.c((geVar = (ge) fz7Var.d.get(iB)))) >= i6 && iC < i16) {
                arrayList.add(geVar);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            ge geVar2 = (ge) arrayList.get(i18);
            int iC2 = fz7Var.c(geVar2) + i17;
            if (iC2 >= fz7Var.g) {
                geVar2.a = -(iP - iC2);
            } else {
                geVar2.a = iC2;
            }
            fz7Var.d.add(ez7.b(fz7Var.d, iC2, iP), geVar2);
        }
        if (fz7Var.K(i6, i5)) {
            sz0.a("Unexpectedly removed anchors");
        }
        fz7Var.m(i2, fz7Var.u, i);
        if (i7 > 0) {
            fz7Var.L(i8, i7, i6 - 1);
        }
    }
}
