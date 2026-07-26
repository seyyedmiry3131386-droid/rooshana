package com.google.android.gms.internal.fido;

import defpackage.a27;

/* JADX INFO: loaded from: classes.dex */
final class zzaw extends zzat {
    public static final zzat e = new zzaw(0, new Object[0]);
    public final transient Object[] c;
    public final transient int d;

    public zzaw(int i, Object[] objArr) {
        this.c = objArr;
        this.d = i;
    }

    @Override // com.google.android.gms.internal.fido.zzat, com.google.android.gms.internal.fido.zzaq
    public final void a(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, this.d);
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    public final int c() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    public final int e() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a27.n(i, this.d);
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    public final Object[] h() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
