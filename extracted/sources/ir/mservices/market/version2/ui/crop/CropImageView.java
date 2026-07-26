package ir.mservices.market.version2.ui.crop;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.bu6;
import defpackage.dy3;
import defpackage.jl0;
import defpackage.js8;
import defpackage.p71;
import defpackage.q6;
import defpackage.rw7;
import defpackage.v71;
import defpackage.w29;
import defpackage.z94;
import defpackage.zc7;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public class CropImageView extends AppCompatImageView {
    public static final /* synthetic */ int Q0 = 0;
    public zc7 A;
    public boolean A0;
    public final ExecutorService B;
    public boolean B0;
    public final Handler C;
    public boolean C0;
    public Uri D;
    public boolean D0;
    public Uri E;
    public PointF E0;
    public int F;
    public float F0;
    public int G;
    public float G0;
    public int H;
    public int H0;
    public int I;
    public int I0;
    public int J;
    public int J0;
    public boolean K;
    public int K0;
    public boolean L;
    public int L0;
    public Bitmap.CompressFormat M;
    public float M0;
    public int N;
    public boolean N0;
    public int O;
    public int O0;
    public int P;
    public boolean P0;
    public int Q;
    public int R;
    public boolean S;
    public TouchArea T;
    public CropMode U;
    public ShowMode V;
    public ShowMode W;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public boolean j;
    public final Matrix k;
    public final Paint l;
    public final Paint m;
    public final Paint n;
    public final Paint o;
    public RectF p;
    public RectF q;
    public PointF r;
    public float s;
    public float t;
    public boolean u;
    public boolean v;
    public w29 w;
    public Interpolator x;
    public float x0;
    public z94 y;
    public int y0;
    public p71 z;
    public int z0;

    public enum CropMode {
        /* JADX INFO: Fake field, exist only in values array */
        FIT_IMAGE(0),
        /* JADX INFO: Fake field, exist only in values array */
        RATIO_4_3(1),
        /* JADX INFO: Fake field, exist only in values array */
        RATIO_3_4(2),
        SQUARE(3),
        /* JADX INFO: Fake field, exist only in values array */
        RATIO_16_9(4),
        /* JADX INFO: Fake field, exist only in values array */
        RATIO_9_16(5),
        FREE(6),
        CUSTOM(7),
        CIRCLE(8),
        CIRCLE_SQUARE(9);

        public final int a;

        CropMode(int i) {
            this.a = i;
        }
    }

    public enum RotateDegrees {
        ROTATE_90D(90),
        /* JADX INFO: Fake field, exist only in values array */
        ROTATE_180D(180),
        /* JADX INFO: Fake field, exist only in values array */
        ROTATE_270D(270),
        ROTATE_M90D(-90),
        /* JADX INFO: Fake field, exist only in values array */
        ROTATE_M180D(-180),
        /* JADX INFO: Fake field, exist only in values array */
        ROTATE_M270D(-270);

        public final int a;

        RotateDegrees(int i) {
            this.a = i;
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new c();
        public Bitmap.CompressFormat A;
        public int B;
        public boolean C;
        public int D;
        public int E;
        public int F;
        public int G;
        public boolean H;
        public int I;
        public int J;
        public int K;
        public int L;
        public Bitmap a;
        public CropMode b;
        public int c;
        public int d;
        public int e;
        public ShowMode f;
        public ShowMode g;
        public boolean h;
        public boolean i;
        public int j;
        public int k;
        public float l;
        public float m;
        public float n;
        public float o;
        public float p;
        public boolean q;
        public int r;
        public int s;
        public float t;
        public float u;
        public boolean v;
        public int w;
        public int x;
        public Uri y;
        public Uri z;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.a, i);
            parcel.writeSerializable(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeSerializable(this.f);
            parcel.writeSerializable(this.g);
            parcel.writeInt(this.h ? 1 : 0);
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
            parcel.writeFloat(this.l);
            parcel.writeFloat(this.m);
            parcel.writeFloat(this.n);
            parcel.writeFloat(this.o);
            parcel.writeFloat(this.p);
            parcel.writeInt(this.q ? 1 : 0);
            parcel.writeInt(this.r);
            parcel.writeInt(this.s);
            parcel.writeFloat(this.t);
            parcel.writeFloat(this.u);
            parcel.writeInt(this.v ? 1 : 0);
            parcel.writeInt(this.w);
            parcel.writeInt(this.x);
            parcel.writeParcelable(this.y, i);
            parcel.writeParcelable(this.z, i);
            parcel.writeSerializable(this.A);
            parcel.writeInt(this.B);
            parcel.writeInt(this.C ? 1 : 0);
            parcel.writeInt(this.D);
            parcel.writeInt(this.E);
            parcel.writeInt(this.F);
            parcel.writeInt(this.G);
            parcel.writeInt(this.H ? 1 : 0);
            parcel.writeInt(this.I);
            parcel.writeInt(this.J);
            parcel.writeInt(this.K);
            parcel.writeInt(this.L);
        }
    }

    public enum ShowMode {
        SHOW_ALWAYS(1),
        SHOW_ON_TOUCH(2),
        /* JADX INFO: Fake field, exist only in values array */
        NOT_SHOW(3);

        public final int a;

        ShowMode(int i) {
            this.a = i;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TouchArea {
        public static final TouchArea a;
        public static final TouchArea b;
        public static final TouchArea c;
        public static final TouchArea d;
        public static final TouchArea e;
        public static final TouchArea f;
        public static final /* synthetic */ TouchArea[] g;

        static {
            TouchArea touchArea = new TouchArea("OUT_OF_BOUNDS", 0);
            a = touchArea;
            TouchArea touchArea2 = new TouchArea("CENTER", 1);
            b = touchArea2;
            TouchArea touchArea3 = new TouchArea("LEFT_TOP", 2);
            c = touchArea3;
            TouchArea touchArea4 = new TouchArea("RIGHT_TOP", 3);
            d = touchArea4;
            TouchArea touchArea5 = new TouchArea("LEFT_BOTTOM", 4);
            e = touchArea5;
            TouchArea touchArea6 = new TouchArea("RIGHT_BOTTOM", 5);
            f = touchArea6;
            g = new TouchArea[]{touchArea, touchArea2, touchArea3, touchArea4, touchArea5, touchArea6};
        }

        public static TouchArea valueOf(String str) {
            return (TouchArea) Enum.valueOf(TouchArea.class, str);
        }

        public static TouchArea[] values() {
            return (TouchArea[]) g.clone();
        }
    }

    public CropImageView(Context context) {
        this(context, null);
    }

    public static Bitmap c(CropImageView cropImageView) throws Throwable {
        Bitmap bitmap;
        InputStream inputStreamOpenInputStream;
        cropImageView.getClass();
        InputStream inputStream = null;
        bitmapDecodeRegion = null;
        bitmapDecodeRegion = null;
        Bitmap bitmapDecodeRegion = null;
        InputStream inputStream2 = null;
        inputStream = null;
        inputStream = null;
        try {
            try {
                inputStreamOpenInputStream = cropImageView.getContext().getContentResolver().openInputStream(cropImageView.D);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
            bitmap = null;
        } catch (Exception e2) {
            e = e2;
            bitmap = null;
        } catch (OutOfMemoryError e3) {
            e = e3;
            bitmap = null;
        }
        try {
            BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream, false);
            int width = bitmapRegionDecoderNewInstance.getWidth();
            int height = bitmapRegionDecoderNewInstance.getHeight();
            Rect rectG = cropImageView.g(width, height);
            if (cropImageView.g != 0.0f) {
                Matrix matrix = new Matrix();
                matrix.setRotate(-cropImageView.g);
                RectF rectF = new RectF();
                matrix.mapRect(rectF, new RectF(rectG));
                rectF.offset(rectF.left < 0.0f ? width : 0.0f, rectF.top < 0.0f ? height : 0.0f);
                rectG = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            }
            bitmapDecodeRegion = bitmapRegionDecoderNewInstance.decodeRegion(rectG, new BitmapFactory.Options());
            if (cropImageView.g != 0.0f) {
                Bitmap bitmapN = cropImageView.n(bitmapDecodeRegion);
                if (bitmapDecodeRegion != cropImageView.getBitmap() && bitmapDecodeRegion != bitmapN) {
                    bitmapDecodeRegion.recycle();
                }
                bitmapDecodeRegion = bitmapN;
            }
            dy3.m(inputStreamOpenInputStream);
            return bitmapDecodeRegion;
        } catch (IOException e4) {
            e = e4;
            bitmap = bitmapDecodeRegion;
            inputStream = inputStreamOpenInputStream;
            e.getMessage();
            dy3.m(inputStream);
            return bitmap;
        } catch (Exception e5) {
            e = e5;
            bitmap = bitmapDecodeRegion;
            inputStream = inputStreamOpenInputStream;
            e.getMessage();
            dy3.m(inputStream);
            return bitmap;
        } catch (OutOfMemoryError e6) {
            e = e6;
            bitmap = bitmapDecodeRegion;
            inputStream = inputStreamOpenInputStream;
            e.getMessage();
            dy3.m(inputStream);
            return bitmap;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStreamOpenInputStream;
            dy3.m(inputStream2);
            throw th;
        }
    }

    public static Bitmap f(CropImageView cropImageView, Bitmap bitmap) {
        int iRound;
        int i;
        cropImageView.getClass();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float fL = cropImageView.l(cropImageView.p.width()) / cropImageView.m(cropImageView.p.height());
        int iRound2 = cropImageView.I;
        if (iRound2 > 0) {
            iRound = Math.round(iRound2 / fL);
        } else {
            int i2 = cropImageView.J;
            if (i2 > 0) {
                iRound2 = Math.round(i2 * fL);
                iRound = i2;
            } else {
                iRound2 = cropImageView.G;
                if (iRound2 <= 0 || (i = cropImageView.H) <= 0 || (width <= iRound2 && height <= i)) {
                    iRound2 = 0;
                    iRound = 0;
                } else {
                    float f = iRound2;
                    float f2 = i;
                    if (f / f2 >= fL) {
                        iRound2 = Math.round(f2 * fL);
                        iRound = i;
                    } else {
                        iRound = Math.round(f / fL);
                    }
                }
            }
        }
        if (iRound2 <= 0 || iRound <= 0) {
            return bitmap;
        }
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(iRound2 / width2, iRound / height2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width2, height2, matrix, true);
        if (bitmap != cropImageView.getBitmap() && bitmap != bitmapCreateBitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    private rw7 getAnimator() {
        w();
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap getBitmap() {
        Drawable drawable = getDrawable();
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        return null;
    }

    private float getDensity() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    private float getFrameH() {
        RectF rectF = this.p;
        return rectF.bottom - rectF.top;
    }

    private float getFrameW() {
        RectF rectF = this.p;
        return rectF.right - rectF.left;
    }

    private float getRatioX() {
        int iOrdinal = this.U.ordinal();
        if (iOrdinal == 0) {
            return this.q.width();
        }
        if (iOrdinal == 1) {
            return 4.0f;
        }
        if (iOrdinal == 2) {
            return 3.0f;
        }
        if (iOrdinal == 4) {
            return 16.0f;
        }
        if (iOrdinal == 5) {
            return 9.0f;
        }
        if (iOrdinal != 7) {
            return 1.0f;
        }
        return this.E0.x;
    }

    private float getRatioY() {
        int iOrdinal = this.U.ordinal();
        if (iOrdinal == 0) {
            return this.q.height();
        }
        if (iOrdinal == 1) {
            return 3.0f;
        }
        if (iOrdinal == 2) {
            return 4.0f;
        }
        if (iOrdinal == 4) {
            return 9.0f;
        }
        if (iOrdinal == 5) {
            return 16.0f;
        }
        if (iOrdinal != 7) {
            return 1.0f;
        }
        return this.E0.y;
    }

    public static Bitmap k(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        canvas.drawCircle(width, height, Math.min(width, height), paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap;
    }

    private void setCenter(PointF pointF) {
        this.r = pointF;
    }

    private void setScale(float f) {
        this.f = f;
    }

    public final Rect g(int i, int i2) {
        float f = i;
        float f2 = i2;
        float fWidth = (this.g % 180.0f == 0.0f ? f : f2) / this.q.width();
        RectF rectF = this.q;
        float f3 = rectF.left * fWidth;
        float f4 = rectF.top * fWidth;
        int iRound = Math.round((this.p.left * fWidth) - f3);
        int iRound2 = Math.round((this.p.top * fWidth) - f4);
        int iRound3 = Math.round((this.p.right * fWidth) - f3);
        int iRound4 = Math.round((this.p.bottom * fWidth) - f4);
        int iRound5 = Math.round(this.g % 180.0f == 0.0f ? f : f2);
        if (this.g % 180.0f == 0.0f) {
            f = f2;
        }
        return new Rect(Math.max(iRound, 0), Math.max(iRound2, 0), Math.min(iRound3, iRound5), Math.min(iRound4, Math.round(f)));
    }

    public RectF getActualCropRect() {
        RectF rectF = this.q;
        float f = rectF.left;
        float f2 = this.f;
        float f3 = f / f2;
        float f4 = rectF.top / f2;
        RectF rectF2 = this.p;
        return new RectF((rectF2.left / f2) - f3, (rectF2.top / f2) - f4, (rectF2.right / f2) - f3, (rectF2.bottom / f2) - f4);
    }

    public Bitmap getCroppedBitmap() {
        Bitmap bitmap = getBitmap();
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapN = n(bitmap);
        Rect rectG = g(bitmap.getWidth(), bitmap.getHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapN, rectG.left, rectG.top, rectG.width(), rectG.height(), (Matrix) null, false);
        if (bitmapN != bitmapCreateBitmap && bitmapN != bitmap) {
            bitmapN.recycle();
        }
        if (this.U != CropMode.CIRCLE) {
            return bitmapCreateBitmap;
        }
        Bitmap bitmapK = k(bitmapCreateBitmap);
        if (bitmapCreateBitmap != getBitmap()) {
            bitmapCreateBitmap.recycle();
        }
        return bitmapK;
    }

    public Bitmap getImageBitmap() {
        return getBitmap();
    }

    public final RectF h(RectF rectF) {
        float fL = l(rectF.width());
        float fM = m(rectF.height());
        float fWidth = rectF.width() / rectF.height();
        float f = fL / fM;
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.right;
        float f5 = rectF.bottom;
        if (f >= fWidth) {
            float f6 = (f3 + f5) * 0.5f;
            float fWidth2 = (rectF.width() / f) * 0.5f;
            f5 = f6 + fWidth2;
            f3 = f6 - fWidth2;
        } else if (f < fWidth) {
            float f7 = (f2 + f4) * 0.5f;
            float fHeight = rectF.height() * f * 0.5f;
            f4 = f7 + fHeight;
            f2 = f7 - fHeight;
        }
        float f8 = f4 - f2;
        float f9 = f5 - f3;
        float f10 = (f8 / 2.0f) + f2;
        float f11 = (f9 / 2.0f) + f3;
        float f12 = this.M0;
        float f13 = (f8 * f12) / 2.0f;
        float f14 = (f9 * f12) / 2.0f;
        return new RectF(f10 - f13, f11 - f14, f10 + f13, f11 + f14);
    }

    public final float i(float f, int i, int i2) {
        this.h = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        this.i = intrinsicHeight;
        if (this.h <= 0.0f) {
            this.h = i;
        }
        if (intrinsicHeight <= 0.0f) {
            this.i = i2;
        }
        float f2 = i;
        float f3 = i2;
        float f4 = f2 / f3;
        float f5 = this.h;
        float f6 = this.i;
        float f7 = f % 180.0f;
        float f8 = (f7 == 0.0f ? f5 : f6) / (f7 == 0.0f ? f6 : f5);
        if (f8 >= f4) {
            if (f7 != 0.0f) {
                f5 = f6;
            }
            return f2 / f5;
        }
        if (f8 >= f4) {
            return 1.0f;
        }
        if (f7 == 0.0f) {
            f5 = f6;
        }
        return f3 / f5;
    }

    public final void j() {
        RectF rectF = this.p;
        float f = rectF.left;
        RectF rectF2 = this.q;
        float f2 = f - rectF2.left;
        float f3 = rectF.right;
        float f4 = f3 - rectF2.right;
        float f5 = rectF.top;
        float f6 = f5 - rectF2.top;
        float f7 = rectF.bottom;
        float f8 = f7 - rectF2.bottom;
        if (f2 < 0.0f) {
            rectF.left = f - f2;
        }
        if (f4 > 0.0f) {
            rectF.right = f3 - f4;
        }
        if (f6 < 0.0f) {
            rectF.top = f5 - f6;
        }
        if (f8 > 0.0f) {
            rectF.bottom = f7 - f8;
        }
    }

    public final float l(float f) {
        switch (this.U) {
            case FIT_IMAGE:
                return this.q.width();
            case RATIO_4_3:
                return 4.0f;
            case RATIO_3_4:
                return 3.0f;
            case SQUARE:
            case CIRCLE:
            case CIRCLE_SQUARE:
                return 1.0f;
            case RATIO_16_9:
                return 16.0f;
            case RATIO_9_16:
                return 9.0f;
            case FREE:
            default:
                return f;
            case CUSTOM:
                return this.E0.x;
        }
    }

    public final float m(float f) {
        switch (this.U) {
            case FIT_IMAGE:
                return this.q.height();
            case RATIO_4_3:
                return 3.0f;
            case RATIO_3_4:
                return 4.0f;
            case SQUARE:
            case CIRCLE:
            case CIRCLE_SQUARE:
                return 1.0f;
            case RATIO_16_9:
                return 9.0f;
            case RATIO_9_16:
                return 16.0f;
            case FREE:
            default:
                return f;
            case CUSTOM:
                return this.E0.y;
        }
    }

    public final Bitmap n(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.setRotate(this.g, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public final boolean o() {
        return getFrameH() < this.x0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.B.shutdown();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x019f  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r13) {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.version2.ui.crop.CropImageView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getDrawable() != null) {
            x(this.d, this.e);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        this.d = (size - getPaddingLeft()) - getPaddingRight();
        this.e = (size2 - getPaddingTop()) - getPaddingBottom();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.U = savedState.b;
        this.H0 = savedState.c;
        this.I0 = savedState.d;
        this.J0 = savedState.e;
        this.V = savedState.f;
        this.W = savedState.g;
        this.A0 = savedState.h;
        this.B0 = savedState.i;
        this.y0 = savedState.j;
        this.z0 = savedState.k;
        this.x0 = savedState.l;
        this.E0 = new PointF(savedState.m, savedState.n);
        this.F0 = savedState.o;
        this.G0 = savedState.p;
        this.C0 = savedState.q;
        this.K0 = savedState.r;
        this.L0 = savedState.s;
        this.M0 = savedState.t;
        this.g = savedState.u;
        this.N0 = savedState.v;
        this.O0 = savedState.w;
        this.F = savedState.x;
        this.D = savedState.y;
        this.E = savedState.z;
        this.M = savedState.A;
        this.N = savedState.B;
        this.K = savedState.C;
        this.G = savedState.D;
        this.H = savedState.E;
        this.I = savedState.F;
        this.J = savedState.G;
        this.P0 = savedState.H;
        this.O = savedState.I;
        this.P = savedState.J;
        this.Q = savedState.K;
        this.R = savedState.L;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.b = this.U;
        savedState.c = this.H0;
        savedState.d = this.I0;
        savedState.e = this.J0;
        savedState.f = this.V;
        savedState.g = this.W;
        savedState.h = this.A0;
        savedState.i = this.B0;
        savedState.j = this.y0;
        savedState.k = this.z0;
        savedState.l = this.x0;
        PointF pointF = this.E0;
        savedState.m = pointF.x;
        savedState.n = pointF.y;
        savedState.o = this.F0;
        savedState.p = this.G0;
        savedState.q = this.C0;
        savedState.r = this.K0;
        savedState.s = this.L0;
        savedState.t = this.M0;
        savedState.u = this.g;
        savedState.v = this.N0;
        savedState.w = this.O0;
        savedState.x = this.F;
        savedState.y = this.D;
        savedState.z = this.E;
        savedState.A = this.M;
        savedState.B = this.N;
        savedState.C = this.K;
        savedState.D = this.G;
        savedState.E = this.H;
        savedState.F = this.I;
        savedState.G = this.J;
        savedState.H = this.P0;
        savedState.I = this.O;
        savedState.J = this.P;
        savedState.K = this.Q;
        savedState.L = this.R;
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.j && this.C0 && this.D0 && !this.u && !this.v && !this.S && !this.L) {
            int action = motionEvent.getAction();
            ShowMode showMode = ShowMode.SHOW_ON_TOUCH;
            TouchArea touchArea = TouchArea.a;
            if (action == 0) {
                invalidate();
                this.s = motionEvent.getX();
                this.t = motionEvent.getY();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                RectF rectF = this.p;
                float f = rectF.left;
                float f2 = x - f;
                float f3 = rectF.top;
                float f4 = y - f3;
                float f5 = f2 * f2;
                float f6 = f4 * f4;
                float f7 = f6 + f5;
                float f8 = this.y0 + this.z0;
                float f9 = f8 * f8;
                if (f9 >= f7) {
                    this.T = TouchArea.c;
                    if (this.W == showMode) {
                        this.B0 = true;
                    }
                    if (this.V == showMode) {
                        this.A0 = true;
                        return true;
                    }
                } else {
                    float f10 = rectF.right;
                    float f11 = x - f10;
                    float f12 = f11 * f11;
                    if (f9 >= f6 + f12) {
                        this.T = TouchArea.d;
                        if (this.W == showMode) {
                            this.B0 = true;
                        }
                        if (this.V == showMode) {
                            this.A0 = true;
                            return true;
                        }
                    } else {
                        float f13 = rectF.bottom;
                        float f14 = y - f13;
                        float f15 = f14 * f14;
                        if (f9 >= f5 + f15) {
                            this.T = TouchArea.e;
                            if (this.W == showMode) {
                                this.B0 = true;
                            }
                            if (this.V == showMode) {
                                this.A0 = true;
                                return true;
                            }
                        } else {
                            if (f9 < f15 + f12) {
                                if (f > x || f10 < x || f3 > y || f13 < y) {
                                    this.T = touchArea;
                                    return true;
                                }
                                TouchArea touchArea2 = TouchArea.b;
                                this.T = touchArea2;
                                if (this.V == showMode) {
                                    this.A0 = true;
                                }
                                this.T = touchArea2;
                                return true;
                            }
                            this.T = TouchArea.f;
                            if (this.W == showMode) {
                                this.B0 = true;
                            }
                            if (this.V == showMode) {
                                this.A0 = true;
                            }
                        }
                    }
                }
            } else {
                if (action == 1) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    if (this.V == showMode) {
                        this.A0 = false;
                    }
                    if (this.W == showMode) {
                        this.B0 = false;
                    }
                    this.T = touchArea;
                    invalidate();
                    return true;
                }
                if (action == 2) {
                    float x2 = motionEvent.getX() - this.s;
                    float y2 = motionEvent.getY() - this.t;
                    int iOrdinal = this.T.ordinal();
                    if (iOrdinal != 1) {
                        CropMode cropMode = CropMode.FREE;
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                if (iOrdinal != 4) {
                                    if (iOrdinal == 5) {
                                        if (this.U == cropMode) {
                                            RectF rectF2 = this.p;
                                            rectF2.right += x2;
                                            rectF2.bottom += y2;
                                            if (r()) {
                                                this.p.right += this.x0 - getFrameW();
                                            }
                                            if (o()) {
                                                this.p.bottom += this.x0 - getFrameH();
                                            }
                                            j();
                                        } else {
                                            float ratioY = (getRatioY() * x2) / getRatioX();
                                            RectF rectF3 = this.p;
                                            rectF3.right += x2;
                                            rectF3.bottom += ratioY;
                                            if (r()) {
                                                float frameW = this.x0 - getFrameW();
                                                this.p.right += frameW;
                                                this.p.bottom += (frameW * getRatioY()) / getRatioX();
                                            }
                                            if (o()) {
                                                float frameH = this.x0 - getFrameH();
                                                this.p.bottom += frameH;
                                                this.p.right += (frameH * getRatioX()) / getRatioY();
                                            }
                                            if (!p(this.p.right)) {
                                                RectF rectF4 = this.p;
                                                float f16 = rectF4.right;
                                                float f17 = f16 - this.q.right;
                                                rectF4.right = f16 - f17;
                                                this.p.bottom -= (f17 * getRatioY()) / getRatioX();
                                            }
                                            if (!q(this.p.bottom)) {
                                                RectF rectF5 = this.p;
                                                float f18 = rectF5.bottom;
                                                float f19 = f18 - this.q.bottom;
                                                rectF5.bottom = f18 - f19;
                                                this.p.right -= (f19 * getRatioX()) / getRatioY();
                                            }
                                        }
                                    }
                                } else if (this.U == cropMode) {
                                    RectF rectF6 = this.p;
                                    rectF6.left += x2;
                                    rectF6.bottom += y2;
                                    if (r()) {
                                        this.p.left -= this.x0 - getFrameW();
                                    }
                                    if (o()) {
                                        this.p.bottom += this.x0 - getFrameH();
                                    }
                                    j();
                                } else {
                                    float ratioY2 = (getRatioY() * x2) / getRatioX();
                                    RectF rectF7 = this.p;
                                    rectF7.left += x2;
                                    rectF7.bottom -= ratioY2;
                                    if (r()) {
                                        float frameW2 = this.x0 - getFrameW();
                                        this.p.left -= frameW2;
                                        this.p.bottom += (frameW2 * getRatioY()) / getRatioX();
                                    }
                                    if (o()) {
                                        float frameH2 = this.x0 - getFrameH();
                                        this.p.bottom += frameH2;
                                        this.p.left -= (frameH2 * getRatioX()) / getRatioY();
                                    }
                                    if (!p(this.p.left)) {
                                        float f20 = this.q.left;
                                        RectF rectF8 = this.p;
                                        float f21 = rectF8.left;
                                        float f22 = f20 - f21;
                                        rectF8.left = f21 + f22;
                                        this.p.bottom -= (f22 * getRatioY()) / getRatioX();
                                    }
                                    if (!q(this.p.bottom)) {
                                        RectF rectF9 = this.p;
                                        float f23 = rectF9.bottom;
                                        float f24 = f23 - this.q.bottom;
                                        rectF9.bottom = f23 - f24;
                                        this.p.left += (f24 * getRatioX()) / getRatioY();
                                    }
                                }
                            } else if (this.U == cropMode) {
                                RectF rectF10 = this.p;
                                rectF10.right += x2;
                                rectF10.top += y2;
                                if (r()) {
                                    this.p.right += this.x0 - getFrameW();
                                }
                                if (o()) {
                                    this.p.top -= this.x0 - getFrameH();
                                }
                                j();
                            } else {
                                float ratioY3 = (getRatioY() * x2) / getRatioX();
                                RectF rectF11 = this.p;
                                rectF11.right += x2;
                                rectF11.top -= ratioY3;
                                if (r()) {
                                    float frameW3 = this.x0 - getFrameW();
                                    this.p.right += frameW3;
                                    this.p.top -= (frameW3 * getRatioY()) / getRatioX();
                                }
                                if (o()) {
                                    float frameH3 = this.x0 - getFrameH();
                                    this.p.top -= frameH3;
                                    this.p.right += (frameH3 * getRatioX()) / getRatioY();
                                }
                                if (!p(this.p.right)) {
                                    RectF rectF12 = this.p;
                                    float f25 = rectF12.right;
                                    float f26 = f25 - this.q.right;
                                    rectF12.right = f25 - f26;
                                    this.p.top += (f26 * getRatioY()) / getRatioX();
                                }
                                if (!q(this.p.top)) {
                                    float f27 = this.q.top;
                                    RectF rectF13 = this.p;
                                    float f28 = rectF13.top;
                                    float f29 = f27 - f28;
                                    rectF13.top = f28 + f29;
                                    this.p.right -= (f29 * getRatioX()) / getRatioY();
                                }
                            }
                        } else if (this.U == cropMode) {
                            RectF rectF14 = this.p;
                            rectF14.left += x2;
                            rectF14.top += y2;
                            if (r()) {
                                this.p.left -= this.x0 - getFrameW();
                            }
                            if (o()) {
                                this.p.top -= this.x0 - getFrameH();
                            }
                            j();
                        } else {
                            float ratioY4 = (getRatioY() * x2) / getRatioX();
                            RectF rectF15 = this.p;
                            rectF15.left += x2;
                            rectF15.top += ratioY4;
                            if (r()) {
                                float frameW4 = this.x0 - getFrameW();
                                this.p.left -= frameW4;
                                this.p.top -= (frameW4 * getRatioY()) / getRatioX();
                            }
                            if (o()) {
                                float frameH4 = this.x0 - getFrameH();
                                this.p.top -= frameH4;
                                this.p.left -= (frameH4 * getRatioX()) / getRatioY();
                            }
                            if (!p(this.p.left)) {
                                float f30 = this.q.left;
                                RectF rectF16 = this.p;
                                float f31 = rectF16.left;
                                float f32 = f30 - f31;
                                rectF16.left = f31 + f32;
                                this.p.top += (f32 * getRatioY()) / getRatioX();
                            }
                            if (!q(this.p.top)) {
                                float f33 = this.q.top;
                                RectF rectF17 = this.p;
                                float f34 = rectF17.top;
                                float f35 = f33 - f34;
                                rectF17.top = f34 + f35;
                                this.p.left += (f35 * getRatioX()) / getRatioY();
                            }
                        }
                    } else {
                        RectF rectF18 = this.p;
                        float f36 = rectF18.left + x2;
                        rectF18.left = f36;
                        float f37 = rectF18.right + x2;
                        rectF18.right = f37;
                        float f38 = rectF18.top + y2;
                        rectF18.top = f38;
                        float f39 = rectF18.bottom + y2;
                        rectF18.bottom = f39;
                        RectF rectF19 = this.q;
                        float f40 = f36 - rectF19.left;
                        if (f40 < 0.0f) {
                            rectF18.left = f36 - f40;
                            rectF18.right = f37 - f40;
                        }
                        float f41 = rectF18.right;
                        float f42 = f41 - rectF19.right;
                        if (f42 > 0.0f) {
                            rectF18.left -= f42;
                            rectF18.right = f41 - f42;
                        }
                        float f43 = f38 - rectF19.top;
                        if (f43 < 0.0f) {
                            rectF18.top = f38 - f43;
                            rectF18.bottom = f39 - f43;
                        }
                        float f44 = rectF18.bottom;
                        float f45 = f44 - rectF19.bottom;
                        if (f45 > 0.0f) {
                            rectF18.top -= f45;
                            rectF18.bottom = f44 - f45;
                        }
                    }
                    invalidate();
                    this.s = motionEvent.getX();
                    this.t = motionEvent.getY();
                    if (this.T != touchArea) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                } else if (action == 3) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.T = touchArea;
                    invalidate();
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean p(float f) {
        RectF rectF = this.q;
        return rectF.left <= f && rectF.right >= f;
    }

    public final boolean q(float f) {
        RectF rectF = this.q;
        return rectF.top <= f && rectF.bottom >= f;
    }

    public final boolean r() {
        return getFrameW() < this.x0;
    }

    public final void s(jl0 jl0Var) {
        if (jl0Var == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            jl0Var.b();
        } else {
            this.C.post(new q6(5, jl0Var));
        }
    }

    public void setAnimationDuration(int i) {
        this.O0 = i;
    }

    public void setAnimationEnabled(boolean z) {
        this.N0 = z;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.H0 = i;
        invalidate();
    }

    public void setCompressFormat(Bitmap.CompressFormat compressFormat) {
        this.M = compressFormat;
    }

    public void setCompressQuality(int i) {
        this.N = i;
    }

    public void setCropCallback(p71 p71Var) {
        this.z = p71Var;
    }

    public void setCropEnabled(boolean z) {
        this.C0 = z;
        invalidate();
    }

    public void setCropMode(CropMode cropMode, int i) {
        if (cropMode == CropMode.CUSTOM) {
            setCustomRatio(1, 1);
        } else {
            this.U = cropMode;
            t(i);
        }
    }

    public void setCustomRatio(int i, int i2, int i3) {
        if (i == 0 || i2 == 0) {
            return;
        }
        this.U = CropMode.CUSTOM;
        this.E0 = new PointF(i, i2);
        t(i3);
    }

    public void setDebug(boolean z) {
        this.K = z;
        invalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.D0 = z;
    }

    public void setFrameColor(int i) {
        this.J0 = i;
        invalidate();
    }

    public void setFrameStrokeWeightInDp(int i) {
        this.F0 = i * getDensity();
        invalidate();
    }

    public void setGuideColor(int i) {
        this.L0 = i;
        invalidate();
    }

    public void setGuideShowMode(ShowMode showMode) {
        this.V = showMode;
        int iOrdinal = showMode.ordinal();
        if (iOrdinal == 0) {
            this.A0 = true;
        } else if (iOrdinal == 1 || iOrdinal == 2) {
            this.A0 = false;
        }
        invalidate();
    }

    public void setGuideStrokeWeightInDp(int i) {
        this.G0 = i * getDensity();
        invalidate();
    }

    public void setHandleColor(int i) {
        this.K0 = i;
        invalidate();
    }

    public void setHandleShadowEnabled(boolean z) {
        this.P0 = z;
    }

    public void setHandleShowMode(ShowMode showMode) {
        this.W = showMode;
        int iOrdinal = showMode.ordinal();
        if (iOrdinal == 0) {
            this.B0 = true;
        } else if (iOrdinal == 1 || iOrdinal == 2) {
            this.B0 = false;
        }
        invalidate();
    }

    public void setHandleSizeInDp(int i) {
        this.y0 = (int) (i * getDensity());
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.j = false;
        super.setImageDrawable(drawable);
        y();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.j = false;
        super.setImageResource(i);
        y();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        this.j = false;
        super.setImageURI(uri);
        y();
    }

    public void setInitialFrameScale(float f) {
        if (f < 0.01f || f > 1.0f) {
            f = 1.0f;
        }
        this.M0 = f;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.x = interpolator;
        this.w = null;
        w();
    }

    public void setLoadCallback(z94 z94Var) {
        this.y = z94Var;
    }

    public void setMinFrameSizeInDp(int i) {
        this.x0 = i * getDensity();
    }

    public void setMinFrameSizeInPx(int i) {
        this.x0 = i;
    }

    public void setOutputHeight(int i) {
        this.J = i;
        this.I = 0;
    }

    public void setOutputMaxSize(int i, int i2) {
        this.G = i;
        this.H = i2;
    }

    public void setOutputWidth(int i) {
        this.I = i;
        this.J = 0;
    }

    public void setOverlayColor(int i) {
        this.I0 = i;
        invalidate();
    }

    public void setSaveCallback(zc7 zc7Var) {
        this.A = zc7Var;
    }

    public void setTouchPaddingInDp(int i) {
        this.z0 = (int) (i * getDensity());
    }

    public final void t(int i) {
        if (this.q == null) {
            return;
        }
        if (this.v) {
            ((w29) getAnimator()).a.cancel();
        }
        RectF rectF = new RectF(this.p);
        RectF rectFH = h(this.q);
        float f = rectFH.left - rectF.left;
        float f2 = rectFH.top - rectF.top;
        float f3 = rectFH.right - rectF.right;
        float f4 = rectFH.bottom - rectF.bottom;
        if (!this.N0) {
            this.p = h(this.q);
            invalidate();
            return;
        }
        w29 w29Var = (w29) getAnimator();
        w29Var.b = new v71(this, rectF, f, f2, f3, f4, rectFH);
        long j = i;
        ValueAnimator valueAnimator = w29Var.a;
        if (j >= 0) {
            valueAnimator.setDuration(j);
        } else {
            valueAnimator.setDuration(150L);
        }
        valueAnimator.start();
    }

    public final void u(RotateDegrees rotateDegrees) {
        int i = this.O0;
        if (this.u) {
            ((w29) getAnimator()).a.cancel();
        }
        float f = this.g;
        float f2 = f + rotateDegrees.a;
        float f3 = f2 - f;
        float f4 = this.f;
        float fI = i(f2, this.d, this.e);
        if (!this.N0) {
            this.g = f2 % 360.0f;
            this.f = fI;
            x(this.d, this.e);
            return;
        }
        w29 w29Var = (w29) getAnimator();
        w29Var.b = new a(this, f, f3, f4, fI - f4, f2, fI);
        long j = i;
        ValueAnimator valueAnimator = w29Var.a;
        if (j >= 0) {
            valueAnimator.setDuration(j);
        } else {
            valueAnimator.setDuration(150L);
        }
        valueAnimator.start();
    }

    public final void v() {
        Matrix matrix = this.k;
        matrix.reset();
        PointF pointF = this.r;
        matrix.setTranslate(pointF.x - (this.h * 0.5f), pointF.y - (this.i * 0.5f));
        float f = this.f;
        PointF pointF2 = this.r;
        matrix.postScale(f, f, pointF2.x, pointF2.y);
        float f2 = this.g;
        PointF pointF3 = this.r;
        matrix.postRotate(f2, pointF3.x, pointF3.y);
    }

    public final void w() {
        if (this.w == null) {
            Interpolator interpolator = this.x;
            w29 w29Var = new w29();
            w29Var.b = new js8();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            w29Var.a = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addListener(w29Var);
            valueAnimatorOfFloat.addUpdateListener(w29Var);
            valueAnimatorOfFloat.setInterpolator(interpolator);
            this.w = w29Var;
        }
    }

    public final void x(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return;
        }
        setCenter(new PointF((i * 0.5f) + getPaddingLeft(), (i2 * 0.5f) + getPaddingTop()));
        setScale(i(this.g, i, i2));
        v();
        RectF rectF = new RectF(0.0f, 0.0f, this.h, this.i);
        RectF rectF2 = new RectF();
        this.k.mapRect(rectF2, rectF);
        this.q = rectF2;
        this.p = h(rectF2);
        this.j = true;
        invalidate();
    }

    public final void y() {
        if (!this.S) {
            this.D = null;
            this.E = null;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.g = this.F;
        }
        if (getDrawable() != null) {
            x(this.d, this.e);
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 0;
        this.e = 0;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = false;
        this.k = null;
        this.r = new PointF();
        this.u = false;
        this.v = false;
        this.w = null;
        this.x = new DecelerateInterpolator();
        this.y = null;
        this.z = null;
        this.A = null;
        this.C = new Handler(Looper.getMainLooper());
        this.D = null;
        this.E = null;
        this.F = 0;
        this.I = 0;
        this.J = 0;
        this.K = false;
        this.L = false;
        this.M = Bitmap.CompressFormat.PNG;
        this.N = 100;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = false;
        this.T = TouchArea.a;
        CropMode cropMode = CropMode.SQUARE;
        this.U = cropMode;
        ShowMode showMode = ShowMode.SHOW_ALWAYS;
        this.V = showMode;
        this.W = showMode;
        this.z0 = 0;
        this.A0 = true;
        this.B0 = true;
        this.C0 = true;
        this.D0 = true;
        this.E0 = new PointF(1.0f, 1.0f);
        this.F0 = 2.0f;
        this.G0 = 2.0f;
        this.N0 = true;
        this.O0 = 100;
        this.P0 = true;
        this.B = Executors.newSingleThreadExecutor();
        float density = getDensity();
        int i2 = (int) (14.0f * density);
        this.y0 = i2;
        this.x0 = 50.0f * density;
        float f = density * 1.0f;
        this.F0 = f;
        this.G0 = f;
        this.m = new Paint();
        this.l = new Paint();
        Paint paint = new Paint();
        this.n = paint;
        paint.setFilterBitmap(true);
        Paint paint2 = new Paint();
        this.o = paint2;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint2.setTextSize(density * 15.0f);
        this.k = new Matrix();
        this.f = 1.0f;
        this.H0 = 0;
        this.J0 = -1;
        this.I0 = -1157627904;
        this.K0 = -1;
        this.L0 = -1140850689;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bu6.scv_CropImageView, i, 0);
        this.U = cropMode;
        try {
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(bu6.scv_CropImageView_scv_img_src);
                if (drawable != null) {
                    setImageDrawable(drawable);
                }
                CropMode[] cropModeArrValues = CropMode.values();
                int length = cropModeArrValues.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    CropMode cropMode2 = cropModeArrValues[i3];
                    if (typedArrayObtainStyledAttributes.getInt(bu6.scv_CropImageView_scv_crop_mode, 3) == cropMode2.a) {
                        this.U = cropMode2;
                        break;
                    }
                    i3++;
                }
                this.H0 = typedArrayObtainStyledAttributes.getColor(bu6.scv_CropImageView_scv_background_color, 0);
                this.I0 = typedArrayObtainStyledAttributes.getColor(bu6.scv_CropImageView_scv_overlay_color, -1157627904);
                this.J0 = typedArrayObtainStyledAttributes.getColor(bu6.scv_CropImageView_scv_frame_color, -1);
                this.K0 = typedArrayObtainStyledAttributes.getColor(bu6.scv_CropImageView_scv_handle_color, -1);
                this.L0 = typedArrayObtainStyledAttributes.getColor(bu6.scv_CropImageView_scv_guide_color, -1140850689);
                ShowMode[] showModeArrValues = ShowMode.values();
                int length2 = showModeArrValues.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        break;
                    }
                    ShowMode showMode2 = showModeArrValues[i4];
                    if (typedArrayObtainStyledAttributes.getInt(bu6.scv_CropImageView_scv_guide_show_mode, 1) == showMode2.a) {
                        this.V = showMode2;
                        break;
                    }
                    i4++;
                }
                ShowMode[] showModeArrValues2 = ShowMode.values();
                int length3 = showModeArrValues2.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length3) {
                        break;
                    }
                    ShowMode showMode3 = showModeArrValues2[i5];
                    if (typedArrayObtainStyledAttributes.getInt(bu6.scv_CropImageView_scv_handle_show_mode, 1) == showMode3.a) {
                        this.W = showMode3;
                        break;
                    }
                    i5++;
                }
                setGuideShowMode(this.V);
                setHandleShowMode(this.W);
                this.y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(bu6.scv_CropImageView_scv_handle_size, i2);
                this.z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(bu6.scv_CropImageView_scv_touch_padding, 0);
                this.x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(bu6.scv_CropImageView_scv_min_frame_size, (int) r8);
                int i6 = (int) f;
                this.F0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(bu6.scv_CropImageView_scv_frame_stroke_weight, i6);
                this.G0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(bu6.scv_CropImageView_scv_guide_stroke_weight, i6);
                this.C0 = typedArrayObtainStyledAttributes.getBoolean(bu6.scv_CropImageView_scv_crop_enabled, true);
                float f2 = 1.0f;
                float f3 = typedArrayObtainStyledAttributes.getFloat(bu6.scv_CropImageView_scv_initial_frame_scale, 1.0f);
                if (f3 >= 0.01f && f3 <= 1.0f) {
                    f2 = f3;
                }
                this.M0 = f2;
                this.N0 = typedArrayObtainStyledAttributes.getBoolean(bu6.scv_CropImageView_scv_animation_enabled, true);
                this.O0 = typedArrayObtainStyledAttributes.getInt(bu6.scv_CropImageView_scv_animation_duration, 100);
                this.P0 = typedArrayObtainStyledAttributes.getBoolean(bu6.scv_CropImageView_scv_handle_shadow_enabled, true);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Exception e) {
                e.printStackTrace();
                typedArrayObtainStyledAttributes.recycle();
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setCustomRatio(int i, int i2) {
        setCustomRatio(i, i2, this.O0);
    }

    public void setCropMode(CropMode cropMode) {
        setCropMode(cropMode, this.O0);
    }
}
