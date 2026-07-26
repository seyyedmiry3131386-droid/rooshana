package com.google.common.collect;

import j$.util.Objects;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {
    public transient long[] k;
    public transient int l;
    public transient int m;

    public CompactLinkedHashMap() {
        super(3);
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void a(int i) {
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int b(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int c() {
        int iC = super.c();
        this.k = new long[iC];
        return iC;
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (p()) {
            return;
        }
        this.l = -2;
        this.m = -2;
        long[] jArr = this.k;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashMap
    public final Map e() {
        Map mapE = super.e();
        this.k = null;
        return mapE;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final LinkedHashMap f(int i) {
        return new LinkedHashMap(i, 1.0f, false);
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int h() {
        return this.l;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final int i(int i) {
        return ((int) x()[i]) - 1;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void m(int i) {
        super.m(i);
        this.l = -2;
        this.m = -2;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void n(int i, int i2, int i3, Object obj, Object obj2) {
        super.n(i, i2, i3, obj, obj2);
        z(this.m, i);
        z(i, -2);
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void o(int i, int i2) {
        int size = size() - 1;
        super.o(i, i2);
        z(((int) (x()[i] >>> 32)) - 1, i(i));
        if (i < size) {
            z(((int) (x()[size] >>> 32)) - 1, i);
            z(i, i(size));
        }
        x()[size] = 0;
    }

    @Override // com.google.common.collect.CompactHashMap
    public final void v(int i) {
        super.v(i);
        this.k = Arrays.copyOf(x(), i);
    }

    public final long[] x() {
        long[] jArr = this.k;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    public final void z(int i, int i2) {
        if (i == -2) {
            this.l = i2;
        } else {
            x()[i] = (x()[i] & (-4294967296L)) | (((long) (i2 + 1)) & 4294967295L);
        }
        if (i2 == -2) {
            this.m = i;
        } else {
            x()[i2] = (4294967295L & x()[i2]) | (((long) (i + 1)) << 32);
        }
    }
}
