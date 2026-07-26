package defpackage;

import com.google.firebase.installations.remote.TokenResult$ResponseCode;

/* JADX INFO: loaded from: classes.dex */
public final class c30 {
    public final String a;
    public final long b;
    public final TokenResult$ResponseCode c;

    public c30(String str, long j, TokenResult$ResponseCode tokenResult$ResponseCode) {
        this.a = str;
        this.b = j;
        this.c = tokenResult$ResponseCode;
    }

    public final boolean equals(Object obj) {
        TokenResult$ResponseCode tokenResult$ResponseCode;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c30) {
            c30 c30Var = (c30) obj;
            TokenResult$ResponseCode tokenResult$ResponseCode2 = c30Var.c;
            String str = c30Var.a;
            String str2 = this.a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.b == c30Var.b && ((tokenResult$ResponseCode = this.c) != null ? tokenResult$ResponseCode.equals(tokenResult$ResponseCode2) : tokenResult$ResponseCode2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        TokenResult$ResponseCode tokenResult$ResponseCode = this.c;
        return (tokenResult$ResponseCode != null ? tokenResult$ResponseCode.hashCode() : 0) ^ i;
    }

    public final String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }
}
