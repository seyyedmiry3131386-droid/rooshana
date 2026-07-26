package ir.mservices.market.login.ui;

import defpackage.dp2;
import defpackage.fu7;
import defpackage.g51;
import defpackage.js3;
import defpackage.ln1;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.login.ui.BaseLoginDialogFragment$handleData$1", f = "BaseLoginDialogFragment.kt", l = {154}, m = "invokeSuspend", v = 1)
final class BaseLoginDialogFragment$handleData$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ BaseLoginDialogFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.login.ui.BaseLoginDialogFragment$handleData$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.login.ui.BaseLoginDialogFragment$handleData$1$1", f = "BaseLoginDialogFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ BaseLoginDialogFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseLoginDialogFragment baseLoginDialogFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = baseLoginDialogFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((String) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            this.b.c1(str);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseLoginDialogFragment$handleData$1(BaseLoginDialogFragment baseLoginDialogFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = baseLoginDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new BaseLoginDialogFragment$handleData$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((BaseLoginDialogFragment$handleData$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            BaseLoginDialogFragment baseLoginDialogFragment = this.b;
            ln1 ln1Var = baseLoginDialogFragment.i1;
            js3.m(ln1Var);
            fu7 itemClickFlow = ln1Var.A.getItemClickFlow();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(baseLoginDialogFragment, null);
            this.a = 1;
            if (d.f(itemClickFlow, anonymousClass1, this) == coroutineSingletons) {
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
