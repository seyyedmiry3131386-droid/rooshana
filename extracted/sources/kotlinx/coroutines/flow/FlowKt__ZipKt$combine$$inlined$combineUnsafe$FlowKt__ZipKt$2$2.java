package kotlinx.coroutines.flow;

import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tp2;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ ze2 b;
    public /* synthetic */ Object[] c;
    public final /* synthetic */ SuspendLambda d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2(g51 g51Var, tp2 tp2Var) {
        super(3, g51Var);
        this.d = (SuspendLambda) tp2Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, tp2] */
    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2 = new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2((g51) obj3, this.d);
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2.b = (ze2) obj;
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2.c = (Object[]) obj2;
        return flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2.invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r1.emit(r12, r11) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, tp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r11.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            kotlin.b.b(r12)
            r10 = r11
            goto L4b
        L11:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L19:
            ze2 r1 = r11.b
            kotlin.b.b(r12)
            r10 = r11
            goto L3f
        L20:
            kotlin.b.b(r12)
            ze2 r1 = r11.b
            java.lang.Object[] r12 = r11.c
            r4 = 0
            r6 = r12[r4]
            r7 = r12[r3]
            r8 = r12[r2]
            r4 = 3
            r9 = r12[r4]
            r11.b = r1
            r11.a = r3
            kotlin.coroutines.jvm.internal.SuspendLambda r5 = r11.d
            r10 = r11
            java.lang.Object r12 = r5.invoke(r6, r7, r8, r9, r10)
            if (r12 != r0) goto L3f
            goto L4a
        L3f:
            r3 = 0
            r10.b = r3
            r10.a = r2
            java.lang.Object r12 = r1.emit(r12, r11)
            if (r12 != r0) goto L4b
        L4a:
            return r0
        L4b:
            tx8 r12 = defpackage.tx8.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
