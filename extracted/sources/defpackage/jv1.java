package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class jv1 extends CharacterStyle implements UpdateAppearance {
    public final iv1 a;

    public jv1(iv1 iv1Var) {
        this.a = iv1Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            dc2 dc2Var = dc2.a;
            iv1 iv1Var = this.a;
            if (js3.i(iv1Var, dc2Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(iv1Var instanceof p88)) {
                throw new NoWhenBranchMatchedException();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            p88 p88Var = (p88) iv1Var;
            textPaint.setStrokeWidth(p88Var.a);
            textPaint.setStrokeMiter(p88Var.b);
            int i = p88Var.d;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = p88Var.c;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
