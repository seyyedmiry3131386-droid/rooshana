package defpackage;

import java.io.Closeable;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j77 implements Closeable {
    public static final i77 a;

    static {
        ByteString byteString = ByteString.d;
        js3.p(byteString, "<this>");
        gh0 gh0Var = new gh0();
        gh0Var.L0(byteString);
        a = new i77(null, byteString.a.length, gh0Var);
    }

    public final byte[] b() throws Throwable {
        i77 i77Var = (i77) this;
        long j = i77Var.c;
        if (j > 2147483647L) {
            throw new IOException(bl4.r(j, "Cannot buffer entire body for content length: "));
        }
        gh0 gh0Var = i77Var.d;
        byte[] bArrP = null;
        try {
            bArrP = gh0Var.P(gh0Var.b);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        if (th != null) {
            throw th;
        }
        int length = bArrP.length;
        if (j == -1 || j == length) {
            return bArrP;
        }
        throw new IOException("Content-Length (" + j + ") and stream length (" + length + ") disagree");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        gh9.b(d1());
    }

    public abstract long d();

    public abstract ph0 d1();

    public abstract dt4 g();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013 A[Catch: all -> 0x0026, TryCatch #1 {all -> 0x0026, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0015, B:7:0x0013), top: B:24:0x0005 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String k() {
        /*
            r5 = this;
            ph0 r0 = r5.d1()
            r1 = 0
            dt4 r2 = r5.g()     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L13
            kotlin.text.Regex r3 = defpackage.dt4.e     // Catch: java.lang.Throwable -> L26
            java.nio.charset.Charset r2 = r2.a(r1)     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L15
        L13:
            java.nio.charset.Charset r2 = defpackage.zp0.a     // Catch: java.lang.Throwable -> L26
        L15:
            java.nio.charset.Charset r2 = defpackage.ih9.f(r0, r2)     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = r0.u0(r2)     // Catch: java.lang.Throwable -> L26
            r0.close()     // Catch: java.lang.Throwable -> L21
            goto L22
        L21:
            r1 = move-exception
        L22:
            r4 = r2
            r2 = r1
            r1 = r4
            goto L31
        L26:
            r2 = move-exception
            if (r0 == 0) goto L31
            r0.close()     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r0 = move-exception
            defpackage.wu8.f(r2, r0)
        L31:
            if (r2 != 0) goto L34
            return r1
        L34:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j77.k():java.lang.String");
    }
}
