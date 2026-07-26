package com.google.android.gms.internal.p000authapi;

import defpackage.sy7;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zbbj extends zbbi {
    public static final zbbi e = new zbbj(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public zbbj(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    public final Object[] c() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    public final int f() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        sy7.o(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    public final boolean i() {
        return false;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbi, com.google.android.gms.internal.p000authapi.zbbf
    public final void j(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
