package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import defpackage.sh4;
import defpackage.vy2;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class c1 implements Iterator {
    public int a;
    public int b = -1;
    public MapMakerInternalMap.Segment c;
    public AtomicReferenceArray d;
    public sh4 e;
    public k1 f;
    public k1 g;
    public final /* synthetic */ MapMakerInternalMap h;

    public c1(MapMakerInternalMap mapMakerInternalMap) {
        this.h = mapMakerInternalMap;
        this.a = mapMakerInternalMap.c.length - 1;
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
            MapMakerInternalMap.Segment[] segmentArr = this.h.c;
            this.a = i - 1;
            MapMakerInternalMap.Segment segment = segmentArr[i];
            this.c = segment;
            if (segment.b != 0) {
                this.d = this.c.e;
                this.b = r0.length() - 1;
                if (e()) {
                    return;
                }
            }
        }
    }

    public final boolean b(sh4 sh4Var) {
        MapMakerInternalMap mapMakerInternalMap = this.h;
        try {
            Object key = sh4Var.getKey();
            Object value = sh4Var.getKey() == null ? null : sh4Var.getValue();
            if (value == null) {
                this.c.h();
                return false;
            }
            this.f = new k1(mapMakerInternalMap, key, value);
            this.c.h();
            return true;
        } catch (Throwable th) {
            this.c.h();
            throw th;
        }
    }

    public final k1 c() {
        k1 k1Var = this.f;
        if (k1Var == null) {
            throw new NoSuchElementException();
        }
        this.g = k1Var;
        a();
        return this.g;
    }

    public final boolean d() {
        sh4 sh4Var = this.e;
        if (sh4Var == null) {
            return false;
        }
        while (true) {
            this.e = sh4Var.a();
            sh4 sh4Var2 = this.e;
            if (sh4Var2 == null) {
                return false;
            }
            if (b(sh4Var2)) {
                return true;
            }
            sh4Var = this.e;
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
            sh4 sh4Var = (sh4) atomicReferenceArray.get(i);
            this.e = sh4Var;
            if (sh4Var != null && (b(sh4Var) || d())) {
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
        vy2.q(this.g != null);
        this.h.remove(this.g.a);
        this.g = null;
    }
}
