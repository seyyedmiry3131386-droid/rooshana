package ir.mservices.market.movie.ui;

import android.os.Bundle;
import android.view.MenuItem;
import defpackage.ij5;
import defpackage.js3;
import defpackage.js6;
import defpackage.ns6;
import defpackage.rs6;
import defpackage.zc9;
import ir.mservices.market.activity.BaseFragmentContentActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieAdsWebViewActivity extends BaseFragmentContentActivity {
    @Override // ir.mservices.market.activity.BaseContentActivity, defpackage.z80
    public final String C() {
        String string = getResources().getString(rs6.page_name_movie_ads_activity);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.activity.BaseContentActivity
    public final boolean Y() {
        return false;
    }

    @Override // ir.mservices.market.activity.BaseFragmentContentActivity, ir.mservices.market.activity.BaseNavigationContentActivity
    public final boolean f0(MenuItem menuItem) {
        js3.p(menuItem, "menuItem");
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        super.f0(menuItem);
        return false;
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Z(js6.nav_content, true);
        j0();
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString("BUNDLE_KEY_URL") : null;
        Bundle extras2 = getIntent().getExtras();
        String string2 = extras2 != null ? extras2.getString("BUNDLE_KEY_TITLE") : null;
        c0(string2);
        if (string == null) {
            string = "";
        }
        Bundle bundleA = new zc9(string, string2 == null ? "" : string2, false, false, false, false, true).a();
        ij5 ij5Var = this.X;
        if (ij5Var != null) {
            ij5Var.f(ns6.nav_graph_movie_ads_webview, bundleA);
        }
    }
}
