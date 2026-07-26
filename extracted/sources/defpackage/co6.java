package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.util.concurrent.e;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.app.detail.ui.AppDetailFragment;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl;
import ir.mservices.market.core.notification.BadPushMessageException;
import ir.mservices.market.core.notification.PushMessage;
import ir.mservices.market.core.notification.a;
import ir.mservices.market.data.permission.Permission;
import ir.mservices.market.data.permission.PermissionReasonId;
import ir.mservices.market.data.permission.Quality;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.activity.PushNotifDialogActivity;
import ir.mservices.market.version2.activity.PushNotifTextDialogActivity;
import ir.mservices.market.version2.model.InboxInfoModel;
import ir.mservices.market.version2.services.c;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import ir.myket.core.utils.GraphicUtils$Dimension;
import j$.util.Objects;
import java.util.Date;
import java.util.Map;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class co6 {
    public a a;
    public zt b;
    public kp7 c;
    public pp8 d;
    public eg5 e;
    public lu7 f;
    public ir.mservices.market.app.update.common.manager.a g;
    public ir.mservices.market.app.update.common.modal.a h;
    public wt i;
    public c j;
    public dp3 k;
    public rf7 l;
    public ir.mservices.market.version2.manager.a m;
    public ul3 n;
    public d56 o;
    public b56 p;
    public final Object q = bt2.D(ir.myket.callback.manager.a.class);

    public static void c(Context context, PushMessage pushMessage) {
        String strO = pushMessage.o();
        String str = lw.a;
        lw.f(null, null, TextUtils.isEmpty(strO));
        if (TextUtils.isEmpty(pushMessage.d())) {
            lw.g(null, "Notif click URL is empty", pushMessage);
        }
        Uri uri = Uri.parse(pushMessage.d());
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            lw.g(null, "Notif click URL scheme is empty", pushMessage);
            return;
        }
        String host = uri.getHost();
        if (TextUtils.isEmpty(host)) {
            lw.g(null, "Notif click URL host is empty", pushMessage);
            return;
        }
        String lowerCase = scheme.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase) {
            case "app":
                Intent intentAddFlags = new Intent(context, (Class<?>) LaunchContentActivity.class).setAction("ir.mservices.market.ACTION_APPLICATION").addFlags(268435456);
                String strN = dw1.n("push-notif-app-", host);
                int i = AppDetailFragment.M1;
                intentAddFlags.putExtra("BUNDLE_KEY_EXTERNAL_APPLICATION", yh0.r(host, false, new Tracker(LinkDTO.LINK_TYPE_INTERNAL_LINK, strN, "notif"), strN));
                context.startActivity(intentAddFlags);
                break;
            case "http":
            case "https":
                String queryParameter = uri.getQueryParameter("open");
                String string = uri.toString();
                js3.p(string, "url");
                String strG = new Regex(m88.X("[QUERY_KEY][^&]*&?", "[QUERY_KEY]", "open")).g(string);
                if (!f88.n0(strG) && (strG.charAt(strG.length() - 1) == '?' || strG.charAt(strG.length() - 1) == '&')) {
                    strG = strG.substring(0, strG.length() - 1);
                    js3.o(strG, "substring(...)");
                }
                if (!TextUtils.isEmpty(queryParameter)) {
                    String lowerCase2 = queryParameter.toLowerCase();
                    lowerCase2.getClass();
                    switch (lowerCase2) {
                        case "externallink":
                            ok4.Q(context, strG);
                            break;
                        case "dialog":
                            String queryParameter2 = uri.getQueryParameter("icon_url");
                            String strQ = pushMessage.q();
                            if (!strG.startsWith("http://") && !strG.startsWith("https://")) {
                                strG = "http://".concat(strG);
                            }
                            context.startActivity(new Intent(context, (Class<?>) PushNotifDialogActivity.class).putExtra("BUNDLE_KEY_URL", strG).putExtra("BUNDLE_KEY_TITLE", strQ).putExtra("BUNDLE_KEY_ICON_PATH", queryParameter2).addFlags(268435456));
                            break;
                        case "internallink":
                            fg5.d(context, strG, pushMessage.q());
                            break;
                        default:
                            lw.g(null, "queryParamOpen value is not good ".concat(queryParameter), null);
                            fg5.d(context, strG, pushMessage.q());
                            break;
                    }
                } else {
                    ok4.Q(context, strG);
                    break;
                }
                break;
            case "list":
                context.startActivity(new Intent(context, (Class<?>) LaunchContentActivity.class).setAction("ir.mservices.market.ACTION_PACKAGE").putExtra("BUNDLE_KEY_TITLE", pushMessage.q()).putExtra("BUNDLE_KEY_PACKAGE_KEY", host).putExtra("BUNDLE_KEY_LAUNCH_SOURCE", "push-notif-list-" + host).addFlags(268435456));
                break;
            case "text":
                String strG2 = pushMessage.g();
                String strQ2 = pushMessage.q();
                if (!TextUtils.isEmpty(strG2)) {
                    Intent intentAddFlags2 = new Intent(context, (Class<?>) PushNotifTextDialogActivity.class).putExtra("BUNDLE_KEY_MESSAGE", strG2).addFlags(268435456);
                    String queryParameter3 = uri.getQueryParameter("iconurl");
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        intentAddFlags2.putExtra("BUNDLE_KEY_ICON_PATH", queryParameter3);
                    }
                    if (!TextUtils.isEmpty(strQ2)) {
                        intentAddFlags2.putExtra("BUNDLE_KEY_TITLE", strQ2);
                    }
                    context.startActivity(intentAddFlags2);
                    break;
                }
                break;
            case "myket":
                js8.q(context, uri, (12 & 4) != 0 ? null : NearbyRepository.SERVICE_ID, null);
                break;
            default:
                lw.g(null, "Invalid scheme value: ".concat(scheme), null);
                break;
        }
    }

    public final boolean a(PushMessage pushMessage) throws BadPushMessageException {
        Date dateE = pushMessage.e();
        Date date = new Date();
        boolean z = false;
        if (dateE == null || !dateE.before(date)) {
            String strP = pushMessage.p();
            if (TextUtils.isEmpty(strP) || this.k.G(strP)) {
                rq7 rq7VarC = ((AppUpdateRepositoryImpl) this.i).c(strP);
                Boolean[] boolArr = {null};
                rq7VarC.e(new g6(14, rq7VarC, new hl5(5, boolArr), z), e.a());
                if (!Boolean.FALSE.equals(boolArr[0])) {
                    if ("app_update".equalsIgnoreCase(pushMessage.t()) || "app_install".equalsIgnoreCase(pushMessage.t())) {
                        if (TextUtils.isEmpty(strP)) {
                            throw new BadPushMessageException(dw1.n("Push message criteria failed packageName= ", strP));
                        }
                        String strF = this.f.f(lu7.c0, "");
                        if (!TextUtils.isEmpty(strF)) {
                            try {
                                JSONArray jSONArray = new JSONObject(strF).getJSONArray("apps");
                                for (int i = 0; i < jSONArray.length(); i++) {
                                    if (!strP.equalsIgnoreCase(jSONArray.getString(i))) {
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(Context context, PushMessage pushMessage) {
        int i;
        int i2;
        String strG;
        Objects.toString(pushMessage);
        String strT = pushMessage.t();
        strT.getClass();
        i = 0;
        i2 = 1;
        switch (strT) {
            case "notif":
            case "app_install":
            case "app_update":
                is3.A("receive", pushMessage.m());
                if (TextUtils.isEmpty(pushMessage.s()) || TextUtils.isEmpty(pushMessage.l())) {
                    throw new BadPushMessageException("Title or Message is empty, " + pushMessage);
                }
                if (!a(pushMessage)) {
                    is3.A("ignore", pushMessage.m());
                    return;
                }
                String lowerCase = pushMessage.k().toLowerCase();
                lowerCase.getClass();
                if (lowerCase.equals("box") || lowerCase.equals("both")) {
                    ul3 ul3Var = this.n;
                    ul3Var.getClass();
                    InboxInfoModel inboxInfoModelV = InboxInfoModel.v(pushMessage);
                    if (inboxInfoModelV != null) {
                        ul3Var.c.z(inboxInfoModelV, new pl3(ul3Var, inboxInfoModelV, i2), new sl3(i), ul3Var);
                    }
                }
                if (lowerCase.equals("box")) {
                    is3.A("to_inbox", pushMessage.m());
                    return;
                }
                if (pushMessage.z() && a.d(this.a.i, "download")) {
                    this.a.l(pushMessage);
                }
                if (pushMessage.x()) {
                    this.a.k(pushMessage);
                    return;
                }
                if (!"app_update".equalsIgnoreCase(pushMessage.t())) {
                    if ("app_install".equalsIgnoreCase(pushMessage.t())) {
                        this.a.p(pushMessage);
                        return;
                    } else {
                        this.a.r(pushMessage);
                        return;
                    }
                }
                ir.mservices.market.app.update.common.manager.a aVar = this.g;
                String strP = pushMessage.p();
                aVar.getClass();
                js3.p(strP, "packageName");
                Map map = (Map) aVar.h.getValue();
                if ((map != null ? (o30) map.get(strP) : null) != null) {
                    this.a.p(pushMessage);
                    return;
                }
                Integer numP = this.k.p(pushMessage.p());
                lw.d(null, null, numP);
                this.h.b(pushMessage.p(), numP.intValue(), pushMessage);
                return;
            case "operation":
                String strO = pushMessage.o();
                lw.c(strO, null);
                Uri uri = Uri.parse(strO.toLowerCase());
                String host = uri.getHost();
                if (TextUtils.isEmpty(host)) {
                    throw new BadPushMessageException("Something is wrong with push message operation: ".concat(strO));
                }
                host.getClass();
                switch (host) {
                    case "syncserverurls":
                        this.c.a(true);
                        break;
                    case "syncupdate":
                        this.b.a(true);
                        break;
                    case "syncmyketupdate":
                        this.e.a(true);
                        break;
                    case "download":
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(uri);
                        Map mapF = new q0(context, intent).f();
                        String str = (String) mapF.get("package");
                        if (!TextUtils.isEmpty(str)) {
                            String str2 = (String) mapF.get("refId");
                            Integer numP2 = this.k.p(str);
                            bn6 bn6Var = new bn6(context, uri, i2);
                            vp7 vp7Var = new vp7(this, str2, context, uri, 29);
                            b56 b56Var = this.p;
                            Resources resources = context.getResources();
                            b56Var.getClass();
                            Permission permissionA = b56.a(resources, 1, PermissionReasonId.a, Quality.MANDATORY);
                            d56 d56Var = this.o;
                            String str3 = permissionA.b;
                            d56Var.getClass();
                            if (d56.c(context, str3)) {
                                String str4 = k68.e;
                                strG = a77.g(str);
                            } else {
                                strG = "";
                            }
                            String str5 = strG;
                            c cVar = this.j;
                            GraphicUtils$Dimension graphicUtils$DimensionD = this.l.a.d();
                            cVar.m(str, vp7Var, bn6Var, numP2, str2, str5, Math.min(graphicUtils$DimensionD.b, graphicUtils$DimensionD.a), this.l.a.e(), this.l.b(), this.k.h(str));
                            break;
                        }
                        break;
                    case "synctracking":
                        this.d.a(true);
                        break;
                    default:
                        js8.q(context, uri, (12 & 4) != 0 ? null : NearbyRepository.SERVICE_ID, null);
                        host = "view_intent";
                        break;
                }
                String strM = pushMessage.m();
                Bundle bundle = new Bundle();
                bundle.putString("operation_type", host);
                js3.p(strM, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                bundle.putString("push_message_id", strM);
                ee eeVar = (ee) ((w91) ApplicationLauncher.o.b()).o.get();
                eeVar.getClass();
                eeVar.a(bundle, "push_operation");
                return;
            default:
                throw new BadPushMessageException("Type of message is not valid: " + pushMessage.t());
        }
    }
}
