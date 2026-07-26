package androidx.compose.foundation.gestures;

import defpackage.e49;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", l = {833, 836, 839}, m = "invokeSuspend", v = 1)
final class ScrollingLogic$onScrollStopped$performFling$1 extends SuspendLambda implements qp2 {
    public long a;
    public int b;
    public /* synthetic */ long c;
    public final /* synthetic */ o d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onScrollStopped$performFling$1(o oVar, g51 g51Var) {
        super(2, g51Var);
        this.d = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this.d, g51Var);
        scrollingLogic$onScrollStopped$performFling$1.c = ((e49) obj).a;
        return scrollingLogic$onScrollStopped$performFling$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        long j = ((e49) obj).a;
        ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this.d, (g51) obj2);
        scrollingLogic$onScrollStopped$performFling$1.c = j;
        return scrollingLogic$onScrollStopped$performFling$1.invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r14.b
            r2 = 3
            r3 = 2
            r4 = 1
            androidx.compose.foundation.gestures.o r5 = r14.d
            if (r1 == 0) goto L2f
            if (r1 == r4) goto L29
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            long r0 = r14.a
            long r2 = r14.c
            kotlin.b.b(r15)
            goto L71
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            long r3 = r14.a
            long r6 = r14.c
            kotlin.b.b(r15)
            goto L57
        L29:
            long r6 = r14.c
            kotlin.b.b(r15)
            goto L41
        L2f:
            kotlin.b.b(r15)
            long r6 = r14.c
            androidx.compose.ui.input.nestedscroll.a r15 = r5.f
            r14.c = r6
            r14.b = r4
            java.lang.Object r15 = r15.b(r6, r14)
            if (r15 != r0) goto L41
            goto L6e
        L41:
            e49 r15 = (defpackage.e49) r15
            long r8 = r15.a
            long r8 = defpackage.e49.d(r6, r8)
            r14.c = r6
            r14.a = r8
            r14.b = r3
            java.lang.Object r15 = r5.a(r8, r14)
            if (r15 != r0) goto L56
            goto L6e
        L56:
            r3 = r8
        L57:
            e49 r15 = (defpackage.e49) r15
            long r11 = r15.a
            androidx.compose.ui.input.nestedscroll.a r8 = r5.f
            long r9 = defpackage.e49.d(r3, r11)
            r14.c = r6
            r14.a = r11
            r14.b = r2
            r13 = r14
            java.lang.Object r15 = r8.a(r9, r11, r13)
            if (r15 != r0) goto L6f
        L6e:
            return r0
        L6f:
            r2 = r6
            r0 = r11
        L71:
            e49 r15 = (defpackage.e49) r15
            long r4 = r15.a
            long r0 = defpackage.e49.d(r0, r4)
            long r0 = defpackage.e49.d(r2, r0)
            e49 r15 = new e49
            r15.<init>(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
