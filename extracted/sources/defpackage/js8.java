package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.ui.platform.e;
import androidx.fragment.app.FragmentActivity;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class js8 implements sw7, b59, k71, w32, ry1, q37 {
    public static final /* synthetic */ js8 a = new js8();

    public /* synthetic */ js8(Object obj) {
    }

    public static final wi g(int i, String str) {
        WeakHashMap weakHashMap = rf9.w;
        return new wi(i, str);
    }

    public static final b39 h(int i, String str) {
        WeakHashMap weakHashMap = rf9.w;
        return new b39(new wo3(0, 0, 0, 0), str);
    }

    public static int i(int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 31) {
            return i | (z ? 33554432 : 67108864);
        }
        return i;
    }

    public static String j(String str, String str2, String str3, Map map, Map map2, boolean z) {
        js3.p(str, "server");
        StringBuilder sb = new StringBuilder(128);
        sb.append(str);
        if (str2 != null && !f88.n0(str2)) {
            sb.append('/');
            sb.append(str2);
        }
        String strN = n(map, str3);
        if (!f88.n0(strN)) {
            sb.append('/');
            sb.append(strN);
        }
        if (z) {
            sb.append('/');
        }
        if (map2 != null && !map2.isEmpty()) {
            char c = '?';
            for (Map.Entry entry : map2.entrySet()) {
                if (f88.n0((CharSequence) entry.getKey()) || ((CharSequence) entry.getValue()).length() <= 0) {
                    lw.g(null, "Key or Value is null/empty in queryParams", "key=" + entry.getKey() + ", value=" + entry.getValue());
                } else {
                    sb.append(c);
                    String strEncode = Uri.encode((String) entry.getKey());
                    js3.o(strEncode, "encode(...)");
                    sb.append(strEncode);
                    sb.append('=');
                    String strEncode2 = Uri.encode((String) entry.getValue());
                    js3.o(strEncode2, "encode(...)");
                    sb.append(strEncode2);
                    c = '&';
                }
            }
        }
        String string = sb.toString();
        js3.o(string, "toString(...)");
        return string;
    }

    public static String k(Map map, String str) {
        js3.p(str, "baseUrl");
        if (map.isEmpty() || f88.n0(str)) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        js3.o(string, "toString(...)");
        return string;
    }

    public static rf9 l(qz0 qz0Var) {
        View view = (View) qz0Var.j(e.f);
        rf9 rf9VarO = o(view);
        boolean zH = qz0Var.h(rf9VarO) | qz0Var.h(view);
        Object objM = qz0Var.M();
        if (zH || objM == jz0.a) {
            objM = new nr8(rf9VarO, view, 8);
            qz0Var.l0(objM);
        }
        zk8.d(rf9VarO, (dp2) objM, qz0Var);
        return rf9VarO;
    }

    public static Intent m(Context context, Intent intent, List list) {
        PackageManager packageManager;
        ArrayList arrayListQ0 = null;
        List<ResolveInfo> listQueryIntentActivities = (context == null || (packageManager = context.getPackageManager()) == null) ? null : packageManager.queryIntentActivities(intent, 0);
        if (listQueryIntentActivities != null) {
            ArrayList<ResolveInfo> arrayList = new ArrayList();
            for (Object obj : listQueryIntentActivities) {
                if (!list.contains(((ResolveInfo) obj).activityInfo.packageName)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
            for (ResolveInfo resolveInfo : arrayList) {
                Intent intent2 = new Intent();
                intent2.setAction(intent.getAction());
                intent2.setFlags(intent.getFlags());
                intent2.setData(intent.getData());
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                arrayList2.add(intent2);
            }
            arrayListQ0 = a.Q0(arrayList2);
        }
        if (arrayListQ0 == null || arrayListQ0.isEmpty()) {
            throw new IllegalStateException("All app are excluded");
        }
        Intent intentCreateChooser = Intent.createChooser((Intent) arrayListQ0.remove(0), "");
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayListQ0.toArray(new Intent[0]));
        intentCreateChooser.addFlags(268435456);
        return intentCreateChooser;
    }

    public static String n(Map map, String str) {
        if (str == null || f88.n0(str)) {
            return "";
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                if (f88.n0((CharSequence) entry.getKey()) || ((CharSequence) entry.getValue()).length() <= 0) {
                    lw.g(null, "Key or Value is null/empty in pathParams", "key=" + entry.getKey() + ", value=" + entry.getValue());
                } else {
                    String str2 = "{" + entry.getKey() + "}";
                    if (f88.c0(str, str2, false)) {
                        String strEncode = Uri.encode((String) entry.getValue());
                        js3.o(strEncode, "encode(...)");
                        str = m88.X(str, str2, strEncode);
                    }
                }
            }
        }
        return str;
    }

    public static rf9 o(View view) {
        rf9 rf9Var;
        WeakHashMap weakHashMap = rf9.w;
        synchronized (weakHashMap) {
            try {
                Object rf9Var2 = weakHashMap.get(view);
                if (rf9Var2 == null) {
                    rf9Var2 = new rf9(view);
                    weakHashMap.put(view, rf9Var2);
                }
                rf9Var = (rf9) rf9Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return rf9Var;
    }

    public static String p(Uri uri, String str) {
        if (uri == null) {
            return null;
        }
        if (uri.isOpaque()) {
            throw new UnsupportedOperationException("This isn't a hierarchical URI.");
        }
        if (f88.n0(str)) {
            throw new NullPointerException("key");
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null || f88.n0(encodedQuery)) {
            return null;
        }
        String strEncode = Uri.encode(str);
        js3.o(strEncode, "encode(...)");
        int i = 0;
        while (true) {
            int iK0 = f88.k0('&', i, 4, encodedQuery);
            int length = iK0 != -1 ? iK0 : encodedQuery.length();
            int iK02 = f88.k0('=', i, 4, encodedQuery);
            if (iK02 > length || iK02 == -1) {
                iK02 = length;
            }
            if (iK02 - i == strEncode.length() && m88.V(encodedQuery, strEncode, true, i, 0, strEncode.length())) {
                if (iK02 == length) {
                    return "";
                }
                String strSubstring = encodedQuery.substring(iK02 + 1, length);
                js3.o(strSubstring, "substring(...)");
                return Uri.decode(strSubstring);
            }
            if (iK0 == -1) {
                return null;
            }
            i = iK0 + 1;
        }
    }

    public static boolean q(Context context, Uri uri, String str, List list) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            if (str == null || f88.n0(str)) {
                if (m88.T(uri.getScheme(), LinkDTO.LINK_TYPE_MYKET_INTENT, true)) {
                    str = context != null ? context.getPackageName() : null;
                }
            }
            if (str != null) {
                intent.setPackage(str);
            }
            if (list != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    intent = m(context, intent, list);
                }
            }
            if (context != null) {
                if (intent.resolveActivity(context.getPackageManager()) == null) {
                    context = null;
                }
                if (context != null) {
                    context.startActivity(intent);
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            lw.g(e, "Invalid url!", "url:" + uri);
            return false;
        }
    }

    public static boolean r(Context context, String str, String str2, ArrayList arrayList) {
        if (str == null) {
            return false;
        }
        Uri uri = Uri.parse(str);
        js3.o(uri, "parse(...)");
        return q(context, uri, str2, arrayList);
    }

    public static void s(FragmentActivity fragmentActivity, String str) {
        if (str == null || f88.n0(str)) {
            return;
        }
        Uri uri = Uri.parse(str);
        if (f88.c0(str, "#Intent;", false)) {
            r(fragmentActivity, m88.X(str, ";end", ";ls=banner;end"), NearbyRepository.SERVICE_ID, null);
            return;
        }
        Uri uriBuild = uri.buildUpon().appendQueryParameter("ls", CommonDataKt.HOME_MOVIE_TYPE_BANNER).build();
        js3.m(uriBuild);
        q(fragmentActivity, uriBuild, NearbyRepository.SERVICE_ID, null);
    }

    public static /* synthetic */ boolean t(int i, Context context, String str, String str2) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return r(context, str, str2, null);
    }

    public static void v(ContextWrapper contextWrapper, String str, String str2) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        contextWrapper.startActivity(Intent.createChooser(intent, str2));
    }

    public static int w(String str) {
        Object obj = lw8.b;
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // defpackage.q37
    public void accept(Object obj, Object obj2) {
        lt9 lt9Var = new lt9(0, (cf8) obj2);
        dq9 dq9Var = (dq9) ((lk9) obj).getService();
        dq9Var.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
        int i = mm9.a;
        parcelObtain.writeStrongBinder(lt9Var);
        dq9Var.L(14, parcelObtain);
    }

    @Override // defpackage.b59
    public void b(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // defpackage.ry1
    public rz5 d(Context context, String str, qy1 qy1Var) {
        rz5 rz5Var = new rz5();
        int iC = qy1Var.c(context, str);
        rz5Var.a = iC;
        if (iC != 0) {
            rz5Var.c = -1;
            return rz5Var;
        }
        int iB = qy1Var.b(context, str, true);
        rz5Var.b = iB;
        if (iB != 0) {
            rz5Var.c = 1;
        }
        return rz5Var;
    }

    @Override // defpackage.b59
    public void f(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // defpackage.sw7
    public void a() {
    }

    @Override // defpackage.sw7
    public void c() {
    }

    @Override // defpackage.sw7
    public void e(float f) {
    }
}
