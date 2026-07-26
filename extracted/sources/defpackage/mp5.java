package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import io.sentry.android.core.t0;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class mp5 implements Handler.Callback, ServiceConnection {
    public final Context a;
    public final Handler b;
    public final HashMap c = new HashMap();
    public HashSet d = new HashSet();

    public mp5(Context context) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(lp5 lp5Var) {
        boolean z;
        ArrayDeque arrayDeque = lp5Var.d;
        ComponentName componentName = lp5Var.a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
            arrayDeque.size();
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (lp5Var.b) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.a;
            boolean zBindService = context.bindService(component, this, 33);
            lp5Var.b = zBindService;
            if (zBindService) {
                lp5Var.e = 0;
            } else {
                t0.m("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z = lp5Var.b;
        }
        if (!z || lp5Var.c == null) {
            b(lp5Var);
            return;
        }
        while (true) {
            jp5 jp5Var = (jp5) arrayDeque.peek();
            if (jp5Var == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    jp5Var.toString();
                }
                ((fg3) lp5Var.c).L(jp5Var.a, jp5Var.b, jp5Var.c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Objects.toString(componentName);
                }
            } catch (RemoteException e) {
                t0.n("NotifManCompat", "RemoteException communicating with " + componentName, e);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(lp5Var);
    }

    public final void b(lp5 lp5Var) {
        ComponentName componentName = lp5Var.a;
        ArrayDeque arrayDeque = lp5Var.d;
        Handler handler = this.b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = lp5Var.e + 1;
        lp5Var.e = i;
        if (i <= 6) {
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << r4) * 1000);
            return;
        }
        t0.m("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + lp5Var.e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        gg3 gg3Var = null;
        if (i == 0) {
            jp5 jp5Var = (jp5) message.obj;
            String string = Settings.Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
            synchronized (np5.c) {
                if (string != null) {
                    try {
                        if (!string.equals(np5.d)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            np5.e = hashSet2;
                            np5.d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = np5.e;
            }
            if (!hashSet.equals(this.d)) {
                this.d = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            t0.m("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet3) {
                    if (!this.c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName2);
                        }
                        this.c.put(componentName2, new lp5(componentName2));
                    }
                }
                Iterator it = this.c.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(entry.getKey());
                        }
                        lp5 lp5Var = (lp5) entry.getValue();
                        if (lp5Var.b) {
                            this.a.unbindService(this);
                            lp5Var.b = false;
                        }
                        lp5Var.c = null;
                        it.remove();
                    }
                }
            }
            for (lp5 lp5Var2 : this.c.values()) {
                lp5Var2.d.add(jp5Var);
                a(lp5Var2);
            }
        } else if (i == 1) {
            kp5 kp5Var = (kp5) message.obj;
            ComponentName componentName3 = kp5Var.a;
            IBinder iBinder = kp5Var.b;
            lp5 lp5Var3 = (lp5) this.c.get(componentName3);
            if (lp5Var3 != null) {
                int i2 = gp5.n;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(gg3.g);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof gg3)) {
                        fg3 fg3Var = new fg3();
                        fg3Var.n = iBinder;
                        gg3Var = fg3Var;
                    } else {
                        gg3Var = (gg3) iInterfaceQueryLocalInterface;
                    }
                }
                lp5Var3.c = gg3Var;
                lp5Var3.e = 0;
                a(lp5Var3);
                return true;
            }
        } else if (i == 2) {
            lp5 lp5Var4 = (lp5) this.c.get((ComponentName) message.obj);
            if (lp5Var4 != null) {
                if (lp5Var4.b) {
                    this.a.unbindService(this);
                    lp5Var4.b = false;
                }
                lp5Var4.c = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            lp5 lp5Var5 = (lp5) this.c.get((ComponentName) message.obj);
            if (lp5Var5 != null) {
                a(lp5Var5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(1, new kp5(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(2, componentName).sendToTarget();
    }
}
