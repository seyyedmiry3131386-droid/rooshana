package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class f52 implements ei3 {
    @Override // defpackage.ei3
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.ei3
    public final int b(InputStream inputStream, dr3 dr3Var) {
        int iC = new e52(inputStream).c();
        if (iC == 0) {
            return -1;
        }
        return iC;
    }

    @Override // defpackage.ei3
    public final boolean c(InputStream inputStream, dr3 dr3Var) {
        return false;
    }

    @Override // defpackage.ei3
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.ei3
    public final boolean e(ByteBuffer byteBuffer, dr3 dr3Var) {
        return false;
    }

    @Override // defpackage.ei3
    public final int f(ByteBuffer byteBuffer, dr3 dr3Var) {
        AtomicReference atomicReference = lj0.a;
        return b(new kj0(byteBuffer), dr3Var);
    }
}
