package defpackage;

import android.net.Uri;
import androidx.media3.datasource.cache.CacheDataSink$CacheDataSinkException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class jf8 implements xa1 {
    public final xa1 a;
    public final kk0 b;
    public boolean c;
    public long d;

    public jf8(xa1 xa1Var, kk0 kk0Var) {
        xa1Var.getClass();
        this.a = xa1Var;
        kk0Var.getClass();
        this.b = kk0Var;
    }

    @Override // defpackage.xa1
    public final long b(db1 db1Var) throws CacheDataSink$CacheDataSinkException {
        long jB = this.a.b(db1Var);
        this.d = jB;
        if (jB == 0) {
            return 0L;
        }
        if (db1Var.g == -1 && jB != -1) {
            db1Var = db1Var.c(0L, jB);
        }
        int i = db1Var.i;
        this.c = true;
        kk0 kk0Var = this.b;
        kk0Var.getClass();
        db1Var.h.getClass();
        if (db1Var.g == -1 && (i & 2) == 2) {
            kk0Var.d = null;
        } else {
            kk0Var.d = db1Var;
            kk0Var.e = (i & 4) == 4 ? kk0Var.b : Long.MAX_VALUE;
            kk0Var.i = 0L;
            try {
                kk0Var.b(db1Var);
            } catch (IOException e) {
                throw new CacheDataSink$CacheDataSinkException(e);
            }
        }
        return this.d;
    }

    @Override // defpackage.xa1
    public final void c(fq8 fq8Var) {
        fq8Var.getClass();
        this.a.c(fq8Var);
    }

    @Override // defpackage.xa1
    public final void close() throws CacheDataSink$CacheDataSinkException {
        kk0 kk0Var = this.b;
        try {
            this.a.close();
            if (this.c) {
                this.c = false;
                if (kk0Var.d == null) {
                    return;
                }
                try {
                    kk0Var.a();
                } catch (IOException e) {
                    throw new CacheDataSink$CacheDataSinkException(e);
                }
            }
        } catch (Throwable th) {
            if (this.c) {
                this.c = false;
                if (kk0Var.d != null) {
                    try {
                        kk0Var.a();
                    } catch (IOException e2) {
                        throw new CacheDataSink$CacheDataSinkException(e2);
                    }
                }
            }
            throw th;
        }
    }

    @Override // defpackage.xa1
    public final Map k() {
        return this.a.k();
    }

    @Override // defpackage.xa1
    public final Uri p() {
        return this.a.p();
    }

    @Override // defpackage.ra1
    public final int read(byte[] bArr, int i, int i2) throws CacheDataSink$CacheDataSinkException {
        if (this.d == 0) {
            return -1;
        }
        int i3 = this.a.read(bArr, i, i2);
        if (i3 > 0) {
            kk0 kk0Var = this.b;
            db1 db1Var = kk0Var.d;
            if (db1Var != null) {
                int i4 = 0;
                while (i4 < i3) {
                    try {
                        if (kk0Var.h == kk0Var.e) {
                            kk0Var.a();
                            kk0Var.b(db1Var);
                        }
                        int iMin = (int) Math.min(i3 - i4, kk0Var.e - kk0Var.h);
                        OutputStream outputStream = kk0Var.g;
                        String str = j29.a;
                        outputStream.write(bArr, i + i4, iMin);
                        i4 += iMin;
                        long j = iMin;
                        kk0Var.h += j;
                        kk0Var.i += j;
                    } catch (IOException e) {
                        throw new CacheDataSink$CacheDataSinkException(e);
                    }
                }
            }
            long j2 = this.d;
            if (j2 != -1) {
                this.d = j2 - ((long) i3);
            }
        }
        return i3;
    }
}
