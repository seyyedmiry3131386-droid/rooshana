package defpackage;

import androidx.compose.animation.p;

/* JADX INFO: loaded from: classes.dex */
final class fy7 extends mx4 {
    public final sc2 b;
    public final qp2 c;

    public fy7(sc2 sc2Var, qp2 qp2Var) {
        this.b = sc2Var;
        this.c = qp2Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (!(obj instanceof fy7)) {
            return false;
        }
        fy7 fy7Var = (fy7) obj;
        if (!js3.i(fy7Var.b, this.b) || fy7Var.c != this.c) {
            return false;
        }
        cb0 cb0Var = eq.c;
        return cb0Var.equals(cb0Var);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new p(this.b, this.c);
    }

    public final int hashCode() {
        int iFloatToIntBits = (Float.floatToIntBits(-1.0f) + (Float.floatToIntBits(-1.0f) * 31) + (this.b.hashCode() * 31)) * 31;
        qp2 qp2Var = this.c;
        return iFloatToIntBits + (qp2Var != null ? qp2Var.hashCode() : 0);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        p pVar = (p) gx4Var;
        pVar.p = this.b;
        pVar.q = this.c;
    }
}
