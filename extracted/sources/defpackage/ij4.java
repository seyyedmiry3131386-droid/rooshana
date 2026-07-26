package defpackage;

import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes3.dex */
public final class ij4 {
    public final Matcher a;
    public final CharSequence b;
    public final hj4 c;
    public gj4 d;

    public ij4(Matcher matcher, CharSequence charSequence) {
        js3.p(charSequence, "input");
        this.a = matcher;
        this.b = charSequence;
        this.c = new hj4(0, this);
    }

    public final List a() {
        if (this.d == null) {
            this.d = new gj4(this);
        }
        gj4 gj4Var = this.d;
        js3.m(gj4Var);
        return gj4Var;
    }

    public final uq3 b() {
        Matcher matcher = this.a;
        return ok4.Z(matcher.start(), matcher.end());
    }

    public final ij4 c() {
        Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        js3.o(matcher2, "matcher(...)");
        if (matcher2.find(iEnd)) {
            return new ij4(matcher2, charSequence);
        }
        return null;
    }
}
