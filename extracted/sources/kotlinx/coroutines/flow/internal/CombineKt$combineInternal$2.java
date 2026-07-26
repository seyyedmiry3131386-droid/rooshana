package kotlinx.coroutines.flow.internal;

import defpackage.bp2;
import defpackage.cp0;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.ze2;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {51, 73, 76}, m = "invokeSuspend")
final class CombineKt$combineInternal$2 extends SuspendLambda implements qp2 {
    public cp0 a;
    public byte[] b;
    public int c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ xe2[] g;
    public final /* synthetic */ bp2 h;
    public final /* synthetic */ SuspendLambda i;
    public final /* synthetic */ ze2 j;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
    @tb1(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ xe2[] b;
        public final /* synthetic */ int c;
        public final /* synthetic */ AtomicInteger d;
        public final /* synthetic */ kotlinx.coroutines.channels.a e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(xe2[] xe2VarArr, int i, AtomicInteger atomicInteger, kotlinx.coroutines.channels.a aVar, g51 g51Var) {
            super(2, g51Var);
            this.b = xe2VarArr;
            this.c = i;
            this.d = atomicInteger;
            this.e = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.b, this.c, this.d, this.e, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            AtomicInteger atomicInteger = this.d;
            kotlinx.coroutines.channels.a aVar = this.e;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    xe2[] xe2VarArr = this.b;
                    int i2 = this.c;
                    xe2 xe2Var = xe2VarArr[i2];
                    f fVar = new f(aVar, i2);
                    this.a = 1;
                    if (xe2Var.a(fVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    aVar.n(null);
                }
                return tx8.a;
            } finally {
                if (atomicInteger.decrementAndGet() == 0) {
                    aVar.n(null);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$combineInternal$2(g51 g51Var, ze2 ze2Var, bp2 bp2Var, rp2 rp2Var, xe2[] xe2VarArr) {
        super(2, g51Var);
        this.g = xe2VarArr;
        this.h = bp2Var;
        this.i = (SuspendLambda) rp2Var;
        this.j = ze2Var;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, rp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(g51Var, this.j, this.h, this.i, this.g);
        combineKt$combineInternal$2.f = obj;
        return combineKt$combineInternal$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CombineKt$combineInternal$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f7, code lost:
    
        if (r12.a(r11, r15, r17) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0110, code lost:
    
        if (r12.a(r11, r9, r17) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0113, code lost:
    
        if (r8 != 0) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8 A[LOOP:0: B:27:0x00b8->B:46:?, LOOP_START, PHI: r8 r9
      0x00b8: PHI (r8v7 int) = (r8v6 int), (r8v8 int) binds: [B:24:0x00b3, B:46:?] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r9v3 pm3) = (r9v2 pm3), (r9v9 pm3) binds: [B:24:0x00b3, B:46:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Type inference failed for: r12v3, types: [kotlin.coroutines.jvm.internal.SuspendLambda, rp2] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlinx.coroutines.CoroutineStart, w61] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f7 -> B:43:0x0113). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0110 -> B:43:0x0113). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
