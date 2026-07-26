package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class ai9 implements at5 {
    public final ku2 a;
    public final int b;
    public final cm c;
    public final long d;
    public final long e;

    public ai9(ku2 ku2Var, int i, cm cmVar, long j, long j2) {
        this.a = ku2Var;
        this.b = i;
        this.c = cmVar;
        this.d = j;
        this.e = j2;
    }

    public static ConnectionTelemetryConfiguration a(wh9 wh9Var, d70 d70Var, int i) {
        ConnectionTelemetryConfiguration telemetryConfiguration = d70Var.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.b) {
            return null;
        }
        int[] iArr = telemetryConfiguration.d;
        int i2 = 0;
        if (iArr != null) {
            while (i2 < iArr.length) {
                if (iArr[i2] != i) {
                    i2++;
                }
            }
            return null;
        }
        int[] iArr2 = telemetryConfiguration.f;
        if (iArr2 != null) {
            while (i2 < iArr2.length) {
                if (iArr2[i2] == i) {
                    return null;
                }
                i2++;
            }
        }
        if (wh9Var.y < telemetryConfiguration.e) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // defpackage.at5
    public final void l(bf8 bf8Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        int iElapsedRealtime;
        ku2 ku2Var = this.a;
        if (ku2Var.e()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) ca7.f().b;
            if (rootTelemetryConfiguration == null || rootTelemetryConfiguration.b) {
                wh9 wh9Var = (wh9) ku2Var.j.get(this.c);
                if (wh9Var != null) {
                    Object obj = wh9Var.o;
                    if (obj instanceof d70) {
                        d70 d70Var = (d70) obj;
                        long j3 = this.d;
                        boolean z = j3 > 0;
                        int gCoreServiceId = d70Var.getGCoreServiceId();
                        if (rootTelemetryConfiguration != null) {
                            z &= rootTelemetryConfiguration.c;
                            int i7 = rootTelemetryConfiguration.d;
                            int i8 = rootTelemetryConfiguration.e;
                            i = rootTelemetryConfiguration.a;
                            if (d70Var.hasConnectionInfo() && !d70Var.isConnecting()) {
                                ConnectionTelemetryConfiguration connectionTelemetryConfigurationA = a(wh9Var, d70Var, this.b);
                                if (connectionTelemetryConfigurationA == null) {
                                    return;
                                }
                                boolean z2 = connectionTelemetryConfigurationA.c && j3 > 0;
                                i8 = connectionTelemetryConfigurationA.e;
                                z = z2;
                            }
                            i3 = i7;
                            i2 = i8;
                        } else {
                            i = 0;
                            i2 = 100;
                            i3 = 5000;
                        }
                        if (bf8Var.f()) {
                            i6 = 0;
                            i5 = 0;
                        } else if (((ox9) bf8Var).d) {
                            i5 = -1;
                            i6 = 100;
                        } else {
                            Exception excC = bf8Var.c();
                            if (excC instanceof ApiException) {
                                Status status = ((ApiException) excC).a;
                                i4 = status.a;
                                ConnectionResult connectionResult = status.d;
                                if (connectionResult != null) {
                                    i5 = connectionResult.b;
                                }
                                i6 = i4;
                            } else {
                                i4 = 101;
                            }
                            i5 = -1;
                            i6 = i4;
                        }
                        if (z) {
                            long j4 = this.e;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            j = j3;
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = jCurrentTimeMillis;
                        } else {
                            j = 0;
                            j2 = 0;
                            iElapsedRealtime = -1;
                        }
                        bi9 bi9Var = new bi9(new MethodInvocation(this.b, i6, i5, j, j2, null, null, gCoreServiceId, iElapsedRealtime), i, i3, i2);
                        jx jxVar = ku2Var.m;
                        jxVar.sendMessage(jxVar.obtainMessage(18, bi9Var));
                    }
                }
            }
        }
    }
}
