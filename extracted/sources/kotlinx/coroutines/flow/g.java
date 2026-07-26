package kotlinx.coroutines.flow;

import defpackage.ze2;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements ze2 {
    public final /* synthetic */ Ref$IntRef a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ze2 c;

    public g(Ref$IntRef ref$IntRef, int i, ze2 ze2Var) {
        this.a = ref$IntRef;
        this.b = i;
        this.c = ze2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ze2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r7, defpackage.g51 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            tx8 r3 = defpackage.tx8.a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.b.b(r8)
            return r3
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.b.b(r8)
            kotlin.jvm.internal.Ref$IntRef r8 = r6.a
            int r2 = r8.a
            int r5 = r6.b
            if (r2 < r5) goto L48
            r0.c = r4
            ze2 r8 = r6.c
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            return r3
        L48:
            int r2 = r2 + r4
            r8.a = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.g.emit(java.lang.Object, g51):java.lang.Object");
    }
}
