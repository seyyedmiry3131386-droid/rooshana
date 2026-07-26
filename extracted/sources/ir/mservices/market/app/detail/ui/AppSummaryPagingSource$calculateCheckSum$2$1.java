package ir.mservices.market.app.detail.ui;

import defpackage.a77;
import defpackage.dp3;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.k68;
import defpackage.lw;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xb5;
import ir.mservices.market.app.detail.data.SummarySizeDto;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.ui.AppSummaryPagingSource$calculateCheckSum$2$1", f = "AppSummaryPagingSource.kt", l = {}, m = "invokeSuspend", v = 1)
final class AppSummaryPagingSource$calculateCheckSum$2$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ b a;
    public final /* synthetic */ SummarySizeDto b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSummaryPagingSource$calculateCheckSum$2$1(b bVar, SummarySizeDto summarySizeDto, g51 g51Var) {
        super(2, g51Var);
        this.a = bVar;
        this.b = summarySizeDto;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppSummaryPagingSource$calculateCheckSum$2$1(this.a, this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        AppSummaryPagingSource$calculateCheckSum$2$1 appSummaryPagingSource$calculateCheckSum$2$1 = (AppSummaryPagingSource$calculateCheckSum$2$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        appSummaryPagingSource$calculateCheckSum$2$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        b bVar = this.a;
        xb5 xb5Var = bVar.c;
        String str = bVar.b;
        String strI = null;
        try {
            String strB = dp3.B(str);
            try {
                String str2 = k68.e;
                strI = a77.i(strB);
            } catch (Exception e) {
                lw.g(e, "Exception in computing checksum", "packageName=".concat(str));
            }
        } catch (Exception unused) {
        }
        SummarySizeDto summarySizeDto = this.b;
        ((l) xb5Var).o(js3.i(strI, summarySizeDto.getDiffChecksum()) ? summarySizeDto.getDiff() : summarySizeDto.getActual());
        return tx8.a;
    }
}
