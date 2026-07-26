package io.sentry;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements p1 {
    public final /* synthetic */ int a;
    public final b6 b;

    public /* synthetic */ t(b6 b6Var, int i) {
        this.a = i;
        this.b = b6Var;
    }

    public static Boolean d(String str, List list, List list2) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith((String) it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            if (str.startsWith((String) it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    @Override // io.sentry.p1
    public boolean a() {
        r rVarA;
        switch (this.a) {
            case 0:
                return e5.d().c(this.b.getFatalLogger());
            default:
                if (io.sentry.internal.a.c == null) {
                    rVarA = io.sentry.internal.a.d.a();
                    try {
                        if (io.sentry.internal.a.c == null) {
                            io.sentry.internal.a.c = new io.sentry.internal.a();
                        }
                        rVarA.close();
                    } finally {
                        try {
                            rVarA.close();
                            break;
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                    break;
                }
                io.sentry.internal.a aVar = io.sentry.internal.a.c;
                if (!aVar.a) {
                    try {
                        rVarA = aVar.b.a();
                        try {
                            if (!aVar.a) {
                                Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("META-INF/MANIFEST.MF");
                                while (resources.hasMoreElements()) {
                                    try {
                                        Attributes mainAttributes = new Manifest(resources.nextElement().openStream()).getMainAttributes();
                                        if (mainAttributes != null) {
                                            String value = mainAttributes.getValue("Sentry-Opentelemetry-SDK-Name");
                                            String value2 = mainAttributes.getValue("Implementation-Version");
                                            String value3 = mainAttributes.getValue("Sentry-SDK-Name");
                                            String value4 = mainAttributes.getValue("Sentry-SDK-Package-Name");
                                            if (value != null && value2 != null) {
                                                String value5 = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
                                                if (value5 != null) {
                                                    e5.d().b("maven:io.opentelemetry:opentelemetry-sdk", value5);
                                                    e5.d().a("OpenTelemetry");
                                                }
                                                String value6 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                                                if (value6 != null) {
                                                    e5.d().b("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value6);
                                                    e5.d().a("OpenTelemetry-Agent");
                                                }
                                                if (value.equals("sentry.java.opentelemetry.agentless")) {
                                                    e5.d().a("OpenTelemetry-Agentless");
                                                }
                                                if (value.equals("sentry.java.opentelemetry.agentless-spring")) {
                                                    e5.d().a("OpenTelemetry-Agentless-Spring");
                                                }
                                            }
                                            if (value3 != null && value2 != null && value4 != null && value3.startsWith("sentry.java")) {
                                                e5.d().b(value4, value2);
                                            }
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            rVarA.close();
                        } catch (Throwable th2) {
                            try {
                                break;
                            } catch (Throwable th3) {
                            }
                            throw th2;
                        }
                        break;
                    } catch (IOException unused2) {
                    } catch (Throwable th4) {
                        aVar.a = true;
                        throw th4;
                    }
                    aVar.a = true;
                }
                return e5.d().c(this.b.getFatalLogger());
        }
    }

    public List b() {
        ArrayList arrayListC = c(new Exception().getStackTrace(), false);
        if (arrayListC == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(arrayListC.size());
        for (Object obj : arrayListC) {
            if (Boolean.TRUE.equals(((io.sentry.protocol.z) obj).k)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayListC.size());
        for (Object obj2 : arrayListC) {
            String str = ((io.sentry.protocol.z) obj2).f;
            if (str == null || (!str.startsWith("sun.") && !str.startsWith("java.") && !str.startsWith("android.") && !str.startsWith("com.android."))) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public ArrayList c(StackTraceElement[] stackTraceElementArr, boolean z) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    io.sentry.protocol.z zVar = new io.sentry.protocol.z();
                    b6 b6Var = this.b;
                    zVar.k = d(className, b6Var.getInAppIncludes(), b6Var.getInAppExcludes());
                    zVar.f = className;
                    zVar.e = stackTraceElement.getMethodName();
                    zVar.d = stackTraceElement.getFileName();
                    if (stackTraceElement.getLineNumber() >= 0) {
                        zVar.g = Integer.valueOf(stackTraceElement.getLineNumber());
                    }
                    zVar.m = Boolean.valueOf(stackTraceElement.isNativeMethod());
                    arrayList.add(zVar);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }
}
