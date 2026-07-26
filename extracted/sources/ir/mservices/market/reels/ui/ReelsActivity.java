package ir.mservices.market.reels.ui;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.cc7;
import defpackage.dt2;
import defpackage.fj5;
import defpackage.h69;
import defpackage.ij5;
import defpackage.jj5;
import defpackage.js3;
import defpackage.js6;
import defpackage.ns6;
import defpackage.p58;
import defpackage.q69;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import ir.mservices.market.activity.BaseNavigationContentActivity;
import ir.mservices.market.reels.data.ReelHomeDto;
import ir.mservices.market.version2.ApplicationLauncher;
import java.io.Serializable;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ReelsActivity extends BaseNavigationContentActivity {
    @Override // ir.mservices.market.activity.BaseContentActivity, defpackage.z80
    public final String C() {
        return null;
    }

    @Override // ir.mservices.market.activity.Hilt_BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity
    public final String T() {
        String string = getResources().getString(rs6.page_name_reels);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ij5 ij5Var;
        jj5 jj5VarB;
        super.onCreate(bundle);
        ApplicationLauncher.f(this);
        Z(js6.activity_reels, true);
        ir.mservices.market.core.ext.a.n(this, sj8.b().N);
        ir.mservices.market.core.ext.a.k(this, sj8.b().J.a, sj8.g);
        MaterialToolbar materialToolbar = this.M;
        if (materialToolbar != null) {
            materialToolbar.setVisibility(8);
        }
        View viewFindViewById = findViewById(rr6.frame);
        if (viewFindViewById != null) {
            p58 p58Var = new p58(28);
            WeakHashMap weakHashMap = q69.a;
            h69.m(viewFindViewById, p58Var);
        }
        cc7.e(findViewById(rr6.reel_frame));
        j0();
        ij5 ij5Var2 = this.X;
        fj5 fj5VarB = (ij5Var2 == null || (jj5VarB = ij5Var2.b()) == null) ? null : jj5VarB.b(ns6.nav_graph_reel);
        Bundle extras = getIntent().getExtras();
        Serializable serializable = extras != null ? (ReelHomeDto) dt2.s(extras, "reel_dto", ReelHomeDto.class) : null;
        String stringExtra = getIntent().getStringExtra("BUNDLE_KEY_QUERY");
        if (fj5VarB == null || (ij5Var = this.X) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        if (Parcelable.class.isAssignableFrom(ReelHomeDto.class)) {
            bundle2.putParcelable("reel", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(ReelHomeDto.class)) {
                throw new UnsupportedOperationException(ReelHomeDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle2.putSerializable("reel", serializable);
        }
        bundle2.putString("query", stringExtra);
        ij5Var.b.q(fj5VarB, bundle2);
    }
}
