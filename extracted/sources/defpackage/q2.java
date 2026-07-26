package defpackage;

import kotlin.b;

/* JADX INFO: loaded from: classes3.dex */
public final class q2 implements gb8, il0 {
    public final /* synthetic */ om0 a;

    public /* synthetic */ q2(om0 om0Var) {
        this.a = om0Var;
    }

    @Override // defpackage.il0
    public void e(dl0 dl0Var, h77 h77Var) {
        this.a.resumeWith(h77Var);
    }

    @Override // defpackage.il0
    public void o(dl0 dl0Var, Throwable th) {
        this.a.resumeWith(b.a(th));
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        this.a.resumeWith(new l99(obj));
    }
}
