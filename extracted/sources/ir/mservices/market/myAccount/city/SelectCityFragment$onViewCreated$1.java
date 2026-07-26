package ir.mservices.market.myAccount.city;

import android.os.Bundle;
import defpackage.am2;
import defpackage.bi5;
import defpackage.dp2;
import defpackage.em7;
import defpackage.g51;
import defpackage.pk5;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myAccount.city.SelectCityFragment$onViewCreated$1", f = "SelectCityFragment.kt", l = {104}, m = "invokeSuspend", v = 1)
final class SelectCityFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ SelectCityFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.myAccount.city.SelectCityFragment$onViewCreated$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.myAccount.city.SelectCityFragment$onViewCreated$1$1", f = "SelectCityFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ SelectCityFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SelectCityFragment selectCityFragment, g51 g51Var) {
            super(2, g51Var);
            this.a = selectCityFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.a, g51Var);
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
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            SelectCityFragment selectCityFragment = this.a;
            bi5 bi5Var = selectCityFragment.j1;
            ((em7) bi5Var.getValue()).a.d = DialogResult.a;
            am2 am2Var = selectCityFragment.J0;
            String str = ((em7) bi5Var.getValue()).a.a;
            Bundle bundle = new Bundle();
            bundle.putParcelable("BUNDLE_KEY_DATA", ((em7) bi5Var.getValue()).a);
            bundle.putString("city", (String) selectCityFragment.Q1().x.a.getValue());
            am2Var.k(bundle, str);
            pk5.a(selectCityFragment.J0);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectCityFragment$onViewCreated$1(SelectCityFragment selectCityFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = selectCityFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new SelectCityFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((SelectCityFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = SelectCityFragment.n1;
            SelectCityFragment selectCityFragment = this.b;
            pv6 pv6Var = selectCityFragment.Q1().B;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(selectCityFragment, null);
            this.a = 1;
            if (d.f(pv6Var, anonymousClass1, this) == coroutineSingletons) {
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
