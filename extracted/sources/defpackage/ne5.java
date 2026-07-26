package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ne5 extends ot2 {
    public ne5(String str, String str2) {
        k24 k24Var = dy2.a;
        if (!TextUtils.isEmpty(str)) {
            Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            str = (TextUtils.isEmpty(str2) ? builderBuildUpon : builderBuildUpon.appendQueryParameter("signature", str2)).build().toString();
        }
        i24 i24Var = new i24();
        i24Var.a("Accept", "image/webp,image/*");
        for (Map.Entry entry : k24Var.a().entrySet()) {
            i24Var.a((String) entry.getKey(), (String) entry.getValue());
        }
        i24Var.a = true;
        super(str, new k24(i24Var.b));
    }
}
