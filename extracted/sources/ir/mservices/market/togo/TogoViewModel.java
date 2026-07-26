package ir.mservices.market.togo;

import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.google.gson.reflect.TypeToken;
import com.j256.ormlite.stmt.query.SimpleComparison;
import defpackage.bn8;
import defpackage.bt2;
import defpackage.c5;
import defpackage.d04;
import defpackage.dp3;
import defpackage.dt2;
import defpackage.e71;
import defpackage.f88;
import defpackage.fg5;
import defpackage.fu0;
import defpackage.fw4;
import defpackage.g51;
import defpackage.gk1;
import defpackage.h11;
import defpackage.i10;
import defpackage.j2;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.qu2;
import defpackage.rf7;
import defpackage.ru7;
import defpackage.rv6;
import defpackage.sj8;
import defpackage.sm8;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v4;
import defpackage.vc8;
import defpackage.vv2;
import defpackage.vy2;
import defpackage.xk6;
import defpackage.xm8;
import defpackage.y97;
import defpackage.z4;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.togo.TogoAction;
import ir.mservices.market.togo.TogoViewModel;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import ir.mservices.market.version2.webapi.responsedto.PaymentRequiredBindingDto;
import ir.mservices.market.version2.webapi.responsedto.ProfileInfoDto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class TogoViewModel extends ir.mservices.market.viewModel.a {
    public final dp3 A;
    public final kotlinx.coroutines.channels.a A0;
    public final rf7 B;
    public final kotlinx.coroutines.channels.a B0;
    public final gk1 C;
    public final kotlinx.coroutines.channels.a C0;
    public final ir.mservices.market.core.notification.a D;
    public final kotlinx.coroutines.channels.a D0;
    public final ir.mservices.market.common.install.a E;
    public final kotlinx.coroutines.channels.a E0;
    public final l F;
    public final kotlinx.coroutines.channels.a F0;
    public final rv6 G;
    public final kotlinx.coroutines.channels.a G0;
    public final ArrayList H;
    public String H0;
    public final l I;
    public final l I0;
    public final rv6 J;
    public final rv6 J0;
    public final l K;
    public final l K0;
    public final rv6 L;
    public final rv6 L0;
    public final l M;
    public final kotlinx.coroutines.channels.a M0;
    public final rv6 N;
    public final kotlinx.coroutines.channels.a N0;
    public final l O;
    public final rv6 P;
    public final i Q;
    public final pv6 R;
    public final i S;
    public final pv6 T;
    public final l U;
    public final pv6 V;
    public final kotlinx.coroutines.channels.a W;
    public final kotlinx.coroutines.channels.a X;
    public final kotlinx.coroutines.channels.a Y;
    public final kotlinx.coroutines.channels.a Z;
    public final i10 v;
    public final qu2 w;
    public final d04 x;
    public final kotlinx.coroutines.channels.a x0;
    public final c5 y;
    public final kotlinx.coroutines.channels.a y0;
    public final fw4 z;
    public final kotlinx.coroutines.channels.a z0;

    /* JADX INFO: renamed from: ir.mservices.market.togo.TogoViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.togo.TogoViewModel$1", f = "TogoViewModel.kt", l = {549}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return TogoViewModel.this.new AnonymousClass1(g51Var);
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
                kotlin.b.b(obj);
                return tx8Var;
            }
            kotlin.b.b(obj);
            TogoViewModel togoViewModel = TogoViewModel.this;
            pv6 pv6Var = togoViewModel.u;
            xk6 xk6Var = new xk6(24, togoViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new vc8(xk6Var, 2), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.togo.TogoViewModel$onGetAppDetailAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.togo.TogoViewModel", f = "TogoViewModel.kt", l = {280, 306}, m = "onGetAppDetailAction", v = 1)
    public static final class C02481 extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public C02481(g51 g51Var) {
            super(g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return TogoViewModel.this.onGetAppDetailAction(null, this);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.togo.TogoViewModel$onGetInstalledAppsAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.togo.TogoViewModel", f = "TogoViewModel.kt", l = {359, 369, 376}, m = "onGetInstalledAppsAction", v = 1)
    public static final class C02491 extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public C02491(g51 g51Var) {
            super(g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return TogoViewModel.this.onGetInstalledAppsAction(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogoViewModel(jd7 jd7Var, i10 i10Var, qu2 qu2Var, d04 d04Var, c5 c5Var, fw4 fw4Var, dp3 dp3Var, rf7 rf7Var, gk1 gk1Var, ir.mservices.market.core.notification.a aVar, ir.mservices.market.common.install.a aVar2) {
        super(false);
        js3.p(jd7Var, "savedStateHandle");
        js3.p(i10Var, "authorizationManager");
        js3.p(qu2Var, "googleUtils");
        js3.p(d04Var, "languageHelper");
        js3.p(c5Var, "accountManager");
        js3.p(fw4Var, "miuiUtils");
        js3.p(dp3Var, "installManager");
        js3.p(rf7Var, "screenQualityHelper");
        js3.p(gk1Var, "detailService");
        js3.p(aVar, "notificationController");
        js3.p(aVar2, "installedAppManager");
        this.v = i10Var;
        this.w = qu2Var;
        this.x = d04Var;
        this.y = c5Var;
        this.z = fw4Var;
        this.A = dp3Var;
        this.B = rf7Var;
        this.C = gk1Var;
        this.D = aVar;
        this.E = aVar2;
        if (!jd7Var.a("url")) {
            throw new IllegalArgumentException("Required argument \"url\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("url");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"url\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) jd7Var.b("title");
        if (!jd7Var.a("showBottomNavigation")) {
            throw new IllegalArgumentException("Required argument \"showBottomNavigation\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) jd7Var.b("showBottomNavigation");
        if (bool == null) {
            throw new IllegalArgumentException("Argument \"showBottomNavigation\" of type boolean does not support null values");
        }
        if (!jd7Var.a("showToolbarDivider")) {
            throw new IllegalArgumentException("Required argument \"showToolbarDivider\" is missing and does not have an android:defaultValue");
        }
        Boolean bool2 = (Boolean) jd7Var.b("showToolbarDivider");
        if (bool2 == null) {
            throw new IllegalArgumentException("Argument \"showToolbarDivider\" of type boolean does not support null values");
        }
        if (!jd7Var.a("showToolbar")) {
            throw new IllegalArgumentException("Required argument \"showToolbar\" is missing and does not have an android:defaultValue");
        }
        Boolean bool3 = (Boolean) jd7Var.b("showToolbar");
        if (bool3 == null) {
            throw new IllegalArgumentException("Argument \"showToolbar\" of type boolean does not support null values");
        }
        if (!jd7Var.a("cacheControl")) {
            throw new IllegalArgumentException("Required argument \"cacheControl\" is missing and does not have an android:defaultValue");
        }
        Boolean bool4 = (Boolean) jd7Var.b("cacheControl");
        if (bool4 == null) {
            throw new IllegalArgumentException("Argument \"cacheControl\" of type boolean does not support null values");
        }
        if (!jd7Var.a("finishOnBackPress")) {
            throw new IllegalArgumentException("Required argument \"finishOnBackPress\" is missing and does not have an android:defaultValue");
        }
        Boolean bool5 = (Boolean) jd7Var.b("finishOnBackPress");
        if (bool5 == null) {
            throw new IllegalArgumentException("Argument \"finishOnBackPress\" of type boolean does not support null values");
        }
        new xm8(str, str2, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue(), bool5.booleanValue());
        l lVarB = ja1.b(null);
        this.F = lVarB;
        this.G = new rv6(lVarB);
        this.H = new ArrayList();
        l lVarB2 = ja1.b("back");
        this.I = lVarB2;
        h11 h11Var = new h11(lVarB2, 2);
        fu0 fu0VarG = y97.G(this);
        sm8 sm8Var = sm8.b;
        j jVar = ru7.b;
        this.J = kotlinx.coroutines.flow.d.A(h11Var, fu0VarG, jVar, sm8Var);
        l lVarB3 = ja1.b(new HashMap());
        this.K = lVarB3;
        this.L = new rv6(lVarB3);
        l lVarB4 = ja1.b(Boolean.FALSE);
        this.M = lVarB4;
        this.N = new rv6(lVarB4);
        l lVarB5 = ja1.b(null);
        this.O = lVarB5;
        this.P = new rv6(lVarB5);
        i iVarE = vy2.e(0, 6, null);
        this.Q = iVarE;
        this.R = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.S = iVarE2;
        this.T = new pv6(iVarE2);
        l lVarB6 = ja1.b(null);
        this.U = lVarB6;
        this.V = kotlinx.coroutines.flow.d.z(lVarB6, y97.G(this), jVar, 0);
        kotlinx.coroutines.channels.a aVarB = dt2.b(0, 7, null);
        this.W = aVarB;
        this.X = aVarB;
        kotlinx.coroutines.channels.a aVarB2 = dt2.b(0, 7, null);
        this.Y = aVarB2;
        this.Z = aVarB2;
        kotlinx.coroutines.channels.a aVarB3 = dt2.b(0, 7, null);
        this.x0 = aVarB3;
        this.y0 = aVarB3;
        kotlinx.coroutines.channels.a aVarB4 = dt2.b(0, 7, null);
        this.z0 = aVarB4;
        this.A0 = aVarB4;
        kotlinx.coroutines.channels.a aVarB5 = dt2.b(0, 7, null);
        this.B0 = aVarB5;
        this.C0 = aVarB5;
        kotlinx.coroutines.channels.a aVarB6 = dt2.b(0, 7, null);
        this.D0 = aVarB6;
        this.E0 = aVarB6;
        kotlinx.coroutines.channels.a aVarB7 = dt2.b(0, 7, null);
        this.F0 = aVarB7;
        this.G0 = aVarB7;
        l lVarB7 = ja1.b(bool4);
        this.I0 = lVarB7;
        this.J0 = new rv6(lVarB7);
        l lVarB8 = ja1.b(null);
        this.K0 = lVarB8;
        this.L0 = new rv6(lVarB8);
        kotlinx.coroutines.channels.a aVarB8 = dt2.b(0, 7, null);
        this.M0 = aVarB8;
        this.N0 = aVarB8;
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    private final boolean checkUrlSafeForJs(String str) {
        Uri uri;
        String host;
        try {
            uri = Uri.parse(str);
            host = uri.getHost();
        } catch (Exception unused) {
        }
        if (!fg5.c(uri)) {
            ArrayList<String> arrayList = this.H;
            if (!(arrayList != null) || !arrayList.isEmpty()) {
                for (String str2 : arrayList) {
                    if (host == null || !host.equalsIgnoreCase(str2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String createFinalUrl(java.lang.String r3, boolean r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L17
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = "^\\p{Alpha}+://.*$"
            r0.<init>(r1)
            boolean r0 = r0.f(r3)
            if (r0 != 0) goto L15
            java.lang.String r0 = "http://"
            java.lang.String r3 = r0.concat(r3)
        L15:
            if (r3 != 0) goto L19
        L17:
            java.lang.String r3 = ""
        L19:
            if (r4 == 0) goto L61
            android.net.Uri r3 = android.net.Uri.parse(r3)
            android.net.Uri$Builder r4 = r3.buildUpon()
            java.util.Set r3 = r3.getQueryParameterNames()
            java.lang.String r0 = "lang"
            boolean r1 = r3.contains(r0)
            if (r1 != 0) goto L38
            d04 r1 = r2.x
            java.lang.String r1 = r1.b()
            r4.appendQueryParameter(r0, r1)
        L38:
            java.lang.String r0 = "theme"
            boolean r1 = r3.contains(r0)
            if (r1 != 0) goto L47
            java.lang.String r1 = defpackage.sj8.f()
            r4.appendQueryParameter(r0, r1)
        L47:
            java.lang.String r0 = "style"
            boolean r3 = r3.contains(r0)
            if (r3 != 0) goto L56
            java.lang.String r3 = defpackage.sj8.e()
            r4.appendQueryParameter(r0, r3)
        L56:
            android.net.Uri r3 = r4.build()
            java.lang.String r3 = r3.toString()
            defpackage.js3.m(r3)
        L61:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.togo.TogoViewModel.createFinalUrl(java.lang.String, boolean):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void executeCallback(String str, String str2) {
        if (str != null) {
            bt2.G(y97.G(this), null, null, new TogoViewModel$executeCallback$1$1(this, str, str2, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAttachImageAction(TogoAction.AttachImageAction attachImageAction) {
        l lVar;
        Object value;
        do {
            lVar = this.F;
            value = lVar.getValue();
        } while (!lVar.n(value, attachImageAction.getAttachImageCallbackData()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onButtonTypeAction(TogoAction.ButtonTypeAction buttonTypeAction) {
        l lVar;
        Object value;
        do {
            lVar = this.I;
            value = lVar.getValue();
        } while (!lVar.n(value, buttonTypeAction.getButtonType()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCacheControlAction(TogoAction.CacheControlAction cacheControlAction) {
        l lVar;
        Object value;
        do {
            lVar = this.I0;
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.valueOf(cacheControlAction.getEnable())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCheckUrlForJsAction(TogoAction.CheckUrlSafeForJsAction checkUrlSafeForJsAction) {
        Boolean boolValueOf = Boolean.valueOf(checkUrlSafeForJs(checkUrlSafeForJsAction.getUrl()));
        l lVar = this.M;
        lVar.getClass();
        lVar.p(null, boolValueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCookieCallbackAction(TogoAction.CookieCallbackAction cookieCallbackAction) {
        l lVar;
        Object value;
        do {
            lVar = this.O;
            value = lVar.getValue();
        } while (!lVar.n(value, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCreateCookieAction(TogoAction.CreateCookieAction createCookieAction, final String str) {
        final CookieManager cookieManager = CookieManager.getInstance();
        Pair pair = new Pair("Authorization", this.v.a());
        Pair pair2 = new Pair("Myket-Version", "1028");
        String str2 = this.H0;
        if (str2 == null) {
            str2 = "";
        }
        Pair pair3 = new Pair("X-Device-Type", str2);
        Pair pair4 = new Pair("Myket-PackageName", NearbyRepository.SERVICE_ID);
        Pair pair5 = new Pair("Platform", LinkDTO.LINK_TYPE_MYKET_INTENT);
        String strC = this.w.c();
        if (f88.n0(strC)) {
            strC = null;
        }
        Map mapN = kotlin.collections.b.N(pair, pair2, pair3, pair4, pair5, new Pair("X-Google-Ad-Id", strC), new Pair(null, LinkDTO.LINK_TYPE_MYKET_INTENT), new Pair("Myket-SessionId", ApplicationLauncher.o.c()));
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapN.entrySet()) {
            if (((String) entry.getKey()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        cookieManager.removeAllCookies(new ValueCallback() { // from class: an8
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                TogoViewModel.onCreateCookieAction$lambda$3(linkedHashMap, this, str, cookieManager, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCookieAction$lambda$3(Map map, TogoViewModel togoViewModel, String str, CookieManager cookieManager, Boolean bool) {
        Object value;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str3 != null) {
                cookieManager.setCookie(".myket.ir", str2 + SimpleComparison.EQUAL_TO_OPERATION + str3);
            }
        }
        togoViewModel.executeCallback(str, null);
        l lVar = togoViewModel.O;
        do {
            value = lVar.getValue();
        } while (!lVar.n(value, tx8.a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onGetAccountIdAction(TogoAction.GetAccountIdAction getAccountIdAction, g51<? super tx8> g51Var) {
        String strA = this.y.a();
        js3.o(strA, "getAccountId(...)");
        Object objC = this.W.c(g51Var, strA);
        return objC == CoroutineSingletons.a ? objC : tx8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onGetAccountInfoAction(TogoAction.GetAccountInfoAction getAccountInfoAction) {
        bn8 bn8Var = new bn8(this, getAccountInfoAction);
        bn8 bn8Var2 = new bn8(this, getAccountInfoAction);
        c5 c5Var = this.y;
        c5Var.getClass();
        v4 v4Var = new v4(0, bn8Var2);
        ((ir.mservices.market.version2.services.b) c5Var.c.get()).g(c5Var.a, this, new j2(c5Var, bn8Var, 2), v4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetAccountInfoAction$lambda$0(TogoViewModel togoViewModel, TogoAction.GetAccountInfoAction getAccountInfoAction, ProfileInfoDto profileInfoDto) {
        togoViewModel.onCreateCookieAction(TogoAction.CreateCookieAction.INSTANCE, getAccountInfoAction.getSuccessCallback());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetAccountInfoAction$lambda$1(TogoViewModel togoViewModel, TogoAction.GetAccountInfoAction getAccountInfoAction, ErrorDTO errorDTO) {
        togoViewModel.executeCallback(getAccountInfoAction.getErrorCallback(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onGetAccountKeyAction(TogoAction.GetAccountKeyAction getAccountKeyAction, g51<? super tx8> g51Var) {
        String strE = this.y.h.e();
        js3.o(strE, "getAccountKey(...)");
        Object objC = this.Y.c(g51Var, strE);
        return objC == CoroutineSingletons.a ? objC : tx8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ef, code lost:
    
        if (kotlinx.coroutines.a.e(50, r2) == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onGetAppDetailAction(ir.mservices.market.togo.TogoAction.GetAppDetailAction r26, defpackage.g51<? super defpackage.tx8> r27) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.togo.TogoViewModel.onGetAppDetailAction(ir.mservices.market.togo.TogoAction$GetAppDetailAction, g51):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onGetBindsAction(TogoAction.GetBindsAction getBindsAction, g51<? super tx8> g51Var) {
        z4 z4Var = this.y.h;
        String str = (String) z4Var.e;
        if (str == null) {
            str = "";
        }
        Pair pair = new Pair("email", str);
        String str2 = (String) z4Var.f;
        String strG = new vv2().g(kotlin.collections.b.N(pair, new Pair(PaymentRequiredBindingDto.BINDING_PHONE, str2 != null ? str2 : "")), new TypeToken<Map<String, ? extends String>>() { // from class: ir.mservices.market.togo.TogoViewModel.onGetBindsAction.2
        }.getType());
        js3.o(strG, "toJson(...)");
        Object objC = this.z0.c(g51Var, strG);
        return objC == CoroutineSingletons.a ? objC : tx8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onGetGoogleAdIdAction(TogoAction.GetGoogleAdId getGoogleAdId) {
        this.w.a(new c(this, getGoogleAdId), getGoogleAdId.getTimeout());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
    
        if (r2.c(r9, "") == r0) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onGetInstalledAppsAction(ir.mservices.market.togo.TogoAction.GetInstalledAppsAction r9, defpackage.g51<? super defpackage.tx8> r10) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.togo.TogoViewModel.onGetInstalledAppsAction(ir.mservices.market.togo.TogoAction$GetInstalledAppsAction, g51):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onGetMetadataAction(TogoAction.GetMetadataAction getMetadataAction) {
        this.w.a(new d(this, getMetadataAction), 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onGetProfileInfoAction(TogoAction.GetProfileInfoAction getProfileInfoAction, g51<? super tx8> g51Var) {
        c5 c5Var = this.y;
        String strE = c5Var.h.e();
        if (strE == null) {
            strE = "";
        }
        Pair pair = new Pair("accountKey", strE);
        z4 z4Var = c5Var.h;
        String str = (String) z4Var.c;
        if (str == null) {
            str = "";
        }
        Pair pair2 = new Pair("nickname", str);
        String str2 = (String) z4Var.b;
        String strG = new vv2().g(kotlin.collections.b.N(pair, pair2, new Pair("avatar", str2 != null ? str2 : "")), new TypeToken<Map<String, ? extends String>>() { // from class: ir.mservices.market.togo.TogoViewModel.onGetProfileInfoAction.2
        }.getType());
        js3.o(strG, "toJson(...)");
        Object objC = this.M0.c(g51Var, strG);
        return objC == CoroutineSingletons.a ? objC : tx8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onGetTokenAction(TogoAction.GetTokenAction getTokenAction, g51<? super tx8> g51Var) {
        String strA = this.v.a();
        js3.o(strA, "getAccessToken(...)");
        Object objC = this.B0.c(g51Var, strA);
        return objC == CoroutineSingletons.a ? objC : tx8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInitAction(TogoAction.InitAction initAction) {
        this.H0 = initAction.getDeviceType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onIsAppInstalledAction(ir.mservices.market.togo.TogoAction.IsAppInstalledAction r5, defpackage.g51<? super defpackage.tx8> r6) {
        /*
            r4 = this;
            java.lang.String r0 = r5.getPackageName()
            if (r0 == 0) goto L4d
            boolean r1 = defpackage.f88.n0(r0)
            if (r1 != 0) goto Ld
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L4d
            java.lang.String r0 = r5.getPackageName()
            dp3 r1 = r4.A
            boolean r0 = r1.G(r0)
            if (r0 == 0) goto L49
            vv2 r0 = new vv2
            r0.<init>()
            ir.mservices.market.togo.data.InstalledApp r2 = new ir.mservices.market.togo.data.InstalledApp
            java.lang.String r3 = r5.getPackageName()
            java.lang.String r5 = r5.getPackageName()
            java.lang.Integer r5 = r1.p(r5)
            java.lang.String r1 = "getApplicationVersionCode(...)"
            defpackage.js3.o(r5, r1)
            int r5 = r5.intValue()
            r2.<init>(r3, r5)
            ir.mservices.market.togo.TogoViewModel$onIsAppInstalledAction$isAppInstalled$2$1 r5 = new ir.mservices.market.togo.TogoViewModel$onIsAppInstalledAction$isAppInstalled$2$1
            r5.<init>()
            java.lang.reflect.Type r5 = r5.getType()
            java.lang.String r5 = r0.g(r2, r5)
            goto L4b
        L49:
            java.lang.String r5 = "{}"
        L4b:
            if (r5 != 0) goto L4f
        L4d:
            java.lang.String r5 = ""
        L4f:
            kotlinx.coroutines.channels.a r0 = r4.F0
            java.lang.Object r5 = r0.c(r6, r5)
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            if (r5 != r6) goto L5a
            return r5
        L5a:
            tx8 r5 = defpackage.tx8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.togo.TogoViewModel.onIsAppInstalledAction(ir.mservices.market.togo.TogoAction$IsAppInstalledAction, g51):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onIsLoginAction(TogoAction.IsLoginAction isLoginAction, g51<? super tx8> g51Var) {
        Object objC = this.x0.c(g51Var, Boolean.valueOf(this.y.d()));
        return objC == CoroutineSingletons.a ? objC : tx8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onLoadPageAction(TogoAction.LoadPageAction loadPageAction, g51<? super tx8> g51Var) throws Throwable {
        Boolean boolValueOf = Boolean.valueOf(checkUrlSafeForJs(loadPageAction.getUrl()));
        l lVar = this.M;
        lVar.getClass();
        lVar.p(null, boolValueOf);
        Object objEmit = this.Q.emit(new Pair(createFinalUrl(loadPageAction.getUrl(), ((Boolean) lVar.getValue()).booleanValue()), lVar.getValue()), g51Var);
        return objEmit == CoroutineSingletons.a ? objEmit : tx8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNativeBackEnableAction(TogoAction.NativeBackEnableAction nativeBackEnableAction) {
        l lVar;
        Object value;
        do {
            lVar = this.K0;
            value = lVar.getValue();
        } while (!lVar.n(value, nativeBackEnableAction.getNativeBackData()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSafeDomainAction(TogoAction.SafeDomainAction safeDomainAction) {
        List<String> safeDomains = safeDomainAction.getSafeDomains();
        ArrayList arrayList = new ArrayList();
        for (Object obj : safeDomains) {
            if (f88.c0((String) obj, ".", false)) {
                arrayList.add(obj);
            }
        }
        this.H.addAll(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSetupHeaderAction(TogoAction.SetupHeaderAction setupHeaderAction) {
        HashMap map = (HashMap) this.K.getValue();
        i10 i10Var = this.v;
        map.put("X-Access-Token", i10Var.a());
        map.put("Authorization", i10Var.a());
        map.put("Myket-Version", "1028");
        String str = this.H0;
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
