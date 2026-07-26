package defpackage;

import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;

/* JADX INFO: loaded from: classes.dex */
public final class ur2 implements b58 {
    public final o29 a;
    public final cf8 b;

    public ur2(o29 o29Var, cf8 cf8Var) {
        this.a = o29Var;
        this.b = cf8Var;
    }

    @Override // defpackage.b58
    public final boolean a(Exception exc) {
        this.b.c(exc);
        return true;
    }

    @Override // defpackage.b58
    public final boolean b(x20 x20Var) {
        if (x20Var.b != PersistedInstallation$RegistrationStatus.d || this.a.a(x20Var)) {
            return false;
        }
        String str = x20Var.c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.b.b(new p20(x20Var.e, x20Var.f, str));
        return true;
    }
}
