package com.google.android.gms.internal.nearby;

import defpackage.sa7;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzpv extends zzpt {
    public static final zzpt e = new zzpv(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public zzpv(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // com.google.android.gms.internal.nearby.zzpt, com.google.android.gms.internal.nearby.zzpq
    public final void a(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, this.d);
    }

    @Override // com.google.android.gms.internal.nearby.zzpq
    public final int c() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.nearby.zzpq
    public final int e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        sa7.r(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.nearby.zzpq
    public final boolean i() {
        return false;
    }

    @Override // com.google.android.gms.internal.nearby.zzpq
    public final Object[] j() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
