package com.google.common.cache;

import defpackage.c27;
import defpackage.kc4;
import defpackage.wn5;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Iterator {
    public int a;
    public int b = -1;
    public LocalCache$Segment c;
    public AtomicReferenceArray d;
    public c27 e;
    public kc4 f;
    public kc4 g;
    public final /* synthetic */ d h;

    public c(d dVar) {
        this.h = dVar;
        this.a = dVar.c.length - 1;
        a();
    }

    public final void a() {
        this.f = null;
        if (d() || e()) {
            return;
        }
        while (true) {
            int i = this.a;
            if (i < 0) {
                return;
            }
            LocalCache$Segment[] localCache$SegmentArr = this.h.c;
            this.a = i - 1;
            LocalCache$Segment localCache$Segment = localCache$SegmentArr[i];
            this.c = localCache$Segment;
            if (localCache$Segment.b != 0) {
                this.d = this.c.f;
                this.b = r0.length() - 1;
                if (e()) {
                    return;
                }
            }
        }
    }

    public final boolean b(c27 c27Var) {
        Object obj;
        d dVar = this.h;
        try {
            long jA = dVar.o.a();
            Object key = c27Var.getKey();
            Object obj2 = null;
            if (c27Var.getKey() != null && (obj = c27Var.b().get()) != null && !dVar.e(c27Var, jA)) {
                obj2 = obj;
            }
            if (obj2 == null) {
                this.c.j();
                return false;
            }
            this.f = new kc4(dVar, key, obj2);
            this.c.j();
            return true;
        } catch (Throwable th) {
            this.c.j();
            throw th;
        }
    }

    public final kc4 c() {
        kc4 kc4Var = this.f;
        if (kc4Var == null) {
            throw new NoSuchElementException();
        }
        this.g = kc4Var;
        a();
        return this.g;
    }

    public final boolean d() {
        c27 c27Var = this.e;
        if (c27Var == null) {
            return false;
        }
        while (true) {
            this.e = c27Var.a();
            c27 c27Var2 = this.e;
            if (c27Var2 == null) {
                return false;
            }
            if (b(c27Var2)) {
                return true;
            }
            c27Var = this.e;
        }
    }

    public final boolean e() {
        while (true) {
            int i = this.b;
            if (i < 0) {
                return false;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            this.b = i - 1;
            c27 c27Var = (c27) atomicReferenceArray.get(i);
            this.e = c27Var;
            if (c27Var != null && (b(c27Var) || d())) {
                return true;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f != null;
    }

    @Override // java.util.Iterator
    public Object next() {
        return c();
    }

    @Override // java.util.Iterator
    public final void remove() {
        wn5.t(this.g != null);
        this.h.remove(this.g.a);
        this.g = null;
    }
}
