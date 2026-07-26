package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class l97 extends z0 implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public l97(int i, Object[] objArr) {
        this.a = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(rm7.n(i, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i <= objArr.length) {
            this.b = objArr.length;
            this.d = i;
        } else {
            StringBuilder sbR = rm7.r(i, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbR.append(objArr.length);
            throw new IllegalArgumentException(sbR.toString().toString());
        }
    }

    @Override // defpackage.o
    public final int a() {
        return this.d;
    }

    public final void c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(rm7.n(i, "n shouldn't be negative but it is ").toString());
        }
        if (i > this.d) {
            StringBuilder sbR = rm7.r(i, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            sbR.append(this.d);
            throw new IllegalArgumentException(sbR.toString().toString());
        }
        if (i > 0) {
            int i2 = this.c;
            int i3 = this.b;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.a;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.c = i4;
            this.d -= i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int iA = a();
        if (i < 0 || i >= iA) {
            throw new IndexOutOfBoundsException(dw1.j(i, iA, "index: ", ", size: "));
        }
        return this.a[(this.c + i) % this.b];
    }

    @Override // defpackage.z0, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new k97(this);
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        js3.p(objArr, "array");
        int length = objArr.length;
        int i = this.d;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
            js3.o(objArr, "copyOf(...)");
        }
        int i2 = this.d;
        int i3 = this.c;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.a;
            if (i5 >= i2 || i3 >= this.b) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
