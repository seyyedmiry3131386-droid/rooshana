package ir.mservices.market.download.recentDownload;

import defpackage.bt2;
import defpackage.e71;
import defpackage.ex6;
import defpackage.g51;
import defpackage.ja1;
import defpackage.js3;
import defpackage.kx6;
import defpackage.ly5;
import defpackage.og6;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.sk6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wu0;
import defpackage.y97;
import defpackage.yl5;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.download.recentDownload.RecentDownloadAction;
import ir.mservices.market.download.recentDownload.recycler.RecentDownloadData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class RecentDownloadViewModel extends ir.mservices.market.viewModel.a {
    public final yl5 v;
    public final sk6 w;
    public final ir.mservices.market.version2.manager.install.a x;
    public final l y;
    public final rv6 z;

    /* JADX INFO: renamed from: ir.mservices.market.download.recentDownload.RecentDownloadViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.download.recentDownload.RecentDownloadViewModel$1", f = "RecentDownloadViewModel.kt", l = {38}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return RecentDownloadViewModel.this.new AnonymousClass1(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
            return CoroutineSingletons.a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                RecentDownloadViewModel recentDownloadViewModel = RecentDownloadViewModel.this;
                rv6 rv6Var = recentDownloadViewModel.v.e;
                kx6 kx6Var = new kx6(recentDownloadViewModel, 0);
                this.a = 1;
                if (rv6Var.a.a(kx6Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.download.recentDownload.RecentDownloadViewModel$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.download.recentDownload.RecentDownloadViewModel$2", f = "RecentDownloadViewModel.kt", l = {43}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass2(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return RecentDownloadViewModel.this.new AnonymousClass2(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
            return CoroutineSingletons.a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                RecentDownloadViewModel recentDownloadViewModel = RecentDownloadViewModel.this;
                pv6 pv6Var = recentDownloadViewModel.x.b;
                kx6 kx6Var = new kx6(recentDownloadViewModel, 1);
                this.a = 1;
                if (pv6Var.a.a(kx6Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.download.recentDownload.RecentDownloadViewModel$3, reason: invalid class name */
    @tb1(c = "ir.mservices.market.download.recentDownload.RecentDownloadViewModel$3", f = "RecentDownloadViewModel.kt", l = {93}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass3(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return RecentDownloadViewModel.this.new AnonymousClass3(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
            RecentDownloadViewModel recentDownloadViewModel = RecentDownloadViewModel.this;
            pv6 pv6Var = recentDownloadViewModel.u;
            kx6 kx6Var = new kx6(recentDownloadViewModel, 2);
            this.a = 1;
            Object objA = pv6Var.a.a(new og6(kx6Var, 14), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentDownloadViewModel(yl5 yl5Var, sk6 sk6Var, ir.mservices.market.version2.manager.install.a aVar) {
        super(true);
        js3.p(yl5Var, "neneDownloadRepository");
        js3.p(aVar, "installQueue");
        this.v = yl5Var;
        this.w = sk6Var;
        this.x = aVar;
        l lVarB = ja1.b(null);
        this.y = lVarB;
        this.z = new rv6(lVarB);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass2(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass3(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<RecyclerItem> fillData(List<ex6> list) {
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        for (ex6 ex6Var : list) {
            arrayList.add(new RecyclerItem(new RecentDownloadData(ex6Var.a, ex6Var.b)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUpdateRefreshAction(RecentDownloadAction.UpdateRefreshAction updateRefreshAction) {
        l lVar;
        Object value;
        do {
            lVar = this.y;
            value = lVar.getValue();
        } while (!lVar.n(value, updateRefreshAction.getRefresh()));
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new RecentDownloadViewModel$doRequest$1(this, null));
    }

    public final void onEvent(ly5 ly5Var) {
        l lVar;
        Object value;
        js3.p(ly5Var, "event");
        String str = ly5Var.a;
        sk6 sk6Var = this.w;
        sk6Var.getClass();
        ArrayList arrayList = (ArrayList) sk6Var.d;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (js3.i(((ex6) it.next()).a.getPackageName(), str)) {
                do {
                    lVar = this.y;
                    value = lVar.getValue();
                } while (!lVar.n(value, Boolean.TRUE));
                return;
            }
        }
    }
}
