package ir.mservices.market.securityShield;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import defpackage.bp2;
import defpackage.c24;
import defpackage.d16;
import defpackage.ds6;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.lm;
import defpackage.o79;
import defpackage.og5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.rs6;
import defpackage.x79;
import defpackage.xf5;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.securityShield.ScanState;
import ir.mservices.market.securityShield.SecurityShieldRecyclerFragment;
import ir.mservices.market.securityShield.SecurityShieldViewModel;
import ir.mservices.market.securityShield.recycler.DeviceScanTipData;
import ir.mservices.market.securityShield.recycler.HarmFulAppViewData;
import ir.mservices.market.viewModel.c;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityShieldRecyclerFragment extends Hilt_SecurityShieldRecyclerFragment {
    public static final /* synthetic */ int k1 = 0;
    public xf5 i1;
    public final o79 j1;

    public SecurityShieldRecyclerFragment() {
        final SecurityShieldRecyclerFragment$special$$inlined$viewModels$default$1 securityShieldRecyclerFragment$special$$inlined$viewModels$default$1 = new SecurityShieldRecyclerFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.securityShield.SecurityShieldRecyclerFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) securityShieldRecyclerFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.j1 = new o79(g27.a(SecurityShieldViewModel.class), new bp2() { // from class: ir.mservices.market.securityShield.SecurityShieldRecyclerFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.securityShield.SecurityShieldRecyclerFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.securityShield.SecurityShieldRecyclerFragment$special$$inlined$viewModels$default$4
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

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_security_shield);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String string = baseFragmentContentActivity.getString(rs6.menu_item_security_shield);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        lm lmVar = new lm(v1(), 9);
        final int i = 0;
        lmVar.m = new og5(this) { // from class: el7
            public final /* synthetic */ SecurityShieldRecyclerFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String str;
                int i2 = i;
                SecurityShieldRecyclerFragment securityShieldRecyclerFragment = this.b;
                switch (i2) {
                    case 0:
                        int i3 = SecurityShieldRecyclerFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((zl1) qg5Var, "<unused var>");
                        js3.p((DeviceScanTipData) obj, "<unused var>");
                        int iOrdinal = ((ScanState) ((SecurityShieldViewModel) securityShieldRecyclerFragment.j1.getValue()).A.a.getValue()).ordinal();
                        if (iOrdinal == 0) {
                            str = "shield_more_scan";
                        } else if (iOrdinal == 1) {
                            str = "shield_more_safe";
                        } else {
                            if (iOrdinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "shield_more_harmful";
                        }
                        dw1.y(str);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("language", securityShieldRecyclerFragment.F0.b());
                        String strJ = js8.j("https://myket.ir", "support/pages/security-guard/", null, null, linkedHashMap, false);
                        xf5 xf5Var = securityShieldRecyclerFragment.i1;
                        if (xf5Var == null) {
                            js3.V("myketUIUtils");
                            throw null;
                        }
                        FragmentActivity fragmentActivityF = securityShieldRecyclerFragment.F();
                        am2 am2Var = securityShieldRecyclerFragment.J0;
                        String string = securityShieldRecyclerFragment.K().getString(rs6.menu_item_security_shield);
                        js3.o(string, "getString(...)");
                        xf5Var.k(fragmentActivityF, am2Var, strJ, string, false, true, true, false, true, false);
                        return;
                    default:
                        HarmFulAppViewData harmFulAppViewData = (HarmFulAppViewData) obj;
                        int i4 = SecurityShieldRecyclerFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((gx2) qg5Var, "<unused var>");
                        js3.p(harmFulAppViewData, "harmfulAppData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("shield_open_setting");
                        clickEventBuilder.a();
                        String str2 = harmFulAppViewData.a;
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.fromParts("package", str2, null));
                        FragmentActivity fragmentActivityF2 = securityShieldRecyclerFragment.F();
                        if (fragmentActivityF2 != null) {
                            if (intent.resolveActivity(fragmentActivityF2.getPackageManager()) != null) {
                                securityShieldRecyclerFragment.y0(intent);
                                return;
                            } else {
                                hh2.H(new hh2(fragmentActivityF2, fragmentActivityF2.getString(rs6.app_settings_failed_message)));
                                return;
                            }
                        }
                        return;
                }
            }
        };
        final int i2 = 1;
        lmVar.n = new og5(this) { // from class: el7
            public final /* synthetic */ SecurityShieldRecyclerFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String str;
                int i22 = i2;
                SecurityShieldRecyclerFragment securityShieldRecyclerFragment = this.b;
                switch (i22) {
                    case 0:
                        int i3 = SecurityShieldRecyclerFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((zl1) qg5Var, "<unused var>");
                        js3.p((DeviceScanTipData) obj, "<unused var>");
                        int iOrdinal = ((ScanState) ((SecurityShieldViewModel) securityShieldRecyclerFragment.j1.getValue()).A.a.getValue()).ordinal();
                        if (iOrdinal == 0) {
                            str = "shield_more_scan";
                        } else if (iOrdinal == 1) {
                            str = "shield_more_safe";
                        } else {
                            if (iOrdinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = "shield_more_harmful";
                        }
                        dw1.y(str);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("language", securityShieldRecyclerFragment.F0.b());
                        String strJ = js8.j("https://myket.ir", "support/pages/security-guard/", null, null, linkedHashMap, false);
                        xf5 xf5Var = securityShieldRecyclerFragment.i1;
                        if (xf5Var == null) {
                            js3.V("myketUIUtils");
                            throw null;
                        }
                        FragmentActivity fragmentActivityF = securityShieldRecyclerFragment.F();
                        am2 am2Var = securityShieldRecyclerFragment.J0;
                        String string = securityShieldRecyclerFragment.K().getString(rs6.menu_item_security_shield);
                        js3.o(string, "getString(...)");
                        xf5Var.k(fragmentActivityF, am2Var, strJ, string, false, true, true, false, true, false);
                        return;
                    default:
                        HarmFulAppViewData harmFulAppViewData = (HarmFulAppViewData) obj;
                        int i4 = SecurityShieldRecyclerFragment.k1;
                        js3.p(view, "<unused var>");
                        js3.p((gx2) qg5Var, "<unused var>");
                        js3.p(harmFulAppViewData, "harmfulAppData");
                        ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                        clickEventBuilder.b("shield_open_setting");
                        clickEventBuilder.a();
                        String str2 = harmFulAppViewData.a;
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.fromParts("package", str2, null));
                        FragmentActivity fragmentActivityF2 = securityShieldRecyclerFragment.F();
                        if (fragmentActivityF2 != null) {
                            if (intent.resolveActivity(fragmentActivityF2.getPackageManager()) != null) {
                                securityShieldRecyclerFragment.y0(intent);
                                return;
                            } else {
                                hh2.H(new hh2(fragmentActivityF2, fragmentActivityF2.getString(rs6.app_settings_failed_message)));
                                return;
                            }
                        }
                        return;
                }
            }
        };
        return lmVar;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new SecurityShieldRecyclerFragment$onViewCreated$1(this, null));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return (SecurityShieldViewModel) this.j1.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(K().getDimensionPixelSize(pq6.security_shield_padding), 0, K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.horizontal_space_outer), 0, 0, v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.security_shield_max_span);
    }
}
