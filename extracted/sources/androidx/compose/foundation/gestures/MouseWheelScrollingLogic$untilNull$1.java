package androidx.compose.foundation.gestures;

import defpackage.g51;
import defpackage.hk3;
import defpackage.io7;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1", f = "MouseWheelScrollable.kt", l = {207}, m = "invokeSuspend", v = 1)
final class MouseWheelScrollingLogic$untilNull$1 extends RestrictedSuspendLambda implements qp2 {
    public Object b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ hk3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$untilNull$1(hk3 hk3Var, g51 g51Var) {
        super(2, g51Var);
        this.e = hk3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        MouseWheelScrollingLogic$untilNull$1 mouseWheelScrollingLogic$untilNull$1 = new MouseWheelScrollingLogic$untilNull$1(this.e, g51Var);
        mouseWheelScrollingLogic$untilNull$1.d = obj;
        return mouseWheelScrollingLogic$untilNull$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MouseWheelScrollingLogic$untilNull$1) create((io7) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0037 -> B:14:0x0038). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r4.c
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r4.b
            java.lang.Object r3 = r4.d
            io7 r3 = (defpackage.io7) r3
            kotlin.b.b(r5)
            goto L38
        L13:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1b:
            kotlin.b.b(r5)
            java.lang.Object r5 = r4.d
            io7 r5 = (defpackage.io7) r5
            r3 = r5
        L23:
            hk3 r5 = r4.e
            java.lang.Object r5 = r5.invoke()
            if (r5 == 0) goto L37
            r4.d = r3
            r4.b = r5
            r4.c = r2
            r3.b(r4, r5)
            kotlin.coroutines.intrinsics.CoroutineSingletons r5 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            return r0
        L37:
            r1 = 0
        L38:
            if (r1 != 0) goto L23
            tx8 r5 = defpackage.tx8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
