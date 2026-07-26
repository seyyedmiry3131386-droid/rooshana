package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rq4;
import defpackage.uq9;
import defpackage.uy6;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class RegisteredKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisteredKey> CREATOR = new uq9(5);
    public final KeyHandle a;
    public final String b;
    public final String c;

    public RegisteredKey(KeyHandle keyHandle, String str, String str2) {
        rq4.n(keyHandle);
        this.a = keyHandle;
        this.c = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisteredKey)) {
            return false;
        }
        RegisteredKey registeredKey = (RegisteredKey) obj;
        String str = registeredKey.b;
        String str2 = registeredKey.c;
        String str3 = this.c;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        if (!this.a.equals(registeredKey.a)) {
            return false;
        }
        String str4 = this.b;
        if (str4 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str4.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = this.a.hashCode() + (((str == null ? 0 : str.hashCode()) + 31) * 31);
        String str2 = this.b;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        KeyHandle keyHandle = this.a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(keyHandle.b, 11));
            ProtocolVersion protocolVersion = keyHandle.c;
            if (protocolVersion != ProtocolVersion.UNKNOWN) {
                jSONObject.put("version", protocolVersion.a);
            }
            List list = keyHandle.d;
            if (list != null) {
                jSONObject.put("transports", list.toString());
            }
            String str = this.c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.C(parcel, 2, this.a, i, false);
        uy6.D(parcel, 3, this.c, false);
        uy6.D(parcel, 4, this.b, false);
        uy6.K(iJ, parcel);
    }
}
