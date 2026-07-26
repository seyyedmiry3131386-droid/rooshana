package ir.myket.common.utils.extensions;

import defpackage.fp2;
import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.common.utils.extensions.FlowExtenstionsKt$combine$$inlined$combine$1$3", f = "FlowExtenstions.kt", l = {235, 234}, m = "invokeSuspend", v = 1)
public final class FlowExtenstionsKt$combine$$inlined$combine$1$3 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ ze2 b;
    public /* synthetic */ Object[] c;
    public final /* synthetic */ fp2 d;
    public ze2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtenstionsKt$combine$$inlined$combine$1$3(g51 g51Var, fp2 fp2Var) {
        super(3, g51Var);
        this.d = fp2Var;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        FlowExtenstionsKt$combine$$inlined$combine$1$3 flowExtenstionsKt$combine$$inlined$combine$1$3 = new FlowExtenstionsKt$combine$$inlined$combine$1$3((g51) obj3, this.d);
        flowExtenstionsKt$combine$$inlined$combine$1$3.b = (ze2) obj;
        flowExtenstionsKt$combine$$inlined$combine$1$3.c = (Object[]) obj2;
        return flowExtenstionsKt$combine$$inlined$combine$1$3.invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
    
        if (r1.emit(r0, r19) == r13) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r12 = r19
            kotlin.coroutines.intrinsics.CoroutineSingletons r13 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r0 = r12.a
            r14 = 2
            r1 = 1
            r15 = 0
            if (r0 == 0) goto L25
            if (r0 == r1) goto L1c
            if (r0 != r14) goto L14
            kotlin.b.b(r20)
            goto L81
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1c:
            ze2 r0 = r12.e
            kotlin.b.b(r20)
            r1 = r0
            r0 = r20
            goto L72
        L25:
            kotlin.b.b(r20)
            ze2 r0 = r12.b
            java.lang.Object[] r2 = r12.c
            r3 = 0
            r3 = r2[r3]
            r4 = r2
            r2 = r4[r1]
            r5 = r3
            r3 = r4[r14]
            r6 = 3
            r6 = r4[r6]
            r7 = 4
            r7 = r4[r7]
            r8 = 5
            r8 = r4[r8]
            r9 = 6
            r9 = r4[r9]
            r10 = 7
            r10 = r4[r10]
            r11 = 8
            r11 = r4[r11]
            r16 = 9
            r16 = r4[r16]
            r17 = 10
            r4 = r4[r17]
            r12.b = r15
            r12.c = r15
            r12.e = r0
            r12.a = r1
            r1 = r0
            fp2 r0 = r12.d
            r18 = r16
            r16 = r1
            r1 = r5
            r5 = r7
            r7 = r9
            r9 = r11
            r11 = r4
            r4 = r6
            r6 = r8
            r8 = r10
            r10 = r18
            java.lang.Object r0 = r0.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 != r13) goto L70
            goto L80
        L70:
            r1 = r16
        L72:
            r12.b = r15
            r12.c = r15
            r12.e = r15
            r12.a = r14
            java.lang.Object r0 = r1.emit(r0, r12)
            if (r0 != r13) goto L81
        L80:
            return r13
        L81:
            tx8 r0 = defpackage.tx8.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.common.utils.extensions.FlowExtenstionsKt$combine$$inlined$combine$1$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
