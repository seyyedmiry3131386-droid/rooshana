package ir.mservices.market.activity;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.f88;
import defpackage.hl5;
import defpackage.ij5;
import defpackage.js3;
import defpackage.js6;
import defpackage.mf9;
import defpackage.nf9;
import defpackage.ns6;
import defpackage.of9;
import defpackage.pf9;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sa7;
import defpackage.xm8;
import defpackage.yq2;

/* JADX INFO: loaded from: classes3.dex */
public final class HameActivity extends BaseFragmentContentActivity {
    @Override // ir.mservices.market.activity.BaseContentActivity, defpackage.z80
    public final String C() {
        String string = getResources().getString(rs6.page_name_hame);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.activity.BaseFragmentContentActivity, ir.mservices.market.activity.BaseNavigationContentActivity
    public final boolean f0(MenuItem menuItem) {
        js3.p(menuItem, "menuItem");
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        finish();
        return true;
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Z(js6.nav_content, true);
        j0();
        Uri data = getIntent().getData();
        String queryParameter = data != null ? data.getQueryParameter("url") : null;
        if (queryParameter == null) {
            queryParameter = "";
        }
        String str = queryParameter;
        Uri data2 = getIntent().getData();
        String queryParameter2 = data2 != null ? data2.getQueryParameter("title") : null;
        if (!f88.n0(str) && getWindow() != null) {
            boolean booleanQueryParameter = f88.n0(str) ? false : Uri.parse(str).getBooleanQueryParameter("fullscreen", false);
            Window window = getWindow();
            hl5 hl5Var = new hl5(getWindow().getDecorView());
            int i = Build.VERSION.SDK_INT;
            sa7 pf9Var = i >= 35 ? new pf9(window, hl5Var) : i >= 30 ? new of9(window, hl5Var) : i >= 26 ? new nf9(window, hl5Var) : new mf9(window, hl5Var);
            pf9Var.n();
            if (booleanQueryParameter) {
                MaterialToolbar materialToolbar = this.M;
                if (materialToolbar != null) {
                    materialToolbar.setVisibility(8);
                }
                getWindow().addFlags(512);
                pf9Var.g(519);
            } else {
                MaterialToolbar materialToolbar2 = this.M;
                if (materialToolbar2 != null) {
                    materialToolbar2.setVisibility(0);
                }
                getWindow().clearFlags(512);
                pf9Var.o(519);
            }
            ((FragmentContainerView) findViewById(rr6.content)).setFitsSystemWindows(booleanQueryParameter);
        }
        if (!f88.n0(str) && !yq2.o0(this)) {
            String queryParameter3 = Uri.parse(str).getQueryParameter("orientation");
            if ("land".equalsIgnoreCase(queryParameter3)) {
                setRequestedOrientation(6);
            } else if ("user".equalsIgnoreCase(queryParameter3)) {
                setRequestedOrientation(10);
            } else {
                setRequestedOrientation(7);
            }
        }
        c0(queryParameter2);
        Bundle bundleA = new xm8(str, queryParameter2, false, false, false, true, true).a();
        ij5 ij5Var = this.X;
        if (ij5Var != null) {
            ij5Var.f(ns6.nav_graph_hame, bundleA);
        }
    }
}
