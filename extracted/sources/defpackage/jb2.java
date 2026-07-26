package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class jb2 implements t18 {
    public final vw3 a;
    public long b;
    public boolean c;

    public jb2(vw3 vw3Var, long j) {
        this.a = vw3Var;
        this.b = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        vw3 vw3Var = this.a;
        if (this.c) {
            return;
        }
        this.c = true;
        ReentrantLock reentrantLock = vw3Var.c;
        reentrantLock.lock();
        try {
            int i = vw3Var.b - 1;
            vw3Var.b = i;
            if (i == 0) {
                if (vw3Var.a) {
                    synchronized (vw3Var) {
                        vw3Var.d.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.t18
    public final long f0(gh0 gh0Var, long j) {
        long j2;
        long j3;
        int i;
        js3.p(gh0Var, "sink");
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        vw3 vw3Var = this.a;
        long j4 = this.b;
        if (j < 0) {
            throw new IllegalArgumentException(bl4.r(j, "byteCount < 0: ").toString());
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 >= j5) {
                j2 = -1;
                break;
            }
            vl7 vl7VarF0 = gh0Var.F0(1);
            byte[] bArr = vl7VarF0.a;
            int i2 = vl7VarF0.c;
            j2 = -1;
            int iMin = (int) Math.min(j5 - j6, 8192 - i2);
            synchronized (vw3Var) {
                js3.p(bArr, "array");
                vw3Var.d.seek(j6);
                i = 0;
                while (true) {
                    if (i >= iMin) {
                        break;
                    }
                    int i3 = vw3Var.d.read(bArr, i2, iMin - i);
                    if (i3 != -1) {
                        i += i3;
                    } else if (i == 0) {
                        i = -1;
                    }
                }
            }
            if (i == -1) {
                if (vl7VarF0.b == vl7VarF0.c) {
                    gh0Var.a = vl7VarF0.a();
                    am7.a(vl7VarF0);
                }
                if (j4 == j6) {
                    j3 = -1;
                }
            } else {
                vl7VarF0.c += i;
                long j7 = i;
                j6 += j7;
                gh0Var.b += j7;
            }
        }
        j3 = j6 - j4;
        if (j3 != j2) {
            this.b += j3;
        }
        return j3;
    }

    @Override // defpackage.t18
    public final dm8 i() {
        return dm8.d;
    }
}
