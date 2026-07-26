package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ir.myket.core.async.AsyncTaskSupport$Status;
import nene.downloadmanager.downloader.async.NeneAsyncTask$Status;

/* JADX INFO: loaded from: classes3.dex */
public class jx extends Handler {
    public final /* synthetic */ int a;

    public /* synthetic */ jx() {
        this.a = 2;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                hx hxVar = (hx) message.obj;
                int i = message.what;
                if (i == 1) {
                    lx lxVar = hxVar.a;
                    Object obj = hxVar.b[0];
                    if (!lxVar.d.get()) {
                        lxVar.c(obj);
                    }
                    lxVar.c = AsyncTaskSupport$Status.c;
                    break;
                } else if (i == 2) {
                    lx lxVar2 = hxVar.a;
                    break;
                }
                break;
            case 1:
                ix ixVar = (ix) message.obj;
                int i2 = message.what;
                if (i2 == 1) {
                    mx mxVar = ixVar.a;
                    Object obj2 = ixVar.b[0];
                    if (mxVar.d.get()) {
                        mxVar.c();
                    } else {
                        mxVar.d(obj2);
                    }
                    mxVar.c = ir.mservices.market.version2.core.async.AsyncTaskSupport$Status.c;
                    break;
                } else if (i2 == 2) {
                    mx mxVar2 = ixVar.a;
                    break;
                }
                break;
            case 2:
                ul5 ul5Var = (ul5) message.obj;
                int i3 = message.what;
                if (i3 == 1) {
                    vl5 vl5Var = ul5Var.a;
                    Object obj3 = ul5Var.b[0];
                    if (vl5Var.e.get()) {
                        vl5Var.d(obj3);
                    } else {
                        vl5Var.e(obj3);
                    }
                    vl5Var.d = NeneAsyncTask$Status.c;
                    break;
                } else if (i3 == 2) {
                    ul5Var.a.f(ul5Var.b);
                    break;
                }
                break;
            default:
                super.handleMessage(message);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jx(Looper looper, int i, boolean z) {
        super(looper);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jx(Looper looper, Handler.Callback callback, int i) {
        super(looper, callback);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(Looper looper, int i) {
        super(looper);
        this.a = i;
        switch (i) {
            case 5:
                super(looper);
                Looper.getMainLooper();
                break;
            case 6:
            default:
                Looper.getMainLooper();
                break;
            case 7:
                super(looper);
                Looper.getMainLooper();
                break;
        }
    }
}
