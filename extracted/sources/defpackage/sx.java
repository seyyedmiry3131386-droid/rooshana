package defpackage;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sx implements vb8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ sx(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.vb8
    public final Object get() {
        switch (this.a) {
            case 0:
                return new HandlerThread(tx.r(this.b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(tx.r(this.b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
