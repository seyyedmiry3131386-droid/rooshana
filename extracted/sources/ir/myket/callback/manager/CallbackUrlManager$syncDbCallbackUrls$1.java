package ir.myket.callback.manager;

import defpackage.e71;
import defpackage.g51;
import defpackage.pb1;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.callback.manager.CallbackUrlManager$syncDbCallbackUrls$1", f = "CallbackUrlManager.kt", l = {38, 43}, m = "invokeSuspend", v = 1)
final class CallbackUrlManager$syncDbCallbackUrls$1 extends SuspendLambda implements qp2 {
    public pb1 a;
    public a b;
    public Iterator c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackUrlManager$syncDbCallbackUrls$1(a aVar, g51 g51Var) {
        super(2, g51Var);
        this.h = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new CallbackUrlManager$syncDbCallbackUrls$1(this.h, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CallbackUrlManager$syncDbCallbackUrls$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if (r9 == r0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r8.g
            ir.myket.callback.manager.a r2 = r8.h
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L29
            if (r1 != r3) goto L21
            int r1 = r8.f
            int r2 = r8.e
            int r4 = r8.d
            java.util.Iterator r5 = r8.c
            ir.myket.callback.manager.a r6 = r8.b
            pb1 r7 = r8.a
            kotlin.b.b(r9)
            r9 = r4
            r4 = r2
            r2 = r6
            goto L5f
        L21:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L29:
            kotlin.b.b(r9)
            goto L49
        L2d:
            kotlin.b.b(r9)
            rr2 r9 = r2.d
            r8.g = r4
            wl0 r9 = r9.g
            xl0 r9 = (defpackage.xl0) r9
            ug1 r1 = defpackage.up1.a
            kf1 r1 = defpackage.kf1.c
            ir.myket.callback.data.repositories.CallbackUrlRepositoryImpl$getAllCallbackUrls$$inlined$safeDbCall$default$1 r4 = new ir.myket.callback.data.repositories.CallbackUrlRepositoryImpl$getAllCallbackUrls$$inlined$safeDbCall$default$1
            r5 = 0
            r4.<init>(r5, r9)
            java.lang.Object r9 = defpackage.bt2.Z(r1, r4, r8)
            if (r9 != r0) goto L49
            goto L7f
        L49:
            pb1 r9 = (defpackage.pb1) r9
            boolean r1 = r9 instanceof defpackage.ob1
            if (r1 == 0) goto L80
            r1 = r9
            ob1 r1 = (defpackage.ob1) r1
            java.lang.Object r1 = r1.a
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
            r4 = 0
            r7 = r9
            r5 = r1
            r9 = r4
            r1 = r9
        L5f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L80
            java.lang.Object r6 = r5.next()
            ql0 r6 = (defpackage.ql0) r6
            r8.a = r7
            r8.b = r2
            r8.c = r5
            r8.d = r9
            r8.e = r4
            r8.f = r1
            r8.g = r3
            java.lang.Object r6 = ir.myket.callback.manager.a.a(r2, r6, r8)
            if (r6 != r0) goto L5f
        L7f:
            return r0
        L80:
            tx8 r9 = defpackage.tx8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.callback.manager.CallbackUrlManager$syncDbCallbackUrls$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
