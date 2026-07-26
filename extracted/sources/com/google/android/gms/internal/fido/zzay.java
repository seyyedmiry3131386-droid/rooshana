package com.google.android.gms.internal.fido;

import defpackage.fl9;
import defpackage.o40;
import defpackage.sj0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class zzay extends zzau {
    public final transient Object c;

    public zzay(Object obj) {
        this.c = obj;
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    public final void a(Object[] objArr) {
        objArr[0] = this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.equals(obj);
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    /* JADX INFO: renamed from: f */
    public final sj0 iterator() {
        return new fl9(this.c);
    }

    @Override // com.google.android.gms.internal.fido.zzau, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // com.google.android.gms.internal.fido.zzau, com.google.android.gms.internal.fido.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new fl9(this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return o40.y("[", this.c.toString(), "]");
    }
}
