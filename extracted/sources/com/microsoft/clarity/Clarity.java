package com.microsoft.clarity;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.microsoft.clarity.a.A;
import com.microsoft.clarity.a.B;
import com.microsoft.clarity.a.C;
import com.microsoft.clarity.a.C0046e;
import com.microsoft.clarity.a.C0047f;
import com.microsoft.clarity.a.C0049h;
import com.microsoft.clarity.a.C0050i;
import com.microsoft.clarity.a.D;
import com.microsoft.clarity.a.E;
import com.microsoft.clarity.a.F;
import com.microsoft.clarity.a.G;
import com.microsoft.clarity.a.H;
import com.microsoft.clarity.a.I;
import com.microsoft.clarity.a.m;
import com.microsoft.clarity.a.n;
import com.microsoft.clarity.a.o;
import com.microsoft.clarity.a.p;
import com.microsoft.clarity.a.q;
import com.microsoft.clarity.a.r;
import com.microsoft.clarity.a.s;
import com.microsoft.clarity.a.v;
import com.microsoft.clarity.a.w;
import com.microsoft.clarity.a.x;
import com.microsoft.clarity.i.C0093o;
import com.microsoft.clarity.i.t;
import com.microsoft.clarity.i.u;
import com.microsoft.clarity.models.LogLevel;
import com.microsoft.clarity.models.PageMetadata;
import com.microsoft.clarity.models.SessionMetadata;
import com.microsoft.clarity.q.g;
import com.microsoft.clarity.q.l;
import defpackage.bp2;
import defpackage.dp2;
import defpackage.ew;
import defpackage.f88;
import defpackage.js3;
import java.util.Set;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes3.dex */
public class Clarity {
    public static Boolean consent(Boolean bool, Boolean bool2) {
        if (bool == null || bool2 == null) {
            l.c("Consent adsStorage and analyticsStorage cannot be null.");
            return Boolean.FALSE;
        }
        t tVar = I.a;
        return Boolean.valueOf(g.a((bp2) new C0046e(bool.booleanValue(), bool2.booleanValue()), (dp2) C0047f.a, (C0093o) null, 26));
    }

    @Deprecated
    public static String getCurrentSessionId() {
        t tVar = I.a;
        if (tVar == null) {
            l.e("Clarity has not started yet.");
            return null;
        }
        String strA = u.a(tVar.b);
        if (strA == null) {
            l.e("No Clarity session has started yet.");
        }
        return strA;
    }

    public static String getCurrentSessionUrl() {
        String strA;
        String userId;
        SessionMetadata sessionMetadata;
        t tVar = I.a;
        if (tVar == null) {
            l.e("Clarity has not started yet.");
            strA = null;
        } else {
            strA = u.a(tVar.b);
            if (strA == null) {
                l.e("No Clarity session has started yet.");
            }
        }
        if (strA != null) {
            t tVar2 = I.a;
            if (tVar2 == null) {
                l.e("Clarity has not started yet.");
                userId = null;
            } else {
                PageMetadata pageMetadataA = tVar2.b.a();
                userId = (pageMetadataA == null || (sessionMetadata = pageMetadataA.getSessionMetadata()) == null) ? null : sessionMetadata.getUserId();
                if (userId == null) {
                    l.e("No Clarity session has started yet.");
                }
            }
            if (userId != null) {
                ClarityConfig clarityConfig = I.c;
                String projectId = clarityConfig != null ? clarityConfig.getProjectId() : null;
                if (projectId == null) {
                    l.e("Clarity has not started yet.");
                }
                if (projectId != null) {
                    return Uri.parse("https://clarity.microsoft.com/player/").buildUpon().appendPath(projectId).appendPath(userId).appendPath(strA).build().toString();
                }
            }
        }
        return null;
    }

    public static Boolean initialize(Context context, ClarityConfig clarityConfig) {
        if (context == null || clarityConfig == null) {
            l.c("context and config parameters cannot be null.");
            return Boolean.FALSE;
        }
        t tVar = I.a;
        return Boolean.valueOf(g.a((bp2) new C0049h(null, context, clarityConfig), (dp2) C0050i.a, (C0093o) null, 26));
    }

    public static Boolean isPaused() {
        boolean z;
        synchronized (I.p) {
            z = I.n;
        }
        return Boolean.valueOf(z);
    }

    public static Boolean maskView(View view) {
        if (view == null) {
            l.c("View cannot be null.");
            return Boolean.FALSE;
        }
        t tVar = I.a;
        LogLevel logLevel = l.a;
        l.d("Mask view " + view + '.');
        return Boolean.valueOf(g.a((bp2) new m(view), (dp2) n.a, (C0093o) null, 26));
    }

    public static Boolean pause() {
        t tVar = I.a;
        return Boolean.valueOf(g.a((bp2) o.a, (dp2) p.a, (C0093o) null, 26));
    }

