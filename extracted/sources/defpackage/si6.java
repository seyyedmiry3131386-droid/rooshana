package defpackage;

import android.app.PendingIntent;
import android.content.pm.PackageInstaller;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class si6 extends d91 {
    public final /* synthetic */ PackageInstaller.Session d;
    public final /* synthetic */ PackageInstaller.PreapprovalDetails.Builder e;
    public final /* synthetic */ PendingIntent f;

    public si6(PackageInstaller.Session session, PackageInstaller.PreapprovalDetails.Builder builder, PendingIntent pendingIntent) {
        this.d = session;
        this.e = builder;
        this.f = pendingIntent;
    }

    @Override // defpackage.d91, defpackage.ve8
    public final void g(Drawable drawable) {
        this.d.requestUserPreapproval(this.e.build(), this.f.getIntentSender());
    }

    @Override // defpackage.ve8
    public final void i(Object obj, ir8 ir8Var) {
        this.d.requestUserPreapproval(this.e.setIcon((Bitmap) obj).build(), this.f.getIntentSender());
    }

    @Override // defpackage.ve8
    public final void j(Drawable drawable) {
    }
}
