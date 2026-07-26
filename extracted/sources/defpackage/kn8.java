package defpackage;

import ir.myket.persistent.datasource.a;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class kn8 implements g10 {
    public final j10 b;
    public final w27 c;

    public kn8(j10 j10Var, w27 w27Var) {
        this.b = j10Var;
        this.c = w27Var;
    }

    @Override // defpackage.g10
    public final w47 a(ta7 ta7Var, g77 g77Var) {
        w47 w47Var;
        w47 w47Var2 = g77Var.a;
        se3 se3Var = w47Var2.a;
        Regex regex = te3.a;
        js3.p(se3Var, "<this>");
        if (!te3.a.f(se3Var.d)) {
            return w47Var2;
        }
        synchronized (this) {
            try {
                if (g77Var.d == 401) {
                    this.c.a();
                }
                rb4 rb4VarB = w47Var2.b();
                a aVar = this.b.a;
                String str = (String) aVar.b.a(aVar, a.n[0]);
                if (str == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    rb4VarB.B("Authorization", str);
                }
                w47Var = new w47(rb4VarB);
            } catch (Throwable th) {
                throw th;
            }
        }
        return w47Var;
    }
}
