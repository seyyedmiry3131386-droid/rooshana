package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface en9 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(gn9 gn9Var);

    void getAppInstanceId(gn9 gn9Var);

    void getCachedAppInstanceId(gn9 gn9Var);

    void getConditionalUserProperties(String str, String str2, gn9 gn9Var);

    void getCurrentScreenClass(gn9 gn9Var);

    void getCurrentScreenName(gn9 gn9Var);

    void getGmpAppId(gn9 gn9Var);

    void getMaxUserProperties(String str, gn9 gn9Var);

    void getSessionId(gn9 gn9Var);

    void getTestFlag(gn9 gn9Var, int i);

    void getUserProperties(String str, String str2, boolean z, gn9 gn9Var);

    void initForTests(Map map);

    void initialize(kg3 kg3Var, zzdd zzddVar, long j);

    void isDataCollectionEnabled(gn9 gn9Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, gn9 gn9Var, long j);

    void logHealthData(int i, String str, kg3 kg3Var, kg3 kg3Var2, kg3 kg3Var3);

    void onActivityCreated(kg3 kg3Var, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j);

    void onActivityDestroyed(kg3 kg3Var, long j);

    void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j);

    void onActivityPaused(kg3 kg3Var, long j);

    void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j);

    void onActivityResumed(kg3 kg3Var, long j);

    void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j);

    void onActivitySaveInstanceState(kg3 kg3Var, gn9 gn9Var, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, gn9 gn9Var, long j);

    void onActivityStarted(kg3 kg3Var, long j);

    void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j);

    void onActivityStopped(kg3 kg3Var, long j);

    void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j);

    void performAction(Bundle bundle, gn9 gn9Var, long j);

    void registerOnMeasurementEventListener(rn9 rn9Var);

    void resetAnalyticsData(long j);

    void retrieveAndUploadBatches(in9 in9Var);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(kg3 kg3Var, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(rn9 rn9Var);

    void setInstanceIdProvider(tn9 tn9Var);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, kg3 kg3Var, boolean z, long j);

    void unregisterOnMeasurementEventListener(rn9 rn9Var);
}
