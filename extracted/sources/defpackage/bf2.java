package defpackage;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: loaded from: classes3.dex */
public final class bf2 extends mf7 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf2(w61 w61Var, g51 g51Var, int i) {
        super(g51Var, w61Var);
        this.e = i;
    }

    @Override // kotlinx.coroutines.c
    public final boolean z(Throwable th) {
        switch (this.e) {
            case 0:
                if (th instanceof ChildCancelledException) {
                    return true;
                }
                return t(th);
            default:
                return false;
        }
    }
}
