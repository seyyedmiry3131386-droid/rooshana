package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class zg8 {
    public float c;
    public float d;
    public final WeakReference f;
    public vf8 g;
    public final TextPaint a = new TextPaint(1);
    public final tq0 b = new tq0(1, this);
    public boolean e = true;

    public zg8(yg8 yg8Var) {
        this.f = new WeakReference(null);
        this.f = new WeakReference(yg8Var);
    }

    public final float a(String str) {
        if (!this.e) {
            return this.c;
        }
        b(str);
        return this.c;
    }

    public final void b(String str) {
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.e = false;
    }

    public final void c(vf8 vf8Var, Context context) {
        if (this.g != vf8Var) {
            this.g = vf8Var;
            if (vf8Var != null) {
                TextPaint textPaint = this.a;
                tq0 tq0Var = this.b;
                vf8Var.e(context, textPaint, tq0Var);
                yg8 yg8Var = (yg8) this.f.get();
                if (yg8Var != null) {
                    textPaint.drawableState = yg8Var.getState();
                }
                vf8Var.d(context, textPaint, tq0Var);
                this.e = true;
            }
            yg8 yg8Var2 = (yg8) this.f.get();
            if (yg8Var2 != null) {
                yg8Var2.a();
                yg8Var2.onStateChange(yg8Var2.getState());
            }
        }
    }
}
