package com.microsoft.clarity.g;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {
    public final String a;
    public int b;
    public double c;
    public double d;
    public double e;
    public double f;
    public double g;

    public c0(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.a = str;
    }

    public final void a(double d) {
        if (this.b == 0) {
            this.e = d;
            this.d = d;
        } else {
            this.e = Math.min(d, this.e);
            this.d = Math.max(d, this.d);
        }
        int i = this.b + 1;
        this.b = i;
        this.c += d;
        double d2 = this.f;
        double d3 = d - d2;
        double d4 = (d3 / ((double) i)) + d2;
        this.f = d4;
        this.g = (d3 * (d - d4)) + this.g;
    }
}
