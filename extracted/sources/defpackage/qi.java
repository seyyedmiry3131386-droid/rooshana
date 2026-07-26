package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class qi {
    public final /* synthetic */ int a;

    public /* synthetic */ qi(int i) {
        this.a = i;
    }

    public final h09 a(Object obj, uv5 uv5Var) {
        switch (this.a) {
            case 0:
                return za7.x(((Uri) obj).toString());
            case 1:
                return za7.a(((File) obj).getPath());
            case 2:
                return za7.a(((s26) obj).a.s());
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = uv5Var.a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return za7.x("android.resource://" + context.getPackageName() + '/' + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            default:
                return za7.x((String) obj);
        }
    }
}
