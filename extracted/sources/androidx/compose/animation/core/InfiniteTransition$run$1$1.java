package androidx.compose.animation.core;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wb5;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", l = {172, 193}, m = "invokeSuspend", v = 1)
final class InfiniteTransition$run$1$1 extends SuspendLambda implements qp2 {
    public Ref$FloatRef a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wb5 d;
    public final /* synthetic */ c e;

    /* JADX INFO: renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$1$3, reason: invalid class name */
    @tb1(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements qp2 {
        public /* synthetic */ float a;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(2, g51Var);
            anonymousClass3.a = ((Number) obj).floatValue();
            return anonymousClass3;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create(Float.valueOf(((Number) obj).floatValue()), (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            return Boolean.valueOf(this.a > 0.0f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteTransition$run$1$1(wb5 wb5Var, c cVar, g51 g51Var) {
        super(2, g51Var);
        this.d = wb5Var;
        this.e = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        InfiniteTransition$run$1$1 infiniteTransition$run$1$1 = new InfiniteTransition$run$1$1(this.d, this.e, g51Var);
        infiniteTransition$run$1$1.c = obj;
        return infiniteTransition$run$1$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((InfiniteTransition$run$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    /* JADX WARN: Path cross not found for [B:11:0x003e, B:18:0x0070], limit reached: 22 */
    /* JADX WARN: Path cross not found for [B:18:0x0070, B:11:0x003e], limit reached: 22 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006e -> B:11:0x003e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008a -> B:11:0x003e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r11.b
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L2c
            if (r1 == r2) goto L20
            if (r1 != r3) goto L18
            kotlin.jvm.internal.Ref$FloatRef r1 = r11.a
            java.lang.Object r4 = r11.c
            e71 r4 = (defpackage.e71) r4
            kotlin.b.b(r12)
            r8 = r1
            r9 = r4
            goto L3e
        L18:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L20:
            kotlin.jvm.internal.Ref$FloatRef r1 = r11.a
            java.lang.Object r4 = r11.c
            e71 r4 = (defpackage.e71) r4
            kotlin.b.b(r12)
            r8 = r1
            r9 = r4
            goto L69
        L2c:
            kotlin.b.b(r12)
            java.lang.Object r12 = r11.c
            e71 r12 = (defpackage.e71) r12
            kotlin.jvm.internal.Ref$FloatRef r1 = new kotlin.jvm.internal.Ref$FloatRef
            r1.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.a = r4
            r9 = r12
            r8 = r1
        L3e:
            zi r5 = new zi
            r10 = 5
            wb5 r6 = r11.d
            androidx.compose.animation.core.c r7 = r11.e
            r5.<init>(r6, r7, r8, r9, r10)
            r11.c = r9
            r11.a = r8
            r11.b = r2
            w61 r12 = r11.getContext()
            hy2 r1 = defpackage.hy2.m
            u61 r12 = r12.r0(r1)
            if (r12 != 0) goto L8d
            w61 r12 = r11.getContext()
            qx4 r12 = defpackage.ml9.s(r12)
            java.lang.Object r12 = r12.k0(r11, r5)
            if (r12 != r0) goto L69
            goto L8c
        L69:
            float r12 = r8.a
            r1 = 0
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 != 0) goto L3e
            hk3 r12 = new hk3
            r1 = 3
            r12.<init>(r1, r9)
            vb7 r12 = androidx.compose.runtime.g.l(r12)
            androidx.compose.animation.core.InfiniteTransition$run$1$1$3 r1 = new androidx.compose.animation.core.InfiniteTransition$run$1$1$3
            r4 = 0
            r1.<init>(r3, r4)
            r11.c = r9
            r11.a = r8
            r11.b = r3
            java.lang.Object r12 = kotlinx.coroutines.flow.d.p(r12, r1, r11)
            if (r12 != r0) goto L3e
        L8c:
            return r0
        L8d:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransition$run$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
