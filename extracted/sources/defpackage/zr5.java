package defpackage;

import androidx.media3.common.ParserException;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class zr5 {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final h26 g = new h26(255);

    public final boolean a(w72 w72Var, boolean z) throws ParserException, EOFException {
        boolean zE;
        boolean zE2;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        h26 h26Var = this.g;
        h26Var.G(27);
        try {
            zE = w72Var.e(h26Var.a, 0, 27, z);
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            zE = false;
        }
        if (zE && h26Var.z() == 1332176723) {
            if (h26Var.x() == 0) {
                this.a = h26Var.x();
                this.b = h26Var.m();
                h26Var.o();
                h26Var.o();
                h26Var.o();
                int iX = h26Var.x();
                this.c = iX;
                this.d = iX + 27;
                h26Var.G(iX);
                try {
                    zE2 = w72Var.e(h26Var.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    zE2 = false;
                }
                if (zE2) {
                    for (int i = 0; i < this.c; i++) {
                        int iX2 = h26Var.x();
                        this.f[i] = iX2;
                        this.e += iX2;
                    }
                    return true;
                }
            } else if (!z) {
                throw ParserException.c("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r11 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r10.getPosition() >= r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r10.h(1) == (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(defpackage.w72 r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.getPosition()
            long r2 = r10.f()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            defpackage.vy2.j(r0)
            h26 r0 = r9.g
            r3 = 4
            r0.G(r3)
        L1a:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L2b
            long r5 = r10.getPosition()
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L4b
        L2b:
            byte[] r5 = r0.a
            boolean r5 = r10.e(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L32
            goto L33
        L32:
            r5 = r1
        L33:
            if (r5 == 0) goto L4b
            r0.J(r1)
            long r4 = r0.z()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L47
            r10.m()
            return r2
        L47:
            r10.n(r2)
            goto L1a
        L4b:
            if (r4 == 0) goto L55
            long r5 = r10.getPosition()
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 >= 0) goto L5d
        L55:
            int r0 = r10.h(r2)
            r3 = -1
            if (r0 == r3) goto L5d
            goto L4b
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr5.b(w72, long):boolean");
    }
}
