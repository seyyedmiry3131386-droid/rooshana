package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.material.loadingindicator.LoadingIndicatorSpec;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class xa4 extends Drawable implements Drawable.Callback {
    public final Context b;
    public final LoadingIndicatorSpec c;
    public final za4 d;
    public final wa4 e;
    public int g;
    public q39 h;
    public fl a = new fl();
    public final Paint f = new Paint();

    public xa4(Context context, LoadingIndicatorSpec loadingIndicatorSpec, za4 za4Var, wa4 wa4Var) {
        this.b = context;
        this.c = loadingIndicatorSpec;
        this.d = za4Var;
        this.e = wa4Var;
        wa4Var.g = this;
        setAlpha(255);
    }

    public final boolean a(boolean z, boolean z2, boolean z3) {
        boolean visible = super.setVisible(z, z2);
        wa4 wa4Var = this.e;
        ObjectAnimator objectAnimator = wa4Var.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        l38 l38Var = wa4Var.e;
        if (l38Var != null) {
            l38Var.d();
        }
        if (!z || !z3 || (this.a != null && fl.a(this.b.getContentResolver()) == 0.0f)) {
            return visible;
        }
        if (wa4Var.e == null) {
            l38 l38Var2 = new l38(wa4Var, wa4.j);
            m38 m38Var = new m38();
            m38Var.b(200.0f);
            m38Var.a(0.6f);
            l38Var2.m = m38Var;
            l38Var2.j = 0.01f;
            wa4Var.e = l38Var2;
        }
        if (wa4Var.d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(wa4Var, wa4.i, 0.0f, 1.0f);
            wa4Var.d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(650L);
            wa4Var.d.setInterpolator(null);
            wa4Var.d.setRepeatCount(-1);
            wa4Var.d.addListener(new s5(9, wa4Var));
        }
        wa4Var.a = 1;
        wa4Var.a(0.0f);
        wa4Var.h.a = wa4Var.f.d[0];
        wa4Var.e.a(wa4Var.a);
        wa4Var.d.start();
        return visible;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        q39 q39Var;
        Rect rect = new Rect();
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            fl flVar = this.a;
            int i2 = 0;
            LoadingIndicatorSpec loadingIndicatorSpec = this.c;
            if (flVar != null && fl.a(this.b.getContentResolver()) == 0.0f && (q39Var = this.h) != null) {
                q39Var.setBounds(bounds);
                this.h.setTint(loadingIndicatorSpec.d[0]);
                this.h.draw(canvas);
                return;
            }
            canvas.save();
            za4 za4Var = this.d;
            za4Var.getClass();
            LoadingIndicatorSpec loadingIndicatorSpec2 = za4Var.a;
            canvas.translate(bounds.centerX(), bounds.centerY());
            loadingIndicatorSpec2.getClass();
            float f = 2.0f;
            canvas.clipRect((-Math.max(loadingIndicatorSpec2.c, loadingIndicatorSpec2.a)) / 2.0f, (-Math.max(loadingIndicatorSpec2.b, loadingIndicatorSpec2.a)) / 2.0f, Math.max(loadingIndicatorSpec2.c, loadingIndicatorSpec2.a) / 2.0f, Math.max(loadingIndicatorSpec2.b, loadingIndicatorSpec2.a) / 2.0f);
            canvas.rotate(-90.0f);
            float fMin = Math.min(loadingIndicatorSpec2.b, loadingIndicatorSpec2.c) / 2.0f;
            int iJ = m91.j(loadingIndicatorSpec.e, this.g);
            Paint paint = this.f;
            paint.setColor(iJ);
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            canvas.drawRoundRect(new RectF((-r10) / 2.0f, (-r12) / 2.0f, loadingIndicatorSpec2.b / 2.0f, loadingIndicatorSpec2.c / 2.0f), fMin, fMin, paint);
            ya4 ya4Var = this.e.h;
            int i3 = this.g;
            Matrix matrix = za4Var.c;
            paint.setColor(m91.j(ya4Var.a, i3));
            paint.setStyle(style);
            canvas.save();
            canvas.rotate(ya4Var.c);
            Path path = za4Var.b;
            path.rewind();
            int iFloor = (int) Math.floor(ya4Var.b);
            ay2[] ay2VarArr = za4.e;
            int length = ay2VarArr.length;
            int i4 = iFloor / length;
            if ((iFloor ^ length) < 0 && i4 * length != iFloor) {
                i4--;
            }
            float f2 = ya4Var.b - iFloor;
            ay2 ay2Var = ay2VarArr[iFloor - (i4 * length)];
            js3.p(ay2Var, "<this>");
            ListBuilder listBuilderS = br9.s();
            ArrayList arrayList = ay2Var.a;
            int size = arrayList.size();
            h81 h81Var = null;
            int i5 = 0;
            h81 h81Var2 = null;
            while (i5 < size) {
                int i6 = i2;
                float[] fArr = new float[8];
                float f3 = f;
                int i7 = i6;
                for (int i8 = 8; i7 < i8; i8 = 8) {
                    fArr[i7] = p29.c(((h81) ((Pair) arrayList.get(i5)).a).a[i7], ((h81) ((Pair) arrayList.get(i5)).b).a[i7], f2);
                    i7++;
                }
                h81 h81Var3 = new h81(fArr);
                if (h81Var2 == null) {
                    h81Var2 = h81Var3;
                }
                if (h81Var != null) {
                    listBuilderS.add(h81Var);
                }
                i5++;
                h81Var = h81Var3;
                i2 = i6;
                f = f3;
            }
            int i9 = i2;
            float f4 = f;
            if (h81Var != null && h81Var2 != null) {
                float[] fArr2 = h81Var.a;
                float f5 = fArr2[i9];
                float f6 = fArr2[1];
                float f7 = fArr2[2];
                float f8 = fArr2[3];
                float f9 = fArr2[4];
                float f10 = fArr2[5];
                float[] fArr3 = h81Var2.a;
                listBuilderS.add(rq4.a(f5, f6, f7, f8, f9, f10, fArr3[i9], fArr3[1]));
            }
            ListBuilder listBuilderQ = br9.q(listBuilderS);
            path.rewind();
            int iA = listBuilderQ.a();
            int i10 = 1;
            int i11 = i9;
            while (i11 < iA) {
                h81 h81Var4 = (h81) listBuilderQ.get(i11);
                if (i10 != 0) {
                    float[] fArr4 = h81Var4.a;
                    path.moveTo(fArr4[i9], fArr4[1]);
                    i = i9;
                } else {
                    i = i10;
                }
                float[] fArr5 = h81Var4.a;
                path.cubicTo(fArr5[2], fArr5[3], fArr5[4], fArr5[5], h81Var4.a(), h81Var4.b());
                i11++;
                i10 = i;
            }
            path.close();
            float f11 = loadingIndicatorSpec2.a / f4;
            matrix.setScale(f11, f11);
            path.transform(matrix);
            canvas.drawPath(path, paint);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        LoadingIndicatorSpec loadingIndicatorSpec = this.d.a;
        return Math.max(loadingIndicatorSpec.b, loadingIndicatorSpec.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        LoadingIndicatorSpec loadingIndicatorSpec = this.d.a;
        return Math.max(loadingIndicatorSpec.c, loadingIndicatorSpec.a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.g != i) {
            this.g = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return a(z, z2, z);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
