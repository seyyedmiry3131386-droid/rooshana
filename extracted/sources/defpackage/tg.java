package defpackage;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tg {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = hs5.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(hs5.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(sd3.class.getName(), "okhttp.Http2");
        linkedHashMap.put(gf8.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        b = b.T(linkedHashMap);
    }

    public static void a(String str, int i, String str2, Throwable th) {
        int iMin;
        String strI0 = (String) b.get(str);
        if (strI0 == null) {
            strI0 = f88.I0(23, str);
        }
        if (Log.isLoggable(strI0, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int iK0 = f88.k0('\n', i2, 4, str2);
                if (iK0 == -1) {
                    iK0 = length;
                }
                while (true) {
                    iMin = Math.min(iK0, i2 + 4000);
                    String strSubstring = str2.substring(i2, iMin);
                    js3.o(strSubstring, "substring(...)");
                    Log.println(i, strI0, strSubstring);
                    if (iMin >= iK0) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }

    public static void b(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (a.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(ug.a);
        }
    }
}
