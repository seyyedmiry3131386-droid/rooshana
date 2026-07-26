package ir.mservices.market.app.detail.model;

import defpackage.dp2;
import defpackage.g51;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v24;
import ir.mservices.market.app.detail.ui.Utm;
import ir.mservices.market.data.StartApplicationData;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.model.AppDetailRepositoryImpl$getApplicationDetail$1$1", f = "AppDetailRepositoryImpl.kt", l = {83, 92}, m = "invokeSuspend", v = 1)
final class AppDetailRepositoryImpl$getApplicationDetail$1$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ StartApplicationData b;
    public final /* synthetic */ v24 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ String f;
    public final /* synthetic */ int g;
    public final /* synthetic */ float h;
    public final /* synthetic */ String i;
    public final /* synthetic */ Utm j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDetailRepositoryImpl$getApplicationDetail$1$1(StartApplicationData startApplicationData, v24 v24Var, String str, Object obj, String str2, int i, float f, String str3, Utm utm, String str4, g51 g51Var) {
        super(1, g51Var);
        this.b = startApplicationData;
        this.c = v24Var;
        this.d = str;
        this.e = obj;
        this.f = str2;
        this.g = i;
        this.h = f;
        this.i = str3;
        this.j = utm;
        this.k = str4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new AppDetailRepositoryImpl$getApplicationDetail$1$1(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((AppDetailRepositoryImpl$getApplicationDetail$1$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x020f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r53) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.detail.model.AppDetailRepositoryImpl$getApplicationDetail$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
