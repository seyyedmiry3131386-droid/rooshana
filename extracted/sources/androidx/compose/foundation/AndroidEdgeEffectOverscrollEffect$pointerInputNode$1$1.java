package androidx.compose.foundation;

import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", f = "AndroidOverscroll.android.kt", l = {783, 787}, m = "invokeSuspend", v = 1)
final class AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1 extends RestrictedSuspendLambda implements qp2 {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ c d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1(c cVar, g51 g51Var) {
        super(2, g51Var);
        this.d = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1 androidEdgeEffectOverscrollEffect$pointerInputNode$1$1 = new AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1(this.d, g51Var);
        androidEdgeEffectOverscrollEffect$pointerInputNode$1$1.c = obj;
        return androidEdgeEffectOverscrollEffect$pointerInputNode$1$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1) create((androidx.compose.ui.input.pointer.e) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r12 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r12 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004b -> B:17:0x004e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r11.b
            r2 = 2
            androidx.compose.foundation.c r3 = r11.d
            r4 = 1
            if (r1 == 0) goto L26
            if (r1 == r4) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r11.c
            androidx.compose.ui.input.pointer.e r1 = (androidx.compose.ui.input.pointer.e) r1
            kotlin.b.b(r12)
            goto L4e
        L16:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1e:
            java.lang.Object r1 = r11.c
            androidx.compose.ui.input.pointer.e r1 = (androidx.compose.ui.input.pointer.e) r1
            kotlin.b.b(r12)
            goto L39
        L26:
            kotlin.b.b(r12)
            java.lang.Object r12 = r11.c
            r1 = r12
            androidx.compose.ui.input.pointer.e r1 = (androidx.compose.ui.input.pointer.e) r1
            r11.c = r1
            r11.b = r4
            java.lang.Object r12 = androidx.compose.foundation.gestures.p.c(r1, r11, r2)
            if (r12 != r0) goto L39
            goto L4d
        L39:
            ah6 r12 = (defpackage.ah6) r12
            long r4 = r12.a
            r3.h = r4
            long r4 = r12.c
            r3.b = r4
        L43:
            r11.c = r1
            r11.b = r2
            java.lang.Object r12 = defpackage.t61.b(r1, r11)
            if (r12 != r0) goto L4e
        L4d:
            return r0
        L4e:
            vg6 r12 = (defpackage.vg6) r12
            java.util.List r12 = r12.a
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r12.size()
            r4.<init>(r5)
            int r5 = r12.size()
            r6 = 0
            r7 = r6
        L61:
            if (r7 >= r5) goto L74
            java.lang.Object r8 = r12.get(r7)
            r9 = r8
            ah6 r9 = (defpackage.ah6) r9
            boolean r9 = r9.d
            if (r9 == 0) goto L71
            r4.add(r8)
        L71:
            int r7 = r7 + 1
            goto L61
        L74:
            int r12 = r4.size()
        L78:
            if (r6 >= r12) goto L8f
            java.lang.Object r5 = r4.get(r6)
            r7 = r5
            ah6 r7 = (defpackage.ah6) r7
            long r7 = r7.a
            long r9 = r3.h
            boolean r7 = defpackage.ct2.h(r7, r9)
            if (r7 == 0) goto L8c
            goto L90
        L8c:
            int r6 = r6 + 1
            goto L78
        L8f:
            r5 = 0
        L90:
            ah6 r5 = (defpackage.ah6) r5
            if (r5 != 0) goto L9b
            java.lang.Object r12 = kotlin.collections.a.p0(r4)
            r5 = r12
            ah6 r5 = (defpackage.ah6) r5
        L9b:
            if (r5 == 0) goto La5
            long r6 = r5.a
            r3.h = r6
            long r5 = r5.c
            r3.b = r5
        La5:
            boolean r12 = r4.isEmpty()
            if (r12 == 0) goto L43
            r0 = -1
            r3.h = r0
            tx8 r12 = defpackage.tx8.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
