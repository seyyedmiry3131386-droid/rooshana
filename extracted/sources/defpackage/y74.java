package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y74 extends sq8 {
    public final /* synthetic */ c84 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y74(c84 c84Var, c84 c84Var2) {
        super(c84Var);
        this.b = c84Var2;
    }

    @Override // defpackage.rq8
    public final Object a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }

    @Override // defpackage.sq8, java.util.ListIterator
    public final void set(Object obj) {
        c84 c84Var = this.b;
        wn5.t(c84Var.c != null);
        c84Var.c.b = obj;
    }
}
