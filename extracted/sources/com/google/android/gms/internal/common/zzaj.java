package com.google.android.gms.internal.common;

import defpackage.ib7;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzaj extends zzah {
    public static final zzah e = new zzaj(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public zzaj(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] c() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int f() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ib7.s(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.common.zzah, com.google.android.gms.internal.common.zzac
    public final void h(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
