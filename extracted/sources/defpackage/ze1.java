package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$DeltaUpdateException;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ze1 implements pa4 {
    public final Uri a;
    public final wv8 b = new wv8("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final xa1 c;
    public j03 d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public IOException j;
    public boolean k;
    public final /* synthetic */ af1 l;

    public ze1(af1 af1Var, Uri uri) {
        this.l = af1Var;
        this.a = uri;
        this.c = ((wa1) af1Var.a.b).k();
    }

    public static boolean a(ze1 ze1Var, long j) {
        ze1Var.h = SystemClock.elapsedRealtime() + j;
        Uri uri = ze1Var.a;
        af1 af1Var = ze1Var.l;
        if (!uri.equals(af1Var.k)) {
            return false;
        }
        List list = af1Var.j.e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            ze1 ze1Var2 = (ze1) af1Var.d.get(((m03) list.get(i)).a);
            ze1Var2.getClass();
            if (jElapsedRealtime > ze1Var2.h) {
                Uri uri2 = ze1Var2.a;
                af1Var.k = uri2;
                ze1Var2.g(af1Var.b(uri2));
                return false;
            }
        }
        return true;
    }

    public final Uri b() {
        j03 j03Var = this.d;
        Uri uri = this.a;
        if (j03Var != null) {
            i03 i03Var = j03Var.v;
            if (i03Var.a != -9223372036854775807L || i03Var.e) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                j03 j03Var2 = this.d;
                if (j03Var2.v.e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(j03Var2.k + ((long) j03Var2.r.size())));
                    j03 j03Var3 = this.d;
                    if (j03Var3.n != -9223372036854775807L) {
                        ImmutableList immutableList = j03Var3.s;
                        int size = immutableList.size();
                        if (!immutableList.isEmpty() && ((e03) tv8.q(immutableList)).m) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                i03 i03Var2 = this.d.v;
                if (i03Var2.a != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", i03Var2.b ? "v2" : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    @Override // defpackage.pa4
    public final void c(ra4 ra4Var, long j, long j2, boolean z) {
        m26 m26Var = (m26) ra4Var;
        long j3 = m26Var.a;
        da4 da4Var = new da4(m26Var.b, m26Var.d.c, j2);
        af1 af1Var = this.l;
        af1Var.c.getClass();
        af1Var.f.n(da4Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.pa4
    public final void d(ra4 ra4Var, long j, long j2) {
        m26 m26Var = (m26) ra4Var;
        o03 o03Var = (o03) m26Var.f;
        da4 da4Var = new da4(m26Var.b, m26Var.d.c, j2);
        if (o03Var instanceof j03) {
            h((j03) o03Var, da4Var);
            this.l.f.o(da4Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            ParserException parserExceptionB = ParserException.b("Loaded playlist has unexpected type.");
            this.j = parserExceptionB;
            this.l.f.p(da4Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, parserExceptionB, true);
        }
        this.l.c.getClass();
    }

    public final void e(boolean z) {
        g(z ? b() : this.a);
    }

    public final void f(Uri uri) {
        af1 af1Var = this.l;
        l26 l26VarF = af1Var.b.f(af1Var.j, this.d);
        Map map = Collections.EMPTY_MAP;
        vy2.u(uri, "The uri must be set.");
        m26 m26Var = new m26(this.c, new db1(uri, 0L, 1, null, map, 0L, -1L, null, 1), l26VarF);
        this.b.S(m26Var, this, af1Var.c.z(m26Var.c));
    }

    public final void g(Uri uri) {
        this.h = 0L;
        if (this.i) {
            return;
        }
        wv8 wv8Var = this.b;
        if (wv8Var.E() || ((IOException) wv8Var.d) != null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.g;
        if (jElapsedRealtime >= j) {
            f(uri);
        } else {
            this.i = true;
            this.l.h.postDelayed(new g7(this, uri, 13), j - jElapsedRealtime);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(defpackage.j03 r73, defpackage.da4 r74) {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ze1.h(j03, da4):void");
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
        this.l.f.r(da4Var, m26Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.pa4
    public final ca4 u(ra4 ra4Var, long j, long j2, IOException iOException, int i) {
        ca4 ca4Var = wv8.i;
        m26 m26Var = (m26) ra4Var;
        long j3 = m26Var.a;
        int i2 = m26Var.c;
        db1 db1Var = m26Var.b;
        Uri uri = m26Var.d.c;
        da4 da4Var = new da4(db1Var, uri, j2);
        boolean z = uri.getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof HlsPlaylistParser$DeltaUpdateException;
        af1 af1Var = this.l;
        if (z || z2) {
            int i3 = iOException instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException).e : Integer.MAX_VALUE;
            if (z2 || i3 == 400 || i3 == 503) {
                this.g = SystemClock.elapsedRealtime();
                e(false);
                pg pgVar = af1Var.f;
                String str = j29.a;
                pgVar.p(da4Var, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, true);
                return ca4Var;
            }
        }
        dc0 dc0Var = new dc0(i, 5, iOException);
        Iterator it = af1Var.e.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((r03) it.next()).c(this.a, dc0Var, false);
        }
        fv fvVar = af1Var.c;
        if (z3) {
            fvVar.getClass();
            long jA = fv.A(dc0Var);
            ca4Var = jA != -9223372036854775807L ? new ca4(0, jA, false) : wv8.j;
        }
        int i4 = ca4Var.a;
        boolean z4 = i4 == 0 || i4 == 1;
        af1Var.f.p(da4Var, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, !z4);
        if (!z4) {
            fvVar.getClass();
        }
        return ca4Var;
    }
}
