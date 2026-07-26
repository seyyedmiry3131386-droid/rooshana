package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.ErrorCode;

/* JADX INFO: loaded from: classes3.dex */
public final class ie3 implements Closeable {
    public static final Logger f = Logger.getLogger(sd3.class.getName());
    public final oh0 a;
    public final gh0 b;
    public int c;
    public boolean d;
    public final cd3 e;

    public ie3(sv6 sv6Var) {
        js3.p(sv6Var, "sink");
        this.a = sv6Var;
        gh0 gh0Var = new gh0();
        this.b = gh0Var;
        this.c = 16384;
        this.e = new cd3(gh0Var);
    }

    public final void D(int i, ErrorCode errorCode) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            if (errorCode.a == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            g(i, 4, 3, 0);
            this.a.writeInt(errorCode.a);
            this.a.flush();
        }
    }

    public final void I(lr7 lr7Var) {
        js3.p(lr7Var, "settings");
        synchronized (this) {
            try {
                if (this.d) {
                    throw new IOException("closed");
                }
                g(0, Integer.bitCount(lr7Var.a) * 6, 4, 0);
                for (int i = 0; i < 10; i++) {
                    boolean z = true;
                    if (((1 << i) & lr7Var.a) == 0) {
                        z = false;
                    }
                    if (z) {
                        this.a.writeShort(i);
                        this.a.writeInt(lr7Var.b[i]);
                    }
                }
                this.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void J(int i, long j) {
        synchronized (this) {
            try {
                if (this.d) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(sd3.c(i, 4, j, false));
                }
                g(i, 4, 8, 0);
                this.a.writeInt((int) j);
                this.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(lr7 lr7Var) {
        js3.p(lr7Var, "peerSettings");
        synchronized (this) {
            try {
                if (this.d) {
                    throw new IOException("closed");
                }
                int i = this.c;
                int i2 = lr7Var.a;
                if ((i2 & 32) != 0) {
                    i = lr7Var.b[5];
                }
                this.c = i;
                if (((i2 & 2) != 0 ? lr7Var.b[1] : -1) != -1) {
                    cd3 cd3Var = this.e;
                    int i3 = (i2 & 2) != 0 ? lr7Var.b[1] : -1;
                    cd3Var.getClass();
                    int iMin = Math.min(i3, 16384);
                    int i4 = cd3Var.d;
                    if (i4 != iMin) {
                        if (iMin < i4) {
                            cd3Var.b = Math.min(cd3Var.b, iMin);
                        }
                        cd3Var.c = true;
                        cd3Var.d = iMin;
                        int i5 = cd3Var.h;
                        if (iMin < i5) {
                            if (iMin == 0) {
                                ox2[] ox2VarArr = cd3Var.e;
                                ew.F0(0, ox2VarArr.length, null, ox2VarArr);
                                cd3Var.f = cd3Var.e.length - 1;
                                cd3Var.g = 0;
                                cd3Var.h = 0;
                            } else {
                                cd3Var.a(i5 - iMin);
                            }
                        }
                    }
                }
                g(0, 0, 4, 1);
                this.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.d = true;
            this.a.close();
        }
    }

    public final void d(boolean z, int i, gh0 gh0Var, int i2) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            g(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                oh0 oh0Var = this.a;
                js3.m(gh0Var);
                oh0Var.X0(gh0Var, i2);
            }
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            this.a.flush();
        }
    }

    public final void g(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = f;
            if (logger.isLoggable(level)) {
                logger.fine(sd3.b(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(rm7.n(i, "reserved bit set: ").toString());
        }
        byte[] bArr = gh9.a;
        oh0 oh0Var = this.a;
        js3.p(oh0Var, "<this>");
        oh0Var.writeByte((i2 >>> 16) & 255);
        oh0Var.writeByte((i2 >>> 8) & 255);
        oh0Var.writeByte(i2 & 255);
        oh0Var.writeByte(i3 & 255);
        oh0Var.writeByte(i4 & 255);
        oh0Var.writeInt(i & Integer.MAX_VALUE);
    }

    public final void k(int i, ErrorCode errorCode, byte[] bArr) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            if (errorCode.a == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            g(0, bArr.length + 8, 7, 0);
            this.a.writeInt(i);
            this.a.writeInt(errorCode.a);
            if (bArr.length != 0) {
                this.a.write(bArr);
            }
            this.a.flush();
        }
    }

    public final void u(int i, ArrayList arrayList, boolean z) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            this.e.d(arrayList);
            long j = this.b.b;
            long jMin = Math.min(this.c, j);
            int i2 = j == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            g(i, (int) jMin, 1, i2);
            this.a.X0(this.b, jMin);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.c, j2);
                    j2 -= jMin2;
                    g(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.a.X0(this.b, jMin2);
                }
            }
        }
    }

    public final void y(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            g(0, 8, 6, z ? 1 : 0);
            this.a.writeInt(i);
            this.a.writeInt(i2);
            this.a.flush();
        }
    }
}
