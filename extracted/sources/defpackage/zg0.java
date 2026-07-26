package defpackage;

import kotlin.b;

/* JADX INFO: loaded from: classes.dex */
public final class zg0 extends e40 {
    public om0 a;
    public dp2 b;

    @Override // defpackage.e40
    public final void a() {
        this.b = null;
        this.a = null;
    }

    @Override // defpackage.e40
    public final void b(Throwable th) {
        om0 om0Var = this.a;
        if (om0Var != null) {
            om0Var.resumeWith(b.a(th));
        }
    }
}
