package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.rq4;
import defpackage.uy6;
import defpackage.vy2;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new a();
    public final PasswordRequestOptions a;
    public final GoogleIdTokenRequestOptions b;
    public final String c;
    public final boolean d;
    public final int e;
    public final PasskeysRequestOptions f;
    public final PasskeyJsonRequestOptions g;
    public final boolean h;

    @Deprecated
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new b();
        public final boolean a;
        public final String b;
        public final String c;
        public final boolean d;
        public final String e;
        public final ArrayList f;
        public final boolean g;
        public final List h;

        public GoogleIdTokenRequestOptions(boolean z, String str, String str2, boolean z2, String str3, ArrayList arrayList, boolean z3, ArrayList arrayList2) {
            boolean z4 = true;
            if (z2 && z3) {
                z4 = false;
            }
            rq4.h("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z4);
            this.a = z;
            if (z) {
                rq4.o(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.b = str;
            this.c = str2;
            this.d = z2;
            ArrayList arrayList3 = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                arrayList3 = new ArrayList(arrayList);
                Collections.sort(arrayList3);
            }
            this.f = arrayList3;
            this.e = str3;
            this.g = z3;
            this.h = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.a == googleIdTokenRequestOptions.a && vy2.w(this.b, googleIdTokenRequestOptions.b) && vy2.w(this.c, googleIdTokenRequestOptions.c) && this.d == googleIdTokenRequestOptions.d && vy2.w(this.e, googleIdTokenRequestOptions.e) && vy2.w(this.f, googleIdTokenRequestOptions.f) && this.g == googleIdTokenRequestOptions.g && vy2.w(this.h, googleIdTokenRequestOptions.h);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d), this.e, this.f, Boolean.valueOf(this.g), this.h});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iJ = uy6.J(20293, parcel);
            uy6.I(parcel, 1, 4);
            parcel.writeInt(this.a ? 1 : 0);
            uy6.D(parcel, 2, this.b, false);
            uy6.D(parcel, 3, this.c, false);
            uy6.I(parcel, 4, 4);
            parcel.writeInt(this.d ? 1 : 0);
            uy6.D(parcel, 5, this.e, false);
            uy6.F(parcel, 6, this.f);
            uy6.I(parcel, 7, 4);
            parcel.writeInt(this.g ? 1 : 0);
            uy6.H(parcel, 8, this.h, false);
            uy6.K(iJ, parcel);
        }
    }

    @Deprecated
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new c();
        public final boolean a;
        public final String b;

        public PasskeyJsonRequestOptions(boolean z, String str) {
            if (z) {
                rq4.n(str);
            }
            this.a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.a == passkeyJsonRequestOptions.a && vy2.w(this.b, passkeyJsonRequestOptions.b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iJ = uy6.J(20293, parcel);
            uy6.I(parcel, 1, 4);
            parcel.writeInt(this.a ? 1 : 0);
            uy6.D(parcel, 2, this.b, false);
            uy6.K(iJ, parcel);
        }
    }

    @Deprecated
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new d();
        public final boolean a;
        public final byte[] b;
        public final String c;

        public PasskeysRequestOptions(String str, boolean z, byte[] bArr) {
            if (z) {
                rq4.n(bArr);
                rq4.n(str);
            }
            this.a = z;
            this.b = bArr;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.a == passkeysRequestOptions.a && Arrays.equals(this.b, passkeysRequestOptions.b) && Objects.equals(this.c, passkeysRequestOptions.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.b) + (Objects.hash(Boolean.valueOf(this.a), this.c) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iJ = uy6.J(20293, parcel);
            uy6.I(parcel, 1, 4);
            parcel.writeInt(this.a ? 1 : 0);
            uy6.w(parcel, 2, this.b, false);
            uy6.D(parcel, 3, this.c, false);
            uy6.K(iJ, parcel);
        }
    }

    @Deprecated
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new e();
        public final boolean a;

        public PasswordRequestOptions(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.a == ((PasswordRequestOptions) obj).a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iJ = uy6.J(20293, parcel);
            uy6.I(parcel, 1, 4);
            parcel.writeInt(this.a ? 1 : 0);
            uy6.K(iJ, parcel);
        }
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z, int i, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions, boolean z2) {
        rq4.n(passwordRequestOptions);
        this.a = passwordRequestOptions;
        rq4.n(googleIdTokenRequestOptions);
        this.b = googleIdTokenRequestOptions;
        this.c = str;
        this.d = z;
        this.e = i;
        this.f = passkeysRequestOptions == null ? new PasskeysRequestOptions(null, false, null) : passkeysRequestOptions;
        this.g = passkeyJsonRequestOptions == null ? new PasskeyJsonRequestOptions(false, null) : passkeyJsonRequestOptions;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return vy2.w(this.a, beginSignInRequest.a) && vy2.w(this.b, beginSignInRequest.b) && vy2.w(this.f, beginSignInRequest.f) && vy2.w(this.g, beginSignInRequest.g) && vy2.w(this.c, beginSignInRequest.c) && this.d == beginSignInRequest.d && this.e == beginSignInRequest.e && this.h == beginSignInRequest.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.f, this.g, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        uy6.C(parcel, 1, this.a, i, false);
        uy6.C(parcel, 2, this.b, i, false);
        uy6.D(parcel, 3, this.c, false);
        uy6.I(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uy6.I(parcel, 5, 4);
        parcel.writeInt(this.e);
        uy6.C(parcel, 6, this.f, i, false);
        uy6.C(parcel, 7, this.g, i, false);
        uy6.I(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        uy6.K(iJ, parcel);
    }
}
