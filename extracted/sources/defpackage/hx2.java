package defpackage;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class hx2 extends ep7 {
    public ix2 l;
    public dp3 m;
    public final kc7 n;

    public hx2(Context context) {
        super(context);
        this.n = new kc7(context, hc7.a, null, new eu2(new fz1(26), Looper.getMainLooper()));
    }

    @Override // defpackage.ep7
    public final boolean g() {
        return b() == 0 || (b() + 43200000) - System.currentTimeMillis() <= 0;
    }

    @Override // defpackage.ep7
    public final void h() {
        kc7 kc7Var = this.n;
        kc7Var.getClass();
        cf0 cf0VarB = cf0.b();
        cf0VarB.b = 4201;
        cf0VarB.d = new js8(kc7Var);
        kc7Var.f(0, cf0VarB.a()).g(new nm5(22, this));
    }
}
