package io.sentry.android.core.internal.threaddump;

import io.sentry.b6;
import io.sentry.f2;
import io.sentry.f5;
import io.sentry.protocol.c0;
import io.sentry.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final Pattern g = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");
    public static final Pattern h = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");
    public static final Pattern i = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");
    public static final Pattern j = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");
    public static final Pattern k = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");
    public static final Pattern l = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern m = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern n = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern o = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern p = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");
    public static final Pattern q = Pattern.compile(" *- waiting to lock an unknown object");
    public static final Pattern r = Pattern.compile("\\s+");
    public final b6 a;
    public final boolean b;
    public final t c;
    public final f2 f = new f2((char) 0, 1);
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();

    public c(b6 b6Var, boolean z) {
        this.a = b6Var;
        this.b = z;
        this.c = new t(b6Var, 2);
    }

    public static void a(c0 c0Var, f5 f5Var) {
        Map map = c0Var.j;
        if (map == null) {
            map = new HashMap();
        }
        f5 f5Var2 = (f5) map.get(f5Var.b);
        if (f5Var2 != null) {
            f5Var2.a = Math.max(f5Var2.a, f5Var.a);
        } else {
            String str = f5Var.b;
            f5 f5Var3 = new f5();
            f5Var3.a = f5Var.a;
            f5Var3.b = str;
            f5Var3.c = f5Var.c;
            f5Var3.d = f5Var.d;
            f5Var3.e = f5Var.e;
            f5Var3.f = io.sentry.config.a.Q(f5Var.f);
            map.put(str, f5Var3);
        }
        c0Var.j = map;
    }

    public static Long b(Matcher matcher, int i2) {
        String strGroup = matcher.group(i2);
        if (strGroup == null || strGroup.length() == 0) {
            return null;
        }
        return Long.valueOf(Long.parseLong(strGroup));
    }

    public static boolean c(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0536 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02b8 A[EDGE_INSN: B:191:0x02b8->B:98:0x02b8 BREAK  A[LOOP:1: B:93:0x02a2->B:171:0x050e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(io.sentry.android.core.internal.threaddump.b r31) {
        /*
            Method dump skipped, instruction units count: 1351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.internal.threaddump.c.d(io.sentry.android.core.internal.threaddump.b):void");
    }
}
