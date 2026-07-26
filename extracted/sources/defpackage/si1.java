package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class si1 implements on6 {
    public on6 a;

    public static void a(on6 on6Var, on6 on6Var2) {
        si1 si1Var = (si1) on6Var;
        if (si1Var.a != null) {
            throw new IllegalStateException();
        }
        si1Var.a = on6Var2;
    }

    @Override // defpackage.pn6
    public final Object get() {
        on6 on6Var = this.a;
        if (on6Var != null) {
            return on6Var.get();
        }
        throw new IllegalStateException();
    }
}
