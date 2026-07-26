package ir.mservices.market.app.packages.ui;

import android.view.MenuItem;
import defpackage.dp2;
import defpackage.g51;
import defpackage.o4;
import defpackage.qp2;
import defpackage.rq4;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.packages.ui.PackageRecyclerListFragment$onViewCreated$1", f = "PackageRecyclerListFragment.kt", l = {61}, m = "invokeSuspend", v = 1)
final class PackageRecyclerListFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ PackageRecyclerListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.app.packages.ui.PackageRecyclerListFragment$onViewCreated$1$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.packages.ui.PackageRecyclerListFragment$onViewCreated$1$2", f = "PackageRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public final /* synthetic */ PackageRecyclerListFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PackageRecyclerListFragment packageRecyclerListFragment, g51 g51Var) {
            super(2, g51Var);
            this.a = packageRecyclerListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass2(this.a, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((String) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass2.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            PackageRecyclerListFragment packageRecyclerListFragment = this.a;
            MenuItem menuItem = packageRecyclerListFragment.n1;
            if (menuItem != null) {
                rq4.O(menuItem, true, packageRecyclerListFragment.m1, packageRecyclerListFragment.l1);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageRecyclerListFragment$onViewCreated$1(PackageRecyclerListFragment packageRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = packageRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new PackageRecyclerListFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((PackageRecyclerListFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = PackageRecyclerListFragment.o1;
            PackageRecyclerListFragment packageRecyclerListFragment = this.b;
            o4 o4Var = new o4(((PackageViewModel) packageRecyclerListFragment.j1.getValue()).y, 17);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(packageRecyclerListFragment, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass2, this) == coroutineSingletons) {
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
