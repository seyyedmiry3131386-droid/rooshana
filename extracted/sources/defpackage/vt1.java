package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.core.notification.PushMessage;
import ir.mservices.market.core.notification.PushMessageAction;
import ir.mservices.market.core.notification.a;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.download.common.RecentDownloadType;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import ir.myket.callback.domain.models.CallbackUrlType;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vt1 extends r0 {
    public final /* synthetic */ int a;

    public /* synthetic */ vt1(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [c24, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17, types: [c24, java.lang.Object] */
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) {
        NavIntentDirections downloadList;
        int i = this.a;
        js3.p(er3Var, "intentFragmentFactory");
        switch (i) {
            case 0:
                a aVar = er3Var.a;
                List listM = aVar.o.m();
                List listA = ((n25) aVar.s.get()).a();
                if (!listM.isEmpty() && !listA.isEmpty()) {
                    RecentDownloadType[] recentDownloadTypeArr = RecentDownloadType.c;
                    downloadList = new NavIntentDirections.DownloadList(new rr1("APPS".toLowerCase()));
                } else if (listM.isEmpty()) {
                    if (listA.isEmpty()) {
                        RecentDownloadType[] recentDownloadTypeArr2 = RecentDownloadType.c;
                        downloadList = new NavIntentDirections.DownloadList(new rr1("APPS".toLowerCase()));
                    } else {
                        RecentDownloadType[] recentDownloadTypeArr3 = RecentDownloadType.c;
                        downloadList = new NavIntentDirections.DownloadList(new rr1("MOVIES".toLowerCase()));
                    }
                } else if (listM.size() == 1) {
                    downloadList = new NavIntentDirections.AppDetail(new hp(((AppDownloadInfo) listM.get(0)).getPackageName(), true, new Tracker(LinkDTO.LINK_TYPE_INTERNAL_LINK, "", "download"), false, null, "NotificationDownloading", null, null, null, null, null, "", null));
                } else {
                    RecentDownloadType[] recentDownloadTypeArr4 = RecentDownloadType.c;
                    downloadList = new NavIntentDirections.DownloadList(new rr1("APPS".toLowerCase()));
                }
                break;
            case 1:
                Intent intent = q0Var.b;
                Bundle extras = intent.getExtras();
                PushMessageAction pushMessageAction = extras != null ? (PushMessageAction) dt2.p(extras, "BUNDLE_KEY_NOTIFICATION_ACTION", PushMessageAction.class) : null;
                String stringExtra = intent.getStringExtra("BUNDLE_KEY_CALLBACK_URL");
                int intExtra = intent.getIntExtra("BUNDLE_KEY_NOTIFICATION_ID", -1);
                Context context = q0Var.a;
                String strA = pushMessageAction != null ? pushMessageAction.a() : null;
                if (strA != null) {
                    t61.v(strA, "parse(...)", context, null, null);
                }
                er3Var.a.a.cancel(intExtra);
                if (stringExtra != null && !f88.n0(stringExtra)) {
                    String strB = pushMessageAction != null ? pushMessageAction.b() : null;
                    if (strB != null && !f88.n0(strB)) {
                        Uri.Builder builderBuildUpon = Uri.parse(stringExtra).buildUpon();
                        builderBuildUpon.appendQueryParameter("actionId", pushMessageAction != null ? pushMessageAction.b() : null);
                        ir.myket.callback.manager.a aVar2 = (ir.myket.callback.manager.a) er3Var.j.getValue();
                        String string = builderBuildUpon.build().toString();
                        js3.o(string, "toString(...)");
                        aVar2.b(new ql0(string, CallbackUrlType.f, 0));
                    }
                }
                break;
            default:
                Bundle extras2 = q0Var.b.getExtras();
                PushMessage pushMessage = extras2 != null ? (PushMessage) dt2.p(extras2, "ir.mservices.market.INTENT_EXTRA_PUSH_MESSAGE", PushMessage.class) : null;
                if (pushMessage != null) {
                    co6 co6Var = er3Var.h;
                    Context context2 = q0Var.a;
                    co6Var.getClass();
                    Objects.toString(pushMessage);
                    is3.A("open", pushMessage.m());
                    if (!TextUtils.isEmpty(pushMessage.n())) {
                        ((ir.myket.callback.manager.a) co6Var.q.getValue()).b(new ql0(pushMessage.n(), CallbackUrlType.e));
                    }
                    if ("both".equals(pushMessage.k().toLowerCase())) {
                        ul3 ul3Var = co6Var.n;
                        String strM = pushMessage.m();
                        ul3Var.getClass();
                        r79 r79Var = new r79(ul3Var, strM);
                        ol3 ol3Var = new ol3(0);
                        jl3 jl3Var = ul3Var.c;
                        ArrayList arrayList = (ArrayList) jl3Var.b;
                        u uVar = new u(jl3Var, r79Var, ol3Var, ul3Var, strM);
                        uVar.b(new Void[0]);
                        arrayList.add(uVar);
                    }
                    co6.c(context2, pushMessage);
                }
                break;
        }
        return null;
    }

    @Override // defpackage.r0
    public final boolean b(q0 q0Var) {
        switch (this.a) {
            case 0:
                return "ir.mservices.market.ACTION_DOWNLOADING_LIST".equalsIgnoreCase(q0Var.b.getAction());
            case 1:
                return "ir.mservices.market.NOTIFICATION_ACTION".equalsIgnoreCase(q0Var.b.getAction());
            default:
                return m88.T(q0Var.b.getAction(), "ir.mservices.market.INTENT_ACTION_PUSH_MESSAGE_NOTIF_OPEN", true);
        }
    }
}
