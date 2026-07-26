package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class zm {
    public static final ym a = new ym(new ko9(2));
    public static int b = -100;
    public static yc4 c = null;
    public static yc4 d = null;
    public static Boolean e = null;
    public static boolean f = false;
    public static final zv g = new zv(0);
    public static final Object h = new Object();
    public static final Object i = new Object();

    public static boolean b(Context context) {
        if (e == null) {
            try {
                int i2 = AppLocalesMetadataHolderService.a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), Build.VERSION.SDK_INT >= 24 ? vq.a() | 128 : 640).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    public static void f(ln lnVar) {
        synchronized (h) {
            try {
                zv zvVar = g;
                zvVar.getClass();
                sv svVar = new sv(zvVar);
                while (svVar.hasNext()) {
                    zm zmVar = (zm) ((WeakReference) svVar.next()).get();
                    if (zmVar == lnVar || zmVar == null) {
                        svVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void k() {
        if (b != -1) {
            b = -1;
            synchronized (h) {
                try {
                    zv zvVar = g;
                    zvVar.getClass();
                    sv svVar = new sv(zvVar);
                    while (svVar.hasNext()) {
                        zm zmVar = (zm) ((WeakReference) svVar.next()).get();
                        if (zmVar != null) {
                            ((ln) zmVar).m(true, true);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void a();

    public abstract void d();

    public abstract void e();

    public abstract boolean g(int i2);

    public abstract void h(int i2);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void l(CharSequence charSequence);
}
