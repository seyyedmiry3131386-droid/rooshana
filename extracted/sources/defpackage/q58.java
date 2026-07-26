package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;
import coil3.decode.b;
import coil3.size.Precision;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes.dex */
public final class q58 implements ImageDecoder$OnHeaderDecodedListener {
    public final /* synthetic */ b a;
    public final /* synthetic */ Ref$BooleanRef b;

    public q58(b bVar, Ref$BooleanRef ref$BooleanRef) {
        this.a = bVar;
        this.b = ref$BooleanRef;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size = imageInfo.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        uv5 uv5Var = this.a.c;
        long jK = ml9.k(width, height, uv5Var.b, uv5Var.c, (dy7) gu9.r(uv5Var, qi3.b));
        int i = (int) (jK >> 32);
        int i2 = (int) (jK & 4294967295L);
        if (width > 0 && height > 0 && (width != i || height != i2)) {
            double dL = ml9.l(width, height, i, i2, this.a.c.c);
            boolean z = dL < 1.0d;
            this.b.a = z;
            if (z || this.a.c.d == Precision.a) {
                imageDecoder.setTargetSize(ok4.T(((double) width) * dL), ok4.T(dL * ((double) height)));
            }
        }
        imageDecoder.setOnPartialImageListener(new n58());
        uv5 uv5Var2 = this.a.c;
        imageDecoder.setAllocator(fz.n(si3.a(uv5Var2)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!((Boolean) gu9.r(uv5Var2, si3.g)).booleanValue() ? 1 : 0);
        zn5 zn5Var = si3.c;
        if (p58.a(gu9.r(uv5Var2, zn5Var)) != null) {
            imageDecoder.setTargetColorSpace(p58.a(gu9.r(uv5Var2, zn5Var)));
        }
        imageDecoder.setUnpremultipliedRequired(!((Boolean) gu9.r(uv5Var2, si3.d)).booleanValue());
    }
}
