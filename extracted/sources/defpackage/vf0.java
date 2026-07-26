package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class vf0 {
    public static final /* synthetic */ vf0 a = new vf0();
    public static final String b = wf0.class.getSimpleName();

    public static wf0 a() {
        int i = Build.VERSION.SDK_INT;
        return i >= 30 ? xf0.a : i >= 29 ? fz1.c : i >= 28 ? th0.d : i >= 24 ? eq.r : hy2.b;
    }
}
