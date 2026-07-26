package com.microsoft.clarity.g;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.microsoft.clarity.models.DynamicConfig;
import com.microsoft.clarity.models.LogLevel;
import com.microsoft.clarity.models.PageMetadata;
import com.microsoft.clarity.models.telemetry.AggregatedMetric;
import com.microsoft.clarity.models.telemetry.ErrorDetails;
import com.microsoft.clarity.models.telemetry.ErrorType;
import defpackage.f88;
import defpackage.js3;
import defpackage.wu8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 {
    public final String a;
    public final b0 b;
    public final com.microsoft.clarity.o.i c;
    public final LinkedHashMap d;
    public final LinkedHashSet e;
    public final LinkedHashMap f;
    public int g;
    public boolean h;

    public h0(String str, b0 b0Var, com.microsoft.clarity.o.i iVar) {
        js3.p(str, "projectId");
        js3.p(b0Var, "taskExecutor");
        js3.p(iVar, "telemetryService");
        this.a = str;
        this.b = b0Var;
        this.c = iVar;
        this.d = new LinkedHashMap();
        this.e = new LinkedHashSet();
        this.f = new LinkedHashMap();
        this.h = true;
    }

    public static boolean b() {
        DynamicConfig dynamicConfig = com.microsoft.clarity.b.a.k;
        return (dynamicConfig != null ? dynamicConfig.getReportUrl() : null) != null;
    }

    public final void a(Exception exc, ErrorType errorType, PageMetadata pageMetadata) {
        js3.p(exc, "exception");
        js3.p(errorType, "errorType");
        LogLevel logLevel = com.microsoft.clarity.q.l.a;
        if (com.microsoft.clarity.q.l.a(LogLevel.Error)) {
            com.microsoft.clarity.q.l.c(exc.getMessage());
            com.microsoft.clarity.q.l.c(wu8.I(exc));
        }
        if (b() && this.h) {
            synchronized (this.e) {
                Integer num = (Integer) this.f.get(errorType);
                if ((num != null ? num.intValue() : 0) >= 5) {
                    return;
                }
                String strValueOf = String.valueOf(System.currentTimeMillis());
                String message = exc.getMessage();
                ErrorDetails errorDetails = new ErrorDetails(errorType, strValueOf, message != null ? f88.I0(500, message) : null, f88.I0(3000, wu8.I(exc)));
                int iHashCode = errorDetails.hashCode();
                if (this.e.contains(Integer.valueOf(iHashCode))) {
                    return;
                }
                this.e.add(Integer.valueOf(iHashCode));
                LinkedHashMap linkedHashMap = this.f;
                Integer num2 = (Integer) linkedHashMap.get(errorType);
                linkedHashMap.put(errorType, Integer.valueOf((num2 != null ? num2.intValue() : 0) + 1));
                b0.a(this.b, new f0(this, errorDetails, pageMetadata), g0.a, 4);
            }
        }
    }

    public final void a() {
        Iterator it;
        double dSqrt;
        if (b() && this.h) {
            ArrayList arrayList = new ArrayList();
            synchronized (this.d) {
                try {
                    Iterator it2 = this.d.values().iterator();
                    while (it2.hasNext()) {
                        c0 c0Var = (c0) it2.next();
                        String str = "3.8.0";
                        String str2 = c0Var.a;
                        int i = c0Var.b;
                        double d = c0Var.c;
                        double d2 = c0Var.e;
                        double d3 = c0Var.d;
                        if (i == 0) {
                            dSqrt = 0.0d;
                            it = it2;
                        } else {
                            it = it2;
                            dSqrt = Math.sqrt(c0Var.g / ((double) i));
                        }
                        arrayList.add(new AggregatedMetric(str, str2, i, d, d2, d3, dSqrt, 0, 128, null));
                        it2 = it;
                    }
                    this.d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.g++;
            b0.a(this.b, new d0(this, arrayList), e0.a, 4);
        }
    }

    public final void a(String str, double d) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (this.g > 15) {
            return;
        }
        if (com.microsoft.clarity.b.a.k == null || b()) {
            synchronized (this.d) {
                try {
                    LinkedHashMap linkedHashMap = this.d;
                    Object c0Var = linkedHashMap.get(str);
                    if (c0Var == null) {
                        c0Var = new c0(str);
                        linkedHashMap.put(str, c0Var);
                    }
                    ((c0) c0Var).a(d);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
