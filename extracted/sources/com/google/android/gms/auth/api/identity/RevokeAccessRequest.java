package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.p000authapi.zbbi;
import defpackage.ej9;
import defpackage.nj9;
import defpackage.rm7;
import defpackage.uy6;
import defpackage.vy2;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class RevokeAccessRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<RevokeAccessRequest> CREATOR = new nj9(2);
    public final zbbi a;
    public final Account b;
    public final String c;

    public RevokeAccessRequest(ArrayList arrayList, Account account, String str) {
        ej9 ej9Var = zbbi.b;
        Object[] array = arrayList.toArray();
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] == null) {
                throw new NullPointerException(rm7.o(i, "at index ", new StringBuilder(String.valueOf(i).length() + 9)));
            }
        }
        this.a = zbbi.m(array.length, array);
        this.b = account;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RevokeAccessRequest) {
            RevokeAccessRequest revokeAccessRequest = (RevokeAccessRequest) obj;
            zbbi zbbiVar = this.a;
            int size = zbbiVar.size();
            zbbi zbbiVar2 = revokeAccessRequest.a;
            if (size == zbbiVar2.size() && zbbiVar.containsAll(zbbiVar2) && vy2.w(this.b, revokeAccessRequest.b) && vy2.w(this.c, revokeAccessRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.H(parcel, 1, this.a, false);
        uy6.C(parcel, 2, this.b, i, false);
        uy6.D(parcel, 3, this.c, false);
        uy6.K(iJ, parcel);
    }
}
