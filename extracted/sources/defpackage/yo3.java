package defpackage;

import android.content.Context;
import ir.myket.callback.manager.a;

/* JADX INFO: loaded from: classes3.dex */
public final class yo3 extends ep7 {
    public p09 l;
    public final Object m;

    public yo3(Context context) {
        super(context);
        this.m = bt2.D(a.class);
    }

    @Override // defpackage.ep7
    public final boolean g() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [c24, java.lang.Object] */
    @Override // defpackage.ep7
    public final void h() {
        p09 p09Var = this.l;
        p09Var.a.r(new f09(1, p09Var), new y45(1), p09Var);
        ((a) this.m.getValue()).d();
        i(true);
    }
}
