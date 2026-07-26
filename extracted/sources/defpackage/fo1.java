package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class fo1 {
    public final ArrayList a;
    public final int[] b;
    public final int[] c;
    public final aj0 d;
    public final int e;
    public final int f;
    public final boolean g;

    public fo1(aj0 aj0Var, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        eo1 eo1Var;
        int i2;
        this.a = arrayList;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = aj0Var;
        int i3 = aj0Var.b;
        this.e = i3;
        int i4 = aj0Var.c;
        this.f = i4;
        this.g = true;
        eo1 eo1Var2 = arrayList.isEmpty() ? null : (eo1) arrayList.get(0);
        if (eo1Var2 == null || eo1Var2.a != 0 || eo1Var2.b != 0) {
            arrayList.add(0, new eo1(0, 0, 0));
        }
        arrayList.add(new eo1(i3, i4, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            eo1 eo1Var3 = (eo1) it.next();
            for (int i5 = 0; i5 < eo1Var3.c; i5++) {
                int i6 = eo1Var3.a + i5;
                int i7 = eo1Var3.b + i5;
                int i8 = aj0Var.b(i6, i7) ? 1 : 2;
                iArr[i6] = (i7 << 4) | i8;
                iArr2[i7] = (i6 << 4) | i8;
            }
        }
        if (this.g) {
            Iterator it2 = arrayList.iterator();
            int i9 = 0;
            while (it2.hasNext()) {
                eo1 eo1Var4 = (eo1) it2.next();
                while (true) {
                    i = eo1Var4.a;
                    if (i9 < i) {
                        if (iArr[i9] == 0) {
                            int size = arrayList.size();
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                if (i10 < size) {
                                    eo1Var = (eo1) arrayList.get(i10);
                                    while (true) {
                                        i2 = eo1Var.b;
                                        if (i11 < i2) {
                                            if (iArr2[i11] == 0 && aj0Var.c(i9, i11)) {
                                                int i12 = aj0Var.b(i9, i11) ? 8 : 4;
                                                iArr[i9] = (i11 << 4) | i12;
                                                iArr2[i11] = i12 | (i9 << 4);
                                            } else {
                                                i11++;
                                            }
                                        }
                                    }
                                }
                                i11 = eo1Var.c + i2;
                                i10++;
                            }
                        }
                        i9++;
                    }
                }
                i9 = eo1Var4.c + i;
            }
        }
    }

    public static go1 b(ArrayDeque arrayDeque, int i, boolean z) {
        go1 go1Var;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                go1Var = null;
                break;
            }
            go1Var = (go1) it.next();
            if (go1Var.a == i && go1Var.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            go1 go1Var2 = (go1) it.next();
            if (z) {
                go1Var2.b--;
            } else {
                go1Var2.b++;
            }
        }
        return go1Var;
    }

    public final int a(int i) {
        int i2 = this.e;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(dw1.j(i, i2, "Index out of bounds - passed position = ", ", old list size = "));
        }
        int i3 = this.b[i];
        if ((i3 & 15) == 0) {
            return -1;
        }
        return i3 >> 4;
    }
}
