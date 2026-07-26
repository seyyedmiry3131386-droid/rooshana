package defpackage;

import android.os.Bundle;
import androidx.fragment.app.d;

/* JADX INFO: loaded from: classes.dex */
public final class nk2 extends rk2 {
    public final /* synthetic */ d a;

    public nk2(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.rk2
    public final void a() {
        d dVar = this.a;
        dVar.Y.u();
        rq4.u(dVar);
        Bundle bundle = dVar.b;
        dVar.Y.v(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
