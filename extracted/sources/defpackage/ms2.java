package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class ms2 extends ViewGroup implements ks2 {
    public static final /* synthetic */ int g = 0;
    public ViewGroup a;
    public View b;
    public final View c;
    public int d;
    public Matrix e;
    public final o51 f;

    public ms2(View view) {
        super(view.getContext());
        this.f = new o51(this, 1);
        this.c = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    @Override // defpackage.ks2
    public final void c(View view, ViewGroup viewGroup) {
        this.a = viewGroup;
        this.b = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = nr6.ghost_view;
        View view = this.c;
        view.setTag(i, this);
        view.getViewTreeObserver().addOnPreDrawListener(this.f);
        ba9.c(4, view);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view = this.c;
        view.getViewTreeObserver().removeOnPreDrawListener(this.f);
        ba9.c(0, view);
        view.setTag(nr6.ghost_view, null);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        br9.u(canvas, true);
        canvas.setMatrix(this.e);
        View view = this.c;
        ba9.c(0, view);
        view.invalidate();
        ba9.c(4, view);
        drawChild(canvas, view, getDrawingTime());
        br9.u(canvas, false);
    }

    @Override // android.view.View, defpackage.ks2
    public final void setVisibility(int i) {
        super.setVisibility(i);
        int i2 = nr6.ghost_view;
        View view = this.c;
        if (((ms2) view.getTag(i2)) == this) {
            ba9.c(i == 0 ? 4 : 0, view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
