package androidx.compose.ui.draw;

import defpackage.cb0;
import defpackage.dw1;
import defpackage.eq;
import defpackage.ey7;
import defpackage.g16;
import defpackage.gx4;
import defpackage.js3;
import defpackage.mx4;
import defpackage.p41;
import defpackage.rf0;
import defpackage.tc0;
import defpackage.zk8;

/* JADX INFO: loaded from: classes.dex */
final class PainterElement extends mx4 {
    public final tc0 b;
    private final g16 painter;

    public PainterElement(g16 g16Var, tc0 tc0Var) {
        this.painter = g16Var;
        this.b = tc0Var;
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
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        if (!js3.i(this.painter, painterElement.painter)) {
            return false;
        }
        cb0 cb0Var = eq.g;
        if (!cb0Var.equals(cb0Var)) {
            return false;
        }
        Object obj2 = p41.b;
        return obj2.equals(obj2) && Float.compare(1.0f, 1.0f) == 0 && js3.i(this.b, painterElement.b);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new PainterNode(this.painter, this.b);
    }

    public final int hashCode() {
        int iG = dw1.g(1.0f, (p41.b.hashCode() + ((Float.floatToIntBits(0.0f) + (Float.floatToIntBits(0.0f) * 31) + (((this.painter.hashCode() * 31) + 1231) * 31)) * 31)) * 31, 31);
        tc0 tc0Var = this.b;
        return iG + (tc0Var == null ? 0 : tc0Var.hashCode());
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        PainterNode painterNode = (PainterNode) gx4Var;
        painterNode.getClass();
        boolean zB = ey7.b(painterNode.C0().h(), this.painter.h());
        painterNode.H0(this.painter);
        painterNode.o = this.b;
        if (!zB) {
            zk8.J(painterNode);
        }
        rf0.z(painterNode);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=true, alignment=" + eq.g + ", contentScale=" + p41.b + ", alpha=1.0, colorFilter=" + this.b + ')';
    }
}
