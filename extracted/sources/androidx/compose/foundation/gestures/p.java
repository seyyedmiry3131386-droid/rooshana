package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.ah6;
import defpackage.at2;
import defpackage.bt2;
import defpackage.dp2;
import defpackage.e71;
import defpackage.eh6;
import defpackage.g51;
import defpackage.js3;
import defpackage.li1;
import defpackage.qp2;
import defpackage.rp2;
import defpackage.sl0;
import defpackage.tx8;
import defpackage.vg6;
import defpackage.wt3;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static final rp2 a = new TapGestureDetectorKt$NoPressGesture$1(3, null);

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[LOOP:0: B:19:0x0049->B:20:0x004b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.e r8, kotlin.coroutines.jvm.internal.BaseContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$consumeUntilUp$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.compose.ui.input.pointer.e r8 = r0.a
            kotlin.b.b(r9)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            kotlin.b.b(r9)
        L34:
            r0.a = r8
            r0.c = r3
            java.lang.Object r9 = defpackage.t61.b(r8, r0)
            if (r9 != r1) goto L3f
            return r1
        L3f:
            vg6 r9 = (defpackage.vg6) r9
            java.util.List r2 = r9.a
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L49:
            if (r6 >= r4) goto L57
            java.lang.Object r7 = r2.get(r6)
            ah6 r7 = (defpackage.ah6) r7
            r7.a()
            int r6 = r6 + 1
            goto L49
        L57:
            java.util.List r9 = r9.a
            int r2 = r9.size()
        L5d:
            if (r5 >= r2) goto L6d
            java.lang.Object r4 = r9.get(r5)
            ah6 r4 = (defpackage.ah6) r4
            boolean r4 = r4.d
            if (r4 == 0) goto L6a
            goto L34
        L6a:
            int r5 = r5 + 1
            goto L5d
        L6d:
            tx8 r8 = defpackage.tx8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.p.a(androidx.compose.ui.input.pointer.e, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.compose.ui.input.pointer.e r6, boolean r7, androidx.compose.ui.input.pointer.PointerEventPass r8, defpackage.g51 r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitFirstDown$2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r6 = r0.c
            androidx.compose.ui.input.pointer.PointerEventPass r7 = r0.b
            androidx.compose.ui.input.pointer.e r8 = r0.a
            kotlin.b.b(r9)
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
            goto L4b
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.b.b(r9)
        L3c:
            r0.a = r6
            r0.b = r8
            r0.c = r7
            r0.e = r3
            java.lang.Object r9 = r6.a(r8, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            vg6 r9 = (defpackage.vg6) r9
            r2 = 0
            boolean r4 = g(r9, r7, r2)
            if (r4 == 0) goto L3c
            java.util.List r6 = r9.a
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.p.b(androidx.compose.ui.input.pointer.e, boolean, androidx.compose.ui.input.pointer.PointerEventPass, g51):java.lang.Object");
    }

    public static /* synthetic */ Object c(androidx.compose.ui.input.pointer.e eVar, g51 g51Var, int i) {
        PointerEventPass pointerEventPass = PointerEventPass.a;
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            pointerEventPass = PointerEventPass.b;
        }
        return b(eVar, z, pointerEventPass, g51Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0043 -> B:18:0x0046). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(androidx.compose.ui.input.pointer.e r6, androidx.compose.ui.input.pointer.PointerEventPass r7, kotlin.coroutines.jvm.internal.BaseContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitPrimaryFirstDown$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            androidx.compose.ui.input.pointer.PointerEventPass r6 = r0.b
            androidx.compose.ui.input.pointer.e r7 = r0.a
            kotlin.b.b(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L46
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.b.b(r8)
        L39:
            r0.a = r6
            r0.b = r7
            r0.d = r3
            java.lang.Object r8 = r6.a(r7, r0)
            if (r8 != r1) goto L46
            return r1
        L46:
            vg6 r8 = (defpackage.vg6) r8
            r2 = 0
            boolean r4 = g(r8, r2, r3)
            if (r4 == 0) goto L39
            java.util.List r6 = r8.a
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.p.d(androidx.compose.ui.input.pointer.e, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    public static final Object e(eh6 eh6Var, rp2 rp2Var, dp2 dp2Var, g51 g51Var) {
        Object objV = js3.v(new TapGestureDetectorKt$detectTapAndPress$2(eh6Var, rp2Var, dp2Var, new j(eh6Var), null), g51Var);
        return objV == CoroutineSingletons.a ? objV : tx8.a;
    }

    public static Object f(eh6 eh6Var, ir.myket.player.ui.client.controllers.common.c cVar, sl0 sl0Var, dp2 dp2Var, g51 g51Var, int i) {
        Object objV = js3.v(new TapGestureDetectorKt$detectTapGestures$2(eh6Var, a, (i & 2) != 0 ? null : sl0Var, (i & 1) != 0 ? null : cVar, (i & 8) != 0 ? null : dp2Var, null), g51Var);
        return objV == CoroutineSingletons.a ? objV : tx8.a;
    }

    public static final boolean g(vg6 vg6Var, boolean z, boolean z2) {
        if (z2) {
            List list = vg6Var.a;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (((ah6) list.get(i)).i != 2) {
                        break;
                    }
                    i++;
                } else if ((vg6Var.d & 33) == 0) {
                    return false;
                }
            }
        }
        List list2 = vg6Var.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ah6 ah6Var = (ah6) list2.get(i2);
            if (!(z ? at2.N(ah6Var) : at2.O(ah6Var))) {
                return false;
            }
        }
        return true;
    }

    public static li1 h(e71 e71Var, wt3 wt3Var, qp2 qp2Var) {
        return bt2.G(e71Var, null, CoroutineStart.d, new TapGestureDetectorKt$launchAwaitingReset$1(wt3Var, qp2Var, null), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(androidx.compose.ui.input.pointer.e r7, androidx.compose.ui.input.pointer.PointerEventPass r8, kotlin.coroutines.jvm.internal.BaseContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.Ref$ObjectRef r7 = r0.a
            kotlin.b.b(r9)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5a
            goto L57
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.b.b(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            je4 r2 = defpackage.je4.a
            r9.a = r2
            v69 r2 = r7.c()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5a
            long r4 = r2.b()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5a
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2 r2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5a
            r6 = 0
            r2.<init>(r8, r9, r6)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5a
            r0.a = r9     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5a
            r0.c = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5a
            java.lang.Object r7 = r7.e(r4, r2, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L5a
            if (r7 != r1) goto L56
            return r1
        L56:
            r7 = r9
        L57:
            java.lang.Object r7 = r7.a
            return r7
        L5a:
            le4 r7 = defpackage.le4.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.p.i(androidx.compose.ui.input.pointer.e, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        if (r15 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009e -> B:13:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(androidx.compose.ui.input.pointer.e r13, androidx.compose.ui.input.pointer.PointerEventPass r14, kotlin.coroutines.jvm.internal.BaseContinuationImpl r15) {
        /*
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2 r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2 r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForUpOrCancellation$2
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3b
            if (r2 != r3) goto L33
            androidx.compose.ui.input.pointer.PointerEventPass r13 = r0.b
            androidx.compose.ui.input.pointer.e r14 = r0.a
            kotlin.b.b(r15)
        L2e:
            r12 = r14
            r14 = r13
            r13 = r12
            goto La1
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            androidx.compose.ui.input.pointer.PointerEventPass r13 = r0.b
            androidx.compose.ui.input.pointer.e r14 = r0.a
            kotlin.b.b(r15)
            goto L56
        L43:
            kotlin.b.b(r15)
        L46:
            r0.a = r13
            r0.b = r14
            r0.d = r5
            java.lang.Object r15 = r13.a(r14, r0)
            if (r15 != r1) goto L53
            goto La0
        L53:
            r12 = r14
            r14 = r13
            r13 = r12
        L56:
            vg6 r15 = (defpackage.vg6) r15
            java.util.List r15 = r15.a
            int r2 = r15.size()
            r6 = r4
        L5f:
            if (r6 >= r2) goto Lc0
            java.lang.Object r7 = r15.get(r6)
            ah6 r7 = (defpackage.ah6) r7
            boolean r7 = defpackage.at2.P(r7)
            if (r7 != 0) goto Lbd
            int r2 = r15.size()
            r6 = r4
        L72:
            if (r6 >= r2) goto L92
            java.lang.Object r7 = r15.get(r6)
            ah6 r7 = (defpackage.ah6) r7
            boolean r8 = r7.b()
            if (r8 != 0) goto Lb8
            androidx.compose.ui.input.pointer.f r8 = r14.f
            long r8 = r8.x
            long r10 = r14.b()
            boolean r7 = defpackage.at2.e0(r7, r8, r10)
            if (r7 == 0) goto L8f
            goto Lb8
        L8f:
            int r6 = r6 + 1
            goto L72
        L92:
            androidx.compose.ui.input.pointer.PointerEventPass r15 = androidx.compose.ui.input.pointer.PointerEventPass.c
            r0.a = r14
            r0.b = r13
            r0.d = r3
            java.lang.Object r15 = r14.a(r15, r0)
            if (r15 != r1) goto L2e
        La0:
            return r1
        La1:
            vg6 r15 = (defpackage.vg6) r15
            java.util.List r15 = r15.a
            int r2 = r15.size()
            r6 = r4
        Laa:
            if (r6 >= r2) goto L46
            java.lang.Object r7 = r15.get(r6)
            ah6 r7 = (defpackage.ah6) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto Lba
        Lb8:
            r13 = 0
            return r13
        Lba:
            int r6 = r6 + 1
            goto Laa
        Lbd:
            int r6 = r6 + 1
            goto L5f
        Lc0:
            java.lang.Object r13 = r15.get(r4)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.p.j(androidx.compose.ui.input.pointer.e, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }
}
