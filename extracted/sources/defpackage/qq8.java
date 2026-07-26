package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class qq8 {
    public static final Paint a = new Paint(6);
    public static final Paint b = new Paint(7);
    public static final Paint c;
    public static final Lock d;

    static {
        d = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079")).contains(Build.MODEL) ? new ReentrantLock() : new pq8();
        Paint paint = new Paint(7);
        c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, a);
            canvas.setBitmap(null);
        } finally {
            lock.unlock();
        }
    }

    public static Bitmap b(pc0 pc0Var, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
            float fMin = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
            int iRound = Math.round(bitmap.getWidth() * fMin);
            int iRound2 = Math.round(bitmap.getHeight() * fMin);
            if (bitmap.getWidth() != iRound || bitmap.getHeight() != iRound2) {
                Bitmap bitmapD = pc0Var.d((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
                bitmapD.setHasAlpha(bitmap.hasAlpha());
                if (Log.isLoggable("TransformationUtils", 2)) {
                    bitmap.getWidth();
                    bitmap.getHeight();
                    bitmapD.getWidth();
                    bitmapD.getHeight();
                }
                Matrix matrix = new Matrix();
                matrix.setScale(fMin, fMin);
                a(bitmap, bitmapD, matrix);
                return bitmapD;
            }
        }
        return bitmap;
    }

    public static Bitmap c(pc0 pc0Var, Bitmap bitmap) {
        Bitmap.Config configD = d(bitmap);
        if (configD.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapD = pc0Var.d(bitmap.getWidth(), bitmap.getHeight(), configD);
        new Canvas(bitmapD).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapD;
    }

    public static Bitmap.Config d(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config = Bitmap.Config.RGBA_F16;
            if (config.equals(bitmap.getConfig())) {
                return config;
            }
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static Bitmap e(pc0 pc0Var, Bitmap bitmap, oq8 oq8Var) {
        Bitmap.Config configD = d(bitmap);
        Bitmap bitmapC = c(pc0Var, bitmap);
        Bitmap bitmapD = pc0Var.d(bitmapC.getWidth(), bitmapC.getHeight(), configD);
        bitmapD.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapC, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapD.getWidth(), bitmapD.getHeight());
        Lock lock = d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapD);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            oq8Var.d(canvas, paint, rectF);
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
}
