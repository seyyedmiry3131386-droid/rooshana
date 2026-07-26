package defpackage;

import com.google.firebase.installations.remote.InstallationResponse$ResponseCode;

/* JADX INFO: loaded from: classes.dex */
public final class o20 {
    public final String a;
    public final String b;
    public final String c;
    public final c30 d;
    public final InstallationResponse$ResponseCode e;

    public o20(String str, String str2, String str3, c30 c30Var, InstallationResponse$ResponseCode installationResponse$ResponseCode) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = c30Var;
        this.e = installationResponse$ResponseCode;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o20) {
            o20 o20Var = (o20) obj;
            InstallationResponse$ResponseCode installationResponse$ResponseCode = o20Var.e;
            c30 c30Var = o20Var.d;
            String str = o20Var.c;
            String str2 = o20Var.b;
            String str3 = o20Var.a;
            String str4 = this.a;
            if (str4 != null ? str4.equals(str3) : str3 == null) {
                String str5 = this.b;
                if (str5 != null ? str5.equals(str2) : str2 == null) {
                    String str6 = this.c;
                    if (str6 != null ? str6.equals(str) : str == null) {
                        c30 c30Var2 = this.d;
                        if (c30Var2 != null ? c30Var2.equals(c30Var) : c30Var == null) {
                            InstallationResponse$ResponseCode installationResponse$ResponseCode2 = this.e;
                            if (installationResponse$ResponseCode2 != null ? installationResponse$ResponseCode2.equals(installationResponse$ResponseCode) : installationResponse$ResponseCode == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        c30 c30Var = this.d;
        int iHashCode4 = (iHashCode3 ^ (c30Var == null ? 0 : c30Var.hashCode())) * 1000003;
        InstallationResponse$ResponseCode installationResponse$ResponseCode = this.e;
        return (installationResponse$ResponseCode != null ? installationResponse$ResponseCode.hashCode() : 0) ^ iHashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }
}
