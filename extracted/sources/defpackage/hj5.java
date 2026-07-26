package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
@jl5("navigation")
public class hj5 extends kl5 {
    public final ll5 c;

    public hj5(ll5 ll5Var) {
        js3.p(ll5Var, "navigatorProvider");
        this.c = ll5Var;
    }

    @Override // defpackage.kl5
    public final wi5 a() {
        return new fj5(this);
    }

    @Override // defpackage.kl5
    public final void d(List list, lj5 lj5Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ei5 ei5Var = (ei5) it.next();
            wi5 wi5Var = ei5Var.b;
            js3.n(wi5Var, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            fj5 fj5Var = (fj5) wi5Var;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.a = ei5Var.h.a();
            jx9 jx9Var = fj5Var.g;
            int i = jx9Var.a;
            if (i == 0) {
                yb ybVar = fj5Var.b;
                String strValueOf = (String) ybVar.d;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(ybVar.a);
                }
                js3.p(strValueOf, "superName");
                if (((fj5) jx9Var.b).b.a == 0) {
                    strValueOf = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(strValueOf).toString());
            }
            wi5 wi5Var2 = (wi5) ((m28) jx9Var.c).c(i);
            if (wi5Var2 == null) {
                if (((String) jx9Var.d) == null) {
                    jx9Var.d = String.valueOf(jx9Var.a);
                }
                String str = (String) jx9Var.d;
                js3.m(str);
                throw new IllegalArgumentException(o40.y("navigation destination ", str, " is not a direct child of this NavGraph"));
            }
            this.c.b(wi5Var2.a).d(br9.B(b().b(wi5Var2, wi5Var2.a((Bundle) ref$ObjectRef.a))), lj5Var);
        }
    }
}
