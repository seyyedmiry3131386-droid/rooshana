package defpackage;

import android.app.RemoteAction;

/* JADX INFO: loaded from: classes.dex */
public final class hg8 implements rp2 {
    public final /* synthetic */ RemoteAction a;

    public hg8(RemoteAction remoteAction) {
        this.a = remoteAction;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        long j = ((zu0) obj).a;
        qz0 qz0Var = (qz0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if (qz0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            u96.d.h(this.a.getIcon(), qz0Var, 48);
        } else {
            qz0Var.U();
        }
        return tx8.a;
    }
}
