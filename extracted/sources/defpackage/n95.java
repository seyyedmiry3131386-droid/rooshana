package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes.dex */
public final class n95 extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public n95(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        js3.p((dg3) iInterface, "callback");
        js3.p(obj, "cookie");
        this.a.b.remove((Integer) obj);
    }
}
