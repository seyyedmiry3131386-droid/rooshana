package defpackage;

import android.R;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class sj {
    public final tj a;
    public GradientDrawable b;
    public LayerDrawable c;
    public LayerDrawable d;
    public boolean e;
    public AnimatorSet f;

    public sj(tj tjVar) {
        this.a = tjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.bp2 r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sj.a(bp2, boolean):void");
    }

    public final void b(float[] fArr) {
        GradientDrawable gradientDrawable = this.b;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadii(fArr);
        }
        LayerDrawable layerDrawable = this.c;
        Drawable drawable = layerDrawable != null ? layerDrawable.getDrawable(0) : null;
        GradientDrawable gradientDrawable2 = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setCornerRadii(fArr);
        }
        LayerDrawable layerDrawable2 = this.d;
        if (layerDrawable2 != null) {
            Drawable drawable2 = layerDrawable2.getDrawable(0);
            GradientDrawable gradientDrawable3 = drawable2 instanceof GradientDrawable ? (GradientDrawable) drawable2 : null;
            if (gradientDrawable3 != null) {
                gradientDrawable3.setCornerRadii(fArr);
            }
            Drawable drawable3 = layerDrawable2.getDrawable(1);
            RippleDrawable rippleDrawable = drawable3 instanceof RippleDrawable ? (RippleDrawable) drawable3 : null;
            Drawable drawableFindDrawableByLayerId = rippleDrawable != null ? rippleDrawable.findDrawableByLayerId(R.id.mask) : null;
            GradientDrawable gradientDrawable4 = drawableFindDrawableByLayerId instanceof GradientDrawable ? (GradientDrawable) drawableFindDrawableByLayerId : null;
            if (gradientDrawable4 != null) {
                gradientDrawable4.setCornerRadii(fArr);
            }
        }
    }

    public final void c(int i) {
        GradientDrawable gradientDrawable = this.b;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i);
        }
        LayerDrawable layerDrawable = this.c;
        Drawable drawable = layerDrawable != null ? layerDrawable.getDrawable(0) : null;
        GradientDrawable gradientDrawable2 = drawable instanceof GradientDrawable ? (GradientDrawable) drawable : null;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setColor(i);
        }
    }
}
