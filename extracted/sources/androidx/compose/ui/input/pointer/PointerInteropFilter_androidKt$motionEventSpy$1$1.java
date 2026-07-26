package androidx.compose.ui.input.pointer;

import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1", f = "PointerInteropFilter.android.kt", l = {389}, m = "invokeSuspend", v = 1)
final class PointerInteropFilter_androidKt$motionEventSpy$1$1 extends RestrictedSuspendLambda implements qp2 {
    public int b;
    public /* synthetic */ Object c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((PointerInteropFilter_androidKt$motionEventSpy$1$1) create((e) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:12:0x002e). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r3.b
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r1 = r3.c
            androidx.compose.ui.input.pointer.e r1 = (androidx.compose.ui.input.pointer.e) r1
            kotlin.b.b(r4)
            goto L2e
        L11:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L19:
            kotlin.b.b(r4)
            java.lang.Object r4 = r3.c
            androidx.compose.ui.input.pointer.e r4 = (androidx.compose.ui.input.pointer.e) r4
            r1 = r4
        L21:
            androidx.compose.ui.input.pointer.PointerEventPass r4 = androidx.compose.ui.input.pointer.PointerEventPass.a
            r3.c = r1
            r3.b = r2
            java.lang.Object r4 = r1.a(r4, r3)
            if (r4 != r0) goto L2e
            return r0
        L2e:
            vg6 r4 = (defpackage.vg6) r4
            android.view.MotionEvent r4 = r4.a()
            if (r4 != 0) goto L37
            goto L21
        L37:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
