package ir.mservices.market.app.suggest.search.ui;

import android.os.Parcelable;
import defpackage.bt2;
import defpackage.c35;
import defpackage.dt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.jd7;
import defpackage.js3;
import defpackage.nb8;
import defpackage.og6;
import defpackage.pq6;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vy2;
import defpackage.xk6;
import defpackage.y97;
import defpackage.yl5;
import ir.mservices.market.app.search.result.data.GoogleSearchConfigDto;
import ir.mservices.market.app.suggest.search.ui.SuggestListAction;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import java.io.Serializable;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class SuggestListViewModel extends ir.mservices.market.viewModel.a {
    public final kotlinx.coroutines.channels.a A;
    public final i B;
    public final pv6 C;
    public final rv6 D;
    public final jd7 v;
    public final c35 w;
    public final ir.mservices.market.version2.manager.install.a x;
    public final yl5 y;
    public final nb8 z;

    /* JADX INFO: renamed from: ir.mservices.market.app.suggest.search.ui.SuggestListViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.suggest.search.ui.SuggestListViewModel$1", f = "SuggestListViewModel.kt", l = {135}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return SuggestListViewModel.this.new AnonymousClass1(g51Var);
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
            SuggestListViewModel suggestListViewModel = SuggestListViewModel.this;
            pv6 pv6Var = suggestListViewModel.u;
            xk6 xk6Var = new xk6(20, suggestListViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new og6(xk6Var, 28), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.suggest.search.ui.SuggestListViewModel$crawlGoogleSearch$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.app.suggest.search.ui.SuggestListViewModel$crawlGoogleSearch$1", f = "SuggestListViewModel.kt", l = {122, 125}, m = "invokeSuspend", v = 1)
    public static final class C01691 extends SuspendLambda implements qp2 {
        public int a;

        public C01691(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return SuggestListViewModel.this.new C01691(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01691) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        
            if (r5.c(r4, "") == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r4.a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L15:
                kotlin.b.b(r5)
                goto L4e
            L19:
                kotlin.b.b(r5)
                ir.mservices.market.app.suggest.search.ui.SuggestListViewModel r5 = ir.mservices.market.app.suggest.search.ui.SuggestListViewModel.this
                nb8 r1 = r5.z
                ir.mservices.market.app.search.result.data.GoogleSearchConfigDto r1 = r1.b
                if (r1 == 0) goto L41
                boolean r1 = r1.getWebViewEnable()
                if (r1 != r3) goto L41
                rv6 r1 = r5.D
                v48 r1 = r1.a
                java.lang.Object r1 = r1.getValue()
                java.lang.String r1 = (java.lang.String) r1
                if (r1 == 0) goto L4e
                kotlinx.coroutines.flow.i r5 = r5.B
                r4.a = r3
                java.lang.Object r5 = r5.emit(r1, r4)
                if (r5 != r0) goto L4e
                goto L4d
            L41:
                kotlinx.coroutines.channels.a r5 = r5.A
                r4.a = r2
                java.lang.String r1 = ""
                java.lang.Object r5 = r5.c(r4, r1)
                if (r5 != r0) goto L4e
            L4d:
                return r0
            L4e:
                tx8 r5 = defpackage.tx8.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.suggest.search.ui.SuggestListViewModel.C01691.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestListViewModel(jd7 jd7Var, c35 c35Var, ir.mservices.market.version2.manager.install.a aVar, yl5 yl5Var) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        js3.p(aVar, "installQueue");
        js3.p(yl5Var, "neneDownloadRepository");
        this.v = jd7Var;
        this.w = c35Var;
        this.x = aVar;
        this.y = yl5Var;
        if (!jd7Var.a("suggestQueryString")) {
            throw new IllegalArgumentException("Required argument \"suggestQueryString\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("suggestQueryString");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"suggestQueryString\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("googleSearchConfig")) {
            throw new IllegalArgumentException("Required argument \"googleSearchConfig\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(GoogleSearchConfigDto.class) && !Serializable.class.isAssignableFrom(GoogleSearchConfigDto.class)) {
            throw new UnsupportedOperationException(GoogleSearchConfigDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        GoogleSearchConfigDto googleSearchConfigDto = (GoogleSearchConfigDto) jd7Var.b("googleSearchConfig");
        this.z = new nb8(str, googleSearchConfigDto);
        this.A = dt2.b(0, 7, null);
        i iVarE = vy2.e(0, 7, null);
        this.B = iVarE;
        this.C = new pv6(iVarE);
        this.D = jd7Var.c(googleSearchConfigDto != null ? googleSearchConfigDto.getInitUrl() : null, "next_url");
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void crawlGoogleSearch() {
        bt2.G(y97.G(this), null, null, new C01691(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onGoogleResultReceivedAction(SuggestListAction.GoogleResultReceivedAction googleResultReceivedAction, g51<? super tx8> g51Var) {
        Object objC = this.A.c(g51Var, googleResultReceivedAction.getHtml());
        return objC == CoroutineSingletons.a ? objC : tx8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerItem setDivider(RecyclerItem recyclerItem, RecyclerItem recyclerItem2) {
        if (recyclerItem == null || recyclerItem2 == null) {
            return null;
        }
        DividerData dividerData = new DividerData();
        dividerData.e = pq6.horizontal_space_outer;
        dividerData.b = false;
        dividerData.c = pq6.horizontal_space_inner;
        return new RecyclerItem(dividerData);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new SuggestListViewModel$doRequest$1(this, null));
    }
}
