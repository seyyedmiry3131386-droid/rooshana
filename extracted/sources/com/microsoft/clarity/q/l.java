package com.microsoft.clarity.q;

import com.microsoft.clarity.models.LogLevel;
import defpackage.dw1;
import defpackage.js3;
import defpackage.m88;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static LogLevel a = LogLevel.None;

    public static boolean a(LogLevel logLevel) {
        return logLevel.ordinal() >= a.ordinal();
    }

    public static void b(String str) {
        if (a(LogLevel.Debug)) {
            a(str);
        }
    }

    public static final void c(String str) {
        if (a(LogLevel.Error)) {
            a(str);
        }
    }

    public static void d(String str) {
        if (a(LogLevel.Info)) {
            a(str);
        }
    }

    public static final void e(String str) {
        if (a(LogLevel.Warning)) {
            a(str);
        }
    }

    public static String a(String str) {
        String string = "";
        StringBuilder sb = new StringBuilder();
        try {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[5];
            StringBuilder sb2 = new StringBuilder("[");
            String fileName = stackTraceElement.getFileName();
            js3.o(fileName, "stackTraceElement.fileName");
            sb2.append(m88.X(m88.X(fileName, ".kt", ""), ".java", ""));
            sb2.append("::");
            sb2.append(stackTraceElement.getMethodName());
            sb2.append("] ");
            string = sb2.toString();
        } catch (Exception unused) {
        }
        return dw1.s(sb, string, str);
    }
}
