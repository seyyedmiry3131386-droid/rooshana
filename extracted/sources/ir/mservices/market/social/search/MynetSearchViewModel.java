package ir.mservices.market.social.search;

import defpackage.bj2;
import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.jd7;
import defpackage.js3;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.y97;
import ir.mservices.market.social.search.MynetSearchAction;
import ir.mservices.market.viewModel.a;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class MynetSearchViewModel extends a {
    public final jd7 v;
    public final rv6 w;

    /* JADX INFO: renamed from: ir.mservices.market.social.search.MynetSearchViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.search.MynetSearchViewModel$1", f = "MynetSearchViewModel.kt", l = {47}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MynetSearchViewModel.this.new AnonymousClass1(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            tx8 tx8Var = tx8.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                return tx8Var;
            }
            b.b(obj);
            MynetSearchViewModel mynetSearchViewModel = MynetSearchViewModel.this;
            pv6 pv6Var = mynetSearchViewModel.u;
            bj2 bj2Var = new bj2(22, mynetSearchViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new pt1(bj2Var, 23), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MynetSearchViewModel(jd7 jd7Var) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        this.v = jd7Var;
        this.w = jd7Var.c(null, "first_call");
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFirstCallAction(MynetSearchAction.FirstCallAction firstCallAction) {
        this.v.d(Boolean.valueOf(firstCallAction.getFirstCall()), "first_call");
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        bt2.G(y97.G(this), null, null, new MynetSearchViewModel$doRequest$1(this, null), 3);
    }
}
