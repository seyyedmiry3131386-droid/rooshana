package ir.mservices.market.webview;

import defpackage.bt2;
import defpackage.dd9;
import defpackage.e71;
import defpackage.g51;
import defpackage.i10;
import defpackage.ja1;
import defpackage.js3;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.qu2;
import defpackage.rv6;
import defpackage.sj8;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vc8;
import defpackage.y97;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import ir.mservices.market.viewModel.a;
import ir.mservices.market.webview.WebViewAction;
import java.util.HashMap;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class WebViewViewModel extends a {
    public final i10 v;
    public final qu2 w;
    public final l x;
    public final rv6 y;
    public String z;

    /* JADX INFO: renamed from: ir.mservices.market.webview.WebViewViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.webview.WebViewViewModel$1", f = "WebViewViewModel.kt", l = {74}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return WebViewViewModel.this.new AnonymousClass1(g51Var);
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
            WebViewViewModel webViewViewModel = WebViewViewModel.this;
            pv6 pv6Var = webViewViewModel.u;
            dd9 dd9Var = new dd9(0, webViewViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new vc8(dd9Var, 14), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewViewModel(i10 i10Var, qu2 qu2Var) {
        super(false);
        js3.p(i10Var, "authorizationManager");
        js3.p(qu2Var, "googleUtils");
        this.v = i10Var;
        this.w = qu2Var;
        l lVarB = ja1.b(new HashMap());
        this.x = lVarB;
        this.y = new rv6(lVarB);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInitAction(WebViewAction.InitAction initAction) {
        this.z = initAction.getDeviceType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSetupHeaderAction(WebViewAction.SetupHeaderAction setupHeaderAction) {
        HashMap map = (HashMap) this.x.getValue();
        i10 i10Var = this.v;
        map.put("X-Access-Token", i10Var.a());
        map.put("Authorization", i10Var.a());
        map.put("Myket-Version", "1028");
        String str = this.z;
        if (str == null) {
            str = "";
        }
        map.put("X-Device-Type", str);
        map.put("Myket-PackageName", NearbyRepository.SERVICE_ID);
        map.put("Platform", LinkDTO.LINK_TYPE_MYKET_INTENT);
        String strC = this.w.c();
        if (strC.length() <= 0) {
            strC = null;
        }
        if (strC != null) {
            map.put("X-Google-Ad-Id", strC);
        }
        map.put("Theme", sj8.f());
        map.put("Style", sj8.e());
        map.put("Myket-SessionId", ApplicationLauncher.o.c());
    }
}
