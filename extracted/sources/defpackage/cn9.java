package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;

/* JADX INFO: loaded from: classes.dex */
public final class cn9 extends yl9 implements en9 {
    @Override // defpackage.en9
    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j);
        zzc(23, parcelZza);
    }

    @Override // defpackage.en9
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        am9.b(parcelZza, bundle);
        zzc(9, parcelZza);
    }

    @Override // defpackage.en9
    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j);
        zzc(24, parcelZza);
    }

    @Override // defpackage.en9
    public final void generateEventId(gn9 gn9Var) throws RemoteException {
        Parcel parcelZza = zza();
        am9.c(parcelZza, gn9Var);
        zzc(22, parcelZza);
    }

    @Override // defpackage.en9
    public final void getCachedAppInstanceId(gn9 gn9Var) throws RemoteException {
        Parcel parcelZza = zza();
        am9.c(parcelZza, gn9Var);
        zzc(19, parcelZza);
    }

    @Override // defpackage.en9
    public final void getConditionalUserProperties(String str, String str2, gn9 gn9Var) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        am9.c(parcelZza, gn9Var);
        zzc(10, parcelZza);
    }

    @Override // defpackage.en9
    public final void getCurrentScreenClass(gn9 gn9Var) throws RemoteException {
        Parcel parcelZza = zza();
        am9.c(parcelZza, gn9Var);
        zzc(17, parcelZza);
    }

    @Override // defpackage.en9
    public final void getCurrentScreenName(gn9 gn9Var) throws RemoteException {
        Parcel parcelZza = zza();
        am9.c(parcelZza, gn9Var);
        zzc(16, parcelZza);
    }

    @Override // defpackage.en9
    public final void getGmpAppId(gn9 gn9Var) throws RemoteException {
        Parcel parcelZza = zza();
        am9.c(parcelZza, gn9Var);
        zzc(21, parcelZza);
    }

    @Override // defpackage.en9
    public final void getMaxUserProperties(String str, gn9 gn9Var) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        am9.c(parcelZza, gn9Var);
        zzc(6, parcelZza);
    }

    @Override // defpackage.en9
    public final void getTestFlag(gn9 gn9Var, int i) throws RemoteException {
        Parcel parcelZza = zza();
        am9.c(parcelZza, gn9Var);
        parcelZza.writeInt(i);
        zzc(38, parcelZza);
    }

    @Override // defpackage.en9
    public final void getUserProperties(String str, String str2, boolean z, gn9 gn9Var) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        ClassLoader classLoader = am9.a;
        parcelZza.writeInt(z ? 1 : 0);
        am9.c(parcelZza, gn9Var);
        zzc(5, parcelZza);
    }

    @Override // defpackage.en9
    public final void initialize(kg3 kg3Var, zzdd zzddVar, long j) throws RemoteException {
        Parcel parcelZza = zza();
        am9.c(parcelZza, kg3Var);
        am9.b(parcelZza, zzddVar);
        parcelZza.writeLong(j);
        zzc(1, parcelZza);
    }

    @Override // defpackage.en9
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        am9.b(parcelZza, bundle);
        parcelZza.writeInt(z ? 1 : 0);
        parcelZza.writeInt(z2 ? 1 : 0);
        parcelZza.writeLong(j);
        zzc(2, parcelZza);
    }

    @Override // defpackage.en9
    public final void logHealthData(int i, String str, kg3 kg3Var, kg3 kg3Var2, kg3 kg3Var3) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(5);
        parcelZza.writeString("Error with data collection. Data lost.");
        am9.c(parcelZza, kg3Var);
        am9.c(parcelZza, kg3Var2);
        am9.c(parcelZza, kg3Var3);
        zzc(33, parcelZza);
    }

    @Override // defpackage.en9
    public final void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j) throws RemoteException {
        Parcel parcelZza = zza();
        am9.b(parcelZza, zzdfVar);
        am9.b(parcelZza, bundle);
        parcelZza.writeLong(j);
        zzc(53, parcelZza);
    }

    @Override // defpackage.en9
    public final void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        Parcel parcelZza = zza();
        am9.b(parcelZza, zzdfVar);
        parcelZza.writeLong(j);
        zzc(54, parcelZza);
    }

    @Override // defpackage.en9
    public final void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        Parcel parcelZza = zza();
        am9.b(parcelZza, zzdfVar);
        parcelZza.writeLong(j);
        zzc(55, parcelZza);
    }

    @Override // defpackage.en9
    public final void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        Parcel parcelZza = zza();
        am9.b(parcelZza, zzdfVar);
        parcelZza.writeLong(j);
        zzc(56, parcelZza);
    }

    @Override // defpackage.en9
    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, gn9 gn9Var, long j) throws RemoteException {
        Parcel parcelZza = zza();
        am9.b(parcelZza, zzdfVar);
        am9.c(parcelZza, gn9Var);
        parcelZza.writeLong(j);
        zzc(57, parcelZza);
    }

    @Override // defpackage.en9
    public final void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        Parcel parcelZza = zza();
        am9.b(parcelZza, zzdfVar);
        parcelZza.writeLong(j);
        zzc(51, parcelZza);
    }

    @Override // defpackage.en9
    public final void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j) throws RemoteException {
        Parcel parcelZza = zza();
        am9.b(parcelZza, zzdfVar);
        parcelZza.writeLong(j);
        zzc(52, parcelZza);
    }

    @Override // defpackage.en9
    public final void performAction(Bundle bundle, gn9 gn9Var, long j) throws RemoteException {
        Parcel parcelZza = zza();
        am9.b(parcelZza, bundle);
        am9.c(parcelZza, gn9Var);
        parcelZza.writeLong(j);
        zzc(32, parcelZza);
    }

    @Override // defpackage.en9
    public final void registerOnMeasurementEventListener(rn9 rn9Var) throws RemoteException {
        Parcel parcelZza = zza();
        am9.c(parcelZza, rn9Var);
        zzc(35, parcelZza);
    }

    @Override // defpackage.en9
    public final void retrieveAndUploadBatches(in9 in9Var) throws RemoteException {
        Parcel parcelZza = zza();
        am9.c(parcelZza, in9Var);
        zzc(58, parcelZza);
    }

    @Override // defpackage.en9
    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel parcelZza = zza();
        am9.b(parcelZza, bundle);
        parcelZza.writeLong(j);
        zzc(8, parcelZza);
    }

    @Override // defpackage.en9
    public final void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j) throws RemoteException {
        Parcel parcelZza = zza();
        am9.b(parcelZza, zzdfVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeLong(j);
        zzc(50, parcelZza);
    }

    @Override // defpackage.en9
    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        ClassLoader classLoader = am9.a;
        parcelZza.writeInt(z ? 1 : 0);
        zzc(39, parcelZza);
    }

    @Override // defpackage.en9
    public final void setEventInterceptor(rn9 rn9Var) throws RemoteException {
        Parcel parcelZza = zza();
        am9.c(parcelZza, rn9Var);
        zzc(34, parcelZza);
    }

    @Override // defpackage.en9
    public final void setSgtmDebugInfo(Intent intent) throws RemoteException {
        Parcel parcelZza = zza();
        am9.b(parcelZza, intent);
        zzc(48, parcelZza);
    }

    @Override // defpackage.en9
    public final void setUserId(String str, long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j);
        zzc(7, parcelZza);
    }

    @Override // defpackage.en9
    public final void setUserProperty(String str, String str2, kg3 kg3Var, boolean z, long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        am9.c(parcelZza, kg3Var);
        parcelZza.writeInt(z ? 1 : 0);
        parcelZza.writeLong(j);
        zzc(4, parcelZza);
    }

    @Override // defpackage.en9
    public final void unregisterOnMeasurementEventListener(rn9 rn9Var) throws RemoteException {
        Parcel parcelZza = zza();
        am9.c(parcelZza, rn9Var);
        zzc(36, parcelZza);
    }
}
