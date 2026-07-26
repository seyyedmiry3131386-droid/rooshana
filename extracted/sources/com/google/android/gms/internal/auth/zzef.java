package com.google.android.gms.internal.auth;

import defpackage.b67;
import defpackage.do9;
import defpackage.dw1;
import defpackage.go9;
import defpackage.o40;
import defpackage.rm7;
import defpackage.xo9;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzef implements Iterable, Serializable {
    public static final zzef b = new zzec(xo9.a);
    public int a = 0;

    static {
        int i = do9.a;
    }

    public static int i(int i, int i2) {
        if (((i2 - i) | i) >= 0) {
            return i;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(rm7.n(i, "Beginning index larger than ending index: 0, "));
        }
        throw new IndexOutOfBoundsException(dw1.j(i, i2, "End index: ", " >= "));
    }

    public abstract byte a(int i);

    public abstract byte c(int i);

    public abstract int e();

    public abstract int f(int i, int i2);

    public abstract zzef h();

    public final int hashCode() {
        int iF = this.a;
        if (iF == 0) {
            int iE = e();
            iF = f(iE, iE);
            if (iF == 0) {
                iF = 1;
            }
            this.a = iF;
        }
        return iF;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new go9(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        return dw1.s(o40.B(e(), "<ByteString@", hexString, " size=", " contents=\""), e() <= 50 ? b67.g(this) : b67.g(h()).concat("..."), "\">");
    }
}
