package defpackage;

import ir.mservices.market.version2.ui.recycler.a;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gm5 implements to1, zp2 {
    public final /* synthetic */ a a;

    public gm5(a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof to1) && (obj instanceof zp2)) {
            return getFunctionDelegate().equals(((zp2) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zp2
    public final np2 getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, a.class, "disableInterceptTouchEvent", "disableInterceptTouchEvent(Z)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ir.mservices.market.version2.fragments.base.BaseNavigationFragment, to1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.to1
    public final void t(boolean z) {
        ?? r0 = this.a.v;
        if (r0 != 0) {
            r0.t(z);
        }
    }
}
