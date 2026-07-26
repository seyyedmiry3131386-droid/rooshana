package defpackage;

import android.net.Uri;
import androidx.media3.common.b;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class jx7 extends x70 {
    public final db1 h;
    public final wa1 i;
    public final b j;
    public final fv l;
    public final ex7 n;
    public final jp4 o;
    public fq8 p;
    public final long k = -9223372036854775807L;
    public final boolean m = true;

    public jx7(ip4 ip4Var, wa1 wa1Var, fv fvVar) {
        fp4 fp4Var;
        this.i = wa1Var;
        this.l = fvVar;
        boolean z = true;
        yo4 yo4Var = new yo4();
        bp4 bp4Var = new bp4();
        List list = Collections.EMPTY_LIST;
        ImmutableList.q();
        dp4 dp4Var = new dp4();
        gp4 gp4Var = gp4.d;
        Uri uri = Uri.EMPTY;
        String string = ip4Var.a.toString();
        string.getClass();
        ImmutableList immutableListN = ImmutableList.n(ImmutableList.s(ip4Var));
        if (((Uri) bp4Var.e) != null && ((UUID) bp4Var.d) == null) {
            z = false;
        }
        vy2.s(z);
        if (uri != null) {
            fp4Var = new fp4(uri, null, ((UUID) bp4Var.d) != null ? new cp4(bp4Var) : null, null, list, null, immutableListN, -9223372036854775807L);
        } else {
            fp4Var = null;
        }
        jp4 jp4Var = new jp4(string, new ap4(yo4Var), fp4Var, new ep4(dp4Var), qp4.K, gp4Var);
        this.o = jp4Var;
        rj2 rj2Var = new rj2();
        rj2Var.m = tv4.m((String) gu9.p(ip4Var.b, "text/x-unknown"));
        rj2Var.d = ip4Var.c;
        rj2Var.e = ip4Var.d;
        rj2Var.f = ip4Var.e;
        rj2Var.b = ip4Var.f;
        String str = ip4Var.g;
        rj2Var.a = str != null ? str : null;
        this.j = new b(rj2Var);
        Map map = Collections.EMPTY_MAP;
        Uri uri2 = ip4Var.a;
        vy2.u(uri2, "The uri must be set.");
        this.h = new db1(uri2, 0L, 1, null, map, 0L, -1L, null, 1);
        this.n = new ex7(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0L, 0L, true, false, false, null, jp4Var, null);
    }

    @Override // defpackage.x70
    public final zp4 b(ks4 ks4Var, qc1 qc1Var, long j) {
        return new ix7(this.h, this.i, this.p, this.j, this.k, this.l, new pg((CopyOnWriteArrayList) this.c.d, 0, ks4Var), this.m, null);
    }

    @Override // defpackage.x70
    public final jp4 h() {
        return this.o;
    }

    @Override // defpackage.x70
    public final void l(fq8 fq8Var) {
        this.p = fq8Var;
        m(this.n);
    }

    @Override // defpackage.x70
    public final void n(zp4 zp4Var) {
        ((ix7) zp4Var).i.K(null);
    }

    @Override // defpackage.x70
    public final void j() {
    }

    @Override // defpackage.x70
    public final void p() {
    }
}
