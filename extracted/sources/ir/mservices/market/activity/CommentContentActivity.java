package ir.mservices.market.activity;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.b77;
import defpackage.cd;
import defpackage.dt2;
import defpackage.fp6;
import defpackage.h69;
import defpackage.j97;
import defpackage.js3;
import defpackage.js6;
import defpackage.ns6;
import defpackage.q39;
import defpackage.q69;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.u52;
import defpackage.yq6;
import ir.mservices.market.appDetail.DetailToolbarView;
import ir.mservices.market.appDetail.ToolbarData;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class CommentContentActivity extends BaseFragmentContentActivity {
    public static final /* synthetic */ int y0 = 0;

    @Override // ir.mservices.market.activity.BaseContentActivity, defpackage.z80
    public final String C() {
        return null;
    }

    @Override // ir.mservices.market.activity.Hilt_BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity
    public final String T() {
        return getString(rs6.page_name_comment);
    }

    @Override // ir.mservices.market.activity.BaseContentActivity
    public final MaterialToolbar V() {
        return (MaterialToolbar) findViewById(rr6.toolbar);
    }

    @Override // ir.mservices.market.activity.BaseContentActivity
    public final boolean Y() {
        return Build.VERSION.SDK_INT != 26;
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, fp6.activity_out);
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j97.d(getWindow(), false);
        Z(js6.activity_comment, false);
        j0();
        View viewFindViewById = findViewById(rr6.comment_frame);
        if (viewFindViewById != null) {
            u52 u52Var = new u52(527, 10);
            WeakHashMap weakHashMap = q69.a;
            h69.m(viewFindViewById, u52Var);
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(rr6.app_bar);
        if (getIntent().getExtras() != null) {
            ToolbarData toolbarData = (ToolbarData) dt2.s(getIntent().getExtras(), "BUNDLE_KEY_APPLICATION", ToolbarData.class);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            boolean booleanExtra = getIntent().getBooleanExtra("IS_NEW_RATE", true);
            if (toolbarData != null) {
                DetailToolbarView detailToolbarView = new DetailToolbarView(this);
                detailToolbarView.setOnBackClickListener(new cd(7, this));
                detailToolbarView.setPageTitle(booleanExtra ? getResources().getString(rs6.rate_app) : getResources().getString(rs6.edit_rate_app));
                detailToolbarView.setShowDownload(false);
                detailToolbarView.setToolbarData(toolbarData);
                detailToolbarView.setBackgroundColor(sj8.b().l);
                frameLayout.addView(detailToolbarView, layoutParams);
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("packageName", getIntent().getStringExtra("packageName"));
        bundle2.putString("comment", getIntent().getStringExtra("BUNDLE_KEY_DESCRIPTION"));
        bundle2.putString("source", getIntent().getStringExtra("COMMENT_SOURCE"));
        bundle2.putFloat("rating", getIntent().getFloatExtra("BUNDLE_KEY_RATING", 0.0f));
        bundle2.putBoolean("isNewRate", getIntent().getBooleanExtra("IS_NEW_RATE", true));
        bundle2.putBoolean("editable", getIntent().getBooleanExtra("BUNDLE_KEY_EDITABLE", true));
        bundle2.putString("launchSource", getIntent().getStringExtra("BUNDLE_KEY_LAUNCH_SOURCE"));
        g0().f(ns6.nav_graph_comment, bundle2);
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        Drawable drawable;
        super.onPostCreate(bundle);
        if (getIntent().getExtras() != null && dt2.s(getIntent().getExtras(), "BUNDLE_KEY_APPLICATION", ToolbarData.class) == null) {
            c0(getIntent().getBooleanExtra("IS_NEW_RATE", true) ? getResources().getString(rs6.rate_app) : getResources().getString(rs6.edit_rate_app));
        }
        Resources resources = getResources();
        int i = yq6.ic_action_back;
        js3.p(resources, "res");
        try {
            drawable = q39.a(resources, i, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        drawable.setColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY);
        P().g0(drawable);
        int i2 = sj8.b().m;
        MaterialToolbar materialToolbarV = V();
        if (materialToolbarV != null) {
            materialToolbarV.setTitleTextColor(i2);
            materialToolbarV.setSubtitleTextColor(i2);
        }
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        overridePendingTransition(fp6.activity_in, 0);
        super.onStart();
    }
}
