package com.google.android.gms.internal.common;

import defpackage.ib7;

/* JADX INFO: loaded from: classes.dex */
final class zzag extends zzah {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zzah e;

    public zzag(zzah zzahVar, int i, int i2) {
        this.e = zzahVar;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] c() {
        return this.e.c();
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int e() {
        return this.e.e() + this.c;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int f() {
        return this.e.e() + this.c + this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ib7.s(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    /* JADX INFO: renamed from: j */
    public final zzah subList(int i, int i2) {
        ib7.t(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
