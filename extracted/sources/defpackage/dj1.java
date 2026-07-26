package defpackage;

import androidx.media3.decoder.DecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class dj1 extends lw7 implements ua8 {
    public final cb8 n;

    public dj1(cb8 cb8Var) {
        super(new ya8[2], new do0[2]);
        int i = this.g;
        fc1[] fc1VarArr = this.e;
        vy2.s(i == fc1VarArr.length);
        for (fc1 fc1Var : fc1VarArr) {
            fc1Var.i(1024);
        }
        this.n = cb8Var;
    }

    @Override // defpackage.lw7
    public final fc1 g() {
        return new ya8(1);
    }

    @Override // defpackage.lw7
    public final gc1 h() {
        return new do0(this);
    }

    @Override // defpackage.lw7
    public final DecoderException i(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    @Override // defpackage.lw7
    public final DecoderException j(fc1 fc1Var, gc1 gc1Var, boolean z) {
        ya8 ya8Var = (ya8) fc1Var;
        do0 do0Var = (do0) gc1Var;
        try {
            ByteBuffer byteBuffer = ya8Var.e;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            cb8 cb8Var = this.n;
            if (z) {
                cb8Var.reset();
            }
            ta8 ta8VarD = cb8Var.d(bArrArray, 0, iLimit);
            long j = ya8Var.g;
            long j2 = ya8Var.j;
            do0Var.c = j;
            do0Var.e = ta8VarD;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            do0Var.f = j;
            do0Var.d = false;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    @Override // defpackage.ua8
    public final void c(long j) {
    }
}
