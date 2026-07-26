package defpackage;

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class o69 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static f41 b(View view, f41 f41Var) {
        ContentInfo contentInfoF = f41Var.a.f();
        Objects.requireNonNull(contentInfoF);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoF ? f41Var : new f41(new b41(contentInfoPerformReceiveContent));
    }
}
