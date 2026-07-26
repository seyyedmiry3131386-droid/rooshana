package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class vj implements j67 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ vj(wj wjVar, int i) {
        this.a = i;
        this.b = wjVar;
    }

    @Override // defpackage.j67
    public final g67 a(Object obj, int i, int i2, sv5 sv5Var) {
        switch (this.a) {
            case 0:
                return wj.a(ImageDecoder.createSource((ByteBuffer) obj), i, i2, sv5Var);
            case 1:
                return wj.a(ImageDecoder.createSource(lj0.b((InputStream) obj)), i, i2, sv5Var);
            default:
                return c(en.b(obj), i, i2, sv5Var);
        }
    }

    @Override // defpackage.j67
    public final boolean b(Object obj, sv5 sv5Var) throws IOException {
        switch (this.a) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeG = ok4.G(((wj) this.b).a, (ByteBuffer) obj);
                if (imageHeaderParser$ImageTypeG == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeG == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
            case 1:
                wj wjVar = (wj) this.b;
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeF = ok4.F(wjVar.a, (InputStream) obj, wjVar.b);
                if (imageHeaderParser$ImageTypeF == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeF == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
            default:
                en.b(obj);
                break;
        }
        return true;
    }

    public qc0 c(ImageDecoder.Source source, int i, int i2, sv5 sv5Var) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new mg1(i, i2, sv5Var));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new qc0((gv) this.b, bitmapDecodeBitmap);
    }

    public vj() {
        this.a = 2;
        this.b = new gv(2);
    }
}
