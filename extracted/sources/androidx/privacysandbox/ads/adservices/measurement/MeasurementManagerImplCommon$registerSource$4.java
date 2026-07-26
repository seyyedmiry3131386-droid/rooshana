package androidx.privacysandbox.ads.adservices.measurement;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", f = "MeasurementManagerImplCommon.kt", l = {}, m = "invokeSuspend")
public final class MeasurementManagerImplCommon$registerSource$4 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MeasurementManagerImplCommon b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeasurementManagerImplCommon$registerSource$4(MeasurementManagerImplCommon measurementManagerImplCommon, g51 g51Var) {
        super(2, g51Var);
        this.b = measurementManagerImplCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        MeasurementManagerImplCommon$registerSource$4 measurementManagerImplCommon$registerSource$4 = new MeasurementManagerImplCommon$registerSource$4(this.b, g51Var);
        measurementManagerImplCommon$registerSource$4.a = obj;
        return measurementManagerImplCommon$registerSource$4;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((MeasurementManagerImplCommon$registerSource$4) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        throw null;
    }
}
