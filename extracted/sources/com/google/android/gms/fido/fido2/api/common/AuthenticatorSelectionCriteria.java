package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import defpackage.ds9;
import defpackage.uy6;
import defpackage.vy2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new ds9(6);
    public final Attachment a;
    public final Boolean b;
    public final zzay c;
    public final ResidentKeyRequirement d;

    public AuthenticatorSelectionCriteria(String str, String str2, String str3, Boolean bool) {
        Attachment attachmentA;
        ResidentKeyRequirement residentKeyRequirementA = null;
        if (str == null) {
            attachmentA = null;
        } else {
            try {
                attachmentA = Attachment.a(str);
            } catch (Attachment.UnsupportedAttachmentException | ResidentKeyRequirement.UnsupportedResidentKeyRequirementException | zzax e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.a = attachmentA;
        this.b = bool;
        this.c = str2 == null ? null : zzay.a(str2);
        if (str3 != null) {
            residentKeyRequirementA = ResidentKeyRequirement.a(str3);
        }
        this.d = residentKeyRequirementA;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return vy2.w(this.a, authenticatorSelectionCriteria.a) && vy2.w(this.b, authenticatorSelectionCriteria.b) && vy2.w(this.c, authenticatorSelectionCriteria.c) && vy2.w(this.d, authenticatorSelectionCriteria.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = uy6.J(20293, parcel);
        Attachment attachment = this.a;
        uy6.D(parcel, 2, attachment == null ? null : attachment.a, false);
        Boolean bool = this.b;
        if (bool != null) {
            uy6.I(parcel, 3, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        zzay zzayVar = this.c;
        uy6.D(parcel, 4, zzayVar == null ? null : zzayVar.a, false);
        ResidentKeyRequirement residentKeyRequirement = this.d;
        uy6.D(parcel, 5, residentKeyRequirement != null ? residentKeyRequirement.a : null, false);
        uy6.K(iJ, parcel);
    }
}
