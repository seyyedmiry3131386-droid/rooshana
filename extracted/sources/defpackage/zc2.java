package defpackage;

import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.a;
import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zc2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ zc2(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        x20 x20VarB;
        x20 x20VarI;
        switch (this.a) {
            case 0:
                this.b.b();
                return;
            case 1:
                a aVar = this.b;
                synchronized (a.m) {
                    try {
                        xc2 xc2Var = aVar.a;
                        xc2Var.a();
                        qq4 qq4VarD = qq4.d(xc2Var.a);
                        try {
                            x20VarB = aVar.c.B();
                            if (qq4VarD != null) {
                                qq4VarD.A();
                            }
                        } catch (Throwable th) {
                            if (qq4VarD != null) {
                                qq4VarD.A();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus = x20VarB.b;
                    PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus2 = PersistedInstallation$RegistrationStatus.e;
                    if (persistedInstallation$RegistrationStatus == persistedInstallation$RegistrationStatus2) {
                        x20VarI = aVar.i(x20VarB);
                    } else {
                        if (persistedInstallation$RegistrationStatus == PersistedInstallation$RegistrationStatus.c) {
                            x20VarI = aVar.i(x20VarB);
                        } else if (!aVar.d.a(x20VarB)) {
                            return;
                        } else {
                            x20VarI = aVar.c(x20VarB);
                        }
                    }
                    aVar.f(x20VarI);
                    aVar.m(x20VarB, x20VarI);
                    if (x20VarI.b == PersistedInstallation$RegistrationStatus.d) {
                        aVar.l(x20VarI.a);
                    }
                    PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus3 = x20VarI.b;
                    if (persistedInstallation$RegistrationStatus3 == persistedInstallation$RegistrationStatus2) {
                        aVar.j(new FirebaseInstallationsException());
                        return;
                    } else if (persistedInstallation$RegistrationStatus3 == PersistedInstallation$RegistrationStatus.b || persistedInstallation$RegistrationStatus3 == PersistedInstallation$RegistrationStatus.a) {
                        aVar.j(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        aVar.k(x20VarI);
                        return;
                    }
                } catch (FirebaseInstallationsException e) {
                    aVar.j(e);
                    return;
                }
            default:
                this.b.b();
                return;
        }
    }
}
