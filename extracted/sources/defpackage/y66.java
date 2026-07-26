package defpackage;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class y66 extends c1 {
    public final u66 d;
    public int e;
    public ms8 f;
    public int g;

    public y66(u66 u66Var, int i) {
        super(i, u66Var.f, 0);
        this.d = u66Var;
        this.e = u66Var.h();
        this.g = -1;
        c();
    }

    public final void a() {
        if (this.e != this.d.h()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // defpackage.c1, java.util.ListIterator
    public final void add(Object obj) {
        a();
        this.d.add(this.b, obj);
        this.b++;
        b();
    }

    public final void b() {
        u66 u66Var = this.d;
        this.c = u66Var.a();
        this.e = u66Var.h();
        this.g = -1;
        c();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void c() {
        u66 u66Var = this.d;
        Object[] objArr = u66Var.d;
        if (objArr == null) {
            this.f = null;
            return;
        }
        int i = (u66Var.f - 1) & (-32);
        int i2 = this.b;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (u66Var.a / 5) + 1;
        ms8 ms8Var = this.f;
        if (ms8Var == null) {
            this.f = new ms8(objArr, i2, i, i3);
            return;
        }
        ms8Var.b = i2;
        ms8Var.c = i;
        ms8Var.d = i3;
        if (ms8Var.e.length < i3) {
            ms8Var.e = new Object[i3];
        }
        ms8Var.e[0] = objArr;
        ?? r6 = i2 == i ? 1 : 0;
        ms8Var.f = r6;
        ms8Var.b(i2 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.g = i;
        ms8 ms8Var = this.f;
        u66 u66Var = this.d;
        if (ms8Var == null) {
            Object[] objArr = u66Var.e;
            this.b = i + 1;
            return objArr[i];
        }
        if (ms8Var.hasNext()) {
            this.b++;
            return ms8Var.next();
        }
        Object[] objArr2 = u66Var.e;
        int i2 = this.b;
        this.b = i2 + 1;
        return objArr2[i2 - ms8Var.c];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.g = i - 1;
        ms8 ms8Var = this.f;
        u66 u66Var = this.d;
        if (ms8Var == null) {
            Object[] objArr = u66Var.e;
            int i2 = i - 1;
            this.b = i2;
            return objArr[i2];
        }
        int i3 = ms8Var.c;
        if (i <= i3) {
            this.b = i - 1;
            return ms8Var.previous();
        }
        Object[] objArr2 = u66Var.e;
        int i4 = i - 1;
        this.b = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.c1, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.g;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.d.c(i);
        int i2 = this.g;
        if (i2 < this.b) {
            this.b = i2;
        }
        b();
    }

    @Override // defpackage.c1, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.g;
        if (i == -1) {
            throw new IllegalStateException();
        }
        u66 u66Var = this.d;
        u66Var.set(i, obj);
        this.e = u66Var.h();
        c();
    }
}
