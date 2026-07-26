package com.google.common.collect;

import defpackage.b47;
import defpackage.sq5;
import defpackage.tt3;
import defpackage.vy2;
import defpackage.wn5;
import defpackage.y97;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
abstract class AbstractMapBasedMultiset<E> extends w implements Serializable {
    private static final long serialVersionUID = 0;
    public transient sq5 c;
    public transient long d;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        this.c = i();
        b47.l(this, objectInputStream, i);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        b47.y(this, objectOutputStream);
    }

    @Override // com.google.common.collect.w, defpackage.oa5
    public final boolean K(int i, Object obj) {
        vy2.m(i, "oldCount");
        vy2.m(0, "newCount");
        int iE = this.c.e(obj);
        if (iE == -1) {
            if (i == 0) {
                return true;
            }
        } else if (this.c.d(iE) == i) {
            this.c.m(iE);
            this.d -= (long) i;
            return true;
        }
        return false;
    }

    @Override // defpackage.oa5
    public final int add(int i, Object obj) {
        if (i == 0) {
            return this.c.c(obj);
        }
        wn5.h("occurrences cannot be negative: %s", i, i > 0);
        int iE = this.c.e(obj);
        if (iE == -1) {
            this.c.k(i, obj);
            this.d += (long) i;
            return 0;
        }
        int iD = this.c.d(iE);
        long j = i;
        long j2 = ((long) iD) + j;
        wn5.f(j2, "too many occurrences: %s", j2 <= 2147483647L);
        sq5 sq5Var = this.c;
        wn5.l(iE, sq5Var.c);
        sq5Var.b[iE] = (int) j2;
        this.d += j;
        return iD;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.c.a();
        this.d = 0L;
    }

    @Override // com.google.common.collect.w
    public final int e() {
        return this.c.c;
    }

    @Override // com.google.common.collect.w
    public final Iterator f() {
        return new u(this, 0);
    }

    @Override // com.google.common.collect.w
    public final Iterator h() {
        return new u(this, 1);
    }

    public abstract sq5 i();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return tt3.D(this);
    }

    @Override // defpackage.oa5
    public final int j1(Object obj) {
        vy2.m(0, "count");
        sq5 sq5Var = this.c;
        sq5Var.getClass();
        int iL = sq5Var.l(y97.b0(obj), obj);
        this.d += (long) (0 - iL);
        return iL;
    }

    @Override // defpackage.oa5
    public final int s0(Object obj) {
        return this.c.c(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return com.google.common.primitives.a.f(this.d);
    }

    @Override // defpackage.oa5
    public final int w0(int i, Object obj) {
        if (i == 0) {
            return this.c.c(obj);
        }
        wn5.h("occurrences cannot be negative: %s", i, i > 0);
        int iE = this.c.e(obj);
        if (iE == -1) {
            return 0;
        }
        int iD = this.c.d(iE);
        if (iD > i) {
            sq5 sq5Var = this.c;
            wn5.l(iE, sq5Var.c);
            sq5Var.b[iE] = iD - i;
        } else {
            this.c.m(iE);
            i = iD;
        }
        this.d -= (long) i;
        return iD;
    }
}
