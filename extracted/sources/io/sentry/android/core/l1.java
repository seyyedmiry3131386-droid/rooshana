package io.sentry.android.core;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import defpackage.kb8;
import defpackage.z21;
import io.sentry.SentryLevel;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 implements SensorEventListener {
    public SensorManager a;
    public Sensor b;
    public HandlerThread c;
    public Handler d;
    public volatile j1 e;
    public io.sentry.u0 f;
    public final z21 g;

    public l1(io.sentry.u0 u0Var) {
        z21 z21Var = new z21();
        z21Var.c = new j0();
        this.g = z21Var;
        this.f = u0Var;
    }

    public final void a(Context context) {
        if (this.a == null) {
            this.a = (SensorManager) context.getSystemService("sensor");
        }
        SensorManager sensorManager = this.a;
        if (sensorManager != null && this.b == null) {
            this.b = sensorManager.getDefaultSensor(1, false);
        }
        if (this.b == null || this.c != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("sentry-shake");
        this.c = handlerThread;
        handlerThread.start();
        this.d = new Handler(this.c.getLooper());
    }

    public final void b(Activity activity2, j1 j1Var) {
        this.e = j1Var;
        a(activity2);
        SensorManager sensorManager = this.a;
        if (sensorManager == null) {
            this.f.i(SentryLevel.WARNING, "SensorManager is not available. Shake detection disabled.", new Object[0]);
            return;
        }
        Sensor sensor = this.b;
        if (sensor == null) {
            this.f.i(SentryLevel.WARNING, "Accelerometer sensor not available. Shake detection disabled.", new Object[0]);
        } else {
            sensorManager.registerListener(this, sensor, 3, this.d);
        }
    }

    public final void c() {
        this.e = null;
        SensorManager sensorManager = this.a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        Handler handler = this.d;
        if (handler != null) {
            handler.post(new kb8(13, this));
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r15 = r3;
     */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSensorChanged(android.hardware.SensorEvent r19) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.l1.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
