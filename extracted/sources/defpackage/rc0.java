package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class rc0 implements nq8 {
    @Override // defpackage.nq8
    public final g67 a(Context context, g67 g67Var, int i, int i2) {
        if (!i29.j(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        pc0 pc0Var = a.a(context).a;
        Bitmap bitmap = (Bitmap) g67Var.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(pc0Var, bitmap, i, i2);
        return bitmap.equals(bitmapC) ? g67Var : qc0.b(pc0Var, bitmapC);
    }

    public abstract Bitmap c(pc0 pc0Var, Bitmap bitmap, int i, int i2);
}
