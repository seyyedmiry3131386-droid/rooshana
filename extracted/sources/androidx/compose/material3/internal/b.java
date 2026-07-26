package androidx.compose.material3.internal;

import androidx.compose.foundation.gestures.Orientation;
import defpackage.hx4;
import defpackage.qp2;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.bp2 r4, defpackage.qp2 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r6)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L41
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            kotlin.b.b(r6)
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L41
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L41
            r0.b = r3     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L41
            java.lang.Object r4 = defpackage.js3.v(r6, r0)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L41
            if (r4 != r1) goto L41
            return r1
        L41:
            tx8 r4 = defpackage.tx8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.b.a(bp2, qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final hx4 b(hx4 hx4Var, d dVar, qp2 qp2Var) {
        Orientation orientation = Orientation.a;
        return hx4Var.d(new j(dVar, qp2Var));
    }
}
