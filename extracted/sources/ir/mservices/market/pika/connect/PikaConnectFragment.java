package ir.mservices.market.pika.connect;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.Lifecycle$State;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.c24;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.fa1;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.k86;
import defpackage.lw;
import defpackage.mm2;
import defpackage.n15;
import defpackage.n76;
import defpackage.o79;
import defpackage.od;
import defpackage.p76;
import defpackage.p97;
import defpackage.pk5;
import defpackage.q11;
import defpackage.q76;
import defpackage.q79;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.u03;
import defpackage.wq2;
import defpackage.x79;
import defpackage.y97;
import defpackage.zk8;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.pika.connect.ConnectionType;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.views.RippleBackground;
import java.util.Iterator;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.a;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class PikaConnectFragment extends Hilt_PikaConnectFragment implements mm2 {
    public static final /* synthetic */ int Y0 = 0;
    public final bi5 V0 = new bi5(g27.a(p76.class), new n15(16, this));
    public q76 W0;
    public final o79 X0;

    public PikaConnectFragment() {
        final PikaConnectFragment$special$$inlined$viewModels$default$1 pikaConnectFragment$special$$inlined$viewModels$default$1 = new PikaConnectFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.pika.connect.PikaConnectFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) pikaConnectFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.X0 = new o79(g27.a(PikaConnectViewModel.class), new bp2() { // from class: ir.mservices.market.pika.connect.PikaConnectFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.pika.connect.PikaConnectFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                q79 q79VarH;
                x79 x79Var = (x79) c24VarB.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return (jx2Var == null || (q79VarH = jx2Var.h()) == null) ? this.g.h() : q79VarH;
            }
        }, new bp2() { // from class: ir.mservices.market.pika.connect.PikaConnectFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                x79 x79Var = (x79) c24VarB.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return jx2Var != null ? jx2Var.i() : j71.b;
            }
        });
    }

    public static final void k1(PikaConnectFragment pikaConnectFragment, ConnectionType connectionType, String str, q11 q11Var) {
        String strM = connectionType instanceof ConnectionType.Advertise ? pikaConnectFragment.M(rs6.connect_advertise_dialog_title, q11Var.a) : pikaConnectFragment.M(rs6.connect_discover_dialog_title, q11Var.a);
        js3.m(strM);
        Bundle bundle = new Bundle();
        bundle.putString("ENDPOIN_ID", str);
        DialogDataModel dialogDataModel = new DialogDataModel(pikaConnectFragment.p1(), "DIALOG_KEY_ACCEPT_CONNECTION", bundle, 8);
        int i = 1;
        int i2 = 0;
        for (byte b : q11Var.b) {
            int i3 = (b * i) + i2;
            i = (i * 31) % 9973;
            i2 = i3 % 9973;
        }
        String str2 = String.format(Locale.US, "%04d", Integer.valueOf(Math.abs(i2)));
        String strL = pikaConnectFragment.L(rs6.connect_dialog_continue);
        js3.o(strL, "getString(...)");
        pk5.g(pikaConnectFragment.J0, new NavIntentDirections.ConfirmConnect(new n76(dialogDataModel, strM, str2, strL)), -1);
    }

    public static final void l1(PikaConnectFragment pikaConnectFragment) {
        String string = pikaConnectFragment.K().getString(rs6.nearby_update_own_device, pikaConnectFragment.q1().w.a.getValue());
        js3.o(string, "getString(...)");
        DialogDataModel dialogDataModel = new DialogDataModel(pikaConnectFragment.p1(), "DIALOG_KEY_OWN_DEVICE_UPDATE_REQUIRE", null, 12);
        String strL = pikaConnectFragment.L(rs6.update_app);
        js3.o(strL, "getString(...)");
        pk5.g(pikaConnectFragment.J0, new NavIntentDirections.ReceiveUpdateRequire(new k86(dialogDataModel, string, strL)), -1);
    }

    public static final void m1(PikaConnectFragment pikaConnectFragment) {
        String string = pikaConnectFragment.K().getString(rs6.nearby_update_pair_device, pikaConnectFragment.q1().w.a.getValue());
        js3.o(string, "getString(...)");
        DialogDataModel dialogDataModel = new DialogDataModel(pikaConnectFragment.p1(), "DIALOG_KEY_PAIR_DEVICE_UPDATE_REQUIRE", null, 12);
        String strL = pikaConnectFragment.L(rs6.button_ok);
        js3.o(strL, "getString(...)");
        pk5.g(pikaConnectFragment.J0, new NavIntentDirections.AlertCenter(new od(dialogDataModel, "", string, strL, 0)), -1);
    }

    public static final void n1(PikaConnectFragment pikaConnectFragment, String str) {
        DialogDataModel dialogDataModel = new DialogDataModel(pikaConnectFragment.p1(), "DIALOG_KEY_TIME_OUT", null, 12);
        String strL = pikaConnectFragment.L(rs6.btn_try_again);
        js3.o(strL, "getString(...)");
        pk5.g(pikaConnectFragment.J0, new NavIntentDirections.ReceiveUpdateRequire(new k86(dialogDataModel, str, strL)), -1);
    }

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        Handler handler;
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(p1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            if ("DIALOG_KEY_ACCEPT_CONNECTION".equalsIgnoreCase(dialogDataModel.b)) {
                String string = dialogDataModel.c.getString("ENDPOIN_ID", "");
                if (dialogDataModel.d == DialogResult.a) {
                    ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                    clickEventBuilder.b("pika_connect_dialog_ok");
                    clickEventBuilder.a();
                    PikaConnectViewModel pikaConnectViewModelQ1 = q1();
                    js3.m(string);
                    bt2.G(y97.G(pikaConnectViewModelQ1), null, null, new PikaConnectViewModel$connectionAccepted$1(pikaConnectViewModelQ1, string, null), 3);
                    return;
                }
                ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                clickEventBuilder2.b("pika_connect_dialog_cancel");
                clickEventBuilder2.a();
                PikaConnectViewModel pikaConnectViewModelQ12 = q1();
                js3.m(string);
                pikaConnectViewModelQ12.r();
                l lVar = pikaConnectViewModelQ12.v;
                lVar.getClass();
                lVar.p(null, "");
                pikaConnectViewModelQ12.t.connectionRefused(string);
                this.J0.r(Integer.valueOf(rr6.pikaHome));
                return;
            }
            if ("DIALOG_KEY_OWN_DEVICE_UPDATE_REQUIRE".equalsIgnoreCase(dialogDataModel.b)) {
                if (dialogDataModel.d != DialogResult.a) {
                    dw1.y("pika_update_dialog_cancel");
                    this.J0.r(Integer.valueOf(rr6.pikaHome));
                    return;
                }
                ClickEventBuilder clickEventBuilder3 = new ClickEventBuilder();
                clickEventBuilder3.b("pika_update_dialog_ok");
                clickEventBuilder3.a();
                u03 u03Var = new u03(14, this);
                synchronized (zk8.class) {
                    handler = zk8.a;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                        zk8.a = handler;
                    }
                }
                lw.f(null, null, handler.postDelayed(u03Var, 500L));
                return;
            }
            if ("DIALOG_KEY_PAIR_DEVICE_UPDATE_REQUIRE".equalsIgnoreCase(dialogDataModel.b)) {
                this.J0.r(Integer.valueOf(rr6.pikaHome));
                return;
            }
            if ("DIALOG_KEY_TIME_OUT".equalsIgnoreCase(dialogDataModel.b)) {
                if (dialogDataModel.d != DialogResult.a) {
                    this.J0.r(Integer.valueOf(rr6.pikaHome));
                    return;
                }
                ConnectionType connectionType = o1().a;
                if (connectionType instanceof ConnectionType.Advertise) {
                    PikaConnectViewModel pikaConnectViewModelQ13 = q1();
                    pikaConnectViewModelQ13.r();
                    pikaConnectViewModelQ13.t.startAdvertising();
                } else {
                    if (!(connectionType instanceof ConnectionType.Discover)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PikaConnectViewModel pikaConnectViewModelQ14 = q1();
                    pikaConnectViewModelQ14.r();
                    pikaConnectViewModelQ14.t.startDiscovering();
                }
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String string = K().getString(rs6.page_name_pika_searching);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        if (js3.i(o1().a, ConnectionType.Advertise.a)) {
            String string = baseFragmentContentActivity.getString(rs6.share_app_received);
            js3.m(string);
            return string;
        }
        String string2 = baseFragmentContentActivity.getString(rs6.share_app_sned);
        js3.m(string2);
        return string2;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = q76.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        q76 q76Var = (q76) fa1.c(layoutInflater, js6.pika_connect_fragment, viewGroup, false);
        this.W0 = q76Var;
        View view = q76Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        q1().t.clearReceivedFiles();
        this.J0.x(p1());
        q76 q76Var = this.W0;
        js3.m(q76Var);
        RippleBackground rippleBackground = q76Var.v;
        AnimatorSet animatorSet = rippleBackground.d;
        if (rippleBackground.b) {
            animatorSet.end();
            animatorSet.removeAllListeners();
            for (Animator animator : rippleBackground.f) {
                animator.removeAllListeners();
                animator.end();
            }
            rippleBackground.b = false;
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean b1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean c1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        this.J0.d(p1(), this);
        q76 q76Var = this.W0;
        js3.m(q76Var);
        RippleBackground rippleBackground = q76Var.v;
        if (!rippleBackground.b) {
            Iterator it = rippleBackground.e.iterator();
            while (it.hasNext()) {
                ((p97) it.next()).setVisibility(0);
            }
            rippleBackground.d.start();
            rippleBackground.b = true;
        }
        ConnectionType connectionType = o1().a;
        if (connectionType instanceof ConnectionType.Advertise) {
            q76 q76Var2 = this.W0;
            js3.m(q76Var2);
            q76Var2.y.setText(K().getString(rs6.wait_for_discover));
            q76 q76Var3 = this.W0;
            js3.m(q76Var3);
            q76Var3.w.setText(K().getString(rs6.discover_scenario_desc));
            q76 q76Var4 = this.W0;
            js3.m(q76Var4);
            q76Var4.x.setText(M(rs6.pika_device_name, wq2.A()));
            ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new PikaConnectFragment$subscribeAdvertiseFlow$1(this, null));
        } else {
            if (!(connectionType instanceof ConnectionType.Discover)) {
                throw new NoWhenBranchMatchedException();
            }
            q76 q76Var5 = this.W0;
            js3.m(q76Var5);
            q76Var5.y.setText(K().getString(rs6.wait_for_advertise));
            q76 q76Var6 = this.W0;
            js3.m(q76Var6);
            q76Var6.w.setText(K().getString(rs6.advertise_scenario_desc));
            ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new PikaConnectFragment$subscribeDiscoverFlow$1(this, null));
        }
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new PikaConnectFragment$onViewCreated$1(this, null));
    }

    public final p76 o1() {
        return (p76) this.V0.getValue();
    }

    public final String p1() {
        return dw1.n("PikaConnectFragment_", this.H0);
    }

    public final PikaConnectViewModel q1() {
        return (PikaConnectViewModel) this.X0.getValue();
    }
}
