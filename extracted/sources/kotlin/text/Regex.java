package kotlin.text;

import defpackage.br9;
import defpackage.dp2;
import defpackage.f88;
import defpackage.gq1;
import defpackage.ij4;
import defpackage.js3;
import defpackage.rm7;
import defpackage.xv3;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class Regex implements Serializable {
    public final Pattern a;

    public static final class Serialized implements Serializable {
        private static final long serialVersionUID = 0;
        public final String a;
        public final int b;

        public Serialized(String str, int i) {
            this.a = str;
            this.b = i;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.a, this.b);
            js3.o(patternCompile, "compile(...)");
            return new Regex(patternCompile);
        }
    }

    public Regex(Pattern pattern) {
        this.a = pattern;
    }

    public static gq1 b(Regex regex, String str) {
        regex.getClass();
        js3.p(str, "input");
        if (str.length() < 0) {
            StringBuilder sbR = rm7.r(0, "Start index out of bounds: ", ", input length: ");
            sbR.append(str.length());
            throw new IndexOutOfBoundsException(sbR.toString());
        }
        xv3 xv3Var = new xv3(regex, str, 17);
        Regex$findAll$2 regex$findAll$2 = Regex$findAll$2.a;
        js3.p(regex$findAll$2, "nextFunction");
        return new gq1(xv3Var, regex$findAll$2);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        Pattern pattern = this.a;
        String strPattern = pattern.pattern();
        js3.o(strPattern, "pattern(...)");
        return new Serialized(strPattern, pattern.flags());
    }

    public final ij4 a(CharSequence charSequence) {
        js3.p(charSequence, "input");
        Matcher matcher = this.a.matcher(charSequence);
        js3.o(matcher, "matcher(...)");
        if (matcher.find(0)) {
            return new ij4(matcher, charSequence);
        }
        return null;
    }

    public final ij4 c(int i, String str) {
        js3.p(str, "input");
        Matcher matcherRegion = this.a.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return new ij4(matcherRegion, str);
        }
        return null;
    }

    public final ij4 e(String str) {
        js3.p(str, "input");
        Matcher matcher = this.a.matcher(str);
        js3.o(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new ij4(matcher, str);
        }
        return null;
    }

    public final boolean f(CharSequence charSequence) {
        js3.p(charSequence, "input");
        return this.a.matcher(charSequence).matches();
    }

    public final String g(CharSequence charSequence) {
        js3.p(charSequence, "input");
        String strReplaceAll = this.a.matcher(charSequence).replaceAll("");
        js3.o(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String h(String str, dp2 dp2Var) {
        js3.p(str, "input");
        js3.p(dp2Var, "transform");
        ij4 ij4VarA = a(str);
        if (ij4VarA == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        do {
            sb.append((CharSequence) str, i, ij4VarA.b().a);
            sb.append((CharSequence) dp2Var.invoke(ij4VarA));
            i = ij4VarA.b().b + 1;
            ij4VarA = ij4VarA.c();
            if (i >= length) {
                break;
            }
        } while (ij4VarA != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        String string = sb.toString();
        js3.o(string, "toString(...)");
        return string;
    }

    public final List i(CharSequence charSequence) {
        js3.p(charSequence, "input");
        int iEnd = 0;
        f88.w0(0);
        Matcher matcher = this.a.matcher(charSequence);
        if (!matcher.find()) {
            return br9.B(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String string = this.a.toString();
        js3.o(string, "toString(...)");
        return string;
    }

    public Regex(String str) {
        js3.p(str, "pattern");
        Pattern patternCompile = Pattern.compile(str);
        js3.o(patternCompile, "compile(...)");
        this.a = patternCompile;
    }

    public Regex(String str, int i) {
        RegexOption[] regexOptionArr = RegexOption.a;
        js3.p(str, "pattern");
        Pattern patternCompile = Pattern.compile(str, 66);
        js3.o(patternCompile, "compile(...)");
        this.a = patternCompile;
    }
}
