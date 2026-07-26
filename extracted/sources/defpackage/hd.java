package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hd extends Handler {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ hd(int i) {
        this.a = i;
    }

    private final void a(Message message) {
        int size;
        nc2[] nc2VarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        rb4 rb4Var = (rb4) this.b;
        while (true) {
            synchronized (((HashMap) rb4Var.c)) {
                try {
                    size = ((ArrayList) rb4Var.e).size();
                    if (size <= 0) {
                        return;
                    }
                    nc2VarArr = new nc2[size];
                    ((ArrayList) rb4Var.e).toArray(nc2VarArr);
                    ((ArrayList) rb4Var.e).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i = 0; i < size; i++) {
                nc2 nc2Var = nc2VarArr[i];
                int size2 = ((ArrayList) nc2Var.c).size();
                for (int i2 = 0; i2 < size2; i2++) {
                    qb4 qb4Var = (qb4) ((ArrayList) nc2Var.c).get(i2);
                    if (!qb4Var.d) {
                        qb4Var.b.onReceive((Context) rb4Var.b, (Intent) nc2Var.b);
                    }
                }
            }
        }
    }

    private final void b(Message message) {
        nq4 nq4Var;
        mq4 mq4Var;
        hd hdVar;
        if (message.what == 1) {
            synchronized (((mq4) this.b).a) {
                nq4Var = (nq4) ((mq4) this.b).d.get();
                mq4Var = (mq4) this.b;
                hdVar = mq4Var.e;
            }
            if (nq4Var == null || mq4Var != nq4Var.b() || hdVar == null) {
                return;
            }
            nq4Var.d((jr4) message.obj);
            ((mq4) this.b).a(nq4Var, hdVar);
            nq4Var.d(null);
        }
    }

    public void c(Runnable runnable) {
        switch (this.a) {
            case 5:
                if (Thread.currentThread() != getLooper().getThread()) {
                    post(runnable);
                } else {
                    runnable.run();
                }
                break;
            default:
                if (Thread.currentThread() != getLooper().getThread()) {
                    post(runnable);
                } else {
                    runnable.run();
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:282:? A[RETURN, SYNTHETIC] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(android.os.Message r23) {
        /*
            Method dump skipped, instruction units count: 1428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd.handleMessage(android.os.Message):void");
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        switch (this.a) {
            case 5:
                Bundle data = message.getData();
                ClassLoader classLoader = ql4.class.getClassLoader();
                classLoader.getClass();
                data.setClassLoader(classLoader);
                data.putInt("data_calling_uid", Binder.getCallingUid());
                int callingPid = Binder.getCallingPid();
                if (callingPid > 0) {
                    data.putInt("data_calling_pid", callingPid);
                } else if (!data.containsKey("data_calling_pid")) {
                    data.putInt("data_calling_pid", -1);
                }
                break;
            case 6:
                Bundle data2 = message.getData();
                data2.setClassLoader(rl4.class.getClassLoader());
                data2.putInt("data_calling_uid", Binder.getCallingUid());
                int callingPid2 = Binder.getCallingPid();
                if (callingPid2 > 0) {
                    data2.putInt("data_calling_pid", callingPid2);
                } else if (!data2.containsKey("data_calling_pid")) {
                    data2.putInt("data_calling_pid", -1);
                }
                break;
        }
        return super.sendMessageAtTime(message, j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hd(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd(Looper looper, vp7 vp7Var) {
        super(looper);
        this.a = 8;
        this.b = vp7Var;
    }
}
