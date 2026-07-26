package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class cw2 implements t18 {
    public byte a;
    public final tv6 b;
    public final Inflater c;
    public final kn3 d;
    public final CRC32 e;

    public cw2(ph0 ph0Var) {
        js3.p(ph0Var, "source");
        tv6 tv6Var = new tv6(ph0Var);
        this.b = tv6Var;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new kn3(tv6Var, inflater);
        this.e = new CRC32();
    }

    public static void b(String str, int i, int i2) throws IOException {
        if (i2 == i) {
            return;
        }
        StringBuilder sbE = bl4.E(str, ": actual 0x");
        sbE.append(f88.r0(8, wq2.W(i2)));
        sbE.append(" != expected 0x");
        sbE.append(f88.r0(8, wq2.W(i)));
        throw new IOException(sbE.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    public final void d(gh0 gh0Var, long j, long j2) {
        vl7 vl7Var = gh0Var.a;
        js3.m(vl7Var);
        while (true) {
            int i = vl7Var.c;
            int i2 = vl7Var.b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            vl7Var = vl7Var.f;
            js3.m(vl7Var);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) vl7Var.b) + j);
            int iMin = (int) Math.min(vl7Var.c - i3, j2);
            this.e.update(vl7Var.a, i3, iMin);
            j2 -= (long) iMin;
            vl7Var = vl7Var.f;
            js3.m(vl7Var);
            j = 0;
        }
    }

    @Override // defpackage.t18
    public final long f0(gh0 gh0Var, long j) throws IOException {
        cw2 cw2Var = this;
        js3.p(gh0Var, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(bl4.r(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b = cw2Var.a;
        CRC32 crc32 = cw2Var.e;
        tv6 tv6Var = cw2Var.b;
        if (b == 0) {
            tv6Var.g1(10L);
            gh0 gh0Var2 = tv6Var.b;
            byte bY = gh0Var2.y(3L);
            boolean z = ((bY >> 1) & 1) == 1;
            if (z) {
                cw2Var.d(gh0Var2, 0L, 10L);
            }
            b("ID1ID2", 8075, tv6Var.readShort());
            tv6Var.skip(8L);
            if (((bY >> 2) & 1) == 1) {
                tv6Var.g1(2L);
                if (z) {
                    d(gh0Var2, 0L, 2L);
                }
                long jK0 = gh0Var2.k0() & 65535;
                tv6Var.g1(jK0);
                if (z) {
                    d(gh0Var2, 0L, jK0);
                }
                tv6Var.skip(jK0);
            }
            if (((bY >> 3) & 1) == 1) {
                long jD = tv6Var.d((byte) 0, 0L, Long.MAX_VALUE);
                if (jD == -1) {
                    throw new EOFException();
                }
                if (z) {
                    d(gh0Var2, 0L, jD + 1);
                }
                tv6Var.skip(jD + 1);
            }
            if (((bY >> 4) & 1) == 1) {
                long jD2 = tv6Var.d((byte) 0, 0L, Long.MAX_VALUE);
                if (jD2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    cw2Var = this;
                    cw2Var.d(gh0Var2, 0L, jD2 + 1);
                } else {
                    cw2Var = this;
                }
                tv6Var.skip(jD2 + 1);
            } else {
                cw2Var = this;
            }
            if (z) {
                b("FHCRC", tv6Var.y(), (short) crc32.getValue());
                crc32.reset();
            }
            cw2Var.a = (byte) 1;
        }
        if (cw2Var.a == 1) {
            long j2 = gh0Var.b;
            long jF0 = cw2Var.d.f0(gh0Var, j);
            if (jF0 != -1) {
                cw2Var.d(gh0Var, j2, jF0);
                return jF0;
            }
            cw2Var.a = (byte) 2;
        }
        if (cw2Var.a == 2) {
            b("CRC", tv6Var.k(), (int) crc32.getValue());
            b("ISIZE", tv6Var.k(), (int) cw2Var.c.getBytesWritten());
            cw2Var.a = (byte) 3;
            if (!tv6Var.b()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // defpackage.t18
    public final dm8 i() {
        return this.b.a.i();
    }
}
