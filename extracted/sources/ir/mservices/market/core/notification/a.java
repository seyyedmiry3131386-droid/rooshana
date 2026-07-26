package ir.mservices.market.core.notification;

import android.R;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AlignmentSpan;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import defpackage.af7;
import defpackage.bo6;
import defpackage.br9;
import defpackage.bs1;
import defpackage.bt2;
import defpackage.d04;
import defpackage.d87;
import defpackage.dp3;
import defpackage.dp5;
import defpackage.dr1;
import defpackage.e87;
import defpackage.eq;
import defpackage.es1;
import defpackage.f57;
import defpackage.f88;
import defpackage.fp5;
import defpackage.hp5;
import defpackage.ip5;
import defpackage.it5;
import defpackage.j25;
import defpackage.js8;
import defpackage.lu7;
import defpackage.lw;
import defpackage.lw8;
import defpackage.ly5;
import defpackage.n25;
import defpackage.ne5;
import defpackage.np5;
import defpackage.nr1;
import defpackage.ps1;
import defpackage.q25;
import defpackage.ql0;
import defpackage.qs1;
import defpackage.r25;
import defpackage.rs6;
import defpackage.s25;
import defpackage.sj8;
import defpackage.t25;
import defpackage.t32;
import defpackage.u25;
import defpackage.vv2;
import defpackage.w57;
import defpackage.wt;
import defpackage.wv;
import defpackage.xf5;
import defpackage.yh0;
import defpackage.yq6;
import defpackage.zo5;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.app.detail.ui.AppDetailFragment;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl;
import ir.mservices.market.common.comment.data.response.ReviewResultDto;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.movie.download.core.model.MovieDownloadMetaData;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.manager.install.f;
import ir.mservices.market.version2.webapi.requestdto.AppStatusDto;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import ir.myket.callback.domain.models.CallbackUrlType;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements nr1, it5 {
    public static int w = (int) System.currentTimeMillis();
    public final NotificationManager a;
    public final Context i;
    public dp3 j;
    public xf5 k;
    public lw8 l;
    public d04 m;
    public qs1 n;
    public ps1 o;
    public dr1 p;
    public dr1 q;
    public lu7 r;
    public dr1 s;
    public f t;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public final wv h = new wv(0);
    public final Object u = bt2.D(ir.myket.callback.manager.a.class);
    public long v = 0;

    public a(Context context, t32 t32Var, ps1 ps1Var, ir.mservices.market.version2.manager.install.a aVar) {
        Object d87Var;
        this.i = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.a = notificationManager;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            if (i >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("download", "Download (Required)", 3);
                notificationChannel.enableVibration(false);
                notificationChannel.enableLights(false);
                notificationChannel.setSound(null, null);
                d87Var = new e87(br9.C(new NotificationChannel("myket_channel_id", "Default", 3), notificationChannel, new NotificationChannel(AppStatusDto.Type.UPDATE, "Update", 3), new NotificationChannel("promotion", "Promotion", 3), new NotificationChannel(ReviewResultDto.REVIEW_POST_ACTION_REVIEW, "Review", 3), new NotificationChannel("social", "Social", 3), new NotificationChannel("vpn", "Ad Guard - Ping Reduction", 3)));
            } else {
                d87Var = new d87();
            }
            notificationManager.createNotificationChannels((List) (d87Var instanceof d87 ? EmptyList.a : ((e87) d87Var).a));
        }
        t32Var.l(this, false);
        ps1Var.u(this);
        aVar.getClass();
        aVar.h.add(this);
    }

    public static PushMessageAction[] c(PushMessage pushMessage) {
        if (!TextUtils.isEmpty(pushMessage.h())) {
            try {
                List list = (List) new vv2().b(pushMessage.h(), TypeToken.get(new NotificationController$4().getType()));
                lw.f("notif: " + pushMessage, "Notification Actions must be less or equal to 3 items.", list.size() <= 3);
                return (PushMessageAction[]) list.subList(0, Math.min(3, list.size())).toArray(new PushMessageAction[0]);
            } catch (JsonSyntaxException e) {
                lw.g(e, "Notification Actions cannot be parsed", "notif: " + pushMessage + ", extraActions: " + pushMessage.h());
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(android.content.Context r4, java.lang.String r5) {
        /*
            np5 r0 = new np5
            r0.<init>(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 1
            r3 = 26
            if (r4 < r3) goto L22
            if (r4 < r3) goto L16
            android.app.NotificationManager r4 = r0.b
            android.app.NotificationChannel r4 = r4.getNotificationChannel(r5)
            goto L17
        L16:
            r4 = 0
        L17:
            if (r4 == 0) goto L22
            int r4 = r4.getImportance()
            if (r4 == 0) goto L20
            goto L22
        L20:
            r4 = r1
            goto L23
        L22:
            r4 = r2
        L23:
            boolean r5 = r0.a()
            if (r5 == 0) goto L2d
            if (r4 != 0) goto L2c
            goto L2d
        L2c:
            return r1
        L2d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.core.notification.a.d(android.content.Context, java.lang.String):boolean");
    }

    public static void m(fp5 fp5Var, CharSequence charSequence, CharSequence charSequence2, boolean z, Layout.Alignment alignment) {
        if (charSequence != null) {
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableString.length(), 17);
            fp5Var.e = fp5.c(spannableString);
        }
        if (charSequence2 != null) {
            SpannableString spannableString2 = new SpannableString(charSequence2);
            spannableString2.setSpan(new AlignmentSpan.Standard(alignment), 0, spannableString2.length(), 17);
            fp5Var.f = fp5.c(spannableString2);
            if (z) {
                dp5 dp5Var = new dp5(5, false);
                dp5Var.c = fp5.c(spannableString2);
                fp5Var.g(dp5Var);
            }
        }
    }

    public static void o(fp5 fp5Var, String str, String str2) {
        m(fp5Var, str, str2, true, Layout.Alignment.ALIGN_NORMAL);
    }

    public final void a(String str) {
        this.d.remove(str);
        this.c.remove(str);
        i();
    }

    public final PendingIntent b(HashMap map, int i) {
        Intent intent;
        Context context = this.i;
        if (i == 104 || i == 105) {
            if (map.size() != 1) {
                intent = new Intent(context, (Class<?>) LaunchContentActivity.class);
                intent.setAction("ir.mservices.market.ACTION_DOWNLOADED_LIST");
                intent.putExtra("BUNDLE_KEY_NOTIFICATION_REQUEST_CODE", i);
            } else {
                String packageName = ((AppDownloadInfo) map.values().iterator().next()).getPackageName();
                Intent intent2 = new Intent(context, (Class<?>) LaunchContentActivity.class);
                intent2.setAction("ir.mservices.market.ACTION_INSTALLING_LIST");
                intent2.putExtra("packageName", packageName);
                intent2.putExtra("BUNDLE_KEY_NOTIFICATION_REQUEST_CODE", i);
                intent = intent2;
            }
            intent.addFlags(67108864);
        } else {
            intent = null;
        }
        Object obj = lw8.b;
        return PendingIntent.getActivity(context, i, intent, js8.i(402653184, false));
    }

    public final void e(String str, String str2) {
        Context context = this.i;
        Intent intent = new Intent(context, (Class<?>) LaunchContentActivity.class);
        intent.setAction("ir.mservices.market.ACTION_APPLICATION");
        int i = AppDetailFragment.M1;
        intent.putExtra("BUNDLE_KEY_EXTERNAL_APPLICATION", yh0.r(str, false, new Tracker(LinkDTO.LINK_TYPE_INTERNAL_LINK, "", "notif"), "NotificationInstalled"));
        intent.putExtra("BUNDLE_KEY_NOTIFICATION_REQUEST_CODE", 109);
        intent.addFlags(67108864);
        Object obj = lw8.b;
        PendingIntent activity2 = PendingIntent.getActivity(context, 109, intent, js8.i(134217728, false));
        fp5 fp5Var = new fp5(context, "download");
        o(fp5Var, str2, context.getResources().getString(rs6.click_to_play_app));
        int i2 = yq6.notif_app_icon;
        Notification notification = fp5Var.y;
        notification.icon = i2;
        notification.when = System.currentTimeMillis();
        fp5Var.g = activity2;
        fp5Var.t = sj8.b().M;
        Notification notificationB = fp5Var.b();
        notificationB.flags |= 16;
        this.a.notify(11, notificationB);
    }

    public final void f() {
        HashMap map = this.d;
        AppDownloadInfo appDownloadInfo = (AppDownloadInfo) map.values().iterator().next();
        PendingIntent pendingIntentB = b(map, 104);
        Context context = this.i;
        fp5 fp5Var = new fp5(context, "download");
        o(fp5Var, map.size() > 1 ? context.getResources().getString(rs6.notification_downloaded, appDownloadInfo.getTitle(), Integer.valueOf(map.size() - 1)) : appDownloadInfo.getTitle(), context.getResources().getString(rs6.click_to_install_app));
        int i = yq6.notif_app_icon;
        Notification notification = fp5Var.y;
        notification.icon = i;
        notification.when = System.currentTimeMillis();
        fp5Var.g = pendingIntentB;
        fp5Var.t = sj8.b().M;
        Notification notificationB = fp5Var.b();
        notificationB.flags |= 16;
        this.a.notify(2, notificationB);
    }

    public final void g(fp5 fp5Var, PendingIntent pendingIntent) {
        int i = yq6.notif_app_icon;
        Notification notification = fp5Var.y;
        notification.icon = i;
        notification.when = System.currentTimeMillis();
        fp5Var.g = pendingIntent;
        fp5Var.t = sj8.b().M;
        Notification notificationB = fp5Var.b();
        notificationB.flags |= 16;
        this.a.notify(10, notificationB);
    }

    public final void h(Activity activity2, int i) {
        Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", NearbyRepository.SERVICE_ID);
        ApplicationInfo applicationInfoL = this.j.l(NearbyRepository.SERVICE_ID);
        if (applicationInfoL != null) {
            intent.putExtra("app_uid", applicationInfoL.uid);
        } else {
            lw.g(null, "Myket application info is not found :O", null);
        }
        intent.putExtra("android.provider.extra.APP_PACKAGE", NearbyRepository.SERVICE_ID);
        if (intent.resolveActivity(activity2.getPackageManager()) != null) {
            activity2.startActivityForResult(intent, i);
        } else {
            this.j.P(NearbyRepository.SERVICE_ID);
        }
    }

    public final void i() {
        boolean zIsEmpty = this.b.isEmpty();
        NotificationManager notificationManager = this.a;
        if (zIsEmpty && this.e.isEmpty()) {
            notificationManager.cancel(1001);
        } else {
            List listM = this.o.m();
            List listA = ((n25) this.s.get()).a();
            if (!listM.isEmpty() || !listA.isEmpty()) {
                s(listM, listA);
                notificationManager.notify(1001, this.n.a().b());
            }
        }
        if (this.d.isEmpty() && this.g.isEmpty()) {
            notificationManager.cancel(2);
        }
        if (this.c.isEmpty() && this.f.isEmpty()) {
            notificationManager.cancel(3);
        }
    }

    @Override // defpackage.nr1
    public final void j(bs1 bs1Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.v + 1950 > jCurrentTimeMillis) {
            return;
        }
        this.v = jCurrentTimeMillis;
        s(this.o.m(), ((n25) this.s.get()).a());
        this.a.notify(1001, this.n.a().b());
    }

    public final void k(PushMessage pushMessage) {
        this.r.i(lu7.Z, new vv2().g(pushMessage, new NotificationController$3().getType()));
        if (pushMessage.r().equalsIgnoreCase("Now")) {
            t32.b().g(new bo6());
        }
    }

    public final void l(PushMessage pushMessage) {
        pushMessage.F();
        if (TextUtils.isEmpty(pushMessage.h())) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new PushMessageAction(String.valueOf(new Random().nextInt()), this.i.getResources().getString(rs6.connect_dialog_continue), pushMessage.d()));
            pushMessage.C(new vv2().f(arrayList));
        }
    }

    @Override // defpackage.nr1
    public final void n(es1 es1Var, int i) {
        HashMap map = this.d;
        HashMap map2 = this.c;
        HashMap map3 = this.b;
        if (i == 252) {
            Object objQ = eq.q(es1Var);
            map3.remove(objQ);
            map2.remove(objQ);
            map.remove(objQ);
            i();
            return;
        }
        AppDownloadInfo appDownloadInfoE = this.o.e(es1Var);
        if (appDownloadInfoE != null) {
            String packageName = appDownloadInfoE.getPackageName();
            ps1 ps1Var = this.o;
            ps1Var.getClass();
            lw.c(packageName, null);
            AppDownloadInfo appDownloadInfoI = ps1Var.i(packageName, null);
            int detailedStatus = appDownloadInfoI == null ? 191 : appDownloadInfoI.getDetailedStatus();
            int iL = this.o.l(packageName);
            af7 af7Var = (af7) this.q.get();
            boolean z = af7Var.a() && af7Var.c.a.b(lu7.x0, false) && ((AppUpdateRepositoryImpl) ((wt) this.p.get())).d(appDownloadInfoE.getVersionCode(), packageName);
            if (iL == 100 || iL == 110) {
                map3.put(packageName, appDownloadInfoE);
                map2.remove(packageName);
                map.remove(packageName);
            } else if (iL == 120) {
                map3.remove(packageName);
                map2.remove(packageName);
                map.remove(packageName);
            } else if (iL == 130) {
                map3.remove(packageName);
                if (!z && detailedStatus != 1342) {
                    map2.put(packageName, appDownloadInfoE);
                    PendingIntent pendingIntentB = b(map2, 105);
                    Context context = this.i;
                    fp5 fp5Var = new fp5(context, "download");
                    xf5 xf5Var = this.k;
                    int detailedStatus2 = appDownloadInfoE.getDetailedStatus();
                    xf5Var.getClass();
                    o(fp5Var, context.getResources().getString(rs6.myket), context.getResources().getString(rs6.notification_app_failed_single, appDownloadInfoE.getTitle(), context.getString(xf5.d(detailedStatus2))));
                    fp5Var.t = sj8.b().c;
                    Notification notification = fp5Var.y;
                    notification.icon = R.drawable.ic_dialog_alert;
                    notification.when = System.currentTimeMillis();
                    fp5Var.g = pendingIntentB;
                    Notification notificationB = fp5Var.b();
                    notificationB.flags |= 16;
                    this.a.notify(3, notificationB);
                }
                map.remove(packageName);
            } else if (iL == 140) {
                map3.remove(packageName);
                map2.remove(packageName);
                if (!z && !this.t.g(packageName)) {
                    map.put(packageName, appDownloadInfoE);
                    f();
                }
            } else if (iL != 150) {
                lw.g(null, null, null);
            }
            i();
        }
    }

    public void onEvent(ly5 ly5Var) {
        Intent intent = ly5Var.b;
        String str = ly5Var.a;
        if (!"android.intent.action.PACKAGE_ADDED".equalsIgnoreCase(intent.getAction()) || TextUtils.isEmpty(str)) {
            return;
        }
        String strReplace = str.replace(".m.m.free", "");
        HashMap map = this.d;
        if (map.containsKey(strReplace)) {
            a(str.replace(".m.m.free", ""));
            a(dp3.w(str));
            if (map.size() > 0) {
                f();
            }
        }
    }

    public final void p(PushMessage pushMessage) {
        String strP = pushMessage.p();
        if (TextUtils.isEmpty(pushMessage.d())) {
            pushMessage.B("myket://details?id=" + strP + "&refId=pushNotifAppUpdate");
        }
        r(pushMessage);
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [c24, java.lang.Object] */
    public final void q(PushMessage pushMessage, Bitmap bitmap, PushMessageAction... pushMessageActionArr) {
        int i;
        PushMessage pushMessage2 = pushMessage;
        PushMessageAction[] pushMessageActionArr2 = pushMessageActionArr;
        Random random = new Random();
        Context context = this.i;
        Intent intent = new Intent(context, (Class<?>) LaunchContentActivity.class).setAction("ir.mservices.market.INTENT_ACTION_PUSH_MESSAGE_NOTIF_OPEN").putExtra("ir.mservices.market.INTENT_EXTRA_PUSH_MESSAGE", pushMessage2).setPackage(context.getPackageName());
        int iNextInt = random.nextInt();
        Object obj = lw8.b;
        boolean z = false;
        PendingIntent activity2 = PendingIntent.getActivity(context, iNextInt, intent, js8.i(134217728, false));
        PendingIntent broadcast = PendingIntent.getBroadcast(context, random.nextInt(), new Intent("ir.mservices.market.INTENT_ACTION_PUSH_MESSAGE_NOTIF_DISMISS").putExtra("ir.mservices.market.INTENT_EXTRA_PUSH_MESSAGE", pushMessage2).setPackage(context.getPackageName()), js8.i(134217728, false));
        String strC = pushMessage2.c();
        boolean zIsEmpty = TextUtils.isEmpty(strC);
        NotificationManager notificationManager = this.a;
        String id = "myket_channel_id";
        if (!zIsEmpty && Build.VERSION.SDK_INT >= 26) {
            Iterator<NotificationChannel> it = notificationManager.getNotificationChannels().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                NotificationChannel next = it.next();
                if (strC.equalsIgnoreCase(next.getId())) {
                    id = next.getId();
                    break;
                }
            }
        }
        fp5 fp5Var = new fp5(context, id);
        dp5 dp5Var = new dp5(5, z);
        dp5Var.r(fp5Var);
        dp5Var.c = fp5.c(pushMessage2.l());
        fp5Var.g(dp5Var);
        o(fp5Var, pushMessage2.s(), pushMessage2.l());
        int i2 = yq6.notif_app_icon;
        Notification notification = fp5Var.y;
        notification.icon = i2;
        fp5Var.g = activity2;
        notification.deleteIntent = broadcast;
        boolean z2 = true;
        fp5Var.d(16, true);
        fp5Var.t = sj8.b().M;
        notification.defaults = 4;
        notification.flags |= 1;
        if (AppStatusDto.Type.UPDATE.equalsIgnoreCase(pushMessage2.m())) {
            i = 6;
        } else {
            i = w;
            w = i + 1;
        }
        this.h.put(pushMessage2.m(), Integer.valueOf(i));
        if (pushMessageActionArr2 != null) {
            int length = pushMessageActionArr2.length;
            int i3 = 0;
            while (i3 < length) {
                PushMessageAction pushMessageAction = pushMessageActionArr2[i3];
                boolean z3 = z2;
                String strC2 = pushMessageAction.c();
                String strN = pushMessage2.n();
                Intent intent2 = new Intent(context, (Class<?>) LaunchContentActivity.class);
                intent2.setAction("ir.mservices.market.NOTIFICATION_ACTION");
                intent2.putExtra("BUNDLE_KEY_NOTIFICATION_ACTION", pushMessageAction);
                intent2.putExtra("BUNDLE_KEY_CALLBACK_URL", strN);
                intent2.putExtra("BUNDLE_KEY_NOTIFICATION_ID", i);
                int iNextInt2 = new Random().nextInt();
                Object obj2 = lw8.b;
                fp5Var.a(new zo5(null, strC2, PendingIntent.getActivity(context, iNextInt2, intent2, js8.i(134217728, false))));
                i3++;
                pushMessage2 = pushMessage;
                pushMessageActionArr2 = pushMessageActionArr;
                z2 = z3;
            }
        }
        if (bitmap != null) {
            fp5Var.e(bitmap);
        }
        Notification notificationB = fp5Var.b();
        if (pushMessage.v()) {
            notificationB.defaults |= 1;
        }
        if (pushMessage.w()) {
            notificationB.defaults |= 2;
        }
        String strJ = pushMessage.j();
        if (!TextUtils.isEmpty(strJ)) {
            ((ir.myket.callback.manager.a) this.u.getValue()).b(new ql0(Uri.parse(strJ).buildUpon().appendQueryParameter("blocked", String.valueOf(!new np5(context).a())).build().toString(), CallbackUrlType.h));
        }
        if (TextUtils.isEmpty(pushMessage.a())) {
            notificationManager.notify(i, notificationB);
            return;
        }
        String strA = pushMessage.a();
        if (strA != null && !f88.n0(strA)) {
            try {
                new URL(strA);
                f57 f57Var = (f57) com.bumptech.glide.a.b(context).c(context).v((w57) new w57().n()).m().S(new ne5(pushMessage.a(), null)).c();
                f57Var.Q(new hp5(this, pushMessage, fp5Var, i, notificationB), f57Var);
                return;
            } catch (MalformedURLException unused) {
            }
        }
        lw.g(null, "BannerUrl is not valid", "BannerUrl=" + pushMessage.a());
        notificationManager.notify(i, notificationB);
    }

    public final void r(PushMessage pushMessage) {
        if (TextUtils.isEmpty(pushMessage.i())) {
            q(pushMessage, null, c(pushMessage));
            return;
        }
        PushMessageAction[] pushMessageActionArrC = c(pushMessage);
        String strI = pushMessage.i();
        if (strI != null && !f88.n0(strI)) {
            try {
                new URL(strI);
                f57 f57Var = (f57) com.bumptech.glide.a.e(this.i).v((w57) new w57().n()).m().S(new ne5(pushMessage.i(), null)).c();
                f57Var.Q(new ip5(this, pushMessage, pushMessageActionArrC), f57Var);
                return;
            } catch (MalformedURLException unused) {
            }
        }
        lw.g(null, "Notification icon url not valid", pushMessage.i());
        q(pushMessage, null, pushMessageActionArrC);
    }

    public final void s(List list, List list2) {
        int size;
        boolean z;
        boolean z2;
        boolean z3;
        boolean zIsEmpty = list.isEmpty();
        Context context = this.i;
        if (!zIsEmpty && !list2.isEmpty()) {
            Iterator it = list.iterator();
            int iG = 0;
            while (it.hasNext()) {
                AppDownloadInfo appDownloadInfo = (AppDownloadInfo) it.next();
                this.k.getClass();
                iG += xf5.e(appDownloadInfo);
            }
            if (iG < 0) {
                z3 = true;
                iG = 0;
            } else {
                z3 = false;
            }
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                j25 j25Var = (j25) it2.next();
                iG = j25Var.g() + iG;
                if (j25Var.i() == 110 || j25Var.b() == 102) {
                    z3 = true;
                }
            }
            int size2 = iG / (list2.size() + list.size());
            fp5 fp5VarA = this.n.a();
            fp5VarA.f(size2, z3);
            String string = context.getResources().getString(rs6.download_multiple_app_movie_description, Integer.valueOf(list.size()), Integer.valueOf(list2.size()));
            Resources resources = context.getResources();
            int i = rs6.downloading_notif_percentage;
            lw8 lw8Var = this.l;
            String str = size2 + " ";
            lw8Var.getClass();
            m(fp5VarA, string, resources.getString(i, lw8.e(lw8Var, str)), false, this.m.f() ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL);
            fp5VarA.y.when = 0L;
            return;
        }
        if (list.isEmpty()) {
            if (list2.isEmpty()) {
                return;
            }
            Iterator it3 = list2.iterator();
            int iG2 = 0;
            boolean z4 = false;
            while (it3.hasNext()) {
                j25 j25Var2 = (j25) it3.next();
                iG2 += j25Var2.g();
                if (j25Var2.i() == 110 || j25Var2.b() == 102) {
                    z4 = true;
                }
            }
            int size3 = iG2 / list2.size();
            if (list2.size() == 1) {
                fp5 fp5VarA2 = this.n.a();
                fp5VarA2.f(size3, z4);
                String string2 = context.getResources().getString(rs6.downloading_notif_text, ((j25) list2.get(0)).e());
                Resources resources2 = context.getResources();
                int i2 = rs6.downloading_notif_percentage;
                lw8 lw8Var2 = this.l;
                String str2 = size3 + "";
                lw8Var2.getClass();
                m(fp5VarA2, string2, resources2.getString(i2, lw8.e(lw8Var2, str2)), false, this.m.f() ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL);
                fp5VarA2.y.when = 0L;
                return;
            }
            fp5 fp5VarA3 = this.n.a();
            fp5VarA3.f(size3, z4);
            String string3 = context.getResources().getString(rs6.download_multiple_movie_description, ((j25) list2.get(0)).e(), Integer.valueOf(list2.size() - 1));
            Resources resources3 = context.getResources();
            int i3 = rs6.downloading_notif_percentage;
            lw8 lw8Var3 = this.l;
            String str3 = size3 + " ";
            lw8Var3.getClass();
            m(fp5VarA3, string3, resources3.getString(i3, lw8.e(lw8Var3, str3)), false, this.m.f() ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL);
            fp5VarA3.y.when = 0L;
            return;
        }
        if (list.size() == 1) {
            AppDownloadInfo appDownloadInfo2 = (AppDownloadInfo) list.get(0);
            this.k.getClass();
            int iE = xf5.e(appDownloadInfo2);
            if (iE < 0) {
                z2 = true;
                iE = 0;
            } else {
                z2 = false;
            }
            fp5 fp5VarA4 = this.n.a();
            fp5VarA4.f(iE, z2);
            String string4 = context.getResources().getString(rs6.downloading_notif_text, appDownloadInfo2.getTitle());
            Resources resources4 = context.getResources();
            int i4 = rs6.downloading_notif_percentage;
            lw8 lw8Var4 = this.l;
            String str4 = iE + "";
            lw8Var4.getClass();
            m(fp5VarA4, string4, resources4.getString(i4, lw8.e(lw8Var4, str4)), false, this.m.f() ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL);
            fp5VarA4.y.when = 0L;
            return;
        }
        Iterator it4 = list.iterator();
        int iE2 = 0;
        while (it4.hasNext()) {
            AppDownloadInfo appDownloadInfo3 = (AppDownloadInfo) it4.next();
            this.k.getClass();
            iE2 += xf5.e(appDownloadInfo3);
        }
        if (iE2 < 0) {
            z = true;
            size = 0;
        } else {
            size = iE2 / list.size();
            z = false;
        }
        fp5 fp5VarA5 = this.n.a();
        fp5VarA5.f(size, z);
        String string5 = context.getResources().getString(rs6.download_multiple_app_description, ((AppDownloadInfo) list.get(0)).getTitle(), Integer.valueOf(list.size() - 1));
        Resources resources5 = context.getResources();
        int i5 = rs6.downloading_notif_percentage;
        lw8 lw8Var5 = this.l;
        String str5 = size + " ";
        lw8Var5.getClass();
        m(fp5VarA5, string5, resources5.getString(i5, lw8.e(lw8Var5, str5)), false, this.m.f() ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL);
        fp5VarA5.y.when = 0L;
    }

    public final void t(u25 u25Var, j25 j25Var) {
        MovieDownloadMetaData movieDownloadMetaDataD = j25Var.d();
        String str = movieDownloadMetaDataD.a + "/" + movieDownloadMetaDataD.f;
        boolean z = u25Var instanceof t25;
        HashMap map = this.e;
        HashMap map2 = this.f;
        HashMap map3 = this.g;
        if (z || (u25Var instanceof q25)) {
            map.put(str, j25Var);
            map3.remove(str);
            map2.remove(str);
        } else {
            boolean z2 = u25Var instanceof s25;
            NotificationManager notificationManager = this.a;
            Context context = this.i;
            if (z2) {
                map.remove(str);
                map3.put(str, j25Var);
                map2.remove(str);
                Intent intent = new Intent(context, (Class<?>) LaunchContentActivity.class);
                intent.setAction("ir.mservices.market.ACTION_DOWNLOADED_MOVIE_LIST");
                intent.putExtra("BUNDLE_KEY_NOTIFICATION_REQUEST_CODE", 111);
                intent.addFlags(67108864);
                intent.addFlags(67108864);
                intent.setPackage(NearbyRepository.SERVICE_ID);
                Object obj = lw8.b;
                PendingIntent activity2 = PendingIntent.getActivity(context, 111, intent, js8.i(402653184, false));
                fp5 fp5Var = new fp5(context, "download");
                String strE = ((j25) map3.values().iterator().next()).e();
                if (map3.size() > 1) {
                    strE = context.getResources().getString(rs6.notification_movie_downloaded, strE, Integer.valueOf(map3.size() - 1));
                }
                o(fp5Var, strE, context.getResources().getString(rs6.movie_downloaded_notif));
                int i = yq6.notif_app_icon;
                Notification notification = fp5Var.y;
                notification.icon = i;
                notification.when = System.currentTimeMillis();
                fp5Var.g = activity2;
                fp5Var.t = sj8.b().M;
                Notification notificationB = fp5Var.b();
                notificationB.flags |= 16;
                notificationManager.notify(13, notificationB);
            } else if (u25Var instanceof r25) {
                map.remove(str);
                map3.remove(str);
                map2.put(str, j25Var);
                Intent intent2 = new Intent(context, (Class<?>) LaunchContentActivity.class);
                intent2.setAction("ir.mservices.market.ACTION_DOWNLOADED_MOVIE_LIST");
                intent2.putExtra("BUNDLE_KEY_NOTIFICATION_REQUEST_CODE", 112);
                intent2.addFlags(67108864);
                intent2.addFlags(67108864);
                Object obj2 = lw8.b;
                PendingIntent activity3 = PendingIntent.getActivity(context, 112, intent2, js8.i(402653184, false));
                fp5 fp5Var2 = new fp5(context, "download");
                String strE2 = ((j25) map2.values().iterator().next()).e();
                o(fp5Var2, context.getResources().getString(rs6.myket), map2.size() > 1 ? context.getResources().getString(rs6.notification_movie_failed_multiple, strE2, Integer.valueOf(map2.size() - 1)) : context.getResources().getString(rs6.notification_movie_failed_single, strE2));
                int i2 = yq6.notif_app_icon;
                Notification notification2 = fp5Var2.y;
                notification2.icon = i2;
                notification2.when = System.currentTimeMillis();
                fp5Var2.g = activity3;
                fp5Var2.t = sj8.b().M;
                Notification notificationB2 = fp5Var2.b();
                notificationB2.flags |= 16;
                notificationManager.notify(14, notificationB2);
            } else {
                map.remove(str);
                map3.remove(str);
                map2.remove(str);
            }
        }
        i();
    }
}
