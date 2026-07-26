package ir.mservices.market.appUsage;

import androidx.paging.e;
import defpackage.a06;
import defpackage.br9;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.appUsage.recycler.InstalledAppUsageData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.appUsage.AppsUsageViewModel$items$1", f = "AppsUsageViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class AppsUsageViewModel$items$1 extends SuspendLambda implements rp2 {
    public /* synthetic */ a06 a;
    public /* synthetic */ List b;

    /* JADX INFO: renamed from: ir.mservices.market.appUsage.AppsUsageViewModel$items$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.appUsage.AppsUsageViewModel$items$1$1", f = "AppsUsageViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ List b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list, g51 g51Var) {
            super(2, g51Var);
            this.b = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((RecyclerItem) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RecyclerItem recyclerItem = (RecyclerItem) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            js3.n(recyclerItem.c, "null cannot be cast to non-null type ir.mservices.market.appUsage.recycler.InstalledAppUsageData");
            return Boolean.valueOf(!this.b.contains(((InstalledAppUsageData) r3).a.a));
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.appUsage.AppsUsageViewModel$items$1$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.appUsage.AppsUsageViewModel$items$1$2", f = "AppsUsageViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, g51Var);
            anonymousClass2.a = obj;
            return anonymousClass2;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((RecyclerItem) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RecyclerItem recyclerItem = (RecyclerItem) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            return br9.B(recyclerItem);
        }
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        AppsUsageViewModel$items$1 appsUsageViewModel$items$1 = new AppsUsageViewModel$items$1(3, (g51) obj3);
        appsUsageViewModel$items$1.a = (a06) obj;
        appsUsageViewModel$items$1.b = (List) obj2;
        return appsUsageViewModel$items$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a06 a06Var = this.a;
        List list = this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        return e.d(e.c(a06Var, new AnonymousClass1(list, null)), new AnonymousClass2(2, null));
    }
}
