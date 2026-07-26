package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.ab5;
import defpackage.ah6;
import defpackage.eh6;
import defpackage.g51;
import defpackage.hx4;
import defpackage.ph8;
import defpackage.qp2;
import defpackage.so1;
import defpackage.tx8;
import defpackage.vd7;
import defpackage.yg7;
import defpackage.zg7;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final vd7 a = new vd7(14);
    public static final yg7 b = new yg7();
    public static final so1 c = new so1(2);
    public static final zg7 d = new zg7();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.foundation.gestures.o r10, long r11, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            boolean r0 = r13 instanceof androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1 r0 = (androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1 r0 = new androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.jvm.internal.Ref$FloatRef r10 = r0.b
            androidx.compose.foundation.gestures.o r11 = r0.a
            kotlin.b.b(r13)
            r8 = r10
            r10 = r11
            goto L55
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            kotlin.b.b(r13)
            kotlin.jvm.internal.Ref$FloatRef r8 = new kotlin.jvm.internal.Ref$FloatRef
            r8.<init>()
            androidx.compose.foundation.MutatePriority r13 = androidx.compose.foundation.MutatePriority.a
            androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2 r4 = new androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2
            r9 = 0
            r5 = r10
            r6 = r11
            r4.<init>(r5, r6, r8, r9)
            r0.a = r5
            r0.b = r8
            r0.d = r3
            java.lang.Object r10 = r5.f(r13, r4, r0)
            if (r10 != r1) goto L54
            return r1
        L54:
            r10 = r5
        L55:
            float r11 = r8.a
            long r10 = r10.h(r11)
            nr5 r12 = new nr5
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.h.a(androidx.compose.foundation.gestures.o, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final boolean b(androidx.compose.ui.input.pointer.e eVar) {
        List list = eVar.f.s.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((ah6) list.get(i)).d) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (b(r7) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0049 -> B:19:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(androidx.compose.ui.input.pointer.e r7, androidx.compose.ui.input.pointer.PointerEventPass r8, kotlin.coroutines.jvm.internal.BaseContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            androidx.compose.ui.input.pointer.PointerEventPass r7 = r0.b
            androidx.compose.ui.input.pointer.e r8 = r0.a
            kotlin.b.b(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L4c
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.b.b(r9)
            boolean r9 = b(r7)
            if (r9 != 0) goto L65
        L3f:
            r0.a = r7
            r0.b = r8
            r0.d = r3
            java.lang.Object r9 = r7.a(r8, r0)
            if (r9 != r1) goto L4c
            return r1
        L4c:
            vg6 r9 = (defpackage.vg6) r9
            java.util.List r9 = r9.a
            int r2 = r9.size()
            r4 = 0
        L55:
            if (r4 >= r2) goto L65
            java.lang.Object r5 = r9.get(r4)
            ah6 r5 = (defpackage.ah6) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L62
            goto L3f
        L62:
            int r4 = r4 + 1
            goto L55
        L65:
            tx8 r7 = defpackage.tx8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.h.c(androidx.compose.ui.input.pointer.e, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(androidx.compose.ui.input.pointer.e r4, defpackage.ql4 r5, kotlin.coroutines.jvm.internal.BaseContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1 r0 = (androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1 r0 = new androidx.compose.foundation.gestures.TransformableKt$awaitCtrlMouseScrollOrNull$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ql4 r5 = r0.b
            androidx.compose.ui.input.pointer.e r4 = r0.a
            kotlin.b.b(r6)
            goto L43
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.b.b(r6)
            r0.a = r4
            r0.b = r5
            r0.d = r3
            java.lang.Object r6 = defpackage.t61.b(r4, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            vg6 r6 = (defpackage.vg6) r6
            int r0 = r6.e
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L7a
            int r0 = r6.f
            r1 = 6
            if (r0 != r1) goto L7a
            androidx.compose.ui.input.pointer.f r0 = r4.f
            long r4 = r5.x(r4, r6)
            r0 = 0
            boolean r0 = defpackage.nr5.c(r4, r0)
            if (r0 == 0) goto L5f
            goto L7a
        L5f:
            java.util.List r6 = r6.a
            int r0 = r6.size()
            r1 = 0
        L66:
            if (r1 >= r0) goto L74
            java.lang.Object r2 = r6.get(r1)
            ah6 r2 = (defpackage.ah6) r2
            r2.a()
            int r1 = r1 + 1
            goto L66
        L74:
            nr5 r6 = new nr5
            r6.<init>(r4)
            return r6
        L7a:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.h.d(androidx.compose.ui.input.pointer.e, ql4, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    public static final Object e(eh6 eh6Var, qp2 qp2Var, g51 g51Var) {
        Object objC0 = ((androidx.compose.ui.input.pointer.f) eh6Var).C0(new ForEachGestureKt$awaitEachGesture$2(g51Var.getContext(), qp2Var, null), g51Var);
        return objC0 == CoroutineSingletons.a ? objC0 : tx8.a;
    }

    public static hx4 f(ph8 ph8Var, Orientation orientation, boolean z, boolean z2, ab5 ab5Var) {
        return new k(ph8Var, orientation, z, z2, ab5Var);
    }

    public static Object g(SuspendLambda suspendLambda) {
        MutatePriority mutatePriority = MutatePriority.a;
        new ScrollExtensionsKt$stopScroll$2(2, null);
        throw null;
    }
}
