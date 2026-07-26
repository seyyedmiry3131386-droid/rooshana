package defpackage;

import androidx.media3.datasource.cache.Cache$CacheException;
import io.sentry.config.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class kk0 {
    public final dk0 a;
    public final long b;
    public final int c;
    public db1 d;
    public long e;
    public File f;
    public OutputStream g;
    public long h;
    public long i;
    public n87 j;

    public kk0(dk0 dk0Var) {
        dk0Var.getClass();
        this.a = dk0Var;
        this.b = 5242880L;
        this.c = 20480;
    }

    public final void a() {
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            j29.g(this.g);
            this.g = null;
            File file = this.f;
            this.f = null;
            dk0 dk0Var = this.a;
            long j = this.h;
            hw7 hw7Var = (hw7) dk0Var;
            synchronized (hw7Var) {
                boolean z = true;
                vy2.s(!hw7Var.i);
                if (file.exists()) {
                    if (j == 0) {
                        file.delete();
                        return;
                    }
                    iw7 iw7VarB = iw7.b(file, j, -9223372036854775807L, hw7Var.c);
                    iw7VarB.getClass();
                    vk0 vk0VarL = hw7Var.c.l(iw7VarB.a);
                    vk0VarL.getClass();
                    vy2.s(vk0VarL.a(iw7VarB.b, iw7VarB.c));
                    long jO = o40.o(vk0VarL.e);
                    if (jO != -1) {
                        if (iw7VarB.b + iw7VarB.c > jO) {
                            z = false;
                        }
                        vy2.s(z);
                    }
                    if (hw7Var.d == null) {
                        hw7Var.b(iw7VarB);
                        hw7Var.c.x();
                        hw7Var.notifyAll();
                        return;
                    }
                    try {
                        hw7Var.d.D(iw7VarB.c, iw7VarB.f, file.getName());
                        hw7Var.b(iw7VarB);
                        try {
                            hw7Var.c.x();
                            hw7Var.notifyAll();
                            return;
                        } catch (IOException e) {
                            throw new Cache$CacheException(e);
                        }
                    } catch (IOException e2) {
                        throw new Cache$CacheException(e2);
                    }
                }
            }
        } catch (Throwable th) {
            j29.g(this.g);
            this.g = null;
            File file2 = this.f;
            this.f = null;
            file2.delete();
            throw th;
        }
    }

    public final void b(db1 db1Var) {
        File fileC;
        long j = db1Var.g;
        long jMin = j == -1 ? -1L : Math.min(j - this.i, this.e);
        dk0 dk0Var = this.a;
        String str = db1Var.h;
        String str2 = j29.a;
        long j2 = db1Var.f + this.i;
        hw7 hw7Var = (hw7) dk0Var;
        synchronized (hw7Var) {
            try {
                vy2.s(!hw7Var.i);
                hw7Var.d();
                vk0 vk0VarL = hw7Var.c.l(str);
                vk0VarL.getClass();
                vy2.s(vk0VarL.a(j2, jMin));
                if (!hw7Var.a.exists()) {
                    hw7.e(hw7Var.a);
                    hw7Var.l();
                }
                m44 m44Var = hw7Var.b;
                if (jMin != -1) {
                    m44Var.a(hw7Var, jMin);
                } else {
                    m44Var.getClass();
                }
                File file = new File(hw7Var.a, Integer.toString(hw7Var.f.nextInt(10)));
                if (!file.exists()) {
                    hw7.e(file);
                }
                fileC = iw7.c(file, vk0VarL.a, j2, System.currentTimeMillis());
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f = fileC;
        File file2 = this.f;
        FileOutputStream fileOutputStreamK = a.k(new FileOutputStream(file2), file2);
        if (this.c > 0) {
            n87 n87Var = this.j;
            if (n87Var == null) {
                this.j = new n87(fileOutputStreamK, this.c);
            } else {
                n87Var.b(fileOutputStreamK);
            }
            this.g = this.j;
        } else {
            this.g = fileOutputStreamK;
        }
        this.h = 0L;
    }
}
