package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class i10 {
    public String a;
    public lu7 b;

    public final String a() {
        if (TextUtils.isEmpty(this.a)) {
            this.a = this.b.f(lu7.d, null);
        }
        return this.a;
    }

    public final void b(String str) {
        this.a = str;
        this.b.i(lu7.d, str);
    }
}
