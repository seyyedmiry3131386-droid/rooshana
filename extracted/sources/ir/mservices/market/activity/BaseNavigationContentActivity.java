package ir.mservices.market.activity;

import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.Lifecycle$State;
import androidx.navigation.fragment.NavHostFragment;
import defpackage.am2;
import defpackage.cg5;
import defpackage.dp2;
import defpackage.dp3;
import defpackage.dt2;
import defpackage.e56;
import defpackage.e80;
import defpackage.eg5;
import defpackage.f80;
import defpackage.g27;
import defpackage.g51;
import defpackage.h7;
import defpackage.ij5;
import defpackage.is3;
import defpackage.js3;
import defpackage.js8;
import defpackage.lw;
import defpackage.m2;
import defpackage.mj2;
import defpackage.mm2;
import defpackage.n2;
import defpackage.o79;
import defpackage.od;
import defpackage.pk5;
import defpackage.qp2;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.rv6;
import defpackage.t32;
import defpackage.t61;
import defpackage.tb1;
import defpackage.tj5;
import defpackage.tx8;
import defpackage.yi5;
import defpackage.yq6;
import defpackage.zk8;
import ir.mservices.market.activity.BaseNavigationContentAction;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.permission.PermissionReason;
import ir.mservices.market.version2.fragments.a;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.dialog.PermissionReasonDialogFragment;
import ir.mservices.market.version2.webapi.responsedto.ErrorActionDto;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseNavigationContentActivity extends Hilt_BaseNavigationContentActivity implements am2, mm2 {
    public tj5 T;
    public eg5 U;
    public dp3 V;
    public a W;
    public ij5 X;
    public NavHostFragment Y;
    public final o79 Z = new o79(g27.a(BaseNavigationContentViewModel.class), new f80(this, 1), new f80(this, 0), new f80(this, 2));

    /* JADX INFO: renamed from: ir.mservices.market.activity.BaseNavigationContentActivity$onCreate$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements qp2 {
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            js3.p((Menu) obj, "p0");
            js3.p((MenuInflater) obj2, "p1");
            ((BaseNavigationContentActivity) this.receiver).getClass();
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.activity.BaseNavigationContentActivity$onCreate$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements dp2 {
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            MenuItem menuItem = (MenuItem) obj;
            js3.p(menuItem, "p0");
            return Boolean.valueOf(((BaseNavigationContentActivity) this.receiver).f0(menuItem));
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.activity.BaseNavigationContentActivity$onCreate$3, reason: invalid class name */
    @tb1(c = "ir.mservices.market.activity.BaseNavigationContentActivity$onCreate$3", f = "BaseNavigationContentActivity.kt", l = {88}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements dp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.activity.BaseNavigationContentActivity$onCreate$3$1, reason: invalid class name */
        @tb1(c = "ir.mservices.market.activity.BaseNavigationContentActivity$onCreate$3$1", f = "BaseNavigationContentActivity.kt", l = {}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements qp2 {
            public /* synthetic */ Object a;
            public final /* synthetic */ BaseNavigationContentActivity b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BaseNavigationContentActivity baseNavigationContentActivity, g51 g51Var) {
                super(2, g51Var);
                this.b = baseNavigationContentActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
                anonymousClass1.a = obj;
                return anonymousClass1;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((e80) obj, (g51) obj2);
                tx8 tx8Var = tx8.a;
                anonymousClass1.invokeSuspend(tx8Var);
                return tx8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                e80 e80Var = (e80) this.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                b.b(obj);
                BaseNavigationContentActivity baseNavigationContentActivity = this.b;
                boolean z = baseNavigationContentActivity.g() instanceof PermissionReasonDialogFragment;
                tx8 tx8Var = tx8.a;
                if (!z && e80Var != null) {
                    pk5.g(baseNavigationContentActivity, new NavIntentDirections.PermissionReason(new e56(new DialogDataModel(baseNavigationContentActivity.d0(), "DIALOG_KEY_PERMISSION_REASON", is3.g(new Pair("BUNDLE_KEY_REQUEST_CODE", new Integer(e80Var.a))), 8), false, new PermissionReason(yq6.app_icon_gradient, baseNavigationContentActivity.getResources().getString(rs6.permission_title_install), baseNavigationContentActivity.getResources().getString(rs6.permission_description_install)))), -1);
                    ((BaseNavigationContentViewModel) baseNavigationContentActivity.Z.getValue()).r(BaseNavigationContentAction.ClearInstallPermissionEventAction.INSTANCE);
                }
                return tx8Var;
            }
        }

        public AnonymousClass3(g51 g51Var) {
            super(1, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(g51 g51Var) {
            return BaseNavigationContentActivity.this.new AnonymousClass3(g51Var);
        }

        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            return ((AnonymousClass3) create((g51) obj)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                BaseNavigationContentActivity baseNavigationContentActivity = BaseNavigationContentActivity.this;
                rv6 rv6Var = ((BaseNavigationContentViewModel) baseNavigationContentActivity.Z.getValue()).w;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(baseNavigationContentActivity, null);
                this.a = 1;
                if (d.f(rv6Var, anonymousClass1, this) == coroutineSingletons) {
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

    @Override // defpackage.mm2
    public void B(Bundle bundle, String str) {
        DialogDataModel dialogDataModel;
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(d0()) && (dialogDataModel = (DialogDataModel) dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class)) != null) {
            Bundle bundle2 = dialogDataModel.c;
            String str2 = dialogDataModel.b;
            if ("DIALOG_KEY_ERROR".equalsIgnoreCase(str2) && bundle.getBoolean("BUNDLE_KEY_CANCEL_TEXT")) {
                ErrorActionDto errorActionDto = (ErrorActionDto) dt2.s(bundle2, "BUNDLE_KEY_ERROR_ACTION", ErrorActionDto.class);
                String action = errorActionDto != null ? errorActionDto.getAction() : null;
                if (action != null) {
                    Uri uri = Uri.parse(action);
                    js3.o(uri, "parse(...)");
                    js8.q(this, uri, null, null);
                    return;
                }
                return;
            }
            if ("DIALOG_KEY_FORCE_UPDATE".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.b) {
                    finish();
                }
            } else if ("DIALOG_KEY_PERMISSION_REASON".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.a) {
                dp3 dp3Var = this.V;
                if (dp3Var != null) {
                    dp3Var.O(this, bundle2.getInt("BUNDLE_KEY_REQUEST_CODE"));
                } else {
                    js3.V("installManager");
                    throw null;
                }
            }
        }
    }

    @Override // defpackage.am2
    public void E() {
    }

    @Override // defpackage.am2
    public void clearAll() {
        a aVar = this.W;
        if (aVar != null) {
            aVar.a(null);
        }
    }

    @Override // defpackage.am2
    public final void d(String str, mm2 mm2Var) {
        js3.p(str, "requestKey");
        js3.p(mm2Var, "listener");
        L().h0(str, this, mm2Var);
    }

    public final String d0() {
        return t61.j(getClass().getSimpleName(), "_", this.O);
    }

    public void e0(androidx.fragment.app.d dVar) {
        js3.p(dVar, "fragment");
        zk8 zk8VarP = P();
        if (zk8VarP != null) {
            zk8VarP.i0();
        }
    }

    public boolean f0(MenuItem menuItem) {
        js3.p(menuItem, "menuItem");
        return false;
    }

    @Override // defpackage.am2
    public final androidx.fragment.app.d g() {
        a aVar = this.W;
        if (aVar != null) {
            return aVar.c();
        }
        return null;
    }

    public final ij5 g0() {
        ij5 ij5Var = this.X;
        if (ij5Var != null) {
            return ij5Var;
        }
        throw new Exception("navController is null");
    }

    public void h0() {
    }

    public final void i0(int i) {
        pk5.g(this, new NavIntentDirections.ForceUpdate(new mj2(new DialogDataModel(d0(), "DIALOG_KEY_FORCE_UPDATE", null, 12), i)), -1);
    }

    public final void j0() {
        a aVar;
        androidx.fragment.app.d dVarF = L().F(rr6.content);
        if (!(dVarF instanceof NavHostFragment)) {
            throw new IllegalStateException("content must be navHostFragment");
        }
        NavHostFragment navHostFragment = (NavHostFragment) dVarF;
        this.Y = navHostFragment;
        this.X = navHostFragment.z0();
        NavHostFragment navHostFragment2 = this.Y;
        if (navHostFragment2 != null && (aVar = this.W) != null) {
            aVar.h(navHostFragment2);
        }
        androidx.fragment.app.d dVarS = s();
        if (dVarS != null) {
            e0(dVarS);
        }
    }

    @Override // defpackage.am2
    public final void k(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "bundle");
        if (bundle.getBoolean("BUNDLE_KEY_DISMISS", false) && g() != null) {
            q();
        }
        L().g0(bundle, str);
    }

    @Override // ir.mservices.market.activity.BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h7 h7Var = new h7(new AnonymousClass2(1, this, BaseNavigationContentActivity.class, "onMenuItemSelected", "onMenuItemSelected(Landroid/view/MenuItem;)Z", 0), new AnonymousClass1(2, this, BaseNavigationContentActivity.class, "onCreateMenu", "onCreateMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V", 0));
        Lifecycle$State lifecycle$State = Lifecycle$State.a;
        H(h7Var, this);
        tj5 tj5Var = this.T;
        if (tj5Var == null) {
            js3.V("navigationAnalytics");
            throw null;
        }
        this.W = new a(tj5Var);
        d(d0(), this);
        ir.mservices.market.core.ext.a.g(this, new AnonymousClass3(null));
    }

    @Override // ir.mservices.market.activity.BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        x(d0());
        this.W = null;
    }

    public final void onEvent(cg5 cg5Var) {
        js3.p(cg5Var, "event");
        eg5 eg5Var = this.U;
        if (eg5Var != null) {
            i0(eg5Var.j());
        } else {
            js3.V("myketUpdateManager");
            throw null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        eg5 eg5Var = this.U;
        if (eg5Var == null) {
            js3.V("myketUpdateManager");
            throw null;
        }
        if (eg5Var.k() && bundle == null) {
            eg5 eg5Var2 = this.U;
            if (eg5Var2 != null) {
                i0(eg5Var2.j());
            } else {
                js3.V("myketUpdateManager");
                throw null;
            }
        }
    }

    @Override // ir.mservices.market.activity.BaseContentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        t32.b().l(this, false);
        super.onStart();
    }

    @Override // ir.mservices.market.activity.BaseContentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        t32.b().o(this);
    }

    @Override // defpackage.am2
    public final void p() {
        a aVar = this.W;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // defpackage.am2
    public final void q() {
        a aVar = this.W;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // defpackage.am2
    public final void r(Integer num) {
        a aVar = this.W;
        if (aVar != null) {
            aVar.a(num);
        }
    }

    @Override // defpackage.am2
    public final androidx.fragment.app.d s() {
        a aVar = this.W;
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    @Override // defpackage.am2
    public final void x(String str) {
        js3.p(str, "requestKey");
        L().e(str);
    }

    @Override // defpackage.am2
    public void y(yi5 yi5Var, Integer num) {
        js3.p(yi5Var, "navDirections");
        a aVar = this.W;
        if (aVar != null) {
            aVar.g(yi5Var);
        }
    }

    public final void onEvent(n2 n2Var) {
        js3.p(n2Var, "event");
        i0(n2Var.a);
    }

    public final void onEvent(m2 m2Var) {
        js3.p(m2Var, "event");
        ErrorActionDto errorActionDto = m2Var.a;
        lw.d(null, null, errorActionDto);
        DialogDataModel dialogDataModel = new DialogDataModel(d0(), "DIALOG_KEY_ERROR", is3.g(new Pair("BUNDLE_KEY_ERROR_ACTION", errorActionDto)), 8);
        String title = errorActionDto != null ? errorActionDto.getTitle() : null;
        String message = errorActionDto.getMessage();
        String buttonText = errorActionDto.getButtonText();
        js3.o(buttonText, "getButtonText(...)");
        pk5.g(this, new NavIntentDirections.AlertCenter(new od(dialogDataModel, title, message, buttonText, 0)), -1);
    }
}
