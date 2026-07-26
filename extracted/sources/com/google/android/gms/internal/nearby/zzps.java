package com.google.android.gms.internal.nearby;

import defpackage.sa7;

/* JADX INFO: loaded from: classes.dex */
final class zzps extends zzpt {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zzpt e;

    public zzps(zzpt zzptVar, int i, int i2) {
        this.e = zzptVar;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.nearby.zzpq
    public final int c() {
        return this.e.e() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.nearby.zzpq
    public final int e() {
        return this.e.e() + this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        sa7.r(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.nearby.zzpq
    public final boolean i() {
        return true;
    }

    @Override // com.google.android.gms.internal.nearby.zzpq
    public final Object[] j() {
        return this.e.j();
    }

    @Override // com.google.android.gms.internal.nearby.zzpt, java.util.List
    /* JADX INFO: renamed from: l */
    public final zzpt subList(int i, int i2) {
        sa7.s(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
