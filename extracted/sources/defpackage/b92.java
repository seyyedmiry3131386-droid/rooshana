package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.measurement.AppMeasurement;
import io.sentry.android.core.t0;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class b92 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int a;
    public final Object b;

    public b92(yo9 yo9Var) {
        this.a = 1;
        this.b = yo9Var;
    }

    public void a(Intent intent) {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (arrayDeque.contains(string)) {
                        return;
                    } else {
                        arrayDeque.add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            t0.n("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null && "1".equals(bundle.getString("google.c.a.tc"))) {
                xc2 xc2VarC = xc2.c();
                xc2VarC.a();
                yd ydVar = (yd) xc2VarC.d.get(yd.class);
                if (ydVar != null) {
                    String string2 = bundle.getString("google.c.a.c_id");
                    zd zdVar = (zd) ydVar;
                    if (!pm9.b.contains(AppMeasurement.FCM_ORIGIN)) {
                        zdVar.a.setUserProperty(AppMeasurement.FCM_ORIGIN, "_ln", string2);
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("source", "Firebase");
                    bundle2.putString("medium", "notification");
                    bundle2.putString("campaign", string2);
                    zdVar.a(bundle2, "_cmp");
                } else {
                    t0.m("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                }
            }
            wn5.T(bundle, "_no");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity2, Bundle bundle) {
        switch (this.a) {
            case 0:
                Intent intent = activity2.getIntent();
                if (intent != null) {
                    if (Build.VERSION.SDK_INT > 25) {
                        a(intent);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new g7(this, intent, 21));
                    }
                    break;
                }
                break;
            default:
                ((yo9) this.b).c(new co9(this, bundle, activity2));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity2) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((yo9) this.b).c(new so9(this, activity2, 4));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity2) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((yo9) this.b).c(new so9(this, activity2, 2));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity2) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((yo9) this.b).c(new so9(this, activity2, 1));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
        switch (this.a) {
            case 0:
                break;
            default:
                bn9 bn9Var = new bn9();
                ((yo9) this.b).c(new co9(this, activity2, bn9Var));
                Bundle bundleL = bn9Var.L(50L);
                if (bundleL != null) {
                    bundle.putAll(bundleL);
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity2) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((yo9) this.b).c(new so9(this, activity2, 0));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity2) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((yo9) this.b).c(new so9(this, activity2, 3));
                break;
        }
    }

    public b92() {
        this.a = 0;
        this.b = new ArrayDeque(10);
    }

    private final void b(Activity activity2) {
    }

    private final void c(Activity activity2) {
    }

    private final void d(Activity activity2) {
    }

    private final void f(Activity activity2) {
    }

    private final void g(Activity activity2) {
    }

    private final void e(Activity activity2, Bundle bundle) {
    }
}
