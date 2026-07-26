package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class bo8 extends fk4 implements yg8 {
    public CharSequence H;
    public final Context I;
    public final Paint.FontMetrics J;
    public final zg8 K;
    public final at1 L;
    public final Rect M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public int S;
    public int T;
    public float U;
    public float V;
    public float W;
    public float X;
    public float Y;

    public bo8(Context context, int i) {
        super(context, null, 0, i);
        this.J = new Paint.FontMetrics();
        zg8 zg8Var = new zg8(this);
        this.K = zg8Var;
        this.L = new at1(6, this);
        this.M = new Rect();
        this.U = 1.0f;
        this.V = 1.0f;
        this.W = 0.5f;
        this.X = 0.5f;
        this.Y = 1.0f;
        this.I = context;
        float f = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = zg8Var.a;
        textPaint.density = f;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    public final float E() {
        int i;
        Rect rect = this.M;
        if (((rect.right - getBounds().right) - this.T) - this.Q < 0) {
            i = ((rect.right - getBounds().right) - this.T) - this.Q;
        } else {
            if (((rect.left - getBounds().left) - this.T) + this.Q <= 0) {
                return 0.0f;
            }
            i = ((rect.left - getBounds().left) - this.T) + this.Q;
        }
        return i;
    }

    public final or5 F() {
        float f = -E();
        float fWidth = (float) ((((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.S))) / 2.0d);
        return new or5(new oi4(this.S), Math.min(Math.max(f, -fWidth), fWidth));
    }

    @Override // defpackage.fk4, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float fE = E();
        float f = (float) (-((Math.sqrt(2.0d) * ((double) this.S)) - ((double) this.S)));
        canvas.scale(this.U, this.V, (getBounds().width() * this.W) + getBounds().left, (getBounds().height() * this.X) + getBounds().top);
        canvas.translate(fE, f);
        super.draw(canvas);
        if (this.H == null) {
            canvas2 = canvas;
        } else {
            float fCenterY = getBounds().centerY();
            zg8 zg8Var = this.K;
            TextPaint textPaint = zg8Var.a;
            Paint.FontMetrics fontMetrics = this.J;
            textPaint.getFontMetrics(fontMetrics);
            int i = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (zg8Var.g != null) {
                textPaint.drawableState = getState();
                zg8Var.g.d(this.I, zg8Var.a, zg8Var.b);
                textPaint.setAlpha((int) (this.Y * 255.0f));
            }
            CharSequence charSequence = this.H;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), r0.centerX(), i, textPaint);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.K.a.getTextSize(), this.P);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.N * 2;
        CharSequence charSequence = this.H;
        return (int) Math.max(f + (charSequence == null ? 0.0f : this.K.a(charSequence.toString())), this.O);
    }

    @Override // defpackage.fk4, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.R) {
            yr7 yr7VarH = this.b.a.h();
            yr7VarH.k = F();
            setShapeAppearanceModel(yr7VarH.a());
        }
    }
}
