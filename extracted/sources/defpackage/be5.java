package defpackage;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class be5 extends t0 {
    public final /* synthetic */ String f;
    public final /* synthetic */ int g;
    public final /* synthetic */ long h;
    public final /* synthetic */ de5 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be5(de5 de5Var, String str, int i, long j) {
        super(2);
        this.i = de5Var;
        this.f = str;
        this.g = i;
        this.h = j;
    }

    @Override // defpackage.t0
    public final void o(t0 t0Var, Object[] objArr) {
        String str = this.f;
        if (TextUtils.isEmpty(str)) {
            t0Var.D(new ce5(258, "", ""));
            return;
        }
        de5 de5Var = this.i;
        ApplicationInfo applicationInfoL = de5Var.o.l(str);
        if (applicationInfoL == null) {
            t0Var.D(new ce5(258, "", ""));
            return;
        }
        if (applicationInfoL.uid != this.g) {
            t0Var.D(new ce5(259, "", ""));
            return;
        }
        t15 t15Var = new t15(1, t0Var);
        pa2 pa2Var = new pa2(this, t0Var, t15Var, false, 24);
        lw.d(null, null, str);
        lw.d(null, null, de5Var.n.a());
        de5Var.p.i(this.f, de5Var.n.a(), this.h, pa2Var, t15Var);
    }
}
