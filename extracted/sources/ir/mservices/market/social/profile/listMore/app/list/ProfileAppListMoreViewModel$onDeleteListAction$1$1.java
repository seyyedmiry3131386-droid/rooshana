package ir.mservices.market.social.profile.listMore.app.list;

import defpackage.e71;
import defpackage.g51;
import defpackage.h99;
import defpackage.l99;
import defpackage.n99;
import defpackage.qp2;
import defpackage.sr;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.social.profile.listMore.app.list.ProfileAppListMoreAction;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.listMore.app.list.ProfileAppListMoreViewModel$onDeleteListAction$1$1", f = "ProfileAppListMoreViewModel.kt", l = {138}, m = "invokeSuspend", v = 1)
public final class ProfileAppListMoreViewModel$onDeleteListAction$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ ProfileAppListMoreViewModel b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAppListMoreViewModel$onDeleteListAction$1$1(ProfileAppListMoreViewModel profileAppListMoreViewModel, String str, g51 g51Var) {
        super(2, g51Var);
        this.b = profileAppListMoreViewModel;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ProfileAppListMoreViewModel$onDeleteListAction$1$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileAppListMoreViewModel$onDeleteListAction$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        ProfileAppListMoreViewModel profileAppListMoreViewModel = this.b;
        l lVar = profileAppListMoreViewModel.K;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            sr srVar = profileAppListMoreViewModel.x;
            this.a = 1;
            obj = srVar.a(this.c, profileAppListMoreViewModel, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        n99 n99Var = (n99) obj;
        if (n99Var instanceof h99) {
            do {
                value2 = lVar.getValue();
                ((Boolean) value2).getClass();
            } while (!lVar.n(value2, Boolean.FALSE));
            profileAppListMoreViewModel.onToastAction(new ProfileAppListMoreAction.ToastAction(((h99) n99Var).a.getTranslatedMessage()));
        } else if (n99Var instanceof l99) {
            do {
                value = lVar.getValue();
                ((Boolean) value).getClass();
            } while (!lVar.n(value, Boolean.TRUE));
        }
        return tx8.a;
    }
}
