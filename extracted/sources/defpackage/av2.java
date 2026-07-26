package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class av2 extends rc0 {
    public static final byte[] f = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners".getBytes(sx3.a);
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public av2(float f2, float f3, float f4, float f5) {
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    @Override // defpackage.sx3
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.b).putFloat(this.c).putFloat(this.d).putFloat(this.e).array());
    }

    @Override // defpackage.rc0
    public final Bitmap c(pc0 pc0Var, Bitmap bitmap, int i, int i2) {
        return qq8.e(pc0Var, bitmap, new qb5(this.b, this.c, this.d, this.e));
    }

    @Override // defpackage.sx3
    public final boolean equals(Object obj) {
        if (obj instanceof av2) {
            av2 av2Var = (av2) obj;
            if (this.b == av2Var.b && this.c == av2Var.c && this.d == av2Var.d && this.e == av2Var.e) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sx3
    public final int hashCode() {
        return i29.g(i29.g(i29.g(i29.h(-2013597734, i29.g(17, this.b)), this.c), this.d), this.e);
    }
}
