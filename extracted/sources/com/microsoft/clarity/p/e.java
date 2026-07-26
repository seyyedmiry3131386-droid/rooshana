package com.microsoft.clarity.p;

import android.content.Context;
import defpackage.ew;
import defpackage.js3;
import defpackage.ok4;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements g {
    public final String a;

    public e(Context context, String str, String str2) {
        js3.p(context, "context");
        js3.p(str, "directory");
        char c = File.separatorChar;
        String strO0 = ew.O0(62, String.valueOf(c), new String[]{"microsoft_clarity", str});
        if (str2 == null) {
            str2 = context.getCacheDir().toString();
            js3.o(str2, "context.cacheDir.toString()");
        }
        this.a = ew.O0(62, String.valueOf(c), new String[]{str2, strO0});
    }

    public final String a(File file) throws IOException {
        js3.p(file, "file");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArrR = ok4.R(fileInputStream);
            fileInputStream.close();
            Charset charset = StandardCharsets.UTF_8;
            js3.o(charset, "UTF_8");
            return new String(bArrR, charset);
        } finally {
        }
    }

    public final String b(String str) throws IOException {
        js3.p(str, "filename");
        FileInputStream fileInputStream = new FileInputStream(f.a(this, str, false, false, 6));
        try {
            byte[] bArrR = ok4.R(fileInputStream);
            fileInputStream.close();
            Charset charset = StandardCharsets.UTF_8;
            js3.o(charset, "UTF_8");
            return new String(bArrR, charset);
        } finally {
        }
    }

    public final String a(String str) {
        js3.p(str, "filename");
        return ew.O0(62, String.valueOf(File.separatorChar), new String[]{this.a, str});
    }
}
