package ir.mservices.market.version2.activity;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import defpackage.dt2;
import defpackage.ij5;
import defpackage.js6;
import defpackage.lo6;
import defpackage.ns6;
import defpackage.rs6;
import defpackage.sj8;
import ir.mservices.market.activity.BaseNavigationContentActivity;
import ir.mservices.market.core.ext.a;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class PushNotifTextDialogActivity extends BaseNavigationContentActivity {
    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        super.B(bundle, str);
        if (str.equalsIgnoreCase(k0()) && "DIALOG_KEY_PUSH_NOTIF_TEXT".equalsIgnoreCase(((DialogDataModel) dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class)).b)) {
            finish();
        }
    }

    @Override // ir.mservices.market.activity.BaseContentActivity, defpackage.z80
    public final String C() {
        return getString(rs6.page_name_push_notif_text);
    }

    @Override // ir.mservices.market.activity.Hilt_BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity
    public final String T() {
        return getString(rs6.page_name_push_notif_text);
    }

    @Override // ir.mservices.market.activity.BaseContentActivity
    public final boolean Y() {
        return Build.VERSION.SDK_INT != 26;
    }

    public final String k0() {
        return getClass().getSimpleName() + "_" + this.O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("BUNDLE_KEY_TITLE");
        String stringExtra2 = getIntent().getStringExtra("BUNDLE_KEY_ICON_PATH");
        String stringExtra3 = getIntent().getStringExtra("BUNDLE_KEY_MESSAGE");
        setContentView(js6.nav_content);
        j0();
        d(k0(), this);
        DialogDataModel dialogDataModel = new DialogDataModel(k0(), "DIALOG_KEY_PUSH_NOTIF_TEXT");
        ij5 ij5VarG0 = g0();
        int i = ns6.nav_graph_push_notif_text;
        new lo6(dialogDataModel, stringExtra, stringExtra2, stringExtra3);
        Bundle bundle2 = new Bundle();
        if (Parcelable.class.isAssignableFrom(DialogDataModel.class)) {
            bundle2.putParcelable("data", dialogDataModel);
        } else {
            if (!Serializable.class.isAssignableFrom(DialogDataModel.class)) {
                throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle2.putSerializable("data", (Serializable) dialogDataModel);
        }
        bundle2.putString("title", stringExtra);
        bundle2.putString("iconPath", stringExtra2);
        bundle2.putString("message", stringExtra3);
        ij5VarG0.f(i, bundle2);
        a.n(this, sj8.b().F);
        a.l(this, sj8.b().F, sj8.g);
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        x(k0());
    }
}
