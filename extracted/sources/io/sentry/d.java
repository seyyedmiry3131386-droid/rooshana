package io.sentry;

import com.j256.ormlite.stmt.query.SimpleComparison;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public String a;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static d a(c cVar, List list) {
        String str;
        int i;
        String str2;
        String str3;
        c cVar2 = cVar;
        String str4 = "%20";
        String str5 = "\\+";
        u0 u0Var = cVar2.h;
        String str6 = (list != null ? c.a(u0Var, io.sentry.util.k.c(list)) : c.a(u0Var, null)).e;
        ConcurrentHashMap concurrentHashMap = cVar2.a;
        u0 u0Var2 = cVar2.h;
        StringBuilder sb = new StringBuilder();
        char c = 1;
        if (str6 == null || str6.isEmpty()) {
            str = "";
            i = 0;
        } else {
            sb.append(str6);
            Charset charset = io.sentry.util.k.a;
            int i2 = 0;
            for (int i3 = 0; i3 < str6.length(); i3++) {
                if (str6.charAt(i3) == ',') {
                    i2++;
                }
            }
            i = i2 + 1;
            str = ",";
        }
        r rVarA = cVar2.b.a();
        try {
            TreeSet<String> treeSet = new TreeSet(Collections.list(concurrentHashMap.keys()));
            rVarA.close();
            treeSet.add("sentry-sample_rate");
            treeSet.add("sentry-sample_rand");
            int i4 = i;
            String str7 = str;
            for (String str8 : treeSet) {
                char c2 = c;
                String strC = "sentry-sample_rate".equals(str8) ? c.c(cVar2.c) : "sentry-sample_rand".equals(str8) ? c.c(cVar2.d) : (String) concurrentHashMap.get(str8);
                if (strC == null) {
                    str2 = str4;
                    str3 = str5;
                } else if (i4 >= 64) {
                    SentryLevel sentryLevel = SentryLevel.ERROR;
                    Object[] objArr = new Object[2];
                    objArr[0] = str8;
                    objArr[c2] = 64;
                    u0Var2.i(sentryLevel, "Not adding baggage value %s as the total number of list members would exceed the maximum of %s.", objArr);
                    str2 = str4;
                    str3 = str5;
                } else {
                    try {
                        str2 = str4;
                    } catch (Throwable th) {
                        th = th;
                        str2 = str4;
                    }
                    try {
                        String str9 = str7 + URLEncoder.encode(str8, "UTF-8").replaceAll(str5, str4) + SimpleComparison.EQUAL_TO_OPERATION + URLEncoder.encode(strC, "UTF-8").replaceAll(str5, str4);
                        if (sb.length() + str9.length() > 8192) {
                            SentryLevel sentryLevel2 = SentryLevel.ERROR;
                            str3 = str5;
                            try {
                                Object[] objArr2 = new Object[2];
                                objArr2[0] = str8;
                                objArr2[c2] = 8192;
                                u0Var2.i(sentryLevel2, "Not adding baggage value %s as the total header value length would exceed the maximum of %s.", objArr2);
                            } catch (Throwable th2) {
                                th = th2;
                                SentryLevel sentryLevel3 = SentryLevel.ERROR;
                                Object[] objArr3 = new Object[2];
                                objArr3[0] = str8;
                                objArr3[c2] = strC;
                                u0Var2.e(sentryLevel3, th, "Unable to encode baggage key value pair (key=%s,value=%s).", objArr3);
                            }
                        } else {
                            str3 = str5;
                            i4++;
                            sb.append(str9);
                            str7 = ",";
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str3 = str5;
                        SentryLevel sentryLevel32 = SentryLevel.ERROR;
                        Object[] objArr32 = new Object[2];
                        objArr32[0] = str8;
                        objArr32[c2] = strC;
                        u0Var2.e(sentryLevel32, th, "Unable to encode baggage key value pair (key=%s,value=%s).", objArr32);
                        cVar2 = cVar;
                        c = c2;
                        str4 = str2;
                        str5 = str3;
                    }
                }
                cVar2 = cVar;
                c = c2;
                str4 = str2;
                str5 = str3;
            }
            String string = sb.toString();
            if (string.isEmpty()) {
                return null;
            }
            d dVar = new d();
            dVar.a = string;
            return dVar;
        } finally {
        }
    }
}
