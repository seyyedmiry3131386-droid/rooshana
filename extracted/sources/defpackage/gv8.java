package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public abstract class gv8 {
    public static final ThreadLocal a = new ThreadLocal();

    public static Typeface a(Typeface typeface, ej2 ej2Var, Context context) {
        if (typeface == null) {
            return null;
        }
        if (ej2Var.a.isEmpty()) {
            return typeface;
        }
        ThreadLocal threadLocal = a;
        Paint paint = (Paint) threadLocal.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(zc.z(ej2Var, context));
        return paint.getTypeface();
    }
}
