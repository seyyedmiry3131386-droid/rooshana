package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class gd2 extends rc0 {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(sx3.a);

    @Override // defpackage.sx3
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.rc0
    public final Bitmap c(pc0 pc0Var, Bitmap bitmap, int i, int i2) {
        return qq8.b(pc0Var, bitmap, i, i2);
    }

    @Override // defpackage.sx3
    public final boolean equals(Object obj) {
        return obj instanceof gd2;
    }

    @Override // defpackage.sx3
    public final int hashCode() {
        return 1572326941;
    }
}
