package defpackage;

import com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus;

/* JADX INFO: loaded from: classes.dex */
public final class x20 {
    public static final /* synthetic */ int h = 0;
    public final String a;
    public final PersistedInstallation$RegistrationStatus b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;

    static {
        byte b = (byte) (((byte) (0 | 2)) | 1);
        if (b == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb));
    }

    public x20(String str, PersistedInstallation$RegistrationStatus persistedInstallation$RegistrationStatus, String str2, String str3, long j, long j2, String str4) {
        this.a = str;
        this.b = persistedInstallation$RegistrationStatus;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = j2;
        this.g = str4;
    }

    public final w20 a() {
        w20 w20Var = new w20();
        w20Var.a = this.a;
        w20Var.b = this.b;
        w20Var.c = this.c;
        w20Var.d = this.d;
        w20Var.e = this.e;
        w20Var.f = this.f;
        w20Var.g = this.g;
        w20Var.h = (byte) 3;
        return w20Var;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x20) {
            x20 x20Var = (x20) obj;
            String str4 = x20Var.g;
            String str5 = x20Var.d;
            String str6 = x20Var.c;
            String str7 = x20Var.a;
            String str8 = this.a;
            if (str8 != null ? str8.equals(str7) : str7 == null) {
                if (this.b.equals(x20Var.b) && ((str = this.c) != null ? str.equals(str6) : str6 == null) && ((str2 = this.d) != null ? str2.equals(str5) : str5 == null) && this.e == x20Var.e && this.f == x20Var.f && ((str3 = this.g) != null ? str3.equals(str4) : str4 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str2 = this.c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.e;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.g;
        return (str4 != null ? str4.hashCode() : 0) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.a);
        sb.append(", registrationStatus=");
        sb.append(this.b);
        sb.append(", authToken=");
        sb.append(this.c);
        sb.append(", refreshToken=");
        sb.append(this.d);
        sb.append(", expiresInSecs=");
        sb.append(this.e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f);
        sb.append(", fisError=");
        return dw1.s(sb, this.g, "}");
    }
}
