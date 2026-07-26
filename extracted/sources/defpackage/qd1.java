package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class qd1 {
    public final Handler a = new Handler(Looper.myLooper());
    public final pd1 b = new pd1(this);
    public final /* synthetic */ rd1 c;

    public qd1(rd1 rd1Var) {
        this.c = rd1Var;
    }

    public final void a(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}
