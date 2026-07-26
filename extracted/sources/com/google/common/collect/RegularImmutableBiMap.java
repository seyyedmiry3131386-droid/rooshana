package com.google.common.collect;

import com.google.common.collect.RegularImmutableMap;
import defpackage.rj3;
import defpackage.xa0;

/* JADX INFO: loaded from: classes.dex */
final class RegularImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {
    public static final RegularImmutableBiMap i = new RegularImmutableBiMap();
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;
    public final transient int g;
    public final transient RegularImmutableBiMap h;

    private RegularImmutableBiMap() {
        this.d = null;
        this.e = new Object[0];
        this.f = 0;
        this.g = 0;
        this.h = this;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet c() {
        return new RegularImmutableMap.EntrySet(this, this.e, this.f, this.g);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet e() {
        return new RegularImmutableMap.KeySet(this, new RegularImmutableMap.KeysOrValuesAsList(this.e, this.f, this.g));
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Object get(Object obj) {
        Object objR = RegularImmutableMap.r(this.d, this.e, this.g, this.f, obj);
        if (objR == null) {
            return null;
        }
        return objR;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean i() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableBiMap
    /* JADX INFO: renamed from: p */
    public final ImmutableBiMap y() {
        return this.h;
    }

    @Override // java.util.Map
    public final int size() {
        return this.g;
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableBiMap, defpackage.xa0
    public final xa0 y() {
        return this.h;
    }

    public RegularImmutableBiMap(int i2, Object[] objArr) {
        this.e = objArr;
        this.g = i2;
        this.f = 0;
        int iL = i2 >= 2 ? ImmutableSet.l(i2) : 0;
        Object objQ = RegularImmutableMap.q(objArr, i2, iL, 0);
        if (!(objQ instanceof Object[])) {
            this.d = objQ;
            Object objQ2 = RegularImmutableMap.q(objArr, i2, iL, 1);
            if (!(objQ2 instanceof Object[])) {
                this.h = new RegularImmutableBiMap(objQ2, objArr, i2, this);
                return;
            }
            throw ((rj3) ((Object[]) objQ2)[2]).a();
        }
        throw ((rj3) ((Object[]) objQ)[2]).a();
    }

    public RegularImmutableBiMap(Object obj, Object[] objArr, int i2, RegularImmutableBiMap regularImmutableBiMap) {
        this.d = obj;
        this.e = objArr;
        this.f = 1;
        this.g = i2;
        this.h = regularImmutableBiMap;
    }
}
