package ir.mservices.market.app.bookmark.ui;

import defpackage.dp2;
import defpackage.dw1;
import defpackage.g51;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.u95;
import ir.mservices.market.core.analytics.MultiSelectEventBuilder;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.bookmark.ui.AppBookmarkRecyclerListFragment$onViewCreated$1", f = "AppBookmarkRecyclerListFragment.kt", l = {79}, m = "invokeSuspend", v = 1)
final class AppBookmarkRecyclerListFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ AppBookmarkRecyclerListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.app.bookmark.ui.AppBookmarkRecyclerListFragment$onViewCreated$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.bookmark.ui.AppBookmarkRecyclerListFragment$onViewCreated$1$1", f = "AppBookmarkRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((u95) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            u95 u95Var = (u95) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            String strN = dw1.n("bookmark_", u95Var.b);
            MultiSelectEventBuilder multiSelectEventBuilder = new MultiSelectEventBuilder();
            multiSelectEventBuilder.c.putString(u95Var.a, strN);
            multiSelectEventBuilder.a();
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBookmarkRecyclerListFragment$onViewCreated$1(AppBookmarkRecyclerListFragment appBookmarkRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = appBookmarkRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new AppBookmarkRecyclerListFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((AppBookmarkRecyclerListFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = AppBookmarkRecyclerListFragment.j1;
            o4 o4Var = new o4(this.b.Q1().C, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
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
