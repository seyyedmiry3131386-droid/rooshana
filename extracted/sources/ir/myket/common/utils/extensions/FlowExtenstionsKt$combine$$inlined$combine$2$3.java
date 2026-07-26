package ir.myket.common.utils.extensions;

import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import ir.myket.player.viewmodel.PlayerViewModel$autoHideController$$inlined$combineLatest$1;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.common.utils.extensions.FlowExtenstionsKt$combine$$inlined$combine$2$3", f = "FlowExtenstions.kt", l = {235, 234}, m = "invokeSuspend", v = 1)
public final class FlowExtenstionsKt$combine$$inlined$combine$2$3 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ ze2 b;
    public /* synthetic */ Object[] c;
    public final /* synthetic */ PlayerViewModel$autoHideController$$inlined$combineLatest$1 d;
    public ze2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtenstionsKt$combine$$inlined$combine$2$3(g51 g51Var, PlayerViewModel$autoHideController$$inlined$combineLatest$1 playerViewModel$autoHideController$$inlined$combineLatest$1) {
        super(3, g51Var);
        this.d = playerViewModel$autoHideController$$inlined$combineLatest$1;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        FlowExtenstionsKt$combine$$inlined$combine$2$3 flowExtenstionsKt$combine$$inlined$combine$2$3 = new FlowExtenstionsKt$combine$$inlined$combine$2$3((g51) obj3, this.d);
        flowExtenstionsKt$combine$$inlined$combine$2$3.b = (ze2) obj;
        flowExtenstionsKt$combine$$inlined$combine$2$3.c = (Object[]) obj2;
        return flowExtenstionsKt$combine$$inlined$combine$2$3.invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        if (r1.emit(r12, r11) == r0) goto L15;
     */
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
            r4 = 0
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            kotlin.b.b(r12)
            goto L6f
        L11:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L19:
            ze2 r1 = r11.e
            kotlin.b.b(r12)
            goto L60
        L1f:
            kotlin.b.b(r12)
            ze2 r1 = r11.b
            java.lang.Object[] r12 = r11.c
            r5 = 0
            r5 = r12[r5]
            r6 = r12[r3]
            r7 = r12[r2]
            r8 = 3
            r8 = r12[r8]
            r9 = 4
            r9 = r12[r9]
            r10 = 5
            r12 = r12[r10]
            r11.b = r4
            r11.c = r4
            r11.e = r1
            r11.a = r3
            ir.myket.player.viewmodel.PlayerViewModel$autoHideController$$inlined$combineLatest$1 r3 = r11.d
            r3.getClass()
            r3 = r11
            g51 r3 = (defpackage.g51) r3
            ir.myket.player.viewmodel.PlayerViewModel$autoHideController$$inlined$combineLatest$1 r10 = new ir.myket.player.viewmodel.PlayerViewModel$autoHideController$$inlined$combineLatest$1
            r10.<init>(r3)
            r10.a = r5
            r10.b = r6
            r10.c = r7
            r10.d = r8
            r10.e = r9
            r10.f = r12
            tx8 r12 = defpackage.tx8.a
            java.lang.Object r12 = r10.invokeSuspend(r12)
            if (r12 != r0) goto L60
            goto L6e
        L60:
            r11.b = r4
            r11.c = r4
            r11.e = r4
            r11.a = r2
            java.lang.Object r12 = r1.emit(r12, r11)
            if (r12 != r0) goto L6f
        L6e:
            return r0
        L6f:
            tx8 r12 = defpackage.tx8.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.common.utils.extensions.FlowExtenstionsKt$combine$$inlined$combine$2$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
