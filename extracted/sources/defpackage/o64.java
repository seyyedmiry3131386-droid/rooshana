package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o64 extends k79 {
    public final ya5 b;

    public o64() {
        ya5 ya5Var = qq3.a;
        this.b = new ya5();
    }

    @Override // defpackage.k79
    public final void d() {
        ya5 ya5Var = this.b;
        int[] iArr = ya5Var.b;
        Object[] objArr = ya5Var.c;
        long[] jArr = ya5Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8;
                int i3 = 8 - ((~(i - length)) >>> 31);
                int i4 = 0;
                while (i4 < i3) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        int i6 = iArr[i5];
                        mb5 mb5Var = (mb5) objArr[i5];
                        Object[] objArr2 = mb5Var.a;
                        int i7 = mb5Var.b;
                        int i8 = 0;
                        while (i8 < i7) {
                            n64 n64Var = (n64) objArr2[i8];
                            int i9 = i2;
                            pm0 pm0Var = n64Var.d;
                            if (pm0Var != null) {
                                pm0Var.cancel();
                            }
                            n64Var.d = null;
                            pp1 pp1Var = (pp1) n64Var.a.b;
                            pp1Var.b = true;
                            pp1Var.a = false;
                            pp1Var.b();
                            i8++;
                            i2 = i9;
                        }
                    }
                    int i10 = i2;
                    j >>= i10;
                    i4++;
                    i2 = i10;
                }
                if (i3 != i2) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
