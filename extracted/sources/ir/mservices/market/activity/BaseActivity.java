package ir.mservices.market.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import defpackage.c56;
import defpackage.d04;
import defpackage.d56;
import defpackage.d87;
import defpackage.e87;
import defpackage.f60;
import defpackage.g60;
import defpackage.js3;
import defpackage.kh2;
import defpackage.pr7;
import defpackage.q3;
import defpackage.sj8;
import defpackage.t32;
import defpackage.tx8;
import defpackage.w91;
import ir.mservices.market.data.permission.Permission;
import ir.mservices.market.theme.ThemeStyle;
import ir.mservices.market.version2.ApplicationLauncher;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseActivity extends Hilt_BaseActivity {
    public d04 G;
    public pr7 H;
    public d56 I;

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Object d87Var;
        js3.p(context, "newBase");
        if (Build.VERSION.SDK_INT >= 26) {
            w91 w91Var = (w91) ApplicationLauncher.o.b();
            this.G = (d04) w91Var.p.get();
            this.H = (pr7) w91Var.s.get();
            this.I = (d56) w91Var.U.get();
            d04 d04Var = this.G;
            if (d04Var == null) {
                js3.V("languageHelper");
                throw null;
            }
            Context contextU = q3.u(context, d04Var.d());
            applyOverrideConfiguration(contextU.getResources().getConfiguration());
            super.attachBaseContext(contextU);
            Resources resources = getResources();
            js3.o(resources, "getResources(...)");
            pr7 pr7Var = this.H;
            if (pr7Var == null) {
                js3.V("settingsManager");
                throw null;
            }
            String strB = pr7Var.b();
            js3.o(strB, "getNightMode(...)");
            pr7 pr7Var2 = this.H;
            if (pr7Var2 == null) {
                js3.V("settingsManager");
                throw null;
            }
            ThemeStyle themeStyleC = pr7Var2.c();
            js3.o(themeStyleC, "getThemeStyle(...)");
            sj8.g(resources, strB, themeStyleC);
            pr7 pr7Var3 = this.H;
            if (pr7Var3 == null) {
                js3.V("settingsManager");
                throw null;
            }
            kh2.a(pr7Var3.a());
            d87Var = new e87(tx8.a);
        } else {
            d87Var = new d87();
        }
        if (d87Var instanceof d87) {
            super.attachBaseContext(context);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        t32.b().g(new f60(i, i2, intent));
        Parcelable[] parcelableArr = null;
        if (this.I == null) {
            js3.V("permissionHelper");
            throw null;
        }
        if (intent != null) {
            if (i != 9898) {
                intent = null;
            }
            if (intent != null) {
                t32 t32VarB = t32.b();
                Bundle extras = intent.getExtras();
                Parcelable[] parcelableArray = extras != null ? Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) q3.f(extras) : extras.getParcelableArray("BUNDLE_KEY_PERMISSIONS_PARCELABLE") : null;
                if (parcelableArray != null) {
                    Object objNewInstance = Array.newInstance((Class<?>) Permission.class, parcelableArray.length);
                    js3.n(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of ir.myket.core.utils.BundleUtils.Companion.getParcelableArray>");
                    parcelableArr = (Parcelable[]) objNewInstance;
                    System.arraycopy(parcelableArray, 0, parcelableArr, 0, parcelableArray.length);
                }
                t32VarB.g(new c56((Permission[]) parcelableArr));
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) throws IllegalAccessException {
        js3.p(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        d04 d04Var = this.G;
        if (d04Var == null) {
            js3.V("languageHelper");
            throw null;
        }
        if (configuration.locale.getLanguage().equals(d04Var.b)) {
            return;
        }
        d04Var.a();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        js3.p(intent, "intent");
        super.onNewIntent(intent);
        t32.b().g(new g60());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        d04 d04Var = this.G;
        if (d04Var != null) {
            d04Var.a();
        } else {
            js3.V("languageHelper");
            throw null;
        }
    }
}
