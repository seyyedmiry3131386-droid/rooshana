package defpackage;

import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;

/* JADX INFO: loaded from: classes.dex */
public final class ho2 implements Window$OnFrameMetricsAvailableListener {
    public final /* synthetic */ io2 a;

    public ho2(io2 io2Var) {
        this.a = io2Var;
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        io2 io2Var = this.a;
        if ((io2Var.b & 1) != 0) {
            io2.B(io2Var.c[0], frameMetrics.getMetric(8));
        }
        io2 io2Var2 = this.a;
        if ((io2Var2.b & 2) != 0) {
            io2.B(io2Var2.c[1], frameMetrics.getMetric(1));
        }
        io2 io2Var3 = this.a;
        if ((io2Var3.b & 4) != 0) {
            io2.B(io2Var3.c[2], frameMetrics.getMetric(3));
        }
        io2 io2Var4 = this.a;
        if ((io2Var4.b & 8) != 0) {
            io2.B(io2Var4.c[3], frameMetrics.getMetric(4));
        }
        io2 io2Var5 = this.a;
        if ((io2Var5.b & 16) != 0) {
            io2.B(io2Var5.c[4], frameMetrics.getMetric(5));
        }
        io2 io2Var6 = this.a;
        if ((io2Var6.b & 64) != 0) {
            io2.B(io2Var6.c[6], frameMetrics.getMetric(7));
        }
        io2 io2Var7 = this.a;
        if ((io2Var7.b & 32) != 0) {
            io2.B(io2Var7.c[5], frameMetrics.getMetric(6));
        }
        io2 io2Var8 = this.a;
        if ((io2Var8.b & 128) != 0) {
            io2.B(io2Var8.c[7], frameMetrics.getMetric(0));
        }
        io2 io2Var9 = this.a;
        if ((io2Var9.b & 256) != 0) {
            io2.B(io2Var9.c[8], frameMetrics.getMetric(2));
        }
    }
}
