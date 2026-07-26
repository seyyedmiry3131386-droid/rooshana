package androidx.compose.foundation.text.contextmenu.gestures;

import androidx.compose.ui.input.pointer.e;
import defpackage.dp2;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$onRightClickDown$2", f = "RightClickGestures.kt", l = {32, 35}, m = "invokeSuspend", v = 1)
final class RightClickGesturesKt$onRightClickDown$2 extends RestrictedSuspendLambda implements qp2 {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dp2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RightClickGesturesKt$onRightClickDown$2(g51 g51Var, dp2 dp2Var) {
        super(2, g51Var);
        this.d = dp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        RightClickGesturesKt$onRightClickDown$2 rightClickGesturesKt$onRightClickDown$2 = new RightClickGesturesKt$onRightClickDown$2(g51Var, this.d);
        rightClickGesturesKt$onRightClickDown$2.c = obj;
        return rightClickGesturesKt$onRightClickDown$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((RightClickGesturesKt$onRightClickDown$2) create((e) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.b.b(r6)
            goto L54
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            java.lang.Object r1 = r5.c
            androidx.compose.ui.input.pointer.e r1 = (androidx.compose.ui.input.pointer.e) r1
            kotlin.b.b(r6)
            goto L33
        L20:
            kotlin.b.b(r6)
            java.lang.Object r6 = r5.c
            r1 = r6
            androidx.compose.ui.input.pointer.e r1 = (androidx.compose.ui.input.pointer.e) r1
            r5.c = r1
            r5.b = r3
            java.lang.Object r6 = androidx.compose.foundation.text.contextmenu.gestures.a.a(r1, r5)
            if (r6 != r0) goto L33
            goto L53
        L33:
            ah6 r6 = (defpackage.ah6) r6
            r6.a()
            long r3 = r6.c
            nr5 r6 = new nr5
            r6.<init>(r3)
            dp2 r3 = r5.d
            r3.invoke(r6)
            r6 = 0
            r5.c = r6
            r5.b = r2
            rp2 r6 = androidx.compose.foundation.gestures.p.a
            androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.b
            java.lang.Object r6 = androidx.compose.foundation.gestures.p.j(r1, r6, r5)
            if (r6 != r0) goto L54
        L53:
            return r0
        L54:
            ah6 r6 = (defpackage.ah6) r6
            if (r6 == 0) goto L5b
            r6.a()
        L5b:
            tx8 r6 = defpackage.tx8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$onRightClickDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
