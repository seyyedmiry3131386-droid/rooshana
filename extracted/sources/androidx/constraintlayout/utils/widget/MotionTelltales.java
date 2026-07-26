package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import defpackage.dm0;
import defpackage.e89;
import defpackage.eu6;
import defpackage.f99;
import defpackage.ly4;
import defpackage.o40;
import defpackage.qy4;
import defpackage.wu;
import defpackage.wy4;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class MotionTelltales extends MockView {
    public final Paint l;
    public MotionLayout m;
    public final float[] n;
    public final Matrix o;
    public int p;
    public int q;
    public float r;

    public MotionTelltales(Context context) {
        super(context);
        this.l = new Paint();
        this.n = new float[2];
        this.o = new Matrix();
        this.p = 0;
        this.q = -65281;
        this.r = 0.25f;
        b(context, null);
    }

    public final void b(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eu6.MotionTelltales);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == eu6.MotionTelltales_telltales_tailColor) {
                    this.q = typedArrayObtainStyledAttributes.getColor(index, this.q);
                } else if (index == eu6.MotionTelltales_telltales_velocityMode) {
                    this.p = typedArrayObtainStyledAttributes.getInt(index, this.p);
                } else if (index == eu6.MotionTelltales_telltales_tailScale) {
                    this.r = typedArrayObtainStyledAttributes.getFloat(index, this.r);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        int i2 = this.q;
        Paint paint = this.l;
        paint.setColor(i2);
        paint.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        Matrix matrix;
        int i2;
        float f;
        float[] fArr;
        int i3;
        int i4;
        int i5;
        char c;
        e89 e89Var;
        e89 e89Var2;
        f99 f99Var;
        e89 e89Var3;
        e89 e89Var4;
        e89 e89Var5;
        double[] dArr;
        dm0 dm0Var;
        MotionTelltales motionTelltales = this;
        super.onDraw(canvas);
        Matrix matrix2 = motionTelltales.getMatrix();
        Matrix matrix3 = motionTelltales.o;
        matrix2.invert(matrix3);
        if (motionTelltales.m == null) {
            ViewParent parent = motionTelltales.getParent();
            if (parent instanceof MotionLayout) {
                motionTelltales.m = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = motionTelltales.getWidth();
        int height = motionTelltales.getHeight();
        int i6 = 5;
        float[] fArr2 = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        int i7 = 0;
        while (i7 < i6) {
            float f2 = fArr2[i7];
            int i8 = 0;
            while (i8 < i6) {
                float f3 = fArr2[i8];
                MotionLayout motionLayout = motionTelltales.m;
                int i9 = motionTelltales.p;
                float fA = motionLayout.t;
                float f4 = motionLayout.E;
                if (motionLayout.r != null) {
                    float fSignum = Math.signum(motionLayout.G - f4);
                    float interpolation = motionLayout.r.getInterpolation(motionLayout.E + 1.0E-5f);
                    float interpolation2 = motionLayout.r.getInterpolation(motionLayout.E);
                    fA = (((interpolation - interpolation2) / 1.0E-5f) * fSignum) / motionLayout.C;
                    f4 = interpolation2;
                }
                qy4 qy4Var = motionLayout.r;
                if (o40.O(qy4Var)) {
                    fA = qy4Var.a();
                }
                float f5 = fA;
                ly4 ly4Var = (ly4) motionLayout.A.get(motionTelltales);
                int i10 = i9 & 1;
                float[] fArr3 = motionTelltales.n;
                if (i10 == 0) {
                    int width2 = motionTelltales.getWidth();
                    int height2 = motionTelltales.getHeight();
                    float[] fArr4 = ly4Var.v;
                    c = 0;
                    wy4 wy4Var = ly4Var.f;
                    float fB = ly4Var.b(f4, fArr4);
                    f = f5;
                    HashMap map = ly4Var.y;
                    fArr = fArr2;
                    f99 f99Var2 = map == null ? null : (f99) map.get("translationX");
                    i3 = i7;
                    HashMap map2 = ly4Var.y;
                    f99 f99Var3 = map2 == null ? null : (f99) map2.get("translationY");
                    float f6 = f2;
                    HashMap map3 = ly4Var.y;
                    f99 f99Var4 = map3 == null ? null : (f99) map3.get("rotation");
                    i4 = i8;
                    HashMap map4 = ly4Var.y;
                    i2 = height;
                    f99 f99Var5 = map4 == null ? null : (f99) map4.get("scaleX");
                    i = width;
                    HashMap map5 = ly4Var.y;
                    matrix = matrix3;
                    f99 f99Var6 = map5 == null ? null : (f99) map5.get("scaleY");
                    HashMap map6 = ly4Var.z;
                    e89 e89Var6 = map6 == null ? null : (e89) map6.get("translationX");
                    HashMap map7 = ly4Var.z;
                    e89 e89Var7 = map7 == null ? null : (e89) map7.get("translationY");
                    HashMap map8 = ly4Var.z;
                    e89 e89Var8 = map8 == null ? null : (e89) map8.get("rotation");
                    HashMap map9 = ly4Var.z;
                    e89 e89Var9 = map9 == null ? null : (e89) map9.get("scaleX");
                    HashMap map10 = ly4Var.z;
                    e89 e89Var10 = map10 != null ? (e89) map10.get("scaleY") : null;
                    dm0 dm0Var2 = new dm0();
                    i5 = i9;
                    dm0Var2.e = 0.0f;
                    dm0Var2.d = 0.0f;
                    dm0Var2.c = 0.0f;
                    dm0Var2.b = 0.0f;
                    dm0Var2.a = 0.0f;
                    if (f99Var4 != null) {
                        e89Var = e89Var10;
                        e89Var2 = e89Var9;
                        dm0Var2.e = (float) f99Var4.a.B(fB);
                        dm0Var2.f = f99Var4.a(fB);
                    } else {
                        e89Var = e89Var10;
                        e89Var2 = e89Var9;
                    }
                    if (f99Var2 != null) {
                        f99Var = f99Var2;
                        dm0Var2.c = (float) f99Var2.a.B(fB);
                    } else {
                        f99Var = f99Var2;
                    }
                    if (f99Var3 != null) {
                        dm0Var2.d = (float) f99Var3.a.B(fB);
                    }
                    if (f99Var5 != null) {
                        dm0Var2.a = (float) f99Var5.a.B(fB);
                    }
                    if (f99Var6 != null) {
                        dm0Var2.b = (float) f99Var6.a.B(fB);
                    }
                    if (e89Var8 != null) {
                        dm0Var2.e = e89Var8.b(fB);
                    }
                    if (e89Var6 != null) {
                        dm0Var2.c = e89Var6.b(fB);
                    }
                    if (e89Var7 != null) {
                        dm0Var2.d = e89Var7.b(fB);
                    }
                    e89 e89Var11 = e89Var2;
                    if (e89Var2 != null) {
                        dm0Var2.a = e89Var11.b(fB);
                    }
                    if (e89Var != null) {
                        e89Var3 = e89Var;
                        dm0Var2.b = e89Var3.b(fB);
                    } else {
                        e89Var3 = e89Var;
                    }
                    wu wuVar = ly4Var.k;
                    if (wuVar != null) {
                        double[] dArr2 = ly4Var.p;
                        if (dArr2.length > 0) {
                            double d = fB;
                            wuVar.x(d, dArr2);
                            ly4Var.k.C(d, ly4Var.q);
                            int[] iArr = ly4Var.o;
                            double[] dArr3 = ly4Var.q;
                            double[] dArr4 = ly4Var.p;
                            wy4Var.getClass();
                            wy4.e(f3, f6, fArr3, iArr, dArr3, dArr4);
                            fArr3 = fArr3;
                            f2 = f6;
                            f3 = f3;
                            dm0Var = dm0Var2;
                        } else {
                            dm0Var = dm0Var2;
                            f3 = f3;
                            f2 = f6;
                            fArr3 = fArr3;
                        }
                        dm0Var.a(f3, f2, width2, height2, fArr3);
                    } else {
                        fArr3 = fArr3;
                        if (ly4Var.j != null) {
                            double dB = ly4Var.b(fB, fArr4);
                            ly4Var.j[0].C(dB, ly4Var.q);
                            ly4Var.j[0].x(dB, ly4Var.p);
                            float f7 = fArr4[0];
                            int i11 = 0;
                            while (true) {
                                dArr = ly4Var.q;
                                if (i11 >= dArr.length) {
                                    break;
                                }
                                dArr[i11] = dArr[i11] * ((double) f7);
                                i11++;
                            }
                            int[] iArr2 = ly4Var.o;
                            double[] dArr5 = ly4Var.p;
                            wy4Var.getClass();
                            wy4.e(f3, f6, fArr3, iArr2, dArr, dArr5);
                            fArr3 = fArr3;
                            f2 = f6;
                            f3 = f3;
                            dm0Var2.a(f3, f2, width2, height2, fArr3);
                        } else {
                            wy4 wy4Var2 = ly4Var.g;
                            float f8 = wy4Var2.e - wy4Var.e;
                            float f9 = wy4Var2.f - wy4Var.f;
                            float f10 = wy4Var2.g - wy4Var.g;
                            float f11 = f9 + (wy4Var2.h - wy4Var.h);
                            fArr3[0] = ((f8 + f10) * f3) + ((1.0f - f3) * f8);
                            fArr3[1] = (f11 * f6) + ((1.0f - f6) * f9);
                            dm0Var2.e = 0.0f;
                            dm0Var2.d = 0.0f;
                            dm0Var2.c = 0.0f;
                            dm0Var2.b = 0.0f;
                            dm0Var2.a = 0.0f;
                            if (f99Var4 != null) {
                                e89Var4 = e89Var3;
                                e89Var5 = e89Var11;
                                dm0Var2.e = (float) f99Var4.a.B(fB);
                                dm0Var2.f = f99Var4.a(fB);
                            } else {
                                e89Var4 = e89Var3;
                                e89Var5 = e89Var11;
                            }
                            if (f99Var != null) {
                                dm0Var2.c = (float) f99Var.a.B(fB);
                            }
                            if (f99Var3 != null) {
                                dm0Var2.d = (float) f99Var3.a.B(fB);
                            }
                            if (f99Var5 != null) {
                                dm0Var2.a = (float) f99Var5.a.B(fB);
                            }
                            if (f99Var6 != null) {
                                dm0Var2.b = (float) f99Var6.a.B(fB);
                            }
                            if (e89Var8 != null) {
                                dm0Var2.e = e89Var8.b(fB);
                            }
                            if (e89Var6 != null) {
                                dm0Var2.c = e89Var6.b(fB);
                            }
                            if (e89Var7 != null) {
                                dm0Var2.d = e89Var7.b(fB);
                            }
                            if (e89Var5 != null) {
                                dm0Var2.a = e89Var5.b(fB);
                            }
                            if (e89Var4 != null) {
                                dm0Var2.b = e89Var4.b(fB);
                            }
                            f3 = f3;
                            f2 = f6;
                            dm0Var2.a(f3, f2, width2, height2, fArr3);
                        }
                    }
                } else {
                    i = width;
                    matrix = matrix3;
                    i2 = height;
                    f = f5;
                    fArr = fArr2;
                    i3 = i7;
                    i4 = i8;
                    i5 = i9;
                    c = 0;
                    ly4Var.d(f4, f3, f2, fArr3);
                }
                if (i5 < 2) {
                    fArr3[c] = fArr3[c] * f;
                    fArr3[1] = fArr3[1] * f;
                }
                motionTelltales = this;
                float[] fArr5 = motionTelltales.n;
                matrix3 = matrix;
                matrix3.mapVectors(fArr5);
                int i12 = i;
                float f12 = i12 * f3;
                int i13 = i2;
                float f13 = i13 * f2;
                float f14 = fArr5[c];
                float f15 = motionTelltales.r;
                float f16 = f13 - (fArr5[1] * f15);
                matrix3.mapVectors(fArr5);
                canvas.drawLine(f12, f13, f12 - (f14 * f15), f16, motionTelltales.l);
                i8 = i4 + 1;
                width = i12;
                height = i13;
                fArr2 = fArr;
                i7 = i3;
                i6 = 5;
            }
            i7++;
            height = height;
            i6 = 5;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = new Paint();
        this.n = new float[2];
        this.o = new Matrix();
        this.p = 0;
        this.q = -65281;
        this.r = 0.25f;
        b(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = new Paint();
        this.n = new float[2];
        this.o = new Matrix();
        this.p = 0;
        this.q = -65281;
        this.r = 0.25f;
        b(context, attributeSet);
    }
}
