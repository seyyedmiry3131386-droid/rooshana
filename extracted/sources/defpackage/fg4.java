package defpackage;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class fg4 implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    public final /* synthetic */ gg4 a;

    public fg4(gg4 gg4Var) {
        this.a = gg4Var;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        this.a.b.getClass();
        return bundle;
    }
}
