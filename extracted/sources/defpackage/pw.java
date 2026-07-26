package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import coil3.a;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class pw implements ua2 {
    public final /* synthetic */ int a;

    public /* synthetic */ pw(int i) {
        this.a = i;
    }

    @Override // defpackage.ua2
    public final va2 a(Object obj, uv5 uv5Var, a aVar) {
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        int i4 = 3;
        switch (this.a) {
            case 0:
                h09 h09Var = (h09) obj;
                Bitmap.Config[] configArr = s29.a;
                if (js3.i(h09Var.c, "file") && js3.i(kotlin.collections.a.p0(za7.n(h09Var)), "android_asset")) {
                    return new qw(h09Var, uv5Var, i);
                }
                return null;
            case 1:
                return new lc0((Bitmap) obj, uv5Var, i);
            case 2:
                return new lc0((byte[]) obj, uv5Var, i2);
            case 3:
                return new lc0((ByteBuffer) obj, uv5Var, i3);
            case 4:
                h09 h09Var2 = (h09) obj;
                if (js3.i(h09Var2.c, "content")) {
                    return new t41(h09Var2, uv5Var);
                }
                return null;
            case 5:
                h09 h09Var3 = (h09) obj;
                if (js3.i(h09Var3.c, "data")) {
                    return new qw(h09Var3, uv5Var, i2);
                }
                return null;
            case 6:
                return new lc0((Drawable) obj, uv5Var, i4);
            case 7:
                h09 h09Var4 = (h09) obj;
                String str = h09Var4.c;
                if ((str != null && !str.equals("file")) || h09Var4.e == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = s29.a;
                if (js3.i(h09Var4.c, "file") && js3.i(kotlin.collections.a.p0(za7.n(h09Var4)), "android_asset")) {
                    return null;
                }
                return new qw(h09Var4, uv5Var, i3);
            case 8:
                h09 h09Var5 = (h09) obj;
                if (js3.i(h09Var5.c, "jar:file")) {
                    return new qw(h09Var5, uv5Var, i4);
                }
                return null;
            default:
                h09 h09Var6 = (h09) obj;
                if (js3.i(h09Var6.c, "android.resource")) {
                    return new qw(h09Var6, uv5Var, 4);
                }
                return null;
        }
    }
}
