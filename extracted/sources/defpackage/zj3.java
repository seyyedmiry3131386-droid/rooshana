package defpackage;

import com.google.common.primitives.a;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class zj3 extends wu8 {
    public final Comparator s;
    public Object[] t;
    public int[] u;
    public int v;
    public boolean w;

    public zj3(Comparator comparator) {
        comparator.getClass();
        this.s = comparator;
        this.t = new Object[4];
        this.u = new int[4];
    }

    public final void O(int i, Object obj) {
        obj.getClass();
        vy2.m(i, "occurrences");
        if (i == 0) {
            return;
        }
        int i2 = this.v;
        Object[] objArr = this.t;
        if (i2 == objArr.length) {
            P(true);
        } else if (this.w) {
            this.t = Arrays.copyOf(objArr, objArr.length);
        }
        this.w = false;
        Object[] objArr2 = this.t;
        int i3 = this.v;
        objArr2[i3] = obj;
        this.u[i3] = i;
        this.v = i3 + 1;
    }

    public final void P(boolean z) {
        int i = this.v;
        if (i == 0) {
            return;
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.t, i);
        Comparator comparator = this.s;
        Arrays.sort(objArrCopyOf, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < objArrCopyOf.length; i3++) {
            if (comparator.compare(objArrCopyOf[i2 - 1], objArrCopyOf[i3]) < 0) {
                objArrCopyOf[i2] = objArrCopyOf[i3];
                i2++;
            }
        }
        Arrays.fill(objArrCopyOf, i2, this.v, (Object) null);
        if (z) {
            int i4 = i2 * 4;
            int i5 = this.v;
            if (i4 > i5 * 3) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, a.f(((long) i5) + ((long) ((i5 / 2) + 1))));
            }
        }
        int[] iArr = new int[objArrCopyOf.length];
        for (int i6 = 0; i6 < this.v; i6++) {
            int iBinarySearch = Arrays.binarySearch(objArrCopyOf, 0, i2, this.t[i6], comparator);
            int i7 = this.u[i6];
            if (i7 >= 0) {
                iArr[iBinarySearch] = iArr[iBinarySearch] + i7;
            } else {
                iArr[iBinarySearch] = ~i7;
            }
        }
        this.t = objArrCopyOf;
        this.u = iArr;
        this.v = i2;
    }

    @Override // defpackage.wu8
    public final wu8 e(Object obj) {
        O(1, obj);
        return this;
    }
}
