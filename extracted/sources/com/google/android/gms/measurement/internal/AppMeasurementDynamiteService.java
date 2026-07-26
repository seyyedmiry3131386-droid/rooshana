package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.j256.ormlite.field.FieldType;
import defpackage.dn9;
import defpackage.dr5;
import defpackage.gn9;
import defpackage.in9;
import defpackage.kg3;
import defpackage.rn9;
import defpackage.rq4;
import defpackage.t61;
import defpackage.tn9;
import defpackage.wv;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends dn9 {
    zzic zza;
    private final Map zzb;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.zza = null;
        this.zzb = new wv(0);
    }

    private final void zzb() {
        if (this.zza == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    private final void zzc(gn9 gn9Var, String str) {
        zzb();
        this.zza.zzk().zzal(gn9Var, str);
    }

    @Override // defpackage.en9
    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        zzb();
        this.zza.zzw().zza(str, j);
    }

    @Override // defpackage.en9
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zzb();
        this.zza.zzj().zzab(str, str2, bundle);
    }

    @Override // defpackage.en9
    public void clearMeasurementEnabled(long j) throws RemoteException {
        zzb();
        this.zza.zzj().zzn(null);
    }

    @Override // defpackage.en9
    public void endAdUnitExposure(String str, long j) throws RemoteException {
        zzb();
        this.zza.zzw().zzb(str, j);
    }

    @Override // defpackage.en9
    public void generateEventId(gn9 gn9Var) throws RemoteException {
        zzb();
        long jZzd = this.zza.zzk().zzd();
        zzb();
        this.zza.zzk().zzam(gn9Var, jZzd);
    }

    @Override // defpackage.en9
    public void getAppInstanceId(gn9 gn9Var) throws RemoteException {
        zzb();
        this.zza.zzaW().zzj(new zzi(this, gn9Var));
    }

    @Override // defpackage.en9
    public void getCachedAppInstanceId(gn9 gn9Var) throws RemoteException {
        zzb();
        zzc(gn9Var, this.zza.zzj().zzQ());
    }

    @Override // defpackage.en9
    public void getConditionalUserProperties(String str, String str2, gn9 gn9Var) throws RemoteException {
        zzb();
        this.zza.zzaW().zzj(new zzm(this, gn9Var, str, str2));
    }

    @Override // defpackage.en9
    public void getCurrentScreenClass(gn9 gn9Var) throws RemoteException {
        zzb();
        zzc(gn9Var, this.zza.zzj().zzae());
    }

    @Override // defpackage.en9
    public void getCurrentScreenName(gn9 gn9Var) throws RemoteException {
        zzb();
        zzc(gn9Var, this.zza.zzj().zzad());
    }

    @Override // defpackage.en9
    public void getGmpAppId(gn9 gn9Var) throws RemoteException {
        zzb();
        zzc(gn9Var, this.zza.zzj().zzaf());
    }

    @Override // defpackage.en9
    public void getMaxUserProperties(String str, gn9 gn9Var) throws RemoteException {
        zzb();
        this.zza.zzj().zzY(str);
        zzb();
        this.zza.zzk().zzan(gn9Var, 25);
    }

    @Override // defpackage.en9
    public void getSessionId(gn9 gn9Var) throws RemoteException {
        zzb();
        zzlj zzljVarZzj = this.zza.zzj();
        zzljVarZzj.zzu.zzaW().zzj(new zzkm(zzljVarZzj, gn9Var));
    }

    @Override // defpackage.en9
    public void getTestFlag(gn9 gn9Var, int i) throws RemoteException {
        zzb();
        if (i == 0) {
            this.zza.zzk().zzal(gn9Var, this.zza.zzj().zzj());
            return;
        }
        if (i == 1) {
            this.zza.zzk().zzam(gn9Var, this.zza.zzj().zzk().longValue());
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.zza.zzk().zzan(gn9Var, this.zza.zzj().zzl().intValue());
                return;
            } else {
                if (i != 4) {
                    return;
                }
                this.zza.zzk().zzap(gn9Var, this.zza.zzj().zzi().booleanValue());
                return;
            }
        }
        zzpp zzppVarZzk = this.zza.zzk();
        double dDoubleValue = this.zza.zzj().zzm().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            gn9Var.I(bundle);
        } catch (RemoteException e) {
            zzppVarZzk.zzu.zzaV().zze().zzb("Error returning double value to wrapper", e);
        }
    }

    @Override // defpackage.en9
    public void getUserProperties(String str, String str2, boolean z, gn9 gn9Var) throws RemoteException {
        zzb();
        this.zza.zzaW().zzj(new zzk(this, gn9Var, str, str2, z));
    }

    @Override // defpackage.en9
    public void initForTests(Map map) throws RemoteException {
        zzb();
    }

    @Override // defpackage.en9
    public void initialize(kg3 kg3Var, com.google.android.gms.internal.measurement.zzdd zzddVar, long j) throws RemoteException {
        zzic zzicVar = this.zza;
        if (zzicVar != null) {
            t61.C(zzicVar, "Attempting to initialize multiple times");
            return;
        }
        Context context = (Context) dr5.q0(kg3Var);
        rq4.n(context);
        this.zza = zzic.zzy(context, zzddVar, Long.valueOf(j));
    }

    @Override // defpackage.en9
    public void isDataCollectionEnabled(gn9 gn9Var) throws RemoteException {
        zzb();
        this.zza.zzaW().zzj(new zzn(this, gn9Var));
    }

    @Override // defpackage.en9
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        zzb();
        this.zza.zzj().zzC(str, str2, bundle, z, z2, j);
    }

    @Override // defpackage.en9
    public void logEventAndBundle(String str, String str2, Bundle bundle, gn9 gn9Var, long j) throws RemoteException {
        zzb();
        rq4.k(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.zza.zzaW().zzj(new zzj(this, gn9Var, new zzbg(str2, new zzbe(bundle), "app", j), str));
    }

    @Override // defpackage.en9
    public void logHealthData(int i, String str, kg3 kg3Var, kg3 kg3Var2, kg3 kg3Var3) throws RemoteException {
        zzb();
        this.zza.zzaV().zzm(i, true, false, str, kg3Var == null ? null : dr5.q0(kg3Var), kg3Var2 == null ? null : dr5.q0(kg3Var2), kg3Var3 != null ? dr5.q0(kg3Var3) : null);
    }

    @Override // defpackage.en9
    public void onActivityCreated(kg3 kg3Var, Bundle bundle, long j) throws RemoteException {
        zzb();
        Activity activity2 = (Activity) dr5.q0(kg3Var);
        rq4.n(activity2);
        onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.u(activity2), bundle, j);
    }

    @Override // defpackage.en9
    public void onActivityCreatedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, Bundle bundle, long j) {
        zzb();
        zzky zzkyVar = this.zza.zzj().zza;
        if (zzkyVar != null) {
            this.zza.zzj().zzh();
            zzkyVar.zza(zzdfVar, bundle);
        }
    }

    @Override // defpackage.en9
    public void onActivityDestroyed(kg3 kg3Var, long j) throws RemoteException {
        zzb();
        Activity activity2 = (Activity) dr5.q0(kg3Var);
        rq4.n(activity2);
        onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.u(activity2), j);
    }

    @Override // defpackage.en9
    public void onActivityDestroyedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws RemoteException {
        zzb();
        zzky zzkyVar = this.zza.zzj().zza;
        if (zzkyVar != null) {
            this.zza.zzj().zzh();
            zzkyVar.zzb(zzdfVar);
        }
    }

    @Override // defpackage.en9
    public void onActivityPaused(kg3 kg3Var, long j) throws RemoteException {
        zzb();
        Activity activity2 = (Activity) dr5.q0(kg3Var);
        rq4.n(activity2);
        onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.u(activity2), j);
    }

    @Override // defpackage.en9
    public void onActivityPausedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws RemoteException {
        zzb();
        zzky zzkyVar = this.zza.zzj().zza;
        if (zzkyVar != null) {
            this.zza.zzj().zzh();
            zzkyVar.zzc(zzdfVar);
        }
    }

    @Override // defpackage.en9
    public void onActivityResumed(kg3 kg3Var, long j) throws RemoteException {
        zzb();
        Activity activity2 = (Activity) dr5.q0(kg3Var);
        rq4.n(activity2);
        onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.u(activity2), j);
    }

    @Override // defpackage.en9
    public void onActivityResumedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws RemoteException {
        zzb();
        zzky zzkyVar = this.zza.zzj().zza;
        if (zzkyVar != null) {
            this.zza.zzj().zzh();
            zzkyVar.zzd(zzdfVar);
        }
    }

    @Override // defpackage.en9
    public void onActivitySaveInstanceState(kg3 kg3Var, gn9 gn9Var, long j) throws RemoteException {
        zzb();
        Activity activity2 = (Activity) dr5.q0(kg3Var);
        rq4.n(activity2);
        onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.u(activity2), gn9Var, j);
    }

    @Override // defpackage.en9
    public void onActivitySaveInstanceStateByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, gn9 gn9Var, long j) throws RemoteException {
        zzb();
        zzky zzkyVar = this.zza.zzj().zza;
        Bundle bundle = new Bundle();
        if (zzkyVar != null) {
            this.zza.zzj().zzh();
            zzkyVar.zze(zzdfVar, bundle);
        }
        try {
            gn9Var.I(bundle);
        } catch (RemoteException e) {
            this.zza.zzaV().zze().zzb("Error returning bundle value to wrapper", e);
        }
    }

    @Override // defpackage.en9
    public void onActivityStarted(kg3 kg3Var, long j) throws RemoteException {
        zzb();
        Activity activity2 = (Activity) dr5.q0(kg3Var);
        rq4.n(activity2);
        onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.u(activity2), j);
    }

    @Override // defpackage.en9
    public void onActivityStartedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws RemoteException {
        zzb();
        if (this.zza.zzj().zza != null) {
            this.zza.zzj().zzh();
        }
    }

    @Override // defpackage.en9
    public void onActivityStopped(kg3 kg3Var, long j) throws RemoteException {
        zzb();
        Activity activity2 = (Activity) dr5.q0(kg3Var);
        rq4.n(activity2);
        onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.u(activity2), j);
    }

    @Override // defpackage.en9
    public void onActivityStoppedByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, long j) throws RemoteException {
        zzb();
        if (this.zza.zzj().zza != null) {
            this.zza.zzj().zzh();
        }
    }

    @Override // defpackage.en9
    public void performAction(Bundle bundle, gn9 gn9Var, long j) throws RemoteException {
        zzb();
        gn9Var.I(null);
    }

    @Override // defpackage.en9
    public void registerOnMeasurementEventListener(rn9 rn9Var) throws RemoteException {
        zzjq zzqVar;
        zzb();
        Map map = this.zzb;
        synchronized (map) {
            try {
                zzqVar = (zzjq) map.get(Integer.valueOf(rn9Var.a()));
                if (zzqVar == null) {
                    zzqVar = new zzq(this, rn9Var);
                    map.put(Integer.valueOf(rn9Var.a()), zzqVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.zza.zzj().zzW(zzqVar);
    }

    @Override // defpackage.en9
    public void resetAnalyticsData(long j) throws RemoteException {
        zzb();
        this.zza.zzj().zzT(j);
    }

    @Override // defpackage.en9
    public void retrieveAndUploadBatches(final in9 in9Var) {
        zzb();
        this.zza.zzj().zzt(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    in9Var.c();
                } catch (RemoteException e) {
                    zzic zzicVar = this.zza.zza;
                    rq4.n(zzicVar);
                    zzicVar.zzaV().zze().zzb("Failed to call IDynamiteUploadBatchesCallback", e);
                }
            }
        });
    }

    @Override // defpackage.en9
    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        zzb();
        if (bundle == null) {
            t61.u(this.zza, "Conditional user property must not be null");
        } else {
            this.zza.zzj().zzaa(bundle, j);
        }
    }

    @Override // defpackage.en9
    public void setConsent(Bundle bundle, long j) throws RemoteException {
    }

    @Override // defpackage.en9
    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        zzb();
        this.zza.zzj().zzp(bundle, -20, j);
    }

    @Override // defpackage.en9
    public void setCurrentScreen(kg3 kg3Var, String str, String str2, long j) throws RemoteException {
        zzb();
        Activity activity2 = (Activity) dr5.q0(kg3Var);
        rq4.n(activity2);
        setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf.u(activity2), str, str2, j);
    }

    @Override // defpackage.en9
    public void setCurrentScreenByScionActivityInfo(com.google.android.gms.internal.measurement.zzdf zzdfVar, String str, String str2, long j) throws RemoteException {
        zzb();
        this.zza.zzs().zzk(zzdfVar, str, str2);
    }

    @Override // defpackage.en9
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        zzb();
        zzlj zzljVarZzj = this.zza.zzj();
        zzljVarZzj.zzb();
        zzljVarZzj.zzu.zzaW().zzj(new zzjy(zzljVarZzj, z));
    }

    @Override // defpackage.en9
    public void setDefaultEventParameters(Bundle bundle) {
        zzb();
        final zzlj zzljVarZzj = this.zza.zzj();
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzljVarZzj.zzu.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzljVarZzj.zzah(bundle2);
            }
        });
    }

    @Override // defpackage.en9
    public void setEventInterceptor(rn9 rn9Var) throws RemoteException {
        zzb();
        zzp zzpVar = new zzp(this, rn9Var);
        if (this.zza.zzaW().zze()) {
            this.zza.zzj().zzV(zzpVar);
        } else {
            this.zza.zzaW().zzj(new zzl(this, zzpVar));
        }
    }

    @Override // defpackage.en9
    public void setInstanceIdProvider(tn9 tn9Var) throws RemoteException {
        zzb();
    }

    @Override // defpackage.en9
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        zzb();
        this.zza.zzj().zzn(Boolean.valueOf(z));
    }

    @Override // defpackage.en9
    public void setMinimumSessionDuration(long j) throws RemoteException {
        zzb();
    }

    @Override // defpackage.en9
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        zzb();
        zzlj zzljVarZzj = this.zza.zzj();
        zzljVarZzj.zzu.zzaW().zzj(new zzka(zzljVarZzj, j));
    }

    @Override // defpackage.en9
    public void setSgtmDebugInfo(Intent intent) throws RemoteException {
        zzb();
        zzlj zzljVarZzj = this.zza.zzj();
        Uri data = intent.getData();
        if (data == null) {
            zzljVarZzj.zzu.zzaV().zzi().zza("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            zzic zzicVar = zzljVarZzj.zzu;
            zzicVar.zzaV().zzi().zza("[sgtm] Preview Mode was not enabled.");
            zzicVar.zzc().zzy(null);
        } else {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            zzic zzicVar2 = zzljVarZzj.zzu;
            zzicVar2.zzaV().zzi().zzb("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            zzicVar2.zzc().zzy(queryParameter2);
        }
    }

    @Override // defpackage.en9
    public void setUserId(final String str, long j) throws RemoteException {
        zzb();
        final zzlj zzljVarZzj = this.zza.zzj();
        if (str != null && TextUtils.isEmpty(str)) {
            t61.C(zzljVarZzj.zzu, "User ID must be non-empty or null");
        } else {
            zzljVarZzj.zzu.zzaW().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzic zzicVar = zzljVarZzj.zzu;
                    if (zzicVar.zzv().zzq(str)) {
                        zzicVar.zzv().zzi();
                    }
                }
            });
            zzljVarZzj.zzL(null, FieldType.FOREIGN_ID_FIELD_SUFFIX, str, true, j);
        }
    }

    @Override // defpackage.en9
    public void setUserProperty(String str, String str2, kg3 kg3Var, boolean z, long j) throws RemoteException {
        zzb();
        this.zza.zzj().zzL(str, str2, dr5.q0(kg3Var), z, j);
    }

    @Override // defpackage.en9
    public void unregisterOnMeasurementEventListener(rn9 rn9Var) throws RemoteException {
        zzjq zzqVar;
        zzb();
        Map map = this.zzb;
        synchronized (map) {
            zzqVar = (zzjq) map.remove(Integer.valueOf(rn9Var.a()));
        }
        if (zzqVar == null) {
            zzqVar = new zzq(this, rn9Var);
        }
        this.zza.zzj().zzX(zzqVar);
    }
}
