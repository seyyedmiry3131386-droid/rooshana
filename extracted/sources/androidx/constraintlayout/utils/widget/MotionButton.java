package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatButton;
import defpackage.eu6;
import defpackage.iy4;

/* JADX INFO: loaded from: classes.dex */
public class MotionButton extends AppCompatButton {
    public float d;
    public float e;
    public Path f;
    public ViewOutlineProvider g;
    public RectF h;

    public MotionButton(Context context) {
        super(context);
        this.d = 0.0f;
        this.e = Float.NaN;
        setPadding(0, 0, 0, 0);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eu6.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == eu6.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == eu6.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public float getRound() {
        return this.e;
    }

    public float getRoundPercent() {
        return this.d;
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.e = f;
            float f2 = this.d;
            this.d = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.e != f;
        this.e = f;
        if (f != 0.0f) {
            if (this.f == null) {
                this.f = new Path();
            }
            if (this.h == null) {
                this.h = new RectF();
            }
            if (this.g == null) {
                iy4 iy4Var = new iy4(this, 1);
                this.g = iy4Var;
                setOutlineProvider(iy4Var);
            }
            setClipToOutline(true);
            this.h.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f.reset();
            Path path = this.f;
            RectF rectF = this.h;
            float f3 = this.e;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.d != f;
        this.d = f;
        if (f != 0.0f) {
            if (this.f == null) {
                this.f = new Path();
            }
            if (this.h == null) {
                this.h = new RectF();
            }
            if (this.g == null) {
                iy4 iy4Var = new iy4(this, 0);
                this.g = iy4Var;
                setOutlineProvider(iy4Var);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.d) / 2.0f;
            this.h.set(0.0f, 0.0f, width, height);
            this.f.reset();
            this.f.addRoundRect(this.h, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0.0f;
        this.e = Float.NaN;
        a(context, attributeSet);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 0.0f;
        this.e = Float.NaN;
        a(context, attributeSet);
    }
}
