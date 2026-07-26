package defpackage;

import android.content.pm.PackageInstaller;
import ir.mservices.market.pika.receive.model.a;
import ir.mservices.market.version2.manager.install.e;

/* JADX INFO: loaded from: classes3.dex */
public final class ip3 extends PackageInstaller.SessionCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ip3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onActiveChanged(int i, boolean z) {
        int i2 = this.a;
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onBadgingChanged(int i) {
        int i2 = this.a;
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onCreated(int i) {
        int i2 = this.a;
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onFinished(int i, boolean z) {
        int i2 = this.a;
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onProgressChanged(int i, float f) {
        switch (this.a) {
            case 0:
                ((a) this.b).f.put(Integer.valueOf(i), Float.valueOf(f));
                break;
            default:
                ((e) this.b).h = f;
                break;
        }
    }

    private final void c(int i) {
    }

    private final void d(int i) {
    }

    private final void e(int i) {
    }

    private final void f(int i) {
    }

    private final void a(int i, boolean z) {
    }

    private final void b(int i, boolean z) {
    }

    private final void g(int i, boolean z) {
    }

    private final void h(int i, boolean z) {
    }
}
