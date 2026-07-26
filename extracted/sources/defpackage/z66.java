package defpackage;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class z66 extends c1 {
    public final v66 d;
    public int e;
    public ns8 f;
    public int g;

    public z66(v66 v66Var, int i) {
        super(i, v66Var.h, 1);
        this.d = v66Var;
        this.e = v66Var.h();
        this.g = -1;
        b();
    }

    public final void a() {
        if (this.e != this.d.h()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // defpackage.c1, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.b;
        v66 v66Var = this.d;
        v66Var.add(i, obj);
        this.b++;
        this.c = v66Var.a();
        this.e = v66Var.h();
        this.g = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        v66 v66Var = this.d;
        Object[] objArr = v66Var.f;
        if (objArr == null) {
            this.f = null;
            return;
        }
        int i = (v66Var.h - 1) & (-32);
        int i2 = this.b;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (v66Var.d / 5) + 1;
        ns8 ns8Var = this.f;
        if (ns8Var == null) {
            this.f = new ns8(objArr, i2, i, i3);
            return;
        }
        ns8Var.b = i2;
        ns8Var.c = i;
        ns8Var.d = i3;
        if (ns8Var.e.length < i3) {
            ns8Var.e = new Object[i3];
        }
        ns8Var.e[0] = objArr;
        ?? r6 = i2 == i ? 1 : 0;
        ns8Var.f = r6;
        ns8Var.b(i2 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.g = i;
        ns8 ns8Var = this.f;
        v66 v66Var = this.d;
        if (ns8Var == null) {
            Object[] objArr = v66Var.g;
            this.b = i + 1;
            return objArr[i];
        }
        if (ns8Var.hasNext()) {
            this.b++;
            return ns8Var.next();
        }
        Object[] objArr2 = v66Var.g;
        int i2 = this.b;
        this.b = i2 + 1;
        return objArr2[i2 - ns8Var.c];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.g = i - 1;
        ns8 ns8Var = this.f;
        v66 v66Var = this.d;
        if (ns8Var == null) {
            Object[] objArr = v66Var.g;
            int i2 = i - 1;
            this.b = i2;
            return objArr[i2];
        }
        int i3 = ns8Var.c;
        if (i <= i3) {
            this.b = i - 1;
            return ns8Var.previous();
        }
        Object[] objArr2 = v66Var.g;
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
        v66 v66Var = this.d;
        v66Var.c(i);
        int i2 = this.g;
        if (i2 < this.b) {
            this.b = i2;
        }
        this.c = v66Var.a();
        this.e = v66Var.h();
        this.g = -1;
        b();
    }

    @Override // defpackage.c1, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.g;
        if (i == -1) {
            throw new IllegalStateException();
        }
        v66 v66Var = this.d;
        v66Var.set(i, obj);
        this.e = v66Var.h();
        b();
    }
}
