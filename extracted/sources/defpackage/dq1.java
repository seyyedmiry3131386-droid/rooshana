package defpackage;

import kotlin.b;
import kotlinx.coroutines.c;

/* JADX INFO: loaded from: classes3.dex */
public final class dq1 extends eu3 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ dq1(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.eu3
    public final boolean k() {
        switch (this.e) {
        }
        return false;
    }

    @Override // defpackage.eu3
    public final void l(Throwable th) {
        switch (this.e) {
            case 0:
                ((bq1) this.f).a();
                break;
            case 1:
                ((dp2) this.f).invoke(th);
                break;
            default:
                fu3 fu3Var = (fu3) this.f;
                Object obj = c.a.get(j());
                if (!(obj instanceof rx0)) {
                    fu3Var.resumeWith(at2.n0(obj));
                } else {
                    fu3Var.resumeWith(b.a(((rx0) obj).a));
                }
                break;
        }
    }
}
