package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class un0 implements bs8 {
    public final ql4 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final wt0 e;
    public final wt0 f;
    public final int g;

    public un0(Context context, wt0 wt0Var, wt0 wt0Var2) {
        gv3 gv3Var = new gv3();
        l10 l10Var = l10.a;
        gv3Var.a(ta0.class, l10Var);
        gv3Var.a(h20.class, l10Var);
        o10 o10Var = o10.a;
        gv3Var.a(kd4.class, o10Var);
        gv3Var.a(s20.class, o10Var);
        m10 m10Var = m10.a;
        gv3Var.a(kt0.class, m10Var);
        gv3Var.a(i20.class, m10Var);
        k10 k10Var = k10.a;
        gv3Var.a(xe.class, k10Var);
        gv3Var.a(f20.class, k10Var);
        n10 n10Var = n10.a;
        gv3Var.a(id4.class, n10Var);
        gv3Var.a(r20.class, n10Var);
        p10 p10Var = p10.a;
        gv3Var.a(om5.class, p10Var);
        gv3Var.a(u20.class, p10Var);
        gv3Var.d = true;
        this.a = new ql4(24, gv3Var);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(yj0.c);
        this.e = wt0Var2;
        this.f = wt0Var;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(dw1.n("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.l20 a(defpackage.l20 r7) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.un0.a(l20):l20");
    }
}
