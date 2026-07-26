package defpackage;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lk0 implements xa1 {
    public final dk0 a;
    public final xa1 b;
    public final jf8 c;
    public final xa1 d;
    public final en e;
    public final boolean f = false;
    public final boolean g;
    public final boolean h;
    public Uri i;
    public db1 j;
    public db1 k;
    public xa1 l;
    public long m;
    public long n;
    public long o;
    public iw7 p;
    public boolean q;
    public boolean r;
    public long s;

    public lk0(dk0 dk0Var, xa1 xa1Var, xa1 xa1Var2, kk0 kk0Var, en enVar, int i) {
        this.a = dk0Var;
        this.b = xa1Var2;
        this.e = enVar;
        this.g = (i & 2) != 0;
        this.h = false;
        if (xa1Var != null) {
            this.d = xa1Var;
            this.c = kk0Var != null ? new jf8(xa1Var, kk0Var) : null;
        } else {
            this.d = e96.a;
            this.c = null;
        }
    }

    @Override // defpackage.xa1
    public final long b(db1 db1Var) {
        String strG0;
        dk0 dk0Var = this.a;
        try {
            switch (this.e.a) {
                case 9:
                    js3.p(db1Var, "dataSpec");
                    strG0 = db1Var.h;
                    if (strG0 == null) {
                        String string = db1Var.a.toString();
                        js3.o(string, "toString(...)");
                        strG0 = f88.G0(string, "?");
                    }
                    break;
                default:
                    strG0 = db1Var.h;
                    if (strG0 == null) {
                        strG0 = db1Var.a.toString();
                    }
                    break;
            }
            cb1 cb1VarA = db1Var.a();
            long j = db1Var.f;
            long j2 = db1Var.g;
            cb1VarA.h = strG0;
            db1 db1VarA = cb1VarA.a();
            this.j = db1VarA;
            Uri uri = db1VarA.a;
            byte[] bArr = (byte[]) ((hw7) dk0Var).g(strG0).b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, StandardCharsets.UTF_8) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.i = uri;
            this.n = j;
            boolean z = (this.g && this.q) || (this.h && j2 == -1);
            this.r = z;
            if (z) {
                this.o = -1L;
            } else {
                long jO = o40.o(((hw7) dk0Var).g(strG0));
                this.o = jO;
                if (jO != -1) {
                    long j3 = jO - j;
                    this.o = j3;
                    if (j3 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            if (j2 != -1) {
                long j4 = this.o;
                this.o = j4 == -1 ? j2 : Math.min(j4, j2);
            }
            long j5 = this.o;
            if (j5 > 0 || j5 == -1) {
                o(db1VarA, false);
            }
            return j2 != -1 ? j2 : this.o;
        } catch (Throwable th) {
            if (this.l == this.b || (th instanceof Cache$CacheException)) {
                this.q = true;
            }
            throw th;
        }
    }

    @Override // defpackage.xa1
    public final void c(fq8 fq8Var) {
        fq8Var.getClass();
        this.b.c(fq8Var);
        this.d.c(fq8Var);
    }

    @Override // defpackage.xa1
    public final void close() {
        this.j = null;
        this.i = null;
        this.n = 0L;
        try {
            l();
        } catch (Throwable th) {
            if (this.l == this.b || (th instanceof Cache$CacheException)) {
                this.q = true;
            }
            throw th;
        }
    }

    @Override // defpackage.xa1
    public final Map k() {
        return !(this.l == this.b) ? this.d.k() : Collections.EMPTY_MAP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        dk0 dk0Var = this.a;
        xa1 xa1Var = this.l;
        if (xa1Var == null) {
            return;
        }
        try {
            xa1Var.close();
        } finally {
            this.k = null;
            this.l = null;
            iw7 iw7Var = this.p;
            if (iw7Var != null) {
                ((hw7) dk0Var).j(iw7Var);
                this.p = null;
            }
        }
    }

    public final void o(db1 db1Var, boolean z) throws InterruptedIOException {
        iw7 iw7VarM;
        long j;
        db1 db1VarA;
        xa1 xa1Var;
        String str = db1Var.h;
        String str2 = j29.a;
        if (this.r) {
            iw7VarM = null;
        } else if (this.f) {
            try {
                dk0 dk0Var = this.a;
                long j2 = this.n;
                long j3 = this.o;
                hw7 hw7Var = (hw7) dk0Var;
                synchronized (hw7Var) {
                    vy2.s(!hw7Var.i);
                    hw7Var.d();
                    while (true) {
                        iw7VarM = hw7Var.m(j2, j3, str);
                        if (iw7VarM != null) {
                            break;
                        } else {
                            hw7Var.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            iw7VarM = ((hw7) this.a).m(this.n, this.o, str);
        }
        if (iw7VarM == null) {
            xa1Var = this.d;
            cb1 cb1VarA = db1Var.a();
            cb1VarA.f = this.n;
            cb1VarA.g = this.o;
            db1VarA = cb1VarA.a();
            j = -1;
        } else if (iw7VarM.d) {
            Uri uriFromFile = Uri.fromFile(iw7VarM.e);
            long j4 = iw7VarM.b;
            long j5 = this.n - j4;
            long jMin = iw7VarM.c - j5;
            j = -1;
            long j6 = this.o;
            if (j6 != -1) {
                jMin = Math.min(jMin, j6);
            }
            cb1 cb1VarA2 = db1Var.a();
            cb1VarA2.a = uriFromFile;
            cb1VarA2.b = j4;
            cb1VarA2.f = j5;
            cb1VarA2.g = jMin;
            db1VarA = cb1VarA2.a();
            xa1Var = this.b;
        } else {
            j = -1;
            long jMin2 = iw7VarM.c;
            if (jMin2 == -1) {
                jMin2 = this.o;
            } else {
                long j7 = this.o;
                if (j7 != -1) {
                    jMin2 = Math.min(jMin2, j7);
                }
            }
            cb1 cb1VarA3 = db1Var.a();
            cb1VarA3.f = this.n;
            cb1VarA3.g = jMin2;
            db1VarA = cb1VarA3.a();
            xa1Var = this.c;
            if (xa1Var == null) {
                xa1Var = this.d;
                ((hw7) this.a).j(iw7VarM);
                iw7VarM = null;
            }
        }
        this.s = (this.r || xa1Var != this.d) ? Long.MAX_VALUE : this.n + 102400;
        if (z) {
            vy2.s(this.l == this.d);
            if (xa1Var == this.d) {
                return;
            }
            try {
                l();
            } catch (Throwable th) {
                if (!iw7VarM.d) {
                    ((hw7) this.a).j(iw7VarM);
                }
                throw th;
            }
        }
        if (iw7VarM != null && !iw7VarM.d) {
            this.p = iw7VarM;
        }
        this.l = xa1Var;
        this.k = db1VarA;
        this.m = 0L;
        long jB = xa1Var.b(db1VarA);
        k41 k41Var = new k41(0);
        if (db1VarA.g == j && jB != j) {
            this.o = jB;
            k41Var.a(Long.valueOf(this.n + jB), "exo_len");
        }
        if (!(this.l == this.b)) {
            Uri uriP = xa1Var.p();
            this.i = uriP;
            Uri uri = db1Var.a.equals(uriP) ? null : this.i;
            if (uri == null) {
                k41Var.a.add("exo_redir");
                k41Var.b.remove("exo_redir");
            } else {
                k41Var.a(uri.toString(), "exo_redir");
            }
        }
        if (this.l == this.c) {
            ((hw7) this.a).c(str, k41Var);
        }
    }

    @Override // defpackage.xa1
    public final Uri p() {
        return this.i;
    }

    @Override // defpackage.ra1
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        xa1 xa1Var = this.b;
        if (i2 == 0) {
            return 0;
        }
        if (this.o == 0) {
            return -1;
        }
        db1 db1Var = this.j;
        db1Var.getClass();
        db1 db1Var2 = this.k;
        db1Var2.getClass();
        try {
            if (this.n >= this.s) {
                o(db1Var, true);
            }
            xa1 xa1Var2 = this.l;
            xa1Var2.getClass();
            int i4 = xa1Var2.read(bArr, i, i2);
            if (i4 != -1) {
                long j2 = i4;
                this.n += j2;
                this.m += j2;
                long j3 = this.o;
                if (j3 == -1) {
                    return i4;
                }
                this.o = j3 - j2;
                return i4;
            }
            xa1 xa1Var3 = this.l;
            if (!(xa1Var3 == xa1Var)) {
                j = -1;
                long j4 = db1Var2.g;
                if (j4 != -1) {
                    i3 = i4;
                    if (this.m < j4) {
                    }
                } else {
                    i3 = i4;
                }
                String str = db1Var.h;
                String str2 = j29.a;
                this.o = 0L;
                if (!(xa1Var3 == this.c)) {
                    return i3;
                }
                k41 k41Var = new k41(0);
                k41Var.a(Long.valueOf(this.n), "exo_len");
                ((hw7) this.a).c(str, k41Var);
                return i3;
            }
            i3 = i4;
            j = -1;
            long j5 = this.o;
            if (j5 <= 0 && j5 != j) {
                return i3;
            }
            l();
            o(db1Var, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.l == xa1Var || (th instanceof Cache$CacheException)) {
                this.q = true;
            }
            throw th;
        }
    }
}
