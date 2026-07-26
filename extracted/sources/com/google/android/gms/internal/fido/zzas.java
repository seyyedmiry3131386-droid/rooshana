package com.google.android.gms.internal.fido;

import defpackage.a27;

/* JADX INFO: loaded from: classes.dex */
final class zzas extends zzat {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zzat e;

    public zzas(zzat zzatVar, int i, int i2) {
        this.e = zzatVar;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    public final int c() {
        return this.e.e() + this.c + this.d;
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    public final int e() {
        return this.e.e() + this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a27.n(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    public final Object[] h() {
        return this.e.h();
    }

    @Override // com.google.android.gms.internal.fido.zzat, java.util.List
    /* JADX INFO: renamed from: i */
    public final zzat subList(int i, int i2) {
        a27.o(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
