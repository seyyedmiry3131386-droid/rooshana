package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;

/* JADX INFO: loaded from: classes.dex */
public final class tn extends do3 {
    public final AppCompatSeekBar f;
    public Drawable g;
    public ColorStateList h;
    public PorterDuff.Mode i;
    public boolean j;
    public boolean k;

    public tn(AppCompatSeekBar appCompatSeekBar) {
        super((Object) appCompatSeekBar);
        this.h = null;
        this.i = null;
        this.j = false;
        this.k = false;
        this.f = appCompatSeekBar;
    }

    public final void J() {
        Drawable drawable = this.g;
        if (drawable != null) {
            if (this.j || this.k) {
                Drawable drawableMutate = drawable.mutate();
                this.g = drawableMutate;
                if (this.j) {
                    drawableMutate.setTintList(this.h);
                }
                if (this.k) {
                    this.g.setTintMode(this.i);
                }
                if (this.g.isStateful()) {
                    this.g.setState(this.f.getDrawableState());
                }
            }
        }
    }

    public final void K(Canvas canvas) {
        if (this.g != null) {
            int max = this.f.getMax();
            if (max > 1) {
                int intrinsicWidth = this.g.getIntrinsicWidth();
                int intrinsicHeight = this.g.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.g.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.g.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // defpackage.do3
    public final void s(AttributeSet attributeSet, int i) {
        super.s(attributeSet, i);
        AppCompatSeekBar appCompatSeekBar = this.f;
        sk6 sk6VarD = sk6.D(appCompatSeekBar.getContext(), attributeSet, lu6.AppCompatSeekBar, i);
        TypedArray typedArray = (TypedArray) sk6VarD.c;
        q69.p(appCompatSeekBar, appCompatSeekBar.getContext(), lu6.AppCompatSeekBar, attributeSet, (TypedArray) sk6VarD.c, i);
        Drawable drawableW = sk6VarD.w(lu6.AppCompatSeekBar_android_thumb);
        if (drawableW != null) {
            appCompatSeekBar.setThumb(drawableW);
        }
        Drawable drawableV = sk6VarD.v(lu6.AppCompatSeekBar_tickMark);
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.g = drawableV;
        if (drawableV != null) {
            drawableV.setCallback(appCompatSeekBar);
            drawableV.setLayoutDirection(appCompatSeekBar.getLayoutDirection());
            if (drawableV.isStateful()) {
                drawableV.setState(appCompatSeekBar.getDrawableState());
            }
            J();
        }
        appCompatSeekBar.invalidate();
        if (typedArray.hasValue(lu6.AppCompatSeekBar_tickMarkTintMode)) {
            this.i = aw1.c(typedArray.getInt(lu6.AppCompatSeekBar_tickMarkTintMode, -1), this.i);
            this.k = true;
        }
        if (typedArray.hasValue(lu6.AppCompatSeekBar_tickMarkTint)) {
            this.h = sk6VarD.t(lu6.AppCompatSeekBar_tickMarkTint);
            this.j = true;
        }
        sk6VarD.G();
        J();
    }
}
