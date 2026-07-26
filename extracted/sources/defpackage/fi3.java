package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.b;
import com.airbnb.lottie.utils.OffscreenLayer$RenderStrategy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class fi3 extends t70 {
    public final uz3 D;
    public final Rect E;
    public final Rect F;
    public final RectF G;
    public final yf4 H;
    public x29 I;
    public x29 J;
    public final hx1 K;
    public mr5 L;
    public dc0 M;

    public fi3(b bVar, q04 q04Var) {
        super(bVar, q04Var);
        this.D = new uz3(3, 0);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
        String str = q04Var.g;
        gf4 gf4Var = bVar.a;
        this.H = gf4Var == null ? null : (yf4) ((HashMap) gf4Var.c()).get(str);
        rb4 rb4Var = this.p.x;
        if (rb4Var != null) {
            this.K = new hx1(this, this, rb4Var);
        }
    }

    @Override // defpackage.t70, defpackage.lw1
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Bitmap bitmapS;
        super.d(rectF, matrix, z);
        yf4 yf4Var = this.H;
        if (yf4Var != null) {
            int i = yf4Var.b;
            int i2 = yf4Var.a;
            float fC = n29.c();
            if (this.o.n || (bitmapS = s()) == null) {
                rectF.set(0.0f, 0.0f, i2 * fC, i * fC);
            } else {
                rectF.set(0.0f, 0.0f, bitmapS.getWidth() * fC, bitmapS.getHeight() * fC);
            }
            this.n.mapRect(rectF);
        }
    }

    @Override // defpackage.t70, defpackage.ky3
    public final void f(hh2 hh2Var, Object obj) {
        super.f(hh2Var, obj);
        if (obj == ag4.I) {
            this.I = new x29(hh2Var, null);
            return;
        }
        if (obj == ag4.L) {
            this.J = new x29(hh2Var, null);
            return;
        }
        hx1 hx1Var = this.K;
        if (obj == 5 && hx1Var != null) {
            hx1Var.c.j(hh2Var);
            return;
        }
        if (obj == ag4.E && hx1Var != null) {
            hx1Var.c(hh2Var);
            return;
        }
        if (obj == ag4.F && hx1Var != null) {
            hx1Var.e.j(hh2Var);
            return;
        }
        if (obj == ag4.G && hx1Var != null) {
            hx1Var.f.j(hh2Var);
        } else {
            if (obj != ag4.H || hx1Var == null) {
                return;
            }
            hx1Var.g.j(hh2Var);
        }
    }

    @Override // defpackage.t70
    public final void j(Canvas canvas, Matrix matrix, int i, ex1 ex1Var) {
        yf4 yf4Var;
        Bitmap bitmapS = s();
        if (bitmapS == null || bitmapS.isRecycled() || (yf4Var = this.H) == null) {
            return;
        }
        float fC = n29.c();
        uz3 uz3Var = this.D;
        uz3Var.setAlpha(i);
        x29 x29Var = this.I;
        if (x29Var != null) {
            uz3Var.setColorFilter((ColorFilter) x29Var.e());
        }
        hx1 hx1Var = this.K;
        if (hx1Var != null) {
            ex1Var = hx1Var.b(matrix, i);
        }
        int width = bitmapS.getWidth();
        int height = bitmapS.getHeight();
        Rect rect = this.E;
        rect.set(0, 0, width, height);
        boolean z = this.o.n;
        Rect rect2 = this.F;
        if (z) {
            rect2.set(0, 0, (int) (yf4Var.a * fC), (int) (yf4Var.b * fC));
        } else {
            rect2.set(0, 0, (int) (bitmapS.getWidth() * fC), (int) (bitmapS.getHeight() * fC));
        }
        boolean z2 = ex1Var != null;
        if (z2) {
            if (this.L == null) {
                this.L = new mr5();
            }
            if (this.M == null) {
                this.M = new dc0(8, (byte) 0);
            }
            dc0 dc0Var = this.M;
            dc0Var.b = 255;
            dc0Var.c = null;
            ex1Var.getClass();
            ex1 ex1Var2 = new ex1(ex1Var);
            dc0Var.c = ex1Var2;
            ex1Var2.b(i);
            float f = rect2.left;
            float f2 = rect2.top;
            float f3 = rect2.right;
            float f4 = rect2.bottom;
            RectF rectF = this.G;
            rectF.set(f, f2, f3, f4);
            matrix.mapRect(rectF);
            canvas = this.L.e(canvas, rectF, this.M);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapS, rect, rect2, uz3Var);
        if (z2) {
            this.L.c();
            if (this.L.c == OffscreenLayer$RenderStrategy.d) {
                return;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap s() {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi3.s():android.graphics.Bitmap");
    }
}
