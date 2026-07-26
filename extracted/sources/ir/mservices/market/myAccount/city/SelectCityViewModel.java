package ir.mservices.market.myAccount.city;

import defpackage.bt2;
import defpackage.e71;
import defpackage.f88;
import defpackage.g51;
import defpackage.hm7;
import defpackage.ja1;
import defpackage.js3;
import defpackage.ls0;
import defpackage.nm5;
import defpackage.og6;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.t61;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vy2;
import defpackage.y97;
import ir.mservices.market.myAccount.city.SelectCityAction;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class SelectCityViewModel extends ir.mservices.market.viewModel.a {
    public final i A;
    public final pv6 B;
    public final nm5 v;
    public final l w;
    public final rv6 x;
    public final l y;
    public final pv6 z;

    /* JADX INFO: renamed from: ir.mservices.market.myAccount.city.SelectCityViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.myAccount.city.SelectCityViewModel$1", f = "SelectCityViewModel.kt", l = {79}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return SelectCityViewModel.this.new AnonymousClass1(g51Var);
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
            SelectCityViewModel selectCityViewModel = SelectCityViewModel.this;
            pv6 pv6Var = selectCityViewModel.u;
            hm7 hm7Var = new hm7(selectCityViewModel, 0);
            this.a = 1;
            Object objA = pv6Var.a.a(new og6(hm7Var, 22), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.myAccount.city.SelectCityViewModel$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.myAccount.city.SelectCityViewModel$2", f = "SelectCityViewModel.kt", l = {42}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass2(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return SelectCityViewModel.this.new AnonymousClass2(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            ((AnonymousClass2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
            return CoroutineSingletons.a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw t61.q(obj);
            }
            b.b(obj);
            SelectCityViewModel selectCityViewModel = SelectCityViewModel.this;
            l lVar = selectCityViewModel.w;
            hm7 hm7Var = new hm7(selectCityViewModel, 1);
            this.a = 1;
            lVar.a(hm7Var, this);
            return coroutineSingletons;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.myAccount.city.SelectCityViewModel$onCheckCityListContainment$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.myAccount.city.SelectCityViewModel$onCheckCityListContainment$1", f = "SelectCityViewModel.kt", l = {55}, m = "invokeSuspend", v = 1)
    public static final class C01981 extends SuspendLambda implements qp2 {
        public int a;

        public C01981(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return SelectCityViewModel.this.new C01981(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01981) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SelectCityViewModel selectCityViewModel = SelectCityViewModel.this;
            l lVar = selectCityViewModel.w;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                nm5 nm5Var = selectCityViewModel.v;
                String str = (String) lVar.getValue();
                nm5Var.getClass();
                js3.p(str, "query");
                ls0 ls0Var = (ls0) nm5Var.b;
                ls0Var.getClass();
                if (ls0Var.a.contains(str)) {
                    i iVar = selectCityViewModel.A;
                    Object value = lVar.getValue();
                    this.a = 1;
                    if (iVar.emit(value, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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

    public SelectCityViewModel(nm5 nm5Var) {
        super(true);
        this.v = nm5Var;
        l lVarB = ja1.b("");
        this.w = lVarB;
        this.x = new rv6(lVarB);
        l lVarB2 = ja1.b(Boolean.FALSE);
        this.y = lVarB2;
        this.z = new pv6(lVarB2);
        i iVarE = vy2.e(0, 7, null);
        this.A = iVarE;
        this.B = new pv6(iVarE);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass2(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCheckCityListContainment(SelectCityAction.CheckCityListContainmentAction checkCityListContainmentAction) {
        bt2.G(y97.G(this), null, null, new C01981(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUpdateQuery(SelectCityAction.UpdateQueryAction updateQueryAction) {
        this.w.o(f88.J0(updateQueryAction.getQuery()).toString());
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new SelectCityViewModel$doRequest$1(this, null));
    }
}
