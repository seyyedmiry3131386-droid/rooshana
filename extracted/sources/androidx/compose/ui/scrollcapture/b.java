package androidx.compose.ui.scrollcapture;

import defpackage.qp2;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final int a;
    public final qp2 b;
    public float c;

    public b(int i, qp2 qp2Var) {
        this.a = i;
        this.b = qp2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(float r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r0 = (androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r0 = new androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.b.b(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.b.b(r6)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            r0.c = r3
            qp2 r5 = r4.b
            androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1 r5 = (androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1) r5
            java.lang.Object r6 = r5.invoke(r6, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.c
            float r6 = r6 + r5
            r4.c = r6
            tx8 r5 = defpackage.tx8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.b.a(float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
