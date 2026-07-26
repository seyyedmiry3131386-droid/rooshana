package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import coil3.decode.b;

/* JADX INFO: loaded from: classes.dex */
public final class o58 implements ac1 {
    public final pn7 a;

    public o58(pn7 pn7Var) {
        this.a = pn7Var;
    }

    @Override // defpackage.ac1
    public final bc1 a(v18 v18Var, uv5 uv5Var) {
        ImageDecoder.Source sourceV;
        Bitmap.Config configA = si3.a(uv5Var);
        if ((configA == Bitmap.Config.ARGB_8888 || configA == Bitmap.Config.HARDWARE) && (sourceV = te.V(v18Var.a, uv5Var)) != null) {
            return new b(sourceV, v18Var.a, uv5Var, this.a);
        }
        return null;
    }
}
