package defpackage;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class id7 implements fd7, qd7 {
    public final /* synthetic */ gd7 a;
    public i64 b;
    public rn6 c;

    public id7(gd7 gd7Var) {
        this.a = gd7Var;
        Object objE = gd7Var.e("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objE instanceof Bundle ? (Bundle) objE : null;
        if (bundle != null && this.c == null) {
            rn6 rn6Var = new rn6(new bp4(this, new o06(17, this)));
            this.c = rn6Var;
            rn6Var.v(bundle);
        }
        gd7Var.a("androidx.savedstate.SavedStateRegistry", new o06(15, this));
    }

    @Override // defpackage.g64
    public final i64 D() {
        i64 i64Var = this.b;
        if (i64Var != null) {
            return i64Var;
        }
        i64 i64Var2 = new i64(this, false);
        this.b = i64Var2;
        return i64Var2;
    }

    @Override // defpackage.fd7
    public final ed7 a(String str, bp2 bp2Var) {
        return this.a.a(str, bp2Var);
    }

    @Override // defpackage.fd7
    public final boolean b(Object obj) {
        return this.a.b(obj);
    }

    @Override // defpackage.fd7
    public final Map d() {
        return this.a.d();
    }

    @Override // defpackage.fd7
    public final Object e(String str) {
        return this.a.e(str);
    }

    @Override // defpackage.qd7
    public final bn6 o() {
        rn6 rn6Var = this.c;
        if (rn6Var == null) {
            rn6 rn6Var2 = new rn6(new bp4(this, new o06(17, this)));
            this.c = rn6Var2;
            rn6Var2.v(null);
            rn6Var = rn6Var2;
        }
        return (bn6) rn6Var.c;
    }
}
