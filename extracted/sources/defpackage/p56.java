package defpackage;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class p56 extends m56 {
    public final n56 e;
    public Object f;
    public boolean g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p56(n56 n56Var, qs8[] qs8VarArr) {
        super(n56Var.c, qs8VarArr);
        js3.p(n56Var, "builder");
        this.e = n56Var;
        this.h = n56Var.e;
    }

    public final void e(int i, os8 os8Var, Object obj, int i2, int i3, boolean z) {
        int i4;
        qs8[] qs8VarArr = (qs8[]) this.d;
        int i5 = i2 * 5;
        if (i5 <= 30) {
            int iN = 1 << ry7.n(i, i5);
            if (!os8Var.i(iN)) {
                int iT = os8Var.t(iN);
                os8 os8VarS = os8Var.s(iT);
                qs8 qs8Var = qs8VarArr[i2];
                Object[] objArr = os8Var.d;
                int iBitCount = Integer.bitCount(os8Var.a) * 2;
                qs8Var.getClass();
                js3.p(objArr, "buffer");
                qs8Var.b = objArr;
                qs8Var.c = iBitCount;
                qs8Var.d = iT;
                e(i, os8VarS, obj, i2 + 1, i3, z);
                return;
            }
            int iF = os8Var.f(iN);
            if (iN == (z ? 1 << ry7.n(i3, i5) : 0) && i2 < (i4 = this.b)) {
                qs8 qs8Var2 = qs8VarArr[i4];
                Object[] objArr2 = os8Var.d;
                Object[] objArr3 = {objArr2[iF], objArr2[iF + 1]};
                qs8Var2.getClass();
                qs8Var2.b = objArr3;
                qs8Var2.c = 2;
                qs8Var2.d = 0;
                return;
            }
            qs8 qs8Var3 = qs8VarArr[i2];
            Object[] objArr4 = os8Var.d;
            int iBitCount2 = Integer.bitCount(os8Var.a) * 2;
            qs8Var3.getClass();
            js3.p(objArr4, "buffer");
            qs8Var3.b = objArr4;
            qs8Var3.c = iBitCount2;
            qs8Var3.d = iF;
            this.b = i2;
            return;
        }
        qs8 qs8Var4 = qs8VarArr[i2];
        Object[] objArr5 = os8Var.d;
        int length = objArr5.length;
        qs8Var4.getClass();
        qs8Var4.b = objArr5;
        qs8Var4.c = length;
        qs8Var4.d = 0;
        while (true) {
            qs8 qs8Var5 = qs8VarArr[i2];
            if (js3.i(qs8Var5.b[qs8Var5.d], obj)) {
                this.b = i2;
                return;
            } else {
                qs8VarArr[i2].d += 2;
            }
        }
    }

    @Override // defpackage.m56, java.util.Iterator
    public final Object next() {
        if (this.e.e != this.h) {
            throw new ConcurrentModificationException();
        }
        if (!this.c) {
            throw new NoSuchElementException();
        }
        qs8 qs8Var = ((qs8[]) this.d)[this.b];
        this.f = qs8Var.b[qs8Var.d];
        this.g = true;
        return super.next();
    }

    @Override // defpackage.m56, java.util.Iterator
    public final void remove() {
        p56 p56Var;
        if (!this.g) {
            throw new IllegalStateException();
        }
        boolean z = this.c;
        n56 n56Var = this.e;
        if (!z) {
            p56Var = this;
            wu8.h(n56Var).remove(p56Var.f);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            qs8 qs8Var = ((qs8[]) this.d)[this.b];
            Object obj = qs8Var.b[qs8Var.d];
            wu8.h(n56Var).remove(this.f);
            int iHashCode = obj != null ? obj.hashCode() : 0;
            os8 os8Var = n56Var.c;
            Object obj2 = this.f;
            p56Var = this;
            p56Var.e(iHashCode, os8Var, obj, 0, obj2 != null ? obj2.hashCode() : 0, true);
        }
        p56Var.f = null;
        p56Var.g = false;
        p56Var.h = n56Var.e;
    }
}
