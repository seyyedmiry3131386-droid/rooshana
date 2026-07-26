package com.google.android.gms.internal.p000authapi;

import defpackage.sy7;

/* JADX INFO: loaded from: classes.dex */
final class zbbh extends zbbi {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ zbbi e;

    public zbbh(zbbi zbbiVar, int i, int i2) {
        this.e = zbbiVar;
        this.c = i;
        this.d = i2;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    public final Object[] c() {
        return this.e.c();
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    public final int e() {
        return this.e.e() + this.c;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    public final int f() {
        return this.e.e() + this.c + this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        sy7.o(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbf
    public final boolean i() {
        return true;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbbi, java.util.List
    /* JADX INFO: renamed from: l */
    public final zbbi subList(int i, int i2) {
        sy7.p(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
