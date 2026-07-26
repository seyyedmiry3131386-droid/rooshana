package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class do4 implements ServiceConnection {
    public final Bundle a;
    public final /* synthetic */ go4 b;

    public do4(go4 go4Var, Bundle bundle) {
        this.b = go4Var;
        this.a = bundle;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        gn4 gn4Var = this.b.a;
        Objects.requireNonNull(gn4Var);
        gn4Var.j0(new u03(7, gn4Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        u03 u03Var;
        go4 go4Var = this.b;
        eq7 eq7Var = go4Var.e;
        gn4 gn4Var = go4Var.a;
        try {
            try {
                if (eq7Var.a.f().equals(componentName.getPackageName())) {
                    bg3 bg3VarL = pr4.L(iBinder);
                    if (bg3VarL != null) {
                        String packageName = go4Var.d.getPackageName();
                        int iMyPid = Process.myPid();
                        Bundle bundle = this.a;
                        gn4Var.getClass();
                        bg3VarL.V(go4Var.c, new v11(packageName, iMyPid, bundle).b());
                        return;
                    }
                    wn5.F("MCImplBase", "Service interface is missing.");
                    Objects.requireNonNull(gn4Var);
                    u03Var = new u03(7, gn4Var);
                } else {
                    wn5.F("MCImplBase", "Expected connection to " + eq7Var.a.f() + " but is connected to " + componentName);
                    Objects.requireNonNull(gn4Var);
                    u03Var = new u03(7, gn4Var);
                }
            } catch (RemoteException unused) {
                wn5.k0("MCImplBase", "Service " + componentName + " has died prematurely");
                Objects.requireNonNull(gn4Var);
                u03Var = new u03(7, gn4Var);
            }
            gn4Var.j0(u03Var);
        } catch (Throwable th) {
            Objects.requireNonNull(gn4Var);
            gn4Var.j0(new u03(7, gn4Var));
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        gn4 gn4Var = this.b.a;
        Objects.requireNonNull(gn4Var);
        gn4Var.j0(new u03(7, gn4Var));
    }
}
