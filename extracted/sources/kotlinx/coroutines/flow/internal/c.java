package kotlinx.coroutines.flow.internal;

import defpackage.e71;
import defpackage.ze2;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ze2 {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ e71 b;
    public final /* synthetic */ d c;
    public final /* synthetic */ ze2 d;

    public c(Ref$ObjectRef ref$ObjectRef, e71 e71Var, d dVar, ze2 ze2Var) {
        this.a = ref$ObjectRef;
        this.b = e71Var;
        this.c = dVar;
        this.d = ze2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ze2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r8, defpackage.g51 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r8 = r0.b
            kotlinx.coroutines.flow.internal.c r0 = r0.a
            kotlin.b.b(r9)
            goto L54
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.b.b(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = r7.a
            java.lang.Object r9 = r9.a
            wt3 r9 = (defpackage.wt3) r9
            if (r9 == 0) goto L53
            kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
            r2.<init>()
            r9.g(r2)
            r0.a = r7
            r0.b = r8
            r0.e = r3
            java.lang.Object r9 = r9.D(r0)
            if (r9 != r1) goto L53
            return r1
        L53:
            r0 = r7
        L54:
            kotlin.jvm.internal.Ref$ObjectRef r9 = r0.a
            e71 r1 = r0.b
            kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.d
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2
            kotlinx.coroutines.flow.internal.d r5 = r0.c
            ze2 r0 = r0.d
            r6 = 0
            r4.<init>(r5, r0, r8, r6)
            li1 r8 = defpackage.bt2.G(r1, r6, r2, r4, r3)
            r9.a = r8
            tx8 r8 = defpackage.tx8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.c.emit(java.lang.Object, g51):java.lang.Object");
    }
}
