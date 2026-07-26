package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class u72 {
    public static ex2 a(yf9 yf9Var, FoldingFeature foldingFeature) {
        dx2 dx2Var;
        ch2 ch2Var;
        js3.p(yf9Var, "windowMetrics");
        js3.p(foldingFeature, "oemFeature");
        int type = foldingFeature.getType();
        if (type == 1) {
            dx2Var = dx2.c;
        } else {
            if (type != 2) {
                return null;
            }
            dx2Var = dx2.d;
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            ch2Var = ch2.c;
        } else {
            if (state != 2) {
                return null;
            }
            ch2Var = ch2.d;
        }
        Rect bounds = foldingFeature.getBounds();
        js3.o(bounds, "getBounds(...)");
        uf0 uf0Var = new uf0(bounds);
        Rect rectC = yf9Var.a.c();
        if (uf0Var.a() == 0 && uf0Var.b() == 0) {
            return null;
        }
        if (uf0Var.b() != rectC.width() && uf0Var.a() != rectC.height()) {
            return null;
        }
        if (uf0Var.b() < rectC.width() && uf0Var.a() < rectC.height()) {
            return null;
        }
        if (uf0Var.b() == rectC.width() && uf0Var.a() == rectC.height()) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        js3.o(bounds2, "getBounds(...)");
        return new ex2(new uf0(bounds2), dx2Var, ch2Var);
    }

    public static xf9 b(yf9 yf9Var, WindowLayoutInfo windowLayoutInfo) {
        js3.p(yf9Var, "windowMetrics");
        js3.p(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        js3.o(displayFeatures, "getDisplayFeatures(...)");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            ex2 ex2VarA = foldingFeature instanceof FoldingFeature ? a(yf9Var, foldingFeature) : null;
            if (ex2VarA != null) {
                arrayList.add(ex2VarA);
            }
        }
        return new xf9(arrayList);
    }

    public static xf9 c(Context context, WindowLayoutInfo windowLayoutInfo) {
        cg9 cg9Var = th0.x;
        xf0 xf0Var = xf0.b;
        sj1 sj1Var = sj1.b;
        js3.p(windowLayoutInfo, "info");
        int i = Build.VERSION.SDK_INT;
        rj1 rj1Var = i >= 34 ? sj1.a : eq.w;
        br9.o(1, 2, 4, 8, 16, 32, 64, 128);
        if (i >= 30) {
            if (i >= 34) {
                cg9Var = sj1Var;
            } else if (i >= 30) {
                cg9Var = xf0Var;
            }
            return b(cg9Var.d(context, rj1Var), windowLayoutInfo);
        }
        if (i < 29 || !(context instanceof Activity)) {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        }
        Activity activity2 = (Activity) context;
        if (i >= 34) {
            cg9Var = sj1Var;
        } else if (i >= 30) {
            cg9Var = xf0Var;
        }
        return b(cg9Var.a(activity2, rj1Var), windowLayoutInfo);
    }
}
