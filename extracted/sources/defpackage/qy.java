package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class qy extends BroadcastReceiver {
    public final b62 a;
    public final wd8 b;
    public final /* synthetic */ ry c;

    public qy(ry ryVar, wd8 wd8Var, b62 b62Var) {
        this.c = ryVar;
        this.b = wd8Var;
        this.a = b62Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.c(new b7(7, this));
        }
    }
}
