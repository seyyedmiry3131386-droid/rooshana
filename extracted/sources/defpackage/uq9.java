package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.internal.nearby.zzil;
import com.google.android.gms.internal.nearby.zzin;
import com.google.android.gms.internal.nearby.zziq;
import com.google.android.gms.internal.nearby.zzis;
import com.google.android.gms.internal.nearby.zzjc;
import com.google.android.gms.internal.nearby.zzje;
import com.google.android.gms.internal.nearby.zzjg;
import com.google.android.gms.internal.nearby.zzji;
import com.google.android.gms.internal.nearby.zzjk;
import com.google.android.gms.internal.nearby.zzjm;
import com.google.android.gms.internal.nearby.zzjo;
import com.google.android.gms.internal.nearby.zzjs;
import com.google.android.gms.internal.nearby.zzjw;
import com.google.android.gms.internal.nearby.zzjy;
import com.google.android.gms.internal.nearby.zzka;
import com.google.android.gms.internal.nearby.zzke;
import com.google.android.gms.internal.nearby.zzki;
import com.google.android.gms.internal.nearby.zzkm;
import com.google.android.gms.internal.nearby.zzlm;
import com.google.android.gms.internal.nearby.zzmc;
import com.google.android.gms.internal.nearby.zzni;
import com.google.android.gms.nearby.connection.zzae;
import com.google.android.gms.nearby.connection.zzg;
import com.google.android.gms.nearby.connection.zzi;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.safetynet.SafeBrowsingData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class uq9 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ uq9(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int iJ = cc7.J(parcel);
                while (parcel.dataPosition() < iJ) {
                    cc7.E(parcel.readInt(), parcel);
                }
                cc7.p(iJ, parcel);
                return new zzil();
            case 1:
                int iJ2 = cc7.J(parcel);
                ParcelUuid parcelUuid = null;
                ParcelUuid parcelUuid2 = null;
                ParcelUuid parcelUuid3 = null;
                byte[] bArrH = null;
                byte[] bArrH2 = null;
                byte[] bArrH3 = null;
                byte[] bArrH4 = null;
                int iY = 0;
                int iY2 = 0;
                while (parcel.dataPosition() < iJ2) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c != 1) {
                        switch (c) {
                            case 4:
                                parcelUuid = (ParcelUuid) cc7.j(parcel, i, ParcelUuid.CREATOR);
                                break;
                            case 5:
                                parcelUuid2 = (ParcelUuid) cc7.j(parcel, i, ParcelUuid.CREATOR);
                                break;
                            case 6:
                                parcelUuid3 = (ParcelUuid) cc7.j(parcel, i, ParcelUuid.CREATOR);
                                break;
                            case 7:
                                bArrH = cc7.h(i, parcel);
                                break;
                            case '\b':
                                bArrH2 = cc7.h(i, parcel);
                                break;
                            case '\t':
                                iY2 = cc7.y(i, parcel);
                                break;
                            case '\n':
                                bArrH3 = cc7.h(i, parcel);
                                break;
                            case 11:
                                bArrH4 = cc7.h(i, parcel);
                                break;
                            default:
                                cc7.E(i, parcel);
                                break;
                        }
                    } else {
                        iY = cc7.y(i, parcel);
                    }
                }
                cc7.p(iJ2, parcel);
                return new zzin(iY, parcelUuid, parcelUuid2, parcelUuid3, bArrH, bArrH2, iY2, bArrH3, bArrH4);
            case 2:
                int iJ3 = cc7.J(parcel);
                String strK = null;
                int iY3 = 0;
                String strK2 = null;
                while (parcel.dataPosition() < iJ3) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 3) {
                        strK = cc7.k(i2, parcel);
                    } else if (c2 == 6) {
                        strK2 = cc7.k(i2, parcel);
                    } else if (c2 != 1000) {
                        cc7.E(i2, parcel);
                    } else {
                        iY3 = cc7.y(i2, parcel);
                    }
                }
                cc7.p(iJ3, parcel);
                return new zziq(iY3, strK, strK2);
            case 3:
                int iJ4 = cc7.J(parcel);
                int iY4 = 0;
                boolean zU = false;
                byte[] bArrH5 = null;
                int iY5 = 0;
                while (parcel.dataPosition() < iJ4) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        iY5 = cc7.y(i3, parcel);
                    } else if (c3 == 2) {
                        bArrH5 = cc7.h(i3, parcel);
                    } else if (c3 == 3) {
                        zU = cc7.u(i3, parcel);
                    } else if (c3 != 1000) {
                        cc7.E(i3, parcel);
                    } else {
                        iY4 = cc7.y(i3, parcel);
                    }
                }
                cc7.p(iJ4, parcel);
                return new zzis(bArrH5, iY4, iY5, zU);
            case 4:
                int iJ5 = cc7.J(parcel);
                byte[] bArrH6 = null;
                byte[] bArrH7 = null;
                byte[] bArrH8 = null;
                byte[] bArrH9 = null;
                byte[] bArrH10 = null;
                while (parcel.dataPosition() < iJ5) {
                    int i4 = parcel.readInt();
                    char c4 = (char) i4;
                    if (c4 == 2) {
                        bArrH6 = cc7.h(i4, parcel);
                    } else if (c4 == 3) {
                        bArrH7 = cc7.h(i4, parcel);
                    } else if (c4 == 4) {
                        bArrH8 = cc7.h(i4, parcel);
                    } else if (c4 == 5) {
                        bArrH9 = cc7.h(i4, parcel);
                    } else if (c4 != 6) {
                        cc7.E(i4, parcel);
                    } else {
                        bArrH10 = cc7.h(i4, parcel);
                    }
                }
                cc7.p(iJ5, parcel);
                return new AuthenticatorAssertionResponse(bArrH6, bArrH7, bArrH8, bArrH9, bArrH10);
            case 5:
                int iJ6 = cc7.J(parcel);
                KeyHandle keyHandle = null;
                String strK3 = null;
                String strK4 = null;
                while (parcel.dataPosition() < iJ6) {
                    int i5 = parcel.readInt();
                    char c5 = (char) i5;
                    if (c5 == 2) {
                        keyHandle = (KeyHandle) cc7.j(parcel, i5, KeyHandle.CREATOR);
                    } else if (c5 == 3) {
                        strK3 = cc7.k(i5, parcel);
                    } else if (c5 != 4) {
                        cc7.E(i5, parcel);
                    } else {
                        strK4 = cc7.k(i5, parcel);
                    }
                }
                cc7.p(iJ6, parcel);
                return new RegisteredKey(keyHandle, strK3, strK4);
            case 6:
                int iJ7 = cc7.J(parcel);
                byte[] bArrH11 = null;
                byte[] bArrH12 = null;
                byte[] bArrH13 = null;
                while (parcel.dataPosition() < iJ7) {
                    int i6 = parcel.readInt();
                    char c6 = (char) i6;
                    if (c6 == 1) {
                        bArrH11 = cc7.h(i6, parcel);
                    } else if (c6 == 2) {
                        bArrH12 = cc7.h(i6, parcel);
                    } else if (c6 != 3) {
                        cc7.E(i6, parcel);
                    } else {
                        bArrH13 = cc7.h(i6, parcel);
                    }
                }
                cc7.p(iJ7, parcel);
                return new zzi(bArrH11, bArrH12, bArrH13);
            case 7:
                int iJ8 = cc7.J(parcel);
                String strK5 = null;
                byte[] bArrH14 = null;
                long jA = 0;
                DataHolder dataHolder = null;
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < iJ8) {
                    int i7 = parcel.readInt();
                    char c7 = (char) i7;
                    if (c7 == 2) {
                        strK5 = cc7.k(i7, parcel);
                    } else if (c7 == 3) {
                        dataHolder = (DataHolder) cc7.j(parcel, i7, DataHolder.CREATOR);
                    } else if (c7 == 4) {
                        parcelFileDescriptor = (ParcelFileDescriptor) cc7.j(parcel, i7, ParcelFileDescriptor.CREATOR);
                    } else if (c7 == 5) {
                        jA = cc7.A(i7, parcel);
                    } else if (c7 != 6) {
                        cc7.E(i7, parcel);
                    } else {
                        bArrH14 = cc7.h(i7, parcel);
                    }
                }
                cc7.p(iJ8, parcel);
                SafeBrowsingData safeBrowsingData = new SafeBrowsingData();
                safeBrowsingData.a = strK5;
                safeBrowsingData.b = dataHolder;
                safeBrowsingData.c = parcelFileDescriptor;
                safeBrowsingData.d = jA;
                safeBrowsingData.e = bArrH14;
                return safeBrowsingData;
            case 8:
                int iJ9 = cc7.J(parcel);
                String strK6 = null;
                while (parcel.dataPosition() < iJ9) {
                    int i8 = parcel.readInt();
                    if (((char) i8) != 1) {
                        cc7.E(i8, parcel);
                    } else {
                        strK6 = cc7.k(i8, parcel);
                    }
                }
                cc7.p(iJ9, parcel);
                return new zzjc(strK6);
            case 9:
                int iJ10 = cc7.J(parcel);
                zzjm zzjmVar = null;
                zzjc zzjcVar = null;
                byte[] bArrH15 = null;
                ArrayList arrayListO = null;
                ArrayList arrayListO2 = null;
                ArrayList arrayListO3 = null;
                zzjo zzjoVar = null;
                zzjg zzjgVar = null;
                boolean zU2 = false;
                while (parcel.dataPosition() < iJ10) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            zzjmVar = (zzjm) cc7.j(parcel, i9, zzjm.CREATOR);
                            break;
                        case 2:
                            zzjcVar = (zzjc) cc7.j(parcel, i9, zzjc.CREATOR);
                            break;
                        case 3:
                            bArrH15 = cc7.h(i9, parcel);
                            break;
                        case 4:
                            zU2 = cc7.u(i9, parcel);
                            break;
                        case 5:
                            arrayListO = cc7.o(parcel, i9, zzg.CREATOR);
                            break;
                        case 6:
                            arrayListO2 = cc7.o(parcel, i9, zzae.CREATOR);
                            break;
                        case 7:
                            arrayListO3 = cc7.o(parcel, i9, zzi.CREATOR);
                            break;
                        case '\b':
                            zzjoVar = (zzjo) cc7.j(parcel, i9, zzjo.CREATOR);
                            break;
                        case '\t':
                            zzjgVar = (zzjg) cc7.j(parcel, i9, zzjg.CREATOR);
                            break;
                        default:
                            cc7.E(i9, parcel);
                            break;
                    }
                }
                cc7.p(iJ10, parcel);
                return new zzje(zzjmVar, zzjcVar, bArrH15, zU2, arrayListO, arrayListO2, arrayListO3, zzjoVar, zzjgVar);
            case 10:
                int iJ11 = cc7.J(parcel);
                int iY6 = 0;
                while (parcel.dataPosition() < iJ11) {
                    int i10 = parcel.readInt();
                    if (((char) i10) != 1) {
                        cc7.E(i10, parcel);
                    } else {
                        iY6 = cc7.y(i10, parcel);
                    }
                }
                cc7.p(iJ11, parcel);
                return new zzjg(iY6);
            case 11:
                int iJ12 = cc7.J(parcel);
                int iY7 = 0;
                while (parcel.dataPosition() < iJ12) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 1) {
                        cc7.E(i11, parcel);
                    } else {
                        iY7 = cc7.y(i11, parcel);
                    }
                }
                cc7.p(iJ12, parcel);
                return new zzji(iY7);
            case 12:
                int iJ13 = cc7.J(parcel);
                String strK7 = null;
                String strK8 = null;
                String strK9 = null;
                byte[] bArrH16 = null;
                byte[] bArrH17 = null;
                ArrayList arrayListO4 = null;
                byte[] bArrH18 = null;
                zzje zzjeVar = null;
                String strK10 = null;
                int iY8 = 0;
                int iY9 = 0;
                int iY10 = 0;
                int iY11 = 0;
                long jA2 = 0;
                long jA3 = 0;
                while (parcel.dataPosition() < iJ13) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            jA2 = cc7.A(i12, parcel);
                            break;
                        case 2:
                            strK7 = cc7.k(i12, parcel);
                            break;
                        case 3:
                            iY8 = cc7.y(i12, parcel);
                            break;
                        case 4:
                            strK8 = cc7.k(i12, parcel);
                            break;
                        case 5:
                            jA3 = cc7.A(i12, parcel);
                            break;
                        case 6:
                            strK9 = cc7.k(i12, parcel);
                            break;
                        case 7:
                            bArrH16 = cc7.h(i12, parcel);
                            break;
                        case '\b':
                            bArrH17 = cc7.h(i12, parcel);
                            break;
                        case '\t':
                            arrayListO4 = cc7.o(parcel, i12, zzji.CREATOR);
                            break;
                        case '\n':
                            iY9 = cc7.y(i12, parcel);
                            break;
                        case 11:
                            bArrH18 = cc7.h(i12, parcel);
                            break;
                        case '\f':
                            zzjeVar = (zzje) cc7.j(parcel, i12, zzje.CREATOR);
                            break;
                        case '\r':
                            iY10 = cc7.y(i12, parcel);
                            break;
                        case 14:
                            iY11 = cc7.y(i12, parcel);
                            break;
                        case 15:
                            strK10 = cc7.k(i12, parcel);
                            break;
                        default:
                            cc7.E(i12, parcel);
                            break;
                    }
                }
                cc7.p(iJ13, parcel);
                return new zzjk(jA2, strK7, iY8, strK8, jA3, strK9, bArrH16, bArrH17, arrayListO4, iY9, bArrH18, zzjeVar, iY10, iY11, strK10);
            case 13:
                int iJ14 = cc7.J(parcel);
                int iY12 = 0;
                while (parcel.dataPosition() < iJ14) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        cc7.E(i13, parcel);
                    } else {
                        iY12 = cc7.y(i13, parcel);
                    }
                }
                cc7.p(iJ14, parcel);
                return new zzjm(iY12);
            case 14:
                int iJ15 = cc7.J(parcel);
                boolean zU3 = false;
                boolean zU4 = false;
                while (parcel.dataPosition() < iJ15) {
                    int i14 = parcel.readInt();
                    char c8 = (char) i14;
                    if (c8 == 1) {
                        zU3 = cc7.u(i14, parcel);
                    } else if (c8 != 2) {
                        cc7.E(i14, parcel);
                    } else {
                        zU4 = cc7.u(i14, parcel);
                    }
                }
                cc7.p(iJ15, parcel);
                return new zzjo(zU3, zU4);
            case 15:
                int iJ16 = cc7.J(parcel);
                xr9 xr9Var = null;
                IBinder iBinderX = null;
                zzni zzniVar = null;
                while (parcel.dataPosition() < iJ16) {
                    int i15 = parcel.readInt();
                    char c9 = (char) i15;
                    if (c9 == 1) {
                        iBinderX = cc7.x(i15, parcel);
                    } else if (c9 != 2) {
                        cc7.E(i15, parcel);
                    } else {
                        zzniVar = (zzni) cc7.j(parcel, i15, zzni.CREATOR);
                    }
                }
                cc7.p(iJ16, parcel);
                if (iBinderX != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinderX.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
                    xr9Var = iInterfaceQueryLocalInterface instanceof xr9 ? (xr9) iInterfaceQueryLocalInterface : new xr9(iBinderX);
                }
                zzjs zzjsVar = new zzjs();
                zzjsVar.a = xr9Var;
                zzjsVar.b = zzniVar;
                return zzjsVar;
            case 16:
                int iJ17 = cc7.J(parcel);
                xr9 xr9Var2 = null;
                IBinder iBinderX2 = null;
                zzmc zzmcVar = null;
                while (parcel.dataPosition() < iJ17) {
                    int i16 = parcel.readInt();
                    char c10 = (char) i16;
                    if (c10 == 1) {
                        iBinderX2 = cc7.x(i16, parcel);
                    } else if (c10 != 2) {
                        cc7.E(i16, parcel);
                    } else {
                        zzmcVar = (zzmc) cc7.j(parcel, i16, zzmc.CREATOR);
                    }
                }
                cc7.p(iJ17, parcel);
                if (iBinderX2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderX2.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
                    xr9Var2 = iInterfaceQueryLocalInterface2 instanceof xr9 ? (xr9) iInterfaceQueryLocalInterface2 : new xr9(iBinderX2);
                }
                zzjw zzjwVar = new zzjw();
                zzjwVar.a = xr9Var2;
                zzjwVar.b = zzmcVar;
                return zzjwVar;
            case 17:
                int iJ18 = cc7.J(parcel);
                while (parcel.dataPosition() < iJ18) {
                    cc7.E(parcel.readInt(), parcel);
                }
                cc7.p(iJ18, parcel);
                return new zzjy();
            case 18:
                int iJ19 = cc7.J(parcel);
                Bundle bundleG = null;
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
                int iY13 = 0;
                Feature[] featureArr = null;
                while (parcel.dataPosition() < iJ19) {
                    int i17 = parcel.readInt();
                    char c11 = (char) i17;
                    if (c11 == 1) {
                        bundleG = cc7.g(i17, parcel);
                    } else if (c11 == 2) {
                        featureArr = (Feature[]) cc7.n(parcel, i17, Feature.CREATOR);
                    } else if (c11 == 3) {
                        iY13 = cc7.y(i17, parcel);
                    } else if (c11 != 4) {
                        cc7.E(i17, parcel);
                    } else {
                        connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) cc7.j(parcel, i17, ConnectionTelemetryConfiguration.CREATOR);
                    }
                }
                cc7.p(iJ19, parcel);
                zzj zzjVar = new zzj();
                zzjVar.a = bundleG;
                zzjVar.b = featureArr;
                zzjVar.c = iY13;
                zzjVar.d = connectionTelemetryConfiguration;
                return zzjVar;
            case 19:
                int iJ20 = cc7.J(parcel);
                byte[] bArrH19 = null;
                byte[] bArrH20 = null;
                byte[] bArrH21 = null;
                String[] strArrL = null;
                while (parcel.dataPosition() < iJ20) {
                    int i18 = parcel.readInt();
                    char c12 = (char) i18;
                    if (c12 == 2) {
                        bArrH19 = cc7.h(i18, parcel);
                    } else if (c12 == 3) {
                        bArrH20 = cc7.h(i18, parcel);
                    } else if (c12 == 4) {
                        bArrH21 = cc7.h(i18, parcel);
                    } else if (c12 != 5) {
                        cc7.E(i18, parcel);
                    } else {
                        strArrL = cc7.l(i18, parcel);
                    }
                }
                cc7.p(iJ20, parcel);
                return new AuthenticatorAttestationResponse(bArrH19, bArrH20, bArrH21, strArrL);
            case 20:
                int iJ21 = cc7.J(parcel);
                Integer numZ = null;
                Double dV = null;
                Uri uri = null;
                byte[] bArrH22 = null;
                ArrayList arrayListO5 = null;
                ChannelIdValue channelIdValue = null;
                String strK11 = null;
                while (parcel.dataPosition() < iJ21) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 2:
                            numZ = cc7.z(i19, parcel);
                            break;
                        case 3:
                            dV = cc7.v(i19, parcel);
                            break;
                        case 4:
                            uri = (Uri) cc7.j(parcel, i19, Uri.CREATOR);
                            break;
                        case 5:
                            bArrH22 = cc7.h(i19, parcel);
                            break;
                        case 6:
                            arrayListO5 = cc7.o(parcel, i19, RegisteredKey.CREATOR);
                            break;
                        case 7:
                            channelIdValue = (ChannelIdValue) cc7.j(parcel, i19, ChannelIdValue.CREATOR);
                            break;
                        case '\b':
                            strK11 = cc7.k(i19, parcel);
                            break;
                        default:
                            cc7.E(i19, parcel);
                            break;
                    }
                }
                cc7.p(iJ21, parcel);
                return new SignRequestParams(numZ, dV, uri, bArrH22, arrayListO5, channelIdValue, strK11);
            case 21:
                int iJ22 = cc7.J(parcel);
                int iY14 = 0;
                ClientAppContext clientAppContext = null;
                int iY15 = 0;
                while (parcel.dataPosition() < iJ22) {
                    int i20 = parcel.readInt();
                    char c13 = (char) i20;
                    if (c13 == 1) {
                        iY14 = cc7.y(i20, parcel);
                    } else if (c13 == 2) {
                        clientAppContext = (ClientAppContext) cc7.j(parcel, i20, ClientAppContext.CREATOR);
                    } else if (c13 != 3) {
                        cc7.E(i20, parcel);
                    } else {
                        iY15 = cc7.y(i20, parcel);
                    }
                }
                cc7.p(iJ22, parcel);
                return new com.google.android.gms.nearby.messages.internal.zzj(iY14, clientAppContext, iY15);
            case 22:
                int iJ23 = cc7.J(parcel);
                byte[] bArrH23 = null;
                byte[] bArrH24 = null;
                int iY16 = 0;
                int iY17 = 0;
                int iY18 = 0;
                long jA4 = 0;
                long jA5 = 0;
                long jA6 = 0;
                float fW = 0.0f;
                float fW2 = 0.0f;
                int iY19 = 0;
                int iY20 = 0;
                int iY21 = 0;
                long jA7 = 0;
                while (parcel.dataPosition() < iJ23) {
                    int i21 = parcel.readInt();
                    long j = jA7;
                    switch ((char) i21) {
                        case 1:
                            iY19 = cc7.y(i21, parcel);
                            break;
                        case 2:
                            iY20 = cc7.y(i21, parcel);
                            break;
                        case 3:
                            iY21 = cc7.y(i21, parcel);
                            break;
                        case 4:
                            iY16 = cc7.y(i21, parcel);
                            break;
                        case 5:
                            iY17 = cc7.y(i21, parcel);
                            break;
                        case 6:
                            jA4 = cc7.A(i21, parcel);
                            break;
                        case 7:
                            jA5 = cc7.A(i21, parcel);
                            break;
                        case '\b':
                            fW = cc7.w(i21, parcel);
                            break;
                        case '\t':
                            fW2 = cc7.w(i21, parcel);
                            break;
                        case '\n':
                            jA7 = cc7.A(i21, parcel);
                            continue;
                        case 11:
                            jA6 = cc7.A(i21, parcel);
                            break;
                        case '\f':
                            iY18 = cc7.y(i21, parcel);
                            break;
                        case '\r':
                            bArrH24 = cc7.h(i21, parcel);
                            break;
                        case 14:
                            bArrH23 = cc7.h(i21, parcel);
                            break;
                        default:
                            cc7.E(i21, parcel);
                            break;
                    }
                    jA7 = j;
                }
                cc7.p(iJ23, parcel);
                zzka zzkaVar = new zzka();
                zzkaVar.a = iY19;
                zzkaVar.b = iY20;
                zzkaVar.c = iY21;
                zzkaVar.d = iY16;
                zzkaVar.e = iY17;
                zzkaVar.f = jA4;
                zzkaVar.g = jA5;
                zzkaVar.h = fW;
                zzkaVar.i = fW2;
                zzkaVar.j = jA7;
                zzkaVar.k = jA6;
                zzkaVar.l = iY18;
                zzkaVar.m = bArrH24;
                zzkaVar.n = bArrH23;
                return zzkaVar;
            case 23:
                int iJ24 = cc7.J(parcel);
                cs9 cs9Var = null;
                IBinder iBinderX3 = null;
                while (parcel.dataPosition() < iJ24) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 1) {
                        cc7.E(i22, parcel);
                    } else {
                        iBinderX3 = cc7.x(i22, parcel);
                    }
                }
                cc7.p(iJ24, parcel);
                if (iBinderX3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = iBinderX3.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IUwbComplexChannelResultListener");
                    cs9Var = iInterfaceQueryLocalInterface3 instanceof cs9 ? (cs9) iInterfaceQueryLocalInterface3 : new cs9(iBinderX3, "com.google.android.gms.nearby.uwb.internal.IUwbComplexChannelResultListener", 3);
                }
                zzke zzkeVar = new zzke();
                zzkeVar.a = cs9Var;
                return zzkeVar;
            case 24:
                int iJ25 = cc7.J(parcel);
                as9 as9Var = null;
                IBinder iBinderX4 = null;
                while (parcel.dataPosition() < iJ25) {
                    int i23 = parcel.readInt();
                    if (((char) i23) != 1) {
                        cc7.E(i23, parcel);
                    } else {
                        iBinderX4 = cc7.x(i23, parcel);
                    }
                }
                cc7.p(iJ25, parcel);
                if (iBinderX4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = iBinderX4.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IUwbAddressResultListener");
                    as9Var = iInterfaceQueryLocalInterface4 instanceof as9 ? (as9) iInterfaceQueryLocalInterface4 : new as9(iBinderX4, "com.google.android.gms.nearby.uwb.internal.IUwbAddressResultListener", 3);
                }
                zzki zzkiVar = new zzki();
                zzkiVar.a = as9Var;
                return zzkiVar;
            case 25:
                int iJ26 = cc7.J(parcel);
                sr9 sr9Var = null;
                IBinder iBinderX5 = null;
                while (parcel.dataPosition() < iJ26) {
                    int i24 = parcel.readInt();
                    if (((char) i24) != 1) {
                        cc7.E(i24, parcel);
                    } else {
                        iBinderX5 = cc7.x(i24, parcel);
                    }
                }
                cc7.p(iJ26, parcel);
                if (iBinderX5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = iBinderX5.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IRangingCapabilitiesResultListener");
                    sr9Var = iInterfaceQueryLocalInterface5 instanceof sr9 ? (sr9) iInterfaceQueryLocalInterface5 : new sr9(iBinderX5, "com.google.android.gms.nearby.uwb.internal.IRangingCapabilitiesResultListener", 3);
                }
                zzkm zzkmVar = new zzkm();
                zzkmVar.a = sr9Var;
                return zzkmVar;
            case 26:
                int iJ27 = cc7.J(parcel);
                RootTelemetryConfiguration rootTelemetryConfiguration = null;
                int[] iArrI = null;
                int[] iArrI2 = null;
                boolean zU5 = false;
                boolean zU6 = false;
                int iY22 = 0;
                while (parcel.dataPosition() < iJ27) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 1:
                            rootTelemetryConfiguration = (RootTelemetryConfiguration) cc7.j(parcel, i25, RootTelemetryConfiguration.CREATOR);
                            break;
                        case 2:
                            zU5 = cc7.u(i25, parcel);
                            break;
                        case 3:
                            zU6 = cc7.u(i25, parcel);
                            break;
                        case 4:
                            iArrI = cc7.i(i25, parcel);
                            break;
                        case 5:
                            iY22 = cc7.y(i25, parcel);
                            break;
                        case 6:
                            iArrI2 = cc7.i(i25, parcel);
                            break;
                        default:
                            cc7.E(i25, parcel);
                            break;
                    }
                }
                cc7.p(iJ27, parcel);
                return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zU5, zU6, iArrI, iY22, iArrI2);
            case 27:
                int iJ28 = cc7.J(parcel);
                int iY23 = 0;
                String strK12 = null;
                int iY24 = 0;
                while (parcel.dataPosition() < iJ28) {
                    int i26 = parcel.readInt();
                    char c14 = (char) i26;
                    if (c14 == 2) {
                        iY23 = cc7.y(i26, parcel);
                    } else if (c14 == 3) {
                        strK12 = cc7.k(i26, parcel);
                    } else if (c14 != 4) {
                        cc7.E(i26, parcel);
                    } else {
                        iY24 = cc7.y(i26, parcel);
                    }
                }
                cc7.p(iJ28, parcel);
                return new AuthenticatorErrorResponse(strK12, iY23, iY24);
            case 28:
                int iJ29 = cc7.J(parcel);
                byte[] bArrH25 = null;
                String strK13 = null;
                byte[] bArrH26 = null;
                byte[] bArrH27 = null;
                while (parcel.dataPosition() < iJ29) {
                    int i27 = parcel.readInt();
                    char c15 = (char) i27;
                    if (c15 == 2) {
                        bArrH25 = cc7.h(i27, parcel);
                    } else if (c15 == 3) {
                        strK13 = cc7.k(i27, parcel);
                    } else if (c15 == 4) {
                        bArrH26 = cc7.h(i27, parcel);
                    } else if (c15 != 5) {
                        cc7.E(i27, parcel);
                    } else {
                        bArrH27 = cc7.h(i27, parcel);
                    }
                }
                cc7.p(iJ29, parcel);
                return new SignResponseData(bArrH25, strK13, bArrH26, bArrH27);
            default:
                int iJ30 = cc7.J(parcel);
                qr9 qr9Var = null;
                IBinder iBinderX6 = null;
                while (parcel.dataPosition() < iJ30) {
                    int i28 = parcel.readInt();
                    if (((char) i28) != 1) {
                        cc7.E(i28, parcel);
                    } else {
                        iBinderX6 = cc7.x(i28, parcel);
                    }
                }
                cc7.p(iJ30, parcel);
                if (iBinderX6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = iBinderX6.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IBooleanResultListener");
                    qr9Var = iInterfaceQueryLocalInterface6 instanceof qr9 ? (qr9) iInterfaceQueryLocalInterface6 : new qr9(iBinderX6, "com.google.android.gms.nearby.uwb.internal.IBooleanResultListener", 3);
                }
                zzlm zzlmVar = new zzlm();
                zzlmVar.a = qr9Var;
                return zzlmVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new zzil[i];
            case 1:
                return new zzin[i];
            case 2:
                return new zziq[i];
            case 3:
                return new zzis[i];
            case 4:
                return new AuthenticatorAssertionResponse[i];
            case 5:
                return new RegisteredKey[i];
            case 6:
                return new zzi[i];
            case 7:
                return new SafeBrowsingData[i];
            case 8:
                return new zzjc[i];
            case 9:
                return new zzje[i];
            case 10:
                return new zzjg[i];
            case 11:
                return new zzji[i];
            case 12:
                return new zzjk[i];
            case 13:
                return new zzjm[i];
            case 14:
                return new zzjo[i];
            case 15:
                return new zzjs[i];
            case 16:
                return new zzjw[i];
            case 17:
                return new zzjy[i];
            case 18:
                return new zzj[i];
            case 19:
                return new AuthenticatorAttestationResponse[i];
            case 20:
                return new SignRequestParams[i];
            case 21:
                return new com.google.android.gms.nearby.messages.internal.zzj[i];
            case 22:
                return new zzka[i];
            case 23:
                return new zzke[i];
            case 24:
                return new zzki[i];
            case 25:
                return new zzkm[i];
            case 26:
                return new ConnectionTelemetryConfiguration[i];
            case 27:
                return new AuthenticatorErrorResponse[i];
            case 28:
                return new SignResponseData[i];
            default:
                return new zzlm[i];
        }
    }
}
