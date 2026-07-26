package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class xo4 {
    public String a;
    public Uri b;
    public String c;
    public yo4 d;
    public bp4 e;
    public List f;
    public String g;
    public ImmutableList h;
    public wo4 i;
    public long j;
    public qp4 k;
    public dp4 l;
    public gp4 m;

    public final jp4 a() {
        fp4 fp4Var;
        bp4 bp4Var = this.e;
        vy2.s(((Uri) bp4Var.e) == null || ((UUID) bp4Var.d) != null);
        Uri uri = this.b;
        if (uri != null) {
            String str = this.c;
            bp4 bp4Var2 = this.e;
            fp4Var = new fp4(uri, str, ((UUID) bp4Var2.d) != null ? new cp4(bp4Var2) : null, this.i, this.f, this.g, this.h, this.j);
        } else {
            fp4Var = null;
        }
        String str2 = this.a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        yo4 yo4Var = this.d;
        yo4Var.getClass();
        ap4 ap4Var = new ap4(yo4Var);
        dp4 dp4Var = this.l;
        dp4Var.getClass();
        ep4 ep4Var = new ep4(dp4Var);
        qp4 qp4Var = this.k;
        if (qp4Var == null) {
            qp4Var = qp4.K;
        }
        return new jp4(str3, ap4Var, fp4Var, ep4Var, qp4Var, this.m);
    }
}
