package kotlinx.coroutines.flow;

import defpackage.e71;
import defpackage.g51;
import defpackage.rp2;
import defpackage.sl0;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.ze2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {215, 415}, m = "invokeSuspend")
final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements rp2 {
    public Ref$ObjectRef a;
    public Ref$LongRef b;
    public int c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ sl0 f;
    public final /* synthetic */ xe2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(sl0 sl0Var, g51 g51Var, xe2 xe2Var) {
        super(3, g51Var);
        this.f = sl0Var;
        this.g = xe2Var;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.f, (g51) obj3, this.g);
        flowKt__DelayKt$debounceInternal$1.d = (e71) obj;
        flowKt__DelayKt$debounceInternal$1.e = (ze2) obj2;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (r7.emit(r8, r12) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d0, code lost:
    
        if (r7.g(r12) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092 A[PHI: r1 r5 r6 r7
      0x0092: PHI (r1v3 kotlin.jvm.internal.Ref$LongRef) = (r1v5 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef), (r1v7 kotlin.jvm.internal.Ref$LongRef) binds: [B:25:0x0090, B:15:0x0062, B:18:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0092: PHI (r5v2 kotlin.jvm.internal.Ref$ObjectRef) = 
      (r5v4 kotlin.jvm.internal.Ref$ObjectRef)
      (r5v5 kotlin.jvm.internal.Ref$ObjectRef)
      (r5v5 kotlin.jvm.internal.Ref$ObjectRef)
     binds: [B:25:0x0090, B:15:0x0062, B:18:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0092: PHI (r6v3 pw6) = (r6v5 pw6), (r6v6 pw6), (r6v6 pw6) binds: [B:25:0x0090, B:15:0x0062, B:18:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0092: PHI (r7v2 ze2) = (r7v4 ze2), (r7v5 ze2), (r7v5 ze2) binds: [B:25:0x0090, B:15:0x0062, B:18:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d0 -> B:7:0x001a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
