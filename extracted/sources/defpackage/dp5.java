package defpackage;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class dp5 extends tt9 {
    public CharSequence c;

    @Override // defpackage.tt9
    public final void f(vp7 vp7Var) {
        new Notification.BigTextStyle((Notification.Builder) vp7Var.c).setBigContentTitle(null).bigText(this.c);
    }

    @Override // defpackage.tt9
    public final String i() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
