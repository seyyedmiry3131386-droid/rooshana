package com.google.protobuf;

import defpackage.ev4;
import defpackage.gf7;
import defpackage.js3;
import defpackage.qm5;
import defpackage.tr3;
import defpackage.uy8;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j extends js3 {
    public static final Logger j = Logger.getLogger(j.class.getName());
    public static final boolean k = uy8.e;
    public qm5 i;

    public static int b0(int i) {
        if (i >= 0) {
            return e0(i);
        }
        return 10;
    }

    public static int c0(String str) {
        int length;
        try {
            length = z.d(str);
        } catch (Utf8$UnpairedSurrogateException unused) {
            length = str.getBytes(tr3.a).length;
        }
        return e0(length) + length;
    }

    public static int d0(int i) {
        return e0(i << 3);
    }

    public static int e0(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int f0(long j2) {
        int i;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            j2 >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j2) != 0) {
            i += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i + 1 : i;
    }

    public abstract void A0(int i);

    public abstract void B0(int i, long j2);

    public abstract void C0(long j2);

    public final void g0(String str, Utf8$UnpairedSurrogateException utf8$UnpairedSurrogateException) throws CodedOutputStream$OutOfSpaceException {
        j.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) utf8$UnpairedSurrogateException);
        byte[] bytes = str.getBytes(tr3.a);
        try {
            A0(bytes.length);
            Y(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream$OutOfSpaceException(e);
        }
    }

    public abstract void h0(byte b);

    public abstract void i0(int i, boolean z);

    public abstract void j0(int i, byte[] bArr);

    public abstract void k0(int i, ByteString byteString);

    public abstract void l0(ByteString byteString);

    public abstract void m0(int i, int i2);

    public abstract void n0(int i);

    public abstract void o0(int i, long j2);

    public abstract void p0(long j2);

    public abstract void q0(int i, int i2);

    public abstract void r0(int i);

    public abstract void s0(int i, ev4 ev4Var, gf7 gf7Var);

    public abstract void t0(ev4 ev4Var);

    public abstract void u0(int i, ev4 ev4Var);

    public abstract void v0(int i, ByteString byteString);

    public abstract void w0(int i, String str);

    public abstract void x0(String str);

    public abstract void y0(int i, int i2);

    public abstract void z0(int i, int i2);
}
