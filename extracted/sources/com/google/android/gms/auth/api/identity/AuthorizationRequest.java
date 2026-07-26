package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rq4;
import defpackage.th9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AuthorizationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new th9(24);
    public final List a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final Account e;
    public final String f;
    public final String g;
    public final boolean h;
    public final Bundle i;
    public final boolean j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResourceParameter {
        public static final /* synthetic */ ResourceParameter[] a = {new ResourceParameter("ACCOUNT_SELECTION_TOKEN", 0), new ResourceParameter("ACCOUNT_SELECTION_STATE", 1), new ResourceParameter("PICKER_ALLOW_MULTIPLE", 2), new ResourceParameter("PICKER_MIMETYPES", 3), new ResourceParameter("PICKER_FILE_IDS", 4), new ResourceParameter("PICKER_OAUTH_TRIGGER", 5)};

        /* JADX INFO: Fake field, exist only in values array */
        ResourceParameter EF5;

        public static ResourceParameter valueOf(String str) {
            return (ResourceParameter) Enum.valueOf(ResourceParameter.class, str);
        }

        public static ResourceParameter[] values() {
            return (ResourceParameter[]) a.clone();
        }
    }

    public AuthorizationRequest(ArrayList arrayList, String str, boolean z, boolean z2, Account account, String str2, String str3, boolean z3, Bundle bundle, boolean z4) {
        boolean z5 = false;
        if (arrayList != null && !arrayList.isEmpty()) {
            z5 = true;
        }
        rq4.h("requestedScopes cannot be null or empty", z5);
        this.a = arrayList;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = account;
        this.f = str2;
        this.g = str3;
        this.h = z3;
        this.i = bundle;
        this.j = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        List list = this.a;
        int size = list.size();
        List list2 = authorizationRequest.a;
        if (size == list2.size() && list.containsAll(list2)) {
            Bundle bundle = authorizationRequest.i;
            Bundle bundle2 = this.i;
            if (bundle2 == null) {
                if (bundle == null) {
                    bundle = null;
                }
                return false;
            }
            if (bundle2 == null || bundle != null) {
                if (bundle2 != null) {
                    if (bundle2.size() != bundle.size()) {
                        return false;
                    }
                    for (String str : bundle2.keySet()) {
                        if (!vy2.w(bundle2.getString(str), bundle.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.c == authorizationRequest.c && this.h == authorizationRequest.h && this.d == authorizationRequest.d && this.j == authorizationRequest.j && vy2.w(this.b, authorizationRequest.b) && vy2.w(this.e, authorizationRequest.e) && vy2.w(this.f, authorizationRequest.f) && vy2.w(this.g, authorizationRequest.g)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.h), Boolean.valueOf(this.d), this.e, this.f, this.g, this.i, Boolean.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.H(parcel, 1, this.a, false);
        uy6.D(parcel, 2, this.b, false);
        uy6.I(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        uy6.I(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uy6.C(parcel, 5, this.e, i, false);
        uy6.D(parcel, 6, this.f, false);
        uy6.D(parcel, 7, this.g, false);
        uy6.I(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        uy6.v(parcel, 9, this.i);
        uy6.I(parcel, 10, 4);
        parcel.writeInt(this.j ? 1 : 0);
        uy6.K(iJ, parcel);
    }
}
