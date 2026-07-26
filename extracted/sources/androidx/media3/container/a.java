package androidx.media3.container;

import defpackage.ao0;
import defpackage.hs9;
import defpackage.lr5;
import defpackage.vy2;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final boolean a;

    public a(hs9 hs9Var, lr5 lr5Var) throws ObuParser$NotYetImplementedException {
        int i = lr5Var.a;
        ByteBuffer byteBuffer = lr5Var.b;
        vy2.j(i == 6 || i == 3);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        ao0 ao0Var = new ao0(bArr, iMin);
        hs9Var.getClass();
        if (ao0Var.h()) {
            this.a = false;
            return;
        }
        int i2 = ao0Var.i(2);
        if (!ao0Var.h()) {
            this.a = true;
            return;
        }
        if (i2 != 3 && i2 != 0) {
            ao0Var.h();
        }
        ao0Var.s();
        throw new ObuParser$NotYetImplementedException(0);
    }
}
