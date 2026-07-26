package defpackage;

import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;

/* JADX INFO: loaded from: classes.dex */
public final class w20 {
    public String a;
    public PersistedInstallation$RegistrationStatus b;
    public String c;
    public String d;
    public long e;
    public long f;
    public String g;
    public byte h;

    public final x20 a() {
        if (this.h == 3 && this.b != null) {
            return new x20(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" registrationStatus");
        }
        if ((this.h & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.h & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb));
    }
}
