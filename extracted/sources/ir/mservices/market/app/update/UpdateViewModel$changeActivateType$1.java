package ir.mservices.market.app.update;

import defpackage.bk3;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.s6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.UpdateViewModel$changeActivateType$1", f = "UpdateViewModel.kt", l = {590}, m = "invokeSuspend", v = 1)
final class UpdateViewModel$changeActivateType$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ UpdateViewModel b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    /* JADX INFO: renamed from: ir.mservices.market.app.update.UpdateViewModel$changeActivateType$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.update.UpdateViewModel$changeActivateType$1$1", f = "UpdateViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ UpdateViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UpdateViewModel updateViewModel, g51 g51Var) {
            super(2, g51Var);
            this.b = updateViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((bk3) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            bk3 bk3Var = (bk3) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            this.b.toggleUpdateState(bk3Var);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateViewModel$changeActivateType$1(UpdateViewModel updateViewModel, String str, boolean z, g51 g51Var) {
        super(2, g51Var);
        this.b = updateViewModel;
        this.c = str;
        this.d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new UpdateViewModel$changeActivateType$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateViewModel$changeActivateType$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            UpdateViewModel updateViewModel = this.b;
            xe2 xe2VarZ0 = updateViewModel.M.z0(new s6(this.c, !this.d));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(updateViewModel, null);
            this.a = 1;
            if (d.f(xe2VarZ0, anonymousClass1, this) == coroutineSingletons) {
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
