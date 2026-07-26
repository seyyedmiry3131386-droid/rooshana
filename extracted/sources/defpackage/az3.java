package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class az3 implements rx1 {
    public final zy3 a;

    public az3(zy3 zy3Var) {
        this.a = zy3Var;
    }

    @Override // defpackage.rx1, defpackage.sk
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final d49 a(mt8 mt8Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        zy3 zy3Var = this.a;
        ya5 ya5Var = zy3Var.b;
        xa5 xa5Var = new xa5(ya5Var.e + 2);
        ya5 ya5Var2 = new ya5(ya5Var.e);
        int[] iArr3 = ya5Var.b;
        Object[] objArr3 = ya5Var.c;
        long[] jArr = ya5Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            i = i3;
                            yy3 yy3Var = (yy3) objArr3[i6];
                            xa5Var.a(i7);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            ya5Var2.h(i7, new c49((dl) mt8Var.b().invoke(yy3Var.a), yy3Var.b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        iArr3 = iArr2;
                        i3 = i;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!ya5Var.a(0)) {
            int i8 = xa5Var.b;
            if (i8 < 0) {
                lb7.k("Index must be between 0 and size");
                throw null;
            }
            xa5Var.b(i8 + 1);
            int[] iArr4 = xa5Var.a;
            int i9 = xa5Var.b;
            if (i9 != 0) {
                ew.x0(1, 0, i9, iArr4, iArr4);
            }
            iArr4[0] = 0;
            xa5Var.b++;
        }
        if (!ya5Var.a(zy3Var.a)) {
            xa5Var.a(zy3Var.a);
        }
        int i10 = xa5Var.b;
        if (i10 != 0) {
            int[] iArr5 = xa5Var.a;
            js3.p(iArr5, "<this>");
            Arrays.sort(iArr5, 0, i10);
        }
        return new d49(xa5Var, ya5Var2, zy3Var.a, az1.c);
    }
}
