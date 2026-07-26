package com.google.android.gms.internal.measurement;

import defpackage.dw1;
import defpackage.go9;
import defpackage.j97;
import defpackage.o40;
import defpackage.qs9;
import defpackage.vr9;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzlh implements Iterable, Serializable {
    public static final zzlh b = new zzlg(qs9.b);
    public int a = 0;

    static {
        int i = vr9.a;
    }

    public static zzlh j(byte[] bArr, int i, int i2) {
        l(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzlg(bArr2);
    }

    public static int l(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public abstract byte a(int i);

    public abstract byte c(int i);

    public abstract int e();

    public abstract boolean equals(Object obj);

    public abstract zzlh f();

    public abstract void h(p0 p0Var);

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int iE = e();
            i = i(iE, iE);
            if (i == 0) {
                i = 1;
            }
            this.a = i;
        }
        return i;
    }

    public abstract int i(int i, int i2);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new go9(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return dw1.s(o40.B(e(), "<ByteString@", hexString, " size=", " contents=\""), e() <= 50 ? j97.f(this) : j97.f(f()).concat("..."), "\">");
    }
}
