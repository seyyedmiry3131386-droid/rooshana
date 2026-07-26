package ir.mservices.market.download;

import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.n25;
import defpackage.n4;
import defpackage.o4;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.r4;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xp;
import defpackage.y97;
import ir.mservices.market.download.DownloadContentAction;
import ir.mservices.market.download.common.RecentDownloadType;
import ir.mservices.market.viewModel.a;
import java.util.Locale;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadContentViewModel extends a {
    public final l v;
    public final rv6 w;
    public final o4 x;

    /* JADX INFO: renamed from: ir.mservices.market.download.DownloadContentViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.download.DownloadContentViewModel$1", f = "DownloadContentViewModel.kt", l = {58}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return DownloadContentViewModel.this.new AnonymousClass1(g51Var);
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
            DownloadContentViewModel downloadContentViewModel = DownloadContentViewModel.this;
            pv6 pv6Var = downloadContentViewModel.u;
            r4 r4Var = new r4(21, downloadContentViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new n4(r4Var, 27), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadContentViewModel(jd7 jd7Var, n25 n25Var) {
        String upperCase;
        super(false);
        js3.p(jd7Var, "savedStateHandle");
        js3.p(n25Var, "movieDownloadRepository");
        String str = jd7Var.a("download_type") ? (String) jd7Var.b("download_type") : "apps";
        if (str != null) {
            upperCase = str.toUpperCase(Locale.ROOT);
            js3.o(upperCase, "toUpperCase(...)");
        } else {
            upperCase = "APPS";
        }
        l lVarB = ja1.b(Integer.valueOf(RecentDownloadType.valueOf(upperCase).ordinal()));
        this.v = lVarB;
        this.w = new rv6(lVarB);
        ir.mservices.market.movie.download.core.source.a aVar = n25Var.a;
        this.x = new o4(d.k(new xp(aVar.k, aVar, 11)), 7);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUpdateSelectedPage(DownloadContentAction.UpdateSelectedPageAction updateSelectedPageAction) {
        l lVar;
        Object value;
        do {
            lVar = this.v;
            value = lVar.getValue();
            ((Number) value).intValue();
        } while (!lVar.n(value, Integer.valueOf(updateSelectedPageAction.getPage())));
    }
}
