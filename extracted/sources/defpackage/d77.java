package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.ui.platform.e;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d77 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;

    public static final int a(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final float c(int i, qz0 qz0Var) {
        Resources resources = (Resources) qz0Var.j(e.c);
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        return typedValue.getFloat();
    }

    public static void e(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            xn8.a(view, charSequence);
            return;
        }
        zn8 zn8Var = zn8.k;
        if (zn8Var != null && zn8Var.a == view) {
            zn8.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new zn8(view, charSequence);
            return;
        }
        zn8 zn8Var2 = zn8.l;
        if (zn8Var2 != null && zn8Var2.a == view) {
            zn8Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public abstract int b(Method method);

    public abstract boolean d(Method method);
}
