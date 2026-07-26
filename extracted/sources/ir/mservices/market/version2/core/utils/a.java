package ir.mservices.market.version2.core.utils;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import androidx.paging.e;
import defpackage.a06;
import defpackage.bt2;
import defpackage.dp2;
import defpackage.is3;
import defpackage.js3;
import defpackage.qp2;
import ir.mservices.market.version2.fragments.base.BaseNavigationFragment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final a06 a(a06 a06Var, qp2 qp2Var) {
        return qp2Var == null ? a06Var : e.f(a06Var, new PagingCrudExtKt$insertSeparator$1(3, qp2Var, is3.class, "suspendConversion0", "insertSeparator$suspendConversion0(Lkotlin/jvm/functions/Function2;Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
    }

    public static final void b(androidx.fragment.app.d dVar, qp2 qp2Var) {
        js3.p(dVar, "<this>");
        FragmentActivity fragmentActivityF = dVar.F();
        if (fragmentActivityF != null) {
            bt2.G(androidx.lifecycle.b.a(fragmentActivityF), null, null, new FragmentExtensionKt$launchOnActivityLifecycle$1(dVar, qp2Var, null), 3);
        }
    }

    public static final void c(androidx.fragment.app.d dVar, long j, dp2 dp2Var) {
        js3.p(dVar, "<this>");
        bt2.G(androidx.lifecycle.b.a(dVar.N()), null, null, new FragmentExtensionKt$launchOnLifecycle$1(j, dp2Var, null), 3);
    }

    public static final void d(androidx.fragment.app.d dVar, Lifecycle$State lifecycle$State, dp2 dp2Var) {
        js3.p(dVar, "<this>");
        bt2.G(androidx.lifecycle.b.a(dVar.N()), null, null, new FragmentExtensionKt$repeatOnLifecycleState$1(dVar, lifecycle$State, dp2Var, null), 3);
    }

    public static void f(BaseNavigationFragment baseNavigationFragment, dp2 dp2Var) {
        bt2.G(androidx.lifecycle.b.a(baseNavigationFragment), null, null, new FragmentExtensionKt$repeatOnLifecycleStateScope$1(baseNavigationFragment, Lifecycle$State.c, dp2Var, null), 3);
    }
}
