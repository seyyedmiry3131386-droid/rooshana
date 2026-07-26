package ir.mservices.market.intro;

import android.os.Bundle;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.fj5;
import defpackage.ij5;
import defpackage.j97;
import defpackage.jj5;
import defpackage.js3;
import defpackage.js6;
import defpackage.ms3;
import defpackage.ns6;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.t32;
import ir.mservices.market.activity.BaseNavigationContentActivity;
import ir.mservices.market.version2.ApplicationLauncher;

/* JADX INFO: loaded from: classes3.dex */
public final class IntroActivity extends BaseNavigationContentActivity {
    @Override // ir.mservices.market.activity.BaseContentActivity, defpackage.z80
    public final String C() {
        return null;
    }

    @Override // ir.mservices.market.activity.Hilt_BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity
    public final String T() {
        String string = getResources().getString(rs6.page_name_intro);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        t32.b().j(ms3.a);
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        jj5 jj5VarB;
        super.onCreate(bundle);
        j97.d(getWindow(), false);
        ApplicationLauncher.f(this);
        Z(js6.activity_intro, true);
        MaterialToolbar materialToolbar = this.M;
        if (materialToolbar != null) {
            materialToolbar.setVisibility(8);
        }
        j0();
        ij5 ij5Var = this.X;
        if (ij5Var == null || (jj5VarB = ij5Var.b()) == null) {
            return;
        }
        fj5 fj5VarB = jj5VarB.b(ns6.nav_graph_intro);
        fj5VarB.g.t(rr6.intro);
        ij5 ij5Var2 = this.X;
        if (ij5Var2 != null) {
            ij5Var2.b.q(fj5VarB, null);
        }
    }
}
