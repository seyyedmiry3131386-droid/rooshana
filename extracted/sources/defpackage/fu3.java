package defpackage;

import kotlinx.coroutines.c;

/* JADX INFO: loaded from: classes3.dex */
public final class fu3 extends om0 {
    public final c i;

    public fu3(g51 g51Var, c cVar) {
        super(1, g51Var);
        this.i = cVar;
    }

    @Override // defpackage.om0
    public final String B() {
        return "AwaitContinuation";
    }

    @Override // defpackage.om0
    public final Throwable t(c cVar) {
        Throwable thC;
        c cVar2 = this.i;
        cVar2.getClass();
        Object obj = c.a.get(cVar2);
        return (!(obj instanceof hu3) || (thC = ((hu3) obj).c()) == null) ? obj instanceof rx0 ? ((rx0) obj).a : cVar.I() : thC;
    }
}
