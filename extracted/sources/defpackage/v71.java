package defpackage;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RectF;
import android.widget.ImageView;
import ir.mservices.market.version2.ui.crop.CropImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class v71 implements sw7 {
    public float a;
    public float b;
    public float c;
    public float d;
    public final Object e;
    public final Object f;
    public final Object g;

    public v71() {
        this.e = new float[20];
        this.f = new ColorMatrix();
        this.g = new ColorMatrix();
        this.a = 1.0f;
        this.b = 1.0f;
        this.c = 1.0f;
        this.d = 1.0f;
    }

    @Override // defpackage.sw7
    public void a() {
        CropImageView cropImageView = (CropImageView) this.g;
        cropImageView.p = (RectF) this.f;
        cropImageView.invalidate();
        cropImageView.v = false;
    }

    public void b(ImageView imageView) {
        boolean z;
        float f;
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        float f2;
        char c7;
        float fLog;
        float fPow;
        char c8;
        float f3;
        float fLog2;
        float[] fArr = (float[]) this.e;
        ColorMatrix colorMatrix = (ColorMatrix) this.g;
        ColorMatrix colorMatrix2 = (ColorMatrix) this.f;
        colorMatrix2.reset();
        float f4 = this.b;
        boolean z2 = true;
        if (f4 != 1.0f) {
            float f5 = 1.0f - f4;
            float f6 = 0.2999f * f5;
            float f7 = 0.587f * f5;
            float f8 = f5 * 0.114f;
            fArr[0] = f6 + f4;
            fArr[1] = f7;
            fArr[2] = f8;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f6;
            fArr[6] = f7 + f4;
            fArr[7] = f8;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f6;
            fArr[11] = f7;
            fArr[12] = f8 + f4;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
            colorMatrix2.set(fArr);
            z = true;
        } else {
            z = false;
        }
        float f9 = this.c;
        if (f9 != 1.0f) {
            colorMatrix.setScale(f9, f9, f9, 1.0f);
            colorMatrix2.postConcat(colorMatrix);
            z = true;
        }
        float f10 = this.d;
        if (f10 != 1.0f) {
            if (f10 <= 0.0f) {
                f10 = 0.01f;
            }
            float f11 = (5000.0f / f10) / 100.0f;
            f = 1.0f;
            if (f11 > 66.0f) {
                f2 = 66.0f;
                c = 18;
                c2 = 17;
                double d = f11 - 60.0f;
                c3 = 16;
                c4 = 15;
                fPow = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                c7 = 14;
                c6 = '\r';
                fLog = ((float) Math.pow(d, 0.07551485300064087d)) * 288.12216f;
            } else {
                f2 = 66.0f;
                c = 18;
                c2 = 17;
                c3 = 16;
                c4 = 15;
                c7 = 14;
                c6 = '\r';
                fLog = (((float) Math.log(f11)) * 99.4708f) - 161.11957f;
                fPow = 255.0f;
            }
            if (f11 >= f2) {
                c8 = c7;
                f3 = 305.0448f;
                fLog2 = 255.0f;
            } else if (f11 > 19.0f) {
                c8 = c7;
                f3 = 305.0448f;
                fLog2 = (((float) Math.log(f11 - 10.0f)) * 138.51773f) - 305.0448f;
            } else {
                c8 = c7;
                f3 = 305.0448f;
                fLog2 = 0.0f;
            }
            float fMin = Math.min(255.0f, Math.max(fPow, 0.0f));
            float fMin2 = Math.min(255.0f, Math.max(fLog, 0.0f));
            float fMin3 = Math.min(255.0f, Math.max(fLog2, 0.0f));
            float fLog3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            c5 = c8;
            float fLog4 = (((float) Math.log(40.0f)) * 138.51773f) - f3;
            float fMin4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float fMin5 = Math.min(255.0f, Math.max(fLog3, 0.0f));
            float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, 0.0f));
            fArr[0] = fMin / fMin4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fMin2 / fMin5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = fMin6;
            fArr[c6] = 0.0f;
            fArr[c5] = 0.0f;
            fArr[c4] = 0.0f;
            fArr[c3] = 0.0f;
            fArr[c2] = 0.0f;
            fArr[c] = 1.0f;
            fArr[19] = 0.0f;
            colorMatrix.set(fArr);
            colorMatrix2.postConcat(colorMatrix);
            z = true;
        } else {
            f = 1.0f;
            c = 18;
            c2 = 17;
            c3 = 16;
            c4 = 15;
            c5 = 14;
            c6 = '\r';
        }
        float f12 = this.a;
        if (f12 != f) {
            fArr[0] = f12;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f12;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f12;
            fArr[c6] = 0.0f;
            fArr[c5] = 0.0f;
            fArr[c4] = 0.0f;
            fArr[c3] = 0.0f;
            fArr[c2] = 0.0f;
            fArr[c] = f;
            fArr[19] = 0.0f;
            colorMatrix.set(fArr);
            colorMatrix2.postConcat(colorMatrix);
        } else {
            z2 = z;
        }
        if (z2) {
            imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        } else {
            imageView.clearColorFilter();
        }
    }

    @Override // defpackage.sw7
    public void c() {
        ((CropImageView) this.g).v = true;
    }

    @Override // defpackage.sw7
    public void e(float f) {
        CropImageView cropImageView = (CropImageView) this.g;
        RectF rectF = (RectF) this.e;
        cropImageView.p = new RectF((this.a * f) + rectF.left, (this.b * f) + rectF.top, (this.c * f) + rectF.right, (this.d * f) + rectF.bottom);
        cropImageView.invalidate();
    }

    public v71(CropImageView cropImageView, RectF rectF, float f, float f2, float f3, float f4, RectF rectF2) {
        this.g = cropImageView;
        this.e = rectF;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.f = rectF2;
    }
}
