package defpackage;

import android.os.Looper;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class po4 implements ro4, wq4 {
    public final /* synthetic */ cb6 a;

    public /* synthetic */ po4(cb6 cb6Var) {
        this.a = cb6Var;
    }

    @Override // defpackage.ro4
    public void a(go4 go4Var) {
        boolean z;
        boolean z2;
        gn4 gn4Var = go4Var.a;
        if (go4Var.E()) {
            cb6 cb6Var = go4Var.x;
            cb6 cb6Var2 = this.a;
            if (Objects.equals(cb6Var, cb6Var2)) {
                return;
            }
            go4Var.x = cb6Var2;
            cb6 cb6Var3 = go4Var.y;
            cb6 cb6VarN0 = go4.n0(go4Var.w, cb6Var2);
            go4Var.y = cb6VarN0;
            if (cb6VarN0.equals(cb6Var3)) {
                z = false;
                z2 = false;
            } else {
                ImmutableList immutableList = go4Var.t;
                ImmutableList immutableList2 = go4Var.u;
                ImmutableList immutableListF0 = go4.F0(go4Var.y, go4Var.v, go4Var.I, go4Var.s, go4Var.r);
                go4Var.t = immutableListF0;
                go4Var.u = go4.E0(go4Var.y, go4Var.v, go4Var.I, immutableListF0, go4Var.r);
                z = !go4Var.t.equals(immutableList);
                z2 = !go4Var.u.equals(immutableList2);
                go4Var.i.f(13, new sn4(go4Var, 13));
            }
            if (z2) {
                gn4Var.getClass();
                vy2.s(Looper.myLooper() == gn4Var.e.getLooper());
                gn4Var.d.getClass();
            }
            if (z) {
                gn4Var.getClass();
                vy2.s(Looper.myLooper() == gn4Var.e.getLooper());
                gn4Var.d.u();
            }
        }
    }

    @Override // defpackage.wq4
    public void d(gq4 gq4Var, int i) {
        gq4Var.e(i, this.a);
    }
}
