package defpackage;

import androidx.concurrent.futures.b;

/* JADX INFO: loaded from: classes.dex */
public final class ol0 extends h2 {
    public final /* synthetic */ pl0 h;

    public ol0(pl0 pl0Var) {
        this.h = pl0Var;
    }

    @Override // defpackage.h2
    public final String h() {
        b bVar = (b) this.h.a.get();
        if (bVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + bVar.a + "]";
    }
}
