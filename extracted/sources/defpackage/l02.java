package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class l02 implements j02 {
    public String a;

    @Override // defpackage.j02
    public boolean g(CharSequence charSequence, int i, int i2, lv8 lv8Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.a)) {
            return true;
        }
        lv8Var.c = (lv8Var.c & 3) | 4;
        return false;
    }

    @Override // defpackage.j02
    public Object a() {
        return this;
    }
}
