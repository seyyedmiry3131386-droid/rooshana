package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class ct7 {
    public as7 c;
    public boolean a = false;
    public boolean b = false;
    public RectF d = new RectF();
    public final Path e = new Path();

    public abstract void a(FrameLayout frameLayout);

    public abstract boolean b();

    public final void c() {
        as7 as7Var;
        RectF rectF = this.d;
        if (rectF.left > rectF.right || rectF.top > rectF.bottom || (as7Var = this.c) == null) {
            return;
        }
        bs7.a.b(as7Var, null, 1.0f, rectF, null, this.e);
    }
}
