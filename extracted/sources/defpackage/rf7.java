package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.fragment.app.FragmentActivity;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class rf7 {
    public final dv2 a;
    public final int b;

    public rf7(dv2 dv2Var, lu7 lu7Var) {
        js3.p(dv2Var, "graphicUtils");
        js3.p(lu7Var, "sharedPreferencesProxy");
        this.a = dv2Var;
        this.b = lu7Var.c(this.b, lu7.f);
    }

    public static int a(Activity activity2) {
        if (activity2 != null) {
            GraphicUtils$Dimension graphicUtils$DimensionG = p3.g(activity2);
            return Math.min(graphicUtils$DimensionG.b, graphicUtils$DimensionG.a);
        }
        lw.g(null, null, null);
        return 0;
    }

    public final String b() {
        int i = this.b;
        return i != 1 ? i != 2 ? "automatic" : "low" : "high";
    }

    public final float c(FragmentActivity fragmentActivity) {
        DisplayMetrics displayMetrics;
        if (fragmentActivity == null) {
            lw.g(null, null, null);
            return 0.0f;
        }
        this.a.getClass();
        Resources resources = fragmentActivity.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return 0.0f;
        }
        return displayMetrics.widthPixels / displayMetrics.density;
    }
}