    public static Boolean resume() {
        t tVar = I.a;
        return Boolean.valueOf(g.a((bp2) q.a, (dp2) r.a, (C0093o) null, 26));
    }

    public static boolean sendCustomEvent(String str) {
        if (str == null) {
            l.c("Custom event value cannot be null.");
            return false;
        }
        t tVar = I.a;
        if (f88.n0(str)) {
            l.c("Custom event value cannot be blank.");
            return false;
        }
        if (str.length() >= 254) {
            l.c("Custom event value length should be less than 254 characters.");
            return false;
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.a = true;
        return g.a((bp2) new s(ref$BooleanRef, str), (dp2) com.microsoft.clarity.a.t.a, (C0093o) null, 26) && ref$BooleanRef.a;
    }

    public static Boolean setCurrentScreenName(String str) {
        t tVar = I.a;
        boolean zA = false;
        if (str != null && f88.n0(str)) {
            l.c("Current screen name cannot be blank.");
        } else if (str == null || str.length() < 255) {
            zA = g.a((bp2) new C(str), (dp2) D.a, (C0093o) null, 26);
        } else {
            l.c("Current screen name length should be less than 255 characters.");
        }
        return Boolean.valueOf(zA);
    }

    public static Boolean setCustomSessionId(String str) {
        if (str == null) {
            l.c("Custom session id cannot be null.");
            return Boolean.FALSE;
        }
        t tVar = I.a;
        LogLevel logLevel = l.a;
        l.d("Setting custom session id to " + str + '.');
        boolean zA = false;
        if (f88.n0(str)) {
            l.c("Custom session id cannot be blank.");
        } else if (str.length() > 255) {
            l.c("Custom session id length cannot exceed 255 characters.");
        } else {
            zA = g.a((bp2) new com.microsoft.clarity.a.u(str), (dp2) v.a, (C0093o) null, 26);
        }
        return Boolean.valueOf(zA);
    }

    public static boolean setCustomTag(String str, String... strArr) {
        if (str == null || strArr == null) {
            l.c("Custom tag key and value cannot be null.");
            return false;
        }
        t tVar = I.a;
        if (f88.n0(str)) {
            l.c("Custom tag key cannot be blank.");
            return false;
        }
        if (str.length() >= 255) {
            l.c("Custom tag key length should be less than 255 characters.");
            return false;
        }
        if (strArr.length == 0) {
            l.c("Custom tag values cannot be empty.");
            return false;
        }
        for (String str2 : strArr) {
            if (f88.n0(str2)) {
                l.c("Custom tag values cannot be blank, and cannot consist only of white spaces.");
                return false;
            }
            if (str2.length() >= 255) {
                l.c("Custom tag value length should be less than 255 characters.");
                return false;
            }
        }
        Set setB1 = ew.b1(strArr);
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.a = true;
        return g.a((bp2) new w(ref$BooleanRef, str, setB1), (dp2) x.a, (C0093o) null, 26) && ref$BooleanRef.a;
    }

    public static Boolean setCustomUserId(String str) {
        if (str != null) {
            return Boolean.valueOf(I.a(str));
        }
        l.c("Custom user id cannot be null.");
        return Boolean.FALSE;
    }

    public static Boolean setOnSessionStartedCallback(SessionStartedCallback sessionStartedCallback) {
        if (sessionStartedCallback == null) {
            l.c("Callback function cannot be null.");
            return Boolean.FALSE;
        }
        t tVar = I.a;
        return Boolean.valueOf(g.a((bp2) new A(sessionStartedCallback), (dp2) B.a, (C0093o) null, 26));
    }

    public static Boolean startNewSession(SessionStartedCallback sessionStartedCallback) {
        t tVar = I.a;
        return Boolean.valueOf(g.a((bp2) new E(sessionStartedCallback), (dp2) F.a, (C0093o) null, 26));
    }

    public static Boolean unmaskView(View view) {
        if (view == null) {
            l.c("View cannot be null.");
            return Boolean.FALSE;
        }
        t tVar = I.a;
        LogLevel logLevel = l.a;
        l.d("Unmask view " + view + '.');
        return Boolean.valueOf(g.a((bp2) new G(view), (dp2) H.a, (C0093o) null, 26));
    }

    public static Boolean initialize(Activity activity2, ClarityConfig clarityConfig) {
        if (activity2 != null && clarityConfig != null) {
            t tVar = I.a;
            Context applicationContext = activity2.getApplicationContext();
            js3.p(applicationContext, "context");
            return Boolean.valueOf(g.a((bp2) new C0049h(activity2, applicationContext, clarityConfig), (dp2) C0050i.a, (C0093o) null, 26));
        }
        l.c("activity and config parameters cannot be null.");
        return Boolean.FALSE;
    }
}
