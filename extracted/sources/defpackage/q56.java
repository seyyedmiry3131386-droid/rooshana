package defpackage;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class q56 extends m56 {
    public final o56 e;
    public Object f;
    public boolean g;
    public int h;

    public q56(o56 o56Var, qs8[] qs8VarArr) {
        super(o56Var.c, qs8VarArr);
        this.e = o56Var;
        this.h = o56Var.e;
    }

    public final void e(int i, ps8 ps8Var, Object obj, int i2) {
        qs8[] qs8VarArr = (qs8[]) this.d;
        int i3 = i2 * 5;
        if (i3 <= 30) {
            int iJ = 1 << sy7.j(i, i3);
            if (ps8Var.h(iJ)) {
                qs8VarArr[i2].a(ps8Var.d, Integer.bitCount(ps8Var.a) * 2, ps8Var.f(iJ));
                this.b = i2;
                return;
            } else {
                int iT = ps8Var.t(iJ);
                ps8 ps8VarS = ps8Var.s(iT);
                qs8VarArr[i2].a(ps8Var.d, Integer.bitCount(ps8Var.a) * 2, iT);
                e(i, ps8VarS, obj, i2 + 1);
                return;
            }
        }
        qs8 qs8Var = qs8VarArr[i2];
        Object[] objArr = ps8Var.d;
        qs8Var.a(objArr, objArr.length, 0);
        while (true) {
            qs8 qs8Var2 = qs8VarArr[i2];
            if (js3.i(qs8Var2.b[qs8Var2.d], obj)) {
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
        if (!this.g) {
            throw new IllegalStateException();
        }
        boolean z = this.c;
        o56 o56Var = this.e;
        if (!z) {
            wu8.h(o56Var).remove(this.f);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            qs8 qs8Var = ((qs8[]) this.d)[this.b];
            Object obj = qs8Var.b[qs8Var.d];
            wu8.h(o56Var).remove(this.f);
            e(obj != null ? obj.hashCode() : 0, o56Var.c, obj, 0);
        }
        this.f = null;
        this.g = false;
        this.h = o56Var.e;
    }
}
