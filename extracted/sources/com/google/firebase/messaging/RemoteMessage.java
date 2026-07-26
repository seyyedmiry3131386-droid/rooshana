package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ao6;
import defpackage.uy6;
import defpackage.wv;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new ao6(6);
    public final Bundle a;
    public wv b;

    public RemoteMessage(Bundle bundle) {
        this.a = bundle;
    }

    public final Map u() {
        if (this.b == null) {
            wv wvVar = new wv(0);
            Bundle bundle = this.a;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        wvVar.put(str, str2);
                    }
                }
            }
            this.b = wvVar;
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.v(parcel, 2, this.a);
        uy6.K(iJ, parcel);
    }
}
