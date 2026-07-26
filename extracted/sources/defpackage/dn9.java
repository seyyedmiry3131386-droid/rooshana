package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class dn9 extends zl9 implements en9 {
    public static en9 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof en9 ? (en9) iInterfaceQueryLocalInterface : new cn9(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // defpackage.zl9
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        gn9 fn9Var = null;
        in9 hn9Var = null;
        gn9 fn9Var2 = null;
        gn9 fn9Var3 = null;
        gn9 fn9Var4 = null;
        gn9 fn9Var5 = null;
        rn9 jn9Var = null;
        rn9 jn9Var2 = null;
        rn9 jn9Var3 = null;
        gn9 fn9Var6 = null;
        gn9 fn9Var7 = null;
        gn9 fn9Var8 = null;
        gn9 fn9Var9 = null;
        gn9 fn9Var10 = null;
        gn9 fn9Var11 = null;
        tn9 sn9Var = null;
        gn9 fn9Var12 = null;
        gn9 fn9Var13 = null;
        gn9 fn9Var14 = null;
        gn9 fn9Var15 = null;
        gn9 fn9Var16 = null;
        switch (i) {
            case 1:
                kg3 kg3VarP0 = dr5.p0(parcel.readStrongBinder());
                zzdd zzddVar = (zzdd) am9.a(parcel, zzdd.CREATOR);
                long j = parcel.readLong();
                am9.d(parcel);
                initialize(kg3VarP0, zzddVar, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) am9.a(parcel, Bundle.CREATOR);
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                long j2 = parcel.readLong();
                am9.d(parcel);
                logEvent(string, string2, bundle, z2, z3, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) am9.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fn9Var = iInterfaceQueryLocalInterface instanceof gn9 ? (gn9) iInterfaceQueryLocalInterface : new fn9(strongBinder);
                }
                gn9 gn9Var = fn9Var;
                long j3 = parcel.readLong();
                am9.d(parcel);
                logEventAndBundle(string3, string4, bundle2, gn9Var, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                kg3 kg3VarP02 = dr5.p0(parcel.readStrongBinder());
                ClassLoader classLoader = am9.a;
                z = parcel.readInt() != 0;
                long j4 = parcel.readLong();
                am9.d(parcel);
                setUserProperty(string5, string6, kg3VarP02, z, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = am9.a;
                z = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fn9Var16 = iInterfaceQueryLocalInterface2 instanceof gn9 ? (gn9) iInterfaceQueryLocalInterface2 : new fn9(strongBinder2);
                }
                am9.d(parcel);
                getUserProperties(string7, string8, z, fn9Var16);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fn9Var15 = iInterfaceQueryLocalInterface3 instanceof gn9 ? (gn9) iInterfaceQueryLocalInterface3 : new fn9(strongBinder3);
                }
                am9.d(parcel);
                getMaxUserProperties(string9, fn9Var15);
                break;
            case 7:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                am9.d(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) am9.a(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                am9.d(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) am9.a(parcel, Bundle.CREATOR);
                am9.d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fn9Var14 = iInterfaceQueryLocalInterface4 instanceof gn9 ? (gn9) iInterfaceQueryLocalInterface4 : new fn9(strongBinder4);
                }
                am9.d(parcel);
                getConditionalUserProperties(string13, string14, fn9Var14);
                break;
            case 11:
                ClassLoader classLoader3 = am9.a;
                z = parcel.readInt() != 0;
                long j7 = parcel.readLong();
                am9.d(parcel);
                setMeasurementEnabled(z, j7);
                break;
            case 12:
                long j8 = parcel.readLong();
                am9.d(parcel);
                resetAnalyticsData(j8);
                break;
            case 13:
                long j9 = parcel.readLong();
                am9.d(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                am9.d(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                kg3 kg3VarP03 = dr5.p0(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                am9.d(parcel);
                setCurrentScreen(kg3VarP03, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fn9Var13 = iInterfaceQueryLocalInterface5 instanceof gn9 ? (gn9) iInterfaceQueryLocalInterface5 : new fn9(strongBinder5);
                }
                am9.d(parcel);
                getCurrentScreenName(fn9Var13);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fn9Var12 = iInterfaceQueryLocalInterface6 instanceof gn9 ? (gn9) iInterfaceQueryLocalInterface6 : new fn9(strongBinder6);
                }
                am9.d(parcel);
                getCurrentScreenClass(fn9Var12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    sn9Var = iInterfaceQueryLocalInterface7 instanceof tn9 ? (tn9) iInterfaceQueryLocalInterface7 : new sn9(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider");
                }
                am9.d(parcel);
                setInstanceIdProvider(sn9Var);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fn9Var11 = iInterfaceQueryLocalInterface8 instanceof gn9 ? (gn9) iInterfaceQueryLocalInterface8 : new fn9(strongBinder8);
                }
                am9.d(parcel);
                getCachedAppInstanceId(fn9Var11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fn9Var10 = iInterfaceQueryLocalInterface9 instanceof gn9 ? (gn9) iInterfaceQueryLocalInterface9 : new fn9(strongBinder9);
                }
                am9.d(parcel);
                getAppInstanceId(fn9Var10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fn9Var9 = iInterfaceQueryLocalInterface10 instanceof gn9 ? (gn9) iInterfaceQueryLocalInterface10 : new fn9(strongBinder10);
                }
                am9.d(parcel);
                getGmpAppId(fn9Var9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fn9Var8 = iInterfaceQueryLocalInterface11 instanceof gn9 ? (gn9) iInterfaceQueryLocalInterface11 : new fn9(strongBinder11);
                }
                am9.d(parcel);
                generateEventId(fn9Var8);
                break;
            case 23:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                am9.d(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                am9.d(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case 25:
                kg3 kg3VarP04 = dr5.p0(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                am9.d(parcel);
                onActivityStarted(kg3VarP04, j14);
                break;
            case 26:
                kg3 kg3VarP05 = dr5.p0(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                am9.d(parcel);
                onActivityStopped(kg3VarP05, j15);
                break;
            case 27:
                kg3 kg3VarP06 = dr5.p0(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) am9.a(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                am9.d(parcel);
                onActivityCreated(kg3VarP06, bundle5, j16);
                break;
            case 28:
                kg3 kg3VarP07 = dr5.p0(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                am9.d(parcel);
                onActivityDestroyed(kg3VarP07, j17);
                break;
            case 29:
                kg3 kg3VarP08 = dr5.p0(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                am9.d(parcel);
                onActivityPaused(kg3VarP08, j18);
                break;
            case 30:
                kg3 kg3VarP09 = dr5.p0(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                am9.d(parcel);
                onActivityResumed(kg3VarP09, j19);
                break;
            case 31:
                kg3 kg3VarP010 = dr5.p0(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fn9Var7 = iInterfaceQueryLocalInterface12 instanceof gn9 ? (gn9) iInterfaceQueryLocalInterface12 : new fn9(strongBinder12);
                }
                long j20 = parcel.readLong();
                am9.d(parcel);
                onActivitySaveInstanceState(kg3VarP010, fn9Var7, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) am9.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fn9Var6 = iInterfaceQueryLocalInterface13 instanceof gn9 ? (gn9) iInterfaceQueryLocalInterface13 : new fn9(strongBinder13);
                }
                long j21 = parcel.readLong();
                am9.d(parcel);
                performAction(bundle6, fn9Var6, j21);
                break;
            case 33:
                int i3 = parcel.readInt();
                String string19 = parcel.readString();
                kg3 kg3VarP011 = dr5.p0(parcel.readStrongBinder());
                kg3 kg3VarP012 = dr5.p0(parcel.readStrongBinder());
                kg3 kg3VarP013 = dr5.p0(parcel.readStrongBinder());
                am9.d(parcel);
                logHealthData(i3, string19, kg3VarP011, kg3VarP012, kg3VarP013);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    jn9Var3 = iInterfaceQueryLocalInterface14 instanceof rn9 ? (rn9) iInterfaceQueryLocalInterface14 : new jn9(strongBinder14);
                }
                am9.d(parcel);
                setEventInterceptor(jn9Var3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    jn9Var2 = iInterfaceQueryLocalInterface15 instanceof rn9 ? (rn9) iInterfaceQueryLocalInterface15 : new jn9(strongBinder15);
                }
                am9.d(parcel);
                registerOnMeasurementEventListener(jn9Var2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    jn9Var = iInterfaceQueryLocalInterface16 instanceof rn9 ? (rn9) iInterfaceQueryLocalInterface16 : new jn9(strongBinder16);
                }
                am9.d(parcel);
                unregisterOnMeasurementEventListener(jn9Var);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(am9.a);
                am9.d(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fn9Var5 = iInterfaceQueryLocalInterface17 instanceof gn9 ? (gn9) iInterfaceQueryLocalInterface17 : new fn9(strongBinder17);
                }
                int i4 = parcel.readInt();
                am9.d(parcel);
                getTestFlag(fn9Var5, i4);
                break;
            case 39:
                ClassLoader classLoader4 = am9.a;
                z = parcel.readInt() != 0;
                am9.d(parcel);
                setDataCollectionEnabled(z);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fn9Var4 = iInterfaceQueryLocalInterface18 instanceof gn9 ? (gn9) iInterfaceQueryLocalInterface18 : new fn9(strongBinder18);
                }
                am9.d(parcel);
                isDataCollectionEnabled(fn9Var4);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) am9.a(parcel, Bundle.CREATOR);
                am9.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                am9.d(parcel);
                clearMeasurementEnabled(j22);
                break;
            case MutationPayload$DisplayCommandV2.ERRORVIEWANNOTATIONPAYLOAD_FIELD_NUMBER /* 44 */:
                Bundle bundle8 = (Bundle) am9.a(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                am9.d(parcel);
                setConsent(bundle8, j23);
                break;
            case MutationPayload$DisplayCommandV2.DRAWRENDEREDITABLEPAYLOAD_FIELD_NUMBER /* 45 */:
                Bundle bundle9 = (Bundle) am9.a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                am9.d(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fn9Var3 = iInterfaceQueryLocalInterface19 instanceof gn9 ? (gn9) iInterfaceQueryLocalInterface19 : new fn9(strongBinder19);
                }
                am9.d(parcel);
                getSessionId(fn9Var3);
                break;
            case 48:
                Intent intent = (Intent) am9.a(parcel, Intent.CREATOR);
                am9.d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                zzdf zzdfVar = (zzdf) am9.a(parcel, zzdf.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j25 = parcel.readLong();
                am9.d(parcel);
                setCurrentScreenByScionActivityInfo(zzdfVar, string20, string21, j25);
                break;
            case 51:
                zzdf zzdfVar2 = (zzdf) am9.a(parcel, zzdf.CREATOR);
                long j26 = parcel.readLong();
                am9.d(parcel);
                onActivityStartedByScionActivityInfo(zzdfVar2, j26);
                break;
            case 52:
                zzdf zzdfVar3 = (zzdf) am9.a(parcel, zzdf.CREATOR);
                long j27 = parcel.readLong();
                am9.d(parcel);
                onActivityStoppedByScionActivityInfo(zzdfVar3, j27);
                break;
            case 53:
                zzdf zzdfVar4 = (zzdf) am9.a(parcel, zzdf.CREATOR);
                Bundle bundle10 = (Bundle) am9.a(parcel, Bundle.CREATOR);
                long j28 = parcel.readLong();
                am9.d(parcel);
                onActivityCreatedByScionActivityInfo(zzdfVar4, bundle10, j28);
                break;
            case 54:
                zzdf zzdfVar5 = (zzdf) am9.a(parcel, zzdf.CREATOR);
                long j29 = parcel.readLong();
                am9.d(parcel);
                onActivityDestroyedByScionActivityInfo(zzdfVar5, j29);
                break;
            case 55:
                zzdf zzdfVar6 = (zzdf) am9.a(parcel, zzdf.CREATOR);
                long j30 = parcel.readLong();
                am9.d(parcel);
                onActivityPausedByScionActivityInfo(zzdfVar6, j30);
                break;
            case 56:
                zzdf zzdfVar7 = (zzdf) am9.a(parcel, zzdf.CREATOR);
                long j31 = parcel.readLong();
                am9.d(parcel);
                onActivityResumedByScionActivityInfo(zzdfVar7, j31);
                break;
            case 57:
                zzdf zzdfVar8 = (zzdf) am9.a(parcel, zzdf.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    fn9Var2 = iInterfaceQueryLocalInterface20 instanceof gn9 ? (gn9) iInterfaceQueryLocalInterface20 : new fn9(strongBinder20);
                }
                long j32 = parcel.readLong();
                am9.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(zzdfVar8, fn9Var2, j32);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    hn9Var = iInterfaceQueryLocalInterface21 instanceof in9 ? (in9) iInterfaceQueryLocalInterface21 : new hn9(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                }
                am9.d(parcel);
                retrieveAndUploadBatches(hn9Var);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
