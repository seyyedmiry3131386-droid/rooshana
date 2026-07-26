package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;

/* JADX INFO: loaded from: classes.dex */
public final class nm8 extends b60 {
    @Override // defpackage.b60
    public final f00 a(f00 f00Var) throws AudioProcessor$UnhandledAudioFormatException {
        int i = f00Var.c;
        if (i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4) {
            return i != 2 ? new f00(f00Var.a, f00Var.b, 2) : f00.e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(f00Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    @Override // defpackage.g00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm8.e(java.nio.ByteBuffer):void");
    }
}
