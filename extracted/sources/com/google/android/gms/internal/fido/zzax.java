package com.google.android.gms.internal.fido;

import defpackage.bl9;
import defpackage.sj0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class zzax extends zzau {
    public static final Object[] h;
    public static final zzax i;
    public final transient Object[] c;
    public final transient int d;
    public final transient Object[] e;
    public final transient int f;
    public final transient int g;

    static {
        Object[] objArr = new Object[0];
        h = objArr;
        i = new zzax(0, 0, 0, objArr, objArr);
    }

    public zzax(int i2, int i3, int i4, Object[] objArr, Object[] objArr2) {
        this.c = objArr;
        this.d = i2;
        this.e = objArr2;
        this.f = i3;
        this.g = i4;
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    public final void a(Object[] objArr) {
        System.arraycopy(this.c, 0, objArr, 0, this.g);
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    public final int c() {
        return this.g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.e;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i2 = iRotateLeft & this.f;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i2 + 1;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    /* JADX INFO: renamed from: f */
    public final sj0 iterator() {
        zzat zzawVar = this.b;
        if (zzawVar == null) {
            bl9 bl9Var = zzat.b;
            int i2 = this.g;
            zzawVar = i2 == 0 ? zzaw.e : new zzaw(i2, this.c);
            this.b = zzawVar;
        }
        return zzawVar.listIterator(0);
    }

    @Override // com.google.android.gms.internal.fido.zzaq
    public final Object[] h() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.fido.zzau, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.fido.zzau, com.google.android.gms.internal.fido.zzaq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzat zzawVar = this.b;
        if (zzawVar == null) {
            bl9 bl9Var = zzat.b;
            int i2 = this.g;
            zzawVar = i2 == 0 ? zzaw.e : new zzaw(i2, this.c);
            this.b = zzawVar;
        }
        return zzawVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }
}
