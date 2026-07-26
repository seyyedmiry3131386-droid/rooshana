package defpackage;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ad implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ ad(int i) {
        this.a = i;
    }

    private final void a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
            case 1:
                mb5 mb5Var = AndroidComposeView.k1;
                synchronized (mb5Var) {
                    try {
                        int i2 = 0;
                        if (Build.VERSION.SDK_INT < 30) {
                            Object[] objArr = mb5Var.a;
                            int i3 = mb5Var.b;
                            while (i2 < i3) {
                                AndroidComposeView androidComposeView = (AndroidComposeView) objArr[i2];
                                boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                                Class cls = AndroidComposeView.h1;
                                androidComposeView.setShowLayoutBounds(ja1.w());
                                if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                                    AndroidComposeView.m(androidComposeView.getRoot());
                                }
                                i2++;
                            }
                        } else {
                            Object[] objArr2 = mb5Var.a;
                            int i4 = mb5Var.b;
                            while (i2 < i4) {
                                AndroidComposeView.m(((AndroidComposeView) objArr2[i2]).getRoot());
                                i2++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }
}
