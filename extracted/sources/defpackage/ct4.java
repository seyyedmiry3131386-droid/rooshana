package defpackage;

import android.app.Notification;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class ct4 extends tt9 {
    public final jq4 c;
    public int[] d;

    public ct4(jq4 jq4Var) {
        super(5, false);
        this.c = jq4Var;
    }

    @Override // defpackage.tt9
    public final void f(vp7 vp7Var) {
        Notification.Builder builder = (Notification.Builder) vp7Var.c;
        Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
        jq4 jq4Var = this.c;
        Notification.MediaStyle mediaSession = mediaStyle.setMediaSession(((nq4) jq4Var.a.h.k.a).c.b);
        int[] iArr = this.d;
        if (iArr != null) {
            mediaSession.setShowActionsInCompactView(iArr);
        }
        builder.setStyle(mediaSession);
        Bundle bundle = new Bundle();
        bundle.putBundle("androidx.media3.session", jq4Var.a.j.b());
        builder.addExtras(bundle);
    }
}
