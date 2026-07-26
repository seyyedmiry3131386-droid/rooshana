package ir.mservices.market.version2.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import defpackage.a67;
import defpackage.c5;
import defpackage.f57;
import defpackage.fa1;
import defpackage.h40;
import defpackage.hr0;
import defpackage.js3;
import defpackage.js6;
import defpackage.na7;
import defpackage.pq6;
import defpackage.qc;
import defpackage.sj8;
import defpackage.tm2;
import defpackage.ue7;
import defpackage.uv1;
import defpackage.zk8;

/* JADX INFO: loaded from: classes3.dex */
public final class SingleImageFragment extends Hilt_SingleImageFragment {
    public static final /* synthetic */ int P0 = 0;
    public tm2 M0;
    public h40 N0;
    public c5 O0;

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = tm2.x;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        tm2 tm2Var = (tm2) fa1.c(layoutInflater, js6.fragment_single_image, viewGroup, false);
        this.M0 = tm2Var;
        js3.m(tm2Var);
        View view = tm2Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        h40 h40Var = this.N0;
        if (h40Var != null) {
            h40Var.e();
        }
        this.N0 = null;
        this.M0 = null;
    }

    @Override // androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        String string;
        js3.p(view, "view");
        FragmentActivity fragmentActivityF = F();
        this.N0 = fragmentActivityF != null ? ir.mservices.market.core.ext.a.a(fragmentActivityF, new a67(12, this)) : null;
        Bundle bundle2 = this.g;
        if (bundle2 == null || (string = bundle2.getString("BUNDLE_KEY_AVATAR_URL")) == null) {
            c5 c5Var = this.O0;
            if (c5Var == null) {
                js3.V("accountManager");
                throw null;
            }
            string = (String) c5Var.h.b;
        }
        Bundle bundle3 = this.g;
        boolean z = bundle3 != null ? bundle3.getBoolean("BUNDLE_KEY_IS_CIRCLE") : false;
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.margin_default_v2_half);
        Bundle bundle4 = this.g;
        if (bundle4 != null) {
            dimensionPixelSize = bundle4.getInt("BUNDLE_KEY_RADIUS", dimensionPixelSize);
        }
        f57 f57VarQ = zk8.Q(this, string);
        f57 f57VarL = (z ? (f57) f57VarQ.G(new hr0()) : (f57) f57VarQ.G(new na7(dimensionPixelSize))).W(uv1.b()).L(new qc(6, this));
        tm2 tm2Var = this.M0;
        js3.m(tm2Var);
        f57VarL.P(tm2Var.v);
        tm2 tm2Var2 = this.M0;
        js3.m(tm2Var2);
        tm2Var2.l.setBackgroundColor(sj8.b().K);
        tm2 tm2Var3 = this.M0;
        js3.m(tm2Var3);
        tm2Var3.l.setOnClickListener(new ue7(2, this));
    }
}
