package com.google.android.gms.internal.measurement;

import defpackage.qs9;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
class zzlg extends zzlf {
    public final byte[] c;

    public zzlg(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public byte a(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public byte c(int i) {
        return this.c[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public int e() {
        return this.c.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzlh) && e() == ((zzlh) obj).e()) {
            if (e() == 0) {
                return true;
            }
            if (!(obj instanceof zzlg)) {
                return obj.equals(this);
            }
            zzlg zzlgVar = (zzlg) obj;
            int i = this.a;
            int i2 = zzlgVar.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int iE = e();
                if (iE > zzlgVar.e()) {
                    int iE2 = e();
                    StringBuilder sb = new StringBuilder(String.valueOf(iE).length() + 18 + String.valueOf(iE2).length());
                    sb.append("Length too large: ");
                    sb.append(iE);
                    sb.append(iE2);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (iE <= zzlgVar.e()) {
                    byte[] bArr = zzlgVar.c;
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
                int iE3 = zzlgVar.e();
                StringBuilder sb2 = new StringBuilder(String.valueOf(iE).length() + 27 + String.valueOf(iE3).length());
                sb2.append("Ran off end of other: 0, ");
                sb2.append(iE);
                sb2.append(", ");
                sb2.append(iE3);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final zzlh f() {
        int iL = zzlh.l(0, 47, e());
        return iL == 0 ? zzlh.b : new zzlc(this.c, iL);
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final void h(p0 p0Var) throws zzll {
        p0Var.t(e(), this.c);
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final int i(int i, int i2) {
        Charset charset = qs9.a;
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + this.c[i3];
        }
        return i;
    }
}
