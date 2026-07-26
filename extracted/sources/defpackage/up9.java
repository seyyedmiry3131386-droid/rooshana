package defpackage;

import android.bluetooth.BluetoothDevice;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.fido.fido2.api.common.zzh;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import com.google.android.gms.internal.nearby.zzfz;
import com.google.android.gms.internal.nearby.zzgb;
import com.google.android.gms.internal.nearby.zzgd;
import com.google.android.gms.internal.nearby.zzgf;
import com.google.android.gms.internal.nearby.zzgh;
import com.google.android.gms.internal.nearby.zzgj;
import com.google.android.gms.internal.nearby.zzgl;
import com.google.android.gms.internal.nearby.zzgn;
import com.google.android.gms.internal.nearby.zzgp;
import com.google.android.gms.internal.nearby.zzgr;
import com.google.android.gms.internal.nearby.zzgt;
import com.google.android.gms.internal.nearby.zzgv;
import com.google.android.gms.internal.nearby.zzgx;
import com.google.android.gms.internal.nearby.zzgz;
import com.google.android.gms.internal.nearby.zzhg;
import com.google.android.gms.internal.nearby.zzhk;
import com.google.android.gms.internal.nearby.zzhp;
import com.google.android.gms.internal.nearby.zzht;
import com.google.android.gms.internal.nearby.zzhx;
import com.google.android.gms.internal.nearby.zzib;
import com.google.android.gms.internal.nearby.zzif;
import com.google.android.gms.internal.nearby.zzih;
import com.google.android.gms.internal.nearby.zzij;
import com.google.android.gms.internal.nearby.zzjk;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.connection.zzaa;
import com.google.android.gms.nearby.connection.zzg;
import com.google.android.gms.nearby.connection.zzo;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class up9 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ up9(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        rp9 qp9Var;
        to9 to9Var;
        pp9 op9Var;
        fp9 fp9Var;
        switch (this.a) {
            case 0:
                int iJ = cc7.J(parcel);
                String strK = null;
                zzjk zzjkVar = null;
                zzo zzoVar = null;
                int iY = 0;
                int iY2 = 0;
                int iY3 = 0;
                while (parcel.dataPosition() < iJ) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            strK = cc7.k(i, parcel);
                            break;
                        case 2:
                            iY = cc7.y(i, parcel);
                            break;
                        case 3:
                            iY2 = cc7.y(i, parcel);
                            break;
                        case 4:
                            iY3 = cc7.y(i, parcel);
                            break;
                        case 5:
                            zzjkVar = (zzjk) cc7.j(parcel, i, zzjk.CREATOR);
                            break;
                        case 6:
                            zzoVar = (zzo) cc7.j(parcel, i, zzo.CREATOR);
                            break;
                        default:
                            cc7.E(i, parcel);
                            break;
                    }
                }
                cc7.p(iJ, parcel);
                return new zzfz(strK, iY, iY2, iY3, zzjkVar, zzoVar);
            case 1:
                int iJ2 = cc7.J(parcel);
                boolean zU = false;
                boolean zU2 = false;
                int iY4 = 0;
                int iY5 = 0;
                String strK2 = null;
                String strK3 = null;
                String strK4 = null;
                byte[] bArrH = null;
                byte[] bArrH2 = null;
                byte[] bArrH3 = null;
                zzjk zzjkVar2 = null;
                zzo zzoVar2 = null;
                while (parcel.dataPosition() < iJ2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 1:
                            strK2 = cc7.k(i2, parcel);
                            break;
                        case 2:
                            strK3 = cc7.k(i2, parcel);
                            break;
                        case 3:
                            strK4 = cc7.k(i2, parcel);
                            break;
                        case 4:
                            zU = cc7.u(i2, parcel);
                            break;
                        case 5:
                            bArrH = cc7.h(i2, parcel);
                            break;
                        case 6:
                            bArrH2 = cc7.h(i2, parcel);
                            break;
                        case 7:
                            bArrH3 = cc7.h(i2, parcel);
                            break;
                        case '\b':
                            zU2 = cc7.u(i2, parcel);
                            break;
                        case '\t':
                            iY4 = cc7.y(i2, parcel);
                            break;
                        case '\n':
                            zzjkVar2 = (zzjk) cc7.j(parcel, i2, zzjk.CREATOR);
                            break;
                        case 11:
                            zzoVar2 = (zzo) cc7.j(parcel, i2, zzo.CREATOR);
                            break;
                        case '\f':
                            iY5 = cc7.y(i2, parcel);
                            break;
                        default:
                            cc7.E(i2, parcel);
                            break;
                    }
                }
                cc7.p(iJ2, parcel);
                return new zzgb(strK2, strK3, strK4, zU, bArrH, bArrH2, bArrH3, zU2, iY4, zzjkVar2, zzoVar2, iY5);
            case 2:
                int iJ3 = cc7.J(parcel);
                String strK5 = null;
                String strK6 = null;
                byte[] bArrH4 = null;
                while (parcel.dataPosition() < iJ3) {
                    int i3 = parcel.readInt();
                    char c = (char) i3;
                    if (c == 1) {
                        strK5 = cc7.k(i3, parcel);
                    } else if (c == 2) {
                        strK6 = cc7.k(i3, parcel);
                    } else if (c != 3) {
                        cc7.E(i3, parcel);
                    } else {
                        bArrH4 = cc7.h(i3, parcel);
                    }
                }
                cc7.p(iJ3, parcel);
                zzgd zzgdVar = new zzgd();
                zzgdVar.a = strK5;
                zzgdVar.b = strK6;
                zzgdVar.c = bArrH4;
                return zzgdVar;
            case 3:
                int iJ4 = cc7.J(parcel);
                String strK7 = null;
                int iY6 = 0;
                byte[] bArrH5 = null;
                while (parcel.dataPosition() < iJ4) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 1) {
                        strK7 = cc7.k(i4, parcel);
                    } else if (c2 == 2) {
                        iY6 = cc7.y(i4, parcel);
                    } else if (c2 != 3) {
                        cc7.E(i4, parcel);
                    } else {
                        bArrH5 = cc7.h(i4, parcel);
                    }
                }
                cc7.p(iJ4, parcel);
                zzgf zzgfVar = new zzgf();
                zzgfVar.a = strK7;
                zzgfVar.b = iY6;
                zzgfVar.c = bArrH5;
                return zzgfVar;
            case 4:
                int iJ5 = cc7.J(parcel);
                String strK8 = null;
                byte[] bArrH6 = null;
                zzjk zzjkVar3 = null;
                zzo zzoVar3 = null;
                int iY7 = 0;
                int iY8 = 0;
                while (parcel.dataPosition() < iJ5) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 1:
                            strK8 = cc7.k(i5, parcel);
                            break;
                        case 2:
                            iY7 = cc7.y(i5, parcel);
                            break;
                        case 3:
                            bArrH6 = cc7.h(i5, parcel);
                            break;
                        case 4:
                            iY8 = cc7.y(i5, parcel);
                            break;
                        case 5:
                            zzjkVar3 = (zzjk) cc7.j(parcel, i5, zzjk.CREATOR);
                            break;
                        case 6:
                            zzoVar3 = (zzo) cc7.j(parcel, i5, zzo.CREATOR);
                            break;
                        default:
                            cc7.E(i5, parcel);
                            break;
                    }
                }
                cc7.p(iJ5, parcel);
                return new zzgh(strK8, iY7, bArrH6, iY8, zzjkVar3, zzoVar3);
            case 5:
                int iJ6 = cc7.J(parcel);
                String strK9 = null;
                zzo zzoVar4 = null;
                int iY9 = 0;
                zzjk zzjkVar4 = null;
                while (parcel.dataPosition() < iJ6) {
                    int i6 = parcel.readInt();
                    char c3 = (char) i6;
                    if (c3 == 1) {
                        strK9 = cc7.k(i6, parcel);
                    } else if (c3 == 2) {
                        iY9 = cc7.y(i6, parcel);
                    } else if (c3 == 3) {
                        zzjkVar4 = (zzjk) cc7.j(parcel, i6, zzjk.CREATOR);
                    } else if (c3 != 4) {
                        cc7.E(i6, parcel);
                    } else {
                        zzoVar4 = (zzo) cc7.j(parcel, i6, zzo.CREATOR);
                    }
                }
                cc7.p(iJ6, parcel);
                return new zzgj(strK9, iY9, zzjkVar4, zzoVar4);
            case 6:
                int iJ7 = cc7.J(parcel);
                String strK10 = null;
                zzaa zzaaVar = null;
                zzo zzoVar5 = null;
                int iY10 = 0;
                int iY11 = 0;
                while (parcel.dataPosition() < iJ7) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 == 1) {
                        strK10 = cc7.k(i7, parcel);
                    } else if (c4 == 2) {
                        iY10 = cc7.y(i7, parcel);
                    } else if (c4 == 3) {
                        zzaaVar = (zzaa) cc7.j(parcel, i7, zzaa.CREATOR);
                    } else if (c4 == 4) {
                        iY11 = cc7.y(i7, parcel);
                    } else if (c4 != 5) {
                        cc7.E(i7, parcel);
                    } else {
                        zzoVar5 = (zzo) cc7.j(parcel, i7, zzo.CREATOR);
                    }
                }
                cc7.p(iJ7, parcel);
                return new zzgl(strK10, iY10, zzaaVar, iY11, zzoVar5);
            case 7:
                int iJ8 = cc7.J(parcel);
                String strK11 = null;
                String strK12 = null;
                String strK13 = null;
                BluetoothDevice bluetoothDevice = null;
                byte[] bArrH7 = null;
                zzo zzoVar6 = null;
                int iY12 = 0;
                while (parcel.dataPosition() < iJ8) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 1:
                            strK11 = cc7.k(i8, parcel);
                            break;
                        case 2:
                            strK12 = cc7.k(i8, parcel);
                            break;
                        case 3:
                            strK13 = cc7.k(i8, parcel);
                            break;
                        case 4:
                            bluetoothDevice = (BluetoothDevice) cc7.j(parcel, i8, BluetoothDevice.CREATOR);
                            break;
                        case 5:
                            bArrH7 = cc7.h(i8, parcel);
                            break;
                        case 6:
                            iY12 = cc7.y(i8, parcel);
                            break;
                        case 7:
                            zzoVar6 = (zzo) cc7.j(parcel, i8, zzo.CREATOR);
                            break;
                        default:
                            cc7.E(i8, parcel);
                            break;
                    }
                }
                cc7.p(iJ8, parcel);
                return new zzgn(strK11, strK12, strK13, bluetoothDevice, bArrH7, iY12, zzoVar6);
            case 8:
                int iJ9 = cc7.J(parcel);
                String strK14 = null;
                int iY13 = 0;
                zzo zzoVar7 = null;
                while (parcel.dataPosition() < iJ9) {
                    int i9 = parcel.readInt();
                    char c5 = (char) i9;
                    if (c5 == 1) {
                        strK14 = cc7.k(i9, parcel);
                    } else if (c5 == 2) {
                        iY13 = cc7.y(i9, parcel);
                    } else if (c5 != 3) {
                        cc7.E(i9, parcel);
                    } else {
                        zzoVar7 = (zzo) cc7.j(parcel, i9, zzo.CREATOR);
                    }
                }
                cc7.p(iJ9, parcel);
                return new zzgp(strK14, iY13, zzoVar7);
            case 9:
                int iJ10 = cc7.J(parcel);
                String strK15 = null;
                zzhk zzhkVar = null;
                zzjk zzjkVar5 = null;
                zzo zzoVar8 = null;
                boolean zU3 = false;
                int iY14 = 0;
                while (parcel.dataPosition() < iJ10) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 1:
                            strK15 = cc7.k(i10, parcel);
                            break;
                        case 2:
                            zzhkVar = (zzhk) cc7.j(parcel, i10, zzhk.CREATOR);
                            break;
                        case 3:
                            zU3 = cc7.u(i10, parcel);
                            break;
                        case 4:
                            iY14 = cc7.y(i10, parcel);
                            break;
                        case 5:
                            zzjkVar5 = (zzjk) cc7.j(parcel, i10, zzjk.CREATOR);
                            break;
                        case 6:
                            zzoVar8 = (zzo) cc7.j(parcel, i10, zzo.CREATOR);
                            break;
                        default:
                            cc7.E(i10, parcel);
                            break;
                    }
                }
                cc7.p(iJ10, parcel);
                return new zzgr(strK15, zzhkVar, zU3, iY14, zzjkVar5, zzoVar8);
            case 10:
                int iJ11 = cc7.J(parcel);
                String strK16 = null;
                PayloadTransferUpdate payloadTransferUpdate = null;
                zzjk zzjkVar6 = null;
                zzo zzoVar9 = null;
                int iY15 = 0;
                while (parcel.dataPosition() < iJ11) {
                    int i11 = parcel.readInt();
                    char c6 = (char) i11;
                    if (c6 == 1) {
                        strK16 = cc7.k(i11, parcel);
                    } else if (c6 == 2) {
                        payloadTransferUpdate = (PayloadTransferUpdate) cc7.j(parcel, i11, PayloadTransferUpdate.CREATOR);
                    } else if (c6 == 3) {
                        iY15 = cc7.y(i11, parcel);
                    } else if (c6 == 4) {
                        zzjkVar6 = (zzjk) cc7.j(parcel, i11, zzjk.CREATOR);
                    } else if (c6 != 5) {
                        cc7.E(i11, parcel);
                    } else {
                        zzoVar9 = (zzo) cc7.j(parcel, i11, zzo.CREATOR);
                    }
                }
                cc7.p(iJ11, parcel);
                return new zzgt(strK16, payloadTransferUpdate, iY15, zzjkVar6, zzoVar9);
            case 11:
                int iJ12 = cc7.J(parcel);
                String strK17 = null;
                int iY16 = 0;
                while (parcel.dataPosition() < iJ12) {
                    int i12 = parcel.readInt();
                    char c7 = (char) i12;
                    if (c7 == 1) {
                        iY16 = cc7.y(i12, parcel);
                    } else if (c7 != 2) {
                        cc7.E(i12, parcel);
                    } else {
                        strK17 = cc7.k(i12, parcel);
                    }
                }
                cc7.p(iJ12, parcel);
                zzgv zzgvVar = new zzgv();
                zzgvVar.a = iY16;
                zzgvVar.b = strK17;
                return zzgvVar;
            case 12:
                int iJ13 = cc7.J(parcel);
                int iY17 = 0;
                while (parcel.dataPosition() < iJ13) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        cc7.E(i13, parcel);
                    } else {
                        iY17 = cc7.y(i13, parcel);
                    }
                }
                cc7.p(iJ13, parcel);
                zzgx zzgxVar = new zzgx();
                zzgxVar.a = iY17;
                return zzgxVar;
            case 13:
                int iJ14 = cc7.J(parcel);
                byte[] bArrH8 = null;
                byte[] bArrH9 = null;
                byte[] bArrH10 = null;
                byte[] bArrH11 = null;
                byte[] bArrH12 = null;
                while (parcel.dataPosition() < iJ14) {
                    int i14 = parcel.readInt();
                    char c8 = (char) i14;
                    if (c8 == 1) {
                        bArrH8 = cc7.h(i14, parcel);
                    } else if (c8 == 2) {
                        bArrH9 = cc7.h(i14, parcel);
                    } else if (c8 == 3) {
                        bArrH10 = cc7.h(i14, parcel);
                    } else if (c8 == 4) {
                        bArrH11 = cc7.h(i14, parcel);
                    } else if (c8 != 5) {
                        cc7.E(i14, parcel);
                    } else {
                        bArrH12 = cc7.h(i14, parcel);
                    }
                }
                cc7.p(iJ14, parcel);
                return new zzg(bArrH8, bArrH9, bArrH10, bArrH11, bArrH12);
            case 14:
                return new BinderWrapper(parcel);
            case 15:
                int iJ15 = cc7.J(parcel);
                Integer numZ = null;
                Double dV = null;
                Uri uri = null;
                ArrayList arrayListO = null;
                ArrayList arrayListO2 = null;
                ChannelIdValue channelIdValue = null;
                String strK18 = null;
                while (parcel.dataPosition() < iJ15) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 2:
                            numZ = cc7.z(i15, parcel);
                            break;
                        case 3:
                            dV = cc7.v(i15, parcel);
                            break;
                        case 4:
                            uri = (Uri) cc7.j(parcel, i15, Uri.CREATOR);
                            break;
                        case 5:
                            arrayListO = cc7.o(parcel, i15, RegisterRequest.CREATOR);
                            break;
                        case 6:
                            arrayListO2 = cc7.o(parcel, i15, RegisteredKey.CREATOR);
                            break;
                        case 7:
                            channelIdValue = (ChannelIdValue) cc7.j(parcel, i15, ChannelIdValue.CREATOR);
                            break;
                        case '\b':
                            strK18 = cc7.k(i15, parcel);
                            break;
                        default:
                            cc7.E(i15, parcel);
                            break;
                    }
                }
                cc7.p(iJ15, parcel);
                return new RegisterRequestParams(numZ, dV, uri, arrayListO, arrayListO2, channelIdValue, strK18);
            case 16:
                int iJ16 = cc7.J(parcel);
                int iY18 = 0;
                while (parcel.dataPosition() < iJ16) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        cc7.E(i16, parcel);
                    } else {
                        iY18 = cc7.y(i16, parcel);
                    }
                }
                cc7.p(iJ16, parcel);
                zzgz zzgzVar = new zzgz();
                zzgzVar.a = iY18;
                return zzgzVar;
            case 17:
                int iJ17 = cc7.J(parcel);
                ParcelFileDescriptor parcelFileDescriptor = null;
                while (parcel.dataPosition() < iJ17) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 1) {
                        cc7.E(i17, parcel);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) cc7.j(parcel, i17, ParcelFileDescriptor.CREATOR);
                    }
                }
                cc7.p(iJ17, parcel);
                zzhg zzhgVar = new zzhg();
                zzhgVar.a = new byte[0];
                zzhgVar.b = parcelFileDescriptor;
                if (parcelFileDescriptor != null) {
                    DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
                    try {
                        try {
                            byte[] bArr = new byte[dataInputStream.readInt()];
                            dataInputStream.read(bArr);
                            zzhg.u(dataInputStream);
                            zzhgVar.a = bArr;
                        } catch (IOException e) {
                            throw new IllegalStateException("Could not read from parcel file descriptor", e);
                        }
                    } catch (Throwable th) {
                        zzhg.u(dataInputStream);
                        throw th;
                    }
                }
                return zzhgVar;
            case 18:
                int iJ18 = cc7.J(parcel);
                byte[] bArrH13 = null;
                String strK19 = null;
                String strK20 = null;
                zzhg zzhgVar2 = null;
                long jA = 0;
                long jA2 = 0;
                long jA3 = 0;
                int iY19 = 0;
                boolean zU4 = false;
                long jA4 = -1;
                ParcelFileDescriptor parcelFileDescriptor2 = null;
                String strK21 = null;
                ParcelFileDescriptor parcelFileDescriptor3 = null;
                Uri uri2 = null;
                while (parcel.dataPosition() < iJ18) {
                    int i18 = parcel.readInt();
                    boolean z = zU4;
                    switch ((char) i18) {
                        case 1:
                            jA = cc7.A(i18, parcel);
                            break;
                        case 2:
                            iY19 = cc7.y(i18, parcel);
                            break;
                        case 3:
                            bArrH13 = cc7.h(i18, parcel);
                            break;
                        case 4:
                            parcelFileDescriptor2 = (ParcelFileDescriptor) cc7.j(parcel, i18, ParcelFileDescriptor.CREATOR);
                            break;
                        case 5:
                            strK21 = cc7.k(i18, parcel);
                            break;
                        case 6:
                            jA4 = cc7.A(i18, parcel);
                            break;
                        case 7:
                            parcelFileDescriptor3 = (ParcelFileDescriptor) cc7.j(parcel, i18, ParcelFileDescriptor.CREATOR);
                            break;
                        case '\b':
                            uri2 = (Uri) cc7.j(parcel, i18, Uri.CREATOR);
                            break;
                        case '\t':
                            jA2 = cc7.A(i18, parcel);
                            break;
                        case '\n':
                            zU4 = cc7.u(i18, parcel);
                            continue;
                        case 11:
                            zzhgVar2 = (zzhg) cc7.j(parcel, i18, zzhg.CREATOR);
                            break;
                        case '\f':
                            jA3 = cc7.A(i18, parcel);
                            break;
                        case '\r':
                            strK20 = cc7.k(i18, parcel);
                            break;
                        case 14:
                            strK19 = cc7.k(i18, parcel);
                            break;
                        default:
                            cc7.E(i18, parcel);
                            break;
                    }
                    zU4 = z;
                }
                cc7.p(iJ18, parcel);
                zzhk zzhkVar2 = new zzhk();
                zzhkVar2.a = jA;
                zzhkVar2.b = iY19;
                zzhkVar2.c = bArrH13;
                zzhkVar2.d = parcelFileDescriptor2;
                zzhkVar2.e = strK21;
                zzhkVar2.f = jA4;
                zzhkVar2.g = parcelFileDescriptor3;
                zzhkVar2.h = uri2;
                zzhkVar2.i = jA2;
                zzhkVar2.j = zU4;
                zzhkVar2.k = zzhgVar2;
                zzhkVar2.l = jA3;
                zzhkVar2.m = strK20;
                zzhkVar2.n = strK19;
                return zzhkVar2;
            case 19:
                int iJ19 = cc7.J(parcel);
                IBinder iBinderX = null;
                String strK22 = null;
                zzjk zzjkVar7 = null;
                zzo zzoVar10 = null;
                int iY20 = 0;
                while (parcel.dataPosition() < iJ19) {
                    int i19 = parcel.readInt();
                    char c9 = (char) i19;
                    if (c9 == 1) {
                        iBinderX = cc7.x(i19, parcel);
                    } else if (c9 == 2) {
                        strK22 = cc7.k(i19, parcel);
                    } else if (c9 == 3) {
                        iY20 = cc7.y(i19, parcel);
                    } else if (c9 == 4) {
                        zzjkVar7 = (zzjk) cc7.j(parcel, i19, zzjk.CREATOR);
                    } else if (c9 != 5) {
                        cc7.E(i19, parcel);
                    } else {
                        zzoVar10 = (zzo) cc7.j(parcel, i19, zzo.CREATOR);
                    }
                }
                cc7.p(iJ19, parcel);
                return new zzhp(iBinderX, strK22, iY20, zzjkVar7, zzoVar10);
            case 20:
                int iJ20 = cc7.J(parcel);
                IBinder iBinderX2 = null;
                IBinder iBinderX3 = null;
                IBinder iBinderX4 = null;
                String strK23 = null;
                String strK24 = null;
                byte[] bArrH14 = null;
                IBinder iBinderX5 = null;
                byte[] bArrH15 = null;
                ConnectionOptions connectionOptions = null;
                zzjk zzjkVar8 = null;
                zzo zzoVar11 = null;
                byte[] bArrH16 = null;
                String strK25 = null;
                int iY21 = 0;
                while (parcel.dataPosition() < iJ20) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            iBinderX2 = cc7.x(i20, parcel);
                            break;
                        case 2:
                            iBinderX3 = cc7.x(i20, parcel);
                            break;
                        case 3:
                            iBinderX4 = cc7.x(i20, parcel);
                            break;
                        case 4:
                            strK23 = cc7.k(i20, parcel);
                            break;
                        case 5:
                            strK24 = cc7.k(i20, parcel);
                            break;
                        case 6:
                            bArrH14 = cc7.h(i20, parcel);
                            break;
                        case 7:
                            iBinderX5 = cc7.x(i20, parcel);
                            break;
                        case '\b':
                            bArrH15 = cc7.h(i20, parcel);
                            break;
                        case '\t':
                            connectionOptions = (ConnectionOptions) cc7.j(parcel, i20, ConnectionOptions.CREATOR);
                            break;
                        case '\n':
                            iY21 = cc7.y(i20, parcel);
                            break;
                        case 11:
                            zzjkVar8 = (zzjk) cc7.j(parcel, i20, zzjk.CREATOR);
                            break;
                        case '\f':
                            bArrH16 = cc7.h(i20, parcel);
                            break;
                        case '\r':
                            strK25 = cc7.k(i20, parcel);
                            break;
                        case 14:
                            zzoVar11 = (zzo) cc7.j(parcel, i20, zzo.CREATOR);
                            break;
                        default:
                            cc7.E(i20, parcel);
                            break;
                    }
                }
                cc7.p(iJ20, parcel);
                return new zzht(iBinderX2, iBinderX3, iBinderX4, strK23, strK24, bArrH14, iBinderX5, bArrH15, connectionOptions, iY21, zzjkVar8, zzoVar11, bArrH16, strK25);
            case 21:
                int iJ21 = cc7.J(parcel);
                IBinder iBinderX6 = null;
                String[] strArrL = null;
                zzhk zzhkVar3 = null;
                zzjk zzjkVar9 = null;
                zzo zzoVar12 = null;
                boolean zU5 = false;
                int iY22 = 0;
                while (parcel.dataPosition() < iJ21) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            iBinderX6 = cc7.x(i21, parcel);
                            break;
                        case 2:
                            strArrL = cc7.l(i21, parcel);
                            break;
                        case 3:
                            zzhkVar3 = (zzhk) cc7.j(parcel, i21, zzhk.CREATOR);
                            break;
                        case 4:
                            zU5 = cc7.u(i21, parcel);
                            break;
                        case 5:
                            iY22 = cc7.y(i21, parcel);
                            break;
                        case 6:
                            zzjkVar9 = (zzjk) cc7.j(parcel, i21, zzjk.CREATOR);
                            break;
                        case 7:
                            zzoVar12 = (zzo) cc7.j(parcel, i21, zzo.CREATOR);
                            break;
                        default:
                            cc7.E(i21, parcel);
                            break;
                    }
                }
                cc7.p(iJ21, parcel);
                return new zzhx(iBinderX6, strArrL, zzhkVar3, zU5, iY22, zzjkVar9, zzoVar12);
            case 22:
                int iJ22 = cc7.J(parcel);
                byte[] bArrH17 = null;
                boolean zU6 = false;
                while (parcel.dataPosition() < iJ22) {
                    int i22 = parcel.readInt();
                    char c10 = (char) i22;
                    if (c10 == 1) {
                        zU6 = cc7.u(i22, parcel);
                    } else if (c10 != 2) {
                        cc7.E(i22, parcel);
                    } else {
                        bArrH17 = cc7.h(i22, parcel);
                    }
                }
                cc7.p(iJ22, parcel);
                return new zzh(bArrH17, zU6);
            case 23:
                int iJ23 = cc7.J(parcel);
                byte[] bArrH18 = null;
                String strK26 = null;
                String strK27 = null;
                while (parcel.dataPosition() < iJ23) {
                    int i23 = parcel.readInt();
                    char c11 = (char) i23;
                    if (c11 == 2) {
                        bArrH18 = cc7.h(i23, parcel);
                    } else if (c11 == 3) {
                        strK26 = cc7.k(i23, parcel);
                    } else if (c11 != 4) {
                        cc7.E(i23, parcel);
                    } else {
                        strK27 = cc7.k(i23, parcel);
                    }
                }
                cc7.p(iJ23, parcel);
                return new RegisterResponseData(bArrH18, strK26, strK27);
            case 24:
                int iJ24 = cc7.J(parcel);
                IBinder iBinderX7 = null;
                ClientAppContext clientAppContext = null;
                int iY23 = 0;
                String strK28 = null;
                while (parcel.dataPosition() < iJ24) {
                    int i24 = parcel.readInt();
                    char c12 = (char) i24;
                    if (c12 == 1) {
                        iY23 = cc7.y(i24, parcel);
                    } else if (c12 == 2) {
                        iBinderX7 = cc7.x(i24, parcel);
                    } else if (c12 == 3) {
                        strK28 = cc7.k(i24, parcel);
                    } else if (c12 != 4) {
                        cc7.E(i24, parcel);
                    } else {
                        clientAppContext = (ClientAppContext) cc7.j(parcel, i24, ClientAppContext.CREATOR);
                    }
                }
                cc7.p(iJ24, parcel);
                return new com.google.android.gms.nearby.messages.internal.zzh(iY23, iBinderX7, strK28, clientAppContext);
            case 25:
                int iJ25 = cc7.J(parcel);
                int iY24 = 0;
                boolean zU7 = false;
                while (parcel.dataPosition() < iJ25) {
                    int i25 = parcel.readInt();
                    char c13 = (char) i25;
                    if (c13 == 2) {
                        iY24 = cc7.y(i25, parcel);
                    } else if (c13 != 3) {
                        cc7.E(i25, parcel);
                    } else {
                        zU7 = cc7.u(i25, parcel);
                    }
                }
                cc7.p(iJ25, parcel);
                return new com.google.android.gms.safetynet.zzh(iY24, zU7);
            case 26:
                int iJ26 = cc7.J(parcel);
                bp9 zo9Var = null;
                long jA5 = 0;
                IBinder iBinderX8 = null;
                IBinder iBinderX9 = null;
                String strK29 = null;
                String strK30 = null;
                AdvertisingOptions advertisingOptions = null;
                IBinder iBinderX10 = null;
                byte[] bArrH19 = null;
                while (parcel.dataPosition() < iJ26) {
                    int i26 = parcel.readInt();
                    switch ((char) i26) {
                        case 1:
                            iBinderX8 = cc7.x(i26, parcel);
                            break;
                        case 2:
                            iBinderX9 = cc7.x(i26, parcel);
                            break;
                        case 3:
                            strK29 = cc7.k(i26, parcel);
                            break;
                        case 4:
                            strK30 = cc7.k(i26, parcel);
                            break;
                        case 5:
                            jA5 = cc7.A(i26, parcel);
                            break;
                        case 6:
                            advertisingOptions = (AdvertisingOptions) cc7.j(parcel, i26, AdvertisingOptions.CREATOR);
                            break;
                        case 7:
                            iBinderX10 = cc7.x(i26, parcel);
                            break;
                        case '\b':
                            bArrH19 = cc7.h(i26, parcel);
                            break;
                        default:
                            cc7.E(i26, parcel);
                            break;
                    }
                }
                cc7.p(iJ26, parcel);
                if (iBinderX8 == null) {
                    qp9Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinderX8.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
                    qp9Var = iInterfaceQueryLocalInterface instanceof rp9 ? (rp9) iInterfaceQueryLocalInterface : new qp9(iBinderX8, "com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener", 3);
                }
                if (iBinderX9 == null) {
                    to9Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = iBinderX9.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
                    to9Var = iInterfaceQueryLocalInterface2 instanceof to9 ? (to9) iInterfaceQueryLocalInterface2 : new to9(iBinderX9, "com.google.android.gms.nearby.internal.connection.IAdvertisingCallback", 3);
                }
                if (iBinderX10 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = iBinderX10.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
                    zo9Var = iInterfaceQueryLocalInterface3 instanceof bp9 ? (bp9) iInterfaceQueryLocalInterface3 : new zo9(iBinderX10);
                }
                zzib zzibVar = new zzib();
                zzibVar.a = qp9Var;
                zzibVar.b = to9Var;
                zzibVar.c = strK29;
                zzibVar.d = strK30;
                zzibVar.e = jA5;
                zzibVar.f = advertisingOptions;
                zzibVar.g = zo9Var;
                zzibVar.h = bArrH19;
                return zzibVar;
            case 27:
                int iJ27 = cc7.J(parcel);
                jp9 hp9Var = null;
                long jA6 = 0;
                IBinder iBinderX11 = null;
                IBinder iBinderX12 = null;
                String strK31 = null;
                DiscoveryOptions discoveryOptions = null;
                IBinder iBinderX13 = null;
                while (parcel.dataPosition() < iJ27) {
                    int i27 = parcel.readInt();
                    switch ((char) i27) {
                        case 1:
                            iBinderX11 = cc7.x(i27, parcel);
                            break;
                        case 2:
                            iBinderX12 = cc7.x(i27, parcel);
                            break;
                        case 3:
                            strK31 = cc7.k(i27, parcel);
                            break;
                        case 4:
                            jA6 = cc7.A(i27, parcel);
                            break;
                        case 5:
                            discoveryOptions = (DiscoveryOptions) cc7.j(parcel, i27, DiscoveryOptions.CREATOR);
                            break;
                        case 6:
                            iBinderX13 = cc7.x(i27, parcel);
                            break;
                        default:
                            cc7.E(i27, parcel);
                            break;
                    }
                }
                cc7.p(iJ27, parcel);
                if (iBinderX11 == null) {
                    op9Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = iBinderX11.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
                    op9Var = iInterfaceQueryLocalInterface4 instanceof pp9 ? (pp9) iInterfaceQueryLocalInterface4 : new op9(iBinderX11);
                }
                if (iBinderX12 == null) {
                    fp9Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface5 = iBinderX12.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryCallback");
                    fp9Var = iInterfaceQueryLocalInterface5 instanceof fp9 ? (fp9) iInterfaceQueryLocalInterface5 : new fp9(iBinderX12, "com.google.android.gms.nearby.internal.connection.IDiscoveryCallback", 3);
                }
                if (iBinderX13 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = iBinderX13.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
                    hp9Var = iInterfaceQueryLocalInterface6 instanceof jp9 ? (jp9) iInterfaceQueryLocalInterface6 : new hp9(iBinderX13, "com.google.android.gms.nearby.internal.connection.IDiscoveryListener", 3);
                }
                zzif zzifVar = new zzif();
                zzifVar.a = op9Var;
                zzifVar.f = fp9Var;
                zzifVar.b = strK31;
                zzifVar.c = jA6;
                zzifVar.d = discoveryOptions;
                zzifVar.e = hp9Var;
                return zzifVar;
            case 28:
                int iJ28 = cc7.J(parcel);
                while (parcel.dataPosition() < iJ28) {
                    cc7.E(parcel.readInt(), parcel);
                }
                cc7.p(iJ28, parcel);
                return new zzih();
            default:
                int iJ29 = cc7.J(parcel);
                while (parcel.dataPosition() < iJ29) {
                    cc7.E(parcel.readInt(), parcel);
                }
                cc7.p(iJ29, parcel);
                return new zzij();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new zzfz[i];
            case 1:
                return new zzgb[i];
            case 2:
                return new zzgd[i];
            case 3:
                return new zzgf[i];
            case 4:
                return new zzgh[i];
            case 5:
                return new zzgj[i];
            case 6:
                return new zzgl[i];
            case 7:
                return new zzgn[i];
            case 8:
                return new zzgp[i];
            case 9:
                return new zzgr[i];
            case 10:
                return new zzgt[i];
            case 11:
                return new zzgv[i];
            case 12:
                return new zzgx[i];
            case 13:
                return new zzg[i];
            case 14:
                return new BinderWrapper[i];
            case 15:
                return new RegisterRequestParams[i];
            case 16:
                return new zzgz[i];
            case 17:
                return new zzhg[i];
            case 18:
                return new zzhk[i];
            case 19:
                return new zzhp[i];
            case 20:
                return new zzht[i];
            case 21:
                return new zzhx[i];
            case 22:
                return new zzh[i];
            case 23:
                return new RegisterResponseData[i];
            case 24:
                return new com.google.android.gms.nearby.messages.internal.zzh[i];
            case 25:
                return new com.google.android.gms.safetynet.zzh[i];
            case 26:
                return new zzib[i];
            case 27:
                return new zzif[i];
            case 28:
                return new zzih[i];
            default:
                return new zzij[i];
        }
    }
}
