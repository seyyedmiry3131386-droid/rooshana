package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qo4 implements ro4, wq4 {
    public final /* synthetic */ PendingIntent a;

    public /* synthetic */ qo4(int i, PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    @Override // defpackage.ro4
    public void a(go4 go4Var) {
        gn4 gn4Var = go4Var.a;
        if (go4Var.E()) {
            PendingIntent pendingIntent = go4Var.q;
            PendingIntent pendingIntent2 = this.a;
            if (Objects.equals(pendingIntent, pendingIntent2)) {
                return;
            }
            go4Var.q = pendingIntent2;
            gn4Var.getClass();
            vy2.s(Looper.myLooper() == gn4Var.e.getLooper());
            gn4Var.d.getClass();
        }
    }

    @Override // defpackage.wq4
    public void d(gq4 gq4Var, int i) {
        gq4Var.g(i, this.a);
    }

    public /* synthetic */ qo4(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }
}
