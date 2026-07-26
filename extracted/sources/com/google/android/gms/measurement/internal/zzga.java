package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.am9;
import defpackage.zl9;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzga extends zl9 implements zzgb {
    public zzga() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // defpackage.zl9
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        zzgh zzgfVar = null;
        zzge zzgcVar = null;
        switch (i) {
            case 1:
                zzbg zzbgVar = (zzbg) am9.a(parcel, zzbg.CREATOR);
                zzr zzrVar = (zzr) am9.a(parcel, zzr.CREATOR);
                am9.d(parcel);
                zze(zzbgVar, zzrVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzpl zzplVar = (zzpl) am9.a(parcel, zzpl.CREATOR);
                zzr zzrVar2 = (zzr) am9.a(parcel, zzr.CREATOR);
                am9.d(parcel);
                zzf(zzplVar, zzrVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                zzr zzrVar3 = (zzr) am9.a(parcel, zzr.CREATOR);
                am9.d(parcel);
                zzg(zzrVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbg zzbgVar2 = (zzbg) am9.a(parcel, zzbg.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                am9.d(parcel);
                zzh(zzbgVar2, string, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                zzr zzrVar4 = (zzr) am9.a(parcel, zzr.CREATOR);
                am9.d(parcel);
                zzi(zzrVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzr zzrVar5 = (zzr) am9.a(parcel, zzr.CREATOR);
                z = parcel.readInt() != 0;
                am9.d(parcel);
                List listZzj = zzj(zzrVar5, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzj);
                return true;
            case 9:
                zzbg zzbgVar3 = (zzbg) am9.a(parcel, zzbg.CREATOR);
                String string3 = parcel.readString();
                am9.d(parcel);
                byte[] bArrZzk = zzk(zzbgVar3, string3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrZzk);
                return true;
            case 10:
                long j = parcel.readLong();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                am9.d(parcel);
                zzl(j, string4, string5, string6);
                parcel2.writeNoException();
                return true;
            case 11:
                zzr zzrVar6 = (zzr) am9.a(parcel, zzr.CREATOR);
                am9.d(parcel);
                String strZzm = zzm(zzrVar6);
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 12:
                zzah zzahVar = (zzah) am9.a(parcel, zzah.CREATOR);
                zzr zzrVar7 = (zzr) am9.a(parcel, zzr.CREATOR);
                am9.d(parcel);
                zzn(zzahVar, zzrVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzah zzahVar2 = (zzah) am9.a(parcel, zzah.CREATOR);
                am9.d(parcel);
                zzo(zzahVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader = am9.a;
                z = parcel.readInt() != 0;
                zzr zzrVar8 = (zzr) am9.a(parcel, zzr.CREATOR);
                am9.d(parcel);
                List listZzp = zzp(string7, string8, z, zzrVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzp);
                return true;
            case 15:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                ClassLoader classLoader2 = am9.a;
                z = parcel.readInt() != 0;
                am9.d(parcel);
                List listZzq = zzq(string9, string10, string11, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzq);
                return true;
            case 16:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                zzr zzrVar9 = (zzr) am9.a(parcel, zzr.CREATOR);
                am9.d(parcel);
                List listZzr = zzr(string12, string13, zzrVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzr);
                return true;
            case 17:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                am9.d(parcel);
                List listZzs = zzs(string14, string15, string16);
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzs);
                return true;
            case 18:
                zzr zzrVar10 = (zzr) am9.a(parcel, zzr.CREATOR);
                am9.d(parcel);
                zzt(zzrVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) am9.a(parcel, Bundle.CREATOR);
                zzr zzrVar11 = (zzr) am9.a(parcel, zzr.CREATOR);
                am9.d(parcel);
                zzu(bundle, zzrVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzr zzrVar12 = (zzr) am9.a(parcel, zzr.CREATOR);
                am9.d(parcel);
                zzv(zzrVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                zzr zzrVar13 = (zzr) am9.a(parcel, zzr.CREATOR);
                am9.d(parcel);
                zzao zzaoVarZzw = zzw(zzrVar13);
                parcel2.writeNoException();
                if (zzaoVarZzw == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    zzaoVarZzw.writeToParcel(parcel2, 1);
                }
                return true;
            case 24:
                zzr zzrVar14 = (zzr) am9.a(parcel, zzr.CREATOR);
                Bundle bundle2 = (Bundle) am9.a(parcel, Bundle.CREATOR);
                am9.d(parcel);
                List listZzx = zzx(zzrVar14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzx);
                return true;
            case 25:
                zzr zzrVar15 = (zzr) am9.a(parcel, zzr.CREATOR);
                am9.d(parcel);
                zzy(zzrVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                zzr zzrVar16 = (zzr) am9.a(parcel, zzr.CREATOR);
                am9.d(parcel);
                zzz(zzrVar16);
                parcel2.writeNoException();
                return true;
            case 27:
                zzr zzrVar17 = (zzr) am9.a(parcel, zzr.CREATOR);
                am9.d(parcel);
                zzA(zzrVar17);
                parcel2.writeNoException();
                return true;
            case 29:
                zzr zzrVar18 = (zzr) am9.a(parcel, zzr.CREATOR);
                zzoo zzooVar = (zzoo) am9.a(parcel, zzoo.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    zzgfVar = iInterfaceQueryLocalInterface instanceof zzgh ? (zzgh) iInterfaceQueryLocalInterface : new zzgf(strongBinder);
                }
                am9.d(parcel);
                zzB(zzrVar18, zzooVar, zzgfVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzr zzrVar19 = (zzr) am9.a(parcel, zzr.CREATOR);
                zzaf zzafVar = (zzaf) am9.a(parcel, zzaf.CREATOR);
                am9.d(parcel);
                zzC(zzrVar19, zzafVar);
                parcel2.writeNoException();
                return true;
            case 31:
                zzr zzrVar20 = (zzr) am9.a(parcel, zzr.CREATOR);
                Bundle bundle3 = (Bundle) am9.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    zzgcVar = iInterfaceQueryLocalInterface2 instanceof zzge ? (zzge) iInterfaceQueryLocalInterface2 : new zzgc(strongBinder2);
                }
                am9.d(parcel);
                zzD(zzrVar20, bundle3, zzgcVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
