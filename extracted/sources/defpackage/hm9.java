package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import com.google.android.gms.fido.fido2.api.common.zzab;
import com.google.android.gms.fido.fido2.api.common.zzad;
import com.google.android.gms.fido.fido2.api.common.zzag;
import com.google.android.gms.fido.fido2.api.common.zzai;
import com.google.android.gms.fido.fido2.api.common.zzf;
import com.google.android.gms.fido.fido2.api.common.zzh;
import com.google.android.gms.fido.fido2.api.common.zzs;
import com.google.android.gms.fido.fido2.api.common.zzu;
import com.google.android.gms.fido.fido2.api.common.zzz;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.nearby.zzeu;
import com.google.android.gms.internal.nearby.zziq;
import com.google.android.gms.internal.nearby.zzjk;
import com.google.android.gms.nearby.connection.AppIdentifier;
import com.google.android.gms.nearby.connection.AppMetadata;
import com.google.android.gms.nearby.connection.zzo;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import com.google.android.gms.nearby.messages.internal.Update;
import com.google.android.gms.nearby.messages.internal.zza;
import com.google.android.gms.nearby.messages.internal.zzae;
import com.google.android.gms.nearby.messages.internal.zzbz;
import com.google.android.gms.nearby.messages.internal.zzcb;
import com.google.android.gms.nearby.messages.internal.zzce;
import com.google.android.gms.nearby.messages.internal.zzcg;
import com.google.android.gms.nearby.messages.internal.zze;
import com.google.android.gms.safetynet.HarmfulAppsData;
import com.google.android.gms.safetynet.zzd;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hm9 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ hm9(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int iJ = cc7.J(parcel);
                String strK = null;
                int iY = 0;
                while (parcel.dataPosition() < iJ) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iY = cc7.y(i, parcel);
                    } else if (c != 2) {
                        cc7.E(i, parcel);
                    } else {
                        strK = cc7.k(i, parcel);
                    }
                }
                cc7.p(iJ, parcel);
                return new zzbw(iY, strK);
            case 1:
                int iJ2 = cc7.J(parcel);
                String strK2 = null;
                while (parcel.dataPosition() < iJ2) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 1) {
                        cc7.E(i2, parcel);
                    } else {
                        strK2 = cc7.k(i2, parcel);
                    }
                }
                cc7.p(iJ2, parcel);
                return new AppIdentifier(strK2);
            case 2:
                int iJ3 = cc7.J(parcel);
                String strK3 = null;
                int iY2 = 0;
                byte[] bArrH = null;
                while (parcel.dataPosition() < iJ3) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 2) {
                        strK3 = cc7.k(i3, parcel);
                    } else if (c2 == 3) {
                        bArrH = cc7.h(i3, parcel);
                    } else if (c2 != 4) {
                        cc7.E(i3, parcel);
                    } else {
                        iY2 = cc7.y(i3, parcel);
                    }
                }
                cc7.p(iJ3, parcel);
                return new HarmfulAppsData(strK3, bArrH, iY2);
            case 3:
                int iJ4 = cc7.J(parcel);
                int iY3 = 0;
                boolean zU = true;
                int iY4 = 0;
                int iY5 = 0;
                while (parcel.dataPosition() < iJ4) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        iY3 = cc7.y(i4, parcel);
                    } else if (c3 == 2) {
                        iY4 = cc7.y(i4, parcel);
                    } else if (c3 == 3) {
                        iY5 = cc7.y(i4, parcel);
                    } else if (c3 != 4) {
                        cc7.E(i4, parcel);
                    } else {
                        zU = cc7.u(i4, parcel);
                    }
                }
                cc7.p(iJ4, parcel);
                return new ComplianceOptions(iY3, iY4, zU, iY5);
            case 4:
                int iJ5 = cc7.J(parcel);
                UvmEntries uvmEntries = null;
                zzf zzfVar = null;
                AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
                zzh zzhVar = null;
                while (parcel.dataPosition() < iJ5) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 1) {
                        uvmEntries = (UvmEntries) cc7.j(parcel, i5, UvmEntries.CREATOR);
                    } else if (c4 == 2) {
                        zzfVar = (zzf) cc7.j(parcel, i5, zzf.CREATOR);
                    } else if (c4 == 3) {
                        authenticationExtensionsCredPropsOutputs = (AuthenticationExtensionsCredPropsOutputs) cc7.j(parcel, i5, AuthenticationExtensionsCredPropsOutputs.CREATOR);
                    } else if (c4 != 4) {
                        cc7.E(i5, parcel);
                    } else {
                        zzhVar = (zzh) cc7.j(parcel, i5, zzh.CREATOR);
                    }
                }
                cc7.p(iJ5, parcel);
                return new AuthenticationExtensionsClientOutputs(uvmEntries, zzfVar, authenticationExtensionsCredPropsOutputs, zzhVar);
            case 5:
                int i6 = parcel.readInt();
                for (ErrorCode errorCode : ErrorCode.values()) {
                    if (i6 == errorCode.a) {
                        return errorCode;
                    }
                }
                return ErrorCode.b;
            case 6:
                int iJ6 = cc7.J(parcel);
                ArrayList arrayListO = null;
                int iY6 = 0;
                while (parcel.dataPosition() < iJ6) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 1) {
                        iY6 = cc7.y(i7, parcel);
                    } else if (c5 != 2) {
                        cc7.E(i7, parcel);
                    } else {
                        arrayListO = cc7.o(parcel, i7, AccountChangeEvent.CREATOR);
                    }
                }
                cc7.p(iJ6, parcel);
                return new AccountChangeEventsResponse(iY6, arrayListO);
            case 7:
                int iJ7 = cc7.J(parcel);
                int iY7 = 0;
                boolean zU2 = false;
                boolean zU3 = false;
                int iY8 = 0;
                zzae zzaeVar = null;
                Strategy strategy = null;
                IBinder iBinderX = null;
                String strK4 = null;
                String strK5 = null;
                IBinder iBinderX2 = null;
                ClientAppContext clientAppContext = null;
                while (parcel.dataPosition() < iJ7) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 1:
                            iY7 = cc7.y(i8, parcel);
                            break;
                        case 2:
                            zzaeVar = (zzae) cc7.j(parcel, i8, zzae.CREATOR);
                            break;
                        case 3:
                            strategy = (Strategy) cc7.j(parcel, i8, Strategy.CREATOR);
                            break;
                        case 4:
                            iBinderX = cc7.x(i8, parcel);
                            break;
                        case 5:
                            strK4 = cc7.k(i8, parcel);
                            break;
                        case 6:
                            strK5 = cc7.k(i8, parcel);
                            break;
                        case 7:
                            zU2 = cc7.u(i8, parcel);
                            break;
                        case '\b':
                            iBinderX2 = cc7.x(i8, parcel);
                            break;
                        case '\t':
                            zU3 = cc7.u(i8, parcel);
                            break;
                        case '\n':
                            clientAppContext = (ClientAppContext) cc7.j(parcel, i8, ClientAppContext.CREATOR);
                            break;
                        case 11:
                            iY8 = cc7.y(i8, parcel);
                            break;
                        default:
                            cc7.E(i8, parcel);
                            break;
                    }
                }
                cc7.p(iJ7, parcel);
                return new zzbz(iY7, zzaeVar, strategy, iBinderX, strK4, strK5, zU2, iBinderX2, zU3, clientAppContext, iY8);
            case 8:
                int iJ8 = cc7.J(parcel);
                IBinder iBinderX3 = null;
                IBinder iBinderX4 = null;
                String strK6 = null;
                ClientAppContext clientAppContext2 = null;
                int iY9 = 0;
                boolean zU4 = false;
                while (parcel.dataPosition() < iJ8) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            iY9 = cc7.y(i9, parcel);
                            break;
                        case 2:
                            iBinderX3 = cc7.x(i9, parcel);
                            break;
                        case 3:
                            iBinderX4 = cc7.x(i9, parcel);
                            break;
                        case 4:
                            zU4 = cc7.u(i9, parcel);
                            break;
                        case 5:
                            strK6 = cc7.k(i9, parcel);
                            break;
                        case 6:
                            clientAppContext2 = (ClientAppContext) cc7.j(parcel, i9, ClientAppContext.CREATOR);
                            break;
                        default:
                            cc7.E(i9, parcel);
                            break;
                    }
                }
                cc7.p(iJ8, parcel);
                return new zzcb(iY9, iBinderX3, iBinderX4, zU4, strK6, clientAppContext2);
            case 9:
                int iJ9 = cc7.J(parcel);
                int iY10 = 0;
                int iY11 = 0;
                boolean zU5 = false;
                boolean zU6 = false;
                boolean zU7 = false;
                int iY12 = 0;
                int iY13 = 0;
                IBinder iBinderX5 = null;
                Strategy strategy2 = null;
                IBinder iBinderX6 = null;
                MessageFilter messageFilter = null;
                PendingIntent pendingIntent = null;
                String strK7 = null;
                String strK8 = null;
                byte[] bArrH2 = null;
                IBinder iBinderX7 = null;
                ClientAppContext clientAppContext3 = null;
                while (parcel.dataPosition() < iJ9) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            iY10 = cc7.y(i10, parcel);
                            break;
                        case 2:
                            iBinderX5 = cc7.x(i10, parcel);
                            break;
                        case 3:
                            strategy2 = (Strategy) cc7.j(parcel, i10, Strategy.CREATOR);
                            break;
                        case 4:
                            iBinderX6 = cc7.x(i10, parcel);
                            break;
                        case 5:
                            messageFilter = (MessageFilter) cc7.j(parcel, i10, MessageFilter.CREATOR);
                            break;
                        case 6:
                            pendingIntent = (PendingIntent) cc7.j(parcel, i10, PendingIntent.CREATOR);
                            break;
                        case 7:
                            iY11 = cc7.y(i10, parcel);
                            break;
                        case '\b':
                            strK7 = cc7.k(i10, parcel);
                            break;
                        case '\t':
                            strK8 = cc7.k(i10, parcel);
                            break;
                        case '\n':
                            bArrH2 = cc7.h(i10, parcel);
                            break;
                        case 11:
                            zU5 = cc7.u(i10, parcel);
                            break;
                        case '\f':
                            iBinderX7 = cc7.x(i10, parcel);
                            break;
                        case '\r':
                            zU6 = cc7.u(i10, parcel);
                            break;
                        case 14:
                            clientAppContext3 = (ClientAppContext) cc7.j(parcel, i10, ClientAppContext.CREATOR);
                            break;
                        case 15:
                            zU7 = cc7.u(i10, parcel);
                            break;
                        case 16:
                            iY12 = cc7.y(i10, parcel);
                            break;
                        case 17:
                            iY13 = cc7.y(i10, parcel);
                            break;
                        default:
                            cc7.E(i10, parcel);
                            break;
                    }
                }
                cc7.p(iJ9, parcel);
                return new SubscribeRequest(iY10, iBinderX5, strategy2, iBinderX6, messageFilter, pendingIntent, iY11, strK7, strK8, bArrH2, zU5, iBinderX7, zU6, clientAppContext3, zU7, iY12, iY13);
            case 10:
                int iJ10 = cc7.J(parcel);
                zzae zzaeVar2 = null;
                IBinder iBinderX8 = null;
                String strK9 = null;
                String strK10 = null;
                ClientAppContext clientAppContext4 = null;
                int iY14 = 0;
                boolean zU8 = false;
                while (parcel.dataPosition() < iJ10) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iY14 = cc7.y(i11, parcel);
                            break;
                        case 2:
                            zzaeVar2 = (zzae) cc7.j(parcel, i11, zzae.CREATOR);
                            break;
                        case 3:
                            iBinderX8 = cc7.x(i11, parcel);
                            break;
                        case 4:
                            strK9 = cc7.k(i11, parcel);
                            break;
                        case 5:
                            strK10 = cc7.k(i11, parcel);
                            break;
                        case 6:
                            zU8 = cc7.u(i11, parcel);
                            break;
                        case 7:
                            clientAppContext4 = (ClientAppContext) cc7.j(parcel, i11, ClientAppContext.CREATOR);
                            break;
                        default:
                            cc7.E(i11, parcel);
                            break;
                    }
                }
                cc7.p(iJ10, parcel);
                return new zzce(iY14, zzaeVar2, iBinderX8, strK9, strK10, zU8, clientAppContext4);
            case 11:
                int iJ11 = cc7.J(parcel);
                IBinder iBinderX9 = null;
                IBinder iBinderX10 = null;
                PendingIntent pendingIntent2 = null;
                String strK11 = null;
                String strK12 = null;
                ClientAppContext clientAppContext5 = null;
                int iY15 = 0;
                int iY16 = 0;
                boolean zU9 = false;
                while (parcel.dataPosition() < iJ11) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            iY15 = cc7.y(i12, parcel);
                            break;
                        case 2:
                            iBinderX9 = cc7.x(i12, parcel);
                            break;
                        case 3:
                            iBinderX10 = cc7.x(i12, parcel);
                            break;
                        case 4:
                            pendingIntent2 = (PendingIntent) cc7.j(parcel, i12, PendingIntent.CREATOR);
                            break;
                        case 5:
                            iY16 = cc7.y(i12, parcel);
                            break;
                        case 6:
                            strK11 = cc7.k(i12, parcel);
                            break;
                        case 7:
                            strK12 = cc7.k(i12, parcel);
                            break;
                        case '\b':
                            zU9 = cc7.u(i12, parcel);
                            break;
                        case '\t':
                            clientAppContext5 = (ClientAppContext) cc7.j(parcel, i12, ClientAppContext.CREATOR);
                            break;
                        default:
                            cc7.E(i12, parcel);
                            break;
                    }
                }
                cc7.p(iJ11, parcel);
                return new zzcg(iY15, iBinderX9, iBinderX10, pendingIntent2, iY16, strK11, strK12, zU9, clientAppContext5);
            case 12:
                int iJ12 = cc7.J(parcel);
                Message message = null;
                zze zzeVar = null;
                zza zzaVar = null;
                zziq zziqVar = null;
                byte[] bArrH3 = null;
                int iY17 = 0;
                int iY18 = 0;
                while (parcel.dataPosition() < iJ12) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            iY17 = cc7.y(i13, parcel);
                            break;
                        case 2:
                            iY18 = cc7.y(i13, parcel);
                            break;
                        case 3:
                            message = (Message) cc7.j(parcel, i13, Message.CREATOR);
                            break;
                        case 4:
                            zzeVar = (zze) cc7.j(parcel, i13, zze.CREATOR);
                            break;
                        case 5:
                            zzaVar = (zza) cc7.j(parcel, i13, zza.CREATOR);
                            break;
                        case 6:
                            zziqVar = (zziq) cc7.j(parcel, i13, zziq.CREATOR);
                            break;
                        case 7:
                            bArrH3 = cc7.h(i13, parcel);
                            break;
                        default:
                            cc7.E(i13, parcel);
                            break;
                    }
                }
                cc7.p(iJ12, parcel);
                return new Update(iY17, iY18, message, zzeVar, zzaVar, zziqVar, bArrH3);
            case 13:
                int iJ13 = cc7.J(parcel);
                String strK13 = null;
                int iY19 = 0;
                while (parcel.dataPosition() < iJ13) {
                    int i14 = parcel.readInt();
                    char c6 = (char) i14;
                    if (c6 == 1) {
                        iY19 = cc7.y(i14, parcel);
                    } else if (c6 != 2) {
                        cc7.E(i14, parcel);
                    } else {
                        strK13 = cc7.k(i14, parcel);
                    }
                }
                cc7.p(iJ13, parcel);
                return new Scope(iY19, strK13);
            case 14:
                int iJ14 = cc7.J(parcel);
                FidoAppIdExtension fidoAppIdExtension = null;
                zzs zzsVar = null;
                UserVerificationMethodExtension userVerificationMethodExtension = null;
                zzz zzzVar = null;
                zzab zzabVar = null;
                zzad zzadVar = null;
                zzu zzuVar = null;
                zzag zzagVar = null;
                GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
                zzai zzaiVar = null;
                while (parcel.dataPosition() < iJ14) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 2:
                            fidoAppIdExtension = (FidoAppIdExtension) cc7.j(parcel, i15, FidoAppIdExtension.CREATOR);
                            break;
                        case 3:
                            zzsVar = (zzs) cc7.j(parcel, i15, zzs.CREATOR);
                            break;
                        case 4:
                            userVerificationMethodExtension = (UserVerificationMethodExtension) cc7.j(parcel, i15, UserVerificationMethodExtension.CREATOR);
                            break;
                        case 5:
                            zzzVar = (zzz) cc7.j(parcel, i15, zzz.CREATOR);
                            break;
                        case 6:
                            zzabVar = (zzab) cc7.j(parcel, i15, zzab.CREATOR);
                            break;
                        case 7:
                            zzadVar = (zzad) cc7.j(parcel, i15, zzad.CREATOR);
                            break;
                        case '\b':
                            zzuVar = (zzu) cc7.j(parcel, i15, zzu.CREATOR);
                            break;
                        case '\t':
                            zzagVar = (zzag) cc7.j(parcel, i15, zzag.CREATOR);
                            break;
                        case '\n':
                            googleThirdPartyPaymentExtension = (GoogleThirdPartyPaymentExtension) cc7.j(parcel, i15, GoogleThirdPartyPaymentExtension.CREATOR);
                            break;
                        case 11:
                            zzaiVar = (zzai) cc7.j(parcel, i15, zzai.CREATOR);
                            break;
                        default:
                            cc7.E(i15, parcel);
                            break;
                    }
                }
                cc7.p(iJ14, parcel);
                return new AuthenticationExtensions(fidoAppIdExtension, zzsVar, userVerificationMethodExtension, zzzVar, zzabVar, zzadVar, zzuVar, zzagVar, googleThirdPartyPaymentExtension, zzaiVar);
            case 15:
                int iJ15 = cc7.J(parcel);
                String strK14 = null;
                int iY20 = 0;
                while (parcel.dataPosition() < iJ15) {
                    int i16 = parcel.readInt();
                    char c7 = (char) i16;
                    if (c7 == 2) {
                        iY20 = cc7.y(i16, parcel);
                    } else if (c7 != 3) {
                        cc7.E(i16, parcel);
                    } else {
                        strK14 = cc7.k(i16, parcel);
                    }
                }
                cc7.p(iJ15, parcel);
                return new ErrorResponseData(iY20, strK14);
            case 16:
                int iJ16 = cc7.J(parcel);
                ArrayList arrayListO2 = null;
                while (parcel.dataPosition() < iJ16) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        cc7.E(i17, parcel);
                    } else {
                        arrayListO2 = cc7.o(parcel, i17, AppIdentifier.CREATOR);
                    }
                }
                cc7.p(iJ16, parcel);
                return new AppMetadata(arrayListO2);
            case 17:
                int iJ17 = cc7.J(parcel);
                String strK15 = null;
                String strK16 = null;
                String strK17 = null;
                int iY21 = 0;
                int iY22 = 0;
                boolean zU10 = false;
                while (parcel.dataPosition() < iJ17) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            iY21 = cc7.y(i18, parcel);
                            break;
                        case 2:
                            strK15 = cc7.k(i18, parcel);
                            break;
                        case 3:
                            strK16 = cc7.k(i18, parcel);
                            break;
                        case 4:
                            zU10 = cc7.u(i18, parcel);
                            break;
                        case 5:
                            iY22 = cc7.y(i18, parcel);
                            break;
                        case 6:
                            strK17 = cc7.k(i18, parcel);
                            break;
                        default:
                            cc7.E(i18, parcel);
                            break;
                    }
                }
                cc7.p(iJ17, parcel);
                return new ClientAppContext(iY21, iY22, strK15, strK16, strK17, zU10);
            case 18:
                int iJ18 = cc7.J(parcel);
                Bundle bundleG = null;
                String strK18 = null;
                boolean zU11 = false;
                long jA = 0;
                long jA2 = 0;
                while (parcel.dataPosition() < iJ18) {
                    int i19 = parcel.readInt();
                    char c8 = (char) i19;
                    if (c8 == 1) {
                        jA = cc7.A(i19, parcel);
                    } else if (c8 == 2) {
                        jA2 = cc7.A(i19, parcel);
                    } else if (c8 == 3) {
                        zU11 = cc7.u(i19, parcel);
                    } else if (c8 == 7) {
                        bundleG = cc7.g(i19, parcel);
                    } else if (c8 != '\b') {
                        cc7.E(i19, parcel);
                    } else {
                        strK18 = cc7.k(i19, parcel);
                    }
                }
                cc7.p(iJ18, parcel);
                return new zzdd(jA, jA2, zU11, bundleG, strK18);
            case 19:
                int iJ19 = cc7.J(parcel);
                String strK19 = null;
                int iY23 = 0;
                Intent intent = null;
                while (parcel.dataPosition() < iJ19) {
                    int i20 = parcel.readInt();
                    char c9 = (char) i20;
                    if (c9 == 1) {
                        iY23 = cc7.y(i20, parcel);
                    } else if (c9 == 2) {
                        strK19 = cc7.k(i20, parcel);
                    } else if (c9 != 3) {
                        cc7.E(i20, parcel);
                    } else {
                        intent = (Intent) cc7.j(parcel, i20, Intent.CREATOR);
                    }
                }
                cc7.p(iJ19, parcel);
                return new zzdf(iY23, strK19, intent);
            case 20:
                int iJ20 = cc7.J(parcel);
                long jA3 = 0;
                HarmfulAppsData[] harmfulAppsDataArr = null;
                int iY24 = 0;
                boolean zU12 = false;
                while (parcel.dataPosition() < iJ20) {
                    int i21 = parcel.readInt();
                    char c10 = (char) i21;
                    if (c10 == 2) {
                        jA3 = cc7.A(i21, parcel);
                    } else if (c10 == 3) {
                        harmfulAppsDataArr = (HarmfulAppsData[]) cc7.n(parcel, i21, HarmfulAppsData.CREATOR);
                    } else if (c10 == 4) {
                        iY24 = cc7.y(i21, parcel);
                    } else if (c10 != 5) {
                        cc7.E(i21, parcel);
                    } else {
                        zU12 = cc7.u(i21, parcel);
                    }
                }
                cc7.p(iJ20, parcel);
                return new zzd(jA3, harmfulAppsDataArr, iY24, zU12);
            case 21:
                int iJ21 = cc7.J(parcel);
                String strK20 = null;
                ConnectionResult connectionResult = null;
                int iY25 = 0;
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < iJ21) {
                    int i22 = parcel.readInt();
                    char c11 = (char) i22;
                    if (c11 == 1) {
                        iY25 = cc7.y(i22, parcel);
                    } else if (c11 == 2) {
                        strK20 = cc7.k(i22, parcel);
                    } else if (c11 == 3) {
                        pendingIntent3 = (PendingIntent) cc7.j(parcel, i22, PendingIntent.CREATOR);
                    } else if (c11 != 4) {
                        cc7.E(i22, parcel);
                    } else {
                        connectionResult = (ConnectionResult) cc7.j(parcel, i22, ConnectionResult.CREATOR);
                    }
                }
                cc7.p(iJ21, parcel);
                return new Status(iY25, strK20, pendingIntent3, connectionResult);
            case 22:
                int iJ22 = cc7.J(parcel);
                boolean zU13 = false;
                while (parcel.dataPosition() < iJ22) {
                    int i23 = parcel.readInt();
                    if (((char) i23) != 1) {
                        cc7.E(i23, parcel);
                    } else {
                        zU13 = cc7.u(i23, parcel);
                    }
                }
                cc7.p(iJ22, parcel);
                return new AuthenticationExtensionsCredPropsOutputs(zU13);
            case 23:
                int iJ23 = cc7.J(parcel);
                byte[] bArrH4 = null;
                ArrayList arrayListO3 = null;
                int iY26 = 0;
                String strK21 = null;
                while (parcel.dataPosition() < iJ23) {
                    int i24 = parcel.readInt();
                    char c12 = (char) i24;
                    if (c12 == 1) {
                        iY26 = cc7.y(i24, parcel);
                    } else if (c12 == 2) {
                        bArrH4 = cc7.h(i24, parcel);
                    } else if (c12 == 3) {
                        strK21 = cc7.k(i24, parcel);
                    } else if (c12 != 4) {
                        cc7.E(i24, parcel);
                    } else {
                        arrayListO3 = cc7.o(parcel, i24, Transport.CREATOR);
                    }
                }
                cc7.p(iJ23, parcel);
                return new KeyHandle(iY26, bArrH4, strK21, arrayListO3);
            case 24:
                int iJ24 = cc7.J(parcel);
                String strK22 = null;
                zzo zzoVar = null;
                int iY27 = 0;
                zzjk zzjkVar = null;
                while (parcel.dataPosition() < iJ24) {
                    int i25 = parcel.readInt();
                    char c13 = (char) i25;
                    if (c13 == 1) {
                        strK22 = cc7.k(i25, parcel);
                    } else if (c13 == 2) {
                        iY27 = cc7.y(i25, parcel);
                    } else if (c13 == 3) {
                        zzjkVar = (zzjk) cc7.j(parcel, i25, zzjk.CREATOR);
                    } else if (c13 != 4) {
                        cc7.E(i25, parcel);
                    } else {
                        zzoVar = (zzo) cc7.j(parcel, i25, zzo.CREATOR);
                    }
                }
                cc7.p(iJ24, parcel);
                return new zzeu(strK22, iY27, zzjkVar, zzoVar);
            case 25:
                int iJ25 = cc7.J(parcel);
                int iY28 = 0;
                int iY29 = 0;
                int iY30 = 0;
                int iY31 = 0;
                boolean zU14 = false;
                int iY32 = 0;
                int iY33 = 0;
                int iY34 = 0;
                while (parcel.dataPosition() < iJ25) {
                    int i26 = parcel.readInt();
                    char c14 = (char) i26;
                    if (c14 != 1000) {
                        switch (c14) {
                            case 1:
                                iY29 = cc7.y(i26, parcel);
                                break;
                            case 2:
                                iY30 = cc7.y(i26, parcel);
                                break;
                            case 3:
                                iY31 = cc7.y(i26, parcel);
                                break;
                            case 4:
                                zU14 = cc7.u(i26, parcel);
                                break;
                            case 5:
                                iY32 = cc7.y(i26, parcel);
                                break;
                            case 6:
                                iY33 = cc7.y(i26, parcel);
                                break;
                            case 7:
                                iY34 = cc7.y(i26, parcel);
                                break;
                            default:
                                cc7.E(i26, parcel);
                                break;
                        }
                    } else {
                        iY28 = cc7.y(i26, parcel);
                    }
                }
                cc7.p(iJ25, parcel);
                return new Strategy(iY28, iY29, iY30, iY31, zU14, iY32, iY33, iY34);
            case 26:
                int iJ26 = cc7.J(parcel);
                double d = 0.0d;
                int iY35 = 0;
                int iY36 = 0;
                while (parcel.dataPosition() < iJ26) {
                    int i27 = parcel.readInt();
                    char c15 = (char) i27;
                    if (c15 == 1) {
                        iY35 = cc7.y(i27, parcel);
                    } else if (c15 == 2) {
                        iY36 = cc7.y(i27, parcel);
                    } else if (c15 != 3) {
                        cc7.E(i27, parcel);
                    } else {
                        cc7.L(parcel, i27, 8);
                        d = parcel.readDouble();
                    }
                }
                cc7.p(iJ26, parcel);
                return new zze(iY35, iY36, d);
            case 27:
                int iJ27 = cc7.J(parcel);
                byte[] bArrH5 = null;
                byte[] bArrH6 = null;
                while (parcel.dataPosition() < iJ27) {
                    int i28 = parcel.readInt();
                    char c16 = (char) i28;
                    if (c16 == 1) {
                        bArrH5 = cc7.h(i28, parcel);
                    } else if (c16 != 2) {
                        cc7.E(i28, parcel);
                    } else {
                        bArrH6 = cc7.h(i28, parcel);
                    }
                }
                cc7.p(iJ27, parcel);
                return new zzf(bArrH5, bArrH6);
            case 28:
                int iJ28 = cc7.J(parcel);
                String strK23 = null;
                String strK24 = null;
                int iY37 = 0;
                byte[] bArrH7 = null;
                while (parcel.dataPosition() < iJ28) {
                    int i29 = parcel.readInt();
                    char c17 = (char) i29;
                    if (c17 == 1) {
                        iY37 = cc7.y(i29, parcel);
                    } else if (c17 == 2) {
                        strK23 = cc7.k(i29, parcel);
                    } else if (c17 == 3) {
                        bArrH7 = cc7.h(i29, parcel);
                    } else if (c17 != 4) {
                        cc7.E(i29, parcel);
                    } else {
                        strK24 = cc7.k(i29, parcel);
                    }
                }
                cc7.p(iJ28, parcel);
                return new RegisterRequest(iY37, strK23, strK24, bArrH7);
            default:
                int iJ29 = cc7.J(parcel);
                String strK25 = null;
                while (parcel.dataPosition() < iJ29) {
                    int i30 = parcel.readInt();
                    if (((char) i30) != 2) {
                        cc7.E(i30, parcel);
                    } else {
                        strK25 = cc7.k(i30, parcel);
                    }
                }
                cc7.p(iJ29, parcel);
                return new com.google.android.gms.safetynet.zzf(strK25);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new zzbw[i];
            case 1:
                return new AppIdentifier[i];
            case 2:
                return new HarmfulAppsData[i];
            case 3:
                return new ComplianceOptions[i];
            case 4:
                return new AuthenticationExtensionsClientOutputs[i];
            case 5:
                return new ErrorCode[i];
            case 6:
                return new AccountChangeEventsResponse[i];
            case 7:
                return new zzbz[i];
            case 8:
                return new zzcb[i];
            case 9:
                return new SubscribeRequest[i];
            case 10:
                return new zzce[i];
            case 11:
                return new zzcg[i];
            case 12:
                return new Update[i];
            case 13:
                return new Scope[i];
            case 14:
                return new AuthenticationExtensions[i];
            case 15:
                return new ErrorResponseData[i];
            case 16:
                return new AppMetadata[i];
            case 17:
                return new ClientAppContext[i];
            case 18:
                return new zzdd[i];
            case 19:
                return new zzdf[i];
            case 20:
                return new zzd[i];
            case 21:
                return new Status[i];
            case 22:
                return new AuthenticationExtensionsCredPropsOutputs[i];
            case 23:
                return new KeyHandle[i];
            case 24:
                return new zzeu[i];
            case 25:
                return new Strategy[i];
            case 26:
                return new zze[i];
            case 27:
                return new zzf[i];
            case 28:
                return new RegisterRequest[i];
            default:
                return new com.google.android.gms.safetynet.zzf[i];
        }
    }
}
