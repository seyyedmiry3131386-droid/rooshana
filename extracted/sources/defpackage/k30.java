package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.Rect;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class k30 {
    public final Object a;

    public /* synthetic */ k30(Object obj) {
        this.a = obj;
    }

    public void a() {
        ((AutofillManager) this.a).commit();
    }

    public ApplicationInfo b(int i, String str) {
        return ((Context) this.a).getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo c(int i, String str) {
        return ((Context) this.a).getPackageManager().getPackageInfo(str, i);
    }

    public boolean d() {
        String nameForUid;
        Context context = (Context) this.a;
        if (Binder.getCallingUid() == Process.myUid()) {
            return aq3.n(context);
        }
        if (!wn5.R() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }

    public void e(AndroidComposeView androidComposeView, int i, AutofillValue autofillValue) {
        ((AutofillManager) this.a).notifyValueChanged(androidComposeView, i, autofillValue);
    }

    public void f(AndroidComposeView androidComposeView, int i, Rect rect) {
        ((AutofillManager) this.a).notifyViewEntered(androidComposeView, i, rect);
    }

    public void g(AndroidComposeView androidComposeView, int i) {
        ((AutofillManager) this.a).notifyViewExited(androidComposeView, i);
    }

    public void h(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            g30.a(view, (AutofillManager) this.a, i, z);
        }
    }

    public void i(AndroidComposeView androidComposeView, int i, Rect rect) {
        ((AutofillManager) this.a).requestAutofill(androidComposeView, i, rect);
    }

    public AutofillId j() {
        return en.c(this.a);
    }
}
