package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public final class hr0 extends rc0 {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(sx3.a);

    @Override // defpackage.sx3
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.rc0
    public final Bitmap c(pc0 pc0Var, Bitmap bitmap, int i, int i2) {
        Paint paint = qq8.a;
        int iMin = Math.min(i, i2);
        float f = iMin;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f / width, f / height);
        float f3 = width * fMax;
        float f4 = fMax * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap bitmapC = qq8.c(pc0Var, bitmap);
        Bitmap bitmapD = pc0Var.d(iMin, iMin, qq8.d(bitmap));
        bitmapD.setHasAlpha(true);
        Lock lock = qq8.d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapD);
            canvas.drawCircle(f2, f2, f2, qq8.b);
            canvas.drawBitmap(bitmapC, (Rect) null, rectF, qq8.c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapC.equals(bitmap)) {
                pc0Var.c(bitmapC);
            }
            return bitmapD;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // defpackage.sx3
    public final boolean equals(Object obj) {
        return obj instanceof hr0;
    }

    @Override // defpackage.sx3
    public final int hashCode() {
        return 1101716364;
    }
}
