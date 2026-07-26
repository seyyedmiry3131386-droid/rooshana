package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m98 extends mx4 {
    public final fu1 b;

    public m98(fu1 fu1Var) {
        this.b = fu1Var;
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
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m98)) {
            return false;
        }
        m98 m98Var = (m98) obj;
        jh jhVar = dt2.l;
        return jhVar.equals(jhVar) && js3.i(this.b, m98Var.b);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new n98(dt2.l, this.b);
    }

    public final int hashCode() {
        int i = ((1022 * 31) + 1237) * 31;
        fu1 fu1Var = this.b;
        return i + (fu1Var == null ? 0 : fu1Var.hashCode());
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        n98 n98Var = (n98) gx4Var;
        jh jhVar = dt2.l;
        if (!js3.i(n98Var.p, jhVar)) {
            n98Var.p = jhVar;
            if (n98Var.q) {
                n98Var.E0();
            }
        }
        n98Var.o = this.b;
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + dt2.l + ", overrideDescendants=false, touchBoundsExpansion=" + this.b + ')';
    }
}
