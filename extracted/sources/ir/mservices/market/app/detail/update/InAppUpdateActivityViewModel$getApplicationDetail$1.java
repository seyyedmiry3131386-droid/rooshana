package ir.mservices.market.app.detail.update;

import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.update.InAppUpdateActivityViewModel$getApplicationDetail$1", f = "InAppUpdateActivityViewModel.kt", l = {46, MutationPayload$DisplayCommandV2.DRAWRENDEREDITABLEPAYLOAD_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
final class InAppUpdateActivityViewModel$getApplicationDetail$1 extends SuspendLambda implements qp2 {
    public l a;
    public int b;
    public final /* synthetic */ InAppUpdateActivityViewModel c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ float f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUpdateActivityViewModel$getApplicationDetail$1(InAppUpdateActivityViewModel inAppUpdateActivityViewModel, String str, int i, float f, String str2, g51 g51Var) {
        super(2, g51Var);
        this.c = inAppUpdateActivityViewModel;
        this.d = str;
        this.e = i;
        this.f = f;
        this.g = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new InAppUpdateActivityViewModel$getApplicationDetail$1(this.c, this.d, this.e, this.f, this.g, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((InAppUpdateActivityViewModel$getApplicationDetail$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.detail.update.InAppUpdateActivityViewModel$getApplicationDetail$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
