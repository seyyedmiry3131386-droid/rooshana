package defpackage;

import androidx.media3.extractor.text.SubtitleDecoderException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
public final class it8 implements cb8 {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern h = Pattern.compile("^(\\d+) (\\d+)$");
    public static final ig7 i = new ig7(30.0f, 1, 1);
    public final XmlPullParserFactory a;

    public it8() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static kt8 a(kt8 kt8Var) {
        return kt8Var == null ? new kt8() : kt8Var;
    }

    public static boolean b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static int c(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = h.matcher(attributeValue);
        if (!matcher.matches()) {
            wn5.k0("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i3 = Integer.parseInt(strGroup2);
            if (i2 == 0 || i3 == 0) {
                z = false;
            }
            vy2.i("Invalid cell resolution " + i2 + " " + i3, z);
            return i3;
        } catch (NumberFormatException unused) {
            wn5.k0("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void e(String str, kt8 kt8Var) throws SubtitleDecoderException {
        Matcher matcher;
        String strGroup;
        String str2 = j29.a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(dw1.k(strArrSplit.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            wn5.k0("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(o40.y("Invalid expression for fontSize: '", str, "'."));
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                kt8Var.j = 3;
                break;
            case "em":
                kt8Var.j = 2;
                break;
            case "px":
                kt8Var.j = 1;
                break;
            default:
                throw new SubtitleDecoderException(o40.y("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        kt8Var.k = Float.parseFloat(strGroup2);
    }

    public static ig7 f(XmlPullParser xmlPullParser) {
        float f2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i2 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = j29.a;
            vy2.i("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f2 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f2 = 1.0f;
        }
        ig7 ig7Var = i;
        int i3 = ig7Var.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        int i4 = ig7Var.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i4 = Integer.parseInt(attributeValue4);
        }
        return new ig7(i2 * f2, i3, i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, int r22, defpackage.ba4 r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it8.g(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, ba4, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.ht8 h(org.xmlpull.v1.XmlPullParser r21, defpackage.ht8 r22, java.util.HashMap r23, defpackage.ig7 r24) throws androidx.media3.extractor.text.SubtitleDecoderException {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it8.h(org.xmlpull.v1.XmlPullParser, ht8, java.util.HashMap, ig7):ht8");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.kt8 i(org.xmlpull.v1.XmlPullParser r18, defpackage.kt8 r19) {
        /*
            Method dump skipped, instruction units count: 1524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it8.i(org.xmlpull.v1.XmlPullParser, kt8):kt8");
    }

    public static long j(String str, ig7 ig7Var) throws SubtitleDecoderException {
        double d2;
        double d3;
        double d4;
        Matcher matcher = b.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            double d5 = Long.parseLong(strGroup) * 3600;
            matcher.group(2).getClass();
            double d6 = d5 + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double d7 = d6 + Long.parseLong(r13);
            String strGroup2 = matcher.group(4);
            return (long) ((d7 + (strGroup2 != null ? Double.parseDouble(strGroup2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / ig7Var.a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / ((double) ig7Var.b)) / ((double) ig7Var.a) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = c.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException(dw1.n("Malformed time expression: ", str));
        }
        String strGroup3 = matcher2.group(1);
        strGroup3.getClass();
        d2 = Double.parseDouble(strGroup3);
        String strGroup4 = matcher2.group(2);
        strGroup4.getClass();
        switch (strGroup4) {
            case "f":
                d3 = ig7Var.a;
                d2 /= d3;
                return (long) (d2 * 1000000.0d);
            case "h":
                d4 = 3600.0d;
                break;
            case "m":
                d4 = 60.0d;
                break;
            case "t":
                d3 = ig7Var.c;
                d2 /= d3;
                return (long) (d2 * 1000000.0d);
            case "ms":
                d3 = 1000.0d;
                d2 /= d3;
                return (long) (d2 * 1000000.0d);
            default:
                return (long) (d2 * 1000000.0d);
        }
        d2 *= d4;
        return (long) (d2 * 1000000.0d);
    }

    public static ba4 k(XmlPullParser xmlPullParser) {
        String strI = sb7.i(xmlPullParser, "extent");
        if (strI == null) {
            return null;
        }
        Matcher matcher = g.matcher(strI);
        if (!matcher.matches()) {
            wn5.k0("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strI));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new ba4(i2, Integer.parseInt(strGroup2));
        } catch (NumberFormatException unused) {
            wn5.k0("TtmlParser", "Ignoring malformed tts extent: ".concat(strI));
            return null;
        }
    }

    @Override // defpackage.cb8
    public final ta8 d(byte[] bArr, int i2, int i3) {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.a.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new jt8("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            ba4 ba4VarK = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i2, i3), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            ig7 ig7VarF = i;
            int i4 = 0;
            int iC = 15;
            rb4 rb4Var = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                ht8 ht8Var = (ht8) arrayDeque.peek();
                if (i4 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            ig7VarF = f(xmlPullParserNewPullParser);
                            iC = c(xmlPullParserNewPullParser);
                            ba4VarK = k(xmlPullParserNewPullParser);
                        }
                        ig7 ig7Var = ig7VarF;
                        ba4 ba4Var = ba4VarK;
                        int i5 = iC;
                        if (b(name)) {
                            if ("head".equals(name)) {
                                g(xmlPullParserNewPullParser, map, i5, ba4Var, map2, map3);
                            } else {
                                try {
                                    ht8 ht8VarH = h(xmlPullParserNewPullParser, ht8Var, map2, ig7Var);
                                    arrayDeque.push(ht8VarH);
                                    if (ht8Var != null) {
                                        if (ht8Var.m == null) {
                                            ht8Var.m = new ArrayList();
                                        }
                                        ht8Var.m.add(ht8VarH);
                                    }
                                } catch (SubtitleDecoderException e2) {
                                    wn5.l0("TtmlParser", "Suppressing parser error", e2);
                                    i4++;
                                }
                            }
                            iC = i5;
                            ba4VarK = ba4Var;
                            ig7VarF = ig7Var;
                        } else {
                            wn5.Q("Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i4++;
                        iC = i5;
                        ba4VarK = ba4Var;
                        ig7VarF = ig7Var;
                    } else if (eventType == 4) {
                        ht8Var.getClass();
                        ht8 ht8VarA = ht8.a(xmlPullParserNewPullParser.getText());
                        if (ht8Var.m == null) {
                            ht8Var.m = new ArrayList();
                        }
                        ht8Var.m.add(ht8VarA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            ht8 ht8Var2 = (ht8) arrayDeque.peek();
                            ht8Var2.getClass();
                            rb4Var = new rb4(ht8Var2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i4++;
                } else if (eventType == 3) {
                    i4--;
                }
                xmlPullParserNewPullParser.next();
            }
            rb4Var.getClass();
            return rb4Var;
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        } catch (XmlPullParserException e4) {
            throw new IllegalStateException("Unable to decode source", e4);
        }
    }

    @Override // defpackage.cb8
    public final void m(byte[] bArr, int i2, int i3, bb8 bb8Var, n31 n31Var) {
        ja1.C(d(bArr, i2, i3), bb8Var, n31Var);
    }

    @Override // defpackage.cb8
    public final /* synthetic */ void reset() {
    }
}
