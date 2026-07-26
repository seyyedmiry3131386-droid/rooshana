package ir.mservices.market.version2.manager.install;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.version2.manager.install.InstallQueue$removeAllInProgressApps$1$1", f = "InstallQueue.kt", l = {101, 102}, m = "invokeSuspend", v = 1)
final class InstallQueue$removeAllInProgressApps$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallQueue$removeAllInProgressApps$1$1(a aVar, String str, g51 g51Var) {
        super(2, g51Var);
        this.c = aVar;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        InstallQueue$removeAllInProgressApps$1$1 installQueue$removeAllInProgressApps$1$1 = new InstallQueue$removeAllInProgressApps$1$1(this.c, this.d, g51Var);
        installQueue$removeAllInProgressApps$1$1.b = obj;
        return installQueue$removeAllInProgressApps$1$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstallQueue$removeAllInProgressApps$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r0.emit("", r6) == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            ir.mservices.market.version2.manager.install.a r0 = r6.c
            kotlinx.coroutines.flow.i r0 = r0.a
            java.lang.Object r1 = r6.b
            e71 r1 = (defpackage.e71) r1
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r3 = r6.a
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L24
            if (r3 == r5) goto L20
            if (r3 != r4) goto L18
            kotlin.b.b(r7)
            goto L41
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L20:
            kotlin.b.b(r7)
            goto L34
        L24:
            kotlin.b.b(r7)
            r6.b = r1
            r6.a = r5
            java.lang.String r7 = r6.d
            java.lang.Object r7 = r0.emit(r7, r6)
            if (r7 != r2) goto L34
            goto L40
        L34:
            r6.b = r1
            r6.a = r4
            java.lang.String r7 = ""
            java.lang.Object r7 = r0.emit(r7, r6)
            if (r7 != r2) goto L41
        L40:
            return r2
        L41:
            r7 = 0
            defpackage.js3.j(r1, r7)
            tx8 r7 = defpackage.tx8.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.version2.manager.install.InstallQueue$removeAllInProgressApps$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
