package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class sg6 extends bm8 {
    public static final /* synthetic */ int n = 0;
    public final int e;
    public final nv7 f;
    public final int g;
    public final int h;
    public final int[] i;
    public final int[] j;
    public final bm8[] k;
    public final Object[] l;
    public final HashMap m;

    /* JADX WARN: Illegal instructions before constructor call */
    public sg6(ArrayList arrayList, nv7 nv7Var) {
        bm8[] bm8VarArr = new bm8[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            bm8VarArr[i2] = ((qs4) it.next()).b();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((qs4) it2.next()).a();
            i++;
        }
        this(bm8VarArr, objArr, nv7Var);
    }

    @Override // defpackage.bm8
    public final int a(boolean z) {
        if (this.e != 0) {
            int iQ = 0;
            if (z) {
                int[] iArr = this.f.b;
                iQ = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                bm8[] bm8VarArr = this.k;
                if (!bm8VarArr[iQ].p()) {
                    return bm8VarArr[iQ].a(z) + this.j[iQ];
                }
                iQ = q(iQ, z);
            } while (iQ != -1);
        }
        return -1;
    }

    @Override // defpackage.bm8
    public final int b(Object obj) {
        int iB;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.m.get(obj2);
            int iIntValue = num == null ? -1 : num.intValue();
            if (iIntValue != -1 && (iB = this.k[iIntValue].b(obj3)) != -1) {
                return this.i[iIntValue] + iB;
            }
        }
        return -1;
    }

    @Override // defpackage.bm8
    public final int c(boolean z) {
        int iR;
        int i = this.e;
        if (i != 0) {
            if (z) {
                int[] iArr = this.f.b;
                iR = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                iR = i - 1;
            }
            do {
                bm8[] bm8VarArr = this.k;
                if (!bm8VarArr[iR].p()) {
                    return bm8VarArr[iR].c(z) + this.j[iR];
                }
                iR = r(iR, z);
            } while (iR != -1);
        }
        return -1;
    }

    @Override // defpackage.bm8
    public final int e(int i, int i2, boolean z) {
        int[] iArr = this.j;
        int iD = j29.d(iArr, i + 1, false, false);
        int i3 = iArr[iD];
        bm8[] bm8VarArr = this.k;
        int iE = bm8VarArr[iD].e(i - i3, i2 != 2 ? i2 : 0, z);
        if (iE != -1) {
            return i3 + iE;
        }
        int iQ = q(iD, z);
        while (iQ != -1 && bm8VarArr[iQ].p()) {
            iQ = q(iQ, z);
        }
        if (iQ != -1) {
            return bm8VarArr[iQ].a(z) + iArr[iQ];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // defpackage.bm8
    public final yl8 f(int i, yl8 yl8Var, boolean z) {
        int[] iArr = this.i;
        int iD = j29.d(iArr, i + 1, false, false);
        int i2 = this.j[iD];
        this.k[iD].f(i - iArr[iD], yl8Var, z);
        yl8Var.c += i2;
        if (z) {
            Object obj = this.l[iD];
            Object obj2 = yl8Var.b;
            obj2.getClass();
            yl8Var.b = Pair.create(obj, obj2);
        }
        return yl8Var;
    }

    @Override // defpackage.bm8
    public final yl8 g(Object obj, yl8 yl8Var) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.m.get(obj2);
        int iIntValue = num == null ? -1 : num.intValue();
        int i = this.j[iIntValue];
        this.k[iIntValue].g(obj3, yl8Var);
        yl8Var.c += i;
        yl8Var.b = obj;
        return yl8Var;
    }

    @Override // defpackage.bm8
    public final int h() {
        return this.h;
    }

    @Override // defpackage.bm8
    public final int k(int i, int i2, boolean z) {
        int[] iArr = this.j;
        int iD = j29.d(iArr, i + 1, false, false);
        int i3 = iArr[iD];
        bm8[] bm8VarArr = this.k;
        int iK = bm8VarArr[iD].k(i - i3, i2 != 2 ? i2 : 0, z);
        if (iK != -1) {
            return i3 + iK;
        }
        int iR = r(iD, z);
        while (iR != -1 && bm8VarArr[iR].p()) {
            iR = r(iR, z);
        }
        if (iR != -1) {
            return bm8VarArr[iR].c(z) + iArr[iR];
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // defpackage.bm8
    public final Object l(int i) {
        int[] iArr = this.i;
        int iD = j29.d(iArr, i + 1, false, false);
        return Pair.create(this.l[iD], this.k[iD].l(i - iArr[iD]));
    }

    @Override // defpackage.bm8
    public final am8 m(int i, am8 am8Var, long j) {
        int[] iArr = this.j;
        int iD = j29.d(iArr, i + 1, false, false);
        int i2 = iArr[iD];
        int i3 = this.i[iD];
        this.k[iD].m(i - i2, am8Var, j);
        Object objCreate = this.l[iD];
        if (!am8.q.equals(am8Var.a)) {
            objCreate = Pair.create(objCreate, am8Var.a);
        }
        am8Var.a = objCreate;
        am8Var.n += i3;
        am8Var.o += i3;
        return am8Var;
    }

    @Override // defpackage.bm8
    public final int o() {
        return this.g;
    }

    public final int q(int i, boolean z) {
        if (!z) {
            if (i < this.e - 1) {
                return i + 1;
            }
            return -1;
        }
        nv7 nv7Var = this.f;
        int i2 = nv7Var.c[i] + 1;
        int[] iArr = nv7Var.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int r(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        nv7 nv7Var = this.f;
        int i2 = nv7Var.c[i] - 1;
        if (i2 >= 0) {
            return nv7Var.b[i2];
        }
        return -1;
    }

    public sg6(bm8[] bm8VarArr, Object[] objArr, nv7 nv7Var) {
        this.f = nv7Var;
        this.e = nv7Var.b.length;
        int length = bm8VarArr.length;
        this.k = bm8VarArr;
        this.i = new int[length];
        this.j = new int[length];
        this.l = objArr;
        this.m = new HashMap();
        int length2 = bm8VarArr.length;
        int i = 0;
        int iO = 0;
        int iH = 0;
        int i2 = 0;
        while (i < length2) {
            bm8 bm8Var = bm8VarArr[i];
            this.k[i2] = bm8Var;
            this.j[i2] = iO;
            this.i[i2] = iH;
            iO += bm8Var.o();
            iH += this.k[i2].h();
            this.m.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.g = iO;
        this.h = iH;
    }
}
