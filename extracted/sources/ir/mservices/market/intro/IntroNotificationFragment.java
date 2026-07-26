package ir.mservices.market.intro;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import defpackage.d56;
import defpackage.fa1;
import defpackage.hl2;
import defpackage.js3;
import defpackage.js6;
import defpackage.lk2;
import defpackage.q40;
import defpackage.qs3;
import defpackage.rs6;
import defpackage.s7;
import defpackage.sj8;
import defpackage.yq2;
import ir.mservices.market.intro.IntroNotificationFragment;
import ir.mservices.market.views.BigFillRectangleButton;

/* JADX INFO: loaded from: classes3.dex */
public final class IntroNotificationFragment extends Hilt_IntroNotificationFragment {
    public static final /* synthetic */ int Y0 = 0;
    public d56 V0;
    public hl2 W0;
    public lk2 X0;

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String string = K().getString(rs6.page_name_intro_notification);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = hl2.A;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        hl2 hl2Var = (hl2) fa1.c(layoutInflater, js6.fragment_intro_notification, viewGroup, false);
        this.W0 = hl2Var;
        js3.m(hl2Var);
        View view = hl2Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        this.W0 = null;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final yq2 e1() {
        return q40.g;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        this.X0 = (lk2) n0(new qs3(0, this), new s7(1));
        hl2 hl2Var = this.W0;
        js3.m(hl2Var);
        hl2Var.y.setColorFilter(new PorterDuffColorFilter(sj8.b().H, PorterDuff.Mode.MULTIPLY));
        hl2 hl2Var2 = this.W0;
        js3.m(hl2Var2);
        BigFillRectangleButton bigFillRectangleButton = hl2Var2.x;
        bigFillRectangleButton.setText(L(rs6.intro_notification_enable));
        final int i = 0;
        bigFillRectangleButton.setOnClickListener(new View.OnClickListener(this) { // from class: rs3
            public final /* synthetic */ IntroNotificationFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                IntroNotificationFragment introNotificationFragment = this.b;
                switch (i2) {
                    case 0:
                        int i3 = IntroNotificationFragment.Y0;
                        FragmentActivity fragmentActivityF = introNotificationFragment.F();
                        if (fragmentActivityF != null) {
                            d56 d56Var = introNotificationFragment.V0;
                            if (d56Var == null) {
                                js3.V("permissionHelper");
                                throw null;
                            }
                            if (!d56Var.b(fragmentActivityF, 3)) {
                                d56 d56Var2 = introNotificationFragment.V0;
                                if (d56Var2 == null) {
                                    js3.V("permissionHelper");
                                    throw null;
                                }
                                d56Var2.h(fragmentActivityF, introNotificationFragment.X0, 9898);
                            }
                            fragmentActivityF.finish();
                            return;
                        }
                        return;
                    default:
                        int i4 = IntroNotificationFragment.Y0;
                        FragmentActivity fragmentActivityF2 = introNotificationFragment.F();
                        if (fragmentActivityF2 != null) {
                            fragmentActivityF2.finish();
                            return;
                        }
                        return;
                }
            }
        });
        hl2 hl2Var3 = this.W0;
        js3.m(hl2Var3);
        final int i2 = 1;
        hl2Var3.v.setOnClickListener(new View.OnClickListener(this) { // from class: rs3
            public final /* synthetic */ IntroNotificationFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                IntroNotificationFragment introNotificationFragment = this.b;
                switch (i22) {
                    case 0:
                        int i3 = IntroNotificationFragment.Y0;
                        FragmentActivity fragmentActivityF = introNotificationFragment.F();
                        if (fragmentActivityF != null) {
                            d56 d56Var = introNotificationFragment.V0;
                            if (d56Var == null) {
                                js3.V("permissionHelper");
                                throw null;
                            }
                            if (!d56Var.b(fragmentActivityF, 3)) {
                                d56 d56Var2 = introNotificationFragment.V0;
                                if (d56Var2 == null) {
                                    js3.V("permissionHelper");
                                    throw null;
                                }
                                d56Var2.h(fragmentActivityF, introNotificationFragment.X0, 9898);
                            }
                            fragmentActivityF.finish();
                            return;
                        }
                        return;
                    default:
                        int i4 = IntroNotificationFragment.Y0;
                        FragmentActivity fragmentActivityF2 = introNotificationFragment.F();
                        if (fragmentActivityF2 != null) {
                            fragmentActivityF2.finish();
                            return;
                        }
                        return;
                }
            }
        });
    }
}
