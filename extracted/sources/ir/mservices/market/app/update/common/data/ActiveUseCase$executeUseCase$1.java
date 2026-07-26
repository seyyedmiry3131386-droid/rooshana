package ir.mservices.market.app.update.common.data;

import defpackage.g51;
import defpackage.qp2;
import defpackage.s6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.common.data.ActiveUseCase$executeUseCase$1", f = "ActiveUseCase.kt", l = {23, 25}, m = "invokeSuspend", v = 1)
final class ActiveUseCase$executeUseCase$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a c;
    public final /* synthetic */ s6 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveUseCase$executeUseCase$1(a aVar, s6 s6Var, g51 g51Var) {
        super(2, g51Var);
        this.c = aVar;
        this.d = s6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        ActiveUseCase$executeUseCase$1 activeUseCase$executeUseCase$1 = new ActiveUseCase$executeUseCase$1(this.c, this.d, g51Var);
        activeUseCase$executeUseCase$1.b = obj;
        return activeUseCase$executeUseCase$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ActiveUseCase$executeUseCase$1) create((ze2) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            ze2 r0 = (defpackage.ze2) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r8.a
            ir.mservices.market.app.update.common.data.a r3 = r8.c
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L22
            if (r2 == r5) goto L1e
            if (r2 != r4) goto L16
            kotlin.b.b(r9)
            goto L68
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            kotlin.b.b(r9)
            goto L3c
        L22:
            kotlin.b.b(r9)
            xg5 r9 = r3.g
            s6 r2 = r8.d
            java.lang.String r6 = r2.a
            boolean r2 = r2.b
            r8.b = r0
            r8.a = r5
            java.lang.Object r9 = r9.b
            ir.mservices.market.app.update.common.manager.b r9 = (ir.mservices.market.app.update.common.manager.b) r9
            java.lang.Object r9 = r9.a(r6, r2, r8)
            if (r9 != r1) goto L3c
            goto L67
        L3c:
            bk3 r9 = (defpackage.bk3) r9
            java.lang.String r2 = r9.a
            r5 = 0
            if (r2 == 0) goto L5d
            wt r3 = r3.h
            boolean r6 = r9.b
            ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl r3 = (ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl) r3
            r3.getClass()
            kotlinx.coroutines.flow.l r3 = r3.d
            kotlin.Pair r7 = new kotlin.Pair
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r7.<init>(r2, r6)
            r3.getClass()
            r3.p(r5, r7)
        L5d:
            r8.b = r5
            r8.a = r4
            java.lang.Object r9 = r0.emit(r9, r8)
            if (r9 != r1) goto L68
        L67:
            return r1
        L68:
            tx8 r9 = defpackage.tx8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.update.common.data.ActiveUseCase$executeUseCase$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
