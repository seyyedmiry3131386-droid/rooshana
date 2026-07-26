package com.microsoft.clarity.g;

import android.content.Context;
import android.os.Environment;
import defpackage.ew;
import defpackage.js3;
import java.io.File;

/* JADX INFO: renamed from: com.microsoft.clarity.g.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0077y {
    public C0077y(Context context, com.microsoft.clarity.q.e eVar) {
        js3.p(context, "context");
        js3.p(eVar, "deviceUtils");
        String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
        char c = File.separatorChar;
        String strO0 = ew.O0(62, String.valueOf(c), new String[]{"microsoft_clarity", "frame_snapshots"});
        if (path == null) {
            path = context.getCacheDir().toString();
            js3.o(path, "context.cacheDir.toString()");
        }
        ew.O0(62, String.valueOf(c), new String[]{path, strO0});
    }
}
