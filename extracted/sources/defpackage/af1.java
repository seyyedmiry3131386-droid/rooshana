package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.common.b;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class af1 implements pa4 {
    public static final gd1 o = new gd1(6);
    public final pt2 a;
    public final q03 b;
    public final fv c;
    public pg f;
    public wv8 g;
    public Handler h;
    public k03 i;
    public n03 j;
    public Uri k;
    public j03 l;
    public boolean m;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long n = -9223372036854775807L;

    public af1(pt2 pt2Var, fv fvVar, q03 q03Var) {
        this.a = pt2Var;
        this.b = q03Var;
        this.c = fvVar;
    }

    public final j03 a(boolean z, Uri uri) {
        HashMap map = this.d;
        j03 j03Var = ((ze1) map.get(uri)).d;
        if (j03Var != null && z) {
            if (!uri.equals(this.k)) {
                List list = this.j.e;
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    if (uri.equals(((m03) list.get(i)).a)) {
                        j03 j03Var2 = this.l;
                        if (j03Var2 == null || !j03Var2.o) {
                            this.k = uri;
                            ze1 ze1Var = (ze1) map.get(uri);
                            j03 j03Var3 = ze1Var.d;
                            if (j03Var3 == null || !j03Var3.o) {
                                ze1Var.g(b(uri));
                            } else {
                                this.l = j03Var3;
                                this.i.u(j03Var3);
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
            ze1 ze1Var2 = (ze1) map.get(uri);
            j03 j03Var4 = ze1Var2.d;
            if (!ze1Var2.k) {
                ze1Var2.k = true;
                if (j03Var4 != null && !j03Var4.o) {
                    ze1Var2.e(true);
                }
            }
        }
        return j03Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Uri b(Uri uri) {
        f03 f03Var;
        j03 j03Var = this.l;
        if (j03Var == null || !j03Var.v.e || (f03Var = (f03) j03Var.t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(f03Var.b));
        int i = f03Var.c;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    @Override // defpackage.pa4
    public final void c(ra4 ra4Var, long j, long j2, boolean z) {
        m26 m26Var = (m26) ra4Var;
        long j3 = m26Var.a;
        da4 da4Var = new da4(m26Var.b, m26Var.d.c, j2);
        this.c.getClass();
        this.f.n(da4Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.pa4
    public final void d(ra4 ra4Var, long j, long j2) {
        n03 n03Var;
        m26 m26Var = (m26) ra4Var;
        o03 o03Var = (o03) m26Var.f;
        boolean z = o03Var instanceof j03;
        if (z) {
            String str = o03Var.a;
            n03 n03Var2 = n03.l;
            Uri uri = Uri.parse(str);
            rj2 rj2Var = new rj2();
            rj2Var.a = "0";
            rj2Var.l = tv4.m("application/x-mpegURL");
            List listSingletonList = Collections.singletonList(new m03(uri, new b(rj2Var), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            n03Var = new n03("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            n03Var = (n03) o03Var;
        }
        this.j = n03Var;
        this.k = ((m03) n03Var.e.get(0)).a;
        this.e.add(new ye1(this));
        List list2 = n03Var.d;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Uri uri2 = (Uri) list2.get(i);
            this.d.put(uri2, new ze1(this, uri2));
        }
        da4 da4Var = new da4(m26Var.b, m26Var.d.c, j2);
        ze1 ze1Var = (ze1) this.d.get(this.k);
        if (z) {
            ze1Var.h((j03) o03Var, da4Var);
        } else {
            ze1Var.e(false);
        }
        this.c.getClass();
        this.f.o(da4Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final boolean e(Uri uri) {
        int i;
        ze1 ze1Var = (ze1) this.d.get(uri);
        if (ze1Var.d == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, j29.k0(ze1Var.d.u));
        j03 j03Var = ze1Var.d;
        return j03Var.o || (i = j03Var.d) == 2 || i == 1 || ze1Var.e + jMax > jElapsedRealtime;
    }

    @Override // defpackage.pa4
    public final void j(ra4 ra4Var, long j, long j2, int i) {
        da4 da4Var;
        m26 m26Var = (m26) ra4Var;
        if (i == 0) {
            long j3 = m26Var.a;
            da4Var = new da4(m26Var.b);
        } else {
            long j4 = m26Var.a;
            da4Var = new da4(m26Var.b, m26Var.d.c, j2);
        }
        this.f.r(da4Var, m26Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.pa4
    public final ca4 u(ra4 ra4Var, long j, long j2, IOException iOException, int i) {
        long jMin;
        m26 m26Var = (m26) ra4Var;
        long j3 = m26Var.a;
        da4 da4Var = new da4(m26Var.b, m26Var.d.c, j2);
        int i2 = m26Var.c;
        this.c.getClass();
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader$UnexpectedLoaderException)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i3 = DataSourceException.b;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i - 1) * 1000, 5000);
        boolean z = jMin == -9223372036854775807L;
        this.f.p(da4Var, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        return z ? wv8.j : new ca4(0, jMin, false);
    }
}
