package androidx.datastore.core;

import defpackage.dp2;
import defpackage.g51;
import defpackage.rb2;
import defpackage.tb1;
import defpackage.tx8;
import java.io.FileInputStream;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.FileReadScope$readData$2", f = "FileStorage.kt", l = {162, 170}, m = "invokeSuspend", v = 1)
final class FileReadScope$readData$2 extends SuspendLambda implements dp2 {
    public FileInputStream a;
    public int b;
    public final /* synthetic */ rb2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileReadScope$readData$2(rb2 rb2Var, g51 g51Var) {
        super(1, g51Var);
        this.c = rb2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new FileReadScope$readData$2(this.c, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((FileReadScope$readData$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r10 == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
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
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Exception {
        /*
            r9 = this;
            th0 r0 = defpackage.th0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r9.b
            r3 = 2
            r4 = 1
            rb2 r5 = r9.c
            r6 = 0
            if (r2 == 0) goto L29
            if (r2 == r4) goto L21
            if (r2 != r3) goto L19
            java.io.FileInputStream r0 = r9.a
            kotlin.b.b(r10)     // Catch: java.lang.Throwable -> L17
            goto L6d
        L17:
            r10 = move-exception
            goto L77
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            java.io.FileInputStream r2 = r9.a
            kotlin.b.b(r10)     // Catch: java.lang.Throwable -> L27
            goto L42
        L27:
            r10 = move-exception
            goto L46
        L29:
            kotlin.b.b(r10)
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L4c
            java.io.File r2 = r5.a     // Catch: java.io.FileNotFoundException -> L4c
            r10.<init>(r2)     // Catch: java.io.FileNotFoundException -> L4c
            java.io.FileInputStream r2 = io.sentry.config.a.g(r2, r10)     // Catch: java.io.FileNotFoundException -> L4c
            r9.a = r2     // Catch: java.lang.Throwable -> L27
            r9.b = r4     // Catch: java.lang.Throwable -> L27
            pb5 r10 = r0.n(r2)     // Catch: java.lang.Throwable -> L27
            if (r10 != r1) goto L42
            goto L69
        L42:
            defpackage.tv8.h(r2, r6)     // Catch: java.io.FileNotFoundException -> L4c
            return r10
        L46:
            throw r10     // Catch: java.lang.Throwable -> L47
        L47:
            r7 = move-exception
            defpackage.tv8.h(r2, r10)     // Catch: java.io.FileNotFoundException -> L4c
            throw r7     // Catch: java.io.FileNotFoundException -> L4c
        L4c:
            java.io.File r10 = r5.a
            boolean r10 = r10.exists()
            if (r10 == 0) goto L8e
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L71
            java.io.File r2 = r5.a     // Catch: java.lang.Exception -> L71
            r10.<init>(r2)     // Catch: java.lang.Exception -> L71
            java.io.FileInputStream r10 = io.sentry.config.a.g(r2, r10)     // Catch: java.lang.Exception -> L71
            r9.a = r10     // Catch: java.lang.Throwable -> L73
            r9.b = r3     // Catch: java.lang.Throwable -> L73
            pb5 r0 = r0.n(r10)     // Catch: java.lang.Throwable -> L73
            if (r0 != r1) goto L6a
        L69:
            return r1
        L6a:
            r8 = r0
            r0 = r10
            r10 = r8
        L6d:
            defpackage.tv8.h(r0, r6)     // Catch: java.lang.Exception -> L71
            goto L93
        L71:
            r10 = move-exception
            goto L7d
        L73:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
        L77:
            throw r10     // Catch: java.lang.Throwable -> L78
        L78:
            r1 = move-exception
            defpackage.tv8.h(r0, r10)     // Catch: java.lang.Exception -> L71
            throw r1     // Catch: java.lang.Exception -> L71
        L7d:
            boolean r0 = r10 instanceof java.io.FileNotFoundException
            if (r0 == 0) goto L8d
            java.io.File r0 = r5.a
            java.lang.String r0 = r0.getParent()
            java.io.FileNotFoundException r10 = (java.io.FileNotFoundException) r10
            java.lang.Exception r10 = defpackage.bt2.a0(r0, r10)
        L8d:
            throw r10
        L8e:
            pb5 r10 = new pb5
            r10.<init>(r4)
        L93:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileReadScope$readData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
