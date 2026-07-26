package ir.mservices.market.app.search.result.ui;

import defpackage.bi7;
import defpackage.bt2;
import defpackage.ca7;
import defpackage.e71;
import defpackage.g51;
import defpackage.hl5;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.k45;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.t32;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vy2;
import defpackage.y97;
import defpackage.yl5;
import ir.mservices.market.viewModel.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchResultViewModel extends c {
    public final i A;
    public final pv6 B;
    public final i C;
    public int D;
    public Boolean E;
    public boolean F;
    public boolean G;
    public final l H;
    public final rv6 I;
    public final jd7 t;
    public final k45 u;
    public final ca7 v;
    public final hl5 w;
    public final ir.mservices.market.version2.manager.install.a x;
    public final yl5 y;
    public boolean z;

    /* JADX INFO: renamed from: ir.mservices.market.app.search.result.ui.SearchResultViewModel$onEvent$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.search.result.ui.SearchResultViewModel$onEvent$1", f = "SearchResultViewModel.kt", l = {337}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return SearchResultViewModel.this.new AnonymousClass1(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                i iVar = SearchResultViewModel.this.C;
                this.a = 1;
                if (iVar.emit("", this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultViewModel(jd7 jd7Var, k45 k45Var, ca7 ca7Var, hl5 hl5Var, ir.mservices.market.version2.manager.install.a aVar, yl5 yl5Var) {
        super(false);
        js3.p(jd7Var, "savedStateHandle");
        js3.p(aVar, "installQueue");
        js3.p(yl5Var, "neneDownloadRepository");
        this.t = jd7Var;
        this.u = k45Var;
        this.v = ca7Var;
        this.w = hl5Var;
        this.x = aVar;
        this.y = yl5Var;
        this.z = true;
        i iVarE = vy2.e(0, 7, null);
        this.A = iVarE;
        this.B = new pv6(iVarE);
        this.C = vy2.e(0, 7, null);
        l lVarB = ja1.b(null);
        this.H = lVarB;
        this.I = new rv6(lVarB);
        t32.b().l(this, false);
    }

    @Override // ir.mservices.market.viewModel.c, defpackage.k79
    public final void d() {
        super.d();
        t32.b().o(this);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        this.z = true;
        p(new SearchResultViewModel$doRequest$1(this, null));
    }

    public final void onEvent(bi7 bi7Var) {
        js3.p(bi7Var, "event");
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }
}
