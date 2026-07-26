package androidx.compose.foundation.text.selection;

import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1", f = "SelectionManager.kt", l = {994, 1000}, m = "invokeSuspend", v = 1)
final class SelectionManager$onClearSelectionRequested$1$1 extends RestrictedSuspendLambda implements qp2 {
    public int b;
    public /* synthetic */ Object c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r5.b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 == r4) goto L19
            if (r1 != r3) goto L11
            kotlin.b.b(r6)
            goto L47
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L19:
            java.lang.Object r1 = r5.c
            androidx.compose.ui.input.pointer.e r1 = (androidx.compose.ui.input.pointer.e) r1
            kotlin.b.b(r6)
            goto L38
        L21:
            kotlin.b.b(r6)
            java.lang.Object r6 = r5.c
            r1 = r6
            androidx.compose.ui.input.pointer.e r1 = (androidx.compose.ui.input.pointer.e) r1
            r5.c = r1
            r5.b = r4
            rp2 r6 = androidx.compose.foundation.gestures.p.a
            androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.b
            java.lang.Object r6 = androidx.compose.foundation.gestures.p.d(r1, r6, r5)
            if (r6 != r0) goto L38
            goto L46
        L38:
            ah6 r6 = (defpackage.ah6) r6
            androidx.compose.ui.input.pointer.PointerEventPass r4 = androidx.compose.ui.input.pointer.PointerEventPass.a
            r5.c = r2
            r5.b = r3
            java.lang.Object r6 = androidx.compose.foundation.gestures.d.a(r1, r6, r4, r5)
            if (r6 != r0) goto L47
        L46:
            return r0
        L47:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L52
            tx8 r6 = defpackage.tx8.a
            return r6
        L52:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
