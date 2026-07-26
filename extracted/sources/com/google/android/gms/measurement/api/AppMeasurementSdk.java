package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjq;
import defpackage.bn9;
import defpackage.co9;
import defpackage.fo9;
import defpackage.mo9;
import defpackage.oo9;
import defpackage.un9;
import defpackage.vn9;
import defpackage.wn9;
import defpackage.xn9;
import defpackage.yo9;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementSdk {
    private final yo9 zza;

    public static final class ConditionalUserProperty {
        public static final String ACTIVE = "active";
        public static final String CREATION_TIMESTAMP = "creation_timestamp";
        public static final String EXPIRED_EVENT_NAME = "expired_event_name";
        public static final String EXPIRED_EVENT_PARAMS = "expired_event_params";
        public static final String NAME = "name";
        public static final String ORIGIN = "origin";
        public static final String TIMED_OUT_EVENT_NAME = "timed_out_event_name";
        public static final String TIMED_OUT_EVENT_PARAMS = "timed_out_event_params";
        public static final String TIME_TO_LIVE = "time_to_live";
        public static final String TRIGGERED_EVENT_NAME = "triggered_event_name";
        public static final String TRIGGERED_EVENT_PARAMS = "triggered_event_params";
        public static final String TRIGGERED_TIMESTAMP = "triggered_timestamp";
        public static final String TRIGGER_EVENT_NAME = "trigger_event_name";
        public static final String TRIGGER_TIMEOUT = "trigger_timeout";
        public static final String VALUE = "value";

        private ConditionalUserProperty() {
        }
    }

    public interface EventInterceptor extends zzjp {
        @Override // com.google.android.gms.measurement.internal.zzjp
        void interceptEvent(String str, String str2, Bundle bundle, long j);
    }

    public interface OnEventListener extends zzjq {
        @Override // com.google.android.gms.measurement.internal.zzjq
        void onEvent(String str, String str2, Bundle bundle, long j);
    }

    public AppMeasurementSdk(yo9 yo9Var) {
        this.zza = yo9Var;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return yo9.e(context, null).b;
    }

    public void beginAdUnitExposure(String str) {
        yo9 yo9Var = this.zza;
        yo9Var.getClass();
        yo9Var.c(new xn9(yo9Var, str, 1));
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        yo9 yo9Var = this.zza;
        yo9Var.getClass();
        yo9Var.c(new wn9(yo9Var, str, str2, bundle));
    }

    public void endAdUnitExposure(String str) {
        yo9 yo9Var = this.zza;
        yo9Var.getClass();
        yo9Var.c(new xn9(yo9Var, str, 2));
    }

    public long generateEventId() {
        return this.zza.j();
    }

    public String getAppIdOrigin() {
        return this.zza.f;
    }

    public String getAppInstanceId() {
        yo9 yo9Var = this.zza;
        yo9Var.getClass();
        bn9 bn9Var = new bn9();
        yo9Var.c(new fo9(yo9Var, bn9Var, 1));
        return (String) bn9.m0(bn9Var.L(50L), String.class);
    }

    public List<Bundle> getConditionalUserProperties(String str, String str2) {
        return this.zza.i(str, str2);
    }

    public String getCurrentScreenClass() {
        yo9 yo9Var = this.zza;
        yo9Var.getClass();
        bn9 bn9Var = new bn9();
        yo9Var.c(new fo9(yo9Var, bn9Var, 4));
        return (String) bn9.m0(bn9Var.L(500L), String.class);
    }

    public String getCurrentScreenName() {
        yo9 yo9Var = this.zza;
        yo9Var.getClass();
        bn9 bn9Var = new bn9();
        yo9Var.c(new fo9(yo9Var, bn9Var, 3));
        return (String) bn9.m0(bn9Var.L(500L), String.class);
    }

    public String getGmpAppId() {
        yo9 yo9Var = this.zza;
        yo9Var.getClass();
        bn9 bn9Var = new bn9();
        yo9Var.c(new fo9(yo9Var, bn9Var, 0));
        return (String) bn9.m0(bn9Var.L(500L), String.class);
    }

    public int getMaxUserProperties(String str) {
        return this.zza.b(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.zza.a(str, str2, z);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        yo9 yo9Var = this.zza;
        yo9Var.getClass();
        yo9Var.c(new oo9(yo9Var, null, str, str2, bundle, true, true));
    }

    public void logEventNoInterceptor(String str, String str2, Bundle bundle, long j) {
        yo9 yo9Var = this.zza;
        yo9Var.getClass();
        yo9Var.c(new oo9(yo9Var, Long.valueOf(j), str, str2, bundle, true, false));
    }

    public void performAction(Bundle bundle) {
        yo9 yo9Var = this.zza;
        yo9Var.getClass();
        yo9Var.c(new co9(yo9Var, bundle, new bn9()));
    }

    public Bundle performActionWithResponse(Bundle bundle) {
        yo9 yo9Var = this.zza;
        yo9Var.getClass();
        bn9 bn9Var = new bn9();
        yo9Var.c(new co9(yo9Var, bundle, bn9Var));
        return bn9Var.L(5000L);
    }

    public void registerOnMeasurementEventListener(OnEventListener onEventListener) {
        this.zza.g(onEventListener);
    }

    public void setConditionalUserProperty(Bundle bundle) {
        yo9 yo9Var = this.zza;
        yo9Var.getClass();
        yo9Var.c(new vn9(yo9Var, bundle));
    }

    @Deprecated
    public void setConsent(Bundle bundle) {
    }

    public void setCurrentScreen(Activity activity2, String str, String str2) {
        yo9 yo9Var = this.zza;
        zzdf zzdfVarU = zzdf.u(activity2);
        yo9Var.getClass();
        yo9Var.c(new wn9(yo9Var, zzdfVarU, str, str2));
    }

    public void setEventInterceptor(EventInterceptor eventInterceptor) {
        this.zza.f(eventInterceptor);
    }

    @Deprecated
    public void setMeasurementEnabled(Boolean bool) {
    }

    public void setUserProperty(String str, String str2, Object obj) {
        yo9 yo9Var = this.zza;
        yo9Var.getClass();
        yo9Var.c(new un9(yo9Var, str, str2, obj, true));
    }

    public void unregisterOnMeasurementEventListener(OnEventListener onEventListener) {
        this.zza.h(onEventListener);
    }

    public final void zza(boolean z) {
        yo9 yo9Var = this.zza;
        yo9Var.getClass();
        yo9Var.c(new mo9(yo9Var, z));
    }

    @Deprecated
    public void setMeasurementEnabled(boolean z) {
    }

    @Deprecated
    public static AppMeasurementSdk getInstance(Context context, String str, String str2, String str3, Bundle bundle) {
        return yo9.e(context, bundle).b;
    }
}
