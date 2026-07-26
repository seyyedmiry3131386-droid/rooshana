package ir.mservices.market.version2.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.e38;
import defpackage.fa1;
import defpackage.h40;
import defpackage.js3;
import defpackage.js6;
import defpackage.qs6;
import defpackage.rj;
import defpackage.sj8;
import defpackage.vd7;
import ir.mservices.market.theme.ThemeMode;
import ir.mservices.market.version2.fragments.base.BaseFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class SplashScreenFragment extends BaseFragment {
    public static final /* synthetic */ int L0 = 0;
    public e38 J0;
    public h40 K0;

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = e38.x;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        e38 e38Var = (e38) fa1.c(layoutInflater, js6.splash_screen_fragment, viewGroup, false);
        this.J0 = e38Var;
        js3.m(e38Var);
        LottieAnimationView lottieAnimationView = e38Var.v;
        lottieAnimationView.setAnimation(sj8.g == ThemeMode.b ? qs6.splash_dark : qs6.splash_light);
        lottieAnimationView.h.b.addListener(new rj(8, this));
        e38 e38Var2 = this.J0;
        js3.m(e38Var2);
        View view = e38Var2.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        h40 h40Var = this.K0;
        if (h40Var != null) {
            h40Var.e();
        }
        this.K0 = null;
        this.J0 = null;
    }

    @Override // androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        FragmentActivity fragmentActivityF = F();
        this.K0 = fragmentActivityF != null ? ir.mservices.market.core.ext.a.a(fragmentActivityF, new vd7(28)) : null;
        e38 e38Var = this.J0;
        js3.m(e38Var);
        e38Var.v.f();
    }
}
