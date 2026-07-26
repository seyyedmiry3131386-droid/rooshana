package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import ir.mservices.market.core.notification.PushMessage;
import ir.mservices.market.core.notification.PushMessageAction;
import ir.mservices.market.core.notification.a;

/* JADX INFO: loaded from: classes3.dex */
public final class ip5 extends d91 {
    public final /* synthetic */ PushMessage d;
    public final /* synthetic */ PushMessageAction[] e;
    public final /* synthetic */ a f;

    public ip5(a aVar, PushMessage pushMessage, PushMessageAction[] pushMessageActionArr) {
        this.f = aVar;
        this.d = pushMessage;
        this.e = pushMessageActionArr;
    }

    @Override // defpackage.ve8
    public final void i(Object obj, ir8 ir8Var) {
        PushMessage pushMessage = this.d;
        PushMessageAction[] pushMessageActionArr = this.e;
        this.f.q(pushMessage, (Bitmap) obj, pushMessageActionArr);
    }

    @Override // defpackage.ve8
    public final void j(Drawable drawable) {
        PushMessage pushMessage = this.d;
        pushMessage.i();
        this.f.q(pushMessage, null, this.e);
    }
}
