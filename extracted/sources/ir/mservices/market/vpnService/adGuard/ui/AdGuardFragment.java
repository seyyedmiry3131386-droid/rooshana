package ir.mservices.market.vpnService.adGuard.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import defpackage.b77;
import defpackage.bp2;
import defpackage.c24;
import defpackage.cc7;
import defpackage.d56;
import defpackage.dt2;
import defpackage.ea7;
import defpackage.fa1;
import defpackage.g27;
import defpackage.ga;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.lk2;
import defpackage.m88;
import defpackage.mm2;
import defpackage.o79;
import defpackage.pq6;
import defpackage.q39;
import defpackage.q79;
import defpackage.rs6;
import defpackage.s7;
import defpackage.sj8;
import defpackage.uk2;
import defpackage.x79;
import defpackage.yq6;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.views.SmallBoldTextButton;
import ir.mservices.market.views.TryAgainView;
import ir.mservices.market.vpnService.adGuard.ui.AdGuardAction;
import ir.mservices.market.vpnService.adGuard.ui.AdGuardFragment;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class AdGuardFragment extends Hilt_AdGuardFragment implements mm2 {
    public static final /* synthetic */ int a1 = 0;
    public d56 V0;
    public uk2 W0;
    public final o79 X0;
    public lk2 Y0;
    public lk2 Z0;

    public AdGuardFragment() {
        final AdGuardFragment$special$$inlined$viewModels$default$1 adGuardFragment$special$$inlined$viewModels$default$1 = new AdGuardFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.vpnService.adGuard.ui.AdGuardFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) adGuardFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.X0 = new o79(g27.a(AdGuardViewModel.class), new bp2() { // from class: ir.mservices.market.vpnService.adGuard.ui.AdGuardFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.vpnService.adGuard.ui.AdGuardFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.vpnService.adGuard.ui.AdGuardFragment$special$$inlined$viewModels$default$4
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

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
        js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
        DialogDataModel dialogDataModel = (DialogDataModel) objP;
        if (m88.T(dialogDataModel.b, "DIALOG_KEY_AD_GUARD", true) && dialogDataModel.d == DialogResult.a) {
            l1().r(AdGuardAction.DisconnectActiveServiceAction.INSTANCE, AdGuardAction.StartVpnAction.INSTANCE);
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String string = K().getString(rs6.page_name_ad_guard);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int H0() {
        return sj8.b().p;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int M0() {
        return sj8.b().p;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int P0() {
        return sj8.b().p;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String string = baseFragmentContentActivity.getResources().getString(rs6.ad_guard_title_page);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int R0() {
        return sj8.b().p;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean X0() {
        return true;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = uk2.E;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        uk2 uk2Var = (uk2) fa1.c(layoutInflater, js6.fragment_ad_guard, viewGroup, false);
        this.W0 = uk2Var;
        View view = uk2Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        this.Y0 = null;
        this.Z0 = null;
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
        Drawable drawable;
        js3.p(view, "view");
        super.k0(view, bundle);
        final int i = 0;
        cc7.d(this.J, 0, 0, 0, 7);
        final int i2 = 1;
        this.Y0 = (lk2) n0(new ga(this, i), new s7(i2));
        int i3 = 2;
        this.Z0 = (lk2) n0(new ga(this, i2), new s7(i3));
        this.J0.d("AdGuardFragment_" + this.H0, this);
        uk2 uk2Var = this.W0;
        js3.m(uk2Var);
        View view2 = uk2Var.x;
        js3.o(view2, "messageBoxBackground");
        k1(view2);
        View view3 = uk2Var.D;
        js3.o(view3, "vpnBackground");
        k1(view3);
        uk2Var.v.setOnClickListener(new View.OnClickListener(this) { // from class: ha
            public final /* synthetic */ AdGuardFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                String str;
                int i4 = i;
                AdGuardFragment adGuardFragment = this.b;
                switch (i4) {
                    case 0:
                        int i5 = AdGuardFragment.a1;
                        dc9 dc9Var = (dc9) adGuardFragment.l1().D.a.getValue();
                        if (!(dc9Var instanceof xb9)) {
                            str = dc9Var instanceof bc9 ? "ad_guard_connect" : "ad_guard_disconnect";
                            adGuardFragment.l1().r(AdGuardAction.ToggleVpnAction.INSTANCE);
                            break;
                        }
                        dw1.y(str);
                        adGuardFragment.l1().r(AdGuardAction.ToggleVpnAction.INSTANCE);
                        break;
                    default:
                        int i6 = AdGuardFragment.a1;
                        FragmentActivity fragmentActivityF = adGuardFragment.F();
                        if (fragmentActivityF != null) {
                            Intent intent = new Intent("android.settings.WIRELESS_SETTINGS");
                            PackageManager packageManager = fragmentActivityF.getPackageManager();
                            if ((packageManager != null ? intent.resolveActivity(packageManager) : null) == null) {
                                int i7 = AdGuardFragment.a1;
                                FragmentActivity fragmentActivityF2 = adGuardFragment.F();
                                hh2.H(new hh2(fragmentActivityF2, fragmentActivityF2 != null ? fragmentActivityF2.getString(rs6.uncatchable_intent) : null));
                            } else {
                                fragmentActivityF.startActivity(intent);
                            }
                        }
                        break;
                }
            }
        });
        SmallBoldTextButton smallBoldTextButton = uk2Var.y;
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i4 = yq6.ic_arrow_end;
        try {
            drawable = q39.a(resources, i4, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i4, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i4, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().c, PorterDuff.Mode.MULTIPLY));
        smallBoldTextButton.setSmallIcon(drawable);
        TryAgainView tryAgainView = uk2Var.B;
        tryAgainView.setOnTryAgainListener(new ga(this, i3));
        tryAgainView.setPrimaryColor(sj8.b().c, sj8.b().d);
        tryAgainView.setColors(sj8.b().p);
        tryAgainView.setOnSettingListener(new View.OnClickListener(this) { // from class: ha
            public final /* synthetic */ AdGuardFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                String str;
                int i42 = i2;
                AdGuardFragment adGuardFragment = this.b;
                switch (i42) {
                    case 0:
                        int i5 = AdGuardFragment.a1;
                        dc9 dc9Var = (dc9) adGuardFragment.l1().D.a.getValue();
                        if (!(dc9Var instanceof xb9)) {
                            str = dc9Var instanceof bc9 ? "ad_guard_connect" : "ad_guard_disconnect";
                            adGuardFragment.l1().r(AdGuardAction.ToggleVpnAction.INSTANCE);
                            break;
                        }
                        dw1.y(str);
                        adGuardFragment.l1().r(AdGuardAction.ToggleVpnAction.INSTANCE);
                        break;
                    default:
                        int i6 = AdGuardFragment.a1;
                        FragmentActivity fragmentActivityF = adGuardFragment.F();
                        if (fragmentActivityF != null) {
                            Intent intent = new Intent("android.settings.WIRELESS_SETTINGS");
                            PackageManager packageManager = fragmentActivityF.getPackageManager();
                            if ((packageManager != null ? intent.resolveActivity(packageManager) : null) == null) {
                                int i7 = AdGuardFragment.a1;
                                FragmentActivity fragmentActivityF2 = adGuardFragment.F();
                                hh2.H(new hh2(fragmentActivityF2, fragmentActivityF2 != null ? fragmentActivityF2.getString(rs6.uncatchable_intent) : null));
                            } else {
                                fragmentActivityF.startActivity(intent);
                            }
                        }
                        break;
                }
            }
        });
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new AdGuardFragment$onViewCreated$3$4(this, uk2Var, view, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new AdGuardFragment$onViewCreated$3$5(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new AdGuardFragment$onViewCreated$3$6(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new AdGuardFragment$onViewCreated$3$7(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new AdGuardFragment$onViewCreated$3$8(this, uk2Var, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new AdGuardFragment$onViewCreated$3$9(this, null));
    }

    public final void k1(View view) {
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.horizontal_space_inner) + K().getDimensionPixelSize(pq6.horizontal_space_outer);
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().l;
        ea7Var.c(K().getDimensionPixelSize(pq6.space_12));
        ea7Var.h = 0;
        view.setBackground(ea7Var.a());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginStart(dimensionPixelSize);
            marginLayoutParams.setMarginEnd(dimensionPixelSize);
        }
    }

    public final AdGuardViewModel l1() {
        return (AdGuardViewModel) this.X0.getValue();
    }
}
