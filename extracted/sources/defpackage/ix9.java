package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzs;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.common.zzt;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails;
import com.google.android.gms.fido.fido2.api.common.zzu;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.connection.Strategy;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ix9 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ ix9(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int iJ = cc7.J(parcel);
                ArrayList arrayListM = null;
                ArrayList arrayListM2 = null;
                ArrayList arrayListM3 = null;
                ArrayList arrayListM4 = null;
                ArrayList arrayListM5 = null;
                int iY = 0;
                while (parcel.dataPosition() < iJ) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            iY = cc7.y(i, parcel);
                            break;
                        case 2:
                            arrayListM = cc7.m(i, parcel);
                            break;
                        case 3:
                            arrayListM2 = cc7.m(i, parcel);
                            break;
                        case 4:
                            arrayListM3 = cc7.m(i, parcel);
                            break;
                        case 5:
                            arrayListM4 = cc7.m(i, parcel);
                            break;
                        case 6:
                            arrayListM5 = cc7.m(i, parcel);
                            break;
                        default:
                            cc7.E(i, parcel);
                            break;
                    }
                }
                cc7.p(iJ, parcel);
                return new zzs(iY, arrayListM, arrayListM2, arrayListM3, arrayListM4, arrayListM5);
            case 1:
                int iJ2 = cc7.J(parcel);
                boolean zU = false;
                String strK = null;
                IBinder iBinderX = null;
                boolean zU2 = false;
                while (parcel.dataPosition() < iJ2) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        strK = cc7.k(i2, parcel);
                    } else if (c == 2) {
                        iBinderX = cc7.x(i2, parcel);
                    } else if (c == 3) {
                        zU = cc7.u(i2, parcel);
                    } else if (c != 4) {
                        cc7.E(i2, parcel);
                    } else {
                        zU2 = cc7.u(i2, parcel);
                    }
                }
                cc7.p(iJ2, parcel);
                return new zzt(strK, iBinderX, zU, zU2);
            case 2:
                int iJ3 = cc7.J(parcel);
                boolean zU3 = false;
                while (parcel.dataPosition() < iJ3) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 1) {
                        cc7.E(i3, parcel);
                    } else {
                        zU3 = cc7.u(i3, parcel);
                    }
                }
                cc7.p(iJ3, parcel);
                return new zzu(zU3);
            case 3:
                int iJ4 = cc7.J(parcel);
                boolean zU4 = true;
                boolean zU5 = true;
                boolean zU6 = true;
                boolean zU7 = true;
                boolean zU8 = false;
                boolean zU9 = false;
                boolean zU10 = false;
                int iY2 = 0;
                int iY3 = 0;
                boolean zU11 = false;
                byte[] bArrH = null;
                ParcelUuid parcelUuid = null;
                Strategy strategy = null;
                int[] iArrI = null;
                long jA = 0;
                boolean zU12 = true;
                boolean zU13 = true;
                boolean zU14 = true;
                boolean zU15 = true;
                while (parcel.dataPosition() < iJ4) {
                    int i4 = parcel.readInt();
                    byte[] bArr = bArrH;
                    switch ((char) i4) {
                        case 1:
                            strategy = (Strategy) cc7.j(parcel, i4, Strategy.CREATOR);
                            break;
                        case 2:
                            zU8 = cc7.u(i4, parcel);
                            break;
                        case 3:
                            zU4 = cc7.u(i4, parcel);
                            break;
                        case 4:
                            zU12 = cc7.u(i4, parcel);
                            break;
                        case 5:
                            zU9 = cc7.u(i4, parcel);
                            break;
                        case 6:
                            parcelUuid = (ParcelUuid) cc7.j(parcel, i4, ParcelUuid.CREATOR);
                            break;
                        case 7:
                        default:
                            cc7.E(i4, parcel);
                            break;
                        case '\b':
                            zU13 = cc7.u(i4, parcel);
                            break;
                        case '\t':
                            zU14 = cc7.u(i4, parcel);
                            break;
                        case '\n':
                            zU15 = cc7.u(i4, parcel);
                            break;
                        case 11:
                            zU10 = cc7.u(i4, parcel);
                            break;
                        case '\f':
                            iY2 = cc7.y(i4, parcel);
                            break;
                        case '\r':
                            iY3 = cc7.y(i4, parcel);
                            break;
                        case 14:
                            bArrH = cc7.h(i4, parcel);
                            continue;
                        case 15:
                            jA = cc7.A(i4, parcel);
                            break;
                        case 16:
                            iArrI = cc7.i(i4, parcel);
                            break;
                        case 17:
                            zU7 = cc7.u(i4, parcel);
                            break;
                        case 18:
                            zU11 = cc7.u(i4, parcel);
                            break;
                        case 19:
                            zU6 = cc7.u(i4, parcel);
                            break;
                        case 20:
                            zU5 = cc7.u(i4, parcel);
                            break;
                    }
                    bArrH = bArr;
                }
                byte[] bArr2 = bArrH;
                cc7.p(iJ4, parcel);
                DiscoveryOptions discoveryOptions = new DiscoveryOptions();
                discoveryOptions.a = strategy;
                discoveryOptions.b = zU8;
                discoveryOptions.c = zU4;
                discoveryOptions.d = zU12;
                discoveryOptions.e = zU9;
                discoveryOptions.f = parcelUuid;
                discoveryOptions.g = zU13;
                discoveryOptions.h = zU14;
                discoveryOptions.i = zU15;
                discoveryOptions.j = zU10;
                discoveryOptions.k = iY2;
                discoveryOptions.l = iY3;
                discoveryOptions.m = bArr2;
                discoveryOptions.n = jA;
                discoveryOptions.o = iArrI;
                discoveryOptions.p = zU7;
                discoveryOptions.q = zU11;
                discoveryOptions.r = zU6;
                discoveryOptions.s = zU5;
                return discoveryOptions;
            case 4:
                int iJ5 = cc7.J(parcel);
                HashSet hashSet = new HashSet();
                int iY4 = 0;
                zzw zzwVar = null;
                String strK2 = null;
                String strK3 = null;
                String strK4 = null;
                while (parcel.dataPosition() < iJ5) {
                    int i5 = parcel.readInt();
                    char c2 = (char) i5;
                    if (c2 == 1) {
                        iY4 = cc7.y(i5, parcel);
                        hashSet.add(1);
                    } else if (c2 == 2) {
                        zzwVar = (zzw) cc7.j(parcel, i5, zzw.CREATOR);
                        hashSet.add(2);
                    } else if (c2 == 3) {
                        strK2 = cc7.k(i5, parcel);
                        hashSet.add(3);
                    } else if (c2 == 4) {
                        strK3 = cc7.k(i5, parcel);
                        hashSet.add(4);
                    } else if (c2 != 5) {
                        cc7.E(i5, parcel);
                    } else {
                        strK4 = cc7.k(i5, parcel);
                        hashSet.add(5);
                    }
                }
                if (parcel.dataPosition() == iJ5) {
                    return new com.google.android.gms.auth.api.accounttransfer.zzu(hashSet, iY4, zzwVar, strK2, strK3, strK4);
                }
                throw new SafeParcelReader$ParseException(rm7.n(iJ5, "Overread allowed size end="), parcel);
            case 5:
                int iJ6 = cc7.J(parcel);
                String strK5 = null;
                while (parcel.dataPosition() < iJ6) {
                    int i6 = parcel.readInt();
                    if (((char) i6) != 2) {
                        cc7.E(i6, parcel);
                    } else {
                        strK5 = cc7.k(i6, parcel);
                    }
                }
                cc7.p(iJ6, parcel);
                return new FidoAppIdExtension(strK5);
            case 6:
                int iJ7 = cc7.J(parcel);
                HashSet hashSet2 = new HashSet();
                int iY5 = 0;
                String strK6 = null;
                byte[] bArrH2 = null;
                PendingIntent pendingIntent = null;
                DeviceMetaData deviceMetaData = null;
                int iY6 = 0;
                while (parcel.dataPosition() < iJ7) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            iY5 = cc7.y(i7, parcel);
                            hashSet2.add(1);
                            break;
                        case 2:
                            strK6 = cc7.k(i7, parcel);
                            hashSet2.add(2);
                            break;
                        case 3:
                            iY6 = cc7.y(i7, parcel);
                            hashSet2.add(3);
                            break;
                        case 4:
                            bArrH2 = cc7.h(i7, parcel);
                            hashSet2.add(4);
                            break;
                        case 5:
                            pendingIntent = (PendingIntent) cc7.j(parcel, i7, PendingIntent.CREATOR);
                            hashSet2.add(5);
                            break;
                        case 6:
                            deviceMetaData = (DeviceMetaData) cc7.j(parcel, i7, DeviceMetaData.CREATOR);
                            hashSet2.add(6);
                            break;
                        default:
                            cc7.E(i7, parcel);
                            break;
                    }
                }
                if (parcel.dataPosition() == iJ7) {
                    return new zzw(hashSet2, iY5, strK6, iY6, bArrH2, pendingIntent, deviceMetaData);
                }
                throw new SafeParcelReader$ParseException(rm7.n(iJ7, "Overread allowed size end="), parcel);
            case 7:
                int iJ8 = cc7.J(parcel);
                boolean zU16 = false;
                boolean zU17 = false;
                String strK7 = null;
                String strK8 = null;
                byte[] bArrH3 = null;
                byte[] bArrH4 = null;
                while (parcel.dataPosition() < iJ8) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 1:
                            strK7 = cc7.k(i8, parcel);
                            break;
                        case 2:
                            strK8 = cc7.k(i8, parcel);
                            break;
                        case 3:
                            bArrH3 = cc7.h(i8, parcel);
                            break;
                        case 4:
                            bArrH4 = cc7.h(i8, parcel);
                            break;
                        case 5:
                            zU16 = cc7.u(i8, parcel);
                            break;
                        case 6:
                            zU17 = cc7.u(i8, parcel);
                            break;
                        default:
                            cc7.E(i8, parcel);
                            break;
                    }
                }
                cc7.p(iJ8, parcel);
                return new FidoCredentialDetails(strK7, strK8, bArrH3, bArrH4, zU16, zU17);
            case 8:
                int iJ9 = cc7.J(parcel);
                long jA2 = 0;
                long jA3 = 0;
                int iY7 = 0;
                long jA4 = 0;
                while (parcel.dataPosition() < iJ9) {
                    int i9 = parcel.readInt();
                    char c3 = (char) i9;
                    if (c3 == 1) {
                        jA2 = cc7.A(i9, parcel);
                    } else if (c3 == 2) {
                        iY7 = cc7.y(i9, parcel);
                    } else if (c3 == 3) {
                        jA4 = cc7.A(i9, parcel);
                    } else if (c3 != 4) {
                        cc7.E(i9, parcel);
                    } else {
                        jA3 = cc7.A(i9, parcel);
                    }
                }
                cc7.p(iJ9, parcel);
                PayloadTransferUpdate payloadTransferUpdate = new PayloadTransferUpdate();
                payloadTransferUpdate.a = jA2;
                payloadTransferUpdate.b = iY7;
                payloadTransferUpdate.c = jA4;
                payloadTransferUpdate.d = jA3;
                return payloadTransferUpdate;
            case 9:
                int iJ10 = cc7.J(parcel);
                int iY8 = 0;
                boolean zU18 = false;
                boolean zU19 = false;
                long jA5 = 0;
                while (parcel.dataPosition() < iJ10) {
                    int i10 = parcel.readInt();
                    char c4 = (char) i10;
                    if (c4 == 1) {
                        iY8 = cc7.y(i10, parcel);
                    } else if (c4 == 2) {
                        zU18 = cc7.u(i10, parcel);
                    } else if (c4 == 3) {
                        jA5 = cc7.A(i10, parcel);
                    } else if (c4 != 4) {
                        cc7.E(i10, parcel);
                    } else {
                        zU19 = cc7.u(i10, parcel);
                    }
                }
                cc7.p(iJ10, parcel);
                return new DeviceMetaData(iY8, zU18, jA5, zU19);
            default:
                int iJ11 = cc7.J(parcel);
                int iY9 = 0;
                int iY10 = 0;
                while (parcel.dataPosition() < iJ11) {
                    int i11 = parcel.readInt();
                    char c5 = (char) i11;
                    if (c5 == 3) {
                        iY9 = cc7.y(i11, parcel);
                    } else if (c5 != 4) {
                        cc7.E(i11, parcel);
                    } else {
                        iY10 = cc7.y(i11, parcel);
                    }
                }
                cc7.p(iJ11, parcel);
                return new Strategy(iY9, iY10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new zzs[i];
            case 1:
                return new zzt[i];
            case 2:
                return new zzu[i];
            case 3:
                return new DiscoveryOptions[i];
            case 4:
                return new com.google.android.gms.auth.api.accounttransfer.zzu[i];
            case 5:
                return new FidoAppIdExtension[i];
            case 6:
                return new zzw[i];
            case 7:
                return new FidoCredentialDetails[i];
            case 8:
                return new PayloadTransferUpdate[i];
            case 9:
                return new DeviceMetaData[i];
            default:
                return new Strategy[i];
        }
    }
}
