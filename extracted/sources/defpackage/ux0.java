package defpackage;

import androidx.activity.ComponentActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ux0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComponentActivity b;

    public /* synthetic */ ux0(ComponentActivity componentActivity, int i) {
        this.a = i;
        this.b = componentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ComponentActivity componentActivity = this.b;
        switch (i) {
            case 0:
                int i2 = ComponentActivity.u;
                componentActivity.invalidateOptionsMenu();
                break;
            default:
                ComponentActivity.G(componentActivity);
                break;
        }
    }
}
