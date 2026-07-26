package ir.mservices.market.myAccount;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myAccount.BaseMyAccountViewModel$updateAvatar$1", f = "BaseMyAccountViewModel.kt", l = {147}, m = "invokeSuspend", v = 1)
final class BaseMyAccountViewModel$updateAvatar$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ BaseMyAccountViewModel b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMyAccountViewModel$updateAvatar$1(BaseMyAccountViewModel baseMyAccountViewModel, boolean z, g51 g51Var) {
        super(2, g51Var);
        this.b = baseMyAccountViewModel;
        this.c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new BaseMyAccountViewModel$updateAvatar$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseMyAccountViewModel$updateAvatar$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        BaseMyAccountViewModel baseMyAccountViewModel = this.b;
        if (i == 0) {
            b.b(obj);
            i iVar = baseMyAccountViewModel.w;
            Boolean boolValueOf = Boolean.valueOf(this.c);
            this.a = 1;
            if (iVar.emit(boolValueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        l lVar = baseMyAccountViewModel.D;
        do {
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.TRUE));
        return tx8.a;
    }
}
