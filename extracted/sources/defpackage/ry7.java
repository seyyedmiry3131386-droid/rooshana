package defpackage;

import android.net.Uri;
import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Patterns;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.text.selection.CrossStatus;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ir.mservices.market.core.Font$CustomTypefaceSpan;
import ir.mservices.market.version2.core.utils.SafeURLSpan;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes.dex */
public final class ry7 implements ty7 {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ int a;

    public static final sy6 c(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new sy6(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final xm7 d(ir9 ir9Var, tf0 tf0Var) {
        CrossStatus crossStatusD = ir9Var.d();
        vl1 vl1Var = (vl1) ir9Var.d;
        boolean z = crossStatusD == CrossStatus.a;
        return new xm7(h(vl1Var, z, true, tf0Var), h(vl1Var, z, false, tf0Var), z);
    }

    public static final Object[] e(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        ew.C0(0, i, 6, objArr, objArr2);
        ew.y0(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] f(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        ew.C0(0, i, 6, objArr, objArr2);
        ew.y0(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final wm7 g(final ir9 ir9Var, final vl1 vl1Var, wm7 wm7Var) {
        int i = vl1Var.c;
        int i2 = vl1Var.b;
        boolean z = ir9Var.b;
        final int i3 = z ? i2 : i;
        ri8 ri8Var = (ri8) vl1Var.e;
        int i4 = vl1Var.d;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        final c24 c24VarB = a.b(lazyThreadSafetyMode, new vd3(vl1Var, i3));
        final int i5 = z ? i : i2;
        c24 c24VarB2 = a.b(lazyThreadSafetyMode, new bp2() { // from class: ym7
            /* JADX WARN: Type inference failed for: r3v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                vl1 vl1Var2 = vl1Var;
                ri8 ri8Var2 = (ri8) vl1Var2.e;
                int iIntValue = ((Number) c24VarB.getValue()).intValue();
                ir9 ir9Var2 = ir9Var;
                boolean z2 = ir9Var2.b;
                boolean z3 = ir9Var2.d() == CrossStatus.a;
                int i6 = i3;
                long jI = ri8Var2.i(i6);
                q95 q95Var = ri8Var2.b;
                int i7 = zi8.c;
                int iF = (int) (jI >> 32);
                int iD = q95Var.d(iF);
                int i8 = q95Var.f;
                if (iD != iIntValue) {
                    iF = iIntValue >= i8 ? ri8Var2.f(i8 - 1) : ri8Var2.f(iIntValue);
                }
                int iC = (int) (jI & 4294967295L);
                if (q95Var.d(iC) != iIntValue) {
                    iC = iIntValue >= i8 ? q95Var.c(i8 - 1, false) : q95Var.c(iIntValue, false);
                }
                int i9 = i5;
                if (iF == i9) {
                    return vl1Var2.a(iC);
                }
                if (iC == i9) {
                    return vl1Var2.a(iF);
                }
                if (!(z2 ^ z3) ? i6 >= iF : i6 > iC) {
                    iF = iC;
                }
                return vl1Var2.a(iF);
            }
        });
        if (1 != wm7Var.c) {
            return (wm7) c24VarB2.getValue();
        }
        if (i3 == i4) {
            return wm7Var;
        }
        if (((Number) c24VarB.getValue()).intValue() != ri8Var.b.d(i4)) {
            return (wm7) c24VarB2.getValue();
        }
        int i6 = wm7Var.b;
        long jI = ri8Var.i(i6);
        if (i4 != -1) {
            if (i3 != i4) {
                if (!(((i2 < i ? CrossStatus.b : i2 > i ? CrossStatus.a : CrossStatus.c) == CrossStatus.a) ^ z)) {
                }
            }
            return vl1Var.a(i3);
        }
        int i7 = zi8.c;
        return (i6 == ((int) (jI >> 32)) || i6 == ((int) (4294967295L & jI))) ? (wm7) c24VarB2.getValue() : vl1Var.a(i3);
    }

    public static final wm7 h(vl1 vl1Var, boolean z, boolean z2, tf0 tf0Var) {
        long j;
        long jN = tf0Var.n(vl1Var, z2 ? vl1Var.b : vl1Var.c);
        if (z ^ z2) {
            int i = zi8.c;
            j = jN >> 32;
        } else {
            int i2 = zi8.c;
            j = 4294967295L & jN;
        }
        return vl1Var.a((int) j);
    }

    public static final wm7 i(wm7 wm7Var, vl1 vl1Var, int i) {
        return new wm7(((ri8) vl1Var.e).a(i), i, wm7Var.c);
    }

    public static final void j(ay2 ay2Var, String str, String str2) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        ArrayList arrayList = ay2Var.a;
        arrayList.add(str);
        arrayList.add(f88.J0(str2).toString());
    }

    public static void k(ArrayList arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, int i) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            if (matchFilter == null || matchFilter.acceptMatch(spannable, iStart, iEnd)) {
                boolean z = false;
                String strGroup = matcher.group(0);
                for (String str : strArr) {
                    if (strGroup != null && m88.V(strGroup, str, true, 0, 0, str.length())) {
                        z = true;
                        if (!m88.V(strGroup, str, false, 0, 0, str.length())) {
                            String strSubstring = strGroup.substring(str.length());
                            js3.o(strSubstring, "substring(...)");
                            strGroup = str.concat(strSubstring);
                        }
                    }
                }
                if (!z) {
                    strGroup = strArr[0] + ((Object) strGroup);
                }
                if (strGroup == null) {
                    strGroup = "";
                }
                if (o(i, strGroup)) {
                    arrayList.add(new ec7(strGroup, iStart, iEnd));
                }
            }
        }
    }

    public static final void l(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                js3.q(16);
                String string = Integer.toString(cCharAt, 16);
                js3.o(string, "toString(...)");
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in header name: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void m(String str, String str2) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        js3.p(str2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                js3.q(16);
                String string = Integer.toString(cCharAt, 16);
                js3.o(string, "toString(...)");
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(gh9.l(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final int n(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static boolean o(int i, String str) {
        if (str == null) {
            return false;
        }
        if (f88.n0(str)) {
            str = null;
        }
        if (str == null) {
            return false;
        }
        Uri uri = Uri.parse(str);
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            if (!LinkDTO.LINK_TYPE_MYKET_INTENT.equalsIgnoreCase(uri.getScheme()) && ((!"http".equalsIgnoreCase(uri.getScheme()) && !"https".equalsIgnoreCase(uri.getScheme())) || !"myket.ir".equalsIgnoreCase(uri.getHost()))) {
                return false;
            }
        } else if (!LinkDTO.LINK_TYPE_MYKET_INTENT.equalsIgnoreCase(uri.getScheme()) && !"http".equalsIgnoreCase(uri.getScheme()) && !"https".equalsIgnoreCase(uri.getScheme())) {
            return false;
        }
        return true;
    }

    public static final ho7 p(BufferedReader bufferedReader) {
        return new u21(new dw(2, bufferedReader));
    }

    public static CharSequence q(String str, wt5 wt5Var, boolean z, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int length;
        if (str == null) {
            return "";
        }
        String str2 = !f88.n0(str) ? str : null;
        if (str2 == null) {
            return "";
        }
        Pattern pattern = SafeURLSpan.d;
        Spanned spannedFromHtml = Html.fromHtml(str2.toString());
        js3.o(spannedFromHtml, "fromHtml(...)");
        int i6 = sj8.b().L;
        ArrayList<ec7> arrayList = new ArrayList();
        if (spannedFromHtml instanceof Spannable) {
            Spannable spannable = (Spannable) spannedFromHtml;
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannedFromHtml.length(), URLSpan.class);
            if (uRLSpanArr == null || uRLSpanArr.length == 0 || uRLSpanArr.length - 1 < 0) {
                i2 = i;
            } else {
                while (true) {
                    int i7 = length - 1;
                    URLSpan uRLSpan = uRLSpanArr[length];
                    int spanStart = spannable.getSpanStart(uRLSpan);
                    int spanEnd = spannable.getSpanEnd(uRLSpan);
                    int spanFlags = spannable.getSpanFlags(uRLSpan);
                    spannable.removeSpan(uRLSpan);
                    i2 = i;
                    if (o(i2, uRLSpan.getURL())) {
                        String url = uRLSpan.getURL();
                        js3.o(url, "getURL(...)");
                        spannable.setSpan(new SafeURLSpan(url, wt5Var, z), spanStart, spanEnd, spanFlags);
                        spannable.setSpan(new ForegroundColorSpan(i6), spanStart, spanEnd, 18);
                        spannable.setSpan((Font$CustomTypefaceSpan) kh2.b.b.c, spanStart, spanEnd, 18);
                    }
                    if (i7 < 0) {
                        break;
                    }
                    length = i7;
                }
            }
            Pattern pattern2 = Patterns.WEB_URL;
            js3.o(pattern2, "WEB_URL");
            dc7 dc7Var = SafeURLSpan.e;
            k(arrayList, spannable, pattern2, new String[]{"http://", "https://", "rtsp://"}, dc7Var, i2);
            Pattern pattern3 = SafeURLSpan.d;
            js3.o(pattern3, "access$getMYKET_URL$cp(...)");
            k(arrayList, spannable, pattern3, new String[]{"myket://"}, dc7Var, i);
            Pattern pattern4 = Patterns.EMAIL_ADDRESS;
            js3.o(pattern4, "EMAIL_ADDRESS");
            k(arrayList, spannable, pattern4, new String[]{"mailto:"}, null, i);
            Collections.sort(arrayList, new mh(17));
            int size = arrayList.size();
            int i8 = 0;
            while (i8 < size - 1) {
                Object obj = arrayList.get(i8);
                js3.o(obj, "get(...)");
                ec7 ec7Var = (ec7) obj;
                int i9 = i8 + 1;
                Object obj2 = arrayList.get(i9);
                js3.o(obj2, "get(...)");
                ec7 ec7Var2 = (ec7) obj2;
                int i10 = ec7Var.b;
                int i11 = ec7Var2.b;
                if (i10 > i11 || (i3 = ec7Var.c) <= i11) {
                    i8 = i9;
                } else {
                    int i12 = ec7Var2.c;
                    int i13 = (i12 > i3 && (i4 = i3 - i10) <= (i5 = i12 - i11)) ? i4 < i5 ? i8 : -1 : i9;
                    if (i13 != -1) {
                        arrayList.remove(i13);
                        size--;
                    } else {
                        i8 = i9;
                    }
                }
            }
            for (ec7 ec7Var3 : arrayList) {
                Pattern pattern5 = SafeURLSpan.d;
                String str3 = ec7Var3.a;
                int i14 = ec7Var3.b;
                int i15 = ec7Var3.c;
                SafeURLSpan safeURLSpan = new SafeURLSpan(str3, wt5Var, z);
                spannable.setSpan(safeURLSpan, i14, i15, 17);
                spannable.setSpan(new ForegroundColorSpan(i6), i14, i15, 18);
                spannable.setSpan((Font$CustomTypefaceSpan) kh2.b.b.c, i14, i15, 18);
                spannable.setSpan(safeURLSpan, i14, i15, 33);
            }
        }
        return spannedFromHtml;
    }

    public static final String r(BufferedReader bufferedReader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = bufferedReader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = bufferedReader.read(cArr);
        }
        String string = stringWriter.toString();
        js3.o(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void s(View view, ExoPlayer exoPlayer) {
        js3.p(view, "<this>");
        js3.p(exoPlayer, "player");
        int iE = ((e62) exoPlayer).e();
        boolean zH = true;
        if (iE != 1 && iE != 2) {
            zH = iE != 3 ? false : ((o80) exoPlayer).H();
        }
        view.setKeepScreenOn(zH);
    }

    @Override // defpackage.ty7
    public final float a(View view, ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                if (viewGroup.getLayoutDirection() != 1) {
                }
                break;
            case 2:
                break;
            default:
                if (viewGroup.getLayoutDirection() != 1) {
                }
                break;
        }
        return view.getTranslationX() + viewGroup.getWidth();
    }

    @Override // defpackage.ty7
    public float b(View view, ViewGroup viewGroup) {
        return view.getTranslationY();
    }
}
