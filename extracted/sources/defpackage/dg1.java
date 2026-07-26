package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.session.MediaSessionService;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.ImmutableIntArray;
import j$.util.Objects;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class dg1 implements sp4 {
    public static final int h = at6.default_notification_channel_name;
    public final Context a;
    public final cg1 b;
    public final String c;
    public final int d;
    public final NotificationManager e;
    public cf0 f;
    public int g;

    public dg1(Context context, cg1 cg1Var, String str, int i) {
        this.a = context;
        this.b = cg1Var;
        this.c = str;
        this.d = i;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        vy2.t(notificationManager);
        this.e = notificationManager;
        this.g = uq6.media3_notification_small_icon;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final dc0 a(jq4 jq4Var, ImmutableList immutableList, dc0 dc0Var, y52 y52Var) {
        int i;
        int i2;
        dg1 dg1Var;
        e62 e62Var;
        xq4 xq4Var;
        xq4 xq4Var2;
        e62 e62Var2;
        int i3;
        boolean z;
        int i4 = Build.VERSION.SDK_INT;
        Context context = this.a;
        String str = this.c;
        if (i4 >= 26) {
            NotificationManager notificationManager = this.e;
            if (notificationManager.getNotificationChannel(str) == null) {
                NotificationChannel notificationChannel = new NotificationChannel(str, context.getString(this.d), 2);
                if (i4 <= 27) {
                    notificationChannel.setShowBadge(false);
                }
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        vy2.m(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i5 = 0;
        for (int i6 = 0; i6 < immutableList.size(); i6++) {
            cw0 cw0Var = (cw0) immutableList.get(i6);
            wp7 wp7Var = cw0Var.a;
            if (wp7Var != null && wp7Var.a == 0 && cw0Var.i) {
                cw0 cw0Var2 = (cw0) immutableList.get(i6);
                cw0Var2.getClass();
                int i7 = i5 + 1;
                int iT = wu8.t(objArrCopyOf.length, i7);
                if (iT > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iT);
                }
                objArrCopyOf[i5] = cw0Var2;
                i5 = i7;
            }
        }
        gb6 gb6VarA = jq4Var.a();
        xq4 xq4Var3 = jq4Var.a;
        fp5 fp5Var = new fp5(context, str);
        this.b.b(jq4Var);
        ct4 ct4Var = new ct4(jq4Var);
        e62 e62Var3 = (e62) gb6VarA;
        e62Var3.c1();
        cb6 cb6Var = e62Var3.O;
        ImmutableList immutableListL = ImmutableList.l(i5, objArrCopyOf);
        boolean zG0 = j29.g0(gb6VarA, xq4Var3.p);
        ImmutableList immutableListE = cw0.e(immutableListL, true, true);
        boolean zA = cw0.a(2, immutableListE);
        int i8 = 2;
        boolean zA2 = cw0.a(3, immutableListE);
        lj3 lj3Var = new lj3(4);
        if (zA) {
            lj3Var.O(((cw0) immutableListE.get(0)).b(ImmutableIntArray.b(2)));
            i = 1;
        } else {
            if (cb6Var.a.a(7, 6)) {
                bw0 bw0Var = new bw0(57413);
                bw0Var.c(6);
                bw0Var.f = context.getString(at6.media3_controls_seek_to_previous_description);
                lj3Var.O(bw0Var.a());
            }
            i = 0;
        }
        if (!cb6Var.a(1)) {
            i2 = 6;
        } else if (zG0) {
            i2 = 6;
            bw0 bw0Var2 = new bw0(57399);
            bw0Var2.c(1);
            bw0Var2.f = context.getString(at6.media3_controls_play_description);
            lj3Var.O(bw0Var2.a());
        } else {
            i2 = 6;
            bw0 bw0Var3 = new bw0(57396);
            bw0Var3.c(1);
            bw0Var3.f = context.getString(at6.media3_controls_pause_description);
            lj3Var.O(bw0Var3.a());
        }
        if (zA2) {
            lj3Var.O(((cw0) immutableListE.get(i)).b(ImmutableIntArray.b(3)));
            i++;
        } else if (cb6Var.a.a(9, 8)) {
            bw0 bw0Var4 = new bw0(57412);
            bw0Var4.c(8);
            bw0Var4.f = context.getString(at6.media3_controls_seek_to_next_description);
            lj3Var.O(bw0Var4.a());
        }
        while (i < immutableListE.size()) {
            lj3Var.O(((cw0) immutableListE.get(i)).b(ImmutableIntArray.b(i2)));
            i++;
        }
        ImmutableList immutableListS = lj3Var.S();
        int[] iArrCopyOf = new int[3];
        int[] iArr = new int[3];
        Arrays.fill(iArrCopyOf, -1);
        Arrays.fill(iArr, -1);
        int i9 = 0;
        boolean z2 = false;
        while (i9 < immutableListS.size()) {
            cw0 cw0Var3 = (cw0) immutableListS.get(i9);
            wp7 wp7Var2 = cw0Var3.a;
            gb6 gb6Var = gb6VarA;
            int i10 = cw0Var3.b;
            ImmutableList immutableList2 = immutableListS;
            CharSequence charSequence = cw0Var3.f;
            Context context2 = context;
            int i11 = cw0Var3.d;
            int[] iArr2 = iArr;
            ImmutableIntArray immutableIntArray = cw0Var3.h;
            if (wp7Var2 != null) {
                MediaSessionService mediaSessionService = (MediaSessionService) dc0Var.c;
                i3 = i9;
                vy2.j(wp7Var2.a == 0);
                PorterDuff.Mode mode = IconCompat.k;
                z = z2;
                IconCompat iconCompatB = IconCompat.b(mediaSessionService.getResources(), mediaSessionService.getPackageName(), i11);
                String str2 = wp7Var2.b;
                Bundle bundle = wp7Var2.c;
                e62Var2 = e62Var3;
                Intent intent = new Intent("androidx.media3.session.CUSTOM_NOTIFICATION_ACTION");
                intent.setData(xq4Var3.b);
                xq4Var2 = xq4Var3;
                intent.setComponent(new ComponentName(mediaSessionService, mediaSessionService.getClass()));
                intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION", str2);
                intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS", bundle);
                int i12 = dc0Var.b + 1;
                dc0Var.b = i12;
                fp5Var.a(new zo5(iconCompatB, charSequence, PendingIntent.getService(mediaSessionService, i12, intent, 201326592)));
            } else {
                xq4Var2 = xq4Var3;
                e62Var2 = e62Var3;
                i3 = i9;
                z = z2;
                vy2.s(i10 != -1);
                PorterDuff.Mode mode2 = IconCompat.k;
                context2.getClass();
                IconCompat iconCompatB2 = IconCompat.b(context2.getResources(), context2.getPackageName(), i11);
                long j = i10;
                MediaSessionService mediaSessionService2 = (MediaSessionService) dc0Var.c;
                int i13 = (j == 8 || j == 9) ? 87 : (j == 6 || j == 7) ? 88 : j == 3 ? 86 : j == 12 ? 90 : j == 11 ? 89 : j == 1 ? 85 : 0;
                Intent intentK = dc0Var.k(jq4Var, i13);
                fp5Var.a(new zo5(iconCompatB2, charSequence, (Build.VERSION.SDK_INT < 26 || j != 1 || ((e62) jq4Var.a()).l()) ? PendingIntent.getService(mediaSessionService2, i13, intentK, 67108864) : PendingIntent.getForegroundService(mediaSessionService2, i13, intentK, 67108864)));
            }
            int i14 = cw0Var3.g.getInt("androidx.media3.session.command.COMPACT_VIEW_INDEX", -1);
            if (i14 < 0 || i14 >= 3) {
                int i15 = i8;
                if (immutableIntArray.a(0) == i15) {
                    iArr2[0] = i3;
                } else if (immutableIntArray.a(0) == 1) {
                    iArr2[1] = i3;
                } else {
                    if (immutableIntArray.a(0) == 3) {
                        iArr2[i15] = i3;
                    }
                    z2 = z;
                }
                z2 = z;
            } else {
                iArrCopyOf[i14] = i3;
                z2 = true;
            }
            i9 = i3 + 1;
            gb6VarA = gb6Var;
            immutableListS = immutableList2;
            context = context2;
            iArr = iArr2;
            e62Var3 = e62Var2;
            xq4Var3 = xq4Var2;
            i8 = 2;
        }
        gb6 gb6Var2 = gb6VarA;
        xq4 xq4Var4 = xq4Var3;
        int[] iArr3 = iArr;
        e62 e62Var4 = e62Var3;
        if (!z2) {
            int i16 = 0;
            int i17 = 0;
            for (int i18 = 3; i16 < i18; i18 = 3) {
                int i19 = iArr3[i16];
                if (i19 != -1) {
                    iArrCopyOf[i17] = i19;
                    i17++;
                }
                i16++;
            }
        }
        int i20 = 0;
        while (true) {
            if (i20 >= 3) {
                break;
            }
            if (iArrCopyOf[i20] == -1) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i20);
                break;
            }
            i20++;
        }
        ct4Var.d = iArrCopyOf;
        o80 o80Var = (o80) gb6Var2;
        if (o80Var.f0(18)) {
            e62Var4.c1();
            e62Var = e62Var4;
            qp4 qp4Var = e62Var.P;
            fp5Var.e = fp5.c(qp4Var.a);
            fp5Var.f = fp5.c(qp4Var.b);
            xq4Var = xq4Var4;
            n94 n94VarR = xq4Var.m.r(qp4Var);
            dg1Var = this;
            if (n94VarR != null) {
                cf0 cf0Var = dg1Var.f;
                if (cf0Var != null) {
                    cf0Var.c = true;
                }
                if (n94VarR.isDone()) {
                    try {
                        fp5Var.e((Bitmap) ja1.t(n94VarR));
                    } catch (CancellationException | ExecutionException e) {
                        wn5.k0("NotificationProvider", "Failed to load bitmap: " + e.getMessage());
                    }
                } else {
                    cf0 cf0Var2 = new cf0(1001, fp5Var, y52Var);
                    dg1Var.f = cf0Var2;
                    Handler handler = xq4Var.l;
                    Objects.requireNonNull(handler);
                    n94VarR.e(new g6(14, n94VarR, cf0Var2, false), new od1(0, handler));
                }
            }
        } else {
            dg1Var = this;
            e62Var = e62Var4;
            xq4Var = xq4Var4;
        }
        long jCurrentTimeMillis = (!o80Var.H() || e62Var.h() || o80Var.m0() || e62Var.g().a != 1.0f) ? -9223372036854775807L : System.currentTimeMillis() - e62Var.F();
        boolean z3 = jCurrentTimeMillis != -9223372036854775807L;
        if (!z3) {
            jCurrentTimeMillis = 0;
        }
        Notification notification = fp5Var.y;
        notification.when = jCurrentTimeMillis;
        fp5Var.k = z3;
        fp5Var.l = z3;
        if (Build.VERSION.SDK_INT >= 31) {
            fp5Var.w = 1;
        }
        fp5Var.g = xq4Var.u;
        notification.deleteIntent = PendingIntent.getService((MediaSessionService) dc0Var.c, 86, dc0Var.k(jq4Var, 86).putExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", true), 67108864);
        fp5Var.d(8, true);
        notification.icon = dg1Var.g;
        fp5Var.g(ct4Var);
        fp5Var.u = 1;
        fp5Var.d(2, false);
        fp5Var.q = "media3_group_key";
        return new dc0(1001, fp5Var.b());
    }
}
