package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public class cu4 {
    public final Context a;
    public final ot4 b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public fu4 h;
    public au4 i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final bu4 k = new bu4(this);

    public cu4(Context context, ot4 ot4Var, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = ot4Var;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final au4 a() {
        au4 l48Var;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(rq6.abc_cascading_menus_min_smallest_width)) {
                l48Var = new on0(context, this.e, this.d, this.c);
            } else {
                l48Var = new l48(this.a, this.b, this.e, this.d, this.c);
            }
            l48Var.n(this.b);
            l48Var.t(this.k);
            l48Var.p(this.e);
            l48Var.i(this.h);
            l48Var.q(this.g);
            l48Var.r(this.f);
            this.i = l48Var;
        }
        return this.i;
    }

    public final boolean b() {
        au4 au4Var = this.i;
        return au4Var != null && au4Var.b();
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        au4 au4VarA = a();
        au4VarA.u(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            au4VarA.s(i);
            au4VarA.v(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            au4VarA.a = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        au4VarA.a();
    }
}
