package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mv5 extends yq2 {
    public int h;
    public int j;
    public int l;
    public ri2[] g = new ri2[16];
    public int[] i = new int[16];
    public Object[] k = new Object[16];

    public final void A0(ou ouVar, fz7 fz7Var, l37 l37Var, lv5 lv5Var) {
        if (C0()) {
            vl1 vl1Var = new vl1(this);
            mv5 mv5Var = (mv5) vl1Var.e;
            while (true) {
                ri2 ri2Var = mv5Var.g[vl1Var.b];
                ge geVarB = ri2Var.b(vl1Var);
                ou ouVar2 = ouVar;
                fz7 fz7Var2 = fz7Var;
                l37 l37Var2 = l37Var;
                lv5 lv5Var2 = lv5Var;
                try {
                    ri2Var.a(vl1Var, ouVar2, fz7Var2, l37Var2, lv5Var2);
                    int i = vl1Var.b;
                    int i2 = mv5Var.h;
                    if (i < i2) {
                        ri2 ri2Var2 = mv5Var.g[i];
                        vl1Var.c += ri2Var2.b;
                        vl1Var.d += ri2Var2.c;
                        int i3 = i + 1;
                        vl1Var.b = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        ouVar = ouVar2;
                        fz7Var = fz7Var2;
                        l37Var = l37Var2;
                        lv5Var = lv5Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        z0();
    }

    public final boolean B0() {
        return this.h == 0;
    }

    public final boolean C0() {
        return this.h != 0;
    }

    public final void D0(ri2 ri2Var) {
        int i = this.h;
        ri2[] ri2VarArr = this.g;
        if (i == ri2VarArr.length) {
            ri2[] ri2VarArr2 = new ri2[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(ri2VarArr, 0, ri2VarArr2, 0, i);
            this.g = ri2VarArr2;
        }
        int i2 = this.j;
        int i3 = ri2Var.b;
        int i4 = ri2Var.c;
        int i5 = i2 + i3;
        int[] iArr = this.i;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            ew.x0(0, 0, length, iArr, iArr2);
            this.i = iArr2;
        }
        int i7 = this.l + i4;
        Object[] objArr = this.k;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.k = objArr2;
        }
        ri2[] ri2VarArr3 = this.g;
        int i9 = this.h;
        this.h = i9 + 1;
        ri2VarArr3[i9] = ri2Var;
        this.j += ri2Var.b;
        this.l += i4;
    }

    public final void z0() {
        this.h = 0;
        this.j = 0;
        ew.F0(0, this.l, null, this.k);
        this.l = 0;
    }
}
