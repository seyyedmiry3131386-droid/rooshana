package com.google.android.gms.internal.auth;

import defpackage.dw1;
import defpackage.xo9;

/* JADX INFO: loaded from: classes.dex */
class zzec extends zzeb {
    public final byte[] c;

    public zzec(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public byte a(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public byte c(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public int e() {
        return this.c.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzef) && e() == ((zzef) obj).e()) {
            if (e() == 0) {
                return true;
            }
            if (!(obj instanceof zzec)) {
                return obj.equals(this);
            }
            zzec zzecVar = (zzec) obj;
            int i = this.a;
            int i2 = zzecVar.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int iE = e();
                if (iE > zzecVar.e()) {
                    throw new IllegalArgumentException("Length too large: " + iE + e());
                }
                if (iE > zzecVar.e()) {
                    throw new IllegalArgumentException(dw1.j(iE, zzecVar.e(), "Ran off end of other: 0, ", ", "));
                }
                byte[] bArr = zzecVar.c;
                int i3 = 0;
                int i4 = 0;
                while (i3 < iE) {
                    if (this.c[i3] == bArr[i4]) {
                        i3++;
                        i4++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final int f(int i, int i2) {
        byte[] bArr = xo9.a;
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + this.c[i3];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.auth.zzef
    public final zzef h() {
        zzef.i(47, e());
        return new zzdz(this.c, 47);
    }
}
