package androidx.compose.ui.platform;

import defpackage.bp2;
import defpackage.u58;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static final u58 a = new u58(new bp2() { // from class: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$LocalChainedPlatformTextInputInterceptor$1
        @Override // defpackage.bp2
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.q44 r4, defpackage.qp2 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1 r0 = (androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1 r0 = new androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r0.b
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 == r2) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            kotlin.KotlinNothingValueException r4 = defpackage.t61.q(r6)
            throw r4
        L30:
            kotlin.b.b(r6)
            r6 = r4
            gx4 r6 = (defpackage.gx4) r6
            gx4 r6 = r6.a
            boolean r6 = r6.n
            if (r6 == 0) goto L59
            androidx.compose.ui.node.Owner r6 = defpackage.y40.I(r4)
            androidx.compose.ui.node.h r4 = defpackage.y40.H(r4)
            o01 r4 = r4.D
            i56 r4 = (defpackage.i56) r4
            r4.getClass()
            u58 r1 = androidx.compose.ui.platform.q.a
            java.lang.Object r4 = defpackage.wu8.G(r4, r1)
            lo0 r4 = (defpackage.lo0) r4
            r0.b = r2
            b(r6, r4, r5, r0)
            return
        L59:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "establishTextInputSession called from an unattached node"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.q.a(q44, qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.node.Owner r3, defpackage.lo0 r4, defpackage.qp2 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r4 = r6 instanceof androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1
            if (r4 == 0) goto L13
            r4 = r6
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 r4 = (androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1) r4
            int r0 = r4.b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.b = r0
            goto L18
        L13:
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 r4 = new androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1
            r4.<init>(r6)
        L18:
            java.lang.Object r6 = r4.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r0 = r4.b
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L38
            if (r0 == r2) goto L33
            if (r0 == r1) goto L2e
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L2e:
            kotlin.KotlinNothingValueException r3 = defpackage.t61.q(r6)
            throw r3
        L33:
            kotlin.KotlinNothingValueException r3 = defpackage.t61.q(r6)
            throw r3
        L38:
            kotlin.b.b(r6)
            r4.b = r2
            androidx.compose.ui.platform.AndroidComposeView r3 = (androidx.compose.ui.platform.AndroidComposeView) r3
            r3.J(r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.q.b(androidx.compose.ui.node.Owner, lo0, qp2, kotlin.coroutines.jvm.internal.ContinuationImpl):void");
    }
}
