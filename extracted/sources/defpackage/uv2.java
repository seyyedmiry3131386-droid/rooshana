package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class uv2 extends uo7 {
    public qt8 a = null;

    @Override // defpackage.qt8
    public final Object b(mw3 mw3Var) {
        qt8 qt8Var = this.a;
        if (qt8Var != null) {
            return qt8Var.b(mw3Var);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // defpackage.qt8
    public final void c(uw3 uw3Var, Object obj) {
        qt8 qt8Var = this.a;
        if (qt8Var == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        qt8Var.c(uw3Var, obj);
    }

    @Override // defpackage.uo7
    public final qt8 d() {
        qt8 qt8Var = this.a;
        if (qt8Var != null) {
            return qt8Var;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
