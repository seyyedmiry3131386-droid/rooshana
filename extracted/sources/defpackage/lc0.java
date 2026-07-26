package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import coil3.decode.DataSource;
import coil3.size.Precision;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class lc0 implements va2 {
    public final /* synthetic */ int a;
    public final uv5 b;
    public final Object c;

    public /* synthetic */ lc0(Object obj, uv5 uv5Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = uv5Var;
    }

    @Override // defpackage.va2
    public final Object a(g51 g51Var) {
        int i = this.a;
        Object obj = this.c;
        uv5 uv5Var = this.b;
        switch (i) {
            case 0:
                return new ai3(zk8.o(new BitmapDrawable(uv5Var.a.getResources(), (Bitmap) obj)), false, DataSource.b);
            case 1:
                gh0 gh0Var = new gh0();
                byte[] bArr = (byte[]) obj;
                js3.p(bArr, "source");
                gh0Var.H0(bArr.length, bArr);
                return new v18(new x18(gh0Var, uv5Var.f, null), null, DataSource.b);
            case 2:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new v18(new x18(rf0.j(new fj0(byteBuffer)), uv5Var.f, new ij0(byteBuffer)), null, DataSource.b);
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = s29.a;
                boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof q39);
                if (z) {
                    bitmapDrawable = new BitmapDrawable(uv5Var.a.getResources(), ja1.j(bitmapDrawable, si3.a(uv5Var), uv5Var.b, uv5Var.c, uv5Var.d == Precision.b));
                }
                return new ai3(zk8.o(bitmapDrawable), z, DataSource.b);
        }
    }
}
