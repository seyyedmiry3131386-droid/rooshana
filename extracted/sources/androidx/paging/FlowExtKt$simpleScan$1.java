package androidx.paging;

import defpackage.g51;
import defpackage.gf2;
import defpackage.qp2;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.FlowExtKt$simpleScan$1", f = "FlowExt.kt", l = {51, 52}, m = "invokeSuspend", v = 1)
final class FlowExtKt$simpleScan$1 extends SuspendLambda implements qp2 {
    public Ref$ObjectRef a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ gf2 d;
    public final /* synthetic */ rp2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$simpleScan$1(gf2 gf2Var, rp2 rp2Var, g51 g51Var) {
        super(2, g51Var);
        this.d = gf2Var;
        this.e = rp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        FlowExtKt$simpleScan$1 flowExtKt$simpleScan$1 = new FlowExtKt$simpleScan$1(this.d, this.e, g51Var);
        flowExtKt$simpleScan$1.c = obj;
        return flowExtKt$simpleScan$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtKt$simpleScan$1) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7.d.a(r8, r7) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r7.b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L19
            if (r1 != r3) goto L11
            kotlin.b.b(r8)
            goto L56
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            kotlin.jvm.internal.Ref$ObjectRef r1 = r7.a
            java.lang.Object r4 = r7.c
            ze2 r4 = (defpackage.ze2) r4
            kotlin.b.b(r8)
            goto L3f
        L23:
            kotlin.b.b(r8)
            java.lang.Object r8 = r7.c
            ze2 r8 = (defpackage.ze2) r8
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            r1.a = r2
            r7.c = r8
            r7.a = r1
            r7.b = r4
            java.lang.Object r4 = r8.emit(r2, r7)
            if (r4 != r0) goto L3e
            goto L55
        L3e:
            r4 = r8
        L3f:
            androidx.paging.h r8 = new androidx.paging.h
            rp2 r5 = r7.e
            r6 = 1
            r8.<init>(r1, r5, r4, r6)
            r7.c = r2
            r7.a = r2
            r7.b = r3
            gf2 r1 = r7.d
            java.lang.Object r8 = r1.a(r8, r7)
            if (r8 != r0) goto L56
        L55:
            return r0
        L56:
            tx8 r8 = defpackage.tx8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.FlowExtKt$simpleScan$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
