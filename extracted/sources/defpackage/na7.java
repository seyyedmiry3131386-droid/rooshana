package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class na7 extends rc0 {
    public static final byte[] c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(sx3.a);
    public final int b;

    public na7(int i) {
        ok4.n("roundingRadius must be greater than 0.", i > 0);
        this.b = i;
    }

    @Override // defpackage.sx3
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.rc0
    public final Bitmap c(pc0 pc0Var, Bitmap bitmap, int i, int i2) {
        Paint paint = qq8.a;
        int i3 = this.b;
        ok4.n("roundingRadius must be greater than 0.", i3 > 0);
        return qq8.e(pc0Var, bitmap, new tu2(i3));
    }

    @Override // defpackage.sx3
    public final boolean equals(Object obj) {
        return (obj instanceof na7) && this.b == ((na7) obj).b;
    }

    @Override // defpackage.sx3
    public final int hashCode() {
        return i29.h(-569625254, i29.h(this.b, 17));
    }
}
