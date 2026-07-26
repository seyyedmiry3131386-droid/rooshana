package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rx implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn4 b;

    public /* synthetic */ rx(pm4 pm4Var, bn4 bn4Var, int i) {
        this.a = i;
        this.b = bn4Var;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.a) {
            case 0:
                bn4 bn4Var = this.b;
                Handler handler = bn4Var.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    bn4Var.a(j);
                } else {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                }
                break;
            default:
                bn4 bn4Var2 = this.b;
                Handler handler2 = bn4Var2.a;
                if (Build.VERSION.SDK_INT >= 30) {
                    bn4Var2.a(j);
                } else {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                }
                break;
        }
    }
}
