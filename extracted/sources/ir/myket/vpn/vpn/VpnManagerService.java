package ir.myket.vpn.vpn;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.VpnService;
import android.os.Build;
import android.os.Bundle;
import android.system.ErrnoException;
import android.system.Os;
import defpackage.a27;
import defpackage.bt2;
import defpackage.d87;
import defpackage.dt2;
import defpackage.e71;
import defpackage.e87;
import defpackage.kf1;
import defpackage.li1;
import defpackage.qb9;
import defpackage.rb9;
import defpackage.tx8;
import defpackage.ub8;
import defpackage.ub9;
import defpackage.ug1;
import defpackage.up1;
import defpackage.w61;
import ir.myket.vpn.state.Command;
import java.io.FileDescriptor;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class VpnManagerService extends VpnService implements e71 {
    public final ub8 a;
    public final w61 b;
    public a c;
    public String d;

    public VpnManagerService() {
        ub8 ub8VarA = a27.a();
        this.a = ub8VarA;
        ug1 ug1Var = up1.a;
        kf1 kf1Var = kf1.c;
        kf1Var.getClass();
        this.b = bt2.L(kf1Var, ub8VarA);
        this.d = "";
    }

    public final void a(Notification notification, PendingIntent pendingIntent) {
        Object d87Var;
        if (Build.VERSION.SDK_INT >= 29) {
            startForeground(10, notification, 16);
            d87Var = new e87(tx8.a);
        } else {
            d87Var = new d87();
        }
        if (d87Var instanceof d87) {
            startForeground(10, notification);
        }
        a aVar = new a(this, this, pendingIntent, this.d);
        li1 li1Var = aVar.i;
        if (li1Var != null) {
            li1Var.g(null);
        }
        aVar.i = null;
        FileDescriptor fileDescriptor = aVar.k;
        if (fileDescriptor != null) {
            try {
                Os.close(fileDescriptor);
            } catch (ErrnoException unused) {
            }
        }
        aVar.k = null;
        aVar.i = bt2.G(this, null, null, new VpnThread$startThread$1(aVar, null), 3);
        this.c = aVar;
        l lVar = ub9.a;
        ub9.a(new qb9(this.d));
    }

    @Override // defpackage.e71
    public final w61 getCoroutineContext() {
        return this.b;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        a aVar = this.c;
        if (aVar != null) {
            li1 li1Var = aVar.i;
            if (li1Var != null) {
                li1Var.g(null);
            }
            aVar.i = null;
            FileDescriptor fileDescriptor = aVar.k;
            if (fileDescriptor != null) {
                try {
                    Os.close(fileDescriptor);
                } catch (ErrnoException unused) {
                }
            }
            aVar.k = null;
        }
        this.c = null;
        l lVar = ub9.a;
        ub9.a(new rb9(this.d));
        stopSelf();
        this.a.g(null);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Bundle extras;
        Command command = (intent == null || (extras = intent.getExtras()) == null) ? null : (Command) dt2.p(extras, "DNS_SERVERS", Command.class);
        String strA = command != null ? command.a() : null;
        if (strA == null) {
            strA = "";
        }
        this.d = strA;
        if (command instanceof Command.StartApps) {
            Command.StartApps startApps = (Command.StartApps) command;
            a(startApps.b, startApps.c);
            return 1;
        }
        if (command instanceof Command.StartDomains) {
            Command.StartDomains startDomains = (Command.StartDomains) command;
            a(startDomains.b, startDomains.c);
            return 1;
        }
        if (!(command instanceof Command.Stop)) {
            if (command != null) {
                throw new NoWhenBranchMatchedException();
            }
            l lVar = ub9.a;
            ub9.a(new rb9(strA));
            stopSelf();
            return 2;
        }
        a aVar = this.c;
        if (aVar != null) {
            li1 li1Var = aVar.i;
            if (li1Var != null) {
                li1Var.g(null);
            }
            aVar.i = null;
            FileDescriptor fileDescriptor = aVar.k;
            if (fileDescriptor != null) {
                try {
                    Os.close(fileDescriptor);
                } catch (ErrnoException unused) {
                }
            }
            aVar.k = null;
        }
        this.c = null;
        l lVar2 = ub9.a;
        ub9.a(new rb9(this.d));
        stopSelf();
        return 2;
    }
}
