package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class ba9 {
    public static final ea9 a;
    public static final mo0 b;
    public static final mo0 c;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new fa9();
        } else {
            a = new ea9();
        }
        b = new mo0(Float.class, "translationAlpha", 21);
        c = new mo0(Rect.class, "clipBounds", 22);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.B(view, i, i2, i3, i4);
    }

    public static void b(View view, float f) {
        a.s(view, f);
    }

    public static void c(int i, View view) {
        a.t(i, view);
    }
}
