package ir.mservices.market.app.update;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.r82;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.UpdateViewModel$fastDownloadClick$1", f = "UpdateViewModel.kt", l = {452}, m = "invokeSuspend", v = 1)
final class UpdateViewModel$fastDownloadClick$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ UpdateViewModel b;
    public final /* synthetic */ r82 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateViewModel$fastDownloadClick$1(UpdateViewModel updateViewModel, r82 r82Var, boolean z, g51 g51Var) {
        super(2, g51Var);
        this.b = updateViewModel;
        this.c = r82Var;
        this.d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new UpdateViewModel$fastDownloadClick$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateViewModel$fastDownloadClick$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            i iVar = this.b.P;
            Pair pair = new Pair(this.c.b, Boolean.valueOf(!this.d));
            this.a = 1;
            if (iVar.emit(pair, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
