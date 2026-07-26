package defpackage;

import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;

/* JADX INFO: loaded from: classes.dex */
public final class xr2 implements b58 {
    public final cf8 a;

    public xr2(cf8 cf8Var) {
        this.a = cf8Var;
    }

    @Override // defpackage.b58
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.b58
    public final boolean b(x20 x20Var) {
        PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus = x20Var.b;
        if (persistedInstallation$RegistrationStatus != PersistedInstallation$RegistrationStatus.c && persistedInstallation$RegistrationStatus != PersistedInstallation$RegistrationStatus.d && persistedInstallation$RegistrationStatus != PersistedInstallation$RegistrationStatus.e) {
            return false;
        }
        this.a.d(x20Var.a);
        return true;
    }
}
