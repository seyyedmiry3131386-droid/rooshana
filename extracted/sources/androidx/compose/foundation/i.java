package androidx.compose.foundation;

import defpackage.dh6;
import defpackage.gx4;
import defpackage.zc3;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends gx4 implements dh6 {
    public zc3 o;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object C0(androidx.compose.foundation.i r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof androidx.compose.foundation.HoverableNode$emitEnter$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.HoverableNode$emitEnter$1 r0 = (androidx.compose.foundation.HoverableNode$emitEnter$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            androidx.compose.foundation.HoverableNode$emitEnter$1 r0 = new androidx.compose.foundation.HoverableNode$emitEnter$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            zc3 r0 = r0.a
            kotlin.b.b(r5)
            r4.o = r0
            goto L3a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.b.b(r5)
            zc3 r4 = r4.o
            if (r4 == 0) goto L3d
        L3a:
            tx8 r4 = defpackage.tx8.a
            return r4
        L3d:
            zc3 r4 = new zc3
            r4.<init>()
            r0.a = r4
            r0.c = r2
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.i.C0(androidx.compose.foundation.i, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object D0(androidx.compose.foundation.i r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof androidx.compose.foundation.HoverableNode$emitExit$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.HoverableNode$emitExit$1 r0 = (androidx.compose.foundation.HoverableNode$emitExit$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            androidx.compose.foundation.HoverableNode$emitExit$1 r0 = new androidx.compose.foundation.HoverableNode$emitExit$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r0.b
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            kotlin.b.b(r5)
            r5 = 0
            r4.o = r5
            goto L39
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.b.b(r5)
            zc3 r4 = r4.o
            if (r4 != 0) goto L3c
        L39:
            tx8 r4 = defpackage.tx8.a
            return r4
        L3c:
            ad3 r5 = new ad3
            r5.<init>(r4)
            r0.b = r2
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.i.D0(androidx.compose.foundation.i, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
