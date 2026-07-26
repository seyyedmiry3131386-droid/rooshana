package com.microsoft.clarity.i;

import com.microsoft.clarity.models.display.IDisplayFrame;
import defpackage.bp2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class B extends Lambda implements bp2 {
    public final /* synthetic */ IDisplayFrame a;
    public final /* synthetic */ P b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(IDisplayFrame iDisplayFrame, P p) {
        super(0);
        this.a = iDisplayFrame;
        this.b = p;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0326 A[LOOP:6: B:79:0x0320->B:81:0x0326, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x034a A[LOOP:7: B:83:0x0344->B:85:0x034a, LOOP_END] */
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
    @Override // defpackage.bp2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 933
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.microsoft.clarity.i.B.invoke():java.lang.Object");
    }
}
