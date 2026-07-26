package defpackage;

import android.content.Context;
import android.graphics.Point;
import androidx.media3.common.ParserException;
import androidx.media3.common.b;
import androidx.media3.decoder.DecoderException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class kc0 extends lw7 {
    public final Context n;
    public final int o;

    public kc0(Context context) {
        super(new fc1[1], new ic0[1]);
        this.n = context;
        this.o = -1;
    }

    @Override // defpackage.lw7
    public final fc1 g() {
        return new fc1(1);
    }

    @Override // defpackage.lw7
    public final gc1 h() {
        return new ic0(this);
    }

    @Override // defpackage.lw7
    public final DecoderException i(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    @Override // defpackage.lw7
    public final DecoderException j(fc1 fc1Var, gc1 gc1Var, boolean z) {
        ic0 ic0Var = (ic0) gc1Var;
        ByteBuffer byteBuffer = fc1Var.e;
        byteBuffer.getClass();
        vy2.s(byteBuffer.hasArray());
        vy2.j(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.o;
            if (iMax == -1) {
                Context context = this.n;
                if (context != null) {
                    Point pointW = j29.w(context);
                    int i = pointW.x;
                    int i2 = pointW.y;
                    b bVar = fc1Var.c;
                    if (bVar != null) {
                        int i3 = bVar.M;
                        if (i3 != -1) {
                            i *= i3;
                        }
                        int i4 = bVar.N;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                    }
                    iMax = (Math.max(i, i2) * 2) - 1;
                } else {
                    iMax = 4096;
                }
            }
            ic0Var.e = gu9.m(byteBuffer.array(), byteBuffer.remaining(), iMax);
            ic0Var.c = fc1Var.g;
            return null;
        } catch (ParserException e) {
            return new ImageDecoderException("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new ImageDecoderException(e2);
        }
    }
}
