package androidx.compose.foundation.gestures;

import defpackage.ql4;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", l = {299}, m = "awaitFirstCtrlMouseScroll", v = 1)
final class TransformableKt$awaitFirstCtrlMouseScroll$1 extends ContinuationImpl {
    public androidx.compose.ui.input.pointer.e a;
    public ql4 b;
    public /* synthetic */ Object c;
    public int d;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0042 -> B:16:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            r5.c = r6
            int r6 = r5.d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r6 | r0
            r5.d = r6
            r1 = r6 & r0
            if (r1 == 0) goto L12
            int r6 = r6 - r0
            r5.d = r6
            r6 = r5
            goto L17
        L12:
            androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1 r6 = new androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1
            r6.<init>(r5)
        L17:
            java.lang.Object r0 = r6.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r6.d
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            ql4 r2 = r6.b
            androidx.compose.ui.input.pointer.e r4 = r6.a
            kotlin.b.b(r0)
            goto L45
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.b.b(r0)
            r0 = 0
            r2 = r0
            r4 = r2
        L38:
            r6.a = r4
            r6.b = r2
            r6.d = r3
            java.lang.Object r0 = androidx.compose.foundation.gestures.h.d(r4, r2, r6)
            if (r0 != r1) goto L45
            return r1
        L45:
            nr5 r0 = (defpackage.nr5) r0
            if (r0 == 0) goto L38
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt$awaitFirstCtrlMouseScroll$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
