package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qe3 {
    public final k57 a;
    public final cl0 b;
    public final l51 c;

    public qe3(k57 k57Var, cl0 cl0Var, l51 l51Var) {
        this.a = k57Var;
        this.b = cl0Var;
        this.c = l51Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0113, code lost:
    
        throw defpackage.rq4.J(r31, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0904 A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.qe3 b(defpackage.k87 r29, java.lang.Class r30, java.lang.reflect.Method r31) {
        /*
            Method dump skipped, instruction units count: 2861
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe3.b(k87, java.lang.Class, java.lang.reflect.Method):qe3");
    }

    public abstract Object a(fs5 fs5Var, Object[] objArr);
}
