package defpackage;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.a;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class jj0 implements sa1 {
    public final /* synthetic */ int a;

    public /* synthetic */ jj0(int i) {
        this.a = i;
    }

    @Override // defpackage.sa1
    public final ta1 a(Object obj) {
        switch (this.a) {
            case 0:
                return new pt2(13, (ByteBuffer) obj);
            case 1:
                return new s3(obj);
            default:
                return new a((ParcelFileDescriptor) obj);
        }
    }

    @Override // defpackage.sa1
    public final Class getDataClass() {
        switch (this.a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }
}
