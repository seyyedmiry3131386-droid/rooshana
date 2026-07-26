package ir.mservices.market.app.detail.ui;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.ui.AppDetailViewModel$shareApp$1", f = "AppDetailViewModel.kt", l = {1241, 1244, 1248}, m = "invokeSuspend", v = 1)
final class AppDetailViewModel$shareApp$1 extends SuspendLambda implements qp2 {
    public AppDetailViewModel a;
    public Object b;
    public int c;
    public int d;
    public final /* synthetic */ AppDetailViewModel e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDetailViewModel$shareApp$1(AppDetailViewModel appDetailViewModel, g51 g51Var) {
        super(2, g51Var);
        this.e = appDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppDetailViewModel$shareApp$1(this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppDetailViewModel$shareApp$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        if (r2.emit(r4, r14) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c5, code lost:
    
        if (r3.emit("", r14) == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.detail.ui.AppDetailViewModel$shareApp$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
