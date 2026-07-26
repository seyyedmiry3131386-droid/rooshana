package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.g;

/* JADX INFO: loaded from: classes.dex */
public final class tr7 extends CharacterStyle implements UpdateAppearance {
    public final sr7 a;
    public final float b;
    public final wb5 c = g.h(new ey7(9205357640488583168L));
    public final ck1 d = g.c(new o06(29, this));

    public tr7(sr7 sr7Var, float f) {
        this.a = sr7Var;
        this.b = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        ok4.X(textPaint, this.b);
        textPaint.setShader((Shader) this.d.getValue());
    }
}
