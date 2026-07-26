package defpackage;

import java.util.ArrayList;
import kotlin.a;

/* JADX INFO: loaded from: classes.dex */
public final class o46 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final ya5 e;
    public final c24 f;

    public o46(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            wi6.a("Invalid start index");
        }
        this.d = new ArrayList();
        ya5 ya5Var = new ya5();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            fy3 fy3Var = (fy3) this.a.get(i3);
            int i4 = fy3Var.c;
            int i5 = fy3Var.d;
            ya5Var.h(i4, new ov2(i3, i2, i5));
            i2 += i5;
        }
        this.e = ya5Var;
        this.f = a.a(new n15(14, this));
    }

    public final boolean a(int i, int i2) {
        int i3;
        ya5 ya5Var = this.e;
        ov2 ov2Var = (ov2) ya5Var.b(i);
        if (ov2Var == null) {
            return false;
        }
        int i4 = ov2Var.b;
        int i5 = i2 - ov2Var.c;
        ov2Var.c = i2;
        if (i5 == 0) {
            return true;
        }
        Object[] objArr = ya5Var.c;
        long[] jArr = ya5Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        while (true) {
            long j = jArr[i6];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        ov2 ov2Var2 = (ov2) objArr[(i6 << 3) + i8];
                        if (ov2Var2.b >= i4 && !ov2Var2.equals(ov2Var) && (i3 = ov2Var2.b + i5) >= 0) {
                            ov2Var2.b = i3;
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return true;
                }
            }
            if (i6 == length) {
                return true;
            }
            i6++;
        }
    }
}
