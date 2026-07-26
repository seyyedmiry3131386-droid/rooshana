package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class lc7 {
    public final qc1 a;
    public final int b;
    public final h26 c;
    public hg0 d;
    public hg0 e;
    public hg0 f;
    public long g;

    public lc7(qc1 qc1Var) {
        this.a = qc1Var;
        int i = qc1Var.b;
        this.b = i;
        this.c = new h26(32);
        hg0 hg0Var = new hg0(i, 0L);
        this.d = hg0Var;
        this.e = hg0Var;
        this.f = hg0Var;
    }

    public static hg0 d(hg0 hg0Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= hg0Var.b) {
            hg0Var = (hg0) hg0Var.d;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (hg0Var.b - j));
            ud udVar = (ud) hg0Var.c;
            byteBuffer.put(udVar.a, ((int) (j - hg0Var.a)) + udVar.b, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == hg0Var.b) {
                hg0Var = (hg0) hg0Var.d;
            }
        }
        return hg0Var;
    }

    public static hg0 e(hg0 hg0Var, long j, byte[] bArr, int i) {
        while (j >= hg0Var.b) {
            hg0Var = (hg0) hg0Var.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (hg0Var.b - j));
            ud udVar = (ud) hg0Var.c;
            System.arraycopy(udVar.a, ((int) (j - hg0Var.a)) + udVar.b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == hg0Var.b) {
                hg0Var = (hg0) hg0Var.d;
            }
        }
        return hg0Var;
    }

    public static hg0 f(hg0 hg0Var, fc1 fc1Var, tn0 tn0Var, h26 h26Var) {
        if (fc1Var.d(1073741824)) {
            long j = tn0Var.b;
            int iD = 1;
            h26Var.G(1);
            hg0 hg0VarE = e(hg0Var, j, h26Var.a, 1);
            long j2 = j + 1;
            byte b = h26Var.a[0];
            boolean z = (b & 128) != 0;
            int i = b & 127;
            d81 d81Var = fc1Var.d;
            byte[] bArr = d81Var.a;
            if (bArr == null) {
                d81Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            hg0Var = e(hg0VarE, j2, d81Var.a, i);
            long j3 = j2 + ((long) i);
            if (z) {
                h26Var.G(2);
                hg0Var = e(hg0Var, j3, h26Var.a, 2);
                j3 += 2;
                iD = h26Var.D();
            }
            int[] iArr = d81Var.d;
            if (iArr == null || iArr.length < iD) {
                iArr = new int[iD];
            }
            int[] iArr2 = d81Var.e;
            if (iArr2 == null || iArr2.length < iD) {
                iArr2 = new int[iD];
            }
            if (z) {
                int i2 = iD * 6;
                h26Var.G(i2);
                hg0Var = e(hg0Var, j3, h26Var.a, i2);
                j3 += (long) i2;
                h26Var.J(0);
                for (int i3 = 0; i3 < iD; i3++) {
                    iArr[i3] = h26Var.D();
                    iArr2[i3] = h26Var.B();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = tn0Var.a - ((int) (j3 - tn0Var.b));
            }
            bp8 bp8Var = (bp8) tn0Var.c;
            String str = j29.a;
            byte[] bArr2 = bp8Var.b;
            byte[] bArr3 = d81Var.a;
            int i4 = bp8Var.a;
            int i5 = bp8Var.c;
            int i6 = bp8Var.d;
            d81Var.f = iD;
            d81Var.d = iArr;
            d81Var.e = iArr2;
            d81Var.b = bArr2;
            d81Var.a = bArr3;
            d81Var.c = i4;
            d81Var.g = i5;
            d81Var.h = i6;
            MediaCodec.CryptoInfo cryptoInfo = d81Var.i;
            cryptoInfo.numSubSamples = iD;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i4;
            if (Build.VERSION.SDK_INT >= 24) {
                c81 c81Var = d81Var.j;
                c81Var.getClass();
                c81.a(c81Var, i5, i6);
            }
            long j4 = tn0Var.b;
            int i7 = (int) (j3 - j4);
            tn0Var.b = j4 + ((long) i7);
            tn0Var.a -= i7;
        }
        if (!fc1Var.d(268435456)) {
            fc1Var.i(tn0Var.a);
            return d(hg0Var, tn0Var.b, fc1Var.e, tn0Var.a);
        }
        h26Var.G(4);
        hg0 hg0VarE2 = e(hg0Var, tn0Var.b, h26Var.a, 4);
        int iB = h26Var.B();
        tn0Var.b += 4;
        tn0Var.a -= 4;
        fc1Var.i(iB);
        hg0 hg0VarD = d(hg0VarE2, tn0Var.b, fc1Var.e, iB);
        tn0Var.b += (long) iB;
        int i8 = tn0Var.a - iB;
        tn0Var.a = i8;
        ByteBuffer byteBuffer = fc1Var.h;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            fc1Var.h = ByteBuffer.allocate(i8);
        } else {
            fc1Var.h.clear();
        }
        return d(hg0VarD, tn0Var.b, fc1Var.h, tn0Var.a);
    }

    public final void a(hg0 hg0Var) {
        if (((ud) hg0Var.c) == null) {
            return;
        }
        qc1 qc1Var = this.a;
        synchronized (qc1Var) {
            hg0 hg0Var2 = hg0Var;
            while (hg0Var2 != null) {
                try {
                    ud[] udVarArr = qc1Var.f;
                    int i = qc1Var.e;
                    qc1Var.e = i + 1;
                    ud udVar = (ud) hg0Var2.c;
                    udVar.getClass();
                    udVarArr[i] = udVar;
                    qc1Var.d--;
                    hg0Var2 = (hg0) hg0Var2.d;
                    if (hg0Var2 == null || ((ud) hg0Var2.c) == null) {
                        hg0Var2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            qc1Var.notifyAll();
        }
        hg0Var.c = null;
        hg0Var.d = null;
    }

    public final void b(long j) {
        hg0 hg0Var;
        if (j == -1) {
            return;
        }
        while (true) {
            hg0Var = this.d;
            if (j < hg0Var.b) {
                break;
            }
            qc1 qc1Var = this.a;
            ud udVar = (ud) hg0Var.c;
            synchronized (qc1Var) {
                ud[] udVarArr = qc1Var.f;
                int i = qc1Var.e;
                qc1Var.e = i + 1;
                udVarArr[i] = udVar;
                qc1Var.d--;
                qc1Var.notifyAll();
            }
            hg0 hg0Var2 = this.d;
            hg0Var2.c = null;
            hg0 hg0Var3 = (hg0) hg0Var2.d;
            hg0Var2.d = null;
            this.d = hg0Var3;
        }
        if (this.e.a < hg0Var.a) {
            this.e = hg0Var;
        }
    }

    public final int c(int i) {
        ud udVar;
        hg0 hg0Var = this.f;
        if (((ud) hg0Var.c) == null) {
            qc1 qc1Var = this.a;
            synchronized (qc1Var) {
                try {
                    int i2 = qc1Var.d + 1;
                    qc1Var.d = i2;
                    int i3 = qc1Var.e;
                    if (i3 > 0) {
                        ud[] udVarArr = qc1Var.f;
                        int i4 = i3 - 1;
                        qc1Var.e = i4;
                        udVar = udVarArr[i4];
                        udVar.getClass();
                        qc1Var.f[qc1Var.e] = null;
                    } else {
                        ud udVar2 = new ud(new byte[qc1Var.b], 0);
                        ud[] udVarArr2 = qc1Var.f;
                        if (i2 > udVarArr2.length) {
                            qc1Var.f = (ud[]) Arrays.copyOf(udVarArr2, udVarArr2.length * 2);
                        }
                        udVar = udVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            hg0 hg0Var2 = new hg0(this.b, this.f.b);
            hg0Var.c = udVar;
            hg0Var.d = hg0Var2;
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }
}
