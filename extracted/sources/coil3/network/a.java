package coil3.network;

import android.content.Context;
import defpackage.c24;
import defpackage.dp2;
import defpackage.h09;
import defpackage.hk3;
import defpackage.hy2;
import defpackage.js3;
import defpackage.js5;
import defpackage.ob4;
import defpackage.rn6;
import defpackage.ua2;
import defpackage.uv5;
import defpackage.va2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ua2 {
    public final c24 a;
    public final c24 b;
    public final rn6 c;

    public a(js5 js5Var) {
        ob4 ob4Var = new ob4(29);
        NetworkFetcher$Factory$2 networkFetcher$Factory$2 = NetworkFetcher$Factory$2.a;
        this.a = kotlin.a.a(js5Var);
        this.b = kotlin.a.a(ob4Var);
        rn6 rn6Var = new rn6(6, false);
        rn6Var.b = networkFetcher$Factory$2;
        rn6Var.c = hy2.u;
        this.c = rn6Var;
    }

    @Override // defpackage.ua2
    public final va2 a(Object obj, uv5 uv5Var, coil3.a aVar) {
        h09 h09Var = (h09) obj;
        if (!js3.i(h09Var.c, "http") && !js3.i(h09Var.c, "https")) {
            return null;
        }
        String str = h09Var.a;
        c24 c24Var = this.a;
        c24 c24VarA = kotlin.a.a(new hk3(23, aVar));
        c24 c24Var2 = this.b;
        rn6 rn6Var = this.c;
        Context context = uv5Var.a;
        Object obj2 = rn6Var.c;
        hy2 hy2Var = hy2.u;
        if (obj2 == hy2Var) {
            synchronized (rn6Var) {
                obj2 = rn6Var.c;
                if (obj2 == hy2Var) {
                    dp2 dp2Var = (dp2) rn6Var.b;
                    js3.m(dp2Var);
                    Object objInvoke = dp2Var.invoke(context);
                    rn6Var.c = objInvoke;
                    rn6Var.b = null;
                    obj2 = objInvoke;
                }
            }
        }
        return new b(str, uv5Var, c24Var, c24VarA, c24Var2, (ConnectivityChecker) obj2);
    }
}
