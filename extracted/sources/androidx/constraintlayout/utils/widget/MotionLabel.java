package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import defpackage.eu6;
import defpackage.ie2;
import defpackage.ry4;
import defpackage.vy2;
import defpackage.xp6;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class MotionLabel extends View implements ie2 {
    public float A;
    public float B;
    public Drawable C;
    public Matrix D;
    public Bitmap E;
    public BitmapShader F;
    public Matrix G;
    public float H;
    public float I;
    public float J;
    public float K;
    public final Paint L;
    public int M;
    public Rect N;
    public Paint O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public final TextPaint a;
    public Path b;
    public int c;
    public int d;
    public boolean e;
    public float f;
    public float g;
    public ViewOutlineProvider h;
    public RectF i;
    public float j;
    public float k;
    public int l;
    public int m;
    public float n;
    public String o;
    public boolean p;
    public final Rect q;
    public int r;
    public int s;
    public int t;
    public int u;
    public String v;
    public int w;
    public int x;
    public boolean y;
    public float z;

    public MotionLabel(Context context) {
        super(context);
        this.a = new TextPaint();
        this.b = new Path();
        this.c = 65535;
        this.d = 65535;
        this.e = false;
        this.f = 0.0f;
        this.g = Float.NaN;
        this.j = 48.0f;
        this.k = Float.NaN;
        this.n = 0.0f;
        this.o = "Hello World";
        this.p = true;
        this.q = new Rect();
        this.r = 1;
        this.s = 1;
        this.t = 1;
        this.u = 1;
        this.w = 8388659;
        this.x = 0;
        this.y = false;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.J = 0.0f;
        this.K = 0.0f;
        this.L = new Paint();
        this.M = 0;
        this.Q = Float.NaN;
        this.R = Float.NaN;
        this.S = Float.NaN;
        this.T = Float.NaN;
        b(context, null);
    }

    private float getHorizontalOffset() {
        float f = Float.isNaN(this.k) ? 1.0f : this.j / this.k;
        String str = this.o;
        return ((this.J + 1.0f) * ((((Float.isNaN(this.A) ? getMeasuredWidth() : this.A) - getPaddingLeft()) - getPaddingRight()) - (this.a.measureText(str, 0, str.length()) * f))) / 2.0f;
    }

    private float getVerticalOffset() {
        float f = Float.isNaN(this.k) ? 1.0f : this.j / this.k;
        Paint.FontMetrics fontMetrics = this.a.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.B) ? getMeasuredHeight() : this.B) - getPaddingTop()) - getPaddingBottom();
        float f2 = fontMetrics.descent;
        float f3 = fontMetrics.ascent;
        return (((1.0f - this.K) * (measuredHeight - ((f2 - f3) * f))) / 2.0f) - (f * f3);
    }

    private void setUpTheme(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(xp6.colorPrimary, typedValue, true);
        int i = typedValue.data;
        this.c = i;
        this.a.setColor(i);
    }

    public final void a(float f) {
        if (this.e || f != 1.0f) {
            this.b.reset();
            String str = this.o;
            int length = str.length();
            TextPaint textPaint = this.a;
            Rect rect = this.q;
            textPaint.getTextBounds(str, 0, length, rect);
            textPaint.getTextPath(str, 0, length, 0.0f, 0.0f, this.b);
            if (f != 1.0f) {
                vy2.C();
                Matrix matrix = new Matrix();
                matrix.postScale(f, f);
                this.b.transform(matrix);
            }
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.p = false;
        }
    }

    public final void b(Context context, AttributeSet attributeSet) {
        Typeface typefaceCreate;
        setUpTheme(context);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, eu6.MotionLabel);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == eu6.MotionLabel_android_text) {
                    setText(typedArrayObtainStyledAttributes.getText(index));
                } else if (index == eu6.MotionLabel_android_fontFamily) {
                    this.v = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == eu6.MotionLabel_scaleFromTextSize) {
                    this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.k);
                } else if (index == eu6.MotionLabel_android_textSize) {
                    this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, (int) this.j);
                } else if (index == eu6.MotionLabel_android_textStyle) {
                    this.l = typedArrayObtainStyledAttributes.getInt(index, this.l);
                } else if (index == eu6.MotionLabel_android_typeface) {
                    this.m = typedArrayObtainStyledAttributes.getInt(index, this.m);
                } else if (index == eu6.MotionLabel_android_textColor) {
                    this.c = typedArrayObtainStyledAttributes.getColor(index, this.c);
                } else if (index == eu6.MotionLabel_borderRound) {
                    float dimension = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                    this.g = dimension;
                    setRound(dimension);
                } else if (index == eu6.MotionLabel_borderRoundPercent) {
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                    this.f = f;
                    setRoundPercent(f);
                } else if (index == eu6.MotionLabel_android_gravity) {
                    setGravity(typedArrayObtainStyledAttributes.getInt(index, -1));
                } else if (index == eu6.MotionLabel_android_autoSizeTextType) {
                    this.x = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == eu6.MotionLabel_textOutlineColor) {
                    this.d = typedArrayObtainStyledAttributes.getInt(index, this.d);
                    this.e = true;
                } else if (index == eu6.MotionLabel_textOutlineThickness) {
                    this.n = typedArrayObtainStyledAttributes.getDimension(index, this.n);
                    this.e = true;
                } else if (index == eu6.MotionLabel_textBackground) {
                    this.C = typedArrayObtainStyledAttributes.getDrawable(index);
                    this.e = true;
                } else if (index == eu6.MotionLabel_textBackgroundPanX) {
                    this.Q = typedArrayObtainStyledAttributes.getFloat(index, this.Q);
                } else if (index == eu6.MotionLabel_textBackgroundPanY) {
                    this.R = typedArrayObtainStyledAttributes.getFloat(index, this.R);
                } else if (index == eu6.MotionLabel_textPanX) {
                    this.J = typedArrayObtainStyledAttributes.getFloat(index, this.J);
                } else if (index == eu6.MotionLabel_textPanY) {
                    this.K = typedArrayObtainStyledAttributes.getFloat(index, this.K);
                } else if (index == eu6.MotionLabel_textBackgroundRotate) {
                    this.T = typedArrayObtainStyledAttributes.getFloat(index, this.T);
                } else if (index == eu6.MotionLabel_textBackgroundZoom) {
                    this.S = typedArrayObtainStyledAttributes.getFloat(index, this.S);
                } else if (index == eu6.MotionLabel_textureHeight) {
                    this.H = typedArrayObtainStyledAttributes.getDimension(index, this.H);
                } else if (index == eu6.MotionLabel_textureWidth) {
                    this.I = typedArrayObtainStyledAttributes.getDimension(index, this.I);
                } else if (index == eu6.MotionLabel_textureEffect) {
                    this.M = typedArrayObtainStyledAttributes.getInt(index, this.M);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.C != null) {
            this.G = new Matrix();
            int intrinsicWidth = this.C.getIntrinsicWidth();
            int intrinsicHeight = this.C.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.I) ? 128 : (int) this.I;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.H) ? 128 : (int) this.H;
            }
            if (this.M != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.E = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.E);
            this.C.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.C.setFilterBitmap(true);
            this.C.draw(canvas);
            if (this.M != 0) {
                Bitmap bitmap = this.E;
                int width = bitmap.getWidth() / 2;
                int height = bitmap.getHeight() / 2;
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
                for (int i2 = 0; i2 < 4 && width >= 32 && height >= 32; i2++) {
                    width /= 2;
                    height /= 2;
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, width, height, true);
                }
                this.E = bitmapCreateScaledBitmap;
            }
            Bitmap bitmap2 = this.E;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.F = new BitmapShader(bitmap2, tileMode, tileMode);
        }
        this.r = getPaddingLeft();
        this.s = getPaddingRight();
        this.t = getPaddingTop();
        this.u = getPaddingBottom();
        String str = this.v;
        int i3 = this.m;
        int i4 = this.l;
        TextPaint textPaint = this.a;
        if (str != null) {
            typefaceCreate = Typeface.create(str, i4);
            if (typefaceCreate != null) {
                setTypeface(typefaceCreate);
            }
            textPaint.setColor(this.c);
            textPaint.setStrokeWidth(this.n);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setFlags(128);
            setTextSize(this.j);
            textPaint.setAntiAlias(true);
        }
        typefaceCreate = null;
        if (i3 == 1) {
            typefaceCreate = Typeface.SANS_SERIF;
        } else if (i3 == 2) {
            typefaceCreate = Typeface.SERIF;
        } else if (i3 == 3) {
            typefaceCreate = Typeface.MONOSPACE;
        }
        if (i4 > 0) {
            Typeface typefaceDefaultFromStyle = typefaceCreate == null ? Typeface.defaultFromStyle(i4) : Typeface.create(typefaceCreate, i4);
            setTypeface(typefaceDefaultFromStyle);
            int i5 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i4;
            textPaint.setFakeBoldText((i5 & 1) != 0);
            textPaint.setTextSkewX((i5 & 2) != 0 ? -0.25f : 0.0f);
        } else {
            textPaint.setFakeBoldText(false);
            textPaint.setTextSkewX(0.0f);
            setTypeface(typefaceCreate);
        }
        textPaint.setColor(this.c);
        textPaint.setStrokeWidth(this.n);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint.setFlags(128);
        setTextSize(this.j);
        textPaint.setAntiAlias(true);
    }

    public final void c(float f, float f2, float f3, float f4) {
        int i = (int) (f + 0.5f);
        this.z = f - i;
        int i2 = (int) (f3 + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (f4 + 0.5f);
        int i5 = (int) (0.5f + f2);
        int i6 = i4 - i5;
        float f5 = f3 - f;
        this.A = f5;
        float f6 = f4 - f2;
        this.B = f6;
        if (this.G != null) {
            this.A = f5;
            this.B = f6;
            d();
        }
        if (getMeasuredHeight() == i6 && getMeasuredWidth() == i3) {
            super.layout(i, i5, i2, i4);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            super.layout(i, i5, i2, i4);
        }
        if (this.y) {
            Rect rect = this.N;
            TextPaint textPaint = this.a;
            if (rect == null) {
                this.O = new Paint();
                this.N = new Rect();
                this.O.set(textPaint);
                this.P = this.O.getTextSize();
            }
            this.A = f5;
            this.B = f6;
            Paint paint = this.O;
            String str = this.o;
            paint.getTextBounds(str, 0, str.length(), this.N);
            float fHeight = this.N.height() * 1.3f;
            float f7 = (f5 - this.s) - this.r;
            float f8 = (f6 - this.u) - this.t;
            float fWidth = this.N.width();
            if (fWidth * f8 > fHeight * f7) {
                textPaint.setTextSize((this.P * f7) / fWidth);
            } else {
                textPaint.setTextSize((this.P * f8) / fHeight);
            }
            if (this.e || !Float.isNaN(this.k)) {
                a(Float.isNaN(this.k) ? 1.0f : this.j / this.k);
            }
        }
    }

    public final void d() {
        float f = Float.isNaN(this.Q) ? 0.0f : this.Q;
        float f2 = Float.isNaN(this.R) ? 0.0f : this.R;
        float f3 = Float.isNaN(this.S) ? 1.0f : this.S;
        float f4 = Float.isNaN(this.T) ? 0.0f : this.T;
        this.G.reset();
        float width = this.E.getWidth();
        float height = this.E.getHeight();
        float f5 = Float.isNaN(this.I) ? this.A : this.I;
        float f6 = Float.isNaN(this.H) ? this.B : this.H;
        float f7 = f3 * (width * f6 < height * f5 ? f5 / width : f6 / height);
        this.G.postScale(f7, f7);
        float f8 = width * f7;
        float f9 = f5 - f8;
        float f10 = f7 * height;
        float f11 = f6 - f10;
        if (!Float.isNaN(this.H)) {
            f11 = this.H / 2.0f;
        }
        if (!Float.isNaN(this.I)) {
            f9 = this.I / 2.0f;
        }
        this.G.postTranslate((((f * f9) + f5) - f8) * 0.5f, (((f2 * f11) + f6) - f10) * 0.5f);
        this.G.postRotate(f4, f5 / 2.0f, f6 / 2.0f);
        this.F.setLocalMatrix(this.G);
    }

    public float getRound() {
        return this.g;
    }

    public float getRoundPercent() {
        return this.f;
    }

    public float getScaleFromTextSize() {
        return this.k;
    }

    public float getTextBackgroundPanX() {
        return this.Q;
    }

    public float getTextBackgroundPanY() {
        return this.R;
    }

    public float getTextBackgroundRotate() {
        return this.T;
    }

    public float getTextBackgroundZoom() {
        return this.S;
    }

    public int getTextOutlineColor() {
        return this.d;
    }

    public float getTextPanX() {
        return this.J;
    }

    public float getTextPanY() {
        return this.K;
    }

    public float getTextureHeight() {
        return this.H;
    }

    public float getTextureWidth() {
        return this.I;
    }

    public Typeface getTypeface() {
        return this.a.getTypeface();
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        boolean zIsNaN = Float.isNaN(this.k);
        float f = zIsNaN ? 1.0f : this.j / this.k;
        this.A = i3 - i;
        this.B = i4 - i2;
        if (this.y) {
            Rect rect = this.N;
            TextPaint textPaint = this.a;
            if (rect == null) {
                this.O = new Paint();
                this.N = new Rect();
                this.O.set(textPaint);
                this.P = this.O.getTextSize();
            }
            Paint paint = this.O;
            String str = this.o;
            paint.getTextBounds(str, 0, str.length(), this.N);
            int iWidth = this.N.width();
            int iHeight = (int) (this.N.height() * 1.3f);
            float f2 = (this.A - this.s) - this.r;
            float f3 = (this.B - this.u) - this.t;
            if (zIsNaN) {
                float f4 = iWidth;
                float f5 = iHeight;
                if (f4 * f3 > f5 * f2) {
                    textPaint.setTextSize((this.P * f2) / f4);
                } else {
                    textPaint.setTextSize((this.P * f3) / f5);
                }
            } else {
                float f6 = iWidth;
                float f7 = iHeight;
                f = f6 * f3 > f7 * f2 ? f2 / f6 : f3 / f7;
            }
        }
        if (this.e || !zIsNaN) {
            float f8 = i;
            float f9 = i2;
            float f10 = i3;
            float f11 = i4;
            if (this.G != null) {
                this.A = f10 - f8;
                this.B = f11 - f9;
                d();
            }
            a(f);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = Float.isNaN(this.k) ? 1.0f : this.j / this.k;
        super.onDraw(canvas);
        boolean z = this.e;
        TextPaint textPaint = this.a;
        if (!z && f == 1.0f) {
            canvas.drawText(this.o, this.z + this.r + getHorizontalOffset(), this.t + getVerticalOffset(), textPaint);
            return;
        }
        if (this.p) {
            a(f);
        }
        if (this.D == null) {
            this.D = new Matrix();
        }
        if (!this.e) {
            float horizontalOffset = this.r + getHorizontalOffset();
            float verticalOffset = this.t + getVerticalOffset();
            this.D.reset();
            this.D.preTranslate(horizontalOffset, verticalOffset);
            this.b.transform(this.D);
            textPaint.setColor(this.c);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setStrokeWidth(this.n);
            canvas.drawPath(this.b, textPaint);
            this.D.reset();
            this.D.preTranslate(-horizontalOffset, -verticalOffset);
            this.b.transform(this.D);
            return;
        }
        Paint paint = this.L;
        paint.set(textPaint);
        this.D.reset();
        float horizontalOffset2 = this.r + getHorizontalOffset();
        float verticalOffset2 = this.t + getVerticalOffset();
        this.D.postTranslate(horizontalOffset2, verticalOffset2);
        this.D.preScale(f, f);
        this.b.transform(this.D);
        if (this.F != null) {
            textPaint.setFilterBitmap(true);
            textPaint.setShader(this.F);
        } else {
            textPaint.setColor(this.c);
        }
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setStrokeWidth(this.n);
        canvas.drawPath(this.b, textPaint);
        if (this.F != null) {
            textPaint.setShader(null);
        }
        textPaint.setColor(this.d);
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setStrokeWidth(this.n);
        canvas.drawPath(this.b, textPaint);
        this.D.reset();
        this.D.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.b.transform(this.D);
        textPaint.set(paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.y = false;
        this.r = getPaddingLeft();
        this.s = getPaddingRight();
        this.t = getPaddingTop();
        this.u = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            String str = this.o;
            int length = str.length();
            this.a.getTextBounds(str, 0, length, this.q);
            if (mode != 1073741824) {
                size = (int) (r7.width() + 0.99999f);
            }
            size += this.r + this.s;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (r6.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.t + this.u + fontMetricsInt;
            }
        } else if (this.x != 0) {
            this.y = true;
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i) {
        if ((i & 8388615) == 0) {
            i |= 8388611;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        if (i != this.w) {
            invalidate();
        }
        this.w = i;
        int i2 = i & 112;
        if (i2 == 48) {
            this.K = -1.0f;
        } else if (i2 != 80) {
            this.K = 0.0f;
        } else {
            this.K = 1.0f;
        }
        int i3 = i & 8388615;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 != 8388613) {
                        this.J = 0.0f;
                        return;
                    }
                }
            }
            this.J = 1.0f;
            return;
        }
        this.J = -1.0f;
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.g = f;
            float f2 = this.f;
            this.f = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.g != f;
        this.g = f;
        if (f != 0.0f) {
            if (this.b == null) {
                this.b = new Path();
            }
            if (this.i == null) {
                this.i = new RectF();
            }
            if (this.h == null) {
                ry4 ry4Var = new ry4(this, 1);
                this.h = ry4Var;
                setOutlineProvider(ry4Var);
            }
            setClipToOutline(true);
            this.i.set(0.0f, 0.0f, getWidth(), getHeight());
            this.b.reset();
            Path path = this.b;
            RectF rectF = this.i;
            float f3 = this.g;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.f != f;
        this.f = f;
        if (f != 0.0f) {
            if (this.b == null) {
                this.b = new Path();
            }
            if (this.i == null) {
                this.i = new RectF();
            }
            if (this.h == null) {
                ry4 ry4Var = new ry4(this, 0);
                this.h = ry4Var;
                setOutlineProvider(ry4Var);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f) / 2.0f;
            this.i.set(0.0f, 0.0f, width, height);
            this.b.reset();
            this.b.addRoundRect(this.i, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f) {
        this.k = f;
    }

    public void setText(CharSequence charSequence) {
        this.o = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.Q = f;
        d();
        invalidate();
    }

    public void setTextBackgroundPanY(float f) {
        this.R = f;
        d();
        invalidate();
    }

    public void setTextBackgroundRotate(float f) {
        this.T = f;
        d();
        invalidate();
    }

    public void setTextBackgroundZoom(float f) {
        this.S = f;
        d();
        invalidate();
    }

    public void setTextFillColor(int i) {
        this.c = i;
        invalidate();
    }

    public void setTextOutlineColor(int i) {
        this.d = i;
        this.e = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f) {
        this.n = f;
        this.e = true;
        if (Float.isNaN(f)) {
            this.n = 1.0f;
            this.e = false;
        }
        invalidate();
    }

    public void setTextPanX(float f) {
        this.J = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        this.K = f;
        invalidate();
    }

    public void setTextSize(float f) {
        this.j = f;
        if (!Float.isNaN(this.k)) {
            f = this.k;
        }
        this.a.setTextSize(f);
        a(Float.isNaN(this.k) ? 1.0f : this.j / this.k);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f) {
        this.H = f;
        d();
        invalidate();
    }

    public void setTextureWidth(float f) {
        this.I = f;
        d();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        TextPaint textPaint = this.a;
        if (Objects.equals(textPaint.getTypeface(), typeface)) {
            return;
        }
        textPaint.setTypeface(typeface);
    }

    public MotionLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new TextPaint();
        this.b = new Path();
        this.c = 65535;
        this.d = 65535;
        this.e = false;
        this.f = 0.0f;
        this.g = Float.NaN;
        this.j = 48.0f;
        this.k = Float.NaN;
        this.n = 0.0f;
        this.o = "Hello World";
        this.p = true;
        this.q = new Rect();
        this.r = 1;
        this.s = 1;
        this.t = 1;
        this.u = 1;
        this.w = 8388659;
        this.x = 0;
        this.y = false;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.J = 0.0f;
        this.K = 0.0f;
        this.L = new Paint();
        this.M = 0;
        this.Q = Float.NaN;
        this.R = Float.NaN;
        this.S = Float.NaN;
        this.T = Float.NaN;
        b(context, attributeSet);
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new TextPaint();
        this.b = new Path();
        this.c = 65535;
        this.d = 65535;
        this.e = false;
        this.f = 0.0f;
        this.g = Float.NaN;
        this.j = 48.0f;
        this.k = Float.NaN;
        this.n = 0.0f;
        this.o = "Hello World";
        this.p = true;
        this.q = new Rect();
        this.r = 1;
        this.s = 1;
        this.t = 1;
        this.u = 1;
        this.w = 8388659;
        this.x = 0;
        this.y = false;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.J = 0.0f;
        this.K = 0.0f;
        this.L = new Paint();
        this.M = 0;
        this.Q = Float.NaN;
        this.R = Float.NaN;
        this.S = Float.NaN;
        this.T = Float.NaN;
        b(context, attributeSet);
    }
}
