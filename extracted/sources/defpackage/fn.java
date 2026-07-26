package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class fn {
    public static OnBackInvokedDispatcher a(Activity activity2) {
        return activity2.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, ln lnVar) {
        Objects.requireNonNull(lnVar);
        yl ylVar = new yl(1, lnVar);
        en.e(obj).registerOnBackInvokedCallback(1000000, ylVar);
        return ylVar;
    }

    public static void c(Object obj, Object obj2) {
        en.e(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
