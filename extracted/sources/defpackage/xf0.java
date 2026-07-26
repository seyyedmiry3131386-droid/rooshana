package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class xf0 implements wf0, cg9 {
    public static final xf0 a = new xf0();
    public static final xf0 b = new xf0();

    @Override // defpackage.cg9
    public yf9 a(Activity activity2, rj1 rj1Var) {
        js3.p(rj1Var, "densityCompatHelper");
        wf0.b0.getClass();
        return new yf9(new uf0(vf0.a().g(activity2)), rj1Var.b(activity2));
    }

    @Override // defpackage.cg9
    public yf9 d(Context context, rj1 rj1Var) {
        js3.p(rj1Var, "densityCompatHelper");
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        float f = context.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        js3.o(bounds, "getBounds(...)");
        return new yf9(bounds, f);
    }

    @Override // defpackage.wf0
    public Rect g(Activity activity2) {
        Rect bounds = ((WindowManager) activity2.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        js3.o(bounds, "getBounds(...)");
        return bounds;
    }
}
