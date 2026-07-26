package androidx.compose.foundation.text;

import defpackage.ah6;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wg8;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {77, 81}, m = "invokeSuspend", v = 1)
final class LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 extends RestrictedSuspendLambda implements qp2 {
    public ah6 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ wg8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(wg8 wg8Var, g51 g51Var) {
        super(2, g51Var);
        this.e = wg8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.e, g51Var);
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.d = obj;
        return longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2) create((androidx.compose.ui.input.pointer.e) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r13 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (r13 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004e -> B:17:0x0051). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r12.c
            wg8 r2 = r12.e
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L28
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            ah6 r1 = r12.b
            java.lang.Object r4 = r12.d
            androidx.compose.ui.input.pointer.e r4 = (androidx.compose.ui.input.pointer.e) r4
            kotlin.b.b(r13)
            goto L51
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            java.lang.Object r1 = r12.d
            androidx.compose.ui.input.pointer.e r1 = (androidx.compose.ui.input.pointer.e) r1
            kotlin.b.b(r13)
            goto L3b
        L28:
            kotlin.b.b(r13)
            java.lang.Object r13 = r12.d
            r1 = r13
            androidx.compose.ui.input.pointer.e r1 = (androidx.compose.ui.input.pointer.e) r1
            r12.d = r1
            r12.c = r4
            java.lang.Object r13 = androidx.compose.foundation.gestures.p.c(r1, r12, r3)
            if (r13 != r0) goto L3b
            goto L50
        L3b:
            ah6 r13 = (defpackage.ah6) r13
            long r4 = r13.c
            r2.d()
            r4 = r1
            r1 = r13
        L44:
            r12.d = r4
            r12.b = r1
            r12.c = r3
            java.lang.Object r13 = defpackage.t61.b(r4, r12)
            if (r13 != r0) goto L51
        L50:
            return r0
        L51:
            vg6 r13 = (defpackage.vg6) r13
            java.util.List r13 = r13.a
            int r5 = r13.size()
            r6 = 0
        L5a:
            if (r6 >= r5) goto L74
            java.lang.Object r7 = r13.get(r6)
            ah6 r7 = (defpackage.ah6) r7
            long r8 = r7.a
            long r10 = r1.a
            boolean r8 = defpackage.ct2.h(r8, r10)
            if (r8 == 0) goto L71
            boolean r7 = r7.d
            if (r7 == 0) goto L71
            goto L44
        L71:
            int r6 = r6 + 1
            goto L5a
        L74:
            r2.c()
            tx8 r13 = defpackage.tx8.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
