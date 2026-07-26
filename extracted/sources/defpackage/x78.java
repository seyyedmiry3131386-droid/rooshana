package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class x78 implements ax4 {
    public final /* synthetic */ int a;
    public final ax4 b;

    public /* synthetic */ x78(ax4 ax4Var, int i) {
        this.a = i;
        this.b = ax4Var;
    }

    @Override // defpackage.ax4
    public final zw4 a(Object obj, int i, int i2, sv5 sv5Var) {
        Uri uriFromFile;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null) {
                    return null;
                }
                ax4 ax4Var = this.b;
                if (ax4Var.b(uriFromFile)) {
                    return ax4Var.a(uriFromFile, i, i2, sv5Var);
                }
                return null;
            default:
                return this.b.a(new ot2((URL) obj), i, i2, sv5Var);
        }
    }

    @Override // defpackage.ax4
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
