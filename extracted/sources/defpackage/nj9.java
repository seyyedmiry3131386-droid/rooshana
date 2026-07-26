package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.AccountChangeEvent;
import com.google.android.gms.auth.api.identity.Claim;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.SignInPassword;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.stats.WakeLockEvent;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.zzab;
import com.google.android.gms.fido.fido2.api.common.zzad;
import com.google.android.gms.fido.fido2.api.common.zzag;
import com.google.android.gms.fido.fido2.api.common.zzai;
import com.google.android.gms.fido.fido2.api.common.zzz;
import com.google.android.gms.internal.nearby.zziq;
import com.google.android.gms.nearby.connection.zzaa;
import com.google.android.gms.nearby.connection.zzac;
import com.google.android.gms.nearby.connection.zzae;
import com.google.android.gms.nearby.messages.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class nj9 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ nj9(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int iJ = cc7.J(parcel);
                int iY = 0;
                while (parcel.dataPosition() < iJ) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        cc7.E(i, parcel);
                    } else {
                        iY = cc7.y(i, parcel);
                    }
                }
                cc7.p(iJ, parcel);
                return new GetPhoneNumberHintIntentRequest(iY);
            case 1:
                int iJ2 = cc7.J(parcel);
                String strK = null;
                String strK2 = null;
                String strK3 = null;
                String strK4 = null;
                ArrayList arrayListO = null;
                boolean zU = false;
                int iY2 = 0;
                while (parcel.dataPosition() < iJ2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 1:
                            strK = cc7.k(i2, parcel);
                            break;
                        case 2:
                            strK2 = cc7.k(i2, parcel);
                            break;
                        case 3:
                            strK3 = cc7.k(i2, parcel);
                            break;
                        case 4:
                            strK4 = cc7.k(i2, parcel);
                            break;
                        case 5:
                            zU = cc7.u(i2, parcel);
                            break;
                        case 6:
                            iY2 = cc7.y(i2, parcel);
                            break;
                        case 7:
                            arrayListO = cc7.o(parcel, i2, Claim.CREATOR);
                            break;
                        default:
                            cc7.E(i2, parcel);
                            break;
                    }
                }
                cc7.p(iJ2, parcel);
                return new GetSignInIntentRequest(strK, strK2, strK3, strK4, zU, iY2, arrayListO);
            case 2:
                int iJ3 = cc7.J(parcel);
                ArrayList arrayListO2 = null;
                Account account = null;
                String strK5 = null;
                while (parcel.dataPosition() < iJ3) {
                    int i3 = parcel.readInt();
                    char c = (char) i3;
                    if (c == 1) {
                        arrayListO2 = cc7.o(parcel, i3, Scope.CREATOR);
                    } else if (c == 2) {
                        account = (Account) cc7.j(parcel, i3, Account.CREATOR);
                    } else if (c != 3) {
                        cc7.E(i3, parcel);
                    } else {
                        strK5 = cc7.k(i3, parcel);
                    }
                }
                cc7.p(iJ3, parcel);
                return new RevokeAccessRequest(arrayListO2, account, strK5);
            case 3:
                int iJ4 = cc7.J(parcel);
                int iY3 = 0;
                PendingIntent pendingIntent = null;
                String strK6 = null;
                String strK7 = null;
                ArrayList arrayListM = null;
                String strK8 = null;
                while (parcel.dataPosition() < iJ4) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 1:
                            pendingIntent = (PendingIntent) cc7.j(parcel, i4, PendingIntent.CREATOR);
                            break;
                        case 2:
                            strK6 = cc7.k(i4, parcel);
                            break;
                        case 3:
                            strK7 = cc7.k(i4, parcel);
                            break;
                        case 4:
                            arrayListM = cc7.m(i4, parcel);
                            break;
                        case 5:
                            strK8 = cc7.k(i4, parcel);
                            break;
                        case 6:
                            iY3 = cc7.y(i4, parcel);
                            break;
                        default:
                            cc7.E(i4, parcel);
                            break;
                    }
                }
                cc7.p(iJ4, parcel);
                return new SaveAccountLinkingTokenRequest(pendingIntent, strK6, strK7, arrayListM, strK8, iY3);
            case 4:
                int iJ5 = cc7.J(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iJ5) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 1) {
                        cc7.E(i5, parcel);
                    } else {
                        pendingIntent2 = (PendingIntent) cc7.j(parcel, i5, PendingIntent.CREATOR);
                    }
                }
                cc7.p(iJ5, parcel);
                return new SaveAccountLinkingTokenResult(pendingIntent2);
            case 5:
                int iJ6 = cc7.J(parcel);
                String strK9 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iJ6) {
                    int i6 = parcel.readInt();
                    char c2 = (char) i6;
                    if (c2 == 2) {
                        strK9 = cc7.k(i6, parcel);
                    } else if (c2 != 5) {
                        cc7.E(i6, parcel);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) cc7.j(parcel, i6, GoogleSignInOptions.CREATOR);
                    }
                }
                cc7.p(iJ6, parcel);
                return new SignInConfiguration(strK9, googleSignInOptions);
            case 6:
                int iJ7 = cc7.J(parcel);
                int iY4 = 0;
                SignInPassword signInPassword = null;
                String strK10 = null;
                while (parcel.dataPosition() < iJ7) {
                    int i7 = parcel.readInt();
                    char c3 = (char) i7;
                    if (c3 == 1) {
                        signInPassword = (SignInPassword) cc7.j(parcel, i7, SignInPassword.CREATOR);
                    } else if (c3 == 2) {
                        strK10 = cc7.k(i7, parcel);
                    } else if (c3 != 3) {
                        cc7.E(i7, parcel);
                    } else {
                        iY4 = cc7.y(i7, parcel);
                    }
                }
                cc7.p(iJ7, parcel);
                return new SavePasswordRequest(signInPassword, strK10, iY4);
            case 7:
                int iJ8 = cc7.J(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < iJ8) {
                    int i8 = parcel.readInt();
                    if (((char) i8) != 1) {
                        cc7.E(i8, parcel);
                    } else {
                        pendingIntent3 = (PendingIntent) cc7.j(parcel, i8, PendingIntent.CREATOR);
                    }
                }
                cc7.p(iJ8, parcel);
                return new SavePasswordResult(pendingIntent3);
            case 8:
                int iJ9 = cc7.J(parcel);
                String strK11 = null;
                String strK12 = null;
                String strK13 = null;
                String strK14 = null;
                Uri uri = null;
                String strK15 = null;
                String strK16 = null;
                String strK17 = null;
                PublicKeyCredential publicKeyCredential = null;
                while (parcel.dataPosition() < iJ9) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            strK11 = cc7.k(i9, parcel);
                            break;
                        case 2:
                            strK12 = cc7.k(i9, parcel);
                            break;
                        case 3:
                            strK13 = cc7.k(i9, parcel);
                            break;
                        case 4:
                            strK14 = cc7.k(i9, parcel);
                            break;
                        case 5:
                            uri = (Uri) cc7.j(parcel, i9, Uri.CREATOR);
                            break;
                        case 6:
                            strK15 = cc7.k(i9, parcel);
                            break;
                        case 7:
                            strK16 = cc7.k(i9, parcel);
                            break;
                        case '\b':
                            strK17 = cc7.k(i9, parcel);
                            break;
                        case '\t':
                            publicKeyCredential = (PublicKeyCredential) cc7.j(parcel, i9, PublicKeyCredential.CREATOR);
                            break;
                        default:
                            cc7.E(i9, parcel);
                            break;
                    }
                }
                cc7.p(iJ9, parcel);
                return new SignInCredential(strK11, strK12, strK13, strK14, uri, strK15, strK16, strK17, publicKeyCredential);
            case 9:
                int iJ10 = cc7.J(parcel);
                String strK18 = null;
                String strK19 = null;
                while (parcel.dataPosition() < iJ10) {
                    int i10 = parcel.readInt();
                    char c4 = (char) i10;
                    if (c4 == 1) {
                        strK18 = cc7.k(i10, parcel);
                    } else if (c4 != 2) {
                        cc7.E(i10, parcel);
                    } else {
                        strK19 = cc7.k(i10, parcel);
                    }
                }
                cc7.p(iJ10, parcel);
                return new SignInPassword(strK18, strK19);
            case 10:
                int iJ11 = cc7.J(parcel);
                long jA = 0;
                byte[] bArrH = null;
                String strK20 = null;
                String strK21 = null;
                zziq[] zziqVarArr = null;
                int iY5 = 0;
                while (parcel.dataPosition() < iJ11) {
                    int i11 = parcel.readInt();
                    char c5 = (char) i11;
                    if (c5 == 1) {
                        bArrH = cc7.h(i11, parcel);
                    } else if (c5 == 2) {
                        strK21 = cc7.k(i11, parcel);
                    } else if (c5 == 3) {
                        strK20 = cc7.k(i11, parcel);
                    } else if (c5 == 4) {
                        zziqVarArr = (zziq[]) cc7.n(parcel, i11, zziq.CREATOR);
                    } else if (c5 == 5) {
                        jA = cc7.A(i11, parcel);
                    } else if (c5 != 1000) {
                        cc7.E(i11, parcel);
                    } else {
                        iY5 = cc7.y(i11, parcel);
                    }
                }
                cc7.p(iJ11, parcel);
                return new Message(iY5, bArrH, strK20, strK21, zziqVarArr, jA);
            case 11:
                int iJ12 = cc7.J(parcel);
                String strK22 = null;
                byte[] bArrH2 = null;
                Bundle bundleG = null;
                long jA2 = 0;
                int iY6 = 0;
                int iY7 = 0;
                while (parcel.dataPosition() < iJ12) {
                    int i12 = parcel.readInt();
                    char c6 = (char) i12;
                    if (c6 == 1) {
                        strK22 = cc7.k(i12, parcel);
                    } else if (c6 == 2) {
                        iY7 = cc7.y(i12, parcel);
                    } else if (c6 == 3) {
                        jA2 = cc7.A(i12, parcel);
                    } else if (c6 == 4) {
                        bArrH2 = cc7.h(i12, parcel);
                    } else if (c6 == 5) {
                        bundleG = cc7.g(i12, parcel);
                    } else if (c6 != 1000) {
                        cc7.E(i12, parcel);
                    } else {
                        iY6 = cc7.y(i12, parcel);
                    }
                }
                cc7.p(iJ12, parcel);
                return new ProxyRequest(iY6, strK22, iY7, jA2, bArrH2, bundleG);
            case 12:
                int iJ13 = cc7.J(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iJ13) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        cc7.E(i13, parcel);
                    } else {
                        intent = (Intent) cc7.j(parcel, i13, Intent.CREATOR);
                    }
                }
                cc7.p(iJ13, parcel);
                return new CloudMessage(intent);
            case 13:
                int iJ14 = cc7.J(parcel);
                PendingIntent pendingIntent4 = null;
                String strK23 = null;
                Integer numZ = null;
                int iY8 = 0;
                int iY9 = 0;
                while (parcel.dataPosition() < iJ14) {
                    int i14 = parcel.readInt();
                    char c7 = (char) i14;
                    if (c7 == 1) {
                        iY8 = cc7.y(i14, parcel);
                    } else if (c7 == 2) {
                        iY9 = cc7.y(i14, parcel);
                    } else if (c7 == 3) {
                        pendingIntent4 = (PendingIntent) cc7.j(parcel, i14, PendingIntent.CREATOR);
                    } else if (c7 == 4) {
                        strK23 = cc7.k(i14, parcel);
                    } else if (c7 != 5) {
                        cc7.E(i14, parcel);
                    } else {
                        numZ = cc7.z(i14, parcel);
                    }
                }
                cc7.p(iJ14, parcel);
                return new ConnectionResult(iY8, iY9, pendingIntent4, strK23, numZ);
            case 14:
                int iJ15 = cc7.J(parcel);
                int iY10 = 0;
                int iY11 = 0;
                int iY12 = 0;
                int iY13 = 0;
                boolean zU2 = false;
                String strK24 = null;
                ArrayList arrayListM2 = null;
                String strK25 = null;
                String strK26 = null;
                String strK27 = null;
                String strK28 = null;
                long jA3 = 0;
                long jA4 = 0;
                long jA5 = 0;
                float fW = 0.0f;
                while (parcel.dataPosition() < iJ15) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            iY10 = cc7.y(i15, parcel);
                            break;
                        case 2:
                            jA3 = cc7.A(i15, parcel);
                            break;
                        case 3:
                        case 7:
                        case '\t':
                        default:
                            cc7.E(i15, parcel);
                            break;
                        case 4:
                            strK24 = cc7.k(i15, parcel);
                            break;
                        case 5:
                            iY12 = cc7.y(i15, parcel);
                            break;
                        case 6:
                            arrayListM2 = cc7.m(i15, parcel);
                            break;
                        case '\b':
                            jA4 = cc7.A(i15, parcel);
                            break;
                        case '\n':
                            strK26 = cc7.k(i15, parcel);
                            break;
                        case 11:
                            iY11 = cc7.y(i15, parcel);
                            break;
                        case '\f':
                            strK25 = cc7.k(i15, parcel);
                            break;
                        case '\r':
                            strK27 = cc7.k(i15, parcel);
                            break;
                        case 14:
                            iY13 = cc7.y(i15, parcel);
                            break;
                        case 15:
                            fW = cc7.w(i15, parcel);
                            break;
                        case 16:
                            jA5 = cc7.A(i15, parcel);
                            break;
                        case 17:
                            strK28 = cc7.k(i15, parcel);
                            break;
                        case 18:
                            zU2 = cc7.u(i15, parcel);
                            break;
                    }
                }
                cc7.p(iJ15, parcel);
                return new WakeLockEvent(iY10, jA3, iY11, strK24, iY12, arrayListM2, strK25, jA4, iY13, strK26, strK27, fW, jA5, strK28, zU2);
            case 15:
                int iJ16 = cc7.J(parcel);
                String strK29 = null;
                String strK30 = null;
                int iY14 = 0;
                int iY15 = 0;
                int iY16 = 0;
                long jA6 = 0;
                while (parcel.dataPosition() < iJ16) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            iY14 = cc7.y(i16, parcel);
                            break;
                        case 2:
                            jA6 = cc7.A(i16, parcel);
                            break;
                        case 3:
                            strK29 = cc7.k(i16, parcel);
                            break;
                        case 4:
                            iY15 = cc7.y(i16, parcel);
                            break;
                        case 5:
                            iY16 = cc7.y(i16, parcel);
                            break;
                        case 6:
                            strK30 = cc7.k(i16, parcel);
                            break;
                        default:
                            cc7.E(i16, parcel);
                            break;
                    }
                }
                cc7.p(iJ16, parcel);
                return new AccountChangeEvent(iY14, jA6, strK29, iY15, iY16, strK30);
            case 16:
                int iJ17 = cc7.J(parcel);
                boolean zU3 = false;
                while (parcel.dataPosition() < iJ17) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        cc7.E(i17, parcel);
                    } else {
                        zU3 = cc7.u(i17, parcel);
                    }
                }
                cc7.p(iJ17, parcel);
                return new zzz(zU3);
            case 17:
                int iJ18 = cc7.J(parcel);
                int iY17 = 0;
                int iY18 = 0;
                int iY19 = 0;
                boolean zU4 = false;
                while (parcel.dataPosition() < iJ18) {
                    int i18 = parcel.readInt();
                    char c8 = (char) i18;
                    if (c8 == 1) {
                        iY17 = cc7.y(i18, parcel);
                    } else if (c8 == 2) {
                        iY18 = cc7.y(i18, parcel);
                    } else if (c8 == 3) {
                        iY19 = cc7.y(i18, parcel);
                    } else if (c8 != 4) {
                        cc7.E(i18, parcel);
                    } else {
                        zU4 = cc7.u(i18, parcel);
                    }
                }
                cc7.p(iJ18, parcel);
                zzaa zzaaVar = new zzaa();
                zzaaVar.a = iY17;
                zzaaVar.b = iY18;
                zzaaVar.c = iY19;
                zzaaVar.d = zU4;
                return zzaaVar;
            case 18:
                int iJ19 = cc7.J(parcel);
                long jA7 = 0;
                while (parcel.dataPosition() < iJ19) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        cc7.E(i19, parcel);
                    } else {
                        jA7 = cc7.A(i19, parcel);
                    }
                }
                cc7.p(iJ19, parcel);
                return new zzab(jA7);
            case 19:
                int iJ20 = cc7.J(parcel);
                int iY20 = 0;
                byte[] bArrH3 = null;
                int iY21 = 0;
                while (parcel.dataPosition() < iJ20) {
                    int i20 = parcel.readInt();
                    char c9 = (char) i20;
                    if (c9 == 1) {
                        bArrH3 = cc7.h(i20, parcel);
                    } else if (c9 == 2) {
                        iY20 = cc7.y(i20, parcel);
                    } else if (c9 != 3) {
                        cc7.E(i20, parcel);
                    } else {
                        iY21 = cc7.y(i20, parcel);
                    }
                }
                cc7.p(iJ20, parcel);
                zzac zzacVar = new zzac();
                zzacVar.a = bArrH3;
                zzacVar.b = iY20;
                zzacVar.c = iY21;
                return zzacVar;
            case 20:
                int iJ21 = cc7.J(parcel);
                String strK31 = null;
                int iY22 = 0;
                String strK32 = null;
                while (parcel.dataPosition() < iJ21) {
                    int i21 = parcel.readInt();
                    char c10 = (char) i21;
                    if (c10 == 1) {
                        strK31 = cc7.k(i21, parcel);
                    } else if (c10 == 2) {
                        strK32 = cc7.k(i21, parcel);
                    } else if (c10 != 1000) {
                        cc7.E(i21, parcel);
                    } else {
                        iY22 = cc7.y(i21, parcel);
                    }
                }
                cc7.p(iJ21, parcel);
                return new com.google.android.gms.nearby.messages.internal.zzac(iY22, strK31, strK32);
            case 21:
                int iJ22 = cc7.J(parcel);
                boolean zU5 = false;
                while (parcel.dataPosition() < iJ22) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 1) {
                        cc7.E(i22, parcel);
                    } else {
                        zU5 = cc7.u(i22, parcel);
                    }
                }
                cc7.p(iJ22, parcel);
                return new zzad(zU5);
            case 22:
                int iJ23 = cc7.J(parcel);
                byte[] bArrH4 = null;
                byte[] bArrH5 = null;
                byte[] bArrH6 = null;
                byte[] bArrH7 = null;
                while (parcel.dataPosition() < iJ23) {
                    int i23 = parcel.readInt();
                    char c11 = (char) i23;
                    if (c11 == 1) {
                        bArrH4 = cc7.h(i23, parcel);
                    } else if (c11 == 2) {
                        bArrH5 = cc7.h(i23, parcel);
                    } else if (c11 == 3) {
                        bArrH6 = cc7.h(i23, parcel);
                    } else if (c11 != 4) {
                        cc7.E(i23, parcel);
                    } else {
                        bArrH7 = cc7.h(i23, parcel);
                    }
                }
                cc7.p(iJ23, parcel);
                return new zzae(bArrH4, bArrH5, bArrH6, bArrH7);
            case 23:
                int iJ24 = cc7.J(parcel);
                Message message = null;
                int iY23 = 0;
                while (parcel.dataPosition() < iJ24) {
                    int i24 = parcel.readInt();
                    char c12 = (char) i24;
                    if (c12 == 1) {
                        message = (Message) cc7.j(parcel, i24, Message.CREATOR);
                    } else if (c12 != 1000) {
                        cc7.E(i24, parcel);
                    } else {
                        iY23 = cc7.y(i24, parcel);
                    }
                }
                cc7.p(iJ24, parcel);
                return new com.google.android.gms.nearby.messages.internal.zzae(iY23, message);
            case 24:
                int iJ25 = cc7.J(parcel);
                boolean zU6 = false;
                while (parcel.dataPosition() < iJ25) {
                    int i25 = parcel.readInt();
                    if (((char) i25) != 1) {
                        cc7.E(i25, parcel);
                    } else {
                        zU6 = cc7.u(i25, parcel);
                    }
                }
                cc7.p(iJ25, parcel);
                return new GoogleThirdPartyPaymentExtension(zU6);
            case 25:
                int iJ26 = cc7.J(parcel);
                int iY24 = 0;
                boolean zU7 = false;
                boolean zU8 = false;
                int iY25 = 0;
                int iY26 = 0;
                while (parcel.dataPosition() < iJ26) {
                    int i26 = parcel.readInt();
                    char c13 = (char) i26;
                    if (c13 == 1) {
                        iY24 = cc7.y(i26, parcel);
                    } else if (c13 == 2) {
                        zU7 = cc7.u(i26, parcel);
                    } else if (c13 == 3) {
                        zU8 = cc7.u(i26, parcel);
                    } else if (c13 == 4) {
                        iY25 = cc7.y(i26, parcel);
                    } else if (c13 != 5) {
                        cc7.E(i26, parcel);
                    } else {
                        iY26 = cc7.y(i26, parcel);
                    }
                }
                cc7.p(iJ26, parcel);
                return new RootTelemetryConfiguration(iY24, zU7, zU8, iY25, iY26);
            case 26:
                int iJ27 = cc7.J(parcel);
                String strK33 = null;
                while (parcel.dataPosition() < iJ27) {
                    int i27 = parcel.readInt();
                    if (((char) i27) != 1) {
                        cc7.E(i27, parcel);
                    } else {
                        strK33 = cc7.k(i27, parcel);
                    }
                }
                cc7.p(iJ27, parcel);
                return new zzag(strK33);
            case 27:
                int iJ28 = cc7.J(parcel);
                yj9 yj9Var = null;
                int iY27 = 0;
                IBinder iBinderX = null;
                while (parcel.dataPosition() < iJ28) {
                    int i28 = parcel.readInt();
                    char c14 = (char) i28;
                    if (c14 == 1) {
                        iY27 = cc7.y(i28, parcel);
                    } else if (c14 != 2) {
                        cc7.E(i28, parcel);
                    } else {
                        iBinderX = cc7.x(i28, parcel);
                    }
                }
                cc7.p(iJ28, parcel);
                if (iBinderX != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinderX.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IBooleanCallback");
                    yj9Var = iInterfaceQueryLocalInterface instanceof yj9 ? (yj9) iInterfaceQueryLocalInterface : new yj9(iBinderX);
                }
                com.google.android.gms.internal.nearby.zzag zzagVar = new com.google.android.gms.internal.nearby.zzag();
                zzagVar.a = iY27;
                zzagVar.b = yj9Var;
                return zzagVar;
            case 28:
                int iJ29 = cc7.J(parcel);
                while (true) {
                    byte[][] bArr = null;
                    while (parcel.dataPosition() < iJ29) {
                        int i29 = parcel.readInt();
                        if (((char) i29) != 1) {
                            cc7.E(i29, parcel);
                        } else {
                            int iC = cc7.C(i29, parcel);
                            int iDataPosition = parcel.dataPosition();
                            if (iC == 0) {
                            }
                            int i30 = parcel.readInt();
                            byte[][] bArr2 = new byte[i30][];
                            for (int i31 = 0; i31 < i30; i31++) {
                                bArr2[i31] = parcel.createByteArray();
                            }
                            parcel.setDataPosition(iDataPosition + iC);
                            bArr = bArr2;
                        }
                        break;
                    }
                    cc7.p(iJ29, parcel);
                    return new zzai(bArr);
                }
                break;
            default:
                int iJ30 = cc7.J(parcel);
                int iY28 = 0;
                while (parcel.dataPosition() < iJ30) {
                    int i32 = parcel.readInt();
                    if (((char) i32) != 1) {
                        cc7.E(i32, parcel);
                    } else {
                        iY28 = cc7.y(i32, parcel);
                    }
                }
                cc7.p(iJ30, parcel);
                return new com.google.android.gms.common.internal.zzai(iY28);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new GetPhoneNumberHintIntentRequest[i];
            case 1:
                return new GetSignInIntentRequest[i];
            case 2:
                return new RevokeAccessRequest[i];
            case 3:
                return new SaveAccountLinkingTokenRequest[i];
            case 4:
                return new SaveAccountLinkingTokenResult[i];
            case 5:
                return new SignInConfiguration[i];
            case 6:
                return new SavePasswordRequest[i];
            case 7:
                return new SavePasswordResult[i];
            case 8:
                return new SignInCredential[i];
            case 9:
                return new SignInPassword[i];
            case 10:
                return new Message[i];
            case 11:
                return new ProxyRequest[i];
            case 12:
                return new CloudMessage[i];
            case 13:
                return new ConnectionResult[i];
            case 14:
                return new WakeLockEvent[i];
            case 15:
                return new AccountChangeEvent[i];
            case 16:
                return new zzz[i];
            case 17:
                return new zzaa[i];
            case 18:
                return new zzab[i];
            case 19:
                return new zzac[i];
            case 20:
                return new com.google.android.gms.nearby.messages.internal.zzac[i];
            case 21:
                return new zzad[i];
            case 22:
                return new zzae[i];
            case 23:
                return new com.google.android.gms.nearby.messages.internal.zzae[i];
            case 24:
                return new GoogleThirdPartyPaymentExtension[i];
            case 25:
                return new RootTelemetryConfiguration[i];
            case 26:
                return new zzag[i];
            case 27:
                return new com.google.android.gms.internal.nearby.zzag[i];
            case 28:
                return new zzai[i];
            default:
                return new com.google.android.gms.common.internal.zzai[i];
        }
    }
}
