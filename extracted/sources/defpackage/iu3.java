package defpackage;

import kotlinx.coroutines.c;

/* JADX INFO: loaded from: classes3.dex */
public final class iu3 extends eu3 {
    public final /* synthetic */ int e;
    public final jm7 f;
    public final /* synthetic */ c g;

    public /* synthetic */ iu3(c cVar, jm7 jm7Var, int i) {
        this.e = i;
        this.g = cVar;
        this.f = jm7Var;
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
                c cVar = this.g;
                cVar.getClass();
                Object objN0 = c.a.get(cVar);
                if (!(objN0 instanceof rx0)) {
                    objN0 = at2.n0(objN0);
                }
                this.f.b(cVar, objN0);
                break;
            default:
                this.f.b(this.g, tx8.a);
                break;
        }
    }
}
