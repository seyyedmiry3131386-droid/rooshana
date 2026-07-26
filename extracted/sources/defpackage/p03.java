package defpackage;

import android.util.Base64;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class p03 implements l26 {
    public final n03 a;
    public final j03 b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern g = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern i = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern k = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern l = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern o = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern p = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern v = a("CAN-SKIP-DATERANGES");
    public static final Pattern w = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern x = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern z = a("CAN-BLOCK-RELOAD");
    public static final Pattern A = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern B = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern C = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern D = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern E = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern F = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern G = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern H = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern I = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern J = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern K = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern L = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern M = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern N = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern O = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern P = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern Q = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern R = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern S = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern T = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern U = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern V = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern W = a("AUTOSELECT");
    public static final Pattern X = a("DEFAULT");
    public static final Pattern Y = a("FORCED");
    public static final Pattern Z = a("INDEPENDENT");
    public static final Pattern x0 = a("GAP");
    public static final Pattern y0 = a("PRECISE");
    public static final Pattern z0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern A0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern B0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern C0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern D0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern E0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern F0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern G0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern H0 = a("END-ON-NEXT");
    public static final Pattern I0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern J0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern K0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern L0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern M0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern N0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern O0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern P0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern Q0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern R0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern S0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public p03(n03 n03Var, j03 j03Var) {
        this.a = n03Var;
        this.b = j03Var;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static DrmInitData b(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i2 = 0; i2 < schemeDataArr.length; i2++) {
            DrmInitData.SchemeData schemeData = schemeDataArr[i2];
            schemeDataArr2[i2] = new DrmInitData.SchemeData(schemeData.b, schemeData.c, schemeData.d, null);
        }
        return new DrmInitData(str, true, schemeDataArr2);
    }

    public static DrmInitData.SchemeData c(String str, String str2, HashMap map) throws ParserException {
        String strJ = j(str, M, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = N;
        if (zEquals) {
            String strK = k(str, pattern, map);
            return new DrmInitData.SchemeData(xj0.d, null, "video/mp4", Base64.decode(strK.substring(strK.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = xj0.d;
            String str3 = j29.a;
            return new DrmInitData.SchemeData(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strJ)) {
            return null;
        }
        String strK2 = k(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strK2.substring(strK2.indexOf(44)), 0);
        UUID uuid2 = xj0.e;
        return new DrmInitData.SchemeData(uuid2, null, "video/mp4", bt2.l(uuid2, null, bArrDecode));
    }

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static defpackage.j03 d(defpackage.n03 r113, defpackage.j03 r114, defpackage.pa2 r115, java.lang.String r116) {
        /*
            Method dump skipped, instruction units count: 4402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p03.d(n03, j03, pa2, java.lang.String):j03");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0189  */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r43v5 */
    /* JADX WARN: Type inference failed for: r43v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.n03 e(defpackage.pa2 r43, java.lang.String r44) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p03.e(pa2, java.lang.String):n03");
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double h(String str, Pattern pattern, double d2) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d2;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static long i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String j(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(map, str2);
    }

    public static String k(String str, Pattern pattern, Map map) throws ParserException {
        String strJ = j(str, pattern, null, map);
        if (strJ != null) {
            return strJ;
        }
        throw ParserException.b("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String l(Map map, String str) {
        Matcher matcher = R0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:31:0x0068, B:33:0x006e, B:36:0x0079, B:38:0x0081, B:43:0x0097, B:45:0x009f, B:47:0x00a7, B:49:0x00af, B:51:0x00b7, B:53:0x00bf, B:55:0x00c7, B:57:0x00cf, B:60:0x00d8, B:61:0x00dc, B:66:0x00fe, B:67:0x0104, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:70:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x004f A[SYNTHETIC] */
    @Override // defpackage.l26
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.o03 g(android.net.Uri r7, defpackage.bb1 r8) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p03.g(android.net.Uri, bb1):o03");
    }
}
