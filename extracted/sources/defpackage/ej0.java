package defpackage;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ej0 implements j67 {
    public final /* synthetic */ int a;
    public final vj b;

    public ej0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new vj();
                break;
            default:
                this.b = new vj();
                break;
        }
    }

    @Override // defpackage.j67
    public final g67 a(Object obj, int i, int i2, sv5 sv5Var) {
        switch (this.a) {
            case 0:
                return this.b.c(ImageDecoder.createSource((ByteBuffer) obj), i, i2, sv5Var);
            default:
                return this.b.c(ImageDecoder.createSource(lj0.b((InputStream) obj)), i, i2, sv5Var);
        }
    }

    @Override // defpackage.j67
    public final /* bridge */ /* synthetic */ boolean b(Object obj, sv5 sv5Var) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
