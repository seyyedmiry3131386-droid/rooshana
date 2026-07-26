package defpackage;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
public final class r00 {
    public final q00 a;
    public final int b;
    public final r79 c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public r00(AudioTrack audioTrack, r79 r79Var) {
        this.a = new q00(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = r79Var;
        a(0);
    }

    public final void a(int i) {
        this.d = i;
        if (i == 0) {
            this.g = 0L;
            this.h = -1L;
            this.i = -9223372036854775807L;
            this.e = System.nanoTime() / 1000;
            this.f = 10000L;
            return;
        }
        if (i == 1) {
            this.f = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.f = 500000L;
        }
    }
}
