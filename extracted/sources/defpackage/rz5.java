package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class rz5 {
    public int a;
    public int b;
    public int c;

    public rz5() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public /* synthetic */ rz5(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public rz5(int i, int i2, int i3, int i4) {
        i2 = (i4 & 2) != 0 ? i : i2;
        i3 = (i4 & 8) != 0 ? i * 3 : i3;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public rz5(kt4 kt4Var) {
        Context context = kt4Var.a;
        float f = kt4Var.d;
        ActivityManager activityManager = kt4Var.b;
        int i = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.c = i;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? kt4Var.f : kt4Var.e));
        DisplayMetrics displayMetrics = (DisplayMetrics) kt4Var.c.b;
        float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int iRound2 = Math.round(f2 * f);
        int iRound3 = Math.round(f2 * 2.0f);
        int i2 = iRound - i;
        if (iRound3 + iRound2 <= i2) {
            this.b = iRound3;
            this.a = iRound2;
        } else {
            float f3 = i2 / (f + 2.0f);
            this.b = Math.round(2.0f * f3);
            this.a = Math.round(f3 * f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context, this.b);
            Formatter.formatFileSize(context, this.a);
            Formatter.formatFileSize(context, i);
            Formatter.formatFileSize(context, iRound);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
    }
}
