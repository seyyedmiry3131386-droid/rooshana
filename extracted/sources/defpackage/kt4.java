package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class kt4 {
    public static final int g;
    public final Context a;
    public final ActivityManager b;
    public final r79 c;
    public final float d;
    public float e = 0.4f;
    public float f = 0.33f;

    static {
        g = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public kt4(Context context) {
        this.d = g;
        this.a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        this.c = new r79(28, context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.d = 0.0f;
    }
}
