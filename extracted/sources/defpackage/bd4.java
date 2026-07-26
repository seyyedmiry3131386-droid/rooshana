package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class bd4 implements ad4 {
    public final LocaleList a;

    public bd4(Object obj) {
        this.a = (LocaleList) obj;
    }

    @Override // defpackage.ad4
    public final String a() {
        return this.a.toLanguageTags();
    }

    @Override // defpackage.ad4
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((ad4) obj).b());
    }

    @Override // defpackage.ad4
    public final Locale get(int i) {
        return this.a.get(i);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ad4
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // defpackage.ad4
    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        return this.a.toString();
    }
}
