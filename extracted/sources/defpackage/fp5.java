package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fp5 {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public boolean l;
    public tt9 m;
    public int n;
    public int o;
    public boolean p;
    public String q;
    public Bundle s;
    public String v;
    public final boolean x;
    public final Notification y;
    public final ArrayList z;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean k = true;
    public boolean r = false;
    public int t = 0;
    public int u = 0;
    public int w = 0;

    public fp5(Context context, String str) {
        Notification notification = new Notification();
        this.y = notification;
        this.a = context;
        this.v = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.z = new ArrayList();
        this.x = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void a(zo5 zo5Var) {
        this.b.add(zo5Var);
    }

    public final Notification b() {
        Notification notificationBuild;
        Bundle bundle;
        String strI;
        vp7 vp7Var = new vp7(this);
        fp5 fp5Var = (fp5) vp7Var.d;
        tt9 tt9Var = fp5Var.m;
        if (tt9Var != null) {
            tt9Var.f(vp7Var);
        }
        Notification.Builder builder = (Notification.Builder) vp7Var.c;
        int i = Build.VERSION.SDK_INT;
        if (i < 26 && i < 24) {
            builder.setExtras((Bundle) vp7Var.e);
            notificationBuild = builder.build();
        } else {
            notificationBuild = builder.build();
        }
        if (tt9Var != null) {
            fp5Var.m.getClass();
        }
        if (tt9Var != null && (bundle = notificationBuild.extras) != null && (strI = tt9Var.i()) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strI);
        }
        return notificationBuild;
    }

    public final void d(int i, boolean z) {
        Notification notification = this.y;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void e(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(jq6.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(jq6.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.b = bitmap;
            iconCompat = iconCompat2;
        }
        this.h = iconCompat;
    }

    public final void f(int i, boolean z) {
        this.n = 100;
        this.o = i;
        this.p = z;
    }

    public final void g(tt9 tt9Var) {
        if (this.m != tt9Var) {
            this.m = tt9Var;
            tt9Var.r(this);
        }
    }
}
