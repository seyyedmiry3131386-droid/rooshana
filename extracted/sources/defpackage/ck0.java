package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ck0 extends gk2 {
    public final /* synthetic */ fk0 b;
    public final /* synthetic */ ai0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck0(fk0 fk0Var, ai0 ai0Var, by7 by7Var) {
        super(by7Var);
        this.b = fk0Var;
        this.c = ai0Var;
    }

    @Override // defpackage.gk2, defpackage.by7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        fk0 fk0Var = this.b;
        ai0 ai0Var = this.c;
        synchronized (fk0Var) {
            if (ai0Var.a) {
                return;
            }
            ai0Var.a = true;
            super.close();
            ((ry) this.c.b).b();
        }
    }
}
