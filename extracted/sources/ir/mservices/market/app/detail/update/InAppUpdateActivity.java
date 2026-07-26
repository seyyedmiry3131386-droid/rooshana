package ir.mservices.market.app.detail.update;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.d;
import androidx.navigation.fragment.NavHostFragment;
import defpackage.am2;
import defpackage.bt2;
import defpackage.dp2;
import defpackage.dp3;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.e56;
import defpackage.e71;
import defpackage.e80;
import defpackage.f88;
import defpackage.g27;
import defpackage.g51;
import defpackage.js3;
import defpackage.js6;
import defpackage.ly5;
import defpackage.m88;
import defpackage.mm2;
import defpackage.o79;
import defpackage.pk5;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rf7;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.rv6;
import defpackage.t32;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vk3;
import defpackage.wk3;
import defpackage.wt;
import defpackage.y97;
import defpackage.yi5;
import defpackage.yq6;
import ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.permission.PermissionReason;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.dialog.PermissionReasonDialogFragment;
import ir.mservices.market.version2.webapi.responsedto.AppUpdateDTO;
import ir.mservices.market.version2.webapi.responsedto.UpdateDTO;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppUpdateActivity extends Hilt_InAppUpdateActivity implements am2, mm2 {
    public static final /* synthetic */ int T = 0;
    public rf7 O;
    public dp3 P;
    public String Q;
    public final o79 R = new o79(g27.a(InAppUpdateActivityViewModel.class), new wk3(this, 1), new wk3(this, 0), new wk3(this, 2));
    public final ir.mservices.market.version2.fragments.a S = new ir.mservices.market.version2.fragments.a(null);

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.update.InAppUpdateActivity$onCreate$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.detail.update.InAppUpdateActivity$onCreate$1", f = "InAppUpdateActivity.kt", l = {67}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return InAppUpdateActivity.this.new AnonymousClass1(g51Var);
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
            int i2 = InAppUpdateActivity.T;
            InAppUpdateActivity inAppUpdateActivity = InAppUpdateActivity.this;
            rv6 rv6Var = ((InAppUpdateActivityViewModel) inAppUpdateActivity.R.getValue()).y;
            vk3 vk3Var = new vk3(inAppUpdateActivity, 0);
            this.a = 1;
            Object objA = rv6Var.a.a(new pt1(vk3Var, 3), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.update.InAppUpdateActivity$onCreate$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.detail.update.InAppUpdateActivity$onCreate$2", f = "InAppUpdateActivity.kt", l = {75}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass2(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return InAppUpdateActivity.this.new AnonymousClass2(g51Var);
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
            int i2 = 1;
            if (i == 0) {
                kotlin.b.b(obj);
                int i3 = InAppUpdateActivity.T;
                InAppUpdateActivity inAppUpdateActivity = InAppUpdateActivity.this;
                pv6 pv6Var = ((InAppUpdateActivityViewModel) inAppUpdateActivity.R.getValue()).A;
                vk3 vk3Var = new vk3(inAppUpdateActivity, i2);
                this.a = 1;
                if (pv6Var.a.a(vk3Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(S())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            String str2 = dialogDataModel.b;
            if ("DIALOG_KEY_UPDATE".equalsIgnoreCase(str2)) {
                finish();
                return;
            }
            if ("DIALOG_KEY_PERMISSION_REASON".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d != DialogResult.a) {
                    finish();
                    return;
                }
                dp3 dp3Var = this.P;
                if (dp3Var != null) {
                    dp3Var.O(this, dialogDataModel.c.getInt("BUNDLE_KEY_REQUEST_CODE"));
                } else {
                    js3.V("installManager");
                    throw null;
                }
            }
        }
    }

    @Override // defpackage.z80
    public final String C() {
        String string = getString(rs6.page_name_in_app_update);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // defpackage.am2
    public final void E() {
    }

    public final String S() {
        return dw1.n("InAppUpdateActivity_", this.K);
    }

    @Override // defpackage.am2
    public final void clearAll() {
        this.S.a(null);
    }

    @Override // defpackage.am2
    public final void d(String str, mm2 mm2Var) {
        js3.p(str, "requestKey");
        js3.p(mm2Var, "listener");
        L().h0(str, this, mm2Var);
    }

    @Override // defpackage.am2
    public final d g() {
        return this.S.c();
    }

    @Override // defpackage.am2
    public final void k(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "bundle");
        if (bundle.getBoolean("BUNDLE_KEY_DISMISS", false) && this.S.c() != null) {
            q();
        }
        L().g0(bundle, str);
    }

    /* JADX WARN: Type inference failed for: r11v21, types: [ir.mservices.market.app.detail.update.b] */
    @Override // ir.mservices.market.core.BaseDialogActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String lowerCase;
        String host;
        super.onCreate(bundle);
        bt2.G(androidx.lifecycle.b.a(this), null, null, new AnonymousClass1(null), 3);
        bt2.G(androidx.lifecycle.b.a(this), null, null, new AnonymousClass2(null), 3);
        t32.b().l(this, false);
        setResult(0);
        ApplicationLauncher.f(this);
        setContentView(js6.activity_in_app_update);
        d dVarF = L().F(rr6.content);
        if (dVarF != null) {
            if (!(dVarF instanceof NavHostFragment)) {
                throw new IllegalStateException("content must be navHostFragment");
            }
            this.S.h((NavHostFragment) dVarF);
        }
        d(S(), this);
        Intent intent = getIntent();
        js3.o(intent, "getIntent(...)");
        if ("android.intent.action.VIEW".equals(intent.getAction())) {
            Uri data = intent.getData();
            if (data == null || (host = data.getHost()) == null) {
                lowerCase = null;
            } else {
                lowerCase = host.toLowerCase(Locale.ROOT);
                js3.o(lowerCase, "toLowerCase(...)");
            }
            String string = getString(rs6.external_intent_filters_host_in_app_update);
            js3.o(string, "getString(...)");
            if (m88.T(lowerCase, string, true)) {
                Uri data2 = intent.getData();
                String queryParameter = data2 != null ? data2.getQueryParameter("id") : null;
                this.Q = queryParameter;
                if (queryParameter != null) {
                    Uri referrer = getReferrer();
                    if (!queryParameter.equals(referrer != null ? referrer.getHost() : null)) {
                        finish();
                    }
                }
                final InAppUpdateActivityViewModel inAppUpdateActivityViewModel = (InAppUpdateActivityViewModel) this.R.getValue();
                final String str = this.Q;
                rf7 rf7Var = this.O;
                if (rf7Var == null) {
                    js3.V("screenQualityHelper");
                    throw null;
                }
                final float fC = rf7Var.c(this);
                if (this.O == null) {
                    js3.V("screenQualityHelper");
                    throw null;
                }
                final int iA = rf7.a(this);
                dp3 dp3Var = inAppUpdateActivityViewModel.v;
                if (str == null || f88.n0(str) || dp3Var.p(str) == null) {
                    bt2.G(y97.G(inAppUpdateActivityViewModel), null, null, new InAppUpdateActivityViewModel$checkUpdate$1(inAppUpdateActivityViewModel, null), 3);
                    return;
                }
                wt wtVar = inAppUpdateActivityViewModel.t;
                Integer numP = dp3Var.p(str);
                js3.o(numP, "getApplicationVersionCode(...)");
                if (((AppUpdateRepositoryImpl) wtVar).d(numP.intValue(), str)) {
                    bt2.G(y97.G(inAppUpdateActivityViewModel), null, null, new InAppUpdateActivityViewModel$getApplicationDetail$1(inAppUpdateActivityViewModel, str, iA, fC, str, null), 3);
                    return;
                } else {
                    bt2.G(y97.G(inAppUpdateActivityViewModel), null, null, new InAppUpdateActivityViewModel$checkUpdate$2(inAppUpdateActivityViewModel, str, new dp2() { // from class: ir.mservices.market.app.detail.update.b
                        @Override // defpackage.dp2
                        public final Object invoke(Object obj) {
                            List<AppUpdateDTO> appUpdates;
                            UpdateDTO updateDTO = (UpdateDTO) obj;
                            InAppUpdateActivityViewModel inAppUpdateActivityViewModel2 = inAppUpdateActivityViewModel;
                            if (updateDTO == null || (appUpdates = updateDTO.getAppUpdates()) == null || appUpdates.isEmpty()) {
                                bt2.G(y97.G(inAppUpdateActivityViewModel2), null, null, new InAppUpdateActivityViewModel$checkUpdate$listener$1$1(inAppUpdateActivityViewModel2, null), 3);
                            } else {
                                Iterator<T> it = appUpdates.iterator();
                                while (it.hasNext()) {
                                    String packageName = ((AppUpdateDTO) it.next()).getPackageName();
                                    String str2 = str;
                                    if (js3.i(packageName, str2)) {
                                        js3.p(str2, "packageName");
                                        bt2.G(y97.G(inAppUpdateActivityViewModel2), null, null, new InAppUpdateActivityViewModel$getApplicationDetail$1(inAppUpdateActivityViewModel2, str2, iA, fC, str2, null), 3);
                                        break;
                                    }
                                }
                                bt2.G(y97.G(inAppUpdateActivityViewModel2), null, null, new InAppUpdateActivityViewModel$checkUpdate$listener$1$1(inAppUpdateActivityViewModel2, null), 3);
                            }
                            return tx8.a;
                        }
                    }, null), 3);
                    return;
                }
            }
        }
        finish();
    }

    @Override // ir.mservices.market.core.BaseDialogActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        t32.b().o(this);
        x(S());
        super.onDestroy();
    }

    public final void onEvent(e80 e80Var) {
        js3.p(e80Var, "event");
        if (this.S.c() instanceof PermissionReasonDialogFragment) {
            return;
        }
        PermissionReason permissionReason = new PermissionReason(yq6.app_icon_gradient, getResources().getString(rs6.permission_title_install), getResources().getString(rs6.permission_description_install));
        String strS = S();
        Bundle bundle = new Bundle();
        bundle.putInt("BUNDLE_KEY_REQUEST_CODE", e80Var.a);
        pk5.g(this, new NavIntentDirections.PermissionReason(new e56(new DialogDataModel(strS, "DIALOG_KEY_PERMISSION_REASON", bundle, 8), false, permissionReason)), -1);
    }

    @Override // defpackage.am2
    public final void p() {
        this.S.f();
    }

    @Override // defpackage.am2
    public final void q() {
        this.S.d();
    }

    @Override // defpackage.am2
    public final void r(Integer num) {
        this.S.a(num);
    }

    @Override // defpackage.am2
    public final d s() {
        return this.S.b();
    }

    @Override // defpackage.am2
    public final void x(String str) {
        js3.p(str, "requestKey");
        L().e(str);
    }

    @Override // defpackage.am2
    public final void y(yi5 yi5Var, Integer num) {
        js3.p(yi5Var, "navDirections");
        this.S.g(yi5Var);
    }

    public final void onEvent(ly5 ly5Var) {
        js3.p(ly5Var, "event");
        String str = this.Q;
        if (str == null || f88.n0(str) || !m88.T(dp3.y(ly5Var.a), dp3.y(this.Q), true)) {
            return;
        }
        finish();
    }
}
