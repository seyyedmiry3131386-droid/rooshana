package ir.myket.callback.data.repositories;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xl0;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.callback.data.repositories.CallbackUrlRepositoryImpl$getAllCallbackUrls$$inlined$safeDbCall$default$1", f = "CallbackUrlRepositoryImpl.kt", l = {57, 58}, m = "invokeSuspend", v = 1)
public final class CallbackUrlRepositoryImpl$getAllCallbackUrls$$inlined$safeDbCall$default$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ xl0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackUrlRepositoryImpl$getAllCallbackUrls$$inlined$safeDbCall$default$1(g51 g51Var, xl0 xl0Var) {
        super(2, g51Var);
        this.b = xl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new CallbackUrlRepositoryImpl$getAllCallbackUrls$$inlined$safeDbCall$default$1(g51Var, this.b);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CallbackUrlRepositoryImpl$getAllCallbackUrls$$inlined$safeDbCall$default$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r8 == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r7.a
            xl0 r2 = r7.b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L27
            if (r1 == r5) goto L21
            if (r1 != r4) goto L19
            kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            goto L59
        L13:
            r8 = move-exception
            goto L84
        L16:
            r8 = move-exception
            goto L8d
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            int r1 = r7.c
            kotlin.b.b(r8)     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            goto L45
        L27:
            kotlin.b.b(r8)
            r7.c = r3     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            r7.a = r5     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            ug1 r8 = defpackage.up1.a     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            kf1 r8 = defpackage.kf1.c     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            ir.myket.callback.data.repositories.CallbackUrlRepositoryImpl$refineDbCallbackUrls$$inlined$safeDbCall$default$1 r1 = new ir.myket.callback.data.repositories.CallbackUrlRepositoryImpl$refineDbCallbackUrls$$inlined$safeDbCall$default$1     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            r6 = 0
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            java.lang.Object r8 = defpackage.bt2.Z(r8, r1, r7)     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            if (r8 != r0) goto L3f
            goto L41
        L3f:
            tx8 r8 = defpackage.tx8.a     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
        L41:
            if (r8 != r0) goto L44
            goto L58
        L44:
            r1 = r3
        L45:
            ul0 r8 = r2.b     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            r7.c = r1     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            r7.a = r4     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            androidx.room.d r8 = r8.a     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            sl0 r1 = new sl0     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            java.lang.Object r8 = androidx.room.util.a.b(r7, r1, r8, r5, r3)     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            if (r8 != r0) goto L59
        L58:
            return r0
        L59:
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            r1 = 10
            int r1 = defpackage.wu0.V(r8, r1)     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
        L6a:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            if (r1 == 0) goto L7e
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            vl0 r1 = (defpackage.vl0) r1     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            ql0 r1 = defpackage.tv8.E(r1)     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            r0.add(r1)     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            goto L6a
        L7e:
            ob1 r8 = new ob1     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L16
            return r8
        L84:
            r8.printStackTrace()
            mb1 r0 = new mb1
            r0.<init>(r8)
            return r0
        L8d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.callback.data.repositories.CallbackUrlRepositoryImpl$getAllCallbackUrls$$inlined$safeDbCall$default$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
