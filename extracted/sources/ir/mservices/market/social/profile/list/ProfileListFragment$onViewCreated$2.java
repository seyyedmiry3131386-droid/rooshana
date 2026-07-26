package ir.mservices.market.social.profile.list;

import androidx.fragment.app.d;
import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.common.data.ErrorMessage;
import ir.mservices.market.social.list.common.ProfileAddListToOwnProfileDialogFragment;
import ir.mservices.market.social.profile.list.ProfileListAction;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.list.ProfileListFragment$onViewCreated$2", f = "ProfileListFragment.kt", l = {278}, m = "invokeSuspend", v = 1)
final class ProfileListFragment$onViewCreated$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ ProfileListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.list.ProfileListFragment$onViewCreated$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.list.ProfileListFragment$onViewCreated$2$1", f = "ProfileListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ ProfileListFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProfileListFragment profileListFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = profileListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ErrorMessage) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String strM;
            ErrorMessage errorMessage = (ErrorMessage) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            int i = ProfileListFragment.Z0;
            ProfileListFragment profileListFragment = this.b;
            d dVarG = profileListFragment.J0.g();
            ProfileAddListToOwnProfileDialogFragment profileAddListToOwnProfileDialogFragment = dVarG instanceof ProfileAddListToOwnProfileDialogFragment ? (ProfileAddListToOwnProfileDialogFragment) dVarG : null;
            if (profileAddListToOwnProfileDialogFragment != null) {
                if (errorMessage instanceof ErrorMessage.PlainText) {
                    strM = ((ErrorMessage.PlainText) errorMessage).getText();
                } else if (errorMessage instanceof ErrorMessage.Resource) {
                    strM = profileListFragment.L(((ErrorMessage.Resource) errorMessage).getResId());
                    js3.o(strM, "getString(...)");
                } else {
                    if (!(errorMessage instanceof ErrorMessage.ResourceFormatted)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ErrorMessage.ResourceFormatted resourceFormatted = (ErrorMessage.ResourceFormatted) errorMessage;
                    int resId = resourceFormatted.getResId();
                    Object[] args = resourceFormatted.getArgs();
                    strM = profileListFragment.M(resId, Arrays.copyOf(args, args.length));
                    js3.o(strM, "getString(...)");
                }
                profileAddListToOwnProfileDialogFragment.V0(strM);
            }
            profileListFragment.V0().r(new ProfileListAction.ErrorAction(null));
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileListFragment$onViewCreated$2(ProfileListFragment profileListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = profileListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new ProfileListFragment$onViewCreated$2(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((ProfileListFragment$onViewCreated$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = ProfileListFragment.Z0;
            ProfileListFragment profileListFragment = this.b;
            o4 o4Var = new o4(profileListFragment.V0().G, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(profileListFragment, null);
            this.a = 1;
            if (kotlinx.coroutines.flow.d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
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
