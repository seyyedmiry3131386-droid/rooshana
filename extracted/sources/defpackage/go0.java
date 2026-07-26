package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class go0 extends rc0 {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(sx3.a);

    @Override // defpackage.sx3
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.rc0
    public final Bitmap c(pc0 pc0Var, Bitmap bitmap, int i, int i2) {
        Paint paint = qq8.a;
        return (bitmap.getWidth() > i || bitmap.getHeight() > i2) ? qq8.b(pc0Var, bitmap, i, i2) : bitmap;
    }

    @Override // defpackage.sx3
    public final boolean equals(Object obj) {
        return obj instanceof go0;
    }

    @Override // defpackage.sx3
    public final int hashCode() {
        return -670243078;
    }
}
