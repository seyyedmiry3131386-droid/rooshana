package ir.myket.network.server;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.network.server.ServerMonitor$signalNetworkSuccess$1$1", f = "ServerMonitor.kt", l = {132, 134}, m = "invokeSuspend", v = 1)
final class ServerMonitor$signalNetworkSuccess$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerMonitor$signalNetworkSuccess$1$1(boolean z, b bVar, g51 g51Var) {
        super(2, g51Var);
        this.b = z;
        this.c = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ServerMonitor$signalNetworkSuccess$1$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ServerMonitor$signalNetworkSuccess$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r1.b(4, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r1.a(1, r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r4.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L15:
            kotlin.b.b(r5)
            goto L35
        L19:
            kotlin.b.b(r5)
            boolean r5 = r4.b
            ir.myket.network.server.b r1 = r4.c
            if (r5 == 0) goto L2c
            r4.a = r3
            r5 = 4
            java.lang.Object r5 = r1.b(r5, r4)
            if (r5 != r0) goto L35
            goto L34
        L2c:
            r4.a = r2
            java.lang.Object r5 = r1.a(r3, r4)
            if (r5 != r0) goto L35
        L34:
            return r0
        L35:
            tx8 r5 = defpackage.tx8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.myket.network.server.ServerMonitor$signalNetworkSuccess$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
