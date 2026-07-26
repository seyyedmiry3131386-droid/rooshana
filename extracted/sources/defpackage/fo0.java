package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class fo0 extends rc0 {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(sx3.a);

    @Override // defpackage.sx3
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.rc0
    public final Bitmap c(pc0 pc0Var, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = qq8.a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapD = pc0Var.d(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapD.setHasAlpha(bitmap.hasAlpha());
        qq8.a(bitmap, bitmapD, matrix);
        return bitmapD;
    }

    @Override // defpackage.sx3
    public final boolean equals(Object obj) {
        return obj instanceof fo0;
    }

    @Override // defpackage.sx3
    public final int hashCode() {
        return -599754482;
    }
}
