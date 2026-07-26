package defpackage;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.IconCompat;
import ir.mservices.market.core.notification.PushMessage;
import ir.mservices.market.core.notification.a;

/* JADX INFO: loaded from: classes3.dex */
public final class hp5 extends d91 {
    public final /* synthetic */ PushMessage d;
    public final /* synthetic */ fp5 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Notification g;
    public final /* synthetic */ a h;

    public hp5(a aVar, PushMessage pushMessage, fp5 fp5Var, int i, Notification notification) {
        this.h = aVar;
        this.d = pushMessage;
        this.e = fp5Var;
        this.f = i;
        this.g = notification;
    }

    @Override // defpackage.ve8
    public final void i(Object obj, ir8 ir8Var) {
        cp5 cp5Var = new cp5(5, false);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.b = (Bitmap) obj;
        cp5Var.c = iconCompat;
        PushMessage pushMessage = this.d;
        if (pushMessage.a().equalsIgnoreCase(pushMessage.i())) {
            cp5Var.d = null;
            cp5Var.e = true;
        }
        fp5 fp5Var = this.e;
        fp5Var.g(cp5Var);
        Notification notificationB = fp5Var.b();
        if (pushMessage.v()) {
            notificationB.defaults |= 1;
        }
        if (pushMessage.w()) {
            notificationB.defaults |= 2;
        }
        this.h.a.notify(this.f, notificationB);
    }

    @Override // defpackage.ve8
    public final void j(Drawable drawable) {
        this.h.a.notify(this.f, this.g);
    }
}
