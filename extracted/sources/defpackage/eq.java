package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.view.Display;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.airbnb.lottie.parser.moshi.a;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.internal.nearby.zzij;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.version2.download.DownloadTag;
import ir.mservices.market.version2.webapi.requestdto.SpixDownloadFileType;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class eq implements wf0, l51, v61, xt0, rj1, ly0, c39, h51, ao9, hb8, ay4, RequestDTO {
    public static mz3 B;
    public final /* synthetic */ int a;
    public static final eq b = new eq(0);
    public static final cb0 c = new cb0(-1.0f, -1.0f);
    public static final cb0 d = new cb0(0.0f, -1.0f);
    public static final cb0 e = new cb0(1.0f, -1.0f);
    public static final cb0 f = new cb0(-1.0f, 0.0f);
    public static final cb0 g = new cb0(0.0f, 0.0f);
    public static final cb0 h = new cb0(1.0f, 0.0f);
    public static final cb0 i = new cb0(-1.0f, 1.0f);
    public static final cb0 j = new cb0(0.0f, 1.0f);
    public static final cb0 k = new cb0(1.0f, 1.0f);
    public static final bb0 l = new bb0(-1.0f);
    public static final bb0 m = new bb0(0.0f);
    public static final bb0 n = new bb0(1.0f);
    public static final ab0 o = new ab0(-1.0f);
    public static final ab0 p = new ab0(0.0f);
    public static final ab0 q = new ab0(1.0f);
    public static final eq r = new eq(2);
    public static final eq s = new eq(3);
    public static final en t = new en(16);
    public static final /* synthetic */ eq u = new eq(5);
    public static final eq v = new eq(6);
    public static final eq w = new eq(7);
    public static final eq x = new eq(8);
    public static final eq y = new eq(9);
    public static final eq z = new eq(10);
    public static final eq A = new eq(11);
    public static final eq C = new eq(12);
    public static final /* synthetic */ eq D = new eq(13);
    public static final eq E = new eq(15);
    public static final /* synthetic */ eq F = new eq(16);
    public static final eq G = new eq(17);
    public static final y45 H = new y45(25);
    public static final y45 I = new y45(26);
    public static final y45 J = new y45(27);
    public static final y45 K = new y45(28);
    public static final eq L = new eq(20);
    public static final wa9 M = new wa9();
    public static final /* synthetic */ eq N = new eq(22);
    public static final /* synthetic */ eq O = new eq(23);
    public static final /* synthetic */ eq P = new eq(24);

    public /* synthetic */ eq(int i2) {
        this.a = i2;
    }

    public static String k(String str) {
        js3.p(str, "s");
        String strEncode = Uri.encode(str, null);
        js3.o(strEncode, "encode(...)");
        return strEncode;
    }

    public static final int l(bs1 bs1Var) {
        js3.p(bs1Var, "downloadInfo");
        Object obj = ((es1) bs1Var).e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadTag");
        return ((DownloadTag) obj).c;
    }

    public static final boolean n(bs1 bs1Var) {
        js3.p(bs1Var, "downloadInfo");
        Object obj = ((es1) bs1Var).e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadTag");
        return ((DownloadTag) obj).m;
    }

    public static final int o(bs1 bs1Var) {
        js3.p(bs1Var, "downloadInfo");
        Object obj = ((es1) bs1Var).e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadTag");
        return ((DownloadTag) obj).b;
    }

    public static final boolean p(bs1 bs1Var) {
        js3.p(bs1Var, "downloadInfo");
        Object obj = ((es1) bs1Var).e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadTag");
        return ((DownloadTag) obj).i;
    }

    public static final String q(bs1 bs1Var) {
        js3.p(bs1Var, "downloadInfo");
        String str = ((es1) bs1Var).d;
        js3.o(str, "getKey(...)");
        return (String) f88.y0(str, new String[]{"/"}, 6).get(0);
    }

    public static final String r(bs1 bs1Var) {
        js3.p(bs1Var, "downloadInfo");
        Object obj = ((es1) bs1Var).e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadTag");
        String str = ((DownloadTag) obj).d;
        js3.o(str, "refId");
        return str;
    }

    public static final String s(bs1 bs1Var) {
        js3.p(bs1Var, "downloadInfo");
        int iO = o(bs1Var);
        return t61.i(iO != 10 ? (iO == 20 || iO == 30) ? SpixDownloadFileType.DATA.toString() : iO != 40 ? "" : SpixDownloadFileType.SPLIT.toString() : SpixDownloadFileType.APK.toString(), n(bs1Var) ? "/diff" : "");
    }

    public static final String[] t(bs1 bs1Var) {
        js3.p(bs1Var, "downloadInfo");
        Object obj = ((es1) bs1Var).e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadTag");
        String str = ((DownloadTag) obj).f;
        if (str != null) {
            if (f88.n0(str)) {
                str = null;
            }
            if (str != null) {
                return (String[]) f88.y0(str, new String[]{"/"}, 6).toArray(new String[0]);
            }
        }
        return null;
    }

    public static final int u(bs1 bs1Var) {
        js3.p(bs1Var, "downloadInfo");
        Object obj = ((es1) bs1Var).e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadTag");
        return ((DownloadTag) obj).a;
    }

    public static final boolean v(bs1 bs1Var) {
        js3.p(bs1Var, "downloadInfo");
        Object obj = ((es1) bs1Var).e;
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.version2.download.DownloadTag");
        return ((DownloadTag) obj).c != 110;
    }

    @Override // defpackage.ao9
    public void a(zm9 zm9Var) {
        kp9 kp9Var = (kp9) zm9Var.getService();
        zzij zzijVar = new zzij();
        Parcel parcelN0 = kp9Var.n0();
        int i2 = lm9.a;
        parcelN0.writeInt(1);
        zzijVar.writeToParcel(parcelN0, 0);
        kp9Var.o0(2010, parcelN0);
    }

    @Override // defpackage.rj1
    public float b(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.ay4
    public void c() {
        new ClickEventBuilder().b("detail_more_review");
    }

    public boolean d(mn6 mn6Var) {
        return false;
    }

    @Override // defpackage.ay4
    public void e() {
        new ClickEventBuilder().b("detail_bd_more_review_report");
    }

    @Override // defpackage.h51
    public Object f(bf8 bf8Var) {
        Intent intent = (Intent) ((Bundle) bf8Var.d()).getParcelable("notification_data");
        if (intent != null) {
            return new CloudMessage(intent);
        }
        return null;
    }

    @Override // defpackage.wf0
    public Rect g(Activity activity2) {
        Rect rect = new Rect();
        Display defaultDisplay = activity2.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!jr9.u(activity2)) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity2.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i2 = rect.bottom + dimensionPixelSize;
            if (i2 == point.y) {
                rect.bottom = i2;
                return rect;
            }
            int i3 = rect.right + dimensionPixelSize;
            if (i3 == point.x) {
                rect.right = i3;
            }
        }
        return rect;
    }

    @Override // defpackage.ly0
    public Object h(o77 o77Var) {
        Object objG = o77Var.g(new so6(u40.class, Executor.class));
        js3.o(objG, "get(...)");
        return tv8.o((Executor) objG);
    }

    @Override // defpackage.l51
    public Object i(Object obj) {
        return (b57) obj;
    }

    @Override // defpackage.hb8
    public ox9 j(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i2 = fb7.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? z67.g(bundle) : z67.g(null);
    }

    @Override // defpackage.c39
    public Object m(a aVar, float f2) {
        switch (this.a) {
            case 10:
                return Float.valueOf(sw3.d(aVar) * f2);
            case 11:
            default:
                boolean z2 = aVar.d() == JsonReader$Token.a;
                if (z2) {
                    aVar.c1();
                }
                float fNextDouble = (float) aVar.nextDouble();
                float fNextDouble2 = (float) aVar.nextDouble();
                while (aVar.hasNext()) {
                    aVar.z();
                }
                if (z2) {
                    aVar.W0();
                }
                return new be7((fNextDouble / 100.0f) * f2, (fNextDouble2 / 100.0f) * f2);
            case 12:
                return Integer.valueOf(Math.round(sw3.d(aVar) * f2));
        }
    }
}
