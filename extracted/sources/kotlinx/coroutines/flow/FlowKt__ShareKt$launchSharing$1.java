package kotlinx.coroutines.flow;

import defpackage.e71;
import defpackage.g51;
import defpackage.mu3;
import defpackage.qp2;
import defpackage.su7;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.u2;
import defpackage.ub5;
import defpackage.vy2;
import defpackage.xe2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, 214, 215, 221}, m = "invokeSuspend")
final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ su7 b;
    public final /* synthetic */ xe2 c;
    public final /* synthetic */ u2 d;
    public final /* synthetic */ Object e;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1, reason: invalid class name */
    @tb1(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ int a;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, g51Var);
            anonymousClass1.a = ((Number) obj).intValue();
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(Integer.valueOf(((Number) obj).intValue()), (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            return Boolean.valueOf(this.a > 0);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2, reason: invalid class name */
    @tb1(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {223}, m = "invokeSuspend")
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ xe2 c;
        public final /* synthetic */ u2 d;
        public final /* synthetic */ Object e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(xe2 xe2Var, ub5 ub5Var, Object obj, g51 g51Var) {
            super(2, g51Var);
            this.c = xe2Var;
            this.d = (u2) ub5Var;
            this.e = obj;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [u2, ub5] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.c, this.d, this.e, g51Var);
            anonymousClass2.b = obj;
            return anonymousClass2;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((SharingCommand) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [u2, ub5, ze2] */
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
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                int iOrdinal = ((SharingCommand) this.b).ordinal();
                ?? r1 = this.d;
                if (iOrdinal == 0) {
                    this.a = 1;
                    if (this.c.a(r1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mu3 mu3Var = vy2.i;
                    Object obj2 = this.e;
                    if (obj2 == mu3Var) {
                        r1.b();
                    } else {
                        r1.e(obj2);
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ShareKt$launchSharing$1(su7 su7Var, xe2 xe2Var, ub5 ub5Var, Object obj, g51 g51Var) {
        super(2, g51Var);
        this.b = su7Var;
        this.c = xe2Var;
        this.d = (u2) ub5Var;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [u2, ub5] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new FlowKt__ShareKt$launchSharing$1(this.b, this.c, this.d, this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__ShareKt$launchSharing$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r5.a(r7, r8) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r5.a(r7, r8) != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (kotlinx.coroutines.flow.d.f(r9, r1, r8) == r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [u2, ub5, ze2] */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r8.a
            r2 = 4
            r3 = 3
            r4 = 1
            xe2 r5 = r8.c
            r6 = 2
            u2 r7 = r8.d
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 == r6) goto L1f
            if (r1 == r3) goto L23
            if (r1 != r2) goto L17
            goto L23
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            kotlin.b.b(r9)
            goto L50
        L23:
            kotlin.b.b(r9)
            goto L75
        L27:
            kotlin.b.b(r9)
            sl3 r9 = defpackage.ru7.a
            su7 r1 = r8.b
            if (r1 != r9) goto L39
            r8.a = r4
            java.lang.Object r9 = r5.a(r7, r8)
            if (r9 != r0) goto L75
            goto L74
        L39:
            kotlinx.coroutines.flow.j r9 = defpackage.ru7.b
            r4 = 0
            if (r1 != r9) goto L59
            ia8 r9 = r7.k()
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
            r1.<init>(r6, r4)
            r8.a = r6
            java.lang.Object r9 = kotlinx.coroutines.flow.d.p(r9, r1, r8)
            if (r9 != r0) goto L50
            goto L74
        L50:
            r8.a = r3
            java.lang.Object r9 = r5.a(r7, r8)
            if (r9 != r0) goto L75
            goto L74
        L59:
            ia8 r9 = r7.k()
            xe2 r9 = r1.a(r9)
            xe2 r9 = kotlinx.coroutines.flow.d.k(r9)
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
            java.lang.Object r3 = r8.e
            r1.<init>(r5, r7, r3, r4)
            r8.a = r2
            java.lang.Object r9 = kotlinx.coroutines.flow.d.f(r9, r1, r8)
            if (r9 != r0) goto L75
        L74:
            return r0
        L75:
            tx8 r9 = defpackage.tx8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
