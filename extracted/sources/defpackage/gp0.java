package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class gp0 extends b60 {
    public int[] i;
    public int[] j;

    @Override // defpackage.b60
    public final f00 a(f00 f00Var) throws AudioProcessor$UnhandledAudioFormatException {
        int i = f00Var.c;
        int[] iArr = this.i;
        if (iArr == null) {
            return f00.e;
        }
        int i2 = f00Var.b;
        if (!j29.Q(i)) {
            throw new AudioProcessor$UnhandledAudioFormatException(f00Var);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new AudioProcessor$UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", f00Var);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new f00(f00Var.a, iArr.length, i) : f00.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    @Override // defpackage.g00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.nio.ByteBuffer r18) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gp0.e(java.nio.ByteBuffer):void");
    }

    @Override // defpackage.b60
    public final void h() {
        this.j = this.i;
    }

    @Override // defpackage.b60
    public final void j() {
        this.j = null;
        this.i = null;
    }
}
