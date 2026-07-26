package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.common.b;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ix7 implements zp4, pa4 {
    public final db1 a;
    public final wa1 b;
    public final fq8 c;
    public final fv d;
    public final pg e;
    public final zo8 f;
    public final ArrayList g = new ArrayList();
    public final long h;
    public final wv8 i;
    public final b j;
    public final boolean k;
    public boolean l;
    public byte[] m;
    public int n;

    public ix7(db1 db1Var, wa1 wa1Var, fq8 fq8Var, b bVar, long j, fv fvVar, pg pgVar, boolean z, k37 k37Var) {
        this.a = db1Var;
        this.b = wa1Var;
        this.c = fq8Var;
        this.j = bVar;
        this.h = j;
        this.d = fvVar;
        this.e = pgVar;
        this.k = z;
        this.f = new zo8(new yo8("", bVar));
        this.i = k37Var != null ? new wv8(3, k37Var) : new wv8("SingleSampleMediaPeriod");
    }

    @Override // defpackage.ko7
    public final boolean a() {
        return this.i.E();
    }

    @Override // defpackage.pa4
    public final void c(ra4 ra4Var, long j, long j2, boolean z) {
        hx7 hx7Var = (hx7) ra4Var;
        da4 da4Var = new da4(hx7Var.a, hx7Var.b.c, j2);
        this.d.getClass();
        this.e.n(da4Var, 1, -1, null, 0, null, 0L, this.h);
    }

    @Override // defpackage.pa4
    public final void d(ra4 ra4Var, long j, long j2) {
        hx7 hx7Var = (hx7) ra4Var;
        this.n = (int) hx7Var.b.b;
        byte[] bArr = hx7Var.c;
        bArr.getClass();
        this.m = bArr;
        this.l = true;
        da4 da4Var = new da4(hx7Var.a, hx7Var.b.c, j2);
        this.d.getClass();
        this.e.o(da4Var, 1, -1, this.j, 0, null, 0L, this.h);
    }

    @Override // defpackage.zp4
    public final long e(p62[] p62VarArr, boolean[] zArr, pc7[] pc7VarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < p62VarArr.length; i++) {
            pc7 pc7Var = pc7VarArr[i];
            ArrayList arrayList = this.g;
            if (pc7Var != null && (p62VarArr[i] == null || !zArr[i])) {
                arrayList.remove(pc7Var);
                pc7VarArr[i] = null;
            }
            if (pc7VarArr[i] == null && p62VarArr[i] != null) {
                gx7 gx7Var = new gx7(this);
                arrayList.add(gx7Var);
                pc7VarArr[i] = gx7Var;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // defpackage.ko7
    public final long f() {
        return (this.l || this.i.E()) ? Long.MIN_VALUE : 0L;
    }

    @Override // defpackage.zp4
    public final long i(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                return j;
            }
            gx7 gx7Var = (gx7) arrayList.get(i);
            if (gx7Var.a == 2) {
                gx7Var.a = 1;
            }
            i++;
        }
    }

    @Override // defpackage.pa4
    public final void j(ra4 ra4Var, long j, long j2, int i) {
        hx7 hx7Var = (hx7) ra4Var;
        w58 w58Var = hx7Var.b;
        db1 db1Var = hx7Var.a;
        this.e.r(i == 0 ? new da4(db1Var) : new da4(db1Var, w58Var.c, j2), 1, -1, this.j, 0, null, 0L, this.h, i);
    }

    @Override // defpackage.zp4
    public final long k() {
        return -9223372036854775807L;
    }

    @Override // defpackage.zp4
    public final void m(yp4 yp4Var, long j) {
        yp4Var.d(this);
    }

    @Override // defpackage.zp4
    public final zo8 n() {
        return this.f;
    }

    @Override // defpackage.ko7
    public final boolean p(bb4 bb4Var) {
        if (this.l) {
            return false;
        }
        wv8 wv8Var = this.i;
        if (wv8Var.E() || ((IOException) wv8Var.d) != null) {
            return false;
        }
        xa1 xa1VarK = this.b.k();
        fq8 fq8Var = this.c;
        if (fq8Var != null) {
            xa1VarK.c(fq8Var);
        }
        hx7 hx7Var = new hx7(xa1VarK, this.a);
        this.d.getClass();
        wv8Var.S(hx7Var, this, 3);
        return true;
    }

    @Override // defpackage.ko7
    public final long q() {
        return this.l ? Long.MIN_VALUE : 0L;
    }

    @Override // defpackage.pa4
    public final ca4 u(ra4 ra4Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        ca4 ca4Var;
        hx7 hx7Var = (hx7) ra4Var;
        da4 da4Var = new da4(hx7Var.a, hx7Var.b.c, j2);
        String str = j29.a;
        this.d.getClass();
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader$UnexpectedLoaderException)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i2 = DataSourceException.b;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        boolean z = jMin == -9223372036854775807L || i >= 3;
        if (this.k && z) {
            wn5.l0("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.l = true;
            ca4Var = wv8.i;
        } else {
            ca4Var = jMin != -9223372036854775807L ? new ca4(0, jMin, false) : wv8.j;
        }
        int i3 = ca4Var.a;
        this.e.p(da4Var, 1, -1, this.j, 0, null, 0L, this.h, iOException, !(i3 == 0 || i3 == 1));
        return ca4Var;
    }

    @Override // defpackage.zp4
    public final void h() {
    }

    @Override // defpackage.ko7
    public final void v(long j) {
    }

    @Override // defpackage.zp4
    public final long g(long j, ll7 ll7Var) {
        return j;
    }

    @Override // defpackage.zp4
    public final void s(long j, boolean z) {
    }
}
