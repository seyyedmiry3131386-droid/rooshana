package ir.mservices.market.app.detail.update;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.app.detail.update.data.InAppUpdateData;
import ir.mservices.market.version2.download.DownloadDataModel;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.update.InAppUpdateViewModel$startDownloadFlow$1$3", f = "InAppUpdateViewModel.kt", l = {95}, m = "invokeSuspend", v = 1)
final class InAppUpdateViewModel$startDownloadFlow$1$3 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ InAppUpdateViewModel b;
    public final /* synthetic */ InAppUpdateData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUpdateViewModel$startDownloadFlow$1$3(InAppUpdateViewModel inAppUpdateViewModel, InAppUpdateData inAppUpdateData, g51 g51Var) {
        super(2, g51Var);
        this.b = inAppUpdateViewModel;
        this.c = inAppUpdateData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new InAppUpdateViewModel$startDownloadFlow$1$3(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((InAppUpdateViewModel$startDownloadFlow$1$3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            i iVar = this.b.y;
            InAppUpdateData inAppUpdateData = this.c;
            DownloadDataModel downloadDataModel = new DownloadDataModel(inAppUpdateData, inAppUpdateData.n, inAppUpdateData.o);
            this.a = 1;
            if (iVar.emit(downloadDataModel, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
