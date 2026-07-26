package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class ju0 extends MetricAffectingSpan {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ju0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                ui4 ui4Var = (ui4) this.b;
                ui4Var.getClass();
                textPaint.setTypeface(Typeface.MONOSPACE);
                textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
                ui4Var.getClass();
                textPaint.bgColor = yh0.l(textPaint.getColor(), 25);
                break;
            case 1:
                textPaint.setFontFeatureSettings((String) this.b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                ((ui4) this.b).getClass();
                textPaint.setTypeface(Typeface.MONOSPACE);
                textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
                break;
            case 1:
                textPaint.setFontFeatureSettings((String) this.b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.b);
                break;
        }
    }
}
