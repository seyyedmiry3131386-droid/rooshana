package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface ei3 {
    ImageHeaderParser$ImageType a(ByteBuffer byteBuffer);

    int b(InputStream inputStream, dr3 dr3Var);

    boolean c(InputStream inputStream, dr3 dr3Var);

    ImageHeaderParser$ImageType d(InputStream inputStream);

    boolean e(ByteBuffer byteBuffer, dr3 dr3Var);

    int f(ByteBuffer byteBuffer, dr3 dr3Var);
}
