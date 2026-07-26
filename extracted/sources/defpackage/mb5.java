package defpackage;

import androidx.collection.c;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mb5 extends c {
    public kb5 c;

    public mb5(int i) {
        this.a = i == 0 ? zq5.a : new Object[i];
    }

    public final void g(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            n(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void h(c cVar) {
        js3.p(cVar, "elements");
        if (cVar.d()) {
            return;
        }
        int i = this.b + cVar.b;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            n(i, objArr);
        }
        ew.y0(this.b, 0, cVar.b, cVar.a, this.a);
        this.b += cVar.b;
    }

    public final void i(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.b;
        int size = list.size() + i;
        Object[] objArr = this.a;
        if (objArr.length < size) {
            n(size, objArr);
        }
        Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b = list.size() + this.b;
    }

    public final void j() {
        ew.F0(0, this.b, null, this.a);
        this.b = 0;
    }

    public final boolean k(Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            return false;
        }
        l(iC);
        return true;
    }

    public final Object l(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            f(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            ew.y0(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void m(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            StringBuilder sbB = bl4.B(i, i2, "Start (", ") and end (", ") must be in 0..");
            sbB.append(this.b);
            lb7.k(sbB.toString());
            throw null;
        }
        if (i2 < i) {
            lb7.j("Start (" + i + ") is more than end (" + i2 + ')');
            throw null;
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.a;
                ew.y0(i, i2, i3, objArr, objArr);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            ew.F0(i5, i4, null, this.a);
            this.b = i5;
        }
    }

    public final void n(int i, Object[] objArr) {
        js3.p(objArr, "oldContent");
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        ew.y0(0, 0, length, objArr, objArr2);
        this.a = objArr2;
    }

    public /* synthetic */ mb5() {
        this(16);
    }
}
