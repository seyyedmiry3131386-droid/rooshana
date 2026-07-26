package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.common.Feature;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;
import com.google.android.gms.fido.fido2.api.common.zzax;
import com.google.android.gms.fido.fido2.api.common.zzay;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.internal.auth.zzaq;
import com.google.android.gms.internal.auth.zzav;
import com.google.android.gms.internal.auth.zzaz;
import com.google.android.gms.internal.auth.zzbb;
import com.google.android.gms.internal.nearby.zzak;
import com.google.android.gms.internal.nearby.zzar;
import com.google.android.gms.internal.nearby.zzin;
import com.google.android.gms.internal.nearby.zzis;
import com.google.android.gms.internal.nearby.zzjk;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.Strategy;
import com.google.android.gms.nearby.connection.zzac;
import com.google.android.gms.nearby.connection.zzo;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.internal.zza;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sk9 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ sk9(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int iJ = cc7.J(parcel);
                PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
                PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
                byte[] bArrH = null;
                ArrayList arrayListO = null;
                Double dV = null;
                ArrayList arrayListO2 = null;
                AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
                Integer numZ = null;
                TokenBinding tokenBinding = null;
                String strK = null;
                AuthenticationExtensions authenticationExtensions = null;
                while (parcel.dataPosition() < iJ) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 2:
                            publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) cc7.j(parcel, i, PublicKeyCredentialRpEntity.CREATOR);
                            break;
                        case 3:
                            publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) cc7.j(parcel, i, PublicKeyCredentialUserEntity.CREATOR);
                            break;
                        case 4:
                            bArrH = cc7.h(i, parcel);
                            break;
                        case 5:
                            arrayListO = cc7.o(parcel, i, PublicKeyCredentialParameters.CREATOR);
                            break;
                        case 6:
                            dV = cc7.v(i, parcel);
                            break;
                        case 7:
                            arrayListO2 = cc7.o(parcel, i, PublicKeyCredentialDescriptor.CREATOR);
                            break;
                        case '\b':
                            authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) cc7.j(parcel, i, AuthenticatorSelectionCriteria.CREATOR);
                            break;
                        case '\t':
                            numZ = cc7.z(i, parcel);
                            break;
                        case '\n':
                            tokenBinding = (TokenBinding) cc7.j(parcel, i, TokenBinding.CREATOR);
                            break;
                        case 11:
                            strK = cc7.k(i, parcel);
                            break;
                        case '\f':
                            authenticationExtensions = (AuthenticationExtensions) cc7.j(parcel, i, AuthenticationExtensions.CREATOR);
                            break;
                        default:
                            cc7.E(i, parcel);
                            break;
                    }
                }
                cc7.p(iJ, parcel);
                return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArrH, arrayListO, dV, arrayListO2, authenticatorSelectionCriteria, numZ, tokenBinding, strK, authenticationExtensions);
            case 1:
                int iJ2 = cc7.J(parcel);
                yj9 yj9Var = null;
                int iY = 0;
                IBinder iBinderX = null;
                while (parcel.dataPosition() < iJ2) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        iY = cc7.y(i2, parcel);
                    } else if (c != 2) {
                        cc7.E(i2, parcel);
                    } else {
                        iBinderX = cc7.x(i2, parcel);
                    }
                }
                cc7.p(iJ2, parcel);
                if (iBinderX != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinderX.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IBooleanCallback");
                    yj9Var = iInterfaceQueryLocalInterface instanceof yj9 ? (yj9) iInterfaceQueryLocalInterface : new yj9(iBinderX);
                }
                zzak zzakVar = new zzak();
                zzakVar.a = iY;
                zzakVar.b = yj9Var;
                return zzakVar;
            case 2:
                int iJ3 = cc7.J(parcel);
                String strK2 = null;
                String strK3 = null;
                byte[] bArrH2 = null;
                AuthenticatorAttestationResponse authenticatorAttestationResponse = null;
                AuthenticatorAssertionResponse authenticatorAssertionResponse = null;
                AuthenticatorErrorResponse authenticatorErrorResponse = null;
                AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = null;
                String strK4 = null;
                while (parcel.dataPosition() < iJ3) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 1:
                            strK2 = cc7.k(i3, parcel);
                            break;
                        case 2:
                            strK3 = cc7.k(i3, parcel);
                            break;
                        case 3:
                            bArrH2 = cc7.h(i3, parcel);
                            break;
                        case 4:
                            authenticatorAttestationResponse = (AuthenticatorAttestationResponse) cc7.j(parcel, i3, AuthenticatorAttestationResponse.CREATOR);
                            break;
                        case 5:
                            authenticatorAssertionResponse = (AuthenticatorAssertionResponse) cc7.j(parcel, i3, AuthenticatorAssertionResponse.CREATOR);
                            break;
                        case 6:
                            authenticatorErrorResponse = (AuthenticatorErrorResponse) cc7.j(parcel, i3, AuthenticatorErrorResponse.CREATOR);
                            break;
                        case 7:
                            authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) cc7.j(parcel, i3, AuthenticationExtensionsClientOutputs.CREATOR);
                            break;
                        case '\b':
                            strK4 = cc7.k(i3, parcel);
                            break;
                        default:
                            cc7.E(i3, parcel);
                            break;
                    }
                }
                cc7.p(iJ3, parcel);
                return new PublicKeyCredential(strK2, strK3, bArrH2, authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, strK4);
            case 3:
                int iJ4 = cc7.J(parcel);
                String strK5 = null;
                byte[] bArrH3 = null;
                ArrayList arrayListO3 = null;
                while (parcel.dataPosition() < iJ4) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 2) {
                        strK5 = cc7.k(i4, parcel);
                    } else if (c2 == 3) {
                        bArrH3 = cc7.h(i4, parcel);
                    } else if (c2 != 4) {
                        cc7.E(i4, parcel);
                    } else {
                        arrayListO3 = cc7.o(parcel, i4, Transport.CREATOR);
                    }
                }
                cc7.p(iJ4, parcel);
                return new PublicKeyCredentialDescriptor(strK5, bArrH3, arrayListO3);
            case 4:
                int iJ5 = cc7.J(parcel);
                String strK6 = null;
                Integer numZ2 = null;
                while (parcel.dataPosition() < iJ5) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 2) {
                        strK6 = cc7.k(i5, parcel);
                    } else if (c3 != 3) {
                        cc7.E(i5, parcel);
                    } else {
                        numZ2 = cc7.z(i5, parcel);
                    }
                }
                cc7.p(iJ5, parcel);
                return new PublicKeyCredentialParameters(strK6, numZ2.intValue());
            case 5:
                int iJ6 = cc7.J(parcel);
                byte[] bArrH4 = null;
                Double dV2 = null;
                String strK7 = null;
                ArrayList arrayListO4 = null;
                Integer numZ3 = null;
                TokenBinding tokenBinding2 = null;
                String strK8 = null;
                AuthenticationExtensions authenticationExtensions2 = null;
                Long lB = null;
                while (parcel.dataPosition() < iJ6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 2:
                            bArrH4 = cc7.h(i6, parcel);
                            break;
                        case 3:
                            dV2 = cc7.v(i6, parcel);
                            break;
                        case 4:
                            strK7 = cc7.k(i6, parcel);
                            break;
                        case 5:
                            arrayListO4 = cc7.o(parcel, i6, PublicKeyCredentialDescriptor.CREATOR);
                            break;
                        case 6:
                            numZ3 = cc7.z(i6, parcel);
                            break;
                        case 7:
                            tokenBinding2 = (TokenBinding) cc7.j(parcel, i6, TokenBinding.CREATOR);
                            break;
                        case '\b':
                            strK8 = cc7.k(i6, parcel);
                            break;
                        case '\t':
                            authenticationExtensions2 = (AuthenticationExtensions) cc7.j(parcel, i6, AuthenticationExtensions.CREATOR);
                            break;
                        case '\n':
                            lB = cc7.B(i6, parcel);
                            break;
                        default:
                            cc7.E(i6, parcel);
                            break;
                    }
                }
                cc7.p(iJ6, parcel);
                return new PublicKeyCredentialRequestOptions(bArrH4, dV2, strK7, arrayListO4, numZ3, tokenBinding2, strK8, authenticationExtensions2, lB);
            case 6:
                int iJ7 = cc7.J(parcel);
                String strK9 = null;
                String strK10 = null;
                String strK11 = null;
                while (parcel.dataPosition() < iJ7) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 == 2) {
                        strK9 = cc7.k(i7, parcel);
                    } else if (c4 == 3) {
                        strK10 = cc7.k(i7, parcel);
                    } else if (c4 != 4) {
                        cc7.E(i7, parcel);
                    } else {
                        strK11 = cc7.k(i7, parcel);
                    }
                }
                cc7.p(iJ7, parcel);
                return new PublicKeyCredentialRpEntity(strK9, strK10, strK11);
            case 7:
                int iJ8 = cc7.J(parcel);
                String strK12 = null;
                while (parcel.dataPosition() < iJ8) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 1) {
                        cc7.y(i8, parcel);
                    } else if (c5 != 2) {
                        cc7.E(i8, parcel);
                    } else {
                        strK12 = cc7.k(i8, parcel);
                    }
                }
                cc7.p(iJ8, parcel);
                return new zzaq(strK12);
            case 8:
                int iJ9 = cc7.J(parcel);
                byte[] bArrH5 = null;
                String strK13 = null;
                String strK14 = null;
                String strK15 = null;
                while (parcel.dataPosition() < iJ9) {
                    int i9 = parcel.readInt();
                    char c6 = (char) i9;
                    if (c6 == 2) {
                        bArrH5 = cc7.h(i9, parcel);
                    } else if (c6 == 3) {
                        strK13 = cc7.k(i9, parcel);
                    } else if (c6 == 4) {
                        strK14 = cc7.k(i9, parcel);
                    } else if (c6 != 5) {
                        cc7.E(i9, parcel);
                    } else {
                        strK15 = cc7.k(i9, parcel);
                    }
                }
                cc7.p(iJ9, parcel);
                return new PublicKeyCredentialUserEntity(strK13, bArrH5, strK14, strK15);
            case 9:
                int iJ10 = cc7.J(parcel);
                IBinder iBinderX2 = null;
                IBinder iBinderX3 = null;
                String strK16 = null;
                byte[] bArrH6 = null;
                IBinder iBinderX4 = null;
                zzjk zzjkVar = null;
                zzo zzoVar = null;
                int iY2 = 0;
                while (parcel.dataPosition() < iJ10) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iBinderX2 = cc7.x(i10, parcel);
                            break;
                        case 2:
                            iBinderX3 = cc7.x(i10, parcel);
                            break;
                        case 3:
                            strK16 = cc7.k(i10, parcel);
                            break;
                        case 4:
                            bArrH6 = cc7.h(i10, parcel);
                            break;
                        case 5:
                            iBinderX4 = cc7.x(i10, parcel);
                            break;
                        case 6:
                            iY2 = cc7.y(i10, parcel);
                            break;
                        case 7:
                            zzjkVar = (zzjk) cc7.j(parcel, i10, zzjk.CREATOR);
                            break;
                        case '\b':
                            zzoVar = (zzo) cc7.j(parcel, i10, zzo.CREATOR);
                            break;
                        default:
                            cc7.E(i10, parcel);
                            break;
                    }
                }
                cc7.p(iJ10, parcel);
                return new zzar(iBinderX2, iBinderX3, strK16, bArrH6, iBinderX4, iY2, zzjkVar, zzoVar);
            case 10:
                int iJ11 = cc7.J(parcel);
                String strK17 = null;
                String strK18 = null;
                while (parcel.dataPosition() < iJ11) {
                    int i11 = parcel.readInt();
                    char c7 = (char) i11;
                    if (c7 == 2) {
                        strK17 = cc7.k(i11, parcel);
                    } else if (c7 != 3) {
                        cc7.E(i11, parcel);
                    } else {
                        strK18 = cc7.k(i11, parcel);
                    }
                }
                cc7.p(iJ11, parcel);
                return new TokenBinding(strK17, strK18);
            case 11:
                int iJ12 = cc7.J(parcel);
                boolean zU = false;
                while (parcel.dataPosition() < iJ12) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        cc7.E(i12, parcel);
                    } else {
                        zU = cc7.u(i12, parcel);
                    }
                }
                cc7.p(iJ12, parcel);
                return new UserVerificationMethodExtension(zU);
            case 12:
                int iJ13 = cc7.J(parcel);
                int iY3 = 0;
                String strK19 = null;
                while (parcel.dataPosition() < iJ13) {
                    int i13 = parcel.readInt();
                    char c8 = (char) i13;
                    if (c8 == 1) {
                        cc7.y(i13, parcel);
                    } else if (c8 == 2) {
                        strK19 = cc7.k(i13, parcel);
                    } else if (c8 != 3) {
                        cc7.E(i13, parcel);
                    } else {
                        iY3 = cc7.y(i13, parcel);
                    }
                }
                cc7.p(iJ13, parcel);
                return new zzav(strK19, iY3);
            case 13:
                int iJ14 = cc7.J(parcel);
                long jA = 0;
                pp9 op9Var = null;
                IBinder iBinderX5 = null;
                while (parcel.dataPosition() < iJ14) {
                    int i14 = parcel.readInt();
                    char c9 = (char) i14;
                    if (c9 == 1) {
                        iBinderX5 = cc7.x(i14, parcel);
                    } else if (c9 != 2) {
                        cc7.E(i14, parcel);
                    } else {
                        jA = cc7.A(i14, parcel);
                    }
                }
                cc7.p(iJ14, parcel);
                if (iBinderX5 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderX5.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
                    op9Var = iInterfaceQueryLocalInterface2 instanceof pp9 ? (pp9) iInterfaceQueryLocalInterface2 : new op9(iBinderX5);
                }
                com.google.android.gms.internal.nearby.zzav zzavVar = new com.google.android.gms.internal.nearby.zzav();
                zzavVar.a = op9Var;
                zzavVar.b = jA;
                return zzavVar;
            case 14:
                try {
                    return zzay.a(parcel.readString());
                } catch (zzax e) {
                    throw new RuntimeException(e);
                }
            case 15:
                int iJ15 = cc7.J(parcel);
                while (parcel.dataPosition() < iJ15) {
                    cc7.E(parcel.readInt(), parcel);
                }
                cc7.p(iJ15, parcel);
                return new com.google.android.gms.internal.nearby.zzax();
            case 16:
                int iJ16 = cc7.J(parcel);
                String strK20 = null;
                while (parcel.dataPosition() < iJ16) {
                    int i15 = parcel.readInt();
                    char c10 = (char) i15;
                    if (c10 == 1) {
                        cc7.y(i15, parcel);
                    } else if (c10 != 2) {
                        cc7.E(i15, parcel);
                    } else {
                        strK20 = cc7.k(i15, parcel);
                    }
                }
                cc7.p(iJ16, parcel);
                return new com.google.android.gms.internal.auth.zzax(strK20);
            case 17:
                int iJ17 = cc7.J(parcel);
                ArrayList arrayListO5 = null;
                while (parcel.dataPosition() < iJ17) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        cc7.E(i16, parcel);
                    } else {
                        arrayListO5 = cc7.o(parcel, i16, UvmEntry.CREATOR);
                    }
                }
                cc7.p(iJ17, parcel);
                return new UvmEntries(arrayListO5);
            case 18:
                int iJ18 = cc7.J(parcel);
                boolean zU2 = true;
                boolean zU3 = true;
                boolean zU4 = true;
                boolean zU5 = true;
                boolean zU6 = true;
                boolean zU7 = true;
                boolean zU8 = true;
                boolean zU9 = true;
                boolean zU10 = true;
                boolean zU11 = true;
                boolean zU12 = false;
                boolean zU13 = false;
                boolean zU14 = false;
                boolean zU15 = false;
                int iY4 = 0;
                int iY5 = 0;
                boolean zU16 = false;
                boolean zU17 = false;
                int iY6 = 0;
                int iY7 = 0;
                boolean zU18 = false;
                Strategy strategy = null;
                byte[] bArrH7 = null;
                ParcelUuid parcelUuid = null;
                byte[] bArrH8 = null;
                zzac[] zzacVarArr = null;
                int[] iArrI = null;
                int[] iArrI2 = null;
                byte[] bArrH9 = null;
                long jA2 = 0;
                boolean zU19 = true;
                boolean zU20 = true;
                boolean zU21 = true;
                boolean zU22 = true;
                while (parcel.dataPosition() < iJ18) {
                    int i17 = parcel.readInt();
                    boolean z = zU13;
                    switch ((char) i17) {
                        case 1:
                            strategy = (Strategy) cc7.j(parcel, i17, Strategy.CREATOR);
                            break;
                        case 2:
                            zU2 = cc7.u(i17, parcel);
                            break;
                        case 3:
                            zU19 = cc7.u(i17, parcel);
                            break;
                        case 4:
                            zU20 = cc7.u(i17, parcel);
                            break;
                        case 5:
                            zU21 = cc7.u(i17, parcel);
                            break;
                        case 6:
                            bArrH7 = cc7.h(i17, parcel);
                            break;
                        case 7:
                            zU12 = cc7.u(i17, parcel);
                            break;
                        case '\b':
                            parcelUuid = (ParcelUuid) cc7.j(parcel, i17, ParcelUuid.CREATOR);
                            break;
                        case '\t':
                            zU22 = cc7.u(i17, parcel);
                            break;
                        case '\n':
                            zU3 = cc7.u(i17, parcel);
                            break;
                        case 11:
                            zU4 = cc7.u(i17, parcel);
                            break;
                        case '\f':
                            zU14 = cc7.u(i17, parcel);
                            break;
                        case '\r':
                            zU13 = cc7.u(i17, parcel);
                            continue;
                        case 14:
                            zU18 = cc7.u(i17, parcel);
                            break;
                        case 15:
                            iY7 = cc7.y(i17, parcel);
                            break;
                        case 16:
                            iY6 = cc7.y(i17, parcel);
                            break;
                        case 17:
                            bArrH8 = cc7.h(i17, parcel);
                            break;
                        case 18:
                            jA2 = cc7.A(i17, parcel);
                            break;
                        case 19:
                            zzacVarArr = (zzac[]) cc7.n(parcel, i17, zzac.CREATOR);
                            break;
                        case 20:
                            zU17 = cc7.u(i17, parcel);
                            break;
                        case 21:
                            zU11 = cc7.u(i17, parcel);
                            break;
                        case 22:
                            zU15 = cc7.u(i17, parcel);
                            break;
                        case 23:
                            zU10 = cc7.u(i17, parcel);
                            break;
                        case 24:
                            iArrI = cc7.i(i17, parcel);
                            break;
                        case 25:
                            iArrI2 = cc7.i(i17, parcel);
                            break;
                        case 26:
                            zU9 = cc7.u(i17, parcel);
                            break;
                        case 27:
                            iY4 = cc7.y(i17, parcel);
                            break;
                        case 28:
                            bArrH9 = cc7.h(i17, parcel);
                            break;
                        case 29:
                            zU8 = cc7.u(i17, parcel);
                            break;
                        case 30:
                            iY5 = cc7.y(i17, parcel);
                            break;
                        case 31:
                            zU16 = cc7.u(i17, parcel);
                            break;
                        case ' ':
                            zU7 = cc7.u(i17, parcel);
                            break;
                        case '!':
                            zU6 = cc7.u(i17, parcel);
                            break;
                        case '\"':
                            zU5 = cc7.u(i17, parcel);
                            break;
                        default:
                            cc7.E(i17, parcel);
                            break;
                    }
                    zU13 = z;
                }
                cc7.p(iJ18, parcel);
                AdvertisingOptions advertisingOptions = new AdvertisingOptions();
                advertisingOptions.a = strategy;
                advertisingOptions.b = zU2;
                advertisingOptions.c = zU19;
                advertisingOptions.d = zU20;
                advertisingOptions.e = zU21;
                advertisingOptions.f = bArrH7;
                advertisingOptions.g = zU12;
                advertisingOptions.h = parcelUuid;
                advertisingOptions.i = zU22;
                advertisingOptions.j = zU3;
                advertisingOptions.k = zU4;
                advertisingOptions.l = zU14;
                advertisingOptions.m = zU13;
                advertisingOptions.n = zU18;
                advertisingOptions.o = iY7;
                advertisingOptions.p = iY6;
                advertisingOptions.q = bArrH8;
                advertisingOptions.r = jA2;
                advertisingOptions.s = zzacVarArr;
                advertisingOptions.t = zU17;
                advertisingOptions.u = zU11;
                advertisingOptions.v = zU15;
                advertisingOptions.w = zU10;
                advertisingOptions.x = iArrI;
                advertisingOptions.y = iArrI2;
                advertisingOptions.z = zU9;
                advertisingOptions.A = iY4;
                advertisingOptions.B = bArrH9;
                advertisingOptions.C = zU8;
                advertisingOptions.D = iY5;
                advertisingOptions.E = zU16;
                advertisingOptions.F = zU7;
                advertisingOptions.G = zU6;
                advertisingOptions.H = zU5;
                return advertisingOptions;
            case 19:
                int iJ19 = cc7.J(parcel);
                int iY8 = 0;
                boolean zU23 = false;
                int iY9 = 0;
                ArrayList arrayListO6 = null;
                ArrayList arrayListO7 = null;
                ArrayList arrayListO8 = null;
                while (parcel.dataPosition() < iJ19) {
                    int i18 = parcel.readInt();
                    char c11 = (char) i18;
                    if (c11 == 1) {
                        arrayListO6 = cc7.o(parcel, i18, com.google.android.gms.nearby.messages.internal.zzac.CREATOR);
                    } else if (c11 == 2) {
                        arrayListO7 = cc7.o(parcel, i18, zzis.CREATOR);
                    } else if (c11 == 3) {
                        zU23 = cc7.u(i18, parcel);
                    } else if (c11 == 4) {
                        arrayListO8 = cc7.o(parcel, i18, zzin.CREATOR);
                    } else if (c11 == 5) {
                        iY9 = cc7.y(i18, parcel);
                    } else if (c11 != 1000) {
                        cc7.E(i18, parcel);
                    } else {
                        iY8 = cc7.y(i18, parcel);
                    }
                }
                cc7.p(iJ19, parcel);
                return new MessageFilter(iY8, arrayListO6, arrayListO7, zU23, arrayListO8, iY9);
            case 20:
                int iJ20 = cc7.J(parcel);
                int iY10 = 0;
                int iY11 = 0;
                int iY12 = 0;
                while (parcel.dataPosition() < iJ20) {
                    int i19 = parcel.readInt();
                    char c12 = (char) i19;
                    if (c12 == 1) {
                        iY10 = cc7.y(i19, parcel);
                    } else if (c12 == 2) {
                        iY11 = cc7.y(i19, parcel);
                    } else if (c12 != 3) {
                        cc7.E(i19, parcel);
                    } else {
                        iY12 = cc7.y(i19, parcel);
                    }
                }
                cc7.p(iJ20, parcel);
                return new zza(iY10, iY11, iY12);
            case 21:
                int iJ21 = cc7.J(parcel);
                String strK21 = null;
                while (parcel.dataPosition() < iJ21) {
                    int i20 = parcel.readInt();
                    if (((char) i20) != 2) {
                        cc7.E(i20, parcel);
                    } else {
                        strK21 = cc7.k(i20, parcel);
                    }
                }
                cc7.p(iJ21, parcel);
                return new com.google.android.gms.safetynet.zza(strK21);
            case 22:
                int iJ22 = cc7.J(parcel);
                PendingIntent pendingIntent = null;
                Bundle bundleG = null;
                byte[] bArrH10 = null;
                int iY13 = 0;
                int iY14 = 0;
                int iY15 = 0;
                while (parcel.dataPosition() < iJ22) {
                    int i21 = parcel.readInt();
                    char c13 = (char) i21;
                    if (c13 == 1) {
                        iY14 = cc7.y(i21, parcel);
                    } else if (c13 == 2) {
                        pendingIntent = (PendingIntent) cc7.j(parcel, i21, PendingIntent.CREATOR);
                    } else if (c13 == 3) {
                        iY15 = cc7.y(i21, parcel);
                    } else if (c13 == 4) {
                        bundleG = cc7.g(i21, parcel);
                    } else if (c13 == 5) {
                        bArrH10 = cc7.h(i21, parcel);
                    } else if (c13 != 1000) {
                        cc7.E(i21, parcel);
                    } else {
                        iY13 = cc7.y(i21, parcel);
                    }
                }
                cc7.p(iJ22, parcel);
                return new ProxyResponse(iY13, iY14, pendingIntent, iY15, bundleG, bArrH10);
            case 23:
                return new zzd(parcel.readStrongBinder());
            case 24:
                int iJ23 = cc7.J(parcel);
                int iY16 = 0;
                boolean zU24 = false;
                long jA3 = -1;
                String strK22 = null;
                while (parcel.dataPosition() < iJ23) {
                    int i22 = parcel.readInt();
                    char c14 = (char) i22;
                    if (c14 == 1) {
                        strK22 = cc7.k(i22, parcel);
                    } else if (c14 == 2) {
                        iY16 = cc7.y(i22, parcel);
                    } else if (c14 == 3) {
                        jA3 = cc7.A(i22, parcel);
                    } else if (c14 != 4) {
                        cc7.E(i22, parcel);
                    } else {
                        zU24 = cc7.u(i22, parcel);
                    }
                }
                cc7.p(iJ23, parcel);
                return new Feature(strK22, iY16, zU24, jA3);
            case 25:
                int iJ24 = cc7.J(parcel);
                String strK23 = null;
                int iY17 = 0;
                String strK24 = null;
                while (parcel.dataPosition() < iJ24) {
                    int i23 = parcel.readInt();
                    char c15 = (char) i23;
                    if (c15 == 2) {
                        iY17 = cc7.y(i23, parcel);
                    } else if (c15 == 3) {
                        strK23 = cc7.k(i23, parcel);
                    } else if (c15 != 4) {
                        cc7.E(i23, parcel);
                    } else {
                        strK24 = cc7.k(i23, parcel);
                    }
                }
                cc7.p(iJ24, parcel);
                return new ChannelIdValue(iY17, strK23, strK24);
            case 26:
                int iJ25 = cc7.J(parcel);
                String strK25 = null;
                int iY18 = 0;
                int iY19 = 0;
                Account account = null;
                while (parcel.dataPosition() < iJ25) {
                    int i24 = parcel.readInt();
                    char c16 = (char) i24;
                    if (c16 == 1) {
                        iY18 = cc7.y(i24, parcel);
                    } else if (c16 == 2) {
                        iY19 = cc7.y(i24, parcel);
                    } else if (c16 == 3) {
                        strK25 = cc7.k(i24, parcel);
                    } else if (c16 != 4) {
                        cc7.E(i24, parcel);
                    } else {
                        account = (Account) cc7.j(parcel, i24, Account.CREATOR);
                    }
                }
                cc7.p(iJ25, parcel);
                return new AccountChangeEventsRequest(iY18, iY19, strK25, account);
            case 27:
                int iJ26 = cc7.J(parcel);
                String strK26 = null;
                byte[] bArrH11 = null;
                while (parcel.dataPosition() < iJ26) {
                    int i25 = parcel.readInt();
                    char c17 = (char) i25;
                    if (c17 == 1) {
                        cc7.y(i25, parcel);
                    } else if (c17 == 2) {
                        strK26 = cc7.k(i25, parcel);
                    } else if (c17 != 3) {
                        cc7.E(i25, parcel);
                    } else {
                        bArrH11 = cc7.h(i25, parcel);
                    }
                }
                cc7.p(iJ26, parcel);
                return new zzaz(strK26, bArrH11);
            case 28:
                int iJ27 = cc7.J(parcel);
                int iY20 = 0;
                short s = 0;
                short s2 = 0;
                while (parcel.dataPosition() < iJ27) {
                    int i26 = parcel.readInt();
                    char c18 = (char) i26;
                    if (c18 == 1) {
                        iY20 = cc7.y(i26, parcel);
                    } else if (c18 == 2) {
                        cc7.L(parcel, i26, 4);
                        s = (short) parcel.readInt();
                    } else if (c18 != 3) {
                        cc7.E(i26, parcel);
                    } else {
                        cc7.L(parcel, i26, 4);
                        s2 = (short) parcel.readInt();
                    }
                }
                cc7.p(iJ27, parcel);
                return new UvmEntry(iY20, s, s2);
            default:
                int iJ28 = cc7.J(parcel);
                String strK27 = null;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iJ28) {
                    int i27 = parcel.readInt();
                    char c19 = (char) i27;
                    if (c19 == 1) {
                        cc7.y(i27, parcel);
                    } else if (c19 == 2) {
                        strK27 = cc7.k(i27, parcel);
                    } else if (c19 != 3) {
                        cc7.E(i27, parcel);
                    } else {
                        pendingIntent2 = (PendingIntent) cc7.j(parcel, i27, PendingIntent.CREATOR);
                    }
                }
                cc7.p(iJ28, parcel);
                return new zzbb(strK27, pendingIntent2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new PublicKeyCredentialCreationOptions[i];
            case 1:
                return new zzak[i];
            case 2:
                return new PublicKeyCredential[i];
            case 3:
                return new PublicKeyCredentialDescriptor[i];
            case 4:
                return new PublicKeyCredentialParameters[i];
            case 5:
                return new PublicKeyCredentialRequestOptions[i];
            case 6:
                return new PublicKeyCredentialRpEntity[i];
            case 7:
                return new zzaq[i];
            case 8:
                return new PublicKeyCredentialUserEntity[i];
            case 9:
                return new zzar[i];
            case 10:
                return new TokenBinding[i];
            case 11:
                return new UserVerificationMethodExtension[i];
            case 12:
                return new zzav[i];
            case 13:
                return new com.google.android.gms.internal.nearby.zzav[i];
            case 14:
                return new zzay[i];
            case 15:
                return new com.google.android.gms.internal.nearby.zzax[i];
            case 16:
                return new com.google.android.gms.internal.auth.zzax[i];
            case 17:
                return new UvmEntries[i];
            case 18:
                return new AdvertisingOptions[i];
            case 19:
                return new MessageFilter[i];
            case 20:
                return new zza[i];
            case 21:
                return new com.google.android.gms.safetynet.zza[i];
            case 22:
                return new ProxyResponse[i];
            case 23:
                return new zzd[i];
            case 24:
                return new Feature[i];
            case 25:
                return new ChannelIdValue[i];
            case 26:
                return new AccountChangeEventsRequest[i];
            case 27:
                return new zzaz[i];
            case 28:
                return new UvmEntry[i];
            default:
                return new zzbb[i];
        }
    }
}
