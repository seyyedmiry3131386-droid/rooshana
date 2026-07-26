package ir.mservices.market.social.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.d;
import androidx.fragment.app.g;
import defpackage.bi5;
import defpackage.g27;
import defpackage.js3;
import defpackage.js6;
import defpackage.n15;
import defpackage.p40;
import defpackage.rr6;
import defpackage.yg5;

/* JADX INFO: loaded from: classes3.dex */
public final class MynetSearchFragment extends Hilt_MynetSearchFragment {
    public final bi5 M0 = new bi5(g27.a(yg5.class), new n15(7, this));

    @Override // androidx.fragment.app.d
    public final void T(Bundle bundle) {
        this.H = true;
        d dVarF = G().F(rr6.content);
        if (dVarF instanceof MynetSearchRecyclerListFragment) {
            ((MynetSearchRecyclerListFragment) dVarF).l(true);
            return;
        }
        bi5 bi5Var = this.M0;
        String str = ((yg5) bi5Var.getValue()).a;
        String str2 = ((yg5) bi5Var.getValue()).b;
        MynetSearchRecyclerListFragment mynetSearchRecyclerListFragment = new MynetSearchRecyclerListFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("BUNDLE_KEY_QUERY", str);
        bundle2.putString("BUNDLE_KEY_QUERY_SOURCE", str2);
        mynetSearchRecyclerListFragment.u0(bundle2);
        mynetSearchRecyclerListFragment.l(true);
        g gVarG = G();
        gVarG.getClass();
        p40 p40Var = new p40(gVarG);
        p40Var.k(rr6.content, mynetSearchRecyclerListFragment, null);
        p40Var.e();
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        return layoutInflater.inflate(js6.content_fragment, viewGroup, false);
    }
}
